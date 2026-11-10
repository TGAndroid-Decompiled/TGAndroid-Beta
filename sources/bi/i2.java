package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i2 implements c20 {
    public final k7 f4025a;
    public final zh.h0 f4026b;
    public final cg.b f4027c;
    public final TL_stars.TL_starGiftUnique d;
    public final long f4028e;
    public final TLRPC.TL_textWithEntities f4029f;
    public final boolean f4030g;

    public i2(k7 k7Var, zh.h0 h0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9) {
        this.f4025a = k7Var;
        this.f4026b = h0Var;
        this.f4027c = bVar;
        this.d = tL_starGiftUnique;
        this.f4028e = j3;
        this.f4029f = tL_textWithEntities;
        this.f4030g = z9;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final k7 k7Var = this.f4025a;
        k7Var.f4170f2.setLoading(false);
        final zh.h0 h0Var = this.f4026b;
        if (h0Var != null && h0Var.F1) {
            h0Var.F1 = false;
            h0Var.B1.f(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        h6 h6Var = new h6(this.f4027c, tL_payments_paymentFormStarGift);
        Context context = k7Var.getContext();
        org.telegram.ui.ActionBar.h6 h6Var2 = k7Var.I0;
        int i7 = k7Var.f28669a;
        String y12 = k7Var.y1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.f4028e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f4029f;
        final boolean z9 = this.f4030g;
        new k6(context, h6Var2, tL_starGiftUnique, h6Var, i7, j3, y12, false, new v10() {
            @Override
            public final void a(Object obj2, Object obj3) {
                h6 h6Var3 = (h6) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                k7 k7Var2 = k7.this;
                ea x10 = ea.x(k7Var2.f28669a, h6Var3.f3994a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = h6Var3.f3995b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z9, new w3(k7Var2, bVar, tL_starGiftUnique2, j10, h0Var, 0));
            }
        }).b();
    }
}
