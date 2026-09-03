package lh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sc;
public final class q2 implements Runnable {
    public final int f12952a;
    public final kh.a0 f12953b;
    public final sc[] f12954c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public q2(kh.a0 a0Var, sc[] scVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f12952a = i10;
        this.f12953b = a0Var;
        this.f12954c = scVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f12952a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        sc[] scVarArr = this.f12954c;
        kh.a0 a0Var = this.f12953b;
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
