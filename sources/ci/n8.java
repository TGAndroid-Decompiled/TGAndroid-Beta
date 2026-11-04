package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class n8 implements u10 {
    public final e9 f5643a;
    public final long f5644b;
    public final int f5645c;
    public final boolean[] d;
    public final n10 f5646e;
    public final Context f5647f;
    public final org.telegram.ui.ActionBar.e6 f5648g;
    public final TLRPC.ChatInvite h;
    public final String f5649i;

    public n8(e9 e9Var, long j10, int i3, boolean[] zArr, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f5643a = e9Var;
        this.f5644b = j10;
        this.f5645c = i3;
        this.d = zArr;
        this.f5646e = n10Var;
        this.f5647f = context;
        this.f5648g = e6Var;
        this.h = chatInvite;
        this.f5649i = str;
    }

    @Override
    public final void a(Object obj) {
        u10 u10Var = (u10) obj;
        e9 e9Var = this.f5643a;
        long j10 = e9Var.f5033f.amount;
        long j11 = this.f5644b;
        int i3 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        n10 n10Var = this.f5646e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f5649i;
        if (i3 < 0) {
            boolean z10 = hp.s1(this.f5645c).f23042j7;
            Context context = this.f5647f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f5648g;
            if (z10) {
                if (u10Var != null) {
                    u10Var.a(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    n10Var.a("cancelled", 0L);
                    zArr[0] = true;
                }
                e9.c0(context, e6Var);
                return;
            }
            boolean[] zArr2 = {false};
            mb mbVar = new mb(context, e6Var, j11, 1, chatInvite.title, new s6(e9Var, zArr2, str, chatInvite, zArr, n10Var, u10Var), 0L);
            mbVar.setOnDismissListener(new t6(e9Var, u10Var, zArr2, zArr, n10Var, 0));
            mbVar.show();
            return;
        }
        e9Var.Y(str, chatInvite, new u6(u10Var, zArr, n10Var));
    }
}
