package jh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vc;
public final class p2 implements Runnable {
    public final int f12605a;
    public final ih.b0 f12606b;
    public final vc[] f12607c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f12608e;

    public p2(ih.b0 b0Var, vc[] vcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f12605a = i10;
        this.f12606b = b0Var;
        this.f12607c = vcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f12608e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f12605a;
        String str = this.f12608e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        vc[] vcVarArr = this.f12607c;
        ih.b0 b0Var = this.f12606b;
        switch (i10) {
            case 0:
                b0Var.run(vcVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                b0Var.run(vcVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
