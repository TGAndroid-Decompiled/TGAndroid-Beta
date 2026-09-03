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
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.pn;
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
    private xb0 previewView;
    public pn quote;
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

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i10, MessageObject messageObject) {
            this(bool, i10, MessagePreviewParams.singletonArrayList(messageObject), messageObject.getDialogId(), null);
        }

        public Messages checkEdits(ArrayList<MessageObject> arrayList) {
            ArrayList<MessageObject> arrayList2 = this.messages;
            if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
                boolean z4 = false;
                for (int i10 = 0; i10 < this.messages.size(); i10++) {
                    MessageObject messageObject = this.messages.get(i10);
                    if (messageObject != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            MessageObject messageObject2 = arrayList.get(i11);
                            if (messageObject2 != null && messageObject.getId() == messageObject2.getId() && messageObject.getDialogId() == messageObject2.getDialogId()) {
                                this.messages.set(i10, messageObject2);
                                z4 = true;
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (z4) {
                    return new Messages(this.out, this.type, this.messages, this.dialogId, null);
                }
            }
            return null;
        }

        public void getSelectedMessages(ArrayList<MessageObject> arrayList) {
            arrayList.clear();
            for (int i10 = 0; i10 < this.messages.size(); i10++) {
                MessageObject messageObject = this.messages.get(i10);
                if (this.selectedIds.get(messageObject.getId(), false)) {
                    arrayList.add(messageObject);
                }
            }
        }

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i10, MessageObject messageObject, long j10) {
            this(bool, i10, MessagePreviewParams.singletonArrayList(messageObject), j10, null);
        }

        public Messages(Boolean bool, int i10, ArrayList<MessageObject> arrayList, long j10, SparseBooleanArray sparseBooleanArray) {
            this.groupedMessagesMap = new LongSparseArray<>();
            this.previewMessages = new ArrayList<>();
            this.selectedIds = new SparseBooleanArray();
            this.pollChosenAnswers = new ArrayList<>();
            this.out = bool;
            this.type = i10;
            this.dialogId = j10;
            this.messages = arrayList;
            if (sparseBooleanArray != null) {
                this.selectedIds = sparseBooleanArray;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessageObject messageObject = arrayList.get(i11);
                if (i10 == 0 && sparseBooleanArray == null) {
                    this.selectedIds.put(messageObject.getId(), true);
                }
                MessageObject previewMessage = MessagePreviewParams.this.toPreviewMessage(messageObject, bool, i10);
                if (!this.hasSpoilers) {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = previewMessage.messageOwner.entities;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.MessageEntity messageEntity = arrayList2.get(i12);
                        i12++;
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
                    int i13 = tL_messageMediaPoll.results.total_voters;
                    tL_pollResults.total_voters = i13;
                    previewMediaPoll.totalVotersCached = i13;
                    previewMessage.messageOwner.media = previewMediaPoll;
                    if (messageObject.canUnvote()) {
                        int size2 = tL_messageMediaPoll.results.results.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
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
            for (int i15 = 0; i15 < this.groupedMessagesMap.size(); i15++) {
                this.groupedMessagesMap.valueAt(i15).calculate();
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = this.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0) {
                this.hasText = this.groupedMessagesMap.valueAt(0).findCaptionMessageObject() != null;
            } else if (arrayList.size() == 1) {
                MessageObject messageObject2 = arrayList.get(0);
                int i16 = messageObject2.type;
                if (i16 != 0 && i16 != 19) {
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

    public MessagePreviewParams(boolean z4, boolean z10, boolean z11) {
        boolean z12;
        this.isSecret = z4;
        if (!z4 && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.noforwards = z12;
        this.monoforum = z11;
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
        return y3.m(messageObject);
    }

    public org.telegram.messenger.MessageObject toPreviewMessage(org.telegram.messenger.MessageObject r17, java.lang.Boolean r18, final int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagePreviewParams.toPreviewMessage(org.telegram.messenger.MessageObject, java.lang.Boolean, int):org.telegram.messenger.MessageObject");
    }

    public void attach(xb0 xb0Var) {
        this.previewView = xb0Var;
    }

    public void checkCurrentLink(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        this.currentLink = null;
        if (messageObject != null) {
            CharSequence charSequence = messageObject.messageText;
            if ((charSequence instanceof Spanned) && (webPage = this.webpage) != null && webPage.url != null) {
                Spanned spanned = (Spanned) charSequence;
                URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                    if (areUrlsEqual(uRLSpanArr[i10].getURL(), this.webpage.url)) {
                        this.currentLink = uRLSpanArr[i10];
                        return;
                    }
                }
            }
        }
    }

    public void checkEdits(ArrayList<MessageObject> arrayList) {
        boolean z4;
        xb0 xb0Var;
        float f10;
        Messages checkEdits;
        Messages checkEdits2;
        Messages checkEdits3;
        Messages messages = this.forwardMessages;
        if (messages != null && (checkEdits3 = messages.checkEdits(arrayList)) != null) {
            this.forwardMessages = checkEdits3;
            z4 = true;
        } else {
            z4 = false;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (checkEdits2 = messages2.checkEdits(arrayList)) != null) {
            this.replyMessage = checkEdits2;
            z4 = true;
        }
        Messages messages3 = this.linkMessage;
        if (messages3 != null && (checkEdits = messages3.checkEdits(arrayList)) != null) {
            this.linkMessage = checkEdits;
            z4 = true;
        }
        if (z4 && (xb0Var = this.previewView) != null) {
            MessagePreviewParams messagePreviewParams = xb0Var.d;
            int i10 = 0;
            while (true) {
                View[] viewArr = xb0Var.f30576f.e;
                if (i10 < viewArr.length) {
                    View view = viewArr[i10];
                    if (view instanceof rb0) {
                        rb0 rb0Var = (rb0) view;
                        int i11 = rb0Var.f28440a;
                        ib0 ib0Var = rb0Var.e;
                        if (i11 == 1) {
                            rb0Var.f28445r = messagePreviewParams.forwardMessages;
                        } else if (i11 == 0) {
                            rb0Var.f28445r = messagePreviewParams.replyMessage;
                        } else if (i11 == 2) {
                            rb0Var.f28445r = messagePreviewParams.linkMessage;
                        }
                        rb0Var.h();
                        if (i11 == 0) {
                            MessageObject messageObject = null;
                            if (xb0Var.f30574b && !messagePreviewParams.isSecret) {
                                org.telegram.ui.Cells.t9 t9Var = ib0Var.W;
                                if (t9Var != null) {
                                    messageObject = ((org.telegram.ui.Cells.s1) t9Var).getMessageObject();
                                }
                                MessageObject c3 = rb0Var.c(messageObject);
                                if (c3 != null) {
                                    messagePreviewParams.quoteStart = 0;
                                    int min = Math.min(MessagesController.getInstance(xb0Var.f30580w).quoteLengthMax, c3.messageOwner.message.length());
                                    messagePreviewParams.quoteEnd = min;
                                    messagePreviewParams.quote = pn.b(messagePreviewParams.quoteStart, min, c3);
                                    View d = rb0Var.d();
                                    if (d instanceof org.telegram.ui.Cells.s1) {
                                        ib0Var.a0((org.telegram.ui.Cells.s1) d, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                                    }
                                }
                            } else {
                                messagePreviewParams.quote = null;
                                ib0Var.f(false);
                                rb0Var.g(false, true);
                            }
                            rb0Var.k(true);
                        }
                        wb0 wb0Var = rb0Var.D;
                        if (wb0Var != null) {
                            ViewPropertyAnimator animate = wb0Var.animate();
                            if (messagePreviewParams.hasMedia) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                        }
                    }
                    i10++;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                    if (areUrlsEqual(uRLSpan.getURL(), str)) {
                        return true;
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = arrayList.get(i10);
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
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessageObject messageObject2 = arrayList.get(i11);
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

    public void updateLink(int i10, TLRPC.WebPage webPage, CharSequence charSequence, MessageObject messageObject, pn pnVar, MessageObject messageObject2) {
        boolean z4;
        boolean z10;
        boolean z11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.Message message2;
        int i11;
        int i12;
        float f10;
        this.hasMedia = false;
        this.isVideo = false;
        this.singleLink = true;
        if (this.webpage != webPage) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.webpage = webPage;
        if (TextUtils.isEmpty(charSequence) && this.webpage == null) {
            this.linkMessage = null;
        } else {
            if (charSequence == null) {
                charSequence = "";
            }
            Messages messages = this.linkMessage;
            if (messages != null && !z4) {
                z10 = false;
            } else {
                z10 = true;
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
            tL_peerUser.user_id = UserConfig.getInstance(i10).getClientUserId();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = UserConfig.getInstance(i10).getClientUserId();
            tL_message.entities = MediaDataController.getInstance(i10).getEntities(charSequenceArr, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.webpageTop;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z15 = this.webpageSmall;
                tL_messageMediaWebPage.force_large_media = !z15;
                tL_messageMediaWebPage.force_small_media = z15;
                if (webPage.photo != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.hasMedia = z14;
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
                if (pnVar != null) {
                    tL_messageReplyHeader.quote_text = pnVar.f37194i;
                    int i13 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i13 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = pnVar.f37195j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i13 | 192;
                    }
                }
            }
            Messages messages2 = new Messages(this, Boolean.TRUE, 2, new MessageObject(i10, tL_message, true, false));
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
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    this.singleLink = z13;
                } else {
                    CharSequence charSequence4 = messageObject3.caption;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) messageObject3.messageText).getSpans(0, messageObject3.caption.length(), URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        this.singleLink = z11;
                    }
                }
                this.hasMedia = messageObject3.hasLinkMediaToMakeSmall();
                if (z10 && messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia2 = message.media) != null) {
                    if (!messageMedia2.force_small_media && (!messageObject3.isLinkMediaSmall() || messageObject2.messageOwner.media.force_large_media)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    this.webpageSmall = z12;
                } else if (z10) {
                    this.webpageSmall = messageObject3.isLinkMediaSmall();
                }
                TLRPC.Message message3 = messageObject3.messageOwner;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z16 = this.webpageSmall;
                    messageMedia.force_large_media = !z16;
                    messageMedia.force_small_media = z16;
                }
            }
        }
        xb0 xb0Var = this.previewView;
        if (xb0Var != null) {
            MessagePreviewParams messagePreviewParams = xb0Var.d;
            int i14 = 0;
            while (true) {
                View[] viewArr = xb0Var.f30576f.e;
                if (i14 < viewArr.length) {
                    View view = viewArr[i14];
                    if (view != null) {
                        rb0 rb0Var = (rb0) view;
                        FrameLayout frameLayout = rb0Var.C;
                        if (rb0Var.f28440a == 2) {
                            wb0 wb0Var = rb0Var.E;
                            wb0 wb0Var2 = rb0Var.D;
                            if (messagePreviewParams.singleLink && !messagePreviewParams.hasMedia) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            frameLayout.setVisibility(i11);
                            int i15 = 4;
                            if (messagePreviewParams.isVideo) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            wb0Var2.setVisibility(i12);
                            if (messagePreviewParams.isVideo) {
                                i15 = 0;
                            }
                            wb0Var.setVisibility(i15);
                            ViewPropertyAnimator animate = frameLayout.animate();
                            if (messagePreviewParams.hasMedia) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            animate.alpha(f10).start();
                            wb0Var2.a(messagePreviewParams.webpageSmall, true);
                            wb0Var.a(messagePreviewParams.webpageSmall, true);
                            rb0Var.B.a(!messagePreviewParams.webpageTop, true);
                            rb0Var.h();
                        }
                    }
                    i14++;
                } else {
                    return;
                }
            }
        }
    }

    public void updateLinkInvertMedia(boolean z4) {
        this.webpageTop = z4;
    }

    public void updateReply(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, long j10, pn pnVar) {
        MessageObject messageObject2;
        pn pnVar2;
        boolean z4;
        int i10;
        if (!this.isSecret && messageObject != null && (i10 = messageObject.type) != 10 && i10 != 11 && i10 != 22 && i10 != 21 && i10 != 18 && i10 != 25 && i10 != 16) {
            messageObject2 = messageObject;
            pnVar2 = pnVar;
        } else {
            messageObject2 = null;
            pnVar2 = null;
        }
        if (messageObject2 != null && (messageObject2.isVoiceOnce() || messageObject2.isRoundOnce() || messageObject2.type == 30)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.hasSecretMessages = z4;
        if (messageObject2 == null && pnVar2 == null) {
            this.replyMessage = null;
            this.quote = null;
            return;
        }
        if (groupedMessages != null) {
            this.replyMessage = new Messages(null, 1, groupedMessages.messages, j10, null);
        } else {
            MessageObject messageObject3 = messageObject2;
            if (messageObject3 == null) {
                messageObject3 = pnVar2.f37189a;
            }
            this.replyMessage = new Messages(this, null, 1, messageObject3, j10);
        }
        if (!this.replyMessage.messages.isEmpty()) {
            this.quote = pnVar2;
            if (pnVar2 != null) {
                this.quoteStart = pnVar2.f37190b;
                this.quoteEnd = pnVar2.f37191c;
                return;
            }
            return;
        }
        this.replyMessage = null;
    }
}
