package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class i8 implements w10 {
    public final y8 f9015a;
    public final long f9016b;
    public final int f9017c;
    public final boolean[] d;
    public final p10 f9018e;
    public final Context f9019f;
    public final org.telegram.ui.ActionBar.i6 f9020g;
    public final TLRPC.ChatInvite h;
    public final String f9021i;

    public i8(y8 y8Var, long j3, int i7, boolean[] zArr, p10 p10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f9015a = y8Var;
        this.f9016b = j3;
        this.f9017c = i7;
        this.d = zArr;
        this.f9018e = p10Var;
        this.f9019f = context;
        this.f9020g = i6Var;
        this.h = chatInvite;
        this.f9021i = str;
    }

    @Override
    public final void a(Object obj) {
        w10 w10Var = (w10) obj;
        y8 y8Var = this.f9015a;
        long j3 = y8Var.f10050f.amount;
        long j10 = this.f9016b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        p10 p10Var = this.f9018e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f9021i;
        if (i7 < 0) {
            boolean z10 = mp.u1(this.f9017c).f25802m7;
            Context context = this.f9019f;
            org.telegram.ui.ActionBar.i6 i6Var = this.f9020g;
            if (z10) {
                if (w10Var != null) {
                    w10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    p10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                y8.c0(context, i6Var);
                return;
            }
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, i6Var, j10, 1, chatInvite.title, new m6(y8Var, zArr2, str, chatInvite, zArr, p10Var, w10Var), 0L);
            fbVar.setOnDismissListener(new n6(y8Var, w10Var, zArr2, zArr, p10Var, 0));
            fbVar.show();
            return;
        }
        y8Var.X(str, chatInvite, new o6(w10Var, zArr, p10Var));
    }
}
