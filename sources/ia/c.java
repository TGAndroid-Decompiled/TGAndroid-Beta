package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.x;
public final class c {
    public final String f12087a;
    public final Map f12088b;

    public c(String str, Map map) {
        this.f12087a = str;
        this.f12088b = map;
    }

    public static x a(String str) {
        return new x(str, 20);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12088b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12087a.equals(cVar.f12087a) && this.f12088b.equals(cVar.f12088b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12088b.hashCode() + (this.f12087a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12087a + ", properties=" + this.f12088b.values() + "}";
    }
}
