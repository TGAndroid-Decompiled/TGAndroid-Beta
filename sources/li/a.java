package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f17052u = 1;
    public final long f17053a;
    public TL_iv.PageBlock f17054b;
    public int f17055c;
    public int d;
    public boolean e;
    public boolean f17056f;
    public t f17057g;
    public ArrayList h;
    public boolean f17058i;
    public final ArrayList f17059j;
    public final ArrayList f17060k;
    public int f17061l;
    public int f17062m;
    public boolean f17063n;
    public boolean f17064o;
    public boolean f17065p;
    public boolean f17066q;
    public boolean f17067r;
    public boolean f17068s;
    public long f17069t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f17055c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f17055c > 0) {
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
        this.f17059j = new ArrayList();
        this.f17060k = new ArrayList();
        this.f17054b = pageBlock;
        this.f17055c = i10;
        this.d = i11;
        this.f17053a = j10;
    }
}
