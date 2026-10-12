package ji;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f13101u = 1;
    public final long f13102a;
    public TL_iv.PageBlock f13103b;
    public int f13104c;
    public int d;
    public boolean e;
    public boolean f13105f;
    public u f13106g;
    public ArrayList h;
    public boolean f13107i;
    public final ArrayList f13108j;
    public final ArrayList f13109k;
    public int f13110l;
    public int f13111m;
    public boolean f13112n;
    public boolean f13113o;
    public boolean f13114p;
    public boolean f13115q;
    public boolean f13116r;
    public boolean f13117s;
    public long f13118t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f13104c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f13104c > 0) {
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
        this.f13108j = new ArrayList();
        this.f13109k = new ArrayList();
        this.f13103b = pageBlock;
        this.f13104c = i10;
        this.d = i11;
        this.f13102a = j10;
    }
}
