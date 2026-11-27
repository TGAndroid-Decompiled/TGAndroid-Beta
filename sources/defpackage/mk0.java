package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class mk0 {
    public static long u = 1;
    public final long a;
    public TL_iv.PageBlock b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public p07 g;
    public ArrayList h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;

    public mk0(TL_iv.PageBlock pageBlock, int i, int i2, long j) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = pageBlock;
        this.c = i;
        this.d = i2;
        this.a = j;
    }

    public final boolean a() {
        if (this.c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.c > 0) {
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

    public mk0(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk0.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }
}
