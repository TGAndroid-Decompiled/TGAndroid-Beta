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
public final class g9 implements Runnable {
    public final int f15256a;
    public final Object f15257b;
    public final Object f15258c;
    public final Object d;

    public g9(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f15256a = i10;
        this.f15257b = obj;
        this.d = obj2;
        this.f15258c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15256a) {
            case 0:
                ((MediaDataController) this.f15257b).lambda$clearBotKeyboard$193((ArrayList) this.f15258c, (MessagesStorage.TopicKey) this.d);
                return;
            case 1:
                ((MediaDataController) this.f15257b).lambda$findStickerSetByNameInCache$30((String) this.f15258c, (Utilities.Callback) this.d);
                return;
            case 2:
                ((MediaDataController) this.f15257b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f15258c, (TLObject) this.d);
                return;
            case 3:
                ((MediaDataController) this.f15257b).lambda$processLoadedMedia$135((ArrayList) this.f15258c, (e7) this.d);
                return;
            case 4:
                ((MediaDataController) this.f15257b).lambda$saveToRingtones$203((TLObject) this.f15258c, (TLRPC.Document) this.d);
                return;
            case 5:
                ((MediaDataController) this.f15257b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f15258c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f15257b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.f15258c);
                return;
            case 7:
                ((MessagesController) this.f15257b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f15258c, (jb) this.d);
                return;
            case 8:
                ((MessagesController) this.f15257b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f15258c, (kb) this.d);
                return;
            case 9:
                ((MessagesController) this.f15257b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f15258c, (String) this.d);
                return;
            case 10:
                ((MessagesController) this.f15257b).lambda$addUsersToChat$296((TLRPC.Chat) this.f15258c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 11:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.d2[]) this.f15257b, (boolean[]) this.f15258c, (org.telegram.ui.ActionBar.p2) this.d);
                return;
            case 12:
                ((MessagesController) this.f15257b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.f15258c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 13:
                ((MessagesController) this.f15257b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f15258c, (LongSparseIntArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f15257b).lambda$getDifference$353((ArrayList) this.f15258c, (TLRPC.updates_Difference) this.d);
                return;
            case 15:
                ((MessagesController) this.f15257b).lambda$getChannelDifference$342((ArrayList) this.f15258c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController.SavedMusicList) this.f15257b).lambda$load$0((TLObject) this.d, (ArrayList) this.f15258c);
                return;
            case 17:
                ((MessagesStorage) this.f15257b).lambda$saveBotCache$126((TLObject) this.f15258c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f15257b).lambda$applyPhoneBookUpdates$148((String) this.f15258c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f15257b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f15258c);
                return;
            case 20:
                ((MessagesStorage) this.f15257b).lambda$getNewTask$111((a0.i) this.f15258c, (a0.i) this.d);
                return;
            case 21:
                ((SavedMessagesController) this.f15257b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f15258c);
                return;
            case 22:
                ((SecretChatHelper) this.f15257b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f15258c, (TLRPC.EncryptedChat) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f15257b).lambda$sendVote$31((String) this.f15258c, (Runnable) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f15257b).lambda$performSendDelayedMessage$49((TLObject) this.f15258c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f15257b).lambda$sendMessage$14((TLRPC.TL_error) this.f15258c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 26:
                ((TelegramMediaSession) this.f15257b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f15258c, (String) this.d);
                return;
            case 27:
                ((TranslateController) this.f15257b).lambda$checkDialogMessageSure$10((ArrayList) this.f15258c, (ArrayList) this.d);
                return;
            case 28:
                Utilities.lambda$raceCallbacks$1((int[]) this.f15257b, (Utilities.Callback[]) this.f15258c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f15257b, (String) this.f15258c, (byte[]) this.d);
                return;
        }
    }

    public g9(Object obj, Object obj2, Object obj3, int i10) {
        this.f15256a = i10;
        this.f15257b = obj;
        this.f15258c = obj2;
        this.d = obj3;
    }
}
