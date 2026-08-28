package f2;
public final class a {
    public int f5306a;
    public int f5307b;
    public Object f5308c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i9 = this.f5306a;
                if (i9 == aVar.f5306a) {
                    if (i9 != 8 || Math.abs(this.d - this.f5307b) != 1 || this.d != aVar.f5307b || this.f5307b != aVar.d) {
                        if (this.d == aVar.d && this.f5307b == aVar.f5307b) {
                            Object obj2 = this.f5308c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f5308c)) {
                                    return false;
                                }
                            } else if (aVar.f5308c != null) {
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
        return (((this.f5306a * 31) + this.f5307b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i9 = this.f5306a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 8) {
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
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f5307b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f5308c);
        sb2.append("]");
        return sb2.toString();
    }
}
