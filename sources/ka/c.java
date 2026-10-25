package ka;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f16500a;
    public final Map f16501b;

    public c(String str, Map map) {
        this.f16500a = str;
        this.f16501b = map;
    }

    public static s a(String str) {
        return new s(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f16501b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16500a.equals(cVar.f16500a) && this.f16501b.equals(cVar.f16501b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16501b.hashCode() + (this.f16500a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f16500a + ", properties=" + this.f16501b.values() + "}";
    }
}
