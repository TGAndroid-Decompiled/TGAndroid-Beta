package di;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 implements Runnable {
    public final int f8584a;
    public final bi.h0 f8585b;
    public final org.telegram.ui.Components.nc[] f8586c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f8587e;

    public c3(bi.h0 h0Var, org.telegram.ui.Components.nc[] ncVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.f8584a = i7;
        this.f8585b = h0Var;
        this.f8586c = ncVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f8587e = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8584a;
        String str = this.f8587e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.nc[] ncVarArr = this.f8586c;
        bi.h0 h0Var = this.f8585b;
        switch (i7) {
            case 0:
                h0Var.a(ncVarArr[0], hd.a0(null, null, 2131749403, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                h0Var.a(ncVarArr[0], hd.a0(null, null, 2131749411, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
