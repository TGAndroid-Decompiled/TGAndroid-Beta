package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import ji.l;
public final class c {
    public final String f21493a;
    public final Map f21494b;

    public c(String str, Map map) {
        this.f21493a = str;
        this.f21494b = map;
    }

    public static l a(String str) {
        return new l(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f21494b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21493a.equals(cVar.f21493a) && this.f21494b.equals(cVar.f21494b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21494b.hashCode() + (this.f21493a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f21493a + ", properties=" + this.f21494b.values() + "}";
    }
}
