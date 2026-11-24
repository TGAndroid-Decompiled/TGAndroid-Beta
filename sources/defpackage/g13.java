package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g13 implements DialogInterface.OnDismissListener {
    public final byte a = 0;
    public final boolean[] b;
    public final boolean[] c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;

    public g13(boolean[] zArr, up6 up6Var, boolean[] zArr2, qac qacVar, int[] iArr, int i) {
        this.b = zArr;
        this.e = up6Var;
        this.c = zArr2;
        this.f = qacVar;
        this.h = iArr;
        this.d = i;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        int i = this.d;
        Object obj3 = this.e;
        boolean[] zArr = this.c;
        boolean[] zArr2 = this.b;
        switch (b) {
            case 0:
                qac qacVar = (qac) obj2;
                int[] iArr = (int[]) obj;
                zArr2[0] = true;
                ((up6) obj3).run();
                if (!zArr[0]) {
                    zArr[0] = true;
                    qacVar.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
            default:
                Context context = (Context) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                yu0 yu0Var = (yu0) obj;
                if (!zArr2[0] && !zArr[0]) {
                    zArr[0] = true;
                    yaa.e(context, i, user.id);
                    yu0Var.a(Boolean.TRUE, "cancelled");
                    return;
                }
                return;
        }
    }

    public g13(boolean[] zArr, boolean[] zArr2, Context context, int i, TLRPC.User user, yu0 yu0Var) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i;
        this.f = user;
        this.h = yu0Var;
    }
}
