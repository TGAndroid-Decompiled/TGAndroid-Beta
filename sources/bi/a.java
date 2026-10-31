package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f2816u = 1;
    public final long f2817a;
    public TL_iv.PageBlock f2818b;
    public int f2819c;
    public int d;
    public boolean e;
    public boolean f2820f;
    public w f2821g;
    public ArrayList h;
    public boolean f2822i;
    public final ArrayList f2823j;
    public final ArrayList f2824k;
    public int f2825l;
    public int f2826m;
    public boolean f2827n;
    public boolean f2828o;
    public boolean f2829p;
    public boolean f2830q;
    public boolean f2831r;
    public boolean f2832s;
    public long f2833t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f2819c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f2819c > 0) {
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
        this.f2823j = new ArrayList();
        this.f2824k = new ArrayList();
        this.f2818b = pageBlock;
        this.f2819c = i10;
        this.d = i11;
        this.f2817a = j10;
    }
}
