package id;

import java.io.Serializable;
public final class g implements c, Serializable {
    public td.a f11386a;
    public volatile Object f11387b;
    public final Object f11388c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f11386a = initializer;
        this.f11387b = h.f11389a;
        this.f11388c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f11387b;
        h hVar = h.f11389a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f11388c) {
            obj = this.f11387b;
            if (obj == hVar) {
                td.a aVar = this.f11386a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f11387b = obj;
                this.f11386a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f11387b != h.f11389a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
