package f2;
public final class a {
    public int f5643a;
    public int f5644b;
    public Object f5645c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f5643a;
                if (i10 == aVar.f5643a) {
                    if (i10 != 8 || Math.abs(this.d - this.f5644b) != 1 || this.d != aVar.f5644b || this.f5644b != aVar.d) {
                        if (this.d == aVar.d && this.f5644b == aVar.f5644b) {
                            Object obj2 = this.f5645c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f5645c)) {
                                    return false;
                                }
                            } else if (aVar.f5645c != null) {
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
        return (((this.f5643a * 31) + this.f5644b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.f5643a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
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
        sb.append(this.f5644b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f5645c);
        sb.append("]");
        return sb.toString();
    }
}
