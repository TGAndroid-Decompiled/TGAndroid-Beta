package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final int f17044a;
    public final Object f17045b;
    public final Object f17046c;
    public final Object d;

    public d9(int i10, Object obj, Object obj2, String str) {
        this.f17044a = i10;
        this.f17045b = obj;
        this.d = obj2;
        this.f17046c = str;
    }

    @Override
    public final void run() {
        switch (this.f17044a) {
            case 0:
                ((MediaDataController) this.f17045b).lambda$findStickerSetByNameInCache$30((String) this.f17046c, (Utilities.Callback) this.d);
                return;
            case 1:
                ((MediaDataController) this.f17045b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f17046c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f17045b).lambda$processLoadedMedia$135((ArrayList) this.f17046c, (c7) this.d);
                return;
            case 3:
                ((MediaDataController) this.f17045b).lambda$saveToRingtones$203((TLObject) this.f17046c, (TLRPC.Document) this.d);
                return;
            case 4:
                ((MediaDataController) this.f17045b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f17046c, (Utilities.Callback) this.d);
                return;
            case 5:
                ((MessagesController) this.f17045b).lambda$requestIsUserContactBlocked$494((TLObject) this.f17046c, (ArrayList) this.d);
                return;
            case 6:
                ((MessagesController) this.f17045b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f17046c, (fb) this.d);
                return;
            case 7:
                ((MessagesController) this.f17045b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f17046c, (gb) this.d);
                return;
            case 8:
                ((MessagesController) this.f17045b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.d, (String) this.f17046c);
                return;
            case 9:
                ((MessagesController) this.f17045b).lambda$addUsersToChat$296((TLRPC.Chat) this.f17046c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 10:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.d2[]) this.f17045b, (boolean[]) this.f17046c, (org.telegram.ui.ActionBar.p2) this.d);
                return;
            case 11:
                ((MessagesController) this.f17045b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.f17046c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 12:
                ((MessagesController) this.f17045b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f17046c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f17045b).lambda$getDifference$353((ArrayList) this.f17046c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f17045b).lambda$getChannelDifference$342((ArrayList) this.f17046c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 15:
                ((MessagesController.SavedMusicList) this.f17045b).lambda$load$0((TLObject) this.f17046c, (ArrayList) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f17045b).lambda$saveBotCache$126((TLObject) this.d, (String) this.f17046c);
                return;
            case 17:
                ((MessagesStorage) this.f17045b).lambda$applyPhoneBookUpdates$148((String) this.f17046c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f17045b).lambda$replaceMessageIfExists$232((MessageObject) this.f17046c, (ArrayList) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f17045b).lambda$getNewTask$111((a0.h) this.f17046c, (a0.h) this.d);
                return;
            case 20:
                ((SavedMessagesController) this.f17045b).lambda$saveCache$11((MessagesStorage) this.f17046c, (ArrayList) this.d);
                return;
            case 21:
                ((SecretChatHelper) this.f17045b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f17046c, (TLRPC.EncryptedChat) this.d);
                return;
            case 22:
                ((SendMessagesHelper) this.f17045b).lambda$sendVote$31((String) this.f17046c, (Runnable) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f17045b).lambda$performSendDelayedMessage$49((TLObject) this.f17046c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f17045b).lambda$sendMessage$14((TLRPC.TL_error) this.f17046c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 25:
                ((TelegramMediaSession) this.f17045b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f17046c);
                return;
            case 26:
                ((TranslateController) this.f17045b).lambda$checkDialogMessageSure$10((ArrayList) this.f17046c, (ArrayList) this.d);
                return;
            case 27:
                Utilities.lambda$raceCallbacks$1((int[]) this.f17045b, (Utilities.Callback[]) this.f17046c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f17046c, (String) this.f17045b, (byte[]) this.d);
                return;
        }
    }

    public d9(Object obj, Object obj2, Object obj3, int i10) {
        this.f17044a = i10;
        this.f17045b = obj;
        this.f17046c = obj2;
        this.d = obj3;
    }

    public d9(String str, String str2, byte[] bArr) {
        this.f17044a = 28;
        this.f17046c = str;
        this.f17045b = str2;
        this.d = bArr;
    }
}
