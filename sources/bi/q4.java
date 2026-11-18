package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
public final class q4 implements q10 {
    public final ai.v1 f3968a;
    public final long f3969b;
    public final long f3970c;
    public final Context d;
    public final int f3971e;
    public final org.telegram.ui.ActionBar.i6 f3972f;
    public final TL_stars.TL_starGiftUnique f3973g;
    public final long h;
    public final TLRPC.TL_textWithEntities f3974i;
    public final boolean f3975j;
    public final lc f3976k;
    public final c1.c f3977l;
    public final c1.c f3978m;

    public q4(ai.v1 v1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.f3968a = v1Var;
        this.f3969b = j3;
        this.f3970c = j10;
        this.d = context;
        this.f3971e = i7;
        this.f3972f = i6Var;
        this.f3973g = tL_starGiftUnique;
        this.h = j11;
        this.f3974i = tL_textWithEntities;
        this.f3975j = z10;
        this.f3976k = lcVar;
        this.f3977l = cVar;
        this.f3978m = cVar2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        ai.v1 v1Var = this.f3968a;
        v1Var.a(bool);
        int i7 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
        long j3 = this.f3970c;
        Context context = this.d;
        int i10 = this.f3971e;
        org.telegram.ui.ActionBar.i6 i6Var = this.f3972f;
        if (i7 > 0 && l10.longValue() + this.f3969b >= 100000000 + j3) {
            long longValue = l10.longValue();
            s4 s4Var = new s4(context, i10, this.f3973g, this.h, this.f3974i, this.f3975j, i6Var, v1Var, this.f3976k, this.f3977l, this.f3978m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String M0 = gd.M0(2131749331, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749332, gd.a0(null, null, 2131749619, org.telegram.ui.Wallet.u0.t(longValue, false))));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131746550, null), new ii.h(longValue, v1Var, i10, j3, s4Var));
            alertDialog$Builder.p();
            return;
        }
        o3.e1(context, i10, i6Var, j3, 2131749614);
    }
}
