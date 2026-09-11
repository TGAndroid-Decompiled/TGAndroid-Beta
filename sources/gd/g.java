package gd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public rd.a f10584a;
    public volatile Object f10585b;
    public final Object f10586c;

    public g(rd.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f10584a = initializer;
        this.f10585b = h.f10587a;
        this.f10586c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f10585b;
        h hVar = h.f10587a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f10586c) {
            obj = this.f10585b;
            if (obj == hVar) {
                rd.a aVar = this.f10584a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f10585b = obj;
                this.f10584a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f10585b != h.f10587a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
