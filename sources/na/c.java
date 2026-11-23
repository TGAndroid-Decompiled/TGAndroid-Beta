package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import ji.k;
public final class c {
    public final String f21459a;
    public final Map f21460b;

    public c(String str, Map map) {
        this.f21459a = str;
        this.f21460b = map;
    }

    public static k a(String str) {
        return new k(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f21460b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21459a.equals(cVar.f21459a) && this.f21460b.equals(cVar.f21460b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21460b.hashCode() + (this.f21459a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f21459a + ", properties=" + this.f21460b.values() + "}";
    }
}
