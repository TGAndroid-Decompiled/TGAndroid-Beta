package mh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sc;
public final class p2 implements Runnable {
    public final int f14576a;
    public final lh.a0 f14577b;
    public final sc[] f14578c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f14579e;

    public p2(lh.a0 a0Var, sc[] scVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f14576a = i10;
        this.f14577b = a0Var;
        this.f14578c = scVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f14579e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f14576a;
        String str = this.f14579e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        sc[] scVarArr = this.f14578c;
        lh.a0 a0Var = this.f14577b;
        switch (i10) {
            case 0:
                a0Var.run(scVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                a0Var.run(scVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
