package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
public final class gaa {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final t9a d;

    static {
        String str = gcc.a;
        e = "0";
        f = "1";
        g = "2";
        h = "3";
    }

    public gaa(int i, Bundle bundle, long j, t9a t9aVar) {
        boolean z = true;
        if (t9aVar != null && i >= 0 && i != 1) {
            z = false;
        }
        yve.f(z);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (t9aVar == null && i < 0) {
            t9aVar = new t9a(i);
        }
        this.d = t9aVar;
    }

    public static gaa a(Bundle bundle) {
        t9a t9aVar;
        int i = bundle.getInt(e, -1);
        Bundle o = gcc.o(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i2 = bundle2.getInt(t9a.d, 1000);
            String string = bundle2.getString(t9a.e, "");
            Bundle o2 = gcc.o(bundle2.getBundle(t9a.f));
            if (o2 == null) {
                o2 = Bundle.EMPTY;
            }
            t9aVar = new t9a(string, i2, o2);
        } else if (i != 0) {
            t9aVar = new t9a(i);
        } else {
            t9aVar = null;
        }
        t9a t9aVar2 = t9aVar;
        if (o == null) {
            o = Bundle.EMPTY;
        }
        return new gaa(i, o, j, t9aVar2);
    }

    public gaa(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }
}
