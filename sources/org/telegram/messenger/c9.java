package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c9 implements Runnable {
    public final int f19886a;
    public final Object f19887b;
    public final Object f19888c;
    public final Object d;

    public c9(int i10, Object obj, Object obj2, String str) {
        this.f19886a = i10;
        this.f19887b = obj;
        this.d = obj2;
        this.f19888c = str;
    }

    @Override
    public final void run() {
        switch (this.f19886a) {
            case 0:
                ((MediaDataController) this.f19887b).lambda$findStickerSetByNameInCache$30((String) this.f19888c, (Utilities.Callback) this.d);
                return;
            case 1:
                ((MediaDataController) this.f19887b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f19888c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19887b).lambda$processLoadedMedia$135((ArrayList) this.f19888c, (b7) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19887b).lambda$saveToRingtones$203((TLObject) this.f19888c, (TLRPC.Document) this.d);
                return;
            case 4:
                ((MediaDataController) this.f19887b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f19888c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MessagesController) this.f19887b).lambda$requestIsUserContactBlocked$494((TLObject) this.f19888c, (ArrayList) this.d);
                return;
            case 6:
                ((MessagesController) this.f19887b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f19888c, (eb) this.d);
                return;
            case 7:
                ((MessagesController) this.f19887b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f19888c, (fb) this.d);
                return;
            case 8:
                ((MessagesController) this.f19887b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.d, (String) this.f19888c);
                return;
            case 9:
                ((MessagesController) this.f19887b).lambda$addUsersToChat$296((TLRPC.Chat) this.f19888c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 10:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.c2[]) this.f19887b, (boolean[]) this.f19888c, (org.telegram.ui.ActionBar.o2) this.d);
                return;
            case 11:
                ((MessagesController) this.f19887b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.f6) this.f19888c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 12:
                ((MessagesController) this.f19887b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f19888c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f19887b).lambda$getDifference$353((ArrayList) this.f19888c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f19887b).lambda$getChannelDifference$342((ArrayList) this.f19888c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 15:
                ((MessagesController.SavedMusicList) this.f19887b).lambda$load$0((TLObject) this.f19888c, (ArrayList) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f19887b).lambda$saveBotCache$126((TLObject) this.d, (String) this.f19888c);
                return;
            case 17:
                ((MessagesStorage) this.f19887b).lambda$applyPhoneBookUpdates$148((String) this.f19888c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f19887b).lambda$replaceMessageIfExists$232((MessageObject) this.f19888c, (ArrayList) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f19887b).lambda$getNewTask$111((a0.h) this.f19888c, (a0.h) this.d);
                return;
            case 20:
                ((SavedMessagesController) this.f19887b).lambda$saveCache$11((MessagesStorage) this.f19888c, (ArrayList) this.d);
                return;
            case 21:
                ((SecretChatHelper) this.f19887b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f19888c, (TLRPC.EncryptedChat) this.d);
                return;
            case 22:
                ((SendMessagesHelper) this.f19887b).lambda$sendVote$31((String) this.f19888c, (Runnable) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f19887b).lambda$performSendDelayedMessage$49((TLObject) this.f19888c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f19887b).lambda$sendMessage$14((TLRPC.TL_error) this.f19888c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 25:
                ((TelegramMediaSession) this.f19887b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f19888c);
                return;
            case 26:
                ((TranslateController) this.f19887b).lambda$checkDialogMessageSure$10((ArrayList) this.f19888c, (ArrayList) this.d);
                return;
            case 27:
                Utilities.lambda$raceCallbacks$1((int[]) this.f19887b, (Utilities.Callback[]) this.f19888c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19888c, (String) this.f19887b, (byte[]) this.d);
                return;
        }
    }

    public c9(Object obj, Object obj2, Object obj3, int i10) {
        this.f19886a = i10;
        this.f19887b = obj;
        this.f19888c = obj2;
        this.d = obj3;
    }

    public c9(String str, String str2, byte[] bArr) {
        this.f19886a = 28;
        this.f19888c = str;
        this.f19887b = str2;
        this.d = bArr;
    }
}
