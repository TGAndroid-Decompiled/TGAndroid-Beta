package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f14360a;
    public final Map f14361b;

    public c(String str, Map map) {
        this.f14360a = str;
        this.f14361b = map;
    }

    public static s a(String str) {
        return new s(str, 26);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f14361b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f14360a.equals(cVar.f14360a) && this.f14361b.equals(cVar.f14361b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14361b.hashCode() + (this.f14360a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f14360a + ", properties=" + this.f14361b.values() + "}";
    }
}
