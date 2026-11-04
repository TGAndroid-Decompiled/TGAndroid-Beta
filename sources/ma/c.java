package ma;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
public final class c {
    public final String f19220a;
    public final Map f19221b;

    public c(String str, Map map) {
        this.f19220a = str;
        this.f19221b = map;
    }

    public static tf.b a(String str) {
        return new tf.b(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f19221b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f19220a.equals(cVar.f19220a) && this.f19221b.equals(cVar.f19221b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19221b.hashCode() + (this.f19220a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f19220a + ", properties=" + this.f19221b.values() + "}";
    }
}
