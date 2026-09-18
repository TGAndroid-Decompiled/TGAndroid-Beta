package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9617a;
    public volatile Object f9618b;
    public final Object f9619c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9617a = initializer;
        this.f9618b = h.f9620a;
        this.f9619c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9618b;
        h hVar = h.f9620a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9619c) {
            obj = this.f9618b;
            if (obj == hVar) {
                rd.a aVar = this.f9617a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9618b = obj;
                this.f9617a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9618b != h.f9620a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
