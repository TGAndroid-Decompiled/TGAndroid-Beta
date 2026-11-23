package di;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 implements y10 {
    public final int f10023a;
    public final f6 f10024b;
    public final bi.g5[] f10025c;
    public final TL_stars.TL_starGiftUnique d;

    public y1(f6 f6Var, bi.g5[] g5VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f10023a = i7;
        this.f10024b = f6Var;
        this.f10025c = g5VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool;
        Long l10 = (Long) obj;
        switch (this.f10023a) {
            case 0:
                this.f10025c[0].dismiss();
                f6 f6Var = this.f10024b;
                Context context = f6Var.getContext();
                int i7 = f6Var.f30139a;
                long longValue = l10.longValue();
                org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
                hi.d dVar = f6Var.f8768g2;
                Objects.requireNonNull(dVar);
                ai.c0 c0Var = new ai.c0(dVar, 3);
                org.telegram.ui.Components.lc k10 = f6Var.k();
                k1 k1Var = new k1(f6Var, 13);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    String h = bi.a5.h(tL_starGiftUnique);
                    if (tL_starGiftUnique.onchain_sale) {
                        bool = Boolean.valueOf(tL_starGiftUnique.fixed_sale);
                    } else {
                        bool = null;
                    }
                    bi.a5.o(context, i7, updatestargiftonchainprice, bool, h6Var, c0Var, k10, new bi.q4(longValue, tL_starGiftUnique, context, i7, h6Var, h, k1Var));
                    return;
                }
                return;
            default:
                this.f10025c[0].dismiss();
                f6 f6Var2 = this.f10024b;
                Context context2 = f6Var2.getContext();
                int i10 = f6Var2.f30139a;
                long longValue2 = l10.longValue();
                org.telegram.ui.ActionBar.h6 h6Var2 = f6Var2.J0;
                hi.d dVar2 = f6Var2.f8768g2;
                Objects.requireNonNull(dVar2);
                ai.c0 c0Var2 = new ai.c0(dVar2, 3);
                org.telegram.ui.Components.lc k11 = f6Var2.k();
                k1 k1Var2 = new k1(f6Var2, 11);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    bi.a5.o(context2, i10, updatestargiftonchainprice2, Boolean.TRUE, h6Var2, c0Var2, k11, new bi.q4(tL_starGiftUnique2, longValue2, context2, i10, h6Var2, bi.a5.h(tL_starGiftUnique2), k1Var2));
                    return;
                }
                return;
        }
    }
}
