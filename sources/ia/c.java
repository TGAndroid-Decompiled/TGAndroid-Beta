package ia;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
public final class c {
    public final String f10545a;
    public final Map f10546b;

    public c(String str, Map map) {
        this.f10545a = str;
        this.f10546b = map;
    }

    public static of.b a(String str) {
        return new of.b(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f10546b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10545a.equals(cVar.f10545a) && this.f10546b.equals(cVar.f10546b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10546b.hashCode() + (this.f10545a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f10545a + ", properties=" + this.f10546b.values() + "}";
    }
}
