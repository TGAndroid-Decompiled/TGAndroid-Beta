package ji;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f13730u = 1;
    public final long f13731a;
    public TL_iv.PageBlock f13732b;
    public int f13733c;
    public int d;
    public boolean f13734e;
    public boolean f13735f;
    public u f13736g;
    public ArrayList h;
    public boolean f13737i;
    public final ArrayList f13738j;
    public final ArrayList f13739k;
    public int f13740l;
    public int f13741m;
    public boolean f13742n;
    public boolean f13743o;
    public boolean f13744p;
    public boolean f13745q;
    public boolean f13746r;
    public boolean f13747s;
    public long f13748t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f13733c > 0 && this.f13734e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f13733c > 0) {
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

    public a(TL_iv.PageBlock pageBlock, int i10, int i11, long j3) {
        this.f13738j = new ArrayList();
        this.f13739k = new ArrayList();
        this.f13732b = pageBlock;
        this.f13733c = i10;
        this.d = i11;
        this.f13731a = j3;
    }
}
