package e9;

import java.util.Map;
import v7.t6;
public final class u extends m {
    public final Object f8124a;
    public int f8125b;
    public final v f8126c;

    public u(v vVar, int i10) {
        this.f8126c = vVar;
        Object obj = v.f8128s;
        this.f8124a = vVar.i()[i10];
        this.f8125b = i10;
    }

    public final void a() {
        int i10 = this.f8125b;
        Object obj = this.f8124a;
        v vVar = this.f8126c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (t6.a(obj, vVar.i()[this.f8125b])) {
                return;
            }
        }
        Object obj2 = v.f8128s;
        this.f8125b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8124a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8126c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8124a);
        }
        a();
        int i10 = this.f8125b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8126c;
        Map b10 = vVar.b();
        Object obj2 = this.f8124a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8125b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8125b] = obj;
        return obj3;
    }
}
