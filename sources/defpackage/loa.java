package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class loa implements Runnable {
    public final byte a;
    public final p b;
    public final q41[] c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public loa(p pVar, q41[] q41VarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = q41VarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        q41[] q41VarArr = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.a(q41VarArr[0], k96.a0(null, null, 2131749404, ci0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                pVar.a(q41VarArr[0], k96.a0(null, null, 2131749412, ci0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
