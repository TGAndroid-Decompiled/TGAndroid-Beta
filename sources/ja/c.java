package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f14365a;
    public final Map f14366b;

    public c(String str, Map map) {
        this.f14365a = str;
        this.f14366b = map;
    }

    public static s a(String str) {
        return new s(str, 26);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f14366b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f14365a.equals(cVar.f14365a) && this.f14366b.equals(cVar.f14366b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14366b.hashCode() + (this.f14365a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f14365a + ", properties=" + this.f14366b.values() + "}";
    }
}
