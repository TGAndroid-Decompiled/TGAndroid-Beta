package mi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f19429u = 1;
    public final long f19430a;
    public TL_iv.PageBlock f19431b;
    public int f19432c;
    public int d;
    public boolean f19433e;
    public boolean f19434f;
    public s f19435g;
    public ArrayList h;
    public boolean f19436i;
    public final ArrayList f19437j;
    public final ArrayList f19438k;
    public int f19439l;
    public int f19440m;
    public boolean f19441n;
    public boolean f19442o;
    public boolean f19443p;
    public boolean f19444q;
    public boolean f19445r;
    public boolean f19446s;
    public long f19447t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f19432c > 0 && this.f19433e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f19432c > 0) {
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

    public a(TL_iv.PageBlock pageBlock, int i3, int i10, long j10) {
        this.f19437j = new ArrayList();
        this.f19438k = new ArrayList();
        this.f19431b = pageBlock;
        this.f19432c = i3;
        this.d = i10;
        this.f19430a = j10;
    }
}
