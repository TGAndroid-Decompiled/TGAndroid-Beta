package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9610a;
    public volatile Object f9611b;
    public final Object f9612c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9610a = initializer;
        this.f9611b = h.f9613a;
        this.f9612c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9611b;
        h hVar = h.f9613a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9612c) {
            obj = this.f9611b;
            if (obj == hVar) {
                rd.a aVar = this.f9610a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9611b = obj;
                this.f9610a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9611b != h.f9613a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
