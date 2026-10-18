package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f15092u = 1;
    public final long f15093a;
    public TL_iv.PageBlock f15094b;
    public int f15095c;
    public int d;
    public boolean e;
    public boolean f15096f;
    public t f15097g;
    public ArrayList h;
    public boolean f15098i;
    public final ArrayList f15099j;
    public final ArrayList f15100k;
    public int f15101l;
    public int f15102m;
    public boolean f15103n;
    public boolean f15104o;
    public boolean f15105p;
    public boolean f15106q;
    public boolean f15107r;
    public boolean f15108s;
    public long f15109t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f15095c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15095c > 0) {
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
        this.f15099j = new ArrayList();
        this.f15100k = new ArrayList();
        this.f15094b = pageBlock;
        this.f15095c = i10;
        this.d = i11;
        this.f15093a = j10;
    }
}
