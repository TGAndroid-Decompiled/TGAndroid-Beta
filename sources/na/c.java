package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import ji.j;
public final class c {
    public final String f21101a;
    public final Map f21102b;

    public c(String str, Map map) {
        this.f21101a = str;
        this.f21102b = map;
    }

    public static j a(String str) {
        return new j(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f21102b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21101a.equals(cVar.f21101a) && this.f21102b.equals(cVar.f21102b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21102b.hashCode() + (this.f21101a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f21101a + ", properties=" + this.f21102b.values() + "}";
    }
}
