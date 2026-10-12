package g;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class o {
    public Object f9776a;
    public Object f9777b;

    public o(Context context) {
        this.f9776a = context;
    }

    public void c() {
        androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.f9776a;
        if (fVar != null) {
            try {
                ((r) this.f9777b).e.unregisterReceiver(fVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f9776a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.l) this.f9777b) == null) {
                this.f9777b = new a0.l(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.l) this.f9777b).get(aVar);
            if (menuItem2 == null) {
                l.r rVar = new l.r((Context) this.f9776a, aVar);
                ((a0.l) this.f9777b).put(aVar, rVar);
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
        ((SparseIntArray) this.f9776a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.f) this.f9776a) == null) {
            this.f9776a = new androidx.mediarouter.app.f(this, 3);
        }
        ((r) this.f9777b).e.registerReceiver((androidx.mediarouter.app.f) this.f9776a, d);
    }

    public o() {
        this.f9776a = new SparseIntArray();
        this.f9777b = new SparseIntArray();
    }

    public o(r rVar) {
        this.f9777b = rVar;
    }
}
