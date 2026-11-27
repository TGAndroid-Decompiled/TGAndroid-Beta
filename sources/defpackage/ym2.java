package defpackage;

import java.io.Serializable;
public final class ym2 implements mx2, Serializable {
    public final mx2 a;
    public final kx2 b;

    public ym2(kx2 kx2Var, mx2 mx2Var) {
        mx2Var.getClass();
        this.a = mx2Var;
        this.b = kx2Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof ym2) {
                ym2 ym2Var = (ym2) obj;
                int i = 2;
                ym2 ym2Var2 = ym2Var;
                int i2 = 2;
                while (true) {
                    mx2 mx2Var = ym2Var2.a;
                    if (mx2Var instanceof ym2) {
                        ym2Var2 = (ym2) mx2Var;
                    } else {
                        ym2Var2 = null;
                    }
                    if (ym2Var2 == null) {
                        break;
                    }
                    i2++;
                }
                ym2 ym2Var3 = this;
                while (true) {
                    mx2 mx2Var2 = ym2Var3.a;
                    if (mx2Var2 instanceof ym2) {
                        ym2Var3 = (ym2) mx2Var2;
                    } else {
                        ym2Var3 = null;
                    }
                    if (ym2Var3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        kx2 kx2Var = this.b;
                        if (!ur5.a(ym2Var.get(kx2Var.getKey()), kx2Var)) {
                            z = false;
                            break;
                        }
                        mx2 mx2Var3 = this.a;
                        if (mx2Var3 instanceof ym2) {
                            this = (ym2) mx2Var3;
                        } else {
                            mx2Var3.getClass();
                            kx2 kx2Var2 = (kx2) mx2Var3;
                            z = ur5.a(ym2Var.get(kx2Var2.getKey()), kx2Var2);
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
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(this.a.fold(obj, is4Var), this.b);
    }

    @Override
    public final kx2 get(lx2 lx2Var) {
        lx2Var.getClass();
        while (true) {
            kx2 kx2Var = this.b.get(lx2Var);
            if (kx2Var != null) {
                return kx2Var;
            }
            mx2 mx2Var = this.a;
            if (mx2Var instanceof ym2) {
                this = (ym2) mx2Var;
            } else {
                return mx2Var.get(lx2Var);
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override
    public final mx2 minusKey(lx2 lx2Var) {
        lx2Var.getClass();
        kx2 kx2Var = this.b;
        kx2 kx2Var2 = kx2Var.get(lx2Var);
        mx2 mx2Var = this.a;
        if (kx2Var2 != null) {
            return mx2Var;
        }
        mx2 minusKey = mx2Var.minusKey(lx2Var);
        if (minusKey == mx2Var) {
            return this;
        }
        if (minusKey == u24.a) {
            return kx2Var;
        }
        return new ym2(kx2Var, minusKey);
    }

    @Override
    public final mx2 plus(mx2 mx2Var) {
        mx2Var.getClass();
        if (mx2Var == u24.a) {
            return this;
        }
        return (mx2) mx2Var.fold(this, new xm2((byte) 1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new xm2((byte) 0))) + ']';
    }
}
