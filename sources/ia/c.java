package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f11065a;
    public final Map f11066b;

    public c(String str, Map map) {
        this.f11065a = str;
        this.f11066b = map;
    }

    public static y a(String str) {
        return new y(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f11066b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11065a.equals(cVar.f11065a) && this.f11066b.equals(cVar.f11066b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11066b.hashCode() + (this.f11065a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f11065a + ", properties=" + this.f11066b.values() + "}";
    }
}
