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
public final class q8 implements Runnable {
    public final int f21026a;
    public final Object f21027b;
    public final Object f21028c;
    public final Object d;

    public q8(Object obj, Object obj2, Object obj3, int i10) {
        this.f21026a = i10;
        this.f21027b = obj;
        this.d = obj2;
        this.f21028c = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21026a) {
            case 0:
                ((MediaDataController) this.f21027b).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, (String) this.f21028c);
                return;
            case 1:
                ((MediaDataController) this.f21027b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.d, (String) this.f21028c);
                return;
            case 2:
                ((MediaDataController) this.f21027b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.d, (TLObject) this.f21028c);
                return;
            case 3:
                ((MediaDataController) this.f21027b).lambda$clearBotKeyboard$194((ArrayList) this.d, (MessagesStorage.TopicKey) this.f21028c);
                return;
            case 4:
                ((MediaDataController) this.f21027b).lambda$findStickerSetByNameInCache$30((String) this.f21028c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MediaDataController) this.f21027b).lambda$processLoadedMedia$135((ArrayList) this.d, (i9) this.f21028c);
                return;
            case 6:
                ((MediaDataController) this.f21027b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.d, (Utilities.Callback) this.f21028c);
                return;
            case 7:
                ((MessagesController) this.f21027b).lambda$addUsersToChat$295((TLRPC.Chat) this.d, (TLRPC.TL_messages_invitedUsers) this.f21028c);
                return;
            case 8:
                ((MessagesController) this.f21027b).lambda$processMessageIDUpdate$377((long[]) this.d, (TL_update.TL_updateMessageID) this.f21028c);
                return;
            case 9:
                ((MessagesController) this.f21027b).lambda$getChannelDifference$343((ArrayList) this.d, (TLRPC.updates_ChannelDifference) this.f21028c);
                return;
            case 10:
                ((MessagesController) this.f21027b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.d, (qb) this.f21028c);
                return;
            case 11:
                ((MessagesController) this.f21027b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.d, (rb) this.f21028c);
                return;
            case 12:
                ((MessagesController) this.f21027b).lambda$requestIsUserContactBlocked$500((TLObject) this.d, (ArrayList) this.f21028c);
                return;
            case 13:
                ((MessagesController) this.f21027b).lambda$getDifference$354((ArrayList) this.d, (TLRPC.updates_Difference) this.f21028c);
                return;
            case 14:
                MessagesController.lambda$openByUserName$464((org.telegram.ui.ActionBar.e2[]) this.f21027b, (boolean[]) this.d, (org.telegram.ui.ActionBar.r2) this.f21028c);
                return;
            case 15:
                ((MessagesController) this.f21027b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.d, (String) this.f21028c);
                return;
            case 16:
                ((MessagesController) this.f21027b).lambda$addUserToChat$308((TLRPC.Updates) this.d, (Runnable) this.f21028c);
                return;
            case 17:
                ((MessagesController) this.f21027b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.d, (LongSparseIntArray) this.f21028c);
                return;
            case 18:
                ((MessagesController) this.f21027b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.x6) this.d, (org.telegram.ui.ActionBar.w6) this.f21028c);
                return;
            case 19:
                ((MessagesController.SavedMusicList) this.f21027b).lambda$load$0((TLObject) this.d, (ArrayList) this.f21028c);
                return;
            case 20:
                ((MessagesStorage) this.f21027b).lambda$applyPhoneBookUpdates$152((String) this.f21028c, (String) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f21027b).lambda$replaceMessageIfExists$236((MessageObject) this.d, (ArrayList) this.f21028c);
                return;
            case 22:
                ((MessagesStorage) this.f21027b).lambda$getNewTask$115((a0.h) this.d, (a0.h) this.f21028c);
                return;
            case 23:
                ((MessagesStorage) this.f21027b).lambda$saveBotCache$130((TLObject) this.d, (String) this.f21028c);
                return;
            case 24:
                ((SavedMessagesController) this.f21027b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f21028c);
                return;
            case 25:
                ((SecretChatHelper) this.f21027b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.d, (TLRPC.EncryptedChat) this.f21028c);
                return;
            case 26:
                ((SendMessagesHelper) this.f21027b).lambda$sendVote$34((String) this.f21028c, (Runnable) this.d);
                return;
            case 27:
                ((SendMessagesHelper) this.f21027b).lambda$performSendDelayedMessage$52((TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f21028c);
                return;
            case 28:
                ((SendMessagesHelper) this.f21027b).lambda$sendMessage$17((TLRPC.TL_error) this.d, (TLRPC.TL_messages_forwardMessages) this.f21028c);
                return;
            default:
                ((TelegramMediaSession) this.f21027b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f21028c);
                return;
        }
    }

    public q8(BaseController baseController, String str, Object obj, int i10) {
        this.f21026a = i10;
        this.f21027b = baseController;
        this.f21028c = str;
        this.d = obj;
    }
}
