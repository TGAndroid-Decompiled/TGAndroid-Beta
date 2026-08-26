package org.telegram.messenger;

import android.content.Context;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;

public final class ImageLoader$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;

    public ImageLoader$$ExternalSyntheticLambda14(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ImageLoader) this.f$0).lambda$fileDidLoaded$11((String) this.f$1, this.f$2, (File) this.f$3);
                break;
            case 1:
                ((BirthdayController) this.f$0).lambda$new$1(this.f$2, (ArrayList) this.f$1, (BirthdayController.TL_birthdays) this.f$3);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$checkChatlistFolderUpdate$477((TLObject) this.f$1, this.f$2, (MessagesController.ChatlistUpdatesStat) this.f$3);
                break;
            case 3:
                ((ContactsController) this.f$0).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.f$1, (TLObject) this.f$3, this.f$2);
                break;
            case 4:
                ((ContactsController) this.f$0).lambda$processLoadedContacts$37((ArrayList) this.f$1, this.f$2, (ArrayList) this.f$3);
                break;
            case 5:
                ((LocaleController) this.f$0).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.f$1, this.f$2, (Runnable) this.f$3);
                break;
            case 6:
                ((MediaDataController) this.f$0).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.f$1, (TLObject) this.f$3, this.f$2);
                break;
            case 7:
                ((MediaDataController) this.f$0).lambda$loadBotInfo$197((Utilities.Callback) this.f$1, (TL_bots.BotInfo) this.f$3, this.f$2);
                break;
            case 8:
                ((MediaDataController) this.f$0).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.f$3, (String) this.f$1, this.f$2);
                break;
            case 9:
                ((MessagesController) this.f$0).lambda$processLoadedDeleteTask$88((LongSparseArray) this.f$1, (LongSparseArray) this.f$3, this.f$2);
                break;
            case 10:
                ((MessagesController) this.f$0).lambda$loadFullUser$70((TLRPC.UserFull) this.f$1, (TLRPC.User) this.f$3, this.f$2);
                break;
            case 11:
                ((MessagesController) this.f$0).lambda$loadMessagesInternal$184(this.f$2, (TLRPC.TL_messages_getHistory) this.f$1, (TLRPC.TL_error) this.f$3);
                break;
            case 12:
                ((MessagesController) this.f$0).lambda$loadMessagesInternal$182(this.f$2, (TLRPC.TL_messages_getPeerDialogs) this.f$1, (TLRPC.TL_error) this.f$3);
                break;
            case 13:
                ((MessagesController) this.f$0).lambda$loadMessagesInternal$177(this.f$2, (TLRPC.TL_messages_getSavedHistory) this.f$1, (TLRPC.TL_error) this.f$3);
                break;
            case 14:
                ((MessagesController) this.f$0).lambda$loadMessagesInternal$179(this.f$2, (TLRPC.TL_messages_getReplies) this.f$1, (TLRPC.TL_error) this.f$3);
                break;
            case 15:
                ((MessagesStorage) this.f$0).lambda$hasAuthMessage$176(this.f$2, (boolean[]) this.f$1, (CountDownLatch) this.f$3);
                break;
            case 16:
                ((MessagesStorage) this.f$0).lambda$getBotCache$127(this.f$2, (String) this.f$1, (RequestDelegate) this.f$3);
                break;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f$0, this.f$2, (TL_account.registerPasskey) this.f$1, (Utilities.Callback2) this.f$3);
                break;
            default:
                ((SecretChatHelper) this.f$0).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.f$1, (TLRPC.messages_SentEncryptedMessage) this.f$3, this.f$2);
                break;
        }
    }

    public ImageLoader$$ExternalSyntheticLambda14(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
    }

    public ImageLoader$$ExternalSyntheticLambda14(BaseController baseController, Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$3 = obj2;
        this.f$2 = i;
    }

    public ImageLoader$$ExternalSyntheticLambda14(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i) {
        this.$r8$classId = 8;
        this.f$0 = mediaDataController;
        this.f$3 = tL_messages_stickerSet;
        this.f$1 = str;
        this.f$2 = i;
    }
}
