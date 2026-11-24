package defpackage;

import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Map;
public final class dd8 {
    public byte a;
    public Object b;
    public Object c;

    public dd8() {
        this.b = DesugarCollections.synchronizedMap(new cka(0));
        this.a = (byte) 0;
    }

    public final void a(String str, y26 y26Var) {
        Map map = (Map) this.b;
        if (!map.containsKey(str)) {
            map.put(str, y26Var);
            if (this.a > 0) {
                new q79(Looper.getMainLooper(), (byte) 4).post(new rz1(this, y26Var, str, (byte) 5));
                return;
            }
            return;
        }
        u36.j(kt6.p("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            y26 y26Var = (y26) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            y26Var.onCreate(bundle2);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((y26) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public dd8(int i) {
        this.a = i;
    }
}
