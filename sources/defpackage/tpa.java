package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tpa implements qac {
    public final wsa a;
    public final fw4 b;
    public final ok c;
    public final TL_stars.TL_starGiftUnique d;
    public final long e;
    public final TLRPC.TL_textWithEntities f;
    public final boolean g;

    public tpa(wsa wsaVar, fw4 fw4Var, ok okVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        this.a = wsaVar;
        this.b = fw4Var;
        this.c = okVar;
        this.d = tL_starGiftUnique;
        this.e = j;
        this.f = tL_textWithEntities;
        this.g = z;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final wsa wsaVar = this.a;
        wsaVar.f2.setLoading(false);
        final fw4 fw4Var = this.b;
        if (fw4Var != null && fw4Var.F1) {
            fw4Var.F1 = false;
            fw4Var.B1.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yra yraVar = new yra(this.c, tL_payments_paymentFormStarGift);
        Context context = wsaVar.getContext();
        ylb ylbVar = wsaVar.J0;
        int i = wsaVar.a;
        String s1 = wsaVar.s1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z = this.g;
        asa asaVar = new asa(context, ylbVar, tL_starGiftUnique, yraVar, i, j, s1, false, new jac() {
            @Override
            public final void a(Object obj2, Object obj3) {
                yra yraVar2 = (yra) obj2;
                k11 k11Var = (k11) obj3;
                k11Var.d();
                wsa wsaVar2 = wsa.this;
                jva u = jva.u(wsaVar2.a, yraVar2.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = yraVar2.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j2 = j;
                u.f(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j2, tL_textWithEntities, z, new d28(wsaVar2, k11Var, tL_starGiftUnique2, j2, fw4Var, (byte) 1));
            }
        });
        asaVar.o = tL_textWithEntities;
        asaVar.p = z;
        asaVar.b();
    }
}
