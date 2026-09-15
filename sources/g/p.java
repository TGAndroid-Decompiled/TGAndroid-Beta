package g;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class p {
    public Object f9269a;
    public Object f9270b;

    public p(Context context) {
        this.f9269a = context;
    }

    public void c() {
        androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.f9269a;
        if (gVar != null) {
            try {
                ((s) this.f9270b).e.unregisterReceiver(gVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f9269a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.l) this.f9270b) == null) {
                this.f9270b = new a0.l(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.l) this.f9270b).get(aVar);
            if (menuItem2 == null) {
                l.r rVar = new l.r((Context) this.f9269a, aVar);
                ((a0.l) this.f9270b).put(aVar, rVar);
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
        ((SparseIntArray) this.f9269a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.g) this.f9269a) == null) {
            this.f9269a = new androidx.mediarouter.app.g(this, 3);
        }
        ((s) this.f9270b).e.registerReceiver((androidx.mediarouter.app.g) this.f9269a, d);
    }

    public p() {
        this.f9269a = new SparseIntArray();
        this.f9270b = new SparseIntArray();
    }

    public p(s sVar) {
        this.f9270b = sVar;
    }
}
