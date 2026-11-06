package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f6083a = 0;
    public String[] f6084b;
    public String[] f6085c;

    public c() {
        String[] strArr = d;
        this.f6084b = strArr;
        this.f6085c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f6083a = this.f6083a;
            String[] strArr = this.f6084b;
            int i7 = this.f6083a;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f6084b = strArr2;
            String[] strArr3 = this.f6085c;
            int i10 = this.f6083a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f6085c = strArr4;
            return cVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
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
        if (this.f6083a != cVar.f6083a || !Arrays.equals(this.f6084b, cVar.f6084b)) {
            return false;
        }
        return Arrays.equals(this.f6085c, cVar.f6085c);
    }

    public final int f(String str) {
        if (str != null) {
            for (int i7 = 0; i7 < this.f6083a; i7++) {
                if (str.equals(this.f6084b[i7])) {
                    return i7;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f6083a * 31) + Arrays.hashCode(this.f6084b)) * 31) + Arrays.hashCode(this.f6085c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
