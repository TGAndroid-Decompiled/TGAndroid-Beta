package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13481a;
    public volatile Object f13482b;
    public final Object f13483c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13481a = initializer;
        this.f13482b = j.f13484a;
        this.f13483c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13482b;
        j jVar = j.f13484a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13483c) {
            obj = this.f13482b;
            if (obj == jVar) {
                rd.a aVar = this.f13481a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13482b = obj;
                this.f13481a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13482b != j.f13484a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
