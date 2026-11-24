package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
public final class wa4 {
    public final String a;
    public final Map b;

    public wa4(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static lx6 a(String str) {
        return new lx6(str);
    }

    public static wa4 c(String str) {
        return new wa4(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wa4) {
                wa4 wa4Var = (wa4) obj;
                if (this.a.equals(wa4Var.a) && this.b.equals(wa4Var.b)) {
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
