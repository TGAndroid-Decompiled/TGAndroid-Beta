package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f15087u = 1;
    public final long f15088a;
    public TL_iv.PageBlock f15089b;
    public int f15090c;
    public int d;
    public boolean e;
    public boolean f15091f;
    public t f15092g;
    public ArrayList h;
    public boolean f15093i;
    public final ArrayList f15094j;
    public final ArrayList f15095k;
    public int f15096l;
    public int f15097m;
    public boolean f15098n;
    public boolean f15099o;
    public boolean f15100p;
    public boolean f15101q;
    public boolean f15102r;
    public boolean f15103s;
    public long f15104t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f15090c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15090c > 0) {
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
        this.f15094j = new ArrayList();
        this.f15095k = new ArrayList();
        this.f15089b = pageBlock;
        this.f15090c = i10;
        this.d = i11;
        this.f15088a = j10;
    }
}
