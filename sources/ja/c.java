package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f14410a;
    public final Map f14411b;

    public c(String str, Map map) {
        this.f14410a = str;
        this.f14411b = map;
    }

    public static s a(String str) {
        return new s(str, 26);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f14411b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f14410a.equals(cVar.f14410a) && this.f14411b.equals(cVar.f14411b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14411b.hashCode() + (this.f14410a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f14410a + ", properties=" + this.f14411b.values() + "}";
    }
}
