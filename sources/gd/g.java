package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9604a;
    public volatile Object f9605b;
    public final Object f9606c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9604a = initializer;
        this.f9605b = h.f9607a;
        this.f9606c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9605b;
        h hVar = h.f9607a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9606c) {
            obj = this.f9605b;
            if (obj == hVar) {
                rd.a aVar = this.f9604a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9605b = obj;
                this.f9604a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9605b != h.f9607a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
