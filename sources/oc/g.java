package oc;

import java.io.Serializable;
public final class g implements c, Serializable {
    public zc.a f19193a;
    public volatile Object f19194b;
    public final Object f19195c;

    public g(zc.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f19193a = initializer;
        this.f19194b = h.f19196a;
        this.f19195c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f19194b;
        h hVar = h.f19196a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f19195c) {
            obj = this.f19194b;
            if (obj == hVar) {
                zc.a aVar = this.f19193a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f19194b = obj;
                this.f19193a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f19194b != h.f19196a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
