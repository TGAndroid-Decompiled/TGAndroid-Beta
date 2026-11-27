package defpackage;

import java.util.Map;
public final class ls9 implements Map.Entry {
    public final Object a;
    public final Object b;
    public ls9 c;
    public ls9 d;

    public ls9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ls9) {
                ls9 ls9Var = (ls9) obj;
                if (this.a.equals(ls9Var.a) && this.b.equals(ls9Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
