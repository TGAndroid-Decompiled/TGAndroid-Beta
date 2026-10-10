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
public final class i0 implements Runnable {
    public final int f18100a;
    public final int f18101b;
    public final Object f18102c;
    public final Object d;
    public final Object f18103e;

    public i0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f18100a = i11;
        this.f18102c = obj;
        this.f18101b = i10;
        this.d = obj2;
        this.f18103e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18100a) {
            case 0:
                BirthdayController.b((BirthdayController) this.f18102c, this.f18101b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.f18103e);
                return;
            case 1:
                ((MessagesController) this.f18102c).lambda$checkChatlistFolderUpdate$480((TLObject) this.d, this.f18101b, (MessagesController.ChatlistUpdatesStat) this.f18103e);
                return;
            case 2:
                ((ContactsController) this.f18102c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.f18103e, this.f18101b);
                return;
            case 3:
                ((ContactsController) this.f18102c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f18101b, (ArrayList) this.f18103e);
                return;
            case 4:
                ((ImageLoader) this.f18102c).lambda$fileDidLoaded$11((String) this.d, this.f18101b, (File) this.f18103e);
                return;
            case 5:
                ((LocaleController) this.f18102c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f18101b, (Runnable) this.f18103e);
                return;
            case 6:
                ((MediaDataController) this.f18102c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.f18103e, this.f18101b);
                return;
            case 7:
                ((MediaDataController) this.f18102c).lambda$loadBotInfo$198((Utilities.Callback) this.d, (TL_bots.BotInfo) this.f18103e, this.f18101b);
                return;
            case 8:
                ((MediaDataController) this.f18102c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.f18103e, this.f18101b);
                return;
            case 9:
                ((MessagesController) this.f18102c).lambda$loadMessagesInternal$176(this.f18101b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.f18103e);
                return;
            case 10:
                ((MessagesController) this.f18102c).lambda$processLoadedDeleteTask$87((a0.i) this.d, (a0.i) this.f18103e, this.f18101b);
                return;
            case 11:
                ((MessagesController) this.f18102c).lambda$loadFullUser$69((TLRPC.UserFull) this.d, (TLRPC.User) this.f18103e, this.f18101b);
                return;
            case 12:
                ((MessagesController) this.f18102c).lambda$loadMessagesInternal$181(this.f18101b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.f18103e);
                return;
            case 13:
                ((MessagesController) this.f18102c).lambda$loadMessagesInternal$178(this.f18101b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.f18103e);
                return;
            case 14:
                ((MessagesController) this.f18102c).lambda$loadMessagesInternal$183(this.f18101b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.f18103e);
                return;
            case 15:
                ((MessagesStorage) this.f18102c).lambda$hasAuthMessage$176(this.f18101b, (boolean[]) this.d, (CountDownLatch) this.f18103e);
                return;
            case 16:
                ((MessagesStorage) this.f18102c).lambda$getBotCache$127(this.f18101b, (String) this.d, (RequestDelegate) this.f18103e);
                return;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f18102c, this.f18101b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.f18103e);
                return;
            default:
                ((SecretChatHelper) this.f18102c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.f18103e, this.f18101b);
                return;
        }
    }

    public i0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f18100a = i11;
        this.f18102c = obj;
        this.d = obj2;
        this.f18101b = i10;
        this.f18103e = obj3;
    }

    public i0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.f18100a = i11;
        this.f18102c = baseController;
        this.d = obj;
        this.f18103e = obj2;
        this.f18101b = i10;
    }
}
