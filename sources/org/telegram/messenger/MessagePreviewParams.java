package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.gn;
public class MessagePreviewParams {
    public CharacterStyle currentLink;
    public Messages forwardMessages;
    public boolean hasCaption;
    public boolean hasMedia;
    public boolean hasSecretMessages;
    public boolean hasSenders;
    public boolean hideCaption;
    public boolean hideForwardSendersName;
    public boolean isSecret;
    public boolean isVideo;
    public TLRPC.WebPage linkMedia;
    public Messages linkMessage;
    public boolean monoforum;
    public boolean multipleUsers;
    public boolean noforwards;
    private cb0 previewView;
    public gn quote;
    public int quoteEnd;
    public int quoteStart;
    public Messages replyMessage;
    public boolean singleLink;
    public TLRPC.WebPage webpage;
    public boolean webpagePhoto;
    public boolean webpageSmall;
    public boolean webpageTop;
    public boolean willSeeSenders;

    public class Messages {
        private long dialogId;
        public LongSparseArray<MessageObject.GroupedMessages> groupedMessagesMap;
        public boolean hasSpoilers;
        public boolean hasText;
        public ArrayList<MessageObject> messages;
        private Boolean out;
        public ArrayList<TLRPC.PollAnswerVoters> pollChosenAnswers;
        public ArrayList<MessageObject> previewMessages;
        public SparseBooleanArray selectedIds;
        private int type;

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i9, MessageObject messageObject) {
            this(bool, i9, MessagePreviewParams.singletonArrayList(messageObject), messageObject.getDialogId(), null);
        }

        public Messages checkEdits(ArrayList<MessageObject> arrayList) {
            ArrayList<MessageObject> arrayList2 = this.messages;
            if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
                boolean z10 = false;
                for (int i9 = 0; i9 < this.messages.size(); i9++) {
                    MessageObject messageObject = this.messages.get(i9);
                    if (messageObject != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            MessageObject messageObject2 = arrayList.get(i10);
                            if (messageObject2 != null && messageObject.getId() == messageObject2.getId() && messageObject.getDialogId() == messageObject2.getDialogId()) {
                                this.messages.set(i9, messageObject2);
                                z10 = true;
                                break;
                            }
                            i10++;
                        }
                    }
                }
                if (z10) {
                    return new Messages(this.out, this.type, this.messages, this.dialogId, null);
                }
            }
            return null;
        }

        public void getSelectedMessages(ArrayList<MessageObject> arrayList) {
            arrayList.clear();
            for (int i9 = 0; i9 < this.messages.size(); i9++) {
                MessageObject messageObject = this.messages.get(i9);
                if (this.selectedIds.get(messageObject.getId(), false)) {
                    arrayList.add(messageObject);
                }
            }
        }

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i9, MessageObject messageObject, long j10) {
            this(bool, i9, MessagePreviewParams.singletonArrayList(messageObject), j10, null);
        }

        public Messages(Boolean bool, int i9, ArrayList<MessageObject> arrayList, long j10, SparseBooleanArray sparseBooleanArray) {
            this.groupedMessagesMap = new LongSparseArray<>();
            this.previewMessages = new ArrayList<>();
            this.selectedIds = new SparseBooleanArray();
            this.pollChosenAnswers = new ArrayList<>();
            this.out = bool;
            this.type = i9;
            this.dialogId = j10;
            this.messages = arrayList;
            if (sparseBooleanArray != null) {
                this.selectedIds = sparseBooleanArray;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = arrayList.get(i10);
                if (i9 == 0 && sparseBooleanArray == null) {
                    this.selectedIds.put(messageObject.getId(), true);
                }
                MessageObject previewMessage = MessagePreviewParams.this.toPreviewMessage(messageObject, bool, i9);
                if (!this.hasSpoilers) {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = previewMessage.messageOwner.entities;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        TLRPC.MessageEntity messageEntity = arrayList2.get(i11);
                        i11++;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            this.hasSpoilers = true;
                            break;
                        }
                    }
                }
                previewMessage.messageOwner.dialog_id = j10;
                if (previewMessage.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = this.groupedMessagesMap.get(previewMessage.getGroupId(), null);
                    if (groupedMessages == null) {
                        groupedMessages = new MessageObject.GroupedMessages();
                        this.groupedMessagesMap.put(previewMessage.getGroupId(), groupedMessages);
                    }
                    groupedMessages.messages.add(previewMessage);
                }
                this.previewMessages.add(0, previewMessage);
                if (messageObject.isPoll()) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
                    PreviewMediaPoll previewMediaPoll = new PreviewMediaPoll();
                    previewMediaPoll.poll = tL_messageMediaPoll.poll;
                    previewMediaPoll.provider = tL_messageMediaPoll.provider;
                    TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                    previewMediaPoll.results = tL_pollResults;
                    int i12 = tL_messageMediaPoll.results.total_voters;
                    tL_pollResults.total_voters = i12;
                    previewMediaPoll.totalVotersCached = i12;
                    previewMessage.messageOwner.media = previewMediaPoll;
                    if (messageObject.canUnvote()) {
                        int size2 = tL_messageMediaPoll.results.results.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                            if (pollAnswerVoters.chosen) {
                                TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                                pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                                pollAnswerVoters2.correct = pollAnswerVoters.correct;
                                pollAnswerVoters2.flags = pollAnswerVoters.flags;
                                pollAnswerVoters2.option = pollAnswerVoters.option;
                                pollAnswerVoters2.voters = pollAnswerVoters.voters;
                                this.pollChosenAnswers.add(pollAnswerVoters2);
                                previewMediaPoll.results.results.add(pollAnswerVoters2);
                            } else {
                                previewMediaPoll.results.results.add(pollAnswerVoters);
                            }
                        }
                    }
                }
            }
            for (int i14 = 0; i14 < this.groupedMessagesMap.size(); i14++) {
                this.groupedMessagesMap.valueAt(i14).calculate();
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = this.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0) {
                this.hasText = this.groupedMessagesMap.valueAt(0).findCaptionMessageObject() != null;
            } else if (arrayList.size() == 1) {
                MessageObject messageObject2 = arrayList.get(0);
                int i15 = messageObject2.type;
                if (i15 != 0 && i15 != 19) {
                    this.hasText = !TextUtils.isEmpty(messageObject2.caption);
                } else {
                    this.hasText = !TextUtils.isEmpty(messageObject2.messageText);
                }
            }
        }
    }

    public static class PreviewMediaPoll extends TLRPC.TL_messageMediaPoll {
        public int totalVotersCached;
    }

    public MessagePreviewParams(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.isSecret = z10;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.noforwards = z13;
        this.monoforum = z12;
    }

    public static boolean areUrlsEqual(String str, String str2) {
        if (str != null && str2 != null) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse != parse2) {
                if (parse != null && parse2 != null && parse.getHost() != null && parse.getHost().equalsIgnoreCase(parse2.getHost()) && parse.getPort() == parse2.getPort() && normalizePath(parse.getPath()).equals(normalizePath(parse2.getPath()))) {
                    if (parse.getQuery() == null) {
                    }
                }
                return false;
            }
            return true;
        } else if (str == null) {
            return true;
        } else {
            return false;
        }
    }

    private static String normalizePath(String str) {
        if (str == null) {
            return "";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str.concat("/");
    }

    public static ArrayList<MessageObject> singletonArrayList(MessageObject messageObject) {
        return l0.k(messageObject);
    }

    public org.telegram.messenger.MessageObject toPreviewMessage(org.telegram.messenger.MessageObject r17, java.lang.Boolean r18, final int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagePreviewParams.toPreviewMessage(org.telegram.messenger.MessageObject, java.lang.Boolean, int):org.telegram.messenger.MessageObject");
    }

    public void attach(cb0 cb0Var) {
        this.previewView = cb0Var;
    }

    public void checkCurrentLink(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        this.currentLink = null;
        if (messageObject != null) {
            CharSequence charSequence = messageObject.messageText;
            if ((charSequence instanceof Spanned) && (webPage = this.webpage) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i9 = 0; i9 < uRLSpanArr.length; i9++) {
                    if (areUrlsEqual(uRLSpanArr[i9].getURL(), this.webpage.url)) {
                        this.currentLink = uRLSpanArr[i9];
                        return;
                    }
                }
            }
        }
    }

    public void checkEdits(ArrayList<MessageObject> arrayList) {
        boolean z10;
        cb0 cb0Var;
        float f10;
        Messages checkEdits;
        Messages checkEdits2;
        Messages checkEdits3;
        Messages messages = this.forwardMessages;
        if (messages != null && (checkEdits3 = messages.checkEdits(arrayList)) != null) {
            this.forwardMessages = checkEdits3;
            z10 = true;
        } else {
            z10 = false;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (checkEdits2 = messages2.checkEdits(arrayList)) != null) {
            this.replyMessage = checkEdits2;
            z10 = true;
        }
        Messages messages3 = this.linkMessage;
        if (messages3 != null && (checkEdits = messages3.checkEdits(arrayList)) != null) {
            this.linkMessage = checkEdits;
            z10 = true;
        }
        if (z10 && (cb0Var = this.previewView) != null) {
            MessagePreviewParams messagePreviewParams = cb0Var.d;
            int i9 = 0;
            while (true) {
                View[] viewArr = cb0Var.f27458f.f31035e;
                if (i9 < viewArr.length) {
                    View view = viewArr[i9];
                    if (view instanceof wa0) {
                        wa0 wa0Var = (wa0) view;
                        int i10 = wa0Var.f34168a;
                        oa0 oa0Var = wa0Var.f34171e;
                        if (i10 == 1) {
                            wa0Var.f34174r = messagePreviewParams.forwardMessages;
                        } else if (i10 == 0) {
                            wa0Var.f34174r = messagePreviewParams.replyMessage;
                        } else if (i10 == 2) {
                            wa0Var.f34174r = messagePreviewParams.linkMessage;
                        }
                        wa0Var.h();
                        if (i10 == 0) {
                            MessageObject messageObject = null;
                            if (cb0Var.f27455b && !messagePreviewParams.isSecret) {
                                org.telegram.ui.Cells.v9 v9Var = oa0Var.W;
                                if (v9Var != null) {
                                    messageObject = ((org.telegram.ui.Cells.t1) v9Var).getMessageObject();
                                }
                                MessageObject c10 = wa0Var.c(messageObject);
                                if (c10 != null) {
                                    messagePreviewParams.quoteStart = 0;
                                    int min = Math.min(MessagesController.getInstance(cb0Var.f27462w).quoteLengthMax, c10.messageOwner.message.length());
                                    messagePreviewParams.quoteEnd = min;
                                    messagePreviewParams.quote = gn.b(messagePreviewParams.quoteStart, min, c10);
                                    View d = wa0Var.d();
                                    if (d instanceof org.telegram.ui.Cells.t1) {
                                        oa0Var.a0((org.telegram.ui.Cells.t1) d, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                                    }
                                }
                            } else {
                                messagePreviewParams.quote = null;
                                oa0Var.f(false);
                                wa0Var.g(false, true);
                            }
                            wa0Var.k(true);
                        }
                        bb0 bb0Var = wa0Var.C;
                        if (bb0Var != null) {
                            ViewPropertyAnimator animate = bb0Var.animate();
                            if (messagePreviewParams.hasMedia) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                        }
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public int getForwardedMessagesCount() {
        Messages messages = this.forwardMessages;
        if (messages == null) {
            return 0;
        }
        return messages.selectedIds.size();
    }

    public boolean hasLink(CharSequence charSequence, String str) {
        if (str != null) {
            try {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                try {
                    AndroidUtilities.addLinksSafe(valueOf, 1, false, true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                    if (areUrlsEqual(uRLSpan.getURL(), str)) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return false;
    }

    public boolean isEmpty() {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        ArrayList<MessageObject> arrayList3;
        Messages messages = this.forwardMessages;
        if (messages == null || (arrayList3 = messages.messages) == null || arrayList3.isEmpty()) {
            Messages messages2 = this.replyMessage;
            if (messages2 == null || (arrayList2 = messages2.messages) == null || arrayList2.isEmpty()) {
                Messages messages3 = this.linkMessage;
                if (messages3 != null && (arrayList = messages3.messages) != null && !arrayList.isEmpty()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void updateForward(ArrayList<MessageObject> arrayList, long j10) {
        SparseBooleanArray sparseBooleanArray;
        long j11;
        long j12;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.hasCaption = false;
        this.hasSenders = false;
        this.isSecret = DialogObject.isEncryptedDialog(j10);
        this.multipleUsers = false;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                MessageObject messageObject = arrayList.get(i9);
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    this.hasCaption = true;
                }
                if (!this.isSecret && (messageFwdHeader = messageObject.messageOwner.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                    arrayList2.add(messageFwdHeader.from_name);
                }
            }
            Boolean bool = Boolean.TRUE;
            Messages messages = this.forwardMessages;
            if (messages != null) {
                sparseBooleanArray = messages.selectedIds;
            } else {
                sparseBooleanArray = null;
            }
            Messages messages2 = new Messages(bool, 0, arrayList, j10, sparseBooleanArray);
            this.forwardMessages = messages2;
            if (messages2.messages.isEmpty()) {
                this.forwardMessages = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject2 = arrayList.get(i10);
                if (messageObject2.isFromUser()) {
                    j12 = messageObject2.messageOwner.from_id.user_id;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(messageObject2.currentAccount).getChat(Long.valueOf(messageObject2.messageOwner.peer_id.channel_id));
                    if (ChatObject.isChannel(chat) && chat.megagroup && messageObject2.isForwardedChannelPost()) {
                        j11 = messageObject2.messageOwner.fwd_from.from_id.channel_id;
                    } else {
                        j11 = messageObject2.messageOwner.peer_id.channel_id;
                    }
                    j12 = -j11;
                }
                if (!arrayList3.contains(Long.valueOf(j12))) {
                    arrayList3.add(Long.valueOf(j12));
                }
            }
            if (arrayList2.size() + arrayList3.size() > 1) {
                this.multipleUsers = true;
                return;
            }
            return;
        }
        this.forwardMessages = null;
    }

    public void updateLink(int i9, TLRPC.WebPage webPage, CharSequence charSequence, MessageObject messageObject, gn gnVar, MessageObject messageObject2) {
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        boolean z13;
        boolean z14;
        boolean z15;
        TLRPC.Message message2;
        int i10;
        int i11;
        float f10;
        this.hasMedia = false;
        this.isVideo = false;
        this.singleLink = true;
        if (this.webpage != webPage) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.webpage = webPage;
        if (TextUtils.isEmpty(charSequence) && this.webpage == null) {
            this.linkMessage = null;
        } else {
            if (charSequence == null) {
                charSequence = "";
            }
            Messages messages = this.linkMessage;
            if (messages != null && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (messages == null && messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                this.webpageTop = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.webpageSmall = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(AndroidUtilities.getTrimmedString(charSequence))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(i9).getClientUserId();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = UserConfig.getInstance(i9).getClientUserId();
            tL_message.entities = MediaDataController.getInstance(i9).getEntities(charSequenceArr, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.webpageTop;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z16 = this.webpageSmall;
                tL_messageMediaWebPage.force_large_media = !z16;
                tL_messageMediaWebPage.force_small_media = z16;
                if (webPage.photo != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.hasMedia = z15;
                this.isVideo = MessageObject.isVideoDocument(webPage.document);
            } else {
                this.hasMedia = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (messageObject != null) {
                tL_message.replyMessage = messageObject.messageOwner;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (gnVar != null) {
                    tL_messageReplyHeader.quote_text = gnVar.f38578i;
                    int i12 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i12 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = gnVar.f38579j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i12 | 192;
                    }
                }
            }
            Messages messages2 = new Messages(this, Boolean.TRUE, 2, new MessageObject(i9, tL_message, true, false));
            this.linkMessage = messages2;
            if (messages2.messages.isEmpty()) {
                this.linkMessage = null;
            } else {
                MessageObject messageObject3 = this.linkMessage.messages.get(0);
                CharSequence charSequence2 = messageObject3.messageText;
                if ((charSequence2 instanceof Spanned) && !TextUtils.isEmpty(charSequence2)) {
                    CharSequence charSequence3 = messageObject3.messageText;
                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 1) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.singleLink = z14;
                } else {
                    CharSequence charSequence4 = messageObject3.caption;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) messageObject3.messageText).getSpans(0, messageObject3.caption.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.singleLink = z12;
                    }
                }
                this.hasMedia = messageObject3.hasLinkMediaToMakeSmall();
                if (z11 && messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!messageObject3.isLinkMediaSmall() || messageObject2.messageOwner.media.force_large_media)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    this.webpageSmall = z13;
                } else if (z11) {
                    this.webpageSmall = messageObject3.isLinkMediaSmall();
                }
                TLRPC.Message message3 = messageObject3.messageOwner;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z17 = this.webpageSmall;
                    messageMedia.force_large_media = !z17;
                    messageMedia.force_small_media = z17;
                }
            }
        }
        cb0 cb0Var = this.previewView;
        if (cb0Var != null) {
            MessagePreviewParams messagePreviewParams = cb0Var.d;
            int i13 = 0;
            while (true) {
                View[] viewArr = cb0Var.f27458f.f31035e;
                if (i13 < viewArr.length) {
                    View view = viewArr[i13];
                    if (view != null) {
                        wa0 wa0Var = (wa0) view;
                        FrameLayout frameLayout = wa0Var.B;
                        if (wa0Var.f34168a == 2) {
                            bb0 bb0Var = wa0Var.D;
                            bb0 bb0Var2 = wa0Var.C;
                            if (messagePreviewParams.singleLink && !messagePreviewParams.hasMedia) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            frameLayout.setVisibility(i10);
                            int i14 = 4;
                            if (messagePreviewParams.isVideo) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            bb0Var2.setVisibility(i11);
                            if (messagePreviewParams.isVideo) {
                                i14 = 0;
                            }
                            bb0Var.setVisibility(i14);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (messagePreviewParams.hasMedia) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            bb0Var2.a(messagePreviewParams.webpageSmall, true);
                            bb0Var.a(messagePreviewParams.webpageSmall, true);
                            wa0Var.A.a(!messagePreviewParams.webpageTop, true);
                            wa0Var.h();
                        }
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public void updateLinkInvertMedia(boolean z10) {
        this.webpageTop = z10;
    }

    public void updateReply(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, long j10, gn gnVar) {
        MessageObject messageObject2;
        gn gnVar2;
        boolean z10;
        int i9;
        if (!this.isSecret && messageObject != null && (i9 = messageObject.type) != 10 && i9 != 11 && i9 != 22 && i9 != 21 && i9 != 18 && i9 != 25 && i9 != 16) {
            messageObject2 = messageObject;
            gnVar2 = gnVar;
        } else {
            messageObject2 = null;
            gnVar2 = null;
        }
        if (messageObject2 != null && (messageObject2.isVoiceOnce() || messageObject2.isRoundOnce() || messageObject2.type == 30)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hasSecretMessages = z10;
        if (messageObject2 == null && gnVar2 == null) {
            this.replyMessage = null;
            this.quote = null;
            return;
        }
        if (groupedMessages != null) {
            this.replyMessage = new Messages(null, 1, groupedMessages.messages, j10, null);
        } else {
            MessageObject messageObject3 = messageObject2;
            if (messageObject3 == null) {
                messageObject3 = gnVar2.f38572a;
            }
            this.replyMessage = new Messages(this, null, 1, messageObject3, j10);
        }
        if (!this.replyMessage.messages.isEmpty()) {
            this.quote = gnVar2;
            if (gnVar2 != null) {
                this.quoteStart = gnVar2.f38573b;
                this.quoteEnd = gnVar2.f38574c;
                return;
            }
            return;
        }
        this.replyMessage = null;
    }
}
