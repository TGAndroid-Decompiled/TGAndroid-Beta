package di;

import android.content.Context;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r1 implements y10 {
    public final f6 f9618a;
    public final bi.k1 f9619b;
    public final cg.b f9620c;
    public final TL_stars.TL_starGiftUnique d;
    public final long f9621e;
    public final TLRPC.TL_textWithEntities f9622f;
    public final boolean f9623g;

    public r1(f6 f6Var, bi.k1 k1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.f9618a = f6Var;
        this.f9619b = k1Var;
        this.f9620c = bVar;
        this.d = tL_starGiftUnique;
        this.f9621e = j3;
        this.f9622f = tL_textWithEntities;
        this.f9623g = z10;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final f6 f6Var = this.f9618a;
        f6Var.f8768g2.setLoading(false);
        final bi.k1 k1Var = this.f9619b;
        if (k1Var != null && k1Var.G1) {
            k1Var.G1 = false;
            k1Var.C1.g(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        f5 f5Var = new f5(this.f9620c, tL_payments_paymentFormStarGift);
        Context context = f6Var.getContext();
        org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
        int i7 = f6Var.f30139a;
        String E1 = f6Var.E1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.f9621e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f9622f;
        final boolean z10 = this.f9623g;
        h5 h5Var = new h5(context, h6Var, tL_starGiftUnique, f5Var, i7, j3, E1, false, new r10() {
            @Override
            public final void a(Object obj2, Object obj3) {
                f5 f5Var2 = (f5) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                f6 f6Var2 = f6.this;
                y8 x10 = y8.x(f6Var2.f30139a, f5Var2.f8753a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = f5Var2.f8754b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z10, new e3(f6Var2, bVar, tL_starGiftUnique2, j10, k1Var, 0));
            }
        });
        h5Var.f8930o = tL_textWithEntities;
        h5Var.f8931p = z10;
        h5Var.b();
    }
}
