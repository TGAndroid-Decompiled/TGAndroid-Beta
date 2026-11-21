package ki;

import android.content.Context;
import android.content.DialogInterface;
import bi.x4;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x3 implements DialogInterface.OnDismissListener {
    public final int f19084a = 1;
    public final boolean[] f19085b;
    public final boolean[] f19086c;
    public final int d;
    public final Object f19087e;
    public final Object f19088f;
    public final Object h;

    public x3(boolean[] zArr, x4 x4Var, boolean[] zArr2, x10 x10Var, int[] iArr, int i7) {
        this.f19085b = zArr;
        this.f19087e = x4Var;
        this.f19086c = zArr2;
        this.f19088f = x10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19084a) {
            case 0:
                Context context = (Context) this.f19087e;
                TLRPC.User user = (TLRPC.User) this.f19088f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f19085b[0]) {
                    boolean[] zArr = this.f19086c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c4.e(context, this.d, user.f28580id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                x10 x10Var = (x10) this.f19088f;
                int[] iArr = (int[]) this.h;
                this.f19085b[0] = true;
                ((x4) this.f19087e).run();
                boolean[] zArr2 = this.f19086c;
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

    public x3(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.f19085b = zArr;
        this.f19086c = zArr2;
        this.f19087e = context;
        this.d = i7;
        this.f19088f = user;
        this.h = oVar;
    }
}
