package f2;
public final class a {
    public int f5725a;
    public int f5726b;
    public Object f5727c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f5725a;
                if (i10 == aVar.f5725a) {
                    if (i10 != 8 || Math.abs(this.d - this.f5726b) != 1 || this.d != aVar.f5726b || this.f5726b != aVar.d) {
                        if (this.d == aVar.d && this.f5726b == aVar.f5726b) {
                            Object obj2 = this.f5727c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f5727c)) {
                                    return false;
                                }
                            } else if (aVar.f5727c != null) {
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
        return (((this.f5725a * 31) + this.f5726b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.f5725a;
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
        sb.append(this.f5726b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f5727c);
        sb.append("]");
        return sb.toString();
    }
}
