package org.telegram.messenger;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
public final class h0 implements Runnable {
    public final int f20429a;
    public final int f20430b;
    public final Object f20431c;
    public final Object d;
    public final Object f20432e;

    public h0(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f20429a = i10;
        this.f20431c = obj;
        this.f20430b = i9;
        this.d = obj2;
        this.f20432e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20429a) {
            case 0:
                ((BirthdayController) this.f20431c).lambda$new$1(this.f20430b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.f20432e);
                return;
            case 1:
                ((MessagesController) this.f20431c).lambda$checkChatlistFolderUpdate$477((TLObject) this.d, this.f20430b, (MessagesController.ChatlistUpdatesStat) this.f20432e);
                return;
            case 2:
                ((ContactsController) this.f20431c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.f20432e, this.f20430b);
                return;
            case 3:
                ((ContactsController) this.f20431c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f20430b, (ArrayList) this.f20432e);
                return;
            case 4:
                ((ImageLoader) this.f20431c).lambda$fileDidLoaded$11((String) this.d, this.f20430b, (File) this.f20432e);
                return;
            case 5:
                ((LocaleController) this.f20431c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f20430b, (Runnable) this.f20432e);
                return;
            case 6:
                ((MediaDataController) this.f20431c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.f20432e, this.f20430b);
                return;
            case 7:
                ((MediaDataController) this.f20431c).lambda$loadBotInfo$197((Utilities.Callback) this.d, (TL_bots.BotInfo) this.f20432e, this.f20430b);
                return;
            case 8:
                ((MediaDataController) this.f20431c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.f20432e, this.f20430b);
                return;
            case 9:
                ((MessagesController) this.f20431c).lambda$processLoadedDeleteTask$88((a0.h) this.d, (a0.h) this.f20432e, this.f20430b);
                return;
            case 10:
                ((MessagesController) this.f20431c).lambda$loadFullUser$70((TLRPC.UserFull) this.d, (TLRPC.User) this.f20432e, this.f20430b);
                return;
            case 11:
                ((MessagesController) this.f20431c).lambda$loadMessagesInternal$184(this.f20430b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.f20432e);
                return;
            case 12:
                ((MessagesController) this.f20431c).lambda$loadMessagesInternal$182(this.f20430b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.f20432e);
                return;
            case 13:
                ((MessagesController) this.f20431c).lambda$loadMessagesInternal$177(this.f20430b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.f20432e);
                return;
            case 14:
                ((MessagesController) this.f20431c).lambda$loadMessagesInternal$179(this.f20430b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.f20432e);
                return;
            case 15:
                ((MessagesStorage) this.f20431c).lambda$hasAuthMessage$176(this.f20430b, (boolean[]) this.d, (CountDownLatch) this.f20432e);
                return;
            case 16:
                ((MessagesStorage) this.f20431c).lambda$getBotCache$127(this.f20430b, (String) this.d, (RequestDelegate) this.f20432e);
                return;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f20431c, this.f20430b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.f20432e);
                return;
            default:
                ((SecretChatHelper) this.f20431c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.f20432e, this.f20430b);
                return;
        }
    }

    public h0(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.f20429a = i10;
        this.f20431c = obj;
        this.d = obj2;
        this.f20430b = i9;
        this.f20432e = obj3;
    }

    public h0(BaseController baseController, Object obj, Object obj2, int i9, int i10) {
        this.f20429a = i10;
        this.f20431c = baseController;
        this.d = obj;
        this.f20432e = obj2;
        this.f20430b = i9;
    }
}
