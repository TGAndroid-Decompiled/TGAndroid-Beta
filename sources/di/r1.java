package di;

import android.content.Context;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r1 implements x10 {
    public final f6 f9619a;
    public final bi.g1 f9620b;
    public final cg.b f9621c;
    public final TL_stars.TL_starGiftUnique d;
    public final long f9622e;
    public final TLRPC.TL_textWithEntities f9623f;
    public final boolean f9624g;

    public r1(f6 f6Var, bi.g1 g1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.f9619a = f6Var;
        this.f9620b = g1Var;
        this.f9621c = bVar;
        this.d = tL_starGiftUnique;
        this.f9622e = j3;
        this.f9623f = tL_textWithEntities;
        this.f9624g = z10;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final f6 f6Var = this.f9619a;
        f6Var.f8779g2.setLoading(false);
        final bi.g1 g1Var = this.f9620b;
        if (g1Var != null && g1Var.G1) {
            g1Var.G1 = false;
            g1Var.C1.g(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        f5 f5Var = new f5(this.f9621c, tL_payments_paymentFormStarGift);
        Context context = f6Var.getContext();
        org.telegram.ui.ActionBar.i6 i6Var = f6Var.J0;
        int i7 = f6Var.f30187a;
        String E1 = f6Var.E1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.f9622e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f9623f;
        final boolean z10 = this.f9624g;
        h5 h5Var = new h5(context, i6Var, tL_starGiftUnique, f5Var, i7, j3, E1, false, new q10() {
            @Override
            public final void a(Object obj2, Object obj3) {
                f5 f5Var2 = (f5) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                f6 f6Var2 = f6.this;
                x8 x10 = x8.x(f6Var2.f30187a, f5Var2.f8764a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = f5Var2.f8765b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z10, new e3(f6Var2, bVar, tL_starGiftUnique2, j10, g1Var, 0));
            }
        });
        h5Var.f8933o = tL_textWithEntities;
        h5Var.f8934p = z10;
        h5Var.b();
    }
}
