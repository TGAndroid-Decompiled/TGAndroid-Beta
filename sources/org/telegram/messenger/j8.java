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
public final class j8 implements Runnable {
    public final int f16716a;
    public final Object f16717b;
    public final Object f16718c;
    public final Object d;

    public j8(Object obj, Object obj2, Object obj3, int i10) {
        this.f16716a = i10;
        this.f16717b = obj;
        this.d = obj2;
        this.f16718c = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16716a) {
            case 0:
                ((MediaDataController) this.f16717b).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, (String) this.f16718c);
                return;
            case 1:
                ((MediaDataController) this.f16717b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.d, (String) this.f16718c);
                return;
            case 2:
                ((MediaDataController) this.f16717b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.d, (TLObject) this.f16718c);
                return;
            case 3:
                ((MediaDataController) this.f16717b).lambda$clearBotKeyboard$194((ArrayList) this.d, (MessagesStorage.TopicKey) this.f16718c);
                return;
            case 4:
                ((MediaDataController) this.f16717b).lambda$findStickerSetByNameInCache$30((String) this.f16718c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MediaDataController) this.f16717b).lambda$processLoadedMedia$135((ArrayList) this.d, (b9) this.f16718c);
                return;
            case 6:
                ((MediaDataController) this.f16717b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.d, (Utilities.Callback) this.f16718c);
                return;
            case 7:
                ((MessagesController) this.f16717b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.f16718c);
                return;
            case 8:
                ((MessagesController) this.f16717b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.d, (cb) this.f16718c);
                return;
            case 9:
                ((MessagesController) this.f16717b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.d, (db) this.f16718c);
                return;
            case 10:
                ((MessagesController) this.f16717b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.d, (String) this.f16718c);
                return;
            case 11:
                ((MessagesController) this.f16717b).lambda$addUsersToChat$296((TLRPC.Chat) this.d, (TLRPC.TL_messages_invitedUsers) this.f16718c);
                return;
            case 12:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.a2[]) this.f16717b, (boolean[]) this.d, (org.telegram.ui.ActionBar.m2) this.f16718c);
                return;
            case 13:
                ((MessagesController) this.f16717b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.g6) this.d, (org.telegram.ui.ActionBar.f6) this.f16718c);
                return;
            case 14:
                ((MessagesController) this.f16717b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.d, (LongSparseIntArray) this.f16718c);
                return;
            case 15:
                ((MessagesController) this.f16717b).lambda$getDifference$353((ArrayList) this.d, (TLRPC.updates_Difference) this.f16718c);
                return;
            case 16:
                ((MessagesController) this.f16717b).lambda$getChannelDifference$342((ArrayList) this.d, (TLRPC.updates_ChannelDifference) this.f16718c);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f16717b).lambda$load$0((TLObject) this.d, (ArrayList) this.f16718c);
                return;
            case 18:
                ((MessagesStorage) this.f16717b).lambda$saveBotCache$126((TLObject) this.d, (String) this.f16718c);
                return;
            case 19:
                ((MessagesStorage) this.f16717b).lambda$applyPhoneBookUpdates$148((String) this.f16718c, (String) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f16717b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f16718c);
                return;
            case 21:
                ((MessagesStorage) this.f16717b).lambda$getNewTask$111((a0.i) this.d, (a0.i) this.f16718c);
                return;
            case 22:
                ((SavedMessagesController) this.f16717b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f16718c);
                return;
            case 23:
                ((SecretChatHelper) this.f16717b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.d, (TLRPC.EncryptedChat) this.f16718c);
                return;
            case 24:
                ((SendMessagesHelper) this.f16717b).lambda$sendVote$31((String) this.f16718c, (Runnable) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f16717b).lambda$performSendDelayedMessage$49((TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f16718c);
                return;
            case 26:
                ((SendMessagesHelper) this.f16717b).lambda$sendMessage$14((TLRPC.TL_error) this.d, (TLRPC.TL_messages_forwardMessages) this.f16718c);
                return;
            case 27:
                ((TelegramMediaSession) this.f16717b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f16718c);
                return;
            case 28:
                ((TranslateController) this.f16717b).lambda$checkDialogMessageSure$10((ArrayList) this.d, (ArrayList) this.f16718c);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f16717b, (Utilities.Callback[]) this.d, (Runnable) this.f16718c);
                return;
        }
    }

    public j8(BaseController baseController, String str, Object obj, int i10) {
        this.f16716a = i10;
        this.f16717b = baseController;
        this.f16718c = str;
        this.d = obj;
    }
}
