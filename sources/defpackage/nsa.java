package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class nsa implements Runnable {
    public final byte a;
    public final p b;
    public final y41[] c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public nsa(p pVar, y41[] y41VarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = y41VarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        y41[] y41VarArr = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.a(y41VarArr[0], ob6.a0(null, null, 2131749350, di0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                pVar.a(y41VarArr[0], ob6.a0(null, null, 2131749358, di0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
