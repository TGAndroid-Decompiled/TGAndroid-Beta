package ad;

import java.io.Serializable;
public final class h implements c, Serializable {
    public ld.a f397a;
    public volatile Object f398b;
    public final Object f399c;

    public h(ld.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f397a = initializer;
        this.f398b = i.f400a;
        this.f399c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f398b;
        i iVar = i.f400a;
        if (obj2 != iVar) {
            return obj2;
        }
        synchronized (this.f399c) {
            obj = this.f398b;
            if (obj == iVar) {
                ld.a aVar = this.f397a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.f398b = obj;
                this.f397a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f398b != i.f400a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
