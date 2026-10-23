package ed;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f8616a = 0;
    public String[] f8617b;
    public String[] f8618c;

    public c() {
        String[] strArr = d;
        this.f8617b = strArr;
        this.f8618c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f8616a = this.f8616a;
            String[] strArr = this.f8617b;
            int i10 = this.f8616a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f8617b = strArr2;
            String[] strArr3 = this.f8618c;
            int i11 = this.f8616a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f8618c = strArr4;
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
        if (this.f8616a != cVar.f8616a || !Arrays.equals(this.f8617b, cVar.f8617b)) {
            return false;
        }
        return Arrays.equals(this.f8618c, cVar.f8618c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f8616a; i10++) {
                if (str.equals(this.f8617b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f8616a * 31) + Arrays.hashCode(this.f8617b)) * 31) + Arrays.hashCode(this.f8618c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
