package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f10449a;
    public volatile Object f10450b;
    public final Object f10451c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f10449a = initializer;
        this.f10450b = h.f10452a;
        this.f10451c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f10450b;
        h hVar = h.f10452a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f10451c) {
            obj = this.f10450b;
            if (obj == hVar) {
                rd.a aVar = this.f10449a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f10450b = obj;
                this.f10449a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f10450b != h.f10452a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
