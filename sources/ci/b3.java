package ci;

import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
public final class b3 implements Runnable {
    public final int f4859a;
    public final ai.n0 f4860b;
    public final org.telegram.ui.Components.hc[] f4861c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String f4862e;

    public b3(ai.n0 n0Var, org.telegram.ui.Components.hc[] hcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i3) {
        this.f4859a = i3;
        this.f4860b = n0Var;
        this.f4861c = hcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.f4862e = str;
    }

    @Override
    public final void run() {
        int i3 = this.f4859a;
        String str = this.f4862e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.hc[] hcVarArr = this.f4861c;
        ai.n0 n0Var = this.f4860b;
        switch (i3) {
            case 0:
                n0Var.a(hcVarArr[0], bd.a0(null, null, 2131749587, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                n0Var.a(hcVarArr[0], bd.a0(null, null, 2131749595, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
