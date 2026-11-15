package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class e8 implements z10 {
    public final u8 f8497a;
    public final long f8498b;
    public final int f8499c;
    public final boolean[] d;
    public final s10 f8500e;
    public final Context f8501f;
    public final org.telegram.ui.ActionBar.e6 f8502g;
    public final TLRPC.ChatInvite h;
    public final String f8503i;

    public e8(u8 u8Var, long j3, int i7, boolean[] zArr, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f8497a = u8Var;
        this.f8498b = j3;
        this.f8499c = i7;
        this.d = zArr;
        this.f8500e = s10Var;
        this.f8501f = context;
        this.f8502g = e6Var;
        this.h = chatInvite;
        this.f8503i = str;
    }

    @Override
    public final void a(Object obj) {
        z10 z10Var = (z10) obj;
        u8 u8Var = this.f8497a;
        long j3 = u8Var.f9533f.amount;
        long j10 = this.f8498b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        s10 s10Var = this.f8500e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f8503i;
        if (i7 < 0) {
            boolean z10 = np.s1(this.f8499c).f25325k7;
            Context context = this.f8501f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f8502g;
            if (z10) {
                if (z10Var != null) {
                    z10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    s10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                u8.c0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            bb bbVar = new bb(context, e6Var, j10, 1, chatInvite.title, new j6(u8Var, zArr2, str, chatInvite, zArr, s10Var, z10Var), 0L);
            bbVar.setOnDismissListener(new k6(u8Var, z10Var, zArr2, zArr, s10Var, 0));
            bbVar.show();
            return;
        }
        u8Var.Y(str, chatInvite, new l6(z10Var, zArr, s10Var));
    }
}
