package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9616a;
    public volatile Object f9617b;
    public final Object f9618c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9616a = initializer;
        this.f9617b = h.f9619a;
        this.f9618c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9617b;
        h hVar = h.f9619a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9618c) {
            obj = this.f9617b;
            if (obj == hVar) {
                rd.a aVar = this.f9616a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9617b = obj;
                this.f9616a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9617b != h.f9619a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
