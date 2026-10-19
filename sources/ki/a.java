package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f15093u = 1;
    public final long f15094a;
    public TL_iv.PageBlock f15095b;
    public int f15096c;
    public int d;
    public boolean e;
    public boolean f15097f;
    public t f15098g;
    public ArrayList h;
    public boolean f15099i;
    public final ArrayList f15100j;
    public final ArrayList f15101k;
    public int f15102l;
    public int f15103m;
    public boolean f15104n;
    public boolean f15105o;
    public boolean f15106p;
    public boolean f15107q;
    public boolean f15108r;
    public boolean f15109s;
    public long f15110t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f15096c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15096c > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    public a(TL_iv.PageBlock pageBlock, int i10, int i11, long j10) {
        this.f15100j = new ArrayList();
        this.f15101k = new ArrayList();
        this.f15095b = pageBlock;
        this.f15096c = i10;
        this.d = i11;
        this.f15094a = j10;
    }
}
