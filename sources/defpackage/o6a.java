package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
public final class o6a {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final b6a d;

    static {
        String str = g8c.a;
        e = "0";
        f = "1";
        g = "2";
        h = "3";
    }

    public o6a(int i, Bundle bundle, long j, b6a b6aVar) {
        boolean z = true;
        if (b6aVar != null && i >= 0 && i != 1) {
            z = false;
        }
        gre.f(z);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (b6aVar == null && i < 0) {
            b6aVar = new b6a(i);
        }
        this.d = b6aVar;
    }

    public static o6a a(Bundle bundle) {
        b6a b6aVar;
        int i = bundle.getInt(e, -1);
        Bundle o = g8c.o(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i2 = bundle2.getInt(b6a.d, 1000);
            String string = bundle2.getString(b6a.e, "");
            Bundle o2 = g8c.o(bundle2.getBundle(b6a.f));
            if (o2 == null) {
                o2 = Bundle.EMPTY;
            }
            b6aVar = new b6a(string, i2, o2);
        } else if (i != 0) {
            b6aVar = new b6a(i);
        } else {
            b6aVar = null;
        }
        b6a b6aVar2 = b6aVar;
        if (o == null) {
            o = Bundle.EMPTY;
        }
        return new o6a(i, o, j, b6aVar2);
    }

    public o6a(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }
}
