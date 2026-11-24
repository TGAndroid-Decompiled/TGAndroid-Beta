package defpackage;

import java.lang.reflect.Method;
public final class qh2 {
    public final byte a;
    public final Method b;

    public qh2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qh2) {
                qh2 qh2Var = (qh2) obj;
                if (this.a == qh2Var.a && this.b.getName().equals(qh2Var.b.getName())) {
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
