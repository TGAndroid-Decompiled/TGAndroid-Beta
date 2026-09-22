package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9613a;
    public volatile Object f9614b;
    public final Object f9615c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9613a = initializer;
        this.f9614b = h.f9616a;
        this.f9615c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9614b;
        h hVar = h.f9616a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9615c) {
            obj = this.f9614b;
            if (obj == hVar) {
                rd.a aVar = this.f9613a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9614b = obj;
                this.f9613a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9614b != h.f9616a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
