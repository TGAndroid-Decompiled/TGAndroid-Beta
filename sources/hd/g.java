package hd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public sd.a f11088a;
    public volatile Object f11089b;
    public final Object f11090c;

    public g(sd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f11088a = initializer;
        this.f11089b = h.f11091a;
        this.f11090c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f11089b;
        h hVar = h.f11091a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f11090c) {
            obj = this.f11089b;
            if (obj == hVar) {
                sd.a aVar = this.f11088a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f11089b = obj;
                this.f11088a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f11089b != h.f11091a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
