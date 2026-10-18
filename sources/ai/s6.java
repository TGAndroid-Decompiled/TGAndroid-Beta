package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s6 {
    public final e7 f2149a;
    public x6 f2150b;
    public x6 f2151c;
    public x6 d;
    public o6 h;
    public o6 f2154i;
    public o6 f2155j;
    public o6 f2156k;
    public TL_stars.TL_starGiftUnique f2157l;
    public long f2158m;
    public d2 f2163r;
    public d2 f2164s;
    public float f2165t;
    public boolean f2166u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f2152f = new ArrayList();
    public final ArrayList f2153g = new ArrayList();
    public float f2159n = 0.0f;
    public boolean f2160o = false;
    public boolean f2161p = false;
    public boolean f2162q = false;

    public s6(e7 e7Var) {
        this.f2149a = e7Var;
        e7Var.f1215c.addOnAttachStateChangeListener(new m6(this, 0));
    }

    public final void a() {
        this.f2160o = false;
        this.f2149a.f1215c.c();
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.f2154i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
        o6 o6Var3 = this.f2155j;
        if (o6Var3 != null) {
            o6Var3.a();
        }
        o6 o6Var4 = this.f2156k;
        if (o6Var4 != null) {
            o6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f2160o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l6(this, 1));
        }
    }

    public final void c() {
        if (this.f2160o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q6) obj).a();
        }
        arrayList.clear();
        this.f2152f.clear();
        this.f2153g.clear();
    }
}
