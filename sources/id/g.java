package id;

import java.io.Serializable;
public final class g implements c, Serializable {
    public td.a f12773a;
    public volatile Object f12774b;
    public final Object f12775c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f12773a = initializer;
        this.f12774b = h.f12776a;
        this.f12775c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f12774b;
        h hVar = h.f12776a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f12775c) {
            obj = this.f12774b;
            if (obj == hVar) {
                td.a aVar = this.f12773a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f12774b = obj;
                this.f12773a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f12774b != h.f12776a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
