package ci;

import android.content.Context;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements u10 {
    public final l6 f6438a;
    public final ai.i1 f6439b;
    public final dg.b f6440c;
    public final TL_stars.TL_starGiftUnique d;
    public final long f6441e;
    public final TLRPC.TL_textWithEntities f6442f;
    public final boolean f6443g;

    public z1(l6 l6Var, ai.i1 i1Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.f6438a = l6Var;
        this.f6439b = i1Var;
        this.f6440c = bVar;
        this.d = tL_starGiftUnique;
        this.f6441e = j10;
        this.f6442f = tL_textWithEntities;
        this.f6443g = z10;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final l6 l6Var = this.f6438a;
        l6Var.f5451d2.setLoading(false);
        final ai.i1 i1Var = this.f6439b;
        if (i1Var != null && i1Var.D1) {
            i1Var.D1 = false;
            i1Var.f707z1.f(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        l5 l5Var = new l5(this.f6440c, tL_payments_paymentFormStarGift);
        Context context = l6Var.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = l6Var.J0;
        int i3 = l6Var.f28583a;
        String z12 = l6Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j10 = this.f6441e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f6442f;
        final boolean z10 = this.f6443g;
        new n5(context, e6Var, tL_starGiftUnique, l5Var, i3, j10, z12, false, new n10() {
            @Override
            public final void a(Object obj2, Object obj3) {
                l5 l5Var2 = (l5) obj2;
                sf.b bVar = (sf.b) obj3;
                bVar.d();
                l6 l6Var2 = l6.this;
                e9 x10 = e9.x(l6Var2.f28583a, l5Var2.f5442a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = l5Var2.f5443b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j11 = j10;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j11, tL_textWithEntities, z10, new i3(l6Var2, bVar, tL_starGiftUnique2, j11, i1Var, 0));
            }
        }).b();
    }
}
