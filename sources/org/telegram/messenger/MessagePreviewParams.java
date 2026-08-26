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
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.MessagePreviewView;

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
    private MessagePreviewView previewView;
    public ChatActivity.ReplyQuote quote;
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

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i, MessageObject messageObject) {
            this(bool, i, MessagePreviewParams.singletonArrayList(messageObject), messageObject.getDialogId(), null);
        }

        public Messages checkEdits(ArrayList<MessageObject> arrayList) {
            ArrayList<MessageObject> arrayList2 = this.messages;
            if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
                boolean z = false;
                for (int i = 0; i < this.messages.size(); i++) {
                    MessageObject messageObject = this.messages.get(i);
                    if (messageObject != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            MessageObject messageObject2 = arrayList.get(i2);
                            if (messageObject2 != null && messageObject.getId() == messageObject2.getId() && messageObject.getDialogId() == messageObject2.getDialogId()) {
                                this.messages.set(i, messageObject2);
                                z = true;
                                break;
                            }
                        }
                    }
                }
                if (z) {
                    return MessagePreviewParams.this.new Messages(this.out, this.type, this.messages, this.dialogId, null);
                }
            }
            return null;
        }

        public void getSelectedMessages(ArrayList<MessageObject> arrayList) {
            arrayList.clear();
            for (int i = 0; i < this.messages.size(); i++) {
                MessageObject messageObject = this.messages.get(i);
                if (this.selectedIds.get(messageObject.getId(), false)) {
                    arrayList.add(messageObject);
                }
            }
        }

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i, MessageObject messageObject, long j) {
            this(bool, i, MessagePreviewParams.singletonArrayList(messageObject), j, null);
        }

        public Messages(Boolean bool, int i, ArrayList<MessageObject> arrayList, long j, SparseBooleanArray sparseBooleanArray) {
            this.groupedMessagesMap = new LongSparseArray<>();
            this.previewMessages = new ArrayList<>();
            this.selectedIds = new SparseBooleanArray();
            this.pollChosenAnswers = new ArrayList<>();
            this.out = bool;
            this.type = i;
            this.dialogId = j;
            this.messages = arrayList;
            if (sparseBooleanArray != null) {
                this.selectedIds = sparseBooleanArray;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = arrayList.get(i2);
                if (i == 0 && sparseBooleanArray == null) {
                    this.selectedIds.put(messageObject.getId(), true);
                }
                MessageObject previewMessage = MessagePreviewParams.this.toPreviewMessage(messageObject, bool, i);
                if (!this.hasSpoilers) {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = previewMessage.messageOwner.entities;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.MessageEntity messageEntity = arrayList2.get(i3);
                        i3++;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            this.hasSpoilers = true;
                            break;
                        }
                    }
                }
                previewMessage.messageOwner.dialog_id = j;
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
                    int i4 = tL_messageMediaPoll.results.total_voters;
                    tL_pollResults.total_voters = i4;
                    previewMediaPoll.totalVotersCached = i4;
                    previewMessage.messageOwner.media = previewMediaPoll;
                    if (messageObject.canUnvote()) {
                        int size2 = tL_messageMediaPoll.results.results.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i5);
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
            for (int i6 = 0; i6 < this.groupedMessagesMap.size(); i6++) {
                this.groupedMessagesMap.valueAt(i6).calculate();
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = this.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0) {
                this.hasText = this.groupedMessagesMap.valueAt(0).findCaptionMessageObject() != null;
                return;
            }
            if (arrayList.size() == 1) {
                MessageObject messageObject2 = arrayList.get(0);
                int i7 = messageObject2.type;
                if (i7 != 0 && i7 != 19) {
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

    public MessagePreviewParams(boolean z, boolean z2, boolean z3) {
        this.isSecret = z;
        this.noforwards = z || z2;
        this.monoforum = z3;
    }

    public static boolean areUrlsEqual(String str, String str2) {
        if (str == null || str2 == null) {
            return str == null;
        }
        Uri uri = Uri.parse(str);
        Uri uri2 = Uri.parse(str2);
        if (uri != uri2) {
            if (uri != null && uri2 != null && uri.getHost() != null && uri.getHost().equalsIgnoreCase(uri2.getHost()) && uri.getPort() == uri2.getPort() && normalizePath(uri.getPath()).equals(normalizePath(uri2.getPath()))) {
                if (uri.getQuery() == null) {
                }
            }
            return false;
        }
        return true;
    }

    private static String normalizePath(String str) {
        if (str == null) {
            return "";
        }
        return str.endsWith("/") ? str : str.concat("/");
    }

    public static ArrayList<MessageObject> singletonArrayList(MessageObject messageObject) {
        return MediaController$$ExternalSyntheticOutline1.m(messageObject);
    }

    public MessageObject toPreviewMessage(MessageObject messageObject, Boolean bool, final int i) {
        TLRPC.MessageFwdHeader tL_messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        if (i != 1) {
            tL_message.date = ConnectionsManager.getInstance(messageObject.currentAccount).getCurrentTime();
        } else {
            tL_message.date = messageObject.messageOwner.date;
        }
        TLRPC.Message message = messageObject.messageOwner;
        tL_message.id = message.id;
        tL_message.grouped_id = message.grouped_id;
        tL_message.peer_id = message.peer_id;
        tL_message.from_id = message.from_id;
        tL_message.message = message.message;
        tL_message.rich_message = message.rich_message;
        tL_message.media = message.media;
        tL_message.action = message.action;
        tL_message.edit_date = 0;
        ArrayList<TLRPC.MessageEntity> arrayList = message.entities;
        if (arrayList != null) {
            tL_message.entities.addAll(arrayList);
        }
        boolean zBooleanValue = bool == null ? messageObject.messageOwner.out : bool.booleanValue();
        tL_message.out = zBooleanValue;
        if (zBooleanValue) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(messageObject.currentAccount).getClientUserId();
        }
        tL_message.unread = false;
        TLRPC.Message message2 = messageObject.messageOwner;
        tL_message.via_bot_id = message2.via_bot_id;
        tL_message.reply_markup = message2.reply_markup;
        tL_message.post = message2.post;
        tL_message.legacy = message2.legacy;
        tL_message.restriction_reason = message2.restriction_reason;
        TLRPC.Message message3 = message2.replyMessage;
        tL_message.replyMessage = message3;
        if (message3 == null && (messageObject2 = messageObject.replyMessageObject) != null) {
            tL_message.replyMessage = messageObject2.messageOwner;
        }
        tL_message.reply_to = message2.reply_to;
        tL_message.invert_media = message2.invert_media;
        if (i == 0) {
            long clientUserId = UserConfig.getInstance(messageObject.currentAccount).getClientUserId();
            if (this.isSecret) {
                tL_messageFwdHeader = null;
            } else {
                TLRPC.Message message4 = messageObject.messageOwner;
                tL_messageFwdHeader = message4.fwd_from;
                if (tL_messageFwdHeader == null) {
                    long j = message4.from_id.user_id;
                    if (j != 0 && message4.dialog_id == clientUserId && j == clientUserId) {
                        tL_messageFwdHeader = null;
                    } else {
                        tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                        tL_messageFwdHeader.from_id = messageObject.messageOwner.from_id;
                        if (messageObject.isDice()) {
                            this.willSeeSenders = true;
                        } else {
                            this.hasSenders = true;
                        }
                    }
                } else if (messageObject.isDice()) {
                    this.willSeeSenders = true;
                } else {
                    this.hasSenders = true;
                }
            }
            if (tL_messageFwdHeader != null) {
                tL_message.fwd_from = tL_messageFwdHeader;
                tL_message.flags |= 4;
            }
            if (messageObject.isWelcomeAnchored()) {
                tL_message.id = messageObject.getEphemeralId();
                TLRPC.MessageFwdHeader messageFwdHeader = tL_message.fwd_from;
                if (messageFwdHeader != null && messageFwdHeader.from_id != null) {
                    messageFwdHeader.from_id = (TLRPC.Peer) TLObject.deepCopy(messageObject.messageOwner.peer_id, new SharedConfig$$ExternalSyntheticLambda5(9));
                    long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                    if (peerDialogId > 0) {
                        tL_message.via_bot_id = peerDialogId;
                    }
                }
            }
        }
        MessageObject messageObject3 = new MessageObject(messageObject.currentAccount, tL_message, true, false) {
            @Override
            public void generateLayout(TLRPC.User user) {
                super.generateLayout(user);
                if (i == 2) {
                    MessagePreviewParams.this.checkCurrentLink(this);
                }
            }

            @Override
            public boolean needDrawForwarded() {
                if (MessagePreviewParams.this.hideForwardSendersName) {
                    return false;
                }
                return super.needDrawForwarded();
            }
        };
        messageObject3.previewForward = i == 0;
        messageObject3.preview = true;
        return messageObject3;
    }

    public void attach(MessagePreviewView messagePreviewView) {
        this.previewView = messagePreviewView;
    }

    public void checkCurrentLink(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        this.currentLink = null;
        if (messageObject != null) {
            CharSequence charSequence = messageObject.messageText;
            if (!(charSequence instanceof Spanned) || (webPage = this.webpage) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i = 0; i < uRLSpanArr.length; i++) {
                if (areUrlsEqual(uRLSpanArr[i].getURL(), this.webpage.url)) {
                    this.currentLink = uRLSpanArr[i];
                    return;
                }
            }
        }
    }

    public void checkEdits(ArrayList<MessageObject> arrayList) {
        boolean z;
        MessagePreviewView messagePreviewView;
        Messages messagesCheckEdits;
        Messages messagesCheckEdits2;
        Messages messagesCheckEdits3;
        Messages messages = this.forwardMessages;
        if (messages == null || (messagesCheckEdits3 = messages.checkEdits(arrayList)) == null) {
            z = false;
        } else {
            this.forwardMessages = messagesCheckEdits3;
            z = true;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (messagesCheckEdits2 = messages2.checkEdits(arrayList)) != null) {
            this.replyMessage = messagesCheckEdits2;
            z = true;
        }
        Messages messages3 = this.linkMessage;
        if (messages3 != null && (messagesCheckEdits = messages3.checkEdits(arrayList)) != null) {
            this.linkMessage = messagesCheckEdits;
            z = true;
        }
        if (!z || (messagePreviewView = this.previewView) == null) {
            return;
        }
        int i = 0;
        while (true) {
            View[] viewArr = messagePreviewView.viewPager.viewPages;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view instanceof MessagePreviewView.Page) {
                MessagePreviewView.Page page = (MessagePreviewView.Page) view;
                int i2 = page.currentTab;
                MessagePreviewParams messagePreviewParams = messagePreviewView.messagePreviewParams;
                if (i2 == 1) {
                    page.messages = messagePreviewParams.forwardMessages;
                } else if (i2 == 0) {
                    page.messages = messagePreviewParams.replyMessage;
                } else if (i2 == 2) {
                    page.messages = messagePreviewParams.linkMessage;
                }
                page.updateMessages();
                if (page.currentTab == 0) {
                    boolean z2 = messagePreviewView.showOutdatedQuote;
                    MessagePreviewView.Page.AnonymousClass4 anonymousClass4 = page.textSelectionHelper;
                    if (!z2 || messagePreviewParams.isSecret) {
                        messagePreviewParams.quote = null;
                        anonymousClass4.clear(false);
                        page.switchToQuote(false, true);
                    } else {
                        TextSelectionHelper.SelectableView selectableView = anonymousClass4.selectedView;
                        MessageObject replyMessage = page.getReplyMessage(selectableView != null ? ((ChatMessageCell) selectableView).getMessageObject() : null);
                        if (replyMessage != null) {
                            messagePreviewParams.quoteStart = 0;
                            int iMin = Math.min(MessagesController.getInstance(messagePreviewView.currentAccount).quoteLengthMax, replyMessage.messageOwner.message.length());
                            messagePreviewParams.quoteEnd = iMin;
                            messagePreviewParams.quote = ChatActivity.ReplyQuote.from(messagePreviewParams.quoteStart, iMin, replyMessage);
                            View replyMessageCell = page.getReplyMessageCell();
                            if (replyMessageCell instanceof ChatMessageCell) {
                                anonymousClass4.select((ChatMessageCell) replyMessageCell, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                            }
                        }
                    }
                    page.updateSubtitle(true);
                }
                MessagePreviewView.ToggleButton toggleButton = page.changeSizeBtn;
                if (toggleButton != null) {
                    toggleButton.animate().alpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f).start();
                }
            }
            i++;
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
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                try {
                    AndroidUtilities.addLinksSafe(spannableStringValueOf, 1, false, true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class)) {
                    if (areUrlsEqual(uRLSpan.getURL(), str)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return false;
    }

    public boolean isEmpty() {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        ArrayList<MessageObject> arrayList3;
        Messages messages = this.forwardMessages;
        if (messages != null && (arrayList3 = messages.messages) != null && !arrayList3.isEmpty()) {
            return false;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (arrayList2 = messages2.messages) != null && !arrayList2.isEmpty()) {
            return false;
        }
        Messages messages3 = this.linkMessage;
        return messages3 == null || (arrayList = messages3.messages) == null || arrayList.isEmpty();
    }

    public void updateForward(ArrayList<MessageObject> arrayList, long j) {
        long j2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.hasCaption = false;
        this.hasSenders = false;
        this.isSecret = DialogObject.isEncryptedDialog(j);
        this.multipleUsers = false;
        if (arrayList == null) {
            this.forwardMessages = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = arrayList.get(i);
            if (!TextUtils.isEmpty(messageObject.caption)) {
                this.hasCaption = true;
            }
            if (!this.isSecret && (messageFwdHeader = messageObject.messageOwner.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        Messages messages = this.forwardMessages;
        Messages messages2 = new Messages(bool, 0, arrayList, j, messages != null ? messages.selectedIds : null);
        this.forwardMessages = messages2;
        if (messages2.messages.isEmpty()) {
            this.forwardMessages = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject messageObject2 = arrayList.get(i2);
            if (messageObject2.isFromUser()) {
                j2 = messageObject2.messageOwner.from_id.user_id;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(messageObject2.currentAccount).getChat(Long.valueOf(messageObject2.messageOwner.peer_id.channel_id));
                j2 = -((ChatObject.isChannel(chat) && chat.megagroup && messageObject2.isForwardedChannelPost()) ? messageObject2.messageOwner.fwd_from.from_id.channel_id : messageObject2.messageOwner.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j2))) {
                arrayList3.add(Long.valueOf(j2));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.multipleUsers = true;
        }
    }

    public void updateLink(int i, TLRPC.WebPage webPage, CharSequence charSequence, MessageObject messageObject, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message2;
        this.hasMedia = false;
        this.isVideo = false;
        this.singleLink = true;
        boolean z = this.webpage != webPage;
        this.webpage = webPage;
        if (TextUtils.isEmpty(charSequence) && this.webpage == null) {
            this.linkMessage = null;
        } else {
            if (charSequence == null) {
                charSequence = "";
            }
            Messages messages = this.linkMessage;
            boolean z2 = messages == null || z;
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
            tL_peerUser.user_id = UserConfig.getInstance(i).getClientUserId();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = UserConfig.getInstance(i).getClientUserId();
            tL_message.entities = MediaDataController.getInstance(i).getEntities(charSequenceArr, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.webpageTop;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z3 = this.webpageSmall;
                tL_messageMediaWebPage.force_large_media = !z3;
                tL_messageMediaWebPage.force_small_media = z3;
                this.hasMedia = webPage.photo != null;
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
                if (replyQuote != null) {
                    tL_messageReplyHeader.quote_text = replyQuote.text;
                    int i2 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i2 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = replyQuote.entities;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i2 | 192;
                    }
                }
            }
            Messages messages2 = new Messages(this, Boolean.TRUE, 2, new MessageObject(i, tL_message, true, false));
            this.linkMessage = messages2;
            if (messages2.messages.isEmpty()) {
                this.linkMessage = null;
            } else {
                MessageObject messageObject3 = this.linkMessage.messages.get(0);
                CharSequence charSequence2 = messageObject3.messageText;
                if (!(charSequence2 instanceof Spanned) || TextUtils.isEmpty(charSequence2)) {
                    CharSequence charSequence3 = messageObject3.caption;
                    if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) messageObject3.messageText).getSpans(0, messageObject3.caption.length(), URLSpan.class);
                        this.singleLink = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence4 = messageObject3.messageText;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    this.singleLink = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                this.hasMedia = messageObject3.hasLinkMediaToMakeSmall();
                if (z2 && messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia2 = message.media) != null) {
                    this.webpageSmall = messageMedia2.force_small_media || (messageObject3.isLinkMediaSmall() && !messageObject2.messageOwner.media.force_large_media);
                } else if (z2) {
                    this.webpageSmall = messageObject3.isLinkMediaSmall();
                }
                TLRPC.Message message3 = messageObject3.messageOwner;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z4 = this.webpageSmall;
                    messageMedia.force_large_media = !z4;
                    messageMedia.force_small_media = z4;
                }
            }
        }
        MessagePreviewView messagePreviewView = this.previewView;
        if (messagePreviewView == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            View[] viewArr = messagePreviewView.viewPager.viewPages;
            if (i3 >= viewArr.length) {
                return;
            }
            View view = viewArr[i3];
            if (view != null) {
                MessagePreviewView.Page page = (MessagePreviewView.Page) view;
                if (page.currentTab == 2) {
                    FrameLayout frameLayout = page.changeSizeBtnContainer;
                    MessagePreviewParams messagePreviewParams = messagePreviewView.messagePreviewParams;
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    int i4 = messagePreviewParams.isVideo ? 4 : 0;
                    MessagePreviewView.ToggleButton toggleButton = page.changeSizeBtn;
                    toggleButton.setVisibility(i4);
                    int i5 = messagePreviewParams.isVideo ? 0 : 4;
                    MessagePreviewView.ToggleButton toggleButton2 = page.videoChangeSizeBtn;
                    toggleButton2.setVisibility(i5);
                    frameLayout.animate().alpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f).start();
                    toggleButton.setState(messagePreviewParams.webpageSmall, true);
                    toggleButton2.setState(messagePreviewParams.webpageSmall, true);
                    page.changePositionBtn.setState(!messagePreviewParams.webpageTop, true);
                    page.updateMessages();
                }
            }
            i3++;
        }
    }

    public void updateLinkInvertMedia(boolean z) {
        this.webpageTop = z;
    }

    public void updateReply(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, long j, ChatActivity.ReplyQuote replyQuote) {
        MessageObject messageObject2;
        ChatActivity.ReplyQuote replyQuote2;
        int i;
        if (this.isSecret || messageObject == null || (i = messageObject.type) == 10 || i == 11 || i == 22 || i == 21 || i == 18 || i == 25 || i == 16) {
            messageObject2 = null;
            replyQuote2 = null;
        } else {
            messageObject2 = messageObject;
            replyQuote2 = replyQuote;
        }
        this.hasSecretMessages = messageObject2 != null && (messageObject2.isVoiceOnce() || messageObject2.isRoundOnce() || messageObject2.type == 30);
        if (messageObject2 == null && replyQuote2 == null) {
            this.replyMessage = null;
            this.quote = null;
            return;
        }
        if (groupedMessages != null) {
            this.replyMessage = new Messages(null, 1, groupedMessages.messages, j, null);
        } else {
            MessageObject messageObject3 = messageObject2;
            if (messageObject3 == null) {
                messageObject3 = replyQuote2.message;
            }
            this.replyMessage = new Messages(this, null, 1, messageObject3, j);
        }
        if (this.replyMessage.messages.isEmpty()) {
            this.replyMessage = null;
            return;
        }
        this.quote = replyQuote2;
        if (replyQuote2 != null) {
            this.quoteStart = replyQuote2.start;
            this.quoteEnd = replyQuote2.end;
        }
    }
}
