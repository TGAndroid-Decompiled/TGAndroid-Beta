package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i2 implements c20 {
    public final k7 f4028a;
    public final zh.i0 f4029b;
    public final cg.b f4030c;
    public final TL_stars.TL_starGiftUnique d;
    public final long f4031e;
    public final TLRPC.TL_textWithEntities f4032f;
    public final boolean f4033g;

    public i2(k7 k7Var, zh.i0 i0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9) {
        this.f4028a = k7Var;
        this.f4029b = i0Var;
        this.f4030c = bVar;
        this.d = tL_starGiftUnique;
        this.f4031e = j3;
        this.f4032f = tL_textWithEntities;
        this.f4033g = z9;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final k7 k7Var = this.f4028a;
        k7Var.f4168c2.setLoading(false);
        final zh.i0 i0Var = this.f4029b;
        if (i0Var != null && i0Var.C1) {
            i0Var.C1 = false;
            i0Var.f60253y1.f(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        h6 h6Var = new h6(this.f4030c, tL_payments_paymentFormStarGift);
        Context context = k7Var.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = k7Var.I0;
        int i7 = k7Var.f28612a;
        String z12 = k7Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.f4031e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f4032f;
        final boolean z9 = this.f4033g;
        new k6(context, f6Var, tL_starGiftUnique, h6Var, i7, j3, z12, false, new v10() {
            @Override
            public final void a(Object obj2, Object obj3) {
                h6 h6Var2 = (h6) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                k7 k7Var2 = k7.this;
                ea x10 = ea.x(k7Var2.f28612a, h6Var2.f3997a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = h6Var2.f3998b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z9, new w3(k7Var2, bVar, tL_starGiftUnique2, j10, i0Var, 0));
            }
        }).b();
    }
}
