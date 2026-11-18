package ki;

import android.content.Context;
import android.content.DialogInterface;
import bi.u4;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y3 implements DialogInterface.OnDismissListener {
    public final int f19077a = 1;
    public final boolean[] f19078b;
    public final boolean[] f19079c;
    public final int d;
    public final Object f19080e;
    public final Object f19081f;
    public final Object h;

    public y3(boolean[] zArr, u4 u4Var, boolean[] zArr2, x10 x10Var, int[] iArr, int i7) {
        this.f19078b = zArr;
        this.f19080e = u4Var;
        this.f19079c = zArr2;
        this.f19081f = x10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19077a) {
            case 0:
                Context context = (Context) this.f19080e;
                TLRPC.User user = (TLRPC.User) this.f19081f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f19078b[0]) {
                    boolean[] zArr = this.f19079c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        d4.e(context, this.d, user.f28554id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                x10 x10Var = (x10) this.f19081f;
                int[] iArr = (int[]) this.h;
                this.f19078b[0] = true;
                ((u4) this.f19080e).run();
                boolean[] zArr2 = this.f19079c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    x10Var.a(null);
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
        this.f19078b = zArr;
        this.f19079c = zArr2;
        this.f19080e = context;
        this.d = i7;
        this.f19081f = user;
        this.h = oVar;
    }
}
