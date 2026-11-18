package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class h8 implements x10 {
    public final x8 f8974a;
    public final long f8975b;
    public final int f8976c;
    public final boolean[] d;
    public final q10 f8977e;
    public final Context f8978f;
    public final org.telegram.ui.ActionBar.i6 f8979g;
    public final TLRPC.ChatInvite h;
    public final String f8980i;

    public h8(x8 x8Var, long j3, int i7, boolean[] zArr, q10 q10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f8974a = x8Var;
        this.f8975b = j3;
        this.f8976c = i7;
        this.d = zArr;
        this.f8977e = q10Var;
        this.f8978f = context;
        this.f8979g = i6Var;
        this.h = chatInvite;
        this.f8980i = str;
    }

    @Override
    public final void a(Object obj) {
        x10 x10Var = (x10) obj;
        x8 x8Var = this.f8974a;
        long j3 = x8Var.f10022f.amount;
        long j10 = this.f8975b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        q10 q10Var = this.f8977e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f8980i;
        if (i7 < 0) {
            boolean z10 = mp.u1(this.f8976c).f25709m7;
            Context context = this.f8978f;
            org.telegram.ui.ActionBar.i6 i6Var = this.f8979g;
            if (z10) {
                if (x10Var != null) {
                    x10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    q10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                x8.c0(context, i6Var);
                return;
            }
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, i6Var, j10, 1, chatInvite.title, new m6(x8Var, zArr2, str, chatInvite, zArr, q10Var, x10Var), 0L);
            fbVar.setOnDismissListener(new n6(x8Var, x10Var, zArr2, zArr, q10Var, 0));
            fbVar.show();
            return;
        }
        x8Var.X(str, chatInvite, new o6(x10Var, zArr, q10Var));
    }
}
