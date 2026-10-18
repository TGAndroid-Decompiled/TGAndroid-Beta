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
    public final int f18689a;
    public final Object f18690b;
    public final Object f18691c;
    public final Object d;

    public j8(Object obj, Object obj2, Object obj3, int i10) {
        this.f18689a = i10;
        this.f18690b = obj;
        this.f18691c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18689a) {
            case 0:
                ((MediaDataController) this.f18690b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f18691c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f18690b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.f18691c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f18690b).lambda$clearBotKeyboard$194((ArrayList) this.f18691c, (MessagesStorage.TopicKey) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18690b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f18691c);
                return;
            case 4:
                ((MediaDataController) this.f18690b).lambda$processLoadedMedia$135((ArrayList) this.f18691c, (b9) this.d);
                return;
            case 5:
                ((MediaDataController) this.f18690b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f18691c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f18690b).lambda$addUsersToChat$295((TLRPC.Chat) this.f18691c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 7:
                ((MessagesController) this.f18690b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.f18691c, (ib) this.d);
                return;
            case 8:
                ((MessagesController) this.f18690b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.f18691c, (jb) this.d);
                return;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.b2[]) this.f18690b, (boolean[]) this.f18691c, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 10:
                ((MessagesController) this.f18690b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.f18691c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f18690b).lambda$processMessageIDUpdate$375((long[]) this.f18691c, (TL_update.TL_updateMessageID) this.d);
                return;
            case 12:
                ((MessagesController) this.f18690b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.f18691c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f18690b).lambda$getDifference$352((ArrayList) this.f18691c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f18690b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.g6) this.f18691c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 15:
                ((MessagesController) this.f18690b).lambda$getChannelDifference$341((ArrayList) this.f18691c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController) this.f18690b).lambda$requestIsUserContactBlocked$497((TLObject) this.f18691c, (ArrayList) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f18690b).lambda$load$0((TLObject) this.f18691c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18690b).lambda$saveBotCache$126((TLObject) this.f18691c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f18690b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f18691c);
                return;
            case 20:
                ((MessagesStorage) this.f18690b).lambda$replaceMessageIfExists$232((MessageObject) this.f18691c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f18690b).lambda$getNewTask$111((a0.h) this.f18691c, (a0.h) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f18690b).lambda$saveCache$11((MessagesStorage) this.f18691c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f18690b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f18691c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f18690b).lambda$sendVote$34((String) this.d, (Runnable) this.f18691c);
                return;
            case 25:
                ((SendMessagesHelper) this.f18690b).lambda$performSendDelayedMessage$52((TLObject) this.f18691c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f18690b).lambda$sendMessage$17((TLRPC.TL_error) this.f18691c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f18690b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f18691c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f18690b).lambda$checkDialogMessageSure$10((ArrayList) this.f18691c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f18690b, (Utilities.Callback[]) this.f18691c, (Runnable) this.d);
                return;
        }
    }

    public j8(BaseController baseController, String str, Object obj, int i10) {
        this.f18689a = i10;
        this.f18690b = baseController;
        this.d = str;
        this.f18691c = obj;
    }
}
