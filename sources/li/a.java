package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f18393u = 1;
    public final long f18394a;
    public TL_iv.PageBlock f18395b;
    public int f18396c;
    public int d;
    public boolean f18397e;
    public boolean f18398f;
    public s f18399g;
    public ArrayList h;
    public boolean f18400i;
    public final ArrayList f18401j;
    public final ArrayList f18402k;
    public int f18403l;
    public int f18404m;
    public boolean f18405n;
    public boolean f18406o;
    public boolean f18407p;
    public boolean f18408q;
    public boolean f18409r;
    public boolean f18410s;
    public long f18411t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f18396c > 0 && this.f18397e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f18396c > 0) {
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

    public a(TL_iv.PageBlock pageBlock, int i7, int i10, long j3) {
        this.f18401j = new ArrayList();
        this.f18402k = new ArrayList();
        this.f18395b = pageBlock;
        this.f18396c = i7;
        this.d = i10;
        this.f18394a = j3;
    }
}
