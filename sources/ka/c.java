package ka;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f16499a;
    public final Map f16500b;

    public c(String str, Map map) {
        this.f16499a = str;
        this.f16500b = map;
    }

    public static s a(String str) {
        return new s(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f16500b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16499a.equals(cVar.f16499a) && this.f16500b.equals(cVar.f16500b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16500b.hashCode() + (this.f16499a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f16499a + ", properties=" + this.f16500b.values() + "}";
    }
}
