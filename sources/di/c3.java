package di;

import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 implements Runnable {
    public final int f8596a;
    public final bi.h0 f8597b;
    public final org.telegram.ui.Components.nc[] f8598c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f8599e;

    public c3(bi.h0 h0Var, org.telegram.ui.Components.nc[] ncVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.f8596a = i7;
        this.f8597b = h0Var;
        this.f8598c = ncVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f8599e = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8596a;
        String str = this.f8599e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.nc[] ncVarArr = this.f8598c;
        bi.h0 h0Var = this.f8597b;
        switch (i7) {
            case 0:
                h0Var.a(ncVarArr[0], gd.a0(null, null, 2131749404, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                h0Var.a(ncVarArr[0], gd.a0(null, null, 2131749412, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
