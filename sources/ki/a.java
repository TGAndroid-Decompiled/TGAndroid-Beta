package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f15139u = 1;
    public final long f15140a;
    public TL_iv.PageBlock f15141b;
    public int f15142c;
    public int d;
    public boolean e;
    public boolean f15143f;
    public t f15144g;
    public ArrayList h;
    public boolean f15145i;
    public final ArrayList f15146j;
    public final ArrayList f15147k;
    public int f15148l;
    public int f15149m;
    public boolean f15150n;
    public boolean f15151o;
    public boolean f15152p;
    public boolean f15153q;
    public boolean f15154r;
    public boolean f15155s;
    public long f15156t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f15142c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15142c > 0) {
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
        this.f15146j = new ArrayList();
        this.f15147k = new ArrayList();
        this.f15141b = pageBlock;
        this.f15142c = i10;
        this.d = i11;
        this.f15140a = j10;
    }
}
