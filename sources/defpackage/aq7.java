package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class aq7 implements i8c {
    public final nu9 a;
    public final long b;
    public final long c;
    public final Context d;
    public final int e;
    public final wjb f;
    public final TL_stars.TL_starGiftUnique g;
    public final long h;
    public final TLRPC.TL_textWithEntities i;
    public final boolean j;
    public final u21 k;
    public final t7a l;
    public final t7a m;

    public aq7(nu9 nu9Var, long j, long j2, Context context, int i, wjb wjbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, u21 u21Var, t7a t7aVar, t7a t7aVar2) {
        this.a = nu9Var;
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = i;
        this.f = wjbVar;
        this.g = tL_starGiftUnique;
        this.h = j3;
        this.i = tL_textWithEntities;
        this.j = z;
        this.k = u21Var;
        this.l = t7aVar;
        this.m = t7aVar2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        nu9 nu9Var = this.a;
        nu9Var.a(bool);
        int i = (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1));
        long j = this.c;
        Context context = this.d;
        int i2 = this.e;
        wjb wjbVar = this.f;
        if (i > 0 && l.longValue() + this.b >= 100000000 + j) {
            long longValue = l.longValue();
            uy5 uy5Var = new uy5(context, i2, this.g, this.h, this.i, this.j, wjbVar, nu9Var, this.k, this.l, this.m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M0 = k96.M0(2131749331, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.S2(k96.a0(null, null, 2131749332, k96.a0(null, null, 2131749619, c.s(longValue, false))));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.j(k96.M0(2131746552, null), new lt0(longValue, nu9Var, i2, j, uy5Var));
            alertDialog$Builder.o();
            return;
        }
        mp7.Y0(context, i2, wjbVar, j, 2131749614);
    }
}
