package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f15095u = 1;
    public final long f15096a;
    public TL_iv.PageBlock f15097b;
    public int f15098c;
    public int d;
    public boolean e;
    public boolean f15099f;
    public t f15100g;
    public ArrayList h;
    public boolean f15101i;
    public final ArrayList f15102j;
    public final ArrayList f15103k;
    public int f15104l;
    public int f15105m;
    public boolean f15106n;
    public boolean f15107o;
    public boolean f15108p;
    public boolean f15109q;
    public boolean f15110r;
    public boolean f15111s;
    public long f15112t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f15098c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15098c > 0) {
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
        this.f15102j = new ArrayList();
        this.f15103k = new ArrayList();
        this.f15097b = pageBlock;
        this.f15098c = i10;
        this.d = i11;
        this.f15096a = j10;
    }
}
