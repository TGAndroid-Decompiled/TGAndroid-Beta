package di;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
public final class u2 implements Runnable {
    public final int f9514a;
    public final bi.h0 f9515b;
    public final org.telegram.ui.Components.ec[] f9516c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f9517e;

    public u2(bi.h0 h0Var, org.telegram.ui.Components.ec[] ecVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.f9514a = i7;
        this.f9515b = h0Var;
        this.f9516c = ecVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f9517e = str;
    }

    @Override
    public final void run() {
        int i7 = this.f9514a;
        String str = this.f9517e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.ec[] ecVarArr = this.f9516c;
        bi.h0 h0Var = this.f9515b;
        switch (i7) {
            case 0:
                h0Var.a(ecVarArr[0], hd.a0(null, null, 2131749579, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                h0Var.a(ecVarArr[0], hd.a0(null, null, 2131749587, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
