package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f12949a;
    public final Map f12950b;

    public c(String str, Map map) {
        this.f12949a = str;
        this.f12950b = map;
    }

    public static s a(String str) {
        return new s(str, 24);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12950b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12949a.equals(cVar.f12949a) && this.f12950b.equals(cVar.f12950b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12950b.hashCode() + (this.f12949a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12949a + ", properties=" + this.f12950b.values() + "}";
    }
}
