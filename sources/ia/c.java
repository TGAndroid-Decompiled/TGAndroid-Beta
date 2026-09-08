package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f11958a;
    public final Map f11959b;

    public c(String str, Map map) {
        this.f11958a = str;
        this.f11959b = map;
    }

    public static y a(String str) {
        return new y(str, 18);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f11959b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11958a.equals(cVar.f11958a) && this.f11959b.equals(cVar.f11959b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11959b.hashCode() + (this.f11958a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f11958a + ", properties=" + this.f11959b.values() + "}";
    }
}
