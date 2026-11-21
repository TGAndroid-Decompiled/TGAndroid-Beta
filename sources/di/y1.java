package di;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 implements x10 {
    public final int f10057a;
    public final f6 f10058b;
    public final bi.e5[] f10059c;
    public final TL_stars.TL_starGiftUnique d;

    public y1(f6 f6Var, bi.e5[] e5VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f10057a = i7;
        this.f10058b = f6Var;
        this.f10059c = e5VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool;
        Long l10 = (Long) obj;
        switch (this.f10057a) {
            case 0:
                this.f10059c[0].dismiss();
                f6 f6Var = this.f10058b;
                Context context = f6Var.getContext();
                int i7 = f6Var.f30170a;
                long longValue = l10.longValue();
                org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
                hi.e eVar = f6Var.f8803g2;
                Objects.requireNonNull(eVar);
                ai.h0 h0Var = new ai.h0(eVar, 3);
                org.telegram.ui.Components.lc k10 = f6Var.k();
                k1 k1Var = new k1(f6Var, 13);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    String h = bi.y4.h(tL_starGiftUnique);
                    if (tL_starGiftUnique.onchain_sale) {
                        bool = Boolean.valueOf(tL_starGiftUnique.fixed_sale);
                    } else {
                        bool = null;
                    }
                    bi.y4.o(context, i7, updatestargiftonchainprice, bool, h6Var, h0Var, k10, new bi.n4(longValue, tL_starGiftUnique, context, i7, h6Var, h, k1Var));
                    return;
                }
                return;
            default:
                this.f10059c[0].dismiss();
                f6 f6Var2 = this.f10058b;
                Context context2 = f6Var2.getContext();
                int i10 = f6Var2.f30170a;
                long longValue2 = l10.longValue();
                org.telegram.ui.ActionBar.h6 h6Var2 = f6Var2.J0;
                hi.e eVar2 = f6Var2.f8803g2;
                Objects.requireNonNull(eVar2);
                ai.h0 h0Var2 = new ai.h0(eVar2, 3);
                org.telegram.ui.Components.lc k11 = f6Var2.k();
                k1 k1Var2 = new k1(f6Var2, 11);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    bi.y4.o(context2, i10, updatestargiftonchainprice2, Boolean.TRUE, h6Var2, h0Var2, k11, new bi.n4(tL_starGiftUnique2, longValue2, context2, i10, h6Var2, bi.y4.h(tL_starGiftUnique2), k1Var2));
                    return;
                }
                return;
        }
    }
}
