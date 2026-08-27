package org.telegram.messenger;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;

public final class h0 implements Runnable {

    public final int f20427a;

    public final int f20428b;

    public final Object f20429c;
    public final Object d;

    public final Object f20430e;

    public h0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f20427a = i11;
        this.f20429c = obj;
        this.f20428b = i10;
        this.d = obj2;
        this.f20430e = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20427a) {
            case 0:
                ((BirthdayController) this.f20429c).lambda$new$1(this.f20428b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.f20430e);
                break;
            case 1:
                ((MessagesController) this.f20429c).lambda$checkChatlistFolderUpdate$477((TLObject) this.d, this.f20428b, (MessagesController.ChatlistUpdatesStat) this.f20430e);
                break;
            case 2:
                ((ContactsController) this.f20429c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.f20430e, this.f20428b);
                break;
            case 3:
                ((ContactsController) this.f20429c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f20428b, (ArrayList) this.f20430e);
                break;
            case 4:
                ((ImageLoader) this.f20429c).lambda$fileDidLoaded$11((String) this.d, this.f20428b, (File) this.f20430e);
                break;
            case 5:
                ((LocaleController) this.f20429c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f20428b, (Runnable) this.f20430e);
                break;
            case 6:
                ((MediaDataController) this.f20429c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.f20430e, this.f20428b);
                break;
            case 7:
                ((MediaDataController) this.f20429c).lambda$loadBotInfo$197((Utilities.Callback) this.d, (TL_bots.BotInfo) this.f20430e, this.f20428b);
                break;
            case 8:
                ((MediaDataController) this.f20429c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.f20430e, this.f20428b);
                break;
            case 9:
                ((MessagesController) this.f20429c).lambda$processLoadedDeleteTask$88((a0.h) this.d, (a0.h) this.f20430e, this.f20428b);
                break;
            case 10:
                ((MessagesController) this.f20429c).lambda$loadFullUser$70((TLRPC.UserFull) this.d, (TLRPC.User) this.f20430e, this.f20428b);
                break;
            case 11:
                ((MessagesController) this.f20429c).lambda$loadMessagesInternal$184(this.f20428b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.f20430e);
                break;
            case 12:
                ((MessagesController) this.f20429c).lambda$loadMessagesInternal$182(this.f20428b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.f20430e);
                break;
            case 13:
                ((MessagesController) this.f20429c).lambda$loadMessagesInternal$177(this.f20428b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.f20430e);
                break;
            case 14:
                ((MessagesController) this.f20429c).lambda$loadMessagesInternal$179(this.f20428b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.f20430e);
                break;
            case 15:
                ((MessagesStorage) this.f20429c).lambda$hasAuthMessage$176(this.f20428b, (boolean[]) this.d, (CountDownLatch) this.f20430e);
                break;
            case 16:
                ((MessagesStorage) this.f20429c).lambda$getBotCache$127(this.f20428b, (String) this.d, (RequestDelegate) this.f20430e);
                break;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f20429c, this.f20428b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.f20430e);
                break;
            default:
                ((SecretChatHelper) this.f20429c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.f20430e, this.f20428b);
                break;
        }
    }

    public h0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f20427a = i11;
        this.f20429c = obj;
        this.d = obj2;
        this.f20428b = i10;
        this.f20430e = obj3;
    }

    public h0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.f20427a = i11;
        this.f20429c = baseController;
        this.d = obj;
        this.f20430e = obj2;
        this.f20428b = i10;
    }
}
