package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 {
    public final d5 f12758a;
    public x4 f12759b;
    public x4 f12760c;
    public x4 d;
    public o4 h;
    public o4 f12764i;
    public o4 f12765j;
    public o4 f12766k;
    public TL_stars.TL_starGiftUnique f12767l;
    public long f12768m;
    public t1 f12773r;
    public t1 f12774s;
    public float f12775t;
    public boolean f12776u;
    public boolean v;
    public final ArrayList f12761e = new ArrayList();
    public final ArrayList f12762f = new ArrayList();
    public final ArrayList f12763g = new ArrayList();
    public float f12769n = 0.0f;
    public boolean f12770o = false;
    public boolean f12771p = false;
    public boolean f12772q = false;

    public s4(d5 d5Var) {
        this.f12758a = d5Var;
        d5Var.f11909c.addOnAttachStateChangeListener(new df.b(this, 4));
    }

    public final void a() {
        this.f12770o = false;
        this.f12758a.f11909c.c();
        o4 o4Var = this.h;
        if (o4Var != null) {
            o4Var.a();
        }
        o4 o4Var2 = this.f12764i;
        if (o4Var2 != null) {
            o4Var2.a();
        }
        o4 o4Var3 = this.f12765j;
        if (o4Var3 != null) {
            o4Var3.a();
        }
        o4 o4Var4 = this.f12766k;
        if (o4Var4 != null) {
            o4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f12770o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new m4(this, 1));
        }
    }

    public final void c() {
        if (this.f12770o) {
            return;
        }
        ArrayList arrayList = this.f12761e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q4) obj).a();
        }
        arrayList.clear();
        this.f12762f.clear();
        this.f12763g.clear();
    }
}
