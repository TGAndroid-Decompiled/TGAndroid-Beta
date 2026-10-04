package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f12036a;
    public final Map f12037b;

    public c(String str, Map map) {
        this.f12036a = str;
        this.f12037b = map;
    }

    public static y a(String str) {
        return new y(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12037b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12036a.equals(cVar.f12036a) && this.f12037b.equals(cVar.f12037b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12037b.hashCode() + (this.f12036a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12036a + ", properties=" + this.f12037b.values() + "}";
    }
}
