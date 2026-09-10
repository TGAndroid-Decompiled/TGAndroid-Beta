package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f7430a;
    public int f7431b;
    public final v f7432c;

    public u(v vVar, int i10) {
        this.f7432c = vVar;
        Object obj = v.f7434s;
        this.f7430a = vVar.i()[i10];
        this.f7431b = i10;
    }

    public final void a() {
        int i10 = this.f7431b;
        Object obj = this.f7430a;
        v vVar = this.f7432c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f7431b])) {
                return;
            }
        }
        Object obj2 = v.f7434s;
        this.f7431b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f7430a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f7432c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f7430a);
        }
        a();
        int i10 = this.f7431b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f7432c;
        Map b10 = vVar.b();
        Object obj2 = this.f7430a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f7431b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f7431b] = obj;
        return obj3;
    }
}
