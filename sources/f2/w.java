package f2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;

public abstract class w {

    public Object f5850a;

    public Object f5851b;

    public w(Context context) {
        this.f5850a = context;
    }

    public void c() {
        androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.f5850a;
        if (fVar != null) {
            try {
                ((g.r) this.f5851b).f6296e.unregisterReceiver(fVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5850a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof l0.a)) {
            return menuItem;
        }
        l0.a aVar = (l0.a) menuItem;
        if (((a0.k) this.f5851b) == null) {
            this.f5851b = new a0.k(0);
        }
        MenuItem menuItem2 = (MenuItem) ((a0.k) this.f5851b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l.s sVar = new l.s((Context) this.f5850a, aVar);
        ((a0.k) this.f5851b).put(aVar, sVar);
        return sVar;
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
        return i13 + i12 > i11 ? i14 + 1 : i14;
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
        if (i12 + i13 <= i11) {
            return i13;
        }
        return 0;
    }

    public abstract int i(int i10);

    public void j() {
        ((SparseIntArray) this.f5850a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.f) this.f5850a) == null) {
            this.f5850a = new androidx.mediarouter.app.f(this, 4);
        }
        ((g.r) this.f5851b).f6296e.registerReceiver((androidx.mediarouter.app.f) this.f5850a, intentFilterD);
    }

    public w() {
        this.f5850a = new SparseIntArray();
        this.f5851b = new SparseIntArray();
    }

    public w(g.r rVar) {
        this.f5851b = rVar;
    }
}
