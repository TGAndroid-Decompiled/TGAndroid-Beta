package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class f8 implements z10 {
    public final v8 f8548a;
    public final long f8549b;
    public final int f8550c;
    public final boolean[] d;
    public final s10 f8551e;
    public final Context f8552f;
    public final org.telegram.ui.ActionBar.e6 f8553g;
    public final TLRPC.ChatInvite h;
    public final String f8554i;

    public f8(v8 v8Var, long j3, int i7, boolean[] zArr, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f8548a = v8Var;
        this.f8549b = j3;
        this.f8550c = i7;
        this.d = zArr;
        this.f8551e = s10Var;
        this.f8552f = context;
        this.f8553g = e6Var;
        this.h = chatInvite;
        this.f8554i = str;
    }

    @Override
    public final void a(Object obj) {
        z10 z10Var = (z10) obj;
        v8 v8Var = this.f8548a;
        long j3 = v8Var.f9602f.amount;
        long j10 = this.f8549b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        s10 s10Var = this.f8551e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f8554i;
        if (i7 < 0) {
            boolean z10 = np.s1(this.f8550c).f25322k7;
            Context context = this.f8552f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f8553g;
            if (z10) {
                if (z10Var != null) {
                    z10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    s10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                v8.c0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            cb cbVar = new cb(context, e6Var, j10, 1, chatInvite.title, new j6(v8Var, zArr2, str, chatInvite, zArr, s10Var, z10Var), 0L);
            cbVar.setOnDismissListener(new k6(v8Var, z10Var, zArr2, zArr, s10Var, 0));
            cbVar.show();
            return;
        }
        v8Var.Y(str, chatInvite, new l6(z10Var, zArr, s10Var));
    }
}
