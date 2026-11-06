package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class n9 implements c20 {
    public final ea f4419a;
    public final long f4420b;
    public final int f4421c;
    public final boolean[] d;
    public final v10 f4422e;
    public final Context f4423f;
    public final org.telegram.ui.ActionBar.f6 f4424g;
    public final TLRPC.ChatInvite h;
    public final String f4425i;

    public n9(ea eaVar, long j3, int i7, boolean[] zArr, v10 v10Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f4419a = eaVar;
        this.f4420b = j3;
        this.f4421c = i7;
        this.d = zArr;
        this.f4422e = v10Var;
        this.f4423f = context;
        this.f4424g = f6Var;
        this.h = chatInvite;
        this.f4425i = str;
    }

    @Override
    public final void a(Object obj) {
        c20 c20Var = (c20) obj;
        ea eaVar = this.f4419a;
        long j3 = eaVar.f3811f.amount;
        long j10 = this.f4420b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        v10 v10Var = this.f4422e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f4425i;
        if (i7 < 0) {
            boolean z9 = qp.s1(this.f4421c).f24810j7;
            Context context = this.f4423f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f4424g;
            if (z9) {
                if (c20Var != null) {
                    c20Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    v10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                ea.c0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            tc tcVar = new tc(context, f6Var, j10, 1, chatInvite.title, new r7(eaVar, zArr2, str, chatInvite, zArr, v10Var, c20Var), 0L);
            tcVar.setOnDismissListener(new s7(eaVar, c20Var, zArr2, zArr, v10Var, 0));
            tcVar.show();
            return;
        }
        eaVar.Y(str, chatInvite, new t7(c20Var, zArr, v10Var));
    }
}
