package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class y24 implements Runnable {
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
    public final z24 x;

    public y24(z24 z24Var) {
        this.x = z24Var;
    }

    public final void a(Runnable runnable, boolean z) {
        String str;
        String[] F0 = gm.F0();
        if (F0.length == 0) {
            str = "";
        } else {
            str = F0[0];
        }
        hs6.d0(this.x.R.d1).b2(false, str, this.a, new z52(this, z, runnable, (byte) 1), z);
    }

    @Override
    public final void run() {
        z24 z24Var = this.x;
        e34 e34Var = z24Var.R;
        if (TextUtils.isEmpty(z24Var.O)) {
            y59 adapter = e34Var.E0.getAdapter();
            w24 w24Var = e34Var.z0;
            if (adapter != w24Var) {
                e34Var.E0.setAdapter(w24Var);
            }
            z24Var.f();
            return;
        }
        int i = z24Var.N + 1;
        z24Var.N = i;
        this.b = i;
        this.a = z24Var.O;
        z24Var.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        e34Var.H0.d(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new k04(this, (byte) 1), new x24(this, (byte) 1));
        } else {
            Utilities.B(new k04(this, (byte) 1), new x24(this, (byte) 2), new x24(this, (byte) 3), new x24(this, (byte) 4), new x24(this, (byte) 5), new x24(this, (byte) 6), new x24(this, (byte) 7));
        }
    }
}
