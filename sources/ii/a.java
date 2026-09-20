package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f11203u = 1;
    public final long f11204a;
    public TL_iv.PageBlock f11205b;
    public int f11206c;
    public int d;
    public boolean e;
    public boolean f11207f;
    public u f11208g;
    public ArrayList h;
    public boolean f11209i;
    public final ArrayList f11210j;
    public final ArrayList f11211k;
    public int f11212l;
    public int f11213m;
    public boolean f11214n;
    public boolean f11215o;
    public boolean f11216p;
    public boolean f11217q;
    public boolean f11218r;
    public boolean f11219s;
    public long f11220t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f11206c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11206c > 0) {
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

    public a(TL_iv.PageBlock pageBlock, int i10, int i11, long j3) {
        this.f11210j = new ArrayList();
        this.f11211k = new ArrayList();
        this.f11205b = pageBlock;
        this.f11206c = i10;
        this.d = i11;
        this.f11204a = j3;
    }
}
