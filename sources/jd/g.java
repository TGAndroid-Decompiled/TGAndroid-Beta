package jd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public ud.a f15576a;
    public volatile Object f15577b;
    public final Object f15578c;

    public g(ud.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f15576a = initializer;
        this.f15577b = h.f15579a;
        this.f15578c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f15577b;
        h hVar = h.f15579a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f15578c) {
            obj = this.f15577b;
            if (obj == hVar) {
                ud.a aVar = this.f15576a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f15577b = obj;
                this.f15576a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f15577b != h.f15579a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
