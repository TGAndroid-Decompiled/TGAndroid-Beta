package dd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f8304a = 0;
    public String[] f8305b;
    public String[] f8306c;

    public c() {
        String[] strArr = d;
        this.f8305b = strArr;
        this.f8306c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f8304a = this.f8304a;
            String[] strArr = this.f8305b;
            int i10 = this.f8304a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f8305b = strArr2;
            String[] strArr3 = this.f8306c;
            int i11 = this.f8304a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f8306c = strArr4;
            return cVar;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
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
        if (this.f8304a != cVar.f8304a || !Arrays.equals(this.f8305b, cVar.f8305b)) {
            return false;
        }
        return Arrays.equals(this.f8306c, cVar.f8306c);
    }

    public final int hashCode() {
        return (((this.f8304a * 31) + Arrays.hashCode(this.f8305b)) * 31) + Arrays.hashCode(this.f8306c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f8304a; i10++) {
                if (str.equals(this.f8305b[i10])) {
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
