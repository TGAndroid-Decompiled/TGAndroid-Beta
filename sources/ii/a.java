package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f11202u = 1;
    public final long f11203a;
    public TL_iv.PageBlock f11204b;
    public int f11205c;
    public int d;
    public boolean e;
    public boolean f11206f;
    public u f11207g;
    public ArrayList h;
    public boolean f11208i;
    public final ArrayList f11209j;
    public final ArrayList f11210k;
    public int f11211l;
    public int f11212m;
    public boolean f11213n;
    public boolean f11214o;
    public boolean f11215p;
    public boolean f11216q;
    public boolean f11217r;
    public boolean f11218s;
    public long f11219t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f11205c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11205c > 0) {
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
        this.f11209j = new ArrayList();
        this.f11210k = new ArrayList();
        this.f11204b = pageBlock;
        this.f11205c = i10;
        this.d = i11;
        this.f11203a = j3;
    }
}
