package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4220a = 0;
    public String[] f4221b;
    public String[] f4222c;

    public c() {
        String[] strArr = d;
        this.f4221b = strArr;
        this.f4222c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4220a = this.f4220a;
            String[] strArr = this.f4221b;
            int i10 = this.f4220a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f4221b = strArr2;
            String[] strArr3 = this.f4222c;
            int i11 = this.f4220a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f4222c = strArr4;
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
        if (this.f4220a != cVar.f4220a || !Arrays.equals(this.f4221b, cVar.f4221b)) {
            return false;
        }
        return Arrays.equals(this.f4222c, cVar.f4222c);
    }

    public final int hashCode() {
        return (((this.f4220a * 31) + Arrays.hashCode(this.f4221b)) * 31) + Arrays.hashCode(this.f4222c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f4220a; i10++) {
                if (str.equals(this.f4221b[i10])) {
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
