package ed;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f8609a = 0;
    public String[] f8610b;
    public String[] f8611c;

    public c() {
        String[] strArr = d;
        this.f8610b = strArr;
        this.f8611c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f8609a = this.f8609a;
            String[] strArr = this.f8610b;
            int i10 = this.f8609a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f8610b = strArr2;
            String[] strArr3 = this.f8611c;
            int i11 = this.f8609a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f8611c = strArr4;
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
        if (this.f8609a != cVar.f8609a || !Arrays.equals(this.f8610b, cVar.f8610b)) {
            return false;
        }
        return Arrays.equals(this.f8611c, cVar.f8611c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f8609a; i10++) {
                if (str.equals(this.f8610b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f8609a * 31) + Arrays.hashCode(this.f8610b)) * 31) + Arrays.hashCode(this.f8611c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
