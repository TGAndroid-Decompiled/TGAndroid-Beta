package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f5194a = 0;
    public String[] f5195b;
    public String[] f5196c;

    public c() {
        String[] strArr = d;
        this.f5195b = strArr;
        this.f5196c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f5194a = this.f5194a;
            String[] strArr = this.f5195b;
            int i7 = this.f5194a;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f5195b = strArr2;
            String[] strArr3 = this.f5196c;
            int i10 = this.f5194a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f5196c = strArr4;
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
        if (this.f5194a != cVar.f5194a || !Arrays.equals(this.f5195b, cVar.f5195b)) {
            return false;
        }
        return Arrays.equals(this.f5196c, cVar.f5196c);
    }

    public final int f(String str) {
        if (str != null) {
            for (int i7 = 0; i7 < this.f5194a; i7++) {
                if (str.equals(this.f5195b[i7])) {
                    return i7;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f5194a * 31) + Arrays.hashCode(this.f5195b)) * 31) + Arrays.hashCode(this.f5196c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
