package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f18387u = 1;
    public final long f18388a;
    public TL_iv.PageBlock f18389b;
    public int f18390c;
    public int d;
    public boolean f18391e;
    public boolean f18392f;
    public s f18393g;
    public ArrayList h;
    public boolean f18394i;
    public final ArrayList f18395j;
    public final ArrayList f18396k;
    public int f18397l;
    public int f18398m;
    public boolean f18399n;
    public boolean f18400o;
    public boolean f18401p;
    public boolean f18402q;
    public boolean f18403r;
    public boolean f18404s;
    public long f18405t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f18390c > 0 && this.f18391e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f18390c > 0) {
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
        this.f18395j = new ArrayList();
        this.f18396k = new ArrayList();
        this.f18389b = pageBlock;
        this.f18390c = i7;
        this.d = i10;
        this.f18388a = j3;
    }
}
