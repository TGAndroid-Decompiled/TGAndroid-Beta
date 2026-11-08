package hi;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i4 implements DialogInterface.OnDismissListener {
    public final int f14727a = 1;
    public final boolean[] f14728b;
    public final boolean[] f14729c;
    public final int d;
    public final Object f14730e;
    public final Object f14731f;
    public final Object h;

    public i4(boolean[] zArr, ai.a1 a1Var, boolean[] zArr2, c20 c20Var, int[] iArr, int i7) {
        this.f14728b = zArr;
        this.f14730e = a1Var;
        this.f14729c = zArr2;
        this.f14731f = c20Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14727a) {
            case 0:
                Context context = (Context) this.f14730e;
                TLRPC.User user = (TLRPC.User) this.f14731f;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.h;
                if (!this.f14728b[0]) {
                    boolean[] zArr = this.f14729c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        o4.e(context, this.d, user.f27105id);
                        nVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                c20 c20Var = (c20) this.f14731f;
                int[] iArr = (int[]) this.h;
                this.f14728b[0] = true;
                ((ai.a1) this.f14730e).run();
                boolean[] zArr2 = this.f14729c;
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
        this.f14728b = zArr;
        this.f14729c = zArr2;
        this.f14730e = context;
        this.d = i7;
        this.f14731f = user;
        this.h = nVar;
    }
}
