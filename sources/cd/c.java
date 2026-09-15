package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4218a = 0;
    public String[] f4219b;
    public String[] f4220c;

    public c() {
        String[] strArr = d;
        this.f4219b = strArr;
        this.f4220c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4218a = this.f4218a;
            String[] strArr = this.f4219b;
            int i10 = this.f4218a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f4219b = strArr2;
            String[] strArr3 = this.f4220c;
            int i11 = this.f4218a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f4220c = strArr4;
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
        if (this.f4218a != cVar.f4218a || !Arrays.equals(this.f4219b, cVar.f4219b)) {
            return false;
        }
        return Arrays.equals(this.f4220c, cVar.f4220c);
    }

    public final int hashCode() {
        return (((this.f4218a * 31) + Arrays.hashCode(this.f4219b)) * 31) + Arrays.hashCode(this.f4220c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f4218a; i10++) {
                if (str.equals(this.f4219b[i10])) {
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
