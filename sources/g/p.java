package g;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class p {
    public Object f8402a;
    public Object f8403b;

    public p(Context context) {
        this.f8402a = context;
    }

    public void c() {
        androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.f8402a;
        if (gVar != null) {
            try {
                ((s) this.f8403b).e.unregisterReceiver(gVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f8402a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof l0.a) {
            l0.a aVar = (l0.a) menuItem;
            if (((a0.l) this.f8403b) == null) {
                this.f8403b = new a0.l(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a0.l) this.f8403b).get(aVar);
            if (menuItem2 == null) {
                l.s sVar = new l.s((Context) this.f8402a, aVar);
                ((a0.l) this.f8403b).put(aVar, sVar);
                return sVar;
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
        ((SparseIntArray) this.f8402a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.g) this.f8402a) == null) {
            this.f8402a = new androidx.mediarouter.app.g(this, 3);
        }
        ((s) this.f8403b).e.registerReceiver((androidx.mediarouter.app.g) this.f8402a, d);
    }

    public p() {
        this.f8402a = new SparseIntArray();
        this.f8403b = new SparseIntArray();
    }

    public p(s sVar) {
        this.f8403b = sVar;
    }
}
