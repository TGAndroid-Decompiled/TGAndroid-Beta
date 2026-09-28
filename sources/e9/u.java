package e9;

import java.util.Map;
import v7.t6;
public final class u extends m {
    public final Object f8112a;
    public int f8113b;
    public final v f8114c;

    public u(v vVar, int i10) {
        this.f8114c = vVar;
        Object obj = v.f8116s;
        this.f8112a = vVar.i()[i10];
        this.f8113b = i10;
    }

    public final void a() {
        int i10 = this.f8113b;
        Object obj = this.f8112a;
        v vVar = this.f8114c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (t6.a(obj, vVar.i()[this.f8113b])) {
                return;
            }
        }
        Object obj2 = v.f8116s;
        this.f8113b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8112a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8114c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8112a);
        }
        a();
        int i10 = this.f8113b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8114c;
        Map b10 = vVar.b();
        Object obj2 = this.f8112a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8113b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8113b] = obj;
        return obj3;
    }
}
