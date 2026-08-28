package f2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class x {
    public Object f5559a;
    public Object f5560b;

    public x(Context context) {
        this.f5559a = context;
    }

    public void c() {
        androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) this.f5559a;
        if (hVar != null) {
            try {
                ((g.q) this.f5560b).f7015e.unregisterReceiver(hVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5559a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.k) this.f5560b) == null) {
                this.f5560b = new a0.k(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.k) this.f5560b).get(aVar);
            if (menuItem2 == null) {
                l.r rVar = new l.r((Context) this.f5559a, aVar);
                ((a0.k) this.f5560b).put(aVar, rVar);
                return rVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int g(int i9, int i10) {
        int i11 = i(i9);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i9; i14++) {
            int i15 = i(i14);
            i12 += i15;
            if (i12 == i10) {
                i13++;
                i12 = 0;
            } else if (i12 > i10) {
                i13++;
                i12 = i15;
            }
        }
        if (i12 + i11 > i10) {
            return i13 + 1;
        }
        return i13;
    }

    public int h(int i9, int i10) {
        int i11 = i(i9);
        if (i11 == i10) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = i(i13);
            i12 += i14;
            if (i12 == i10) {
                i12 = 0;
            } else if (i12 > i10) {
                i12 = i14;
            }
        }
        if (i11 + i12 > i10) {
            return 0;
        }
        return i12;
    }

    public abstract int i(int i9);

    public void j() {
        ((SparseIntArray) this.f5559a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.h) this.f5559a) == null) {
            this.f5559a = new androidx.mediarouter.app.h(this, 4);
        }
        ((g.q) this.f5560b).f7015e.registerReceiver((androidx.mediarouter.app.h) this.f5559a, d);
    }

    public x() {
        this.f5559a = new SparseIntArray();
        this.f5560b = new SparseIntArray();
    }

    public x(g.q qVar) {
        this.f5560b = qVar;
    }
}
