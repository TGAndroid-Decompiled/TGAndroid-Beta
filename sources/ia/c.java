package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f11932a;
    public final Map f11933b;

    public c(String str, Map map) {
        this.f11932a = str;
        this.f11933b = map;
    }

    public static y a(String str) {
        return new y(str, 18);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f11933b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11932a.equals(cVar.f11932a) && this.f11933b.equals(cVar.f11933b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11933b.hashCode() + (this.f11932a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f11932a + ", properties=" + this.f11933b.values() + "}";
    }
}
