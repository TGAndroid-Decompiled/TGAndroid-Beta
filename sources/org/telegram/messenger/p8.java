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
public final class p8 implements Runnable {
    public final int f20937a;
    public final Object f20938b;
    public final Object f20939c;
    public final Object d;

    public p8(Object obj, Object obj2, Object obj3, int i10) {
        this.f20937a = i10;
        this.f20938b = obj;
        this.d = obj2;
        this.f20939c = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20937a) {
            case 0:
                ((MediaDataController) this.f20938b).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, (String) this.f20939c);
                return;
            case 1:
                ((MediaDataController) this.f20938b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.d, (String) this.f20939c);
                return;
            case 2:
                ((MediaDataController) this.f20938b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.d, (TLObject) this.f20939c);
                return;
            case 3:
                ((MediaDataController) this.f20938b).lambda$clearBotKeyboard$194((ArrayList) this.d, (MessagesStorage.TopicKey) this.f20939c);
                return;
            case 4:
                ((MediaDataController) this.f20938b).lambda$findStickerSetByNameInCache$30((String) this.f20939c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MediaDataController) this.f20938b).lambda$processLoadedMedia$135((ArrayList) this.d, (h9) this.f20939c);
                return;
            case 6:
                ((MediaDataController) this.f20938b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.d, (Utilities.Callback) this.f20939c);
                return;
            case 7:
                ((MessagesController) this.f20938b).lambda$requestIsUserContactBlocked$499((TLObject) this.d, (ArrayList) this.f20939c);
                return;
            case 8:
                ((MessagesController) this.f20938b).lambda$addUsersToChat$295((TLRPC.Chat) this.d, (TLRPC.TL_messages_invitedUsers) this.f20939c);
                return;
            case 9:
                ((MessagesController) this.f20938b).lambda$processMessageIDUpdate$377((long[]) this.d, (TL_update.TL_updateMessageID) this.f20939c);
                return;
            case 10:
                ((MessagesController) this.f20938b).lambda$getChannelDifference$343((ArrayList) this.d, (TLRPC.updates_ChannelDifference) this.f20939c);
                return;
            case 11:
                ((MessagesController) this.f20938b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.d, (ob) this.f20939c);
                return;
            case 12:
                ((MessagesController) this.f20938b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.d, (pb) this.f20939c);
                return;
            case 13:
                ((MessagesController) this.f20938b).lambda$getDifference$354((ArrayList) this.d, (TLRPC.updates_Difference) this.f20939c);
                return;
            case 14:
                MessagesController.lambda$openByUserName$463((org.telegram.ui.ActionBar.e2[]) this.f20938b, (boolean[]) this.d, (org.telegram.ui.ActionBar.r2) this.f20939c);
                return;
            case 15:
                ((MessagesController) this.f20938b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.d, (String) this.f20939c);
                return;
            case 16:
                ((MessagesController) this.f20938b).lambda$addUserToChat$308((TLRPC.Updates) this.d, (Runnable) this.f20939c);
                return;
            case 17:
                ((MessagesController) this.f20938b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.d, (LongSparseIntArray) this.f20939c);
                return;
            case 18:
                ((MessagesController) this.f20938b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.x6) this.d, (org.telegram.ui.ActionBar.w6) this.f20939c);
                return;
            case 19:
                ((MessagesController.SavedMusicList) this.f20938b).lambda$load$0((TLObject) this.d, (ArrayList) this.f20939c);
                return;
            case 20:
                ((MessagesStorage) this.f20938b).lambda$applyPhoneBookUpdates$151((String) this.f20939c, (String) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f20938b).lambda$replaceMessageIfExists$235((MessageObject) this.d, (ArrayList) this.f20939c);
                return;
            case 22:
                ((MessagesStorage) this.f20938b).lambda$getNewTask$114((a0.h) this.d, (a0.h) this.f20939c);
                return;
            case 23:
                ((MessagesStorage) this.f20938b).lambda$saveBotCache$129((TLObject) this.d, (String) this.f20939c);
                return;
            case 24:
                ((SavedMessagesController) this.f20938b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f20939c);
                return;
            case 25:
                ((SecretChatHelper) this.f20938b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.d, (TLRPC.EncryptedChat) this.f20939c);
                return;
            case 26:
                ((SendMessagesHelper) this.f20938b).lambda$sendVote$34((String) this.f20939c, (Runnable) this.d);
                return;
            case 27:
                ((SendMessagesHelper) this.f20938b).lambda$performSendDelayedMessage$52((TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f20939c);
                return;
            case 28:
                ((SendMessagesHelper) this.f20938b).lambda$sendMessage$17((TLRPC.TL_error) this.d, (TLRPC.TL_messages_forwardMessages) this.f20939c);
                return;
            default:
                ((TelegramMediaSession) this.f20938b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f20939c);
                return;
        }
    }

    public p8(BaseController baseController, String str, Object obj, int i10) {
        this.f20937a = i10;
        this.f20938b = baseController;
        this.f20939c = str;
        this.d = obj;
    }
}
