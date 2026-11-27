package defpackage;

import java.lang.reflect.Method;
public final class mi2 {
    public final byte a;
    public final Method b;

    public mi2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mi2) {
                mi2 mi2Var = (mi2) obj;
                if (this.a == mi2Var.a && this.b.getName().equals(mi2Var.b.getName())) {
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
