package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class gt7 implements icc {
    public final vra a;
    public final long b;
    public final long c;
    public final Context d;
    public final int e;
    public final vnb f;
    public final TL_stars.TL_starGiftUnique g;
    public final long h;
    public final TLRPC.TL_textWithEntities i;
    public final boolean j;
    public final d31 k;
    public final wra l;
    public final xra m;

    public gt7(vra vraVar, long j, long j2, Context context, int i, vnb vnbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, d31 d31Var, wra wraVar, xra xraVar) {
        this.a = vraVar;
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = i;
        this.f = vnbVar;
        this.g = tL_starGiftUnique;
        this.h = j3;
        this.i = tL_textWithEntities;
        this.j = z;
        this.k = d31Var;
        this.l = wraVar;
        this.m = xraVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        vra vraVar = this.a;
        vraVar.a(bool);
        int i = (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1));
        long j = this.c;
        Context context = this.d;
        int i2 = this.e;
        vnb vnbVar = this.f;
        if (i > 0 && l.longValue() + this.b >= 100000000 + j) {
            long longValue = l.longValue();
            v06 v06Var = new v06(context, i2, this.g, this.h, this.i, this.j, vnbVar, vraVar, this.k, this.l, this.m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M0 = ob6.M0(2131749277, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.a0(null, null, 2131749278, ob6.a0(null, null, 2131749580, c.s(longValue, false))));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.j(ob6.M0(2131746472, null), new tt0(longValue, vraVar, i2, j, v06Var));
            alertDialog$Builder.o();
            return;
        }
        ms7.Z0(context, i2, vnbVar, j, 2131749575);
    }
}
