package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f11199u = 1;
    public final long f11200a;
    public TL_iv.PageBlock f11201b;
    public int f11202c;
    public int d;
    public boolean e;
    public boolean f11203f;
    public u f11204g;
    public ArrayList h;
    public boolean f11205i;
    public final ArrayList f11206j;
    public final ArrayList f11207k;
    public int f11208l;
    public int f11209m;
    public boolean f11210n;
    public boolean f11211o;
    public boolean f11212p;
    public boolean f11213q;
    public boolean f11214r;
    public boolean f11215s;
    public long f11216t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f11202c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11202c > 0) {
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
        this.f11206j = new ArrayList();
        this.f11207k = new ArrayList();
        this.f11201b = pageBlock;
        this.f11202c = i10;
        this.d = i11;
        this.f11200a = j3;
    }
}
