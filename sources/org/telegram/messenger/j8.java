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
    public final int f18686a;
    public final Object f18687b;
    public final Object f18688c;
    public final Object d;

    public j8(Object obj, Object obj2, Object obj3, int i10) {
        this.f18686a = i10;
        this.f18687b = obj;
        this.f18688c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18686a) {
            case 0:
                ((MediaDataController) this.f18687b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f18688c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f18687b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.f18688c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f18687b).lambda$clearBotKeyboard$194((ArrayList) this.f18688c, (MessagesStorage.TopicKey) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18687b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f18688c);
                return;
            case 4:
                ((MediaDataController) this.f18687b).lambda$processLoadedMedia$135((ArrayList) this.f18688c, (b9) this.d);
                return;
            case 5:
                ((MediaDataController) this.f18687b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f18688c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f18687b).lambda$addUsersToChat$295((TLRPC.Chat) this.f18688c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 7:
                ((MessagesController) this.f18687b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.f18688c, (ib) this.d);
                return;
            case 8:
                ((MessagesController) this.f18687b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.f18688c, (jb) this.d);
                return;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.b2[]) this.f18687b, (boolean[]) this.f18688c, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 10:
                ((MessagesController) this.f18687b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.f18688c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f18687b).lambda$processMessageIDUpdate$375((long[]) this.f18688c, (TL_update.TL_updateMessageID) this.d);
                return;
            case 12:
                ((MessagesController) this.f18687b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.f18688c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f18687b).lambda$getDifference$352((ArrayList) this.f18688c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f18687b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.g6) this.f18688c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 15:
                ((MessagesController) this.f18687b).lambda$getChannelDifference$341((ArrayList) this.f18688c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController) this.f18687b).lambda$requestIsUserContactBlocked$497((TLObject) this.f18688c, (ArrayList) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f18687b).lambda$load$0((TLObject) this.f18688c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18687b).lambda$saveBotCache$126((TLObject) this.f18688c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f18687b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f18688c);
                return;
            case 20:
                ((MessagesStorage) this.f18687b).lambda$replaceMessageIfExists$232((MessageObject) this.f18688c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f18687b).lambda$getNewTask$111((a0.h) this.f18688c, (a0.h) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f18687b).lambda$saveCache$11((MessagesStorage) this.f18688c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f18687b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f18688c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f18687b).lambda$sendVote$34((String) this.d, (Runnable) this.f18688c);
                return;
            case 25:
                ((SendMessagesHelper) this.f18687b).lambda$performSendDelayedMessage$52((TLObject) this.f18688c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f18687b).lambda$sendMessage$17((TLRPC.TL_error) this.f18688c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f18687b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f18688c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f18687b).lambda$checkDialogMessageSure$10((ArrayList) this.f18688c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f18687b, (Utilities.Callback[]) this.f18688c, (Runnable) this.d);
                return;
        }
    }

    public j8(BaseController baseController, String str, Object obj, int i10) {
        this.f18686a = i10;
        this.f18687b = baseController;
        this.d = str;
        this.f18688c = obj;
    }
}
