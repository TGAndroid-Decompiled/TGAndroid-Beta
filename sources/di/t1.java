package di;

import android.content.Context;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t1 implements z10 {
    public final c6 f9453a;
    public final bi.f1 f9454b;
    public final cg.b f9455c;
    public final TL_stars.TL_starGiftUnique d;
    public final long f9456e;
    public final TLRPC.TL_textWithEntities f9457f;
    public final boolean f9458g;

    public t1(c6 c6Var, bi.f1 f1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.f9453a = c6Var;
        this.f9454b = f1Var;
        this.f9455c = bVar;
        this.d = tL_starGiftUnique;
        this.f9456e = j3;
        this.f9457f = tL_textWithEntities;
        this.f9458g = z10;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final c6 c6Var = this.f9453a;
        c6Var.f8318g2.setLoading(false);
        final bi.f1 f1Var = this.f9454b;
        if (f1Var != null && f1Var.G1) {
            f1Var.G1 = false;
            f1Var.C1.g(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        c5 c5Var = new c5(this.f9455c, tL_payments_paymentFormStarGift);
        Context context = c6Var.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = c6Var.J0;
        int i7 = c6Var.f29679a;
        String z12 = c6Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.f9456e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f9457f;
        final boolean z10 = this.f9458g;
        new e5(context, e6Var, tL_starGiftUnique, c5Var, i7, j3, z12, false, new s10() {
            @Override
            public final void a(Object obj2, Object obj3) {
                c5 c5Var2 = (c5) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                c6 c6Var2 = c6.this;
                v8 x10 = v8.x(c6Var2.f29679a, c5Var2.f8303a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = c5Var2.f8304b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z10, new b3(c6Var2, bVar, tL_starGiftUnique2, j10, f1Var, 0));
            }
        }).b();
    }
}
