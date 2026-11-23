package bi;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
public final class x4 implements r10 {
    public final ai.r1 f4204a;
    public final long f4205b;
    public final long f4206c;
    public final Context d;
    public final int f4207e;
    public final org.telegram.ui.ActionBar.h6 f4208f;
    public final TL_stars.TL_starGiftUnique f4209g;
    public final long h;
    public final TLRPC.TL_textWithEntities f4210i;
    public final boolean f4211j;
    public final lc f4212k;
    public final c1.c f4213l;
    public final c1.c f4214m;

    public x4(ai.r1 r1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.f4204a = r1Var;
        this.f4205b = j3;
        this.f4206c = j10;
        this.d = context;
        this.f4207e = i7;
        this.f4208f = h6Var;
        this.f4209g = tL_starGiftUnique;
        this.h = j11;
        this.f4210i = tL_textWithEntities;
        this.f4211j = z10;
        this.f4212k = lcVar;
        this.f4213l = cVar;
        this.f4214m = cVar2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        Boolean bool = Boolean.FALSE;
        ai.r1 r1Var = this.f4204a;
        r1Var.a(bool);
        int i7 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
        long j3 = this.f4206c;
        Context context = this.d;
        int i10 = this.f4207e;
        org.telegram.ui.ActionBar.h6 h6Var = this.f4208f;
        if (i7 > 0 && l10.longValue() + this.f4205b >= 100000000 + j3) {
            long longValue = l10.longValue();
            z4 z4Var = new z4(context, i10, this.f4209g, this.h, this.f4210i, this.f4211j, h6Var, r1Var, this.f4212k, this.f4213l, this.f4214m);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            String N0 = hd.N0(2131749330, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749331, hd.a0(null, null, 2131749618, org.telegram.ui.Wallet.u0.t(longValue, false))));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            alertDialog$Builder.k(hd.N0(2131746549, null), new ii.h(longValue, r1Var, i10, j3, z4Var));
            alertDialog$Builder.p();
            return;
        }
        u3.e1(context, i10, h6Var, j3, 2131749613);
    }
}
