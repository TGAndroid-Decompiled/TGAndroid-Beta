package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
public final class u4 implements q10 {
    public final ai.x1 f4142a;
    public final long f4143b;
    public final long f4144c;
    public final Context d;
    public final int f4145e;
    public final org.telegram.ui.ActionBar.h6 f4146f;
    public final TL_stars.TL_starGiftUnique f4147g;
    public final long h;
    public final TLRPC.TL_textWithEntities f4148i;
    public final boolean f4149j;
    public final lc f4150k;
    public final c1.a f4151l;
    public final di.f2 f4152m;

    public u4(ai.x1 x1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.a aVar, di.f2 f2Var) {
        this.f4142a = x1Var;
        this.f4143b = j3;
        this.f4144c = j10;
        this.d = context;
        this.f4145e = i7;
        this.f4146f = h6Var;
        this.f4147g = tL_starGiftUnique;
        this.h = j11;
        this.f4148i = tL_textWithEntities;
        this.f4149j = z10;
        this.f4150k = lcVar;
        this.f4151l = aVar;
        this.f4152m = f2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        ai.x1 x1Var = this.f4142a;
        x1Var.a(bool);
        int i7 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
        long j3 = this.f4144c;
        Context context = this.d;
        int i10 = this.f4145e;
        org.telegram.ui.ActionBar.h6 h6Var = this.f4146f;
        if (i7 > 0 && l10.longValue() + this.f4143b >= 100000000 + j3) {
            long longValue = l10.longValue();
            w4 w4Var = new w4(context, i10, this.f4147g, this.h, this.f4148i, this.f4149j, h6Var, x1Var, this.f4150k, this.f4151l, this.f4152m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            String N0 = gd.N0(2131749330, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749331, gd.a0(null, null, 2131749618, org.telegram.ui.Wallet.u0.t(longValue, false))));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.k(gd.N0(2131746549, null), new ii.h(longValue, x1Var, i10, j3, w4Var));
            alertDialog$Builder.p();
            return;
        }
        s3.e1(context, i10, h6Var, j3, 2131749613);
    }
}
