package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
public abstract class yp {
    public Object a;
    public Object b;

    public yp() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public final void c() {
        zk zkVar = (zk) this.a;
        if (zkVar != null) {
            try {
                ((bq) this.b).e.unregisterReceiver(zkVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public final MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof aeb) {
            aeb aebVar = (aeb) menuItem;
            cka ckaVar = (cka) this.b;
            if (ckaVar == null) {
                ckaVar = new cka(0);
                this.b = ckaVar;
            }
            MenuItem menuItem2 = (MenuItem) ckaVar.get(aebVar);
            if (menuItem2 == null) {
                g27 g27Var = new g27((Context) this.a, aebVar);
                ((cka) this.b).put(aebVar, g27Var);
                return g27Var;
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
        zk zkVar = (zk) this.a;
        if (zkVar == null) {
            zkVar = new zk(this, (byte) 1);
            this.a = zkVar;
        }
        ((bq) this.b).e.registerReceiver(zkVar, d);
    }

    public yp(Context context) {
        this.a = context;
    }

    public yp(bq bqVar) {
        this.b = bqVar;
    }
}
