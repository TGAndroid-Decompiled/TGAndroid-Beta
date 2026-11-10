package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f6086a = 0;
    public String[] f6087b;
    public String[] f6088c;

    public c() {
        String[] strArr = d;
        this.f6087b = strArr;
        this.f6088c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f6086a = this.f6086a;
            String[] strArr = this.f6087b;
            int i7 = this.f6086a;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f6087b = strArr2;
            String[] strArr3 = this.f6088c;
            int i10 = this.f6086a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f6088c = strArr4;
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
        if (this.f6086a != cVar.f6086a || !Arrays.equals(this.f6087b, cVar.f6087b)) {
            return false;
        }
        return Arrays.equals(this.f6088c, cVar.f6088c);
    }

    public final int f(String str) {
        if (str != null) {
            for (int i7 = 0; i7 < this.f6086a; i7++) {
                if (str.equals(this.f6087b[i7])) {
                    return i7;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f6086a * 31) + Arrays.hashCode(this.f6087b)) * 31) + Arrays.hashCode(this.f6088c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
