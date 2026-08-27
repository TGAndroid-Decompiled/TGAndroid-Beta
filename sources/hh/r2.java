package hh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;

public final class r2 implements Runnable {

    public final int f9977a;

    public final gh.d0 f9978b;

    public final oc[] f9979c;
    public final TL_stars.UniqueStarGiftValueInfo d;

    public final String f9980e;

    public r2(gh.d0 d0Var, oc[] ocVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f9977a = i10;
        this.f9978b = d0Var;
        this.f9979c = ocVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f9980e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f9977a;
        String str = this.f9980e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        oc[] ocVarArr = this.f9979c;
        gh.d0 d0Var = this.f9978b;
        switch (i10) {
            case 0:
                d0Var.run(ocVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                d0Var.run(ocVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
