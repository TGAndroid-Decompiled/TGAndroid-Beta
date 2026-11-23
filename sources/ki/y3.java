package ki;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y3 implements DialogInterface.OnDismissListener {
    public final int f19183a = 1;
    public final boolean[] f19184b;
    public final boolean[] f19185c;
    public final int d;
    public final Object f19186e;
    public final Object f19187f;
    public final Object h;

    public y3(boolean[] zArr, ai.x0 x0Var, boolean[] zArr2, w10 w10Var, int[] iArr, int i7) {
        this.f19184b = zArr;
        this.f19186e = x0Var;
        this.f19185c = zArr2;
        this.f19187f = w10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19183a) {
            case 0:
                Context context = (Context) this.f19186e;
                TLRPC.User user = (TLRPC.User) this.f19187f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f19184b[0]) {
                    boolean[] zArr = this.f19185c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        d4.e(context, this.d, user.f28641id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                w10 w10Var = (w10) this.f19187f;
                int[] iArr = (int[]) this.h;
                this.f19184b[0] = true;
                ((ai.x0) this.f19186e).run();
                boolean[] zArr2 = this.f19185c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    w10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public y3(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.f19184b = zArr;
        this.f19185c = zArr2;
        this.f19186e = context;
        this.d = i7;
        this.f19187f = user;
        this.h = oVar;
    }
}
