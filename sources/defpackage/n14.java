package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class n14 implements Runnable {
    public String a;
    public int b;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList(0);
    public final ArrayList s = new ArrayList(0);
    public final LongSparseArray w = new LongSparseArray(0);
    public final o14 x;

    public n14(o14 o14Var) {
        this.x = o14Var;
    }

    public final void a(Runnable runnable, boolean z) {
        String str;
        String[] F0 = gl.F0();
        if (F0.length == 0) {
            str = "";
        } else {
            str = F0[0];
        }
        hq6.d0(this.x.R.d1).b2(false, str, this.a, new o42(this, z, runnable, (byte) 1), z);
    }

    @Override
    public final void run() {
        o14 o14Var = this.x;
        t14 t14Var = o14Var.R;
        if (TextUtils.isEmpty(o14Var.O)) {
            w39 adapter = t14Var.E0.getAdapter();
            l14 l14Var = t14Var.z0;
            if (adapter != l14Var) {
                t14Var.E0.setAdapter(l14Var);
            }
            o14Var.f();
            return;
        }
        int i = o14Var.N + 1;
        o14Var.N = i;
        this.b = i;
        this.a = o14Var.O;
        o14Var.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        t14Var.H0.d(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new az3(this, (byte) 1), new m14(this, (byte) 1));
        } else {
            Utilities.B(new az3(this, (byte) 1), new m14(this, (byte) 2), new m14(this, (byte) 3), new m14(this, (byte) 4), new m14(this, (byte) 5), new m14(this, (byte) 6), new m14(this, (byte) 7));
        }
    }
}
