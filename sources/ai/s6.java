package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s6 {
    public final e7 f2147a;
    public x6 f2148b;
    public x6 f2149c;
    public x6 d;
    public o6 h;
    public o6 f2152i;
    public o6 f2153j;
    public o6 f2154k;
    public TL_stars.TL_starGiftUnique f2155l;
    public long f2156m;
    public b2 f2161r;
    public b2 f2162s;
    public float f2163t;
    public boolean f2164u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f2150f = new ArrayList();
    public final ArrayList f2151g = new ArrayList();
    public float f2157n = 0.0f;
    public boolean f2158o = false;
    public boolean f2159p = false;
    public boolean f2160q = false;

    public s6(e7 e7Var) {
        this.f2147a = e7Var;
        e7Var.f1214c.addOnAttachStateChangeListener(new m6(this, 0));
    }

    public final void a() {
        this.f2158o = false;
        this.f2147a.f1214c.c();
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.f2152i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
        o6 o6Var3 = this.f2153j;
        if (o6Var3 != null) {
            o6Var3.a();
        }
        o6 o6Var4 = this.f2154k;
        if (o6Var4 != null) {
            o6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f2158o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l6(this, 1));
        }
    }

    public final void c() {
        if (this.f2158o) {
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
        this.f2150f.clear();
        this.f2151g.clear();
    }
}
