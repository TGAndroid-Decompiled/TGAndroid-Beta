package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
public final class w84 {
    public final String a;
    public final Map b;

    public w84(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static lv6 a(String str) {
        return new lv6(str, (byte) 26);
    }

    public static w84 c(String str) {
        return new w84(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w84) {
                w84 w84Var = (w84) obj;
                if (this.a.equals(w84Var.a) && this.b.equals(w84Var.b)) {
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
