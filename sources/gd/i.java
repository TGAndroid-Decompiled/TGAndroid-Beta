package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13510a;
    public volatile Object f13511b;
    public final Object f13512c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13510a = initializer;
        this.f13511b = j.f13513a;
        this.f13512c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13511b;
        j jVar = j.f13513a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13512c) {
            obj = this.f13511b;
            if (obj == jVar) {
                rd.a aVar = this.f13510a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13511b = obj;
                this.f13510a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13511b != j.f13513a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
