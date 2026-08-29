package a9;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Collections;
import java.util.HashSet;
public final class a {
    public int f226a;
    public int f227b;
    public Object f228c;
    public final Object d;
    public final Object f229e;
    public final Object f230f;
    public Object f231g;

    public a(Class cls, Class[] clsArr) {
        this.f228c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f229e = new HashSet();
        this.f226a = 0;
        this.f227b = 0;
        this.f230f = new HashSet();
        hashSet.add(v.a(cls));
        for (Class cls2 : clsArr) {
            h7.n.a(cls2, "Null interface");
            ((HashSet) this.d).add(v.a(cls2));
        }
    }

    public void a(m mVar) {
        if (!((HashSet) this.d).contains(mVar.f257a)) {
            ((HashSet) this.f229e).add(mVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public b b() {
        boolean z10;
        if (((e) this.f231g) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new b((String) this.f228c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.f229e), this.f226a, this.f227b, (e) this.f231g, (HashSet) this.f230f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f226a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f226a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public a(v vVar, v[] vVarArr) {
        this.f228c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f229e = new HashSet();
        this.f226a = 0;
        this.f227b = 0;
        this.f230f = new HashSet();
        hashSet.add(vVar);
        for (v vVar2 : vVarArr) {
            h7.n.a(vVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, vVarArr);
    }

    public a() {
        this.f228c = new RectF();
        this.d = new Path();
        this.f229e = new RectF();
        this.f230f = new RectF();
        this.f231g = new PointF();
    }
}
