package ai;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 implements Runnable {
    public final int f2143a;
    public final s0 f2144b;
    public final org.telegram.ui.Components.zc[] f2145c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public s3(s0 s0Var, org.telegram.ui.Components.zc[] zcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f2143a = i10;
        this.f2144b = s0Var;
        this.f2145c = zcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f2143a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.zc[] zcVarArr = this.f2145c;
        s0 s0Var = this.f2144b;
        switch (i10) {
            case 0:
                s0Var.run(zcVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                s0Var.run(zcVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
