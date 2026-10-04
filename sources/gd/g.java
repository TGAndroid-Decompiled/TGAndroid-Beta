package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f10448a;
    public volatile Object f10449b;
    public final Object f10450c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f10448a = initializer;
        this.f10449b = h.f10451a;
        this.f10450c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f10449b;
        h hVar = h.f10451a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f10450c) {
            obj = this.f10449b;
            if (obj == hVar) {
                rd.a aVar = this.f10448a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f10449b = obj;
                this.f10448a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f10449b != h.f10451a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
