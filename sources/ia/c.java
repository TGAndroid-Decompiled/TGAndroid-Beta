package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.x;
public final class c {
    public final String f12086a;
    public final Map f12087b;

    public c(String str, Map map) {
        this.f12086a = str;
        this.f12087b = map;
    }

    public static x a(String str) {
        return new x(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12087b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12086a.equals(cVar.f12086a) && this.f12087b.equals(cVar.f12087b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12087b.hashCode() + (this.f12086a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12086a + ", properties=" + this.f12087b.values() + "}";
    }
}
