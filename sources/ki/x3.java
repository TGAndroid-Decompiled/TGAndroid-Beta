package ki;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x3 implements DialogInterface.OnDismissListener {
    public final int f19053a = 1;
    public final boolean[] f19054b;
    public final boolean[] f19055c;
    public final int d;
    public final Object f19056e;
    public final Object f19057f;
    public final Object h;

    public x3(boolean[] zArr, ai.w0 w0Var, boolean[] zArr2, y10 y10Var, int[] iArr, int i7) {
        this.f19054b = zArr;
        this.f19056e = w0Var;
        this.f19055c = zArr2;
        this.f19057f = y10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19053a) {
            case 0:
                Context context = (Context) this.f19056e;
                TLRPC.User user = (TLRPC.User) this.f19057f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f19054b[0]) {
                    boolean[] zArr = this.f19055c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c4.e(context, this.d, user.f28547id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                y10 y10Var = (y10) this.f19057f;
                int[] iArr = (int[]) this.h;
                this.f19054b[0] = true;
                ((ai.w0) this.f19056e).run();
                boolean[] zArr2 = this.f19055c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    y10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public x3(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.f19054b = zArr;
        this.f19055c = zArr2;
        this.f19056e = context;
        this.d = i7;
        this.f19057f = user;
        this.h = oVar;
    }
}
