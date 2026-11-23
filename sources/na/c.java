package na;

import j6.k;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
public final class c {
    public final String f21558a;
    public final Map f21559b;

    public c(String str, Map map) {
        this.f21558a = str;
        this.f21559b = map;
    }

    public static k a(String str) {
        return new k(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f21559b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21558a.equals(cVar.f21558a) && this.f21559b.equals(cVar.f21559b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21559b.hashCode() + (this.f21558a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f21558a + ", properties=" + this.f21559b.values() + "}";
    }
}
