package f2;
public final class a {
    public int f5654a;
    public int f5655b;
    public Object f5656c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f5654a;
                if (i10 == aVar.f5654a) {
                    if (i10 != 8 || Math.abs(this.d - this.f5655b) != 1 || this.d != aVar.f5655b || this.f5655b != aVar.d) {
                        if (this.d == aVar.d && this.f5655b == aVar.f5655b) {
                            Object obj2 = this.f5656c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f5656c)) {
                                    return false;
                                }
                            } else if (aVar.f5656c != null) {
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
        return (((this.f5654a * 31) + this.f5655b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.f5654a;
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
        sb.append(this.f5655b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f5656c);
        sb.append("]");
        return sb.toString();
    }
}
