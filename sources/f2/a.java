package f2;

public final class a {

    public int f5611a;

    public int f5612b;

    public Object f5613c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i10 = this.f5611a;
            if (i10 != aVar.f5611a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.d - this.f5612b) != 1 || this.d != aVar.f5612b || this.f5612b != aVar.d) {
                if (this.d != aVar.d || this.f5612b != aVar.f5612b) {
                    return false;
                }
                Object obj2 = this.f5613c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f5613c)) {
                        return false;
                    }
                } else if (aVar.f5613c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5611a * 31) + this.f5612b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f5611a;
        if (i10 == 1) {
            str = "add";
        } else if (i10 == 2) {
            str = "rm";
        } else if (i10 != 4) {
            str = i10 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f5612b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f5613c);
        sb2.append("]");
        return sb2.toString();
    }
}
