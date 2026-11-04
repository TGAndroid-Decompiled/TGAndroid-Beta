package dd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public od.a f8797a;
    public volatile Object f8798b;
    public final Object f8799c;

    public i(od.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f8797a = initializer;
        this.f8798b = j.f8800a;
        this.f8799c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f8798b;
        j jVar = j.f8800a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f8799c) {
            obj = this.f8798b;
            if (obj == jVar) {
                od.a aVar = this.f8797a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f8798b = obj;
                this.f8797a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f8798b != j.f8800a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
