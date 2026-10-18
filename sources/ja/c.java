package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f14367a;
    public final Map f14368b;

    public c(String str, Map map) {
        this.f14367a = str;
        this.f14368b = map;
    }

    public static s a(String str) {
        return new s(str, 26);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f14368b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f14367a.equals(cVar.f14367a) && this.f14368b.equals(cVar.f14368b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14368b.hashCode() + (this.f14367a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f14367a + ", properties=" + this.f14368b.values() + "}";
    }
}
