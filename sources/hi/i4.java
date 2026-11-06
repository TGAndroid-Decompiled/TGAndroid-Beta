package hi;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i4 implements DialogInterface.OnDismissListener {
    public final int f14724a = 1;
    public final boolean[] f14725b;
    public final boolean[] f14726c;
    public final int d;
    public final Object f14727e;
    public final Object f14728f;
    public final Object h;

    public i4(boolean[] zArr, ai.a1 a1Var, boolean[] zArr2, c20 c20Var, int[] iArr, int i7) {
        this.f14725b = zArr;
        this.f14727e = a1Var;
        this.f14726c = zArr2;
        this.f14728f = c20Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14724a) {
            case 0:
                Context context = (Context) this.f14727e;
                TLRPC.User user = (TLRPC.User) this.f14728f;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.h;
                if (!this.f14725b[0]) {
                    boolean[] zArr = this.f14726c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        o4.e(context, this.d, user.f27101id);
                        nVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                c20 c20Var = (c20) this.f14728f;
                int[] iArr = (int[]) this.h;
                this.f14725b[0] = true;
                ((ai.a1) this.f14727e).run();
                boolean[] zArr2 = this.f14726c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    c20Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public i4(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.n nVar) {
        this.f14725b = zArr;
        this.f14726c = zArr2;
        this.f14727e = context;
        this.d = i7;
        this.f14728f = user;
        this.h = nVar;
    }
}
