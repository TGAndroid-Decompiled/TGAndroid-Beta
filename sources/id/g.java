package id;

import java.io.Serializable;
public final class g implements c, Serializable {
    public td.a f12775a;
    public volatile Object f12776b;
    public final Object f12777c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f12775a = initializer;
        this.f12776b = h.f12778a;
        this.f12777c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f12776b;
        h hVar = h.f12778a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f12777c) {
            obj = this.f12776b;
            if (obj == hVar) {
                td.a aVar = this.f12775a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f12776b = obj;
                this.f12775a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f12776b != h.f12778a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
