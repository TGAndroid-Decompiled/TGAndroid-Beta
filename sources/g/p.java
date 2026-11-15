package g;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class p {
    public Object f12686a;
    public Object f12687b;

    public p(Context context) {
        this.f12686a = context;
    }

    public void c() {
        androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.f12686a;
        if (fVar != null) {
            try {
                ((s) this.f12687b).f12710e.unregisterReceiver(fVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f12686a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.l) this.f12687b) == null) {
                this.f12687b = new a0.l(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.l) this.f12687b).get(aVar);
            if (menuItem2 == null) {
                l.r rVar = new l.r((Context) this.f12686a, aVar);
                ((a0.l) this.f12687b).put(aVar, rVar);
                return rVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int g(int i7, int i10) {
        int i11 = i(i7);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i7; i14++) {
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

    public int h(int i7, int i10) {
        int i11 = i(i7);
        if (i11 == i10) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
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

    public abstract int i(int i7);

    public void j() {
        ((SparseIntArray) this.f12686a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.f) this.f12686a) == null) {
            this.f12686a = new androidx.mediarouter.app.f(this, 1);
        }
        ((s) this.f12687b).f12710e.registerReceiver((androidx.mediarouter.app.f) this.f12686a, d);
    }

    public p() {
        this.f12686a = new SparseIntArray();
        this.f12687b = new SparseIntArray();
    }

    public p(s sVar) {
        this.f12687b = sVar;
    }
}
