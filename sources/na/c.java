package na;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import ji.j;
public final class c {
    public final String f21462a;
    public final Map f21463b;

    public c(String str, Map map) {
        this.f21462a = str;
        this.f21463b = map;
    }

    public static j a(String str) {
        return new j(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f21463b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21462a.equals(cVar.f21462a) && this.f21463b.equals(cVar.f21463b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21463b.hashCode() + (this.f21462a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f21462a + ", properties=" + this.f21463b.values() + "}";
    }
}
