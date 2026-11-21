package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class i8 implements x10 {
    public final y8 f9051a;
    public final long f9052b;
    public final int f9053c;
    public final boolean[] d;
    public final q10 f9054e;
    public final Context f9055f;
    public final org.telegram.ui.ActionBar.h6 f9056g;
    public final TLRPC.ChatInvite h;
    public final String f9057i;

    public i8(y8 y8Var, long j3, int i7, boolean[] zArr, q10 q10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f9051a = y8Var;
        this.f9052b = j3;
        this.f9053c = i7;
        this.d = zArr;
        this.f9054e = q10Var;
        this.f9055f = context;
        this.f9056g = h6Var;
        this.h = chatInvite;
        this.f9057i = str;
    }

    @Override
    public final void a(Object obj) {
        x10 x10Var = (x10) obj;
        y8 y8Var = this.f9051a;
        long j3 = y8Var.f10086f.amount;
        long j10 = this.f9052b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        q10 q10Var = this.f9054e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f9057i;
        if (i7 < 0) {
            boolean z10 = mp.u1(this.f9053c).f25735m7;
            Context context = this.f9055f;
            org.telegram.ui.ActionBar.h6 h6Var = this.f9056g;
            if (z10) {
                if (x10Var != null) {
                    x10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    q10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                y8.c0(context, h6Var);
                return;
            }
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, h6Var, j10, 1, chatInvite.title, new m6(y8Var, zArr2, str, chatInvite, zArr, q10Var, x10Var), 0L);
            fbVar.setOnDismissListener(new n6(y8Var, x10Var, zArr2, zArr, q10Var, 0));
            fbVar.show();
            return;
        }
        y8Var.X(str, chatInvite, new o6(x10Var, zArr, q10Var));
    }
}
