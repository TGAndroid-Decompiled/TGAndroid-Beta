package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class n8 implements Runnable {
    public final int f19039a;
    public final Object f19040b;
    public final Object f19041c;
    public final Object d;

    public n8(Object obj, Object obj2, Object obj3, int i10) {
        this.f19039a = i10;
        this.f19040b = obj;
        this.d = obj2;
        this.f19041c = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19039a) {
            case 0:
                ((MediaDataController) this.f19040b).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, (String) this.f19041c);
                return;
            case 1:
                ((MediaDataController) this.f19040b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.d, (String) this.f19041c);
                return;
            case 2:
                ((MediaDataController) this.f19040b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.d, (TLObject) this.f19041c);
                return;
            case 3:
                ((MediaDataController) this.f19040b).lambda$clearBotKeyboard$194((ArrayList) this.d, (MessagesStorage.TopicKey) this.f19041c);
                return;
            case 4:
                ((MediaDataController) this.f19040b).lambda$findStickerSetByNameInCache$30((String) this.f19041c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MediaDataController) this.f19040b).lambda$processLoadedMedia$135((ArrayList) this.d, (f9) this.f19041c);
                return;
            case 6:
                ((MediaDataController) this.f19040b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.d, (Utilities.Callback) this.f19041c);
                return;
            case 7:
                ((MessagesController) this.f19040b).lambda$addUsersToChat$295((TLRPC.Chat) this.d, (TLRPC.TL_messages_invitedUsers) this.f19041c);
                return;
            case 8:
                ((MessagesController) this.f19040b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.d, (mb) this.f19041c);
                return;
            case 9:
                ((MessagesController) this.f19040b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.d, (nb) this.f19041c);
                return;
            case 10:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.b2[]) this.f19040b, (boolean[]) this.d, (org.telegram.ui.ActionBar.n2) this.f19041c);
                return;
            case 11:
                ((MessagesController) this.f19040b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.d, (String) this.f19041c);
                return;
            case 12:
                ((MessagesController) this.f19040b).lambda$processMessageIDUpdate$375((long[]) this.d, (TL_update.TL_updateMessageID) this.f19041c);
                return;
            case 13:
                ((MessagesController) this.f19040b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.d, (LongSparseIntArray) this.f19041c);
                return;
            case 14:
                ((MessagesController) this.f19040b).lambda$getDifference$352((ArrayList) this.d, (TLRPC.updates_Difference) this.f19041c);
                return;
            case 15:
                ((MessagesController) this.f19040b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.g6) this.d, (org.telegram.ui.ActionBar.f6) this.f19041c);
                return;
            case 16:
                ((MessagesController) this.f19040b).lambda$getChannelDifference$341((ArrayList) this.d, (TLRPC.updates_ChannelDifference) this.f19041c);
                return;
            case 17:
                ((MessagesController) this.f19040b).lambda$requestIsUserContactBlocked$497((TLObject) this.d, (ArrayList) this.f19041c);
                return;
            case 18:
                ((MessagesController.SavedMusicList) this.f19040b).lambda$load$0((TLObject) this.d, (ArrayList) this.f19041c);
                return;
            case 19:
                ((MessagesStorage) this.f19040b).lambda$saveBotCache$126((TLObject) this.d, (String) this.f19041c);
                return;
            case 20:
                ((MessagesStorage) this.f19040b).lambda$applyPhoneBookUpdates$148((String) this.f19041c, (String) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f19040b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f19041c);
                return;
            case 22:
                ((MessagesStorage) this.f19040b).lambda$getNewTask$111((a0.h) this.d, (a0.h) this.f19041c);
                return;
            case 23:
                ((SavedMessagesController) this.f19040b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f19041c);
                return;
            case 24:
                ((SecretChatHelper) this.f19040b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.d, (TLRPC.EncryptedChat) this.f19041c);
                return;
            case 25:
                ((SendMessagesHelper) this.f19040b).lambda$sendVote$34((String) this.f19041c, (Runnable) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f19040b).lambda$performSendDelayedMessage$52((TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f19041c);
                return;
            case 27:
                ((SendMessagesHelper) this.f19040b).lambda$sendMessage$17((TLRPC.TL_error) this.d, (TLRPC.TL_messages_forwardMessages) this.f19041c);
                return;
            case 28:
                ((TelegramMediaSession) this.f19040b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f19041c);
                return;
            default:
                ((TranslateController) this.f19040b).lambda$checkDialogMessageSure$10((ArrayList) this.d, (ArrayList) this.f19041c);
                return;
        }
    }

    public n8(BaseController baseController, String str, Object obj, int i10) {
        this.f19039a = i10;
        this.f19040b = baseController;
        this.f19041c = str;
        this.d = obj;
    }
}
