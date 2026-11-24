package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class lqa implements Runnable {
    public final byte a;
    public final p b;
    public final x51[] c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public lqa(p pVar, x51[] x51VarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = x51VarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        x51[] x51VarArr = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.a(x51VarArr[0], jb6.a0(null, null, 2131749353, cj0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                pVar.a(x51VarArr[0], jb6.a0(null, null, 2131749361, cj0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
