package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4908a = 0;
    public String[] f4909b;
    public String[] f4910c;

    public c() {
        String[] strArr = d;
        this.f4909b = strArr;
        this.f4910c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4908a = this.f4908a;
            String[] strArr = this.f4909b;
            int i7 = this.f4908a;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f4909b = strArr2;
            String[] strArr3 = this.f4910c;
            int i10 = this.f4908a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f4910c = strArr4;
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
        if (this.f4908a != cVar.f4908a || !Arrays.equals(this.f4909b, cVar.f4909b)) {
            return false;
        }
        return Arrays.equals(this.f4910c, cVar.f4910c);
    }

    public final int f(String str) {
        if (str != null) {
            for (int i7 = 0; i7 < this.f4908a; i7++) {
                if (str.equals(this.f4909b[i7])) {
                    return i7;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f4908a * 31) + Arrays.hashCode(this.f4909b)) * 31) + Arrays.hashCode(this.f4910c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
