package bi;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e0 implements RequestDelegate {
    public final int f4537a;
    public final long f4538b;
    public final Object f4539c;
    public final Object d;
    public final Object e;

    public e0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f4537a = i10;
        this.f4539c = obj;
        this.d = obj2;
        this.f4538b = j10;
        this.e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4537a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a0((m0) this.f4539c, (org.telegram.ui.ActionBar.e2) this.d, tLObject, this.f4538b, (Utilities.Callback) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((h7) this.f4539c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f4538b));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a0((ca) this.f4539c, tLObject, (MessageObject) this.d, this.f4538b, (Runnable) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a0((org.telegram.ui.ActionBar.e2) this.d, tLObject, this.f4538b, (AccountInstance) this.f4539c, (MessagesStorage.BooleanCallback) this.e));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m3((org.telegram.ui.ActionBar.r2) this.f4539c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f4538b));
                return;
        }
    }

    public e0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f4537a = i10;
        this.f4539c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4538b = j10;
    }

    public e0(org.telegram.ui.ActionBar.e2 e2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f4537a = 3;
        this.d = e2Var;
        this.f4538b = j10;
        this.f4539c = accountInstance;
        this.e = booleanCallback;
    }
}
