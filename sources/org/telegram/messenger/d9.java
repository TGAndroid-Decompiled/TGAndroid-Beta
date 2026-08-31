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
public final class d9 implements Runnable {
    public final int f18474a;
    public final Object f18475b;
    public final Object f18476c;
    public final Object d;

    public d9(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f18474a = i10;
        this.f18475b = obj;
        this.d = obj2;
        this.f18476c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18474a) {
            case 0:
                ((MediaDataController) this.f18475b).lambda$clearBotKeyboard$193((ArrayList) this.f18476c, (MessagesStorage.TopicKey) this.d);
                return;
            case 1:
                ((MediaDataController) this.f18475b).lambda$findStickerSetByNameInCache$30((String) this.f18476c, (Utilities.Callback) this.d);
                return;
            case 2:
                ((MediaDataController) this.f18475b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f18476c, (TLObject) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18475b).lambda$processLoadedMedia$135((ArrayList) this.f18476c, (c7) this.d);
                return;
            case 4:
                ((MediaDataController) this.f18475b).lambda$saveToRingtones$203((TLObject) this.f18476c, (TLRPC.Document) this.d);
                return;
            case 5:
                ((MediaDataController) this.f18475b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f18476c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f18475b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.f18476c);
                return;
            case 7:
                ((MessagesController) this.f18475b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f18476c, (fb) this.d);
                return;
            case 8:
                ((MessagesController) this.f18475b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f18476c, (gb) this.d);
                return;
            case 9:
                ((MessagesController) this.f18475b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f18476c, (String) this.d);
                return;
            case 10:
                ((MessagesController) this.f18475b).lambda$addUsersToChat$296((TLRPC.Chat) this.f18476c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 11:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.d2[]) this.f18475b, (boolean[]) this.f18476c, (org.telegram.ui.ActionBar.p2) this.d);
                return;
            case 12:
                ((MessagesController) this.f18475b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.j6) this.f18476c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 13:
                ((MessagesController) this.f18475b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f18476c, (LongSparseIntArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f18475b).lambda$getDifference$353((ArrayList) this.f18476c, (TLRPC.updates_Difference) this.d);
                return;
            case 15:
                ((MessagesController) this.f18475b).lambda$getChannelDifference$342((ArrayList) this.f18476c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController.SavedMusicList) this.f18475b).lambda$load$0((TLObject) this.d, (ArrayList) this.f18476c);
                return;
            case 17:
                ((MessagesStorage) this.f18475b).lambda$saveBotCache$126((TLObject) this.f18476c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18475b).lambda$applyPhoneBookUpdates$148((String) this.f18476c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f18475b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f18476c);
                return;
            case 20:
                ((MessagesStorage) this.f18475b).lambda$getNewTask$111((a0.h) this.f18476c, (a0.h) this.d);
                return;
            case 21:
                ((SavedMessagesController) this.f18475b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f18476c);
                return;
            case 22:
                ((SecretChatHelper) this.f18475b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f18476c, (TLRPC.EncryptedChat) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f18475b).lambda$sendVote$31((String) this.f18476c, (Runnable) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f18475b).lambda$performSendDelayedMessage$49((TLObject) this.f18476c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f18475b).lambda$sendMessage$14((TLRPC.TL_error) this.f18476c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 26:
                ((TelegramMediaSession) this.f18475b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f18476c, (String) this.d);
                return;
            case 27:
                ((TranslateController) this.f18475b).lambda$checkDialogMessageSure$10((ArrayList) this.f18476c, (ArrayList) this.d);
                return;
            case 28:
                Utilities.lambda$raceCallbacks$1((int[]) this.f18475b, (Utilities.Callback[]) this.f18476c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f18475b, (String) this.f18476c, (byte[]) this.d);
                return;
        }
    }

    public d9(Object obj, Object obj2, Object obj3, int i10) {
        this.f18474a = i10;
        this.f18475b = obj;
        this.f18476c = obj2;
        this.d = obj3;
    }
}
