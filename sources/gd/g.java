package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f10612a;
    public volatile Object f10613b;
    public final Object f10614c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f10612a = initializer;
        this.f10613b = h.f10615a;
        this.f10614c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f10613b;
        h hVar = h.f10615a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f10614c) {
            obj = this.f10613b;
            if (obj == hVar) {
                rd.a aVar = this.f10612a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f10613b = obj;
                this.f10612a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f10613b != h.f10615a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
