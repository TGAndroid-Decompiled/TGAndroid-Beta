package di;

import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 implements Runnable {
    public final int f8583a;
    public final bi.h0 f8584b;
    public final org.telegram.ui.Components.mc[] f8585c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f8586e;

    public c3(bi.h0 h0Var, org.telegram.ui.Components.mc[] mcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.f8583a = i7;
        this.f8584b = h0Var;
        this.f8585c = mcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f8586e = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8583a;
        String str = this.f8586e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.mc[] mcVarArr = this.f8585c;
        bi.h0 h0Var = this.f8584b;
        switch (i7) {
            case 0:
                h0Var.a(mcVarArr[0], gd.a0(null, null, 2131749403, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                h0Var.a(mcVarArr[0], gd.a0(null, null, 2131749411, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
