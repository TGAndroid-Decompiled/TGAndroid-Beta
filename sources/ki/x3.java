package ki;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x3 implements DialogInterface.OnDismissListener {
    public final int f19087a = 1;
    public final boolean[] f19088b;
    public final boolean[] f19089c;
    public final int d;
    public final Object f19090e;
    public final Object f19091f;
    public final Object h;

    public x3(boolean[] zArr, ai.b1 b1Var, boolean[] zArr2, y10 y10Var, int[] iArr, int i7) {
        this.f19088b = zArr;
        this.f19090e = b1Var;
        this.f19089c = zArr2;
        this.f19091f = y10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19087a) {
            case 0:
                Context context = (Context) this.f19090e;
                TLRPC.User user = (TLRPC.User) this.f19091f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f19088b[0]) {
                    boolean[] zArr = this.f19089c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c4.e(context, this.d, user.f28583id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                y10 y10Var = (y10) this.f19091f;
                int[] iArr = (int[]) this.h;
                this.f19088b[0] = true;
                ((ai.b1) this.f19090e).run();
                boolean[] zArr2 = this.f19089c;
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
        this.f19088b = zArr;
        this.f19089c = zArr2;
        this.f19090e = context;
        this.d = i7;
        this.f19091f = user;
        this.h = oVar;
    }
}
