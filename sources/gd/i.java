package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13169a;
    public volatile Object f13170b;
    public final Object f13171c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13169a = initializer;
        this.f13170b = j.f13172a;
        this.f13171c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13170b;
        j jVar = j.f13172a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13171c) {
            obj = this.f13170b;
            if (obj == jVar) {
                rd.a aVar = this.f13169a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13170b = obj;
                this.f13169a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13170b != j.f13172a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
