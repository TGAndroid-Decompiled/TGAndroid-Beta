package defpackage;

import java.lang.reflect.Method;
public final class ej2 {
    public final byte a;
    public final Method b;

    public ej2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ej2) {
                ej2 ej2Var = (ej2) obj;
                if (this.a == ej2Var.a && this.b.getName().equals(ej2Var.b.getName())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
