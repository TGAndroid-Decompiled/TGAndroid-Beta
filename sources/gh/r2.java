package gh;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
public final class r2 implements Runnable {
    public final int f8795a;
    public final fh.f0 f8796b;
    public final qc[] f8797c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f8798e;

    public r2(fh.f0 f0Var, qc[] qcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i9) {
        this.f8795a = i9;
        this.f8796b = f0Var;
        this.f8797c = qcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f8798e = str;
    }

    @Override
    public final void run() {
        int i9 = this.f8795a;
        String str = this.f8798e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        qc[] qcVarArr = this.f8797c;
        fh.f0 f0Var = this.f8796b;
        switch (i9) {
            case 0:
                f0Var.run(qcVarArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                f0Var.run(qcVarArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
