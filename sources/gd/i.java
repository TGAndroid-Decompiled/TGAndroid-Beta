package gd;

import java.io.Serializable;
public final class i implements c, Serializable {
    public rd.a f13825a;
    public volatile Object f13826b;
    public final Object f13827c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13825a = initializer;
        this.f13826b = j.f13828a;
        this.f13827c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13826b;
        j jVar = j.f13828a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f13827c) {
            obj = this.f13826b;
            if (obj == jVar) {
                rd.a aVar = this.f13825a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f13826b = obj;
                this.f13825a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13826b != j.f13828a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
