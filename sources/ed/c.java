package ed;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f8727a = 0;
    public String[] f8728b;
    public String[] f8729c;

    public c() {
        String[] strArr = d;
        this.f8728b = strArr;
        this.f8729c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f8727a = this.f8727a;
            String[] strArr = this.f8728b;
            int i10 = this.f8727a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f8728b = strArr2;
            String[] strArr3 = this.f8729c;
            int i11 = this.f8727a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f8729c = strArr4;
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
        if (this.f8727a != cVar.f8727a || !Arrays.equals(this.f8728b, cVar.f8728b)) {
            return false;
        }
        return Arrays.equals(this.f8729c, cVar.f8729c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f8727a; i10++) {
                if (str.equals(this.f8728b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f8727a * 31) + Arrays.hashCode(this.f8728b)) * 31) + Arrays.hashCode(this.f8729c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
