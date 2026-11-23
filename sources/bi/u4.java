package bi;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
public final class u4 implements r10 {
    public final ai.y1 f4147a;
    public final long f4148b;
    public final long f4149c;
    public final Context d;
    public final int f4150e;
    public final org.telegram.ui.ActionBar.h6 f4151f;
    public final TL_stars.TL_starGiftUnique f4152g;
    public final long h;
    public final TLRPC.TL_textWithEntities f4153i;
    public final boolean f4154j;
    public final lc f4155k;
    public final c1.a f4156l;
    public final di.f2 f4157m;

    public u4(ai.y1 y1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.a aVar, di.f2 f2Var) {
        this.f4147a = y1Var;
        this.f4148b = j3;
        this.f4149c = j10;
        this.d = context;
        this.f4150e = i7;
        this.f4151f = h6Var;
        this.f4152g = tL_starGiftUnique;
        this.h = j11;
        this.f4153i = tL_textWithEntities;
        this.f4154j = z10;
        this.f4155k = lcVar;
        this.f4156l = aVar;
        this.f4157m = f2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        ai.y1 y1Var = this.f4147a;
        y1Var.a(bool);
        int i7 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
        long j3 = this.f4149c;
        Context context = this.d;
        int i10 = this.f4150e;
        org.telegram.ui.ActionBar.h6 h6Var = this.f4151f;
        if (i7 > 0 && l10.longValue() + this.f4148b >= 100000000 + j3) {
            long longValue = l10.longValue();
            w4 w4Var = new w4(context, i10, this.f4152g, this.h, this.f4153i, this.f4154j, h6Var, y1Var, this.f4155k, this.f4156l, this.f4157m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            String N0 = hd.N0(2131749330, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749331, hd.a0(null, null, 2131749618, org.telegram.ui.Wallet.u0.t(longValue, false))));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            alertDialog$Builder.k(hd.N0(2131746549, null), new ii.h(longValue, y1Var, i10, j3, w4Var));
            alertDialog$Builder.p();
            return;
        }
        s3.e1(context, i10, h6Var, j3, 2131749613);
    }
}
