package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4217a = 0;
    public String[] f4218b;
    public String[] f4219c;

    public c() {
        String[] strArr = d;
        this.f4218b = strArr;
        this.f4219c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4217a = this.f4217a;
            String[] strArr = this.f4218b;
            int i10 = this.f4217a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f4218b = strArr2;
            String[] strArr3 = this.f4219c;
            int i11 = this.f4217a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f4219c = strArr4;
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
        if (this.f4217a != cVar.f4217a || !Arrays.equals(this.f4218b, cVar.f4218b)) {
            return false;
        }
        return Arrays.equals(this.f4219c, cVar.f4219c);
    }

    public final int hashCode() {
        return (((this.f4217a * 31) + Arrays.hashCode(this.f4218b)) * 31) + Arrays.hashCode(this.f4219c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f4217a; i10++) {
                if (str.equals(this.f4218b[i10])) {
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
