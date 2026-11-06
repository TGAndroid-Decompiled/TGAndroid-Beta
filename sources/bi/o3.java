package bi;

import org.telegram.tgnet.tl.TL_stars;
public final class o3 implements Runnable {
    public final int f4451a;
    public final t0 f4452b;
    public final org.telegram.ui.Components.jc[] f4453c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f4454e;

    public o3(t0 t0Var, org.telegram.ui.Components.jc[] jcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.f4451a = i7;
        this.f4452b = t0Var;
        this.f4453c = jcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f4454e = str;
    }

    @Override
    public final void run() {
        int i7 = this.f4451a;
        String str = this.f4454e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.jc[] jcVarArr = this.f4453c;
        t0 t0Var = this.f4452b;
        switch (i7) {
            case 0:
                t0Var.a(jcVarArr[0], org.telegram.messenger.hd.a0(null, null, 2131749578, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                t0Var.a(jcVarArr[0], org.telegram.messenger.hd.a0(null, null, 2131749586, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
