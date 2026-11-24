package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class lxa extends ogc {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final ylb e;
    public final long f;
    public v59 g;
    public sy4 h;
    public final ArrayList i = new ArrayList();

    public lxa(Context context, int i, boolean z, long j, int i2, ylb ylbVar) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = ylbVar;
        this.f = j;
        i();
    }

    @Override
    public final void b(View view, int i, int i2) {
        v59 v59Var = this.g;
        if (v59Var != null) {
            v59Var.L(view);
        }
    }

    @Override
    public final View d(int i) {
        kxa kxaVar = new kxa(this.a, this.c, this.f, i, this.b, this.d, this.e);
        if (this.g != null) {
            kxaVar.setClipChildren(false);
            kxaVar.setClipToPadding(false);
            q7c q7cVar = kxaVar.a;
            q7cVar.setClipToPadding(false);
            q7cVar.s1(gm.L(12.0f), gm.L(16.0f), false);
            q7cVar.g3.r = false;
            q7cVar.setCaptureSectionsDecoratorAllowed(true);
            q7cVar.setOverScrollMode(0);
            sy4 sy4Var = this.h;
            if (sy4Var != null) {
                sy4Var.b(q7cVar);
            }
        }
        return kxaVar;
    }

    @Override
    public final int e() {
        return this.i.size();
    }

    @Override
    public final CharSequence g(int i) {
        int h = h(i);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return jb6.M0(2131744607, null);
            }
            return jb6.M0(2131744608, null);
        }
        return jb6.M0(2131744609, null);
    }

    @Override
    public final int h(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                return ((c6c) arrayList.get(i)).A;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j = this.f;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.b;
        if (i == 0) {
            jva v = jva.v(i2, this.c);
            arrayList.add(c6c.D(0));
            if (v.K(1)) {
                arrayList.add(c6c.D(1));
            }
            if (v.K(2)) {
                arrayList.add(c6c.D(2));
                return;
            }
            return;
        }
        ku0 g = ku0.g(i2);
        arrayList.add(c6c.D(0));
        if (!g.k(j).a[1].isEmpty()) {
            arrayList.add(c6c.D(1));
        }
        if (!g.k(j).a[2].isEmpty()) {
            arrayList.add(c6c.D(2));
        }
    }
}
