package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class lza extends nic {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final vnb e;
    public final long f;
    public h79 g;
    public vy4 h;
    public final ArrayList i = new ArrayList();

    public lza(Context context, int i, boolean z, long j, int i2, vnb vnbVar) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = vnbVar;
        this.f = j;
        i();
    }

    @Override
    public final void b(View view, int i, int i2) {
        h79 h79Var = this.g;
        if (h79Var != null) {
            h79Var.M(view);
        }
    }

    @Override
    public final View d(int i) {
        kza kzaVar = new kza(this.a, this.c, this.f, i, this.b, this.d, this.e);
        if (this.g != null) {
            kzaVar.setClipChildren(false);
            kzaVar.setClipToPadding(false);
            q9c q9cVar = kzaVar.a;
            q9cVar.setClipToPadding(false);
            q9cVar.t1(hl.L(12.0f), hl.L(16.0f), false);
            q9cVar.g3.r = false;
            q9cVar.setCaptureSectionsDecoratorAllowed(true);
            q9cVar.setOverScrollMode(0);
            vy4 vy4Var = this.h;
            if (vy4Var != null) {
                vy4Var.b(q9cVar);
            }
        }
        return kzaVar;
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
                return ob6.M0(2131744575, null);
            }
            return ob6.M0(2131744576, null);
        }
        return ob6.M0(2131744577, null);
    }

    @Override
    public final int h(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                return ((b8c) arrayList.get(i)).A;
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
            jxa v = jxa.v(i2, this.c);
            arrayList.add(b8c.D(0));
            if (v.K(1)) {
                arrayList.add(b8c.D(1));
            }
            if (v.K(2)) {
                arrayList.add(b8c.D(2));
                return;
            }
            return;
        }
        kt0 g = kt0.g(i2);
        arrayList.add(b8c.D(0));
        if (!g.k(j).a[1].isEmpty()) {
            arrayList.add(b8c.D(1));
        }
        if (!g.k(j).a[2].isEmpty()) {
            arrayList.add(b8c.D(2));
        }
    }
}
