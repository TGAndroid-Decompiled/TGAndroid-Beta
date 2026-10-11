package ei;

import ai.d9;
import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v4 implements DialogInterface.OnDismissListener {
    public final int f9438a = 1;
    public final boolean[] f9439b;
    public final boolean[] f9440c;
    public final int d;
    public final Object f9441e;
    public final Object f9442f;
    public final Object h;

    public v4(boolean[] zArr, d9 d9Var, boolean[] zArr2, Utilities.Callback callback, int[] iArr, int i10) {
        this.f9439b = zArr;
        this.f9441e = d9Var;
        this.f9440c = zArr2;
        this.f9442f = callback;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9438a) {
            case 0:
                Context context = (Context) this.f9441e;
                TLRPC.User user = (TLRPC.User) this.f9442f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                if (!this.f9439b[0]) {
                    boolean[] zArr = this.f9440c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        b5.e(context, this.d, user.f20215id);
                        qVar.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f9442f;
                int[] iArr = (int[]) this.h;
                this.f9439b[0] = true;
                ((d9) this.f9441e).run();
                boolean[] zArr2 = this.f9440c;
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

    public v4(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.q qVar) {
        this.f9439b = zArr;
        this.f9440c = zArr2;
        this.f9441e = context;
        this.d = i10;
        this.f9442f = user;
        this.h = qVar;
    }
}
