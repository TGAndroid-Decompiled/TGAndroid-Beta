package hd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public sd.a f11086a;
    public volatile Object f11087b;
    public final Object f11088c;

    public g(sd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f11086a = initializer;
        this.f11087b = h.f11089a;
        this.f11088c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f11087b;
        h hVar = h.f11089a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f11088c) {
            obj = this.f11087b;
            if (obj == hVar) {
                sd.a aVar = this.f11086a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f11087b = obj;
                this.f11086a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f11087b != h.f11089a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
