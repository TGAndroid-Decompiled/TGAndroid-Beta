package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tna implements p8c {
    public final vqa a;
    public final du4 b;
    public final oj c;
    public final TL_stars.TL_starGiftUnique d;
    public final long e;
    public final TLRPC.TL_textWithEntities f;
    public final boolean g;

    public tna(vqa vqaVar, du4 du4Var, oj ojVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        this.a = vqaVar;
        this.b = du4Var;
        this.c = ojVar;
        this.d = tL_starGiftUnique;
        this.e = j;
        this.f = tL_textWithEntities;
        this.g = z;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final vqa vqaVar = this.a;
        vqaVar.f2.setLoading(false);
        final du4 du4Var = this.b;
        if (du4Var != null && du4Var.F1) {
            du4Var.F1 = false;
            du4Var.B1.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ypa ypaVar = new ypa(this.c, tL_payments_paymentFormStarGift);
        Context context = vqaVar.getContext();
        wjb wjbVar = vqaVar.J0;
        int i = vqaVar.a;
        String s1 = vqaVar.s1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z = this.g;
        aqa aqaVar = new aqa(context, wjbVar, tL_starGiftUnique, ypaVar, i, j, s1, false, new i8c() {
            @Override
            public final void a(Object obj2, Object obj3) {
                ypa ypaVar2 = (ypa) obj2;
                c01 c01Var = (c01) obj3;
                c01Var.d();
                vqa vqaVar2 = vqa.this;
                gta u = gta.u(vqaVar2.a, ypaVar2.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = ypaVar2.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j2 = j;
                u.f(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j2, tL_textWithEntities, z, new a08(vqaVar2, c01Var, tL_starGiftUnique2, j2, du4Var, (byte) 1));
            }
        });
        aqaVar.o = tL_textWithEntities;
        aqaVar.p = z;
        aqaVar.b();
    }
}
