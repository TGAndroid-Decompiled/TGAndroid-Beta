package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f5197a = 0;
    public String[] f5198b;
    public String[] f5199c;

    public c() {
        String[] strArr = d;
        this.f5198b = strArr;
        this.f5199c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f5197a = this.f5197a;
            String[] strArr = this.f5198b;
            int i7 = this.f5197a;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f5198b = strArr2;
            String[] strArr3 = this.f5199c;
            int i10 = this.f5197a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f5199c = strArr4;
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
        if (this.f5197a != cVar.f5197a || !Arrays.equals(this.f5198b, cVar.f5198b)) {
            return false;
        }
        return Arrays.equals(this.f5199c, cVar.f5199c);
    }

    public final int f(String str) {
        if (str != null) {
            for (int i7 = 0; i7 < this.f5197a; i7++) {
                if (str.equals(this.f5198b[i7])) {
                    return i7;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f5197a * 31) + Arrays.hashCode(this.f5198b)) * 31) + Arrays.hashCode(this.f5199c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
