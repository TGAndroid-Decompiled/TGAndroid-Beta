package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f8127a;
    public int f8128b;
    public final v f8129c;

    public u(v vVar, int i10) {
        this.f8129c = vVar;
        Object obj = v.f8131s;
        this.f8127a = vVar.i()[i10];
        this.f8128b = i10;
    }

    public final void a() {
        int i10 = this.f8128b;
        Object obj = this.f8127a;
        v vVar = this.f8129c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f8128b])) {
                return;
            }
        }
        Object obj2 = v.f8131s;
        this.f8128b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8127a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8129c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8127a);
        }
        a();
        int i10 = this.f8128b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8129c;
        Map b10 = vVar.b();
        Object obj2 = this.f8127a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8128b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8128b] = obj;
        return obj3;
    }
}
