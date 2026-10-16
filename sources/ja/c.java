package ja;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import n4.s;
public final class c {
    public final String f12953a;
    public final Map f12954b;

    public c(String str, Map map) {
        this.f12953a = str;
        this.f12954b = map;
    }

    public static s a(String str) {
        return new s(str, 24);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f12954b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12953a.equals(cVar.f12953a) && this.f12954b.equals(cVar.f12954b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12954b.hashCode() + (this.f12953a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12953a + ", properties=" + this.f12954b.values() + "}";
    }
}
