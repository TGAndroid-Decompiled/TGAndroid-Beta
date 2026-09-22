package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f11201u = 1;
    public final long f11202a;
    public TL_iv.PageBlock f11203b;
    public int f11204c;
    public int d;
    public boolean e;
    public boolean f11205f;
    public u f11206g;
    public ArrayList h;
    public boolean f11207i;
    public final ArrayList f11208j;
    public final ArrayList f11209k;
    public int f11210l;
    public int f11211m;
    public boolean f11212n;
    public boolean f11213o;
    public boolean f11214p;
    public boolean f11215q;
    public boolean f11216r;
    public boolean f11217s;
    public long f11218t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f11204c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11204c > 0) {
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
        this.f11208j = new ArrayList();
        this.f11209k = new ArrayList();
        this.f11203b = pageBlock;
        this.f11204c = i10;
        this.d = i11;
        this.f11202a = j3;
    }
}
