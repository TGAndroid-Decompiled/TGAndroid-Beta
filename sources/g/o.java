package g;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class o {
    public Object f10146a;
    public Object f10147b;

    public o(Context context) {
        this.f10146a = context;
    }

    public void c() {
        androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.f10146a;
        if (gVar != null) {
            try {
                ((r) this.f10147b).f10170e.unregisterReceiver(gVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f10146a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.m) this.f10147b) == null) {
                this.f10147b = new a0.m(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.m) this.f10147b).get(aVar);
            if (menuItem2 == null) {
                l.r rVar = new l.r((Context) this.f10146a, aVar);
                ((a0.m) this.f10147b).put(aVar, rVar);
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
        ((SparseIntArray) this.f10146a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.g) this.f10146a) == null) {
            this.f10146a = new androidx.mediarouter.app.g(this, 3);
        }
        ((r) this.f10147b).f10170e.registerReceiver((androidx.mediarouter.app.g) this.f10146a, d);
    }

    public o() {
        this.f10146a = new SparseIntArray();
        this.f10147b = new SparseIntArray();
    }

    public o(r rVar) {
        this.f10147b = rVar;
    }
}
