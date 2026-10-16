package fi;

import android.content.Context;
import android.content.DialogInterface;
import bi.n8;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w4 implements DialogInterface.OnDismissListener {
    public final int f9649a = 1;
    public final boolean[] f9650b;
    public final boolean[] f9651c;
    public final int d;
    public final Object e;
    public final Object f9652f;
    public final Object h;

    public w4(boolean[] zArr, n8 n8Var, boolean[] zArr2, Utilities.Callback callback, int[] iArr, int i10) {
        this.f9650b = zArr;
        this.e = n8Var;
        this.f9651c = zArr2;
        this.f9652f = callback;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9649a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f9652f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                if (!this.f9650b[0]) {
                    boolean[] zArr = this.f9651c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c5.e(context, this.d, user.f19063id);
                        qVar.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f9652f;
                int[] iArr = (int[]) this.h;
                this.f9650b[0] = true;
                ((n8) this.e).run();
                boolean[] zArr2 = this.f9651c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    callback.run(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public w4(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.q qVar) {
        this.f9650b = zArr;
        this.f9651c = zArr2;
        this.e = context;
        this.d = i10;
        this.f9652f = user;
        this.h = qVar;
    }
}
