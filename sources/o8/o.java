package o8;

import java.util.Map;
public final class o extends j {
    public final Object f19064a;
    public int f19065b;
    public final p f19066c;

    public o(p pVar, int i9) {
        this.f19066c = pVar;
        Object obj = p.f19068s;
        this.f19064a = pVar.i()[i9];
        this.f19065b = i9;
    }

    public final void a() {
        int i9 = this.f19065b;
        Object obj = this.f19064a;
        p pVar = this.f19066c;
        if (i9 != -1 && i9 < pVar.size()) {
            if (g7.c0.a(obj, pVar.i()[this.f19065b])) {
                return;
            }
        }
        Object obj2 = p.f19068s;
        this.f19065b = pVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f19064a;
    }

    @Override
    public final Object getValue() {
        p pVar = this.f19066c;
        Map b10 = pVar.b();
        if (b10 != null) {
            return b10.get(this.f19064a);
        }
        a();
        int i9 = this.f19065b;
        if (i9 == -1) {
            return null;
        }
        return pVar.j()[i9];
    }

    @Override
    public final Object setValue(Object obj) {
        p pVar = this.f19066c;
        Map b10 = pVar.b();
        Object obj2 = this.f19064a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i9 = this.f19065b;
        if (i9 == -1) {
            pVar.put(obj2, obj);
            return null;
        }
        Object obj3 = pVar.j()[i9];
        pVar.j()[this.f19065b] = obj;
        return obj3;
    }
}
