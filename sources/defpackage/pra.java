package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class pra implements pcc {
    public final wua a;
    public final hw4 b;
    public final pj c;
    public final TL_stars.TL_starGiftUnique d;
    public final long e;
    public final TLRPC.TL_textWithEntities f;
    public final boolean g;

    public pra(wua wuaVar, hw4 hw4Var, pj pjVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        this.a = wuaVar;
        this.b = hw4Var;
        this.c = pjVar;
        this.d = tL_starGiftUnique;
        this.e = j;
        this.f = tL_textWithEntities;
        this.g = z;
    }

    @Override
    public final void a(Object obj) {
        final wua wuaVar = this.a;
        final hw4 hw4Var = this.b;
        pj pjVar = this.c;
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z = this.g;
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        wuaVar.f2.setLoading(false);
        if (hw4Var != null) {
            hw4Var.G0(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        bua buaVar = new bua(wuaVar.getContext(), wuaVar.J0, tL_starGiftUnique, new zta(pjVar, tL_payments_paymentFormStarGift), wuaVar.a, j, wuaVar.t1(), false, new icc() {
            @Override
            public final void a(Object obj2, Object obj3) {
                zta ztaVar = (zta) obj2;
                l01 l01Var = (l01) obj3;
                l01Var.d();
                wua wuaVar2 = wua.this;
                jxa u = jxa.u(wuaVar2.a, ztaVar.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = ztaVar.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j2 = j;
                u.f(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j2, tL_textWithEntities, z, new g38(wuaVar2, l01Var, tL_starGiftUnique2, j2, hw4Var, (byte) 1));
            }
        });
        buaVar.p = tL_textWithEntities;
        buaVar.q = z;
        int i = wuaVar.a;
        HashMap hashMap = it7.a;
        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && !tL_starGiftUnique.resale_ton_only && !it7.n(tL_starGiftUnique) && !tL_starGiftUnique.onchain_sale && !tL_starGiftUnique.fixed_sale && j >= 0) {
            hr hrVar = uc7.s1(i).k4;
            if (hrVar.x.f && hrVar.v0.f && tL_starGiftUnique.getResellAmount(pj.a).a() > 0) {
                buaVar.k = new us0(wuaVar, tL_starGiftUnique, j, tL_textWithEntities, z, hw4Var, (byte) 7);
            }
        }
        buaVar.b();
    }
}
