package id;

import java.io.Serializable;
public final class g implements c, Serializable {
    public td.a f11382a;
    public volatile Object f11383b;
    public final Object f11384c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f11382a = initializer;
        this.f11383b = h.f11385a;
        this.f11384c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f11383b;
        h hVar = h.f11385a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f11384c) {
            obj = this.f11383b;
            if (obj == hVar) {
                td.a aVar = this.f11382a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f11383b = obj;
                this.f11382a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f11383b != h.f11385a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
