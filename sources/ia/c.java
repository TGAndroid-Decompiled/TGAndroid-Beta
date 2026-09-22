package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f11063a;
    public final Map f11064b;

    public c(String str, Map map) {
        this.f11063a = str;
        this.f11064b = map;
    }

    public static y a(String str) {
        return new y(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f11064b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11063a.equals(cVar.f11063a) && this.f11064b.equals(cVar.f11064b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11064b.hashCode() + (this.f11063a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f11063a + ", properties=" + this.f11064b.values() + "}";
    }
}
