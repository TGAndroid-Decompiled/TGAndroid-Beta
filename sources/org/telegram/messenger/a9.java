package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a9 implements Runnable {

    public final int f19687a;

    public final Object f19688b;

    public final Object f19689c;
    public final Object d;

    public a9(Object obj, Object obj2, Object obj3, int i10) {
        this.f19687a = i10;
        this.f19688b = obj;
        this.f19689c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f19687a) {
            case 0:
                ((MediaDataController) this.f19688b).lambda$findStickerSetByNameInCache$30((String) this.f19689c, (Utilities.Callback) this.d);
                break;
            case 1:
                ((MediaDataController) this.f19688b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f19689c, (TLObject) this.d);
                break;
            case 2:
                ((MediaDataController) this.f19688b).lambda$processLoadedMedia$135((ArrayList) this.f19689c, (z6) this.d);
                break;
            case 3:
                ((MediaDataController) this.f19688b).lambda$saveToRingtones$203((TLObject) this.f19689c, (TLRPC.Document) this.d);
                break;
            case 4:
                ((MediaDataController) this.f19688b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f19689c, (Utilities.Callback) this.d);
                break;
            case 5:
                ((MessagesController) this.f19688b).lambda$requestIsUserContactBlocked$494((TLObject) this.f19689c, (ArrayList) this.d);
                break;
            case 6:
                ((MessagesController) this.f19688b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f19689c, (cb) this.d);
                break;
            case 7:
                ((MessagesController) this.f19688b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f19689c, (db) this.d);
                break;
            case 8:
                ((MessagesController) this.f19688b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.d, (String) this.f19689c);
                break;
            case 9:
                ((MessagesController) this.f19688b).lambda$addUsersToChat$296((TLRPC.Chat) this.f19689c, (TLRPC.TL_messages_invitedUsers) this.d);
                break;
            case 10:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.b2[]) this.f19688b, (boolean[]) this.f19689c, (org.telegram.ui.ActionBar.n2) this.d);
                break;
            case 11:
                ((MessagesController) this.f19688b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.f6) this.f19689c, (org.telegram.ui.ActionBar.e6) this.d);
                break;
            case 12:
                ((MessagesController) this.f19688b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f19689c, (LongSparseIntArray) this.d);
                break;
            case 13:
                ((MessagesController) this.f19688b).lambda$getDifference$353((ArrayList) this.f19689c, (TLRPC.updates_Difference) this.d);
                break;
            case 14:
                ((MessagesController) this.f19688b).lambda$getChannelDifference$342((ArrayList) this.f19689c, (TLRPC.updates_ChannelDifference) this.d);
                break;
            case 15:
                ((MessagesController.SavedMusicList) this.f19688b).lambda$load$0((TLObject) this.f19689c, (ArrayList) this.d);
                break;
            case 16:
                ((MessagesStorage) this.f19688b).lambda$saveBotCache$126((TLObject) this.d, (String) this.f19689c);
                break;
            case 17:
                ((MessagesStorage) this.f19688b).lambda$applyPhoneBookUpdates$148((String) this.f19689c, (String) this.d);
                break;
            case 18:
                ((MessagesStorage) this.f19688b).lambda$replaceMessageIfExists$232((MessageObject) this.f19689c, (ArrayList) this.d);
                break;
            case 19:
                ((MessagesStorage) this.f19688b).lambda$getNewTask$111((a0.h) this.f19689c, (a0.h) this.d);
                break;
            case 20:
                ((SavedMessagesController) this.f19688b).lambda$saveCache$11((MessagesStorage) this.f19689c, (ArrayList) this.d);
                break;
            case 21:
                ((SecretChatHelper) this.f19688b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f19689c, (TLRPC.EncryptedChat) this.d);
                break;
            case 22:
                ((SendMessagesHelper) this.f19688b).lambda$sendVote$31((String) this.f19689c, (Runnable) this.d);
                break;
            case 23:
                ((SendMessagesHelper) this.f19688b).lambda$performSendDelayedMessage$49((TLObject) this.f19689c, (SendMessagesHelper.DelayedMessage) this.d);
                break;
            case 24:
                ((SendMessagesHelper) this.f19688b).lambda$sendMessage$14((TLRPC.TL_error) this.f19689c, (TLRPC.TL_messages_forwardMessages) this.d);
                break;
            case 25:
                ((TelegramMediaSession) this.f19688b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f19689c);
                break;
            case 26:
                ((TranslateController) this.f19688b).lambda$checkDialogMessageSure$10((ArrayList) this.f19689c, (ArrayList) this.d);
                break;
            case 27:
                Utilities.lambda$raceCallbacks$1((int[]) this.f19688b, (Utilities.Callback[]) this.f19689c, (Runnable) this.d);
                break;
            default:
                WearAuthListenerService.lambda$onMessageReceived$0((String) this.f19689c, (String) this.f19688b, (byte[]) this.d);
                break;
        }
    }

    public a9(Object obj, Object obj2, String str, int i10) {
        this.f19687a = i10;
        this.f19688b = obj;
        this.d = obj2;
        this.f19689c = str;
    }

    public a9(String str, String str2, byte[] bArr) {
        this.f19687a = 28;
        this.f19689c = str;
        this.f19688b = str2;
        this.d = bArr;
    }
}
