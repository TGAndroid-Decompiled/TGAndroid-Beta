package defpackage;

import java.io.Serializable;
public final class em2 implements sw2, Serializable {
    public final sw2 a;
    public final qw2 b;

    public em2(qw2 qw2Var, sw2 sw2Var) {
        sw2Var.getClass();
        this.a = sw2Var;
        this.b = qw2Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof em2) {
                em2 em2Var = (em2) obj;
                int i = 2;
                em2 em2Var2 = em2Var;
                int i2 = 2;
                while (true) {
                    sw2 sw2Var = em2Var2.a;
                    if (sw2Var instanceof em2) {
                        em2Var2 = (em2) sw2Var;
                    } else {
                        em2Var2 = null;
                    }
                    if (em2Var2 == null) {
                        break;
                    }
                    i2++;
                }
                em2 em2Var3 = this;
                while (true) {
                    sw2 sw2Var2 = em2Var3.a;
                    if (sw2Var2 instanceof em2) {
                        em2Var3 = (em2) sw2Var2;
                    } else {
                        em2Var3 = null;
                    }
                    if (em2Var3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        qw2 qw2Var = this.b;
                        if (!rp5.a(em2Var.get(qw2Var.getKey()), qw2Var)) {
                            z = false;
                            break;
                        }
                        sw2 sw2Var3 = this.a;
                        if (sw2Var3 instanceof em2) {
                            this = (em2) sw2Var3;
                        } else {
                            sw2Var3.getClass();
                            qw2 qw2Var2 = (qw2) sw2Var3;
                            z = rp5.a(em2Var.get(qw2Var2.getKey()), qw2Var2);
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(this.a.fold(obj, eq4Var), this.b);
    }

    @Override
    public final qw2 get(rw2 rw2Var) {
        rw2Var.getClass();
        while (true) {
            qw2 qw2Var = this.b.get(rw2Var);
            if (qw2Var != null) {
                return qw2Var;
            }
            sw2 sw2Var = this.a;
            if (sw2Var instanceof em2) {
                this = (em2) sw2Var;
            } else {
                return sw2Var.get(rw2Var);
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override
    public final sw2 minusKey(rw2 rw2Var) {
        rw2Var.getClass();
        qw2 qw2Var = this.b;
        qw2 qw2Var2 = qw2Var.get(rw2Var);
        sw2 sw2Var = this.a;
        if (qw2Var2 != null) {
            return sw2Var;
        }
        sw2 minusKey = sw2Var.minusKey(rw2Var);
        if (minusKey == sw2Var) {
            return this;
        }
        if (minusKey == z14.a) {
            return qw2Var;
        }
        return new em2(qw2Var, minusKey);
    }

    @Override
    public final sw2 plus(sw2 sw2Var) {
        sw2Var.getClass();
        if (sw2Var == z14.a) {
            return this;
        }
        return (sw2) sw2Var.fold(this, new dm2((byte) 1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new dm2((byte) 0))) + ']';
    }
}
