package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f8744a;
    public volatile Object f8745b;
    public final Object f8746c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f8744a = initializer;
        this.f8745b = h.f8747a;
        this.f8746c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f8745b;
        h hVar = h.f8747a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f8746c) {
            obj = this.f8745b;
            if (obj == hVar) {
                rd.a aVar = this.f8744a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f8745b = obj;
                this.f8744a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f8745b != h.f8747a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
