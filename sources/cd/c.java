package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4215a = 0;
    public String[] f4216b;
    public String[] f4217c;

    public c() {
        String[] strArr = d;
        this.f4216b = strArr;
        this.f4217c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4215a = this.f4215a;
            String[] strArr = this.f4216b;
            int i10 = this.f4215a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f4216b = strArr2;
            String[] strArr3 = this.f4217c;
            int i11 = this.f4215a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f4217c = strArr4;
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4215a != cVar.f4215a || !Arrays.equals(this.f4216b, cVar.f4216b)) {
            return false;
        }
        return Arrays.equals(this.f4217c, cVar.f4217c);
    }

    public final int hashCode() {
        return (((this.f4215a * 31) + Arrays.hashCode(this.f4216b)) * 31) + Arrays.hashCode(this.f4217c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f4215a; i10++) {
                if (str.equals(this.f4216b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
