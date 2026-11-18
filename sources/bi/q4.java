package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
public final class q4 implements q10 {
    public final ai.v1 f3992a;
    public final long f3993b;
    public final long f3994c;
    public final Context d;
    public final int f3995e;
    public final org.telegram.ui.ActionBar.i6 f3996f;
    public final TL_stars.TL_starGiftUnique f3997g;
    public final long h;
    public final TLRPC.TL_textWithEntities f3998i;
    public final boolean f3999j;
    public final lc f4000k;
    public final c1.c f4001l;
    public final c1.c f4002m;

    public q4(ai.v1 v1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.f3992a = v1Var;
        this.f3993b = j3;
        this.f3994c = j10;
        this.d = context;
        this.f3995e = i7;
        this.f3996f = i6Var;
        this.f3997g = tL_starGiftUnique;
        this.h = j11;
        this.f3998i = tL_textWithEntities;
        this.f3999j = z10;
        this.f4000k = lcVar;
        this.f4001l = cVar;
        this.f4002m = cVar2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        ai.v1 v1Var = this.f3992a;
        v1Var.a(bool);
        int i7 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
        long j3 = this.f3994c;
        Context context = this.d;
        int i10 = this.f3995e;
        org.telegram.ui.ActionBar.i6 i6Var = this.f3996f;
        if (i7 > 0 && l10.longValue() + this.f3993b >= 100000000 + j3) {
            long longValue = l10.longValue();
            t4 t4Var = new t4(context, i10, this.f3997g, this.h, this.f3998i, this.f3999j, i6Var, v1Var, this.f4000k, this.f4001l, this.f4002m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String M0 = gd.M0(2131749331, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749332, gd.a0(null, null, 2131749619, org.telegram.ui.Wallet.u0.t(longValue, false))));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131746550, null), new ii.h(longValue, v1Var, i10, j3, t4Var));
            alertDialog$Builder.p();
            return;
        }
        o3.e1(context, i10, i6Var, j3, 2131749614);
    }
}
