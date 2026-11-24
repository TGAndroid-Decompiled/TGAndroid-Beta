package defpackage;

import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Map;
public final class ab8 {
    public byte a;
    public Object b;
    public Object c;

    public ab8() {
        this.b = DesugarCollections.synchronizedMap(new aia(0));
        this.a = (byte) 0;
    }

    public final void a(String str, y06 y06Var) {
        Map map = (Map) this.b;
        if (!map.containsKey(str)) {
            map.put(str, y06Var);
            if (this.a > 0) {
                new o59(Looper.getMainLooper(), (byte) 4).post(new ey1(this, y06Var, str, (byte) 5));
                return;
            }
            return;
        }
        w26.j(ls6.o("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            y06 y06Var = (y06) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            y06Var.onCreate(bundle2);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((y06) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public ab8(int i) {
        this.a = i;
    }
}
