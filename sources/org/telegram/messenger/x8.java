package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f22107a;
    public final Object f22108b;
    public final Object f22109c;
    public final Object d;

    public x8(int i9, Object obj, Object obj2, String str) {
        this.f22107a = i9;
        this.f22108b = obj;
        this.d = obj2;
        this.f22109c = str;
    }

    @Override
    public final void run() {
        switch (this.f22107a) {
            case 0:
                ((MediaDataController) this.f22108b).lambda$findStickerSetByNameInCache$30((String) this.f22109c, (Utilities.Callback) this.d);
                return;
            case 1:
                ((MediaDataController) this.f22108b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f22109c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f22108b).lambda$processLoadedMedia$135((ArrayList) this.f22109c, (x6) this.d);
                return;
            case 3:
                ((MediaDataController) this.f22108b).lambda$saveToRingtones$203((TLObject) this.f22109c, (TLRPC.Document) this.d);
                return;
            case 4:
                ((MediaDataController) this.f22108b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f22109c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MessagesController) this.f22108b).lambda$requestIsUserContactBlocked$494((TLObject) this.f22109c, (ArrayList) this.d);
                return;
            case 6:
                ((MessagesController) this.f22108b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f22109c, (ya) this.d);
                return;
            case 7:
                ((MessagesController) this.f22108b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f22109c, (za) this.d);
                return;
            case 8:
                ((MessagesController) this.f22108b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.d, (String) this.f22109c);
                return;
            case 9:
                ((MessagesController) this.f22108b).lambda$addUsersToChat$296((TLRPC.Chat) this.f22109c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 10:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.c2[]) this.f22108b, (boolean[]) this.f22109c, (org.telegram.ui.ActionBar.o2) this.d);
                return;
            case 11:
                ((MessagesController) this.f22108b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.e6) this.f22109c, (org.telegram.ui.ActionBar.d6) this.d);
                return;
            case 12:
                ((MessagesController) this.f22108b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f22109c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f22108b).lambda$getDifference$353((ArrayList) this.f22109c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f22108b).lambda$getChannelDifference$342((ArrayList) this.f22109c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 15:
                ((MessagesController.SavedMusicList) this.f22108b).lambda$load$0((TLObject) this.f22109c, (ArrayList) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f22108b).lambda$saveBotCache$126((TLObject) this.d, (String) this.f22109c);
                return;
            case 17:
                ((MessagesStorage) this.f22108b).lambda$applyPhoneBookUpdates$148((String) this.f22109c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f22108b).lambda$replaceMessageIfExists$232((MessageObject) this.f22109c, (ArrayList) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f22108b).lambda$getNewTask$111((a0.h) this.f22109c, (a0.h) this.d);
                return;
            case 20:
                ((SavedMessagesController) this.f22108b).lambda$saveCache$11((MessagesStorage) this.f22109c, (ArrayList) this.d);
                return;
            case 21:
                ((SecretChatHelper) this.f22108b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f22109c, (TLRPC.EncryptedChat) this.d);
                return;
            case 22:
                ((SendMessagesHelper) this.f22108b).lambda$sendVote$31((String) this.f22109c, (Runnable) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f22108b).lambda$performSendDelayedMessage$49((TLObject) this.f22109c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f22108b).lambda$sendMessage$14((TLRPC.TL_error) this.f22109c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 25:
                ((TelegramMediaSession) this.f22108b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f22109c);
                return;
            case 26:
                ((TranslateController) this.f22108b).lambda$checkDialogMessageSure$10((ArrayList) this.f22109c, (ArrayList) this.d);
                return;
            case 27:
                Utilities.lambda$raceCallbacks$1((int[]) this.f22108b, (Utilities.Callback[]) this.f22109c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f22109c, (String) this.f22108b, (byte[]) this.d);
                return;
        }
    }

    public x8(Object obj, Object obj2, Object obj3, int i9) {
        this.f22107a = i9;
        this.f22108b = obj;
        this.f22109c = obj2;
        this.d = obj3;
    }

    public x8(String str, String str2, byte[] bArr) {
        this.f22107a = 28;
        this.f22109c = str;
        this.f22108b = str2;
        this.d = bArr;
    }
}
