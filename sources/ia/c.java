package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.y;
public final class c {
    public final String f12085a;
    public final Map f12086b;

    public c(String str, Map map) {
        this.f12085a = str;
        this.f12086b = map;
    }

    public static y a(String str) {
        return new y(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12086b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12085a.equals(cVar.f12085a) && this.f12086b.equals(cVar.f12086b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12086b.hashCode() + (this.f12085a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12085a + ", properties=" + this.f12086b.values() + "}";
    }
}
