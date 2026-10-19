package id;

import java.io.Serializable;
public final class g implements c, Serializable {
    public td.a f12771a;
    public volatile Object f12772b;
    public final Object f12773c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f12771a = initializer;
        this.f12772b = h.f12774a;
        this.f12773c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f12772b;
        h hVar = h.f12774a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f12773c) {
            obj = this.f12772b;
            if (obj == hVar) {
                td.a aVar = this.f12771a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f12772b = obj;
                this.f12771a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f12772b != h.f12774a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
