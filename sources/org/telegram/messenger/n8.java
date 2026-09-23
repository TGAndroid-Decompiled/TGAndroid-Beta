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
public final class n8 implements Runnable {
    public final int f16817a;
    public final Object f16818b;
    public final Object f16819c;
    public final Object d;

    public n8(Object obj, Object obj2, Object obj3, int i10) {
        this.f16817a = i10;
        this.f16818b = obj;
        this.f16819c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16817a) {
            case 0:
                ((MediaDataController) this.f16818b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f16819c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f16818b).lambda$clearBotKeyboard$193((ArrayList) this.f16819c, (MessagesStorage.TopicKey) this.d);
                return;
            case 2:
                ((MediaDataController) this.f16818b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f16819c);
                return;
            case 3:
                ((MediaDataController) this.f16818b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f16819c, (TLObject) this.d);
                return;
            case 4:
                ((MediaDataController) this.f16818b).lambda$processLoadedMedia$135((ArrayList) this.f16819c, (y6) this.d);
                return;
            case 5:
                ((MediaDataController) this.f16818b).lambda$saveToRingtones$203((TLObject) this.f16819c, (TLRPC.Document) this.d);
                return;
            case 6:
                ((MediaDataController) this.f16818b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f16819c, (Utilities.Callback) this.d);
                return;
            case 7:
                ((MessagesController) this.f16818b).lambda$requestIsUserContactBlocked$494((TLObject) this.f16819c, (ArrayList) this.d);
                return;
            case 8:
                ((MessagesController) this.f16818b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f16819c, (cb) this.d);
                return;
            case 9:
                ((MessagesController) this.f16818b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f16819c, (db) this.d);
                return;
            case 10:
                ((MessagesController) this.f16818b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f16819c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f16818b).lambda$addUsersToChat$296((TLRPC.Chat) this.f16819c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 12:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.b2[]) this.f16818b, (boolean[]) this.f16819c, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 13:
                ((MessagesController) this.f16818b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.g6) this.f16819c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 14:
                ((MessagesController) this.f16818b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f16819c, (LongSparseIntArray) this.d);
                return;
            case 15:
                ((MessagesController) this.f16818b).lambda$getDifference$353((ArrayList) this.f16819c, (TLRPC.updates_Difference) this.d);
                return;
            case 16:
                ((MessagesController) this.f16818b).lambda$getChannelDifference$342((ArrayList) this.f16819c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f16818b).lambda$load$0((TLObject) this.f16819c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f16818b).lambda$saveBotCache$126((TLObject) this.f16819c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f16818b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f16819c);
                return;
            case 20:
                ((MessagesStorage) this.f16818b).lambda$replaceMessageIfExists$232((MessageObject) this.f16819c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f16818b).lambda$getNewTask$111((a0.i) this.f16819c, (a0.i) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f16818b).lambda$saveCache$11((MessagesStorage) this.f16819c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f16818b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f16819c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f16818b).lambda$sendVote$31((String) this.d, (Runnable) this.f16819c);
                return;
            case 25:
                ((SendMessagesHelper) this.f16818b).lambda$performSendDelayedMessage$49((TLObject) this.f16819c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f16818b).lambda$sendMessage$14((TLRPC.TL_error) this.f16819c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f16818b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f16819c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f16818b).lambda$checkDialogMessageSure$10((ArrayList) this.f16819c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f16818b, (Utilities.Callback[]) this.f16819c, (Runnable) this.d);
                return;
        }
    }

    public n8(BaseController baseController, String str, Object obj, int i10) {
        this.f16817a = i10;
        this.f16818b = baseController;
        this.d = str;
        this.f16819c = obj;
    }
}
