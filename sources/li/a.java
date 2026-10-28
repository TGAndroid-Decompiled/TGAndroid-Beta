package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f17051u = 1;
    public final long f17052a;
    public TL_iv.PageBlock f17053b;
    public int f17054c;
    public int d;
    public boolean e;
    public boolean f17055f;
    public t f17056g;
    public ArrayList h;
    public boolean f17057i;
    public final ArrayList f17058j;
    public final ArrayList f17059k;
    public int f17060l;
    public int f17061m;
    public boolean f17062n;
    public boolean f17063o;
    public boolean f17064p;
    public boolean f17065q;
    public boolean f17066r;
    public boolean f17067s;
    public long f17068t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f17054c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f17054c > 0) {
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
        this.f17058j = new ArrayList();
        this.f17059k = new ArrayList();
        this.f17053b = pageBlock;
        this.f17054c = i10;
        this.d = i11;
        this.f17052a = j10;
    }
}
