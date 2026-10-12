package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f8799a;
    public int f8800b;
    public final v f8801c;

    public u(v vVar, int i10) {
        this.f8801c = vVar;
        Object obj = v.f8803s;
        this.f8799a = vVar.i()[i10];
        this.f8800b = i10;
    }

    public final void a() {
        int i10 = this.f8800b;
        Object obj = this.f8799a;
        v vVar = this.f8801c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f8800b])) {
                return;
            }
        }
        Object obj2 = v.f8803s;
        this.f8800b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8799a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8801c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8799a);
        }
        a();
        int i10 = this.f8800b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8801c;
        Map b10 = vVar.b();
        Object obj2 = this.f8799a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8800b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8800b] = obj;
        return obj3;
    }
}
