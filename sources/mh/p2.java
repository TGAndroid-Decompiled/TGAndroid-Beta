package mh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sc;
public final class p2 implements Runnable {
    public final int f14578a;
    public final lh.a0 f14579b;
    public final sc[] f14580c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f14581e;

    public p2(lh.a0 a0Var, sc[] scVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f14578a = i10;
        this.f14579b = a0Var;
        this.f14580c = scVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f14581e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f14578a;
        String str = this.f14581e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        sc[] scVarArr = this.f14580c;
        lh.a0 a0Var = this.f14579b;
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
