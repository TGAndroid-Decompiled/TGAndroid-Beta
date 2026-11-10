package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import m4.d0;
public final class c {
    public final String f20537a;
    public final Map f20538b;

    public c(String str, Map map) {
        this.f20537a = str;
        this.f20538b = map;
    }

    public static d0 a(String str) {
        return new d0(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f20538b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f20537a.equals(cVar.f20537a) && this.f20538b.equals(cVar.f20538b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20538b.hashCode() + (this.f20537a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f20537a + ", properties=" + this.f20538b.values() + "}";
    }
}
