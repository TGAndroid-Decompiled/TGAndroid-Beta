package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class i24 implements Runnable {
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
    public final j24 x;

    public i24(j24 j24Var) {
        this.x = j24Var;
    }

    public final void a(Runnable runnable, boolean z) {
        String str;
        String[] F0 = hl.F0();
        if (F0.length == 0) {
            str = "";
        } else {
            str = F0[0];
        }
        ls6.d0(this.x.R.d1).b2(false, str, this.a, new e52(this, z, runnable, (byte) 1), z);
    }

    @Override
    public final void run() {
        j24 j24Var = this.x;
        o24 o24Var = j24Var.R;
        if (TextUtils.isEmpty(j24Var.O)) {
            j79 adapter = o24Var.E0.getAdapter();
            g24 g24Var = o24Var.z0;
            if (adapter != g24Var) {
                o24Var.E0.setAdapter(g24Var);
            }
            j24Var.f();
            return;
        }
        int i = j24Var.N + 1;
        j24Var.N = i;
        this.b = i;
        this.a = j24Var.O;
        j24Var.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        o24Var.H0.d(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new vz3(this, (byte) 1), new h24(this, (byte) 1));
        } else {
            Utilities.B(new vz3(this, (byte) 1), new h24(this, (byte) 2), new h24(this, (byte) 3), new h24(this, (byte) 4), new h24(this, (byte) 5), new h24(this, (byte) 6), new h24(this, (byte) 7));
        }
    }
}
