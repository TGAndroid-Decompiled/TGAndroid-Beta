package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.q;
public final class c {
    public final String f9773a;
    public final Map f9774b;

    public c(String str, Map map) {
        this.f9773a = str;
        this.f9774b = map;
    }

    public static q a(String str) {
        return new q(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f9774b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9773a.equals(cVar.f9773a) && this.f9774b.equals(cVar.f9774b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9774b.hashCode() + (this.f9773a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9773a + ", properties=" + this.f9774b.values() + "}";
    }
}
