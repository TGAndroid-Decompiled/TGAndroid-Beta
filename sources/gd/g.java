package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f9598a;
    public volatile Object f9599b;
    public final Object f9600c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f9598a = initializer;
        this.f9599b = h.f9601a;
        this.f9600c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9599b;
        h hVar = h.f9601a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f9600c) {
            obj = this.f9599b;
            if (obj == hVar) {
                rd.a aVar = this.f9598a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f9599b = obj;
                this.f9598a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9599b != h.f9601a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
