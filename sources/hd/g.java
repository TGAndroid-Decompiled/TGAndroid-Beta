package hd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public sd.a f11087a;
    public volatile Object f11088b;
    public final Object f11089c;

    public g(sd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f11087a = initializer;
        this.f11088b = h.f11090a;
        this.f11089c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f11088b;
        h hVar = h.f11090a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f11089c) {
            obj = this.f11088b;
            if (obj == hVar) {
                sd.a aVar = this.f11087a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f11088b = obj;
                this.f11087a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f11088b != h.f11090a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
