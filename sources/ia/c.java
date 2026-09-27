package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f11054a;
    public final Map f11055b;

    public c(String str, Map map) {
        this.f11054a = str;
        this.f11055b = map;
    }

    public static y a(String str) {
        return new y(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f11055b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11054a.equals(cVar.f11054a) && this.f11055b.equals(cVar.f11055b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11055b.hashCode() + (this.f11054a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f11054a + ", properties=" + this.f11055b.values() + "}";
    }
}
