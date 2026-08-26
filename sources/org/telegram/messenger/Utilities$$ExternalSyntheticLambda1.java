package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class Utilities$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public Utilities$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                Utilities.lambda$raceCallbacks$1((int[]) this.f$0, (Utilities.Callback[]) this.f$1, (Runnable) this.f$2);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$findStickerSetByNameInCache$30((String) this.f$1, (Utilities.Callback) this.f$2);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$processLoadedMedia$135((ArrayList) this.f$1, (MediaDataController$$ExternalSyntheticLambda54) this.f$2);
                break;
            case 4:
                ((MediaDataController) this.f$0).lambda$saveToRingtones$203((TLObject) this.f$1, (TLRPC.Document) this.f$2);
                break;
            case 5:
                ((MediaDataController) this.f$0).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f$1, (Utilities.Callback) this.f$2);
                break;
            case 6:
                ((MessagesController) this.f$0).lambda$requestIsUserContactBlocked$494((TLObject) this.f$1, (ArrayList) this.f$2);
                break;
            case 7:
                ((MessagesController) this.f$0).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f$1, (MessagesController$$ExternalSyntheticLambda214) this.f$2);
                break;
            case 8:
                ((MessagesController) this.f$0).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f$1, (MessagesController$$ExternalSyntheticLambda216) this.f$2);
                break;
            case 9:
                ((MessagesController) this.f$0).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f$1, (String) this.f$2);
                break;
            case 10:
                ((MessagesController) this.f$0).lambda$addUsersToChat$296((TLRPC.Chat) this.f$1, (TLRPC.TL_messages_invitedUsers) this.f$2);
                break;
            case 11:
                MessagesController.lambda$openByUserName$458((AlertDialog[]) this.f$0, (boolean[]) this.f$1, (BaseFragment) this.f$2);
                break;
            case 12:
                ((MessagesController) this.f$0).lambda$didReceivedNotification$50((Theme.ThemeInfo) this.f$1, (Theme.ThemeAccent) this.f$2);
                break;
            case 13:
                ((MessagesController) this.f$0).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f$1, (LongSparseIntArray) this.f$2);
                break;
            case 14:
                ((MessagesController) this.f$0).lambda$getDifference$353((ArrayList) this.f$1, (TLRPC.updates_Difference) this.f$2);
                break;
            case 15:
                ((MessagesController) this.f$0).lambda$getChannelDifference$342((ArrayList) this.f$1, (TLRPC.updates_ChannelDifference) this.f$2);
                break;
            case 16:
                ((MessagesController.SavedMusicList) this.f$0).lambda$load$0((TLObject) this.f$1, (ArrayList) this.f$2);
                break;
            case 17:
                ((MessagesStorage) this.f$0).lambda$saveBotCache$126((TLObject) this.f$1, (String) this.f$2);
                break;
            case 18:
                ((MessagesStorage) this.f$0).lambda$applyPhoneBookUpdates$148((String) this.f$1, (String) this.f$2);
                break;
            case 19:
                ((MessagesStorage) this.f$0).lambda$replaceMessageIfExists$232((MessageObject) this.f$1, (ArrayList) this.f$2);
                break;
            case 20:
                ((MessagesStorage) this.f$0).lambda$getNewTask$111((LongSparseArray) this.f$1, (LongSparseArray) this.f$2);
                break;
            case 21:
                ((SavedMessagesController) this.f$0).lambda$saveCache$11((MessagesStorage) this.f$1, (ArrayList) this.f$2);
                break;
            case 22:
                ((SecretChatHelper) this.f$0).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f$1, (TLRPC.EncryptedChat) this.f$2);
                break;
            case 23:
                ((SendMessagesHelper) this.f$0).lambda$sendVote$31((String) this.f$1, (Runnable) this.f$2);
                break;
            case 24:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$49((TLObject) this.f$1, (SendMessagesHelper.DelayedMessage) this.f$2);
                break;
            case 25:
                ((SendMessagesHelper) this.f$0).lambda$sendMessage$14((TLRPC.TL_error) this.f$1, (TLRPC.TL_messages_forwardMessages) this.f$2);
                break;
            case 26:
                ((TelegramMediaSession) this.f$0).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f$1, (String) this.f$2);
                break;
            case 27:
                ((TranslateController) this.f$0).lambda$checkDialogMessageSure$10((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            default:
                WearAuthListenerService.lambda$onMessageReceived$0((String) this.f$0, (String) this.f$1, (byte[]) this.f$2);
                break;
        }
    }
}
