package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
public final class sa4 {
    public final String a;
    public final Map b;

    public sa4(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static lh2 a(String str) {
        return new lh2(str);
    }

    public static sa4 c(String str) {
        return new sa4(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sa4) {
                sa4 sa4Var = (sa4) obj;
                if (this.a.equals(sa4Var.a) && this.b.equals(sa4Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
