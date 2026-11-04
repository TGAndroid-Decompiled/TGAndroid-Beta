package g9;

import b8.yb;
import java.util.Map;
public final class r extends k {
    public final Object f12129a;
    public int f12130b;
    public final s f12131c;

    public r(s sVar, int i3) {
        this.f12131c = sVar;
        Object obj = s.f12138s;
        this.f12129a = sVar.k()[i3];
        this.f12130b = i3;
    }

    public final void a() {
        int i3 = this.f12130b;
        Object obj = this.f12129a;
        s sVar = this.f12131c;
        if (i3 != -1 && i3 < sVar.size()) {
            if (yb.a(obj, sVar.k()[this.f12130b])) {
                return;
            }
        }
        Object obj2 = s.f12138s;
        this.f12130b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f12129a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f12131c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f12129a);
        }
        a();
        int i3 = this.f12130b;
        if (i3 == -1) {
            return null;
        }
        return sVar.l()[i3];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f12131c;
        Map d = sVar.d();
        Object obj2 = this.f12129a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i3 = this.f12130b;
        if (i3 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i3];
        sVar.l()[this.f12130b] = obj;
        return obj3;
    }
}
