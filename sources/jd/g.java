package jd;

import java.io.Serializable;
public final class g implements c, Serializable {
    public ud.a f15575a;
    public volatile Object f15576b;
    public final Object f15577c;

    public g(ud.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f15575a = initializer;
        this.f15576b = h.f15578a;
        this.f15577c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f15576b;
        h hVar = h.f15578a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f15577c) {
            obj = this.f15576b;
            if (obj == hVar) {
                ud.a aVar = this.f15575a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f15576b = obj;
                this.f15575a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f15576b != h.f15578a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
