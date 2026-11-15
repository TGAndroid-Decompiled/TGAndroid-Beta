package ki;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d4 implements DialogInterface.OnDismissListener {
    public final int f18266a = 1;
    public final boolean[] f18267b;
    public final boolean[] f18268c;
    public final int d;
    public final Object f18269e;
    public final Object f18270f;
    public final Object h;

    public d4(boolean[] zArr, ci.p0 p0Var, boolean[] zArr2, z10 z10Var, int[] iArr, int i7) {
        this.f18267b = zArr;
        this.f18269e = p0Var;
        this.f18268c = zArr2;
        this.f18270f = z10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18266a) {
            case 0:
                Context context = (Context) this.f18269e;
                TLRPC.User user = (TLRPC.User) this.f18270f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f18267b[0]) {
                    boolean[] zArr = this.f18268c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        i4.e(context, this.d, user.f28200id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                z10 z10Var = (z10) this.f18270f;
                int[] iArr = (int[]) this.h;
                this.f18267b[0] = true;
                ((ci.p0) this.f18269e).run();
                boolean[] zArr2 = this.f18268c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    z10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public d4(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.f18267b = zArr;
        this.f18268c = zArr2;
        this.f18269e = context;
        this.d = i7;
        this.f18270f = user;
        this.h = oVar;
    }
}
