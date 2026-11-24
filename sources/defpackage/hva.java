package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class hva extends oec {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final wjb e;
    public final long f;
    public s39 g;
    public qw4 h;
    public final ArrayList i = new ArrayList();

    public hva(Context context, int i, boolean z, long j, int i2, wjb wjbVar) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = wjbVar;
        this.f = j;
        i();
    }

    @Override
    public final void b(View view, int i, int i2) {
        s39 s39Var = this.g;
        if (s39Var != null) {
            s39Var.L(view);
        }
    }

    @Override
    public final View d(int i) {
        gva gvaVar = new gva(this.a, this.c, this.f, i, this.b, this.d, this.e);
        if (this.g != null) {
            gvaVar.setClipChildren(false);
            gvaVar.setClipToPadding(false);
            q5c q5cVar = gvaVar.a;
            q5cVar.setClipToPadding(false);
            q5cVar.s1(gl.L(12.0f), gl.L(16.0f), false);
            q5cVar.g3.r = false;
            q5cVar.setCaptureSectionsDecoratorAllowed(true);
            q5cVar.setOverScrollMode(0);
            qw4 qw4Var = this.h;
            if (qw4Var != null) {
                qw4Var.b(q5cVar);
            }
        }
        return gvaVar;
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
                return k96.M0(2131744681, null);
            }
            return k96.M0(2131744682, null);
        }
        return k96.M0(2131744683, null);
    }

    @Override
    public final int h(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                return ((c4c) arrayList.get(i)).A;
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
            gta v = gta.v(i2, this.c);
            arrayList.add(c4c.D(0));
            if (v.K(1)) {
                arrayList.add(c4c.D(1));
            }
            if (v.K(2)) {
                arrayList.add(c4c.D(2));
                return;
            }
            return;
        }
        ct0 g = ct0.g(i2);
        arrayList.add(c4c.D(0));
        if (!g.k(j).a[1].isEmpty()) {
            arrayList.add(c4c.D(1));
        }
        if (!g.k(j).a[2].isEmpty()) {
            arrayList.add(c4c.D(2));
        }
    }
}
