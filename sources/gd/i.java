package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13476a;
    public volatile Object f13477b;
    public final Object f13478c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13476a = initializer;
        this.f13477b = j.f13479a;
        this.f13478c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13477b;
        j jVar = j.f13479a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13478c) {
            obj = this.f13477b;
            if (obj == jVar) {
                rd.a aVar = this.f13476a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13477b = obj;
                this.f13476a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13477b != j.f13479a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
