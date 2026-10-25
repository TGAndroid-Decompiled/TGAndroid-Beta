package bi;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class o3 implements Runnable {
    public final int f5167a;
    public final t0 f5168b;
    public final org.telegram.ui.Components.yc[] f5169c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public o3(t0 t0Var, org.telegram.ui.Components.yc[] ycVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f5167a = i10;
        this.f5168b = t0Var;
        this.f5169c = ycVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f5167a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.yc[] ycVarArr = this.f5169c;
        t0 t0Var = this.f5168b;
        switch (i10) {
            case 0:
                t0Var.run(ycVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                t0Var.run(ycVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
