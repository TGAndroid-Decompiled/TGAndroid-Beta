package defpackage;

import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Map;
public final class pe8 {
    public byte a;
    public Object b;
    public Object c;

    public pe8() {
        this.b = DesugarCollections.synchronizedMap(new vla(0));
        this.a = (byte) 0;
    }

    public final void a(String str, c36 c36Var) {
        Map map = (Map) this.b;
        if (!map.containsKey(str)) {
            map.put(str, c36Var);
            if (this.a > 0) {
                new b99(Looper.getMainLooper(), (byte) 4).post(new uy1(this, c36Var, str, (byte) 5));
                return;
            }
            return;
        }
        lq5.j(qu6.o("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            c36 c36Var = (c36) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            c36Var.onCreate(bundle2);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((c36) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public pe8(int i) {
        this.a = i;
    }
}
