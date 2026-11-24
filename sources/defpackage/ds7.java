package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class ds7 implements jac {
    public final ts9 a;
    public final long b;
    public final long c;
    public final Context d;
    public final int e;
    public final ylb f;
    public final TL_stars.TL_starGiftUnique g;
    public final long h;
    public final TLRPC.TL_textWithEntities i;
    public final boolean j;
    public final c41 k;
    public final e6a l;
    public final e6a m;

    public ds7(ts9 ts9Var, long j, long j2, Context context, int i, ylb ylbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, c41 c41Var, e6a e6aVar, e6a e6aVar2) {
        this.a = ts9Var;
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = i;
        this.f = ylbVar;
        this.g = tL_starGiftUnique;
        this.h = j3;
        this.i = tL_textWithEntities;
        this.j = z;
        this.k = c41Var;
        this.l = e6aVar;
        this.m = e6aVar2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        ts9 ts9Var = this.a;
        ts9Var.a(bool);
        int i = (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1));
        long j = this.c;
        Context context = this.d;
        int i2 = this.e;
        ylb ylbVar = this.f;
        if (i > 0 && l.longValue() + this.b >= 100000000 + j) {
            long longValue = l.longValue();
            u06 u06Var = new u06(context, i2, this.g, this.h, this.i, this.j, ylbVar, ts9Var, this.k, this.l, this.m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            String M0 = jb6.M0(2131749280, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0(null, null, 2131749281, jb6.a0(null, null, 2131749568, c.s(longValue, false))));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.j(jb6.M0(2131746478, null), new tu0(longValue, ts9Var, i2, j, u06Var));
            alertDialog$Builder.o();
            return;
        }
        pr7.Y0(context, i2, ylbVar, j, 2131749563);
    }
}
