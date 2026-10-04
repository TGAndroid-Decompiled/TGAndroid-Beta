package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f12037a;
    public final Map f12038b;

    public c(String str, Map map) {
        this.f12037a = str;
        this.f12038b = map;
    }

    public static y a(String str) {
        return new y(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12038b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12037a.equals(cVar.f12037a) && this.f12038b.equals(cVar.f12038b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12038b.hashCode() + (this.f12037a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12037a + ", properties=" + this.f12038b.values() + "}";
    }
}
