package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f11192u = 1;
    public final long f11193a;
    public TL_iv.PageBlock f11194b;
    public int f11195c;
    public int d;
    public boolean e;
    public boolean f11196f;
    public u f11197g;
    public ArrayList h;
    public boolean f11198i;
    public final ArrayList f11199j;
    public final ArrayList f11200k;
    public int f11201l;
    public int f11202m;
    public boolean f11203n;
    public boolean f11204o;
    public boolean f11205p;
    public boolean f11206q;
    public boolean f11207r;
    public boolean f11208s;
    public long f11209t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f11195c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11195c > 0) {
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
        this.f11199j = new ArrayList();
        this.f11200k = new ArrayList();
        this.f11194b = pageBlock;
        this.f11195c = i10;
        this.d = i11;
        this.f11193a = j3;
    }
}
