package ii;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i4 implements DialogInterface.OnDismissListener {
    public final int f15016a = 1;
    public final boolean[] f15017b;
    public final boolean[] f15018c;
    public final int d;
    public final Object f15019e;
    public final Object f15020f;
    public final Object h;

    public i4(boolean[] zArr, bi.q0 q0Var, boolean[] zArr2, u10 u10Var, int[] iArr, int i3) {
        this.f15017b = zArr;
        this.f15019e = q0Var;
        this.f15018c = zArr2;
        this.f15020f = u10Var;
        this.h = iArr;
        this.d = i3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f15016a) {
            case 0:
                Context context = (Context) this.f15019e;
                TLRPC.User user = (TLRPC.User) this.f15020f;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.h;
                if (!this.f15017b[0]) {
                    boolean[] zArr = this.f15018c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        o4.e(context, this.d, user.f27150id);
                        pVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                u10 u10Var = (u10) this.f15020f;
                int[] iArr = (int[]) this.h;
                this.f15017b[0] = true;
                ((bi.q0) this.f15019e).run();
                boolean[] zArr2 = this.f15018c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    u10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public i4(boolean[] zArr, boolean[] zArr2, Context context, int i3, TLRPC.User user, org.telegram.ui.web.p pVar) {
        this.f15017b = zArr;
        this.f15018c = zArr2;
        this.f15019e = context;
        this.d = i3;
        this.f15020f = user;
        this.h = pVar;
    }
}
