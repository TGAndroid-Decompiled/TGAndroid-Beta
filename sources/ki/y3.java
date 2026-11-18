package ki;

import android.content.Context;
import android.content.DialogInterface;
import bi.t4;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y3 implements DialogInterface.OnDismissListener {
    public final int f19074a = 1;
    public final boolean[] f19075b;
    public final boolean[] f19076c;
    public final int d;
    public final Object f19077e;
    public final Object f19078f;
    public final Object h;

    public y3(boolean[] zArr, t4 t4Var, boolean[] zArr2, x10 x10Var, int[] iArr, int i7) {
        this.f19075b = zArr;
        this.f19077e = t4Var;
        this.f19076c = zArr2;
        this.f19078f = x10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19074a) {
            case 0:
                Context context = (Context) this.f19077e;
                TLRPC.User user = (TLRPC.User) this.f19078f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f19075b[0]) {
                    boolean[] zArr = this.f19076c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        d4.e(context, this.d, user.f28552id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                x10 x10Var = (x10) this.f19078f;
                int[] iArr = (int[]) this.h;
                this.f19075b[0] = true;
                ((t4) this.f19077e).run();
                boolean[] zArr2 = this.f19076c;
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
        this.f19075b = zArr;
        this.f19076c = zArr2;
        this.f19077e = context;
        this.d = i7;
        this.f19078f = user;
        this.h = oVar;
    }
}
