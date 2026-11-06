package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import m4.d0;
public final class c {
    public final String f20529a;
    public final Map f20530b;

    public c(String str, Map map) {
        this.f20529a = str;
        this.f20530b = map;
    }

    public static d0 a(String str) {
        return new d0(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f20530b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f20529a.equals(cVar.f20529a) && this.f20530b.equals(cVar.f20530b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20530b.hashCode() + (this.f20529a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f20529a + ", properties=" + this.f20530b.values() + "}";
    }
}
