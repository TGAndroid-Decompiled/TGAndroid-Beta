package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13827a;
    public volatile Object f13828b;
    public final Object f13829c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13827a = initializer;
        this.f13828b = j.f13830a;
        this.f13829c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13828b;
        j jVar = j.f13830a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13829c) {
            obj = this.f13828b;
            if (obj == jVar) {
                rd.a aVar = this.f13827a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13828b = obj;
                this.f13827a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13828b != j.f13830a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
