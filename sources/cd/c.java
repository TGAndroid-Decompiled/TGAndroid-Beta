package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f6081a = 0;
    public String[] f6082b;
    public String[] f6083c;

    public c() {
        String[] strArr = d;
        this.f6082b = strArr;
        this.f6083c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f6081a = this.f6081a;
            String[] strArr = this.f6082b;
            int i7 = this.f6081a;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f6082b = strArr2;
            String[] strArr3 = this.f6083c;
            int i10 = this.f6081a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f6083c = strArr4;
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
        if (this.f6081a != cVar.f6081a || !Arrays.equals(this.f6082b, cVar.f6082b)) {
            return false;
        }
        return Arrays.equals(this.f6083c, cVar.f6083c);
    }

    public final int f(String str) {
        if (str != null) {
            for (int i7 = 0; i7 < this.f6081a; i7++) {
                if (str.equals(this.f6082b[i7])) {
                    return i7;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f6081a * 31) + Arrays.hashCode(this.f6082b)) * 31) + Arrays.hashCode(this.f6083c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
