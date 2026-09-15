package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9612a;
    public volatile Object f9613b;
    public final Object f9614c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9612a = initializer;
        this.f9613b = h.f9615a;
        this.f9614c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9613b;
        h hVar = h.f9615a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9614c) {
            obj = this.f9613b;
            if (obj == hVar) {
                rd.a aVar = this.f9612a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9613b = obj;
                this.f9612a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9613b != h.f9615a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
