package defpackage;
public final class ga {
    public byte a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ga.class == obj.getClass()) {
                ga gaVar = (ga) obj;
                byte b = this.a;
                if (b == gaVar.a) {
                    if (b != 8 || Math.abs(this.d - this.b) != 1 || this.d != gaVar.b || this.b != gaVar.d) {
                        if (this.d == gaVar.d && this.b == gaVar.b) {
                            Object obj2 = this.c;
                            Object obj3 = gaVar.c;
                            if (obj2 != null) {
                                if (!obj2.equals(obj3)) {
                                    return false;
                                }
                            } else if (obj3 != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        byte b = this.a;
        if (b != 1) {
            if (b != 2) {
                if (b != 4) {
                    if (b != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
