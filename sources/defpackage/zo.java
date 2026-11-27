package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class zo {
    public Object a;
    public Object b;

    public zo() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public final void c() {
        ak akVar = (ak) this.a;
        if (akVar != null) {
            try {
                ((cp) this.b).e.unregisterReceiver(akVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public final MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof ufb) {
            ufb ufbVar = (ufb) menuItem;
            vla vlaVar = (vla) this.b;
            if (vlaVar == null) {
                vlaVar = new vla(0);
                this.b = vlaVar;
            }
            MenuItem menuItem2 = (MenuItem) vlaVar.get(ufbVar);
            if (menuItem2 == null) {
                n27 n27Var = new n27((Context) this.a, ufbVar);
                ((vla) this.b).put(ufbVar, n27Var);
                return n27Var;
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
        ak akVar = (ak) this.a;
        if (akVar == null) {
            akVar = new ak(this, (byte) 1);
            this.a = akVar;
        }
        ((cp) this.b).e.registerReceiver(akVar, d);
    }

    public zo(Context context) {
        this.a = context;
    }

    public zo(cp cpVar) {
        this.b = cpVar;
    }
}
