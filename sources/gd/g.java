package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9599a;
    public volatile Object f9600b;
    public final Object f9601c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9599a = initializer;
        this.f9600b = h.f9602a;
        this.f9601c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9600b;
        h hVar = h.f9602a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9601c) {
            obj = this.f9600b;
            if (obj == hVar) {
                rd.a aVar = this.f9599a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9600b = obj;
                this.f9599a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9600b != h.f9602a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
