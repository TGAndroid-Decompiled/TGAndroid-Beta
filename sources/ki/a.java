package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f15094u = 1;
    public final long f15095a;
    public TL_iv.PageBlock f15096b;
    public int f15097c;
    public int d;
    public boolean e;
    public boolean f15098f;
    public t f15099g;
    public ArrayList h;
    public boolean f15100i;
    public final ArrayList f15101j;
    public final ArrayList f15102k;
    public int f15103l;
    public int f15104m;
    public boolean f15105n;
    public boolean f15106o;
    public boolean f15107p;
    public boolean f15108q;
    public boolean f15109r;
    public boolean f15110s;
    public long f15111t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f15097c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15097c > 0) {
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
        this.f15101j = new ArrayList();
        this.f15102k = new ArrayList();
        this.f15096b = pageBlock;
        this.f15097c = i10;
        this.d = i11;
        this.f15095a = j10;
    }
}
