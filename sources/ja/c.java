package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.q;
public final class c {
    public final String f9772a;
    public final Map f9773b;

    public c(String str, Map map) {
        this.f9772a = str;
        this.f9773b = map;
    }

    public static q a(String str) {
        return new q(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f9773b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9772a.equals(cVar.f9772a) && this.f9773b.equals(cVar.f9773b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9773b.hashCode() + (this.f9772a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9772a + ", properties=" + this.f9773b.values() + "}";
    }
}
