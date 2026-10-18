package ed;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f8612a = 0;
    public String[] f8613b;
    public String[] f8614c;

    public c() {
        String[] strArr = d;
        this.f8613b = strArr;
        this.f8614c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f8612a = this.f8612a;
            String[] strArr = this.f8613b;
            int i10 = this.f8612a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f8613b = strArr2;
            String[] strArr3 = this.f8614c;
            int i11 = this.f8612a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f8614c = strArr4;
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
        if (this.f8612a != cVar.f8612a || !Arrays.equals(this.f8613b, cVar.f8613b)) {
            return false;
        }
        return Arrays.equals(this.f8614c, cVar.f8614c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f8612a; i10++) {
                if (str.equals(this.f8613b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f8612a * 31) + Arrays.hashCode(this.f8613b)) * 31) + Arrays.hashCode(this.f8614c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
