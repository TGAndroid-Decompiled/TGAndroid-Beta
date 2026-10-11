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
import org.telegram.tgnet.tl.TL_update;
public final class j8 implements Runnable {
    public final int f18280a;
    public final Object f18281b;
    public final Object f18282c;
    public final Object d;

    public j8(Object obj, Object obj2, Object obj3, int i10) {
        this.f18280a = i10;
        this.f18281b = obj;
        this.f18282c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                ((MediaDataController) this.f18281b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f18282c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f18281b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.f18282c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f18281b).lambda$clearBotKeyboard$194((ArrayList) this.f18282c, (MessagesStorage.TopicKey) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18281b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f18282c);
                return;
            case 4:
                ((MediaDataController) this.f18281b).lambda$processLoadedMedia$135((ArrayList) this.f18282c, (b9) this.d);
                return;
            case 5:
                ((MediaDataController) this.f18281b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f18282c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f18281b).lambda$addUsersToChat$295((TLRPC.Chat) this.f18282c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 7:
                ((MessagesController) this.f18281b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.f18282c, (jb) this.d);
                return;
            case 8:
                ((MessagesController) this.f18281b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.f18282c, (kb) this.d);
                return;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.a2[]) this.f18281b, (boolean[]) this.f18282c, (org.telegram.ui.ActionBar.m2) this.d);
                return;
            case 10:
                ((MessagesController) this.f18281b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.f18282c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f18281b).lambda$processMessageIDUpdate$375((long[]) this.f18282c, (TL_update.TL_updateMessageID) this.d);
                return;
            case 12:
                ((MessagesController) this.f18281b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.f18282c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f18281b).lambda$getDifference$352((ArrayList) this.f18282c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f18281b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.g6) this.f18282c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 15:
                ((MessagesController) this.f18281b).lambda$getChannelDifference$341((ArrayList) this.f18282c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController) this.f18281b).lambda$requestIsUserContactBlocked$497((TLObject) this.f18282c, (ArrayList) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f18281b).lambda$load$0((TLObject) this.f18282c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18281b).lambda$saveBotCache$126((TLObject) this.f18282c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f18281b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f18282c);
                return;
            case 20:
                ((MessagesStorage) this.f18281b).lambda$replaceMessageIfExists$232((MessageObject) this.f18282c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f18281b).lambda$getNewTask$111((a0.i) this.f18282c, (a0.i) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f18281b).lambda$saveCache$11((MessagesStorage) this.f18282c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f18281b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f18282c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f18281b).lambda$sendVote$34((String) this.d, (Runnable) this.f18282c);
                return;
            case 25:
                ((SendMessagesHelper) this.f18281b).lambda$performSendDelayedMessage$52((TLObject) this.f18282c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f18281b).lambda$sendMessage$17((TLRPC.TL_error) this.f18282c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f18281b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f18282c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f18281b).lambda$checkDialogMessageSure$10((ArrayList) this.f18282c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f18281b, (Utilities.Callback[]) this.f18282c, (Runnable) this.d);
                return;
        }
    }

    public j8(BaseController baseController, String str, Object obj, int i10) {
        this.f18280a = i10;
        this.f18281b = baseController;
        this.d = str;
        this.f18282c = obj;
    }
}
