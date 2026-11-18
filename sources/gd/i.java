package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13484a;
    public volatile Object f13485b;
    public final Object f13486c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13484a = initializer;
        this.f13485b = j.f13487a;
        this.f13486c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13485b;
        j jVar = j.f13487a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13486c) {
            obj = this.f13485b;
            if (obj == jVar) {
                rd.a aVar = this.f13484a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13485b = obj;
                this.f13484a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13485b != j.f13487a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
