package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
public final class q8a {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final d8a d;

    static {
        String str = hac.a;
        e = "0";
        f = "1";
        g = "2";
        h = "3";
    }

    public q8a(int i, Bundle bundle, long j, d8a d8aVar) {
        boolean z = true;
        if (d8aVar != null && i >= 0 && i != 1) {
            z = false;
        }
        jte.f(z);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (d8aVar == null && i < 0) {
            d8aVar = new d8a(i);
        }
        this.d = d8aVar;
    }

    public static q8a a(Bundle bundle) {
        d8a d8aVar;
        int i = bundle.getInt(e, -1);
        Bundle o = hac.o(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i2 = bundle2.getInt(d8a.d, 1000);
            String string = bundle2.getString(d8a.e, "");
            Bundle o2 = hac.o(bundle2.getBundle(d8a.f));
            if (o2 == null) {
                o2 = Bundle.EMPTY;
            }
            d8aVar = new d8a(string, i2, o2);
        } else if (i != 0) {
            d8aVar = new d8a(i);
        } else {
            d8aVar = null;
        }
        d8a d8aVar2 = d8aVar;
        if (o == null) {
            o = Bundle.EMPTY;
        }
        return new q8a(i, o, j, d8aVar2);
    }

    public q8a(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }
}
