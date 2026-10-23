package id;

import java.io.Serializable;
public final class g implements c, Serializable {
    public td.a f12803a;
    public volatile Object f12804b;
    public final Object f12805c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f12803a = initializer;
        this.f12804b = h.f12806a;
        this.f12805c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f12804b;
        h hVar = h.f12806a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f12805c) {
            obj = this.f12804b;
            if (obj == hVar) {
                td.a aVar = this.f12803a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f12804b = obj;
                this.f12803a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f12804b != h.f12806a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
