package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class i8 implements y10 {
    public final y8 f9018a;
    public final long f9019b;
    public final int f9020c;
    public final boolean[] d;
    public final r10 f9021e;
    public final Context f9022f;
    public final org.telegram.ui.ActionBar.h6 f9023g;
    public final TLRPC.ChatInvite h;
    public final String f9024i;

    public i8(y8 y8Var, long j3, int i7, boolean[] zArr, r10 r10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f9018a = y8Var;
        this.f9019b = j3;
        this.f9020c = i7;
        this.d = zArr;
        this.f9021e = r10Var;
        this.f9022f = context;
        this.f9023g = h6Var;
        this.h = chatInvite;
        this.f9024i = str;
    }

    @Override
    public final void a(Object obj) {
        y10 y10Var = (y10) obj;
        y8 y8Var = this.f9018a;
        long j3 = y8Var.f10052f.amount;
        long j10 = this.f9019b;
        int i7 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        boolean[] zArr = this.d;
        r10 r10Var = this.f9021e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f9024i;
        if (i7 < 0) {
            boolean z10 = np.u1(this.f9020c).f25870m7;
            Context context = this.f9022f;
            org.telegram.ui.ActionBar.h6 h6Var = this.f9023g;
            if (z10) {
                if (y10Var != null) {
                    y10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    r10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                y8.c0(context, h6Var);
                return;
            }
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, h6Var, j10, 1, chatInvite.title, new m6(y8Var, zArr2, str, chatInvite, zArr, r10Var, y10Var), 0L);
            fbVar.setOnDismissListener(new n6(y8Var, y10Var, zArr2, zArr, r10Var, 0));
            fbVar.show();
            return;
        }
        y8Var.X(str, chatInvite, new o6(y10Var, zArr, r10Var));
    }
}
