package f2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class v {
    public Object f5845a;
    public Object f5846b;

    public v(Context context) {
        this.f5845a = context;
    }

    public void c() {
        androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) this.f5845a;
        if (hVar != null) {
            try {
                ((g.q) this.f5846b).e.unregisterReceiver(hVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5845a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.k) this.f5846b) == null) {
                this.f5846b = new a0.k(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.k) this.f5846b).get(aVar);
            if (menuItem2 == null) {
                l.r rVar = new l.r((Context) this.f5845a, aVar);
                ((a0.k) this.f5846b).put(aVar, rVar);
                return rVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int g(int i10, int i11) {
        int i12 = i(i10);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = i(i15);
            i13 += i16;
            if (i13 == i11) {
                i14++;
                i13 = 0;
            } else if (i13 > i11) {
                i14++;
                i13 = i16;
            }
        }
        if (i13 + i12 > i11) {
            return i14 + 1;
        }
        return i14;
    }

    public int h(int i10, int i11) {
        int i12 = i(i10);
        if (i12 == i11) {
            return 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i(i14);
            i13 += i15;
            if (i13 == i11) {
                i13 = 0;
            } else if (i13 > i11) {
                i13 = i15;
            }
        }
        if (i12 + i13 > i11) {
            return 0;
        }
        return i13;
    }

    public abstract int i(int i10);

    public void j() {
        ((SparseIntArray) this.f5845a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.h) this.f5845a) == null) {
            this.f5845a = new androidx.mediarouter.app.h(this, 4);
        }
        ((g.q) this.f5846b).e.registerReceiver((androidx.mediarouter.app.h) this.f5845a, d);
    }

    public v() {
        this.f5845a = new SparseIntArray();
        this.f5846b = new SparseIntArray();
    }

    public v(g.q qVar) {
        this.f5846b = qVar;
    }
}
