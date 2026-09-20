package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4224a = 0;
    public String[] f4225b;
    public String[] f4226c;

    public c() {
        String[] strArr = d;
        this.f4225b = strArr;
        this.f4226c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4224a = this.f4224a;
            String[] strArr = this.f4225b;
            int i10 = this.f4224a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f4225b = strArr2;
            String[] strArr3 = this.f4226c;
            int i11 = this.f4224a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f4226c = strArr4;
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
        if (this.f4224a != cVar.f4224a || !Arrays.equals(this.f4225b, cVar.f4225b)) {
            return false;
        }
        return Arrays.equals(this.f4226c, cVar.f4226c);
    }

    public final int hashCode() {
        return (((this.f4224a * 31) + Arrays.hashCode(this.f4225b)) * 31) + Arrays.hashCode(this.f4226c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f4224a; i10++) {
                if (str.equals(this.f4225b[i10])) {
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
