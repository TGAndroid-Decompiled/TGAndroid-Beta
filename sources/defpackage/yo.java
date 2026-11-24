package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class yo {
    public Object a;
    public Object b;

    public yo() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public final void c() {
        zj zjVar = (zj) this.a;
        if (zjVar != null) {
            try {
                ((bp) this.b).e.unregisterReceiver(zjVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public final MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof ybb) {
            ybb ybbVar = (ybb) menuItem;
            aia aiaVar = (aia) this.b;
            if (aiaVar == null) {
                aiaVar = new aia(0);
                this.b = aiaVar;
            }
            MenuItem menuItem2 = (MenuItem) aiaVar.get(ybbVar);
            if (menuItem2 == null) {
                g07 g07Var = new g07((Context) this.a, ybbVar);
                ((aia) this.b).put(ybbVar, g07Var);
                return g07Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final int g(int i, int i2) {
        int i3 = i(i);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i(i6);
            i4 += i7;
            if (i4 == i2) {
                i5++;
                i4 = 0;
            } else if (i4 > i2) {
                i5++;
                i4 = i7;
            }
        }
        if (i4 + i3 > i2) {
            return i5 + 1;
        }
        return i5;
    }

    public int h(int i, int i2) {
        int i3 = i(i);
        if (i3 != i2) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i(i5);
                i4 += i6;
                if (i4 == i2) {
                    i4 = 0;
                } else if (i4 > i2) {
                    i4 = i6;
                }
            }
            if (i3 + i4 <= i2) {
                return i4;
            }
        }
        return 0;
    }

    public abstract int i(int i);

    public final void j() {
        ((SparseIntArray) this.a).clear();
    }

    public abstract void k();

    public final void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        zj zjVar = (zj) this.a;
        if (zjVar == null) {
            zjVar = new zj(this, (byte) 1);
            this.a = zjVar;
        }
        ((bp) this.b).e.registerReceiver(zjVar, d);
    }

    public yo(Context context) {
        this.a = context;
    }

    public yo(bp bpVar) {
        this.b = bpVar;
    }
}
