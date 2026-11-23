package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13513a;
    public volatile Object f13514b;
    public final Object f13515c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13513a = initializer;
        this.f13514b = j.f13516a;
        this.f13515c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13514b;
        j jVar = j.f13516a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13515c) {
            obj = this.f13514b;
            if (obj == jVar) {
                rd.a aVar = this.f13513a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13514b = obj;
                this.f13513a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13514b != j.f13516a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
