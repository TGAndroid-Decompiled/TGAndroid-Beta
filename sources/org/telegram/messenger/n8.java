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
    public final int f17061a;
    public final Object f17062b;
    public final Object f17063c;
    public final Object d;

    public n8(Object obj, Object obj2, Object obj3, int i10) {
        this.f17061a = i10;
        this.f17062b = obj;
        this.f17063c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17061a) {
            case 0:
                ((MediaDataController) this.f17062b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f17063c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f17062b).lambda$clearBotKeyboard$193((ArrayList) this.f17063c, (MessagesStorage.TopicKey) this.d);
                return;
            case 2:
                ((MediaDataController) this.f17062b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f17063c);
                return;
            case 3:
                ((MediaDataController) this.f17062b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f17063c, (TLObject) this.d);
                return;
            case 4:
                ((MediaDataController) this.f17062b).lambda$processLoadedMedia$135((ArrayList) this.f17063c, (y6) this.d);
                return;
            case 5:
                ((MediaDataController) this.f17062b).lambda$saveToRingtones$203((TLObject) this.f17063c, (TLRPC.Document) this.d);
                return;
            case 6:
                ((MediaDataController) this.f17062b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f17063c, (Utilities.Callback) this.d);
                return;
            case 7:
                ((MessagesController) this.f17062b).lambda$requestIsUserContactBlocked$494((TLObject) this.f17063c, (ArrayList) this.d);
                return;
            case 8:
                ((MessagesController) this.f17062b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f17063c, (cb) this.d);
                return;
            case 9:
                ((MessagesController) this.f17062b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f17063c, (db) this.d);
                return;
            case 10:
                ((MessagesController) this.f17062b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f17063c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f17062b).lambda$addUsersToChat$296((TLRPC.Chat) this.f17063c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 12:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.a2[]) this.f17062b, (boolean[]) this.f17063c, (org.telegram.ui.ActionBar.m2) this.d);
                return;
            case 13:
                ((MessagesController) this.f17062b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.g6) this.f17063c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 14:
                ((MessagesController) this.f17062b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f17063c, (LongSparseIntArray) this.d);
                return;
            case 15:
                ((MessagesController) this.f17062b).lambda$getDifference$353((ArrayList) this.f17063c, (TLRPC.updates_Difference) this.d);
                return;
            case 16:
                ((MessagesController) this.f17062b).lambda$getChannelDifference$342((ArrayList) this.f17063c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f17062b).lambda$load$0((TLObject) this.f17063c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f17062b).lambda$saveBotCache$126((TLObject) this.f17063c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f17062b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f17063c);
                return;
            case 20:
                ((MessagesStorage) this.f17062b).lambda$replaceMessageIfExists$232((MessageObject) this.f17063c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f17062b).lambda$getNewTask$111((a0.i) this.f17063c, (a0.i) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f17062b).lambda$saveCache$11((MessagesStorage) this.f17063c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f17062b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f17063c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f17062b).lambda$sendVote$31((String) this.d, (Runnable) this.f17063c);
                return;
            case 25:
                ((SendMessagesHelper) this.f17062b).lambda$performSendDelayedMessage$49((TLObject) this.f17063c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f17062b).lambda$sendMessage$14((TLRPC.TL_error) this.f17063c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f17062b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f17063c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f17062b).lambda$checkDialogMessageSure$10((ArrayList) this.f17063c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f17062b, (Utilities.Callback[]) this.f17063c, (Runnable) this.d);
                return;
        }
    }

    public n8(BaseController baseController, String str, Object obj, int i10) {
        this.f17061a = i10;
        this.f17062b = baseController;
        this.d = str;
        this.f17063c = obj;
    }
}
