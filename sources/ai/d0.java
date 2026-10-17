package ai;

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
public final class d0 implements RequestDelegate {
    public final int f1126a;
    public final long f1127b;
    public final Object f1128c;
    public final Object d;
    public final Object e;

    public d0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f1126a = i10;
        this.f1128c = obj;
        this.d = obj2;
        this.f1127b = j10;
        this.e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1126a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z((k0) this.f1128c, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f1127b, (Utilities.Callback) this.e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new b4((k7) this.f1128c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f1127b));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new z((fa) this.f1128c, tLObject, (MessageObject) this.d, this.f1127b, (Runnable) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new z((org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f1127b, (AccountInstance) this.f1128c, (MessagesStorage.BooleanCallback) this.e));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b4((org.telegram.ui.ActionBar.n2) this.f1128c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f1127b));
                return;
        }
    }

    public d0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f1126a = i10;
        this.f1128c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1127b = j10;
    }

    public d0(org.telegram.ui.ActionBar.b2 b2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f1126a = 3;
        this.d = b2Var;
        this.f1127b = j10;
        this.f1128c = accountInstance;
        this.e = booleanCallback;
    }
}
