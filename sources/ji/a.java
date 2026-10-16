package ji;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f13105u = 1;
    public final long f13106a;
    public TL_iv.PageBlock f13107b;
    public int f13108c;
    public int d;
    public boolean e;
    public boolean f13109f;
    public u f13110g;
    public ArrayList h;
    public boolean f13111i;
    public final ArrayList f13112j;
    public final ArrayList f13113k;
    public int f13114l;
    public int f13115m;
    public boolean f13116n;
    public boolean f13117o;
    public boolean f13118p;
    public boolean f13119q;
    public boolean f13120r;
    public boolean f13121s;
    public long f13122t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f13108c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f13108c > 0) {
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
        this.f13112j = new ArrayList();
        this.f13113k = new ArrayList();
        this.f13107b = pageBlock;
        this.f13108c = i10;
        this.d = i11;
        this.f13106a = j10;
    }
}
