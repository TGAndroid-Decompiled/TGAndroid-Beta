package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import ji.j;
public final class c {
    public final String f21465a;
    public final Map f21466b;

    public c(String str, Map map) {
        this.f21465a = str;
        this.f21466b = map;
    }

    public static j a(String str) {
        return new j(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f21466b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21465a.equals(cVar.f21465a) && this.f21466b.equals(cVar.f21466b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21466b.hashCode() + (this.f21465a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f21465a + ", properties=" + this.f21466b.values() + "}";
    }
}
