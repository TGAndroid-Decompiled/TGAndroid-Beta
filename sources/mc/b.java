package mc;

import java.util.Arrays;
import java.util.Iterator;
public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f16974a = 0;
    public String[] f16975b;
    public String[] f16976c;

    public b() {
        String[] strArr = d;
        this.f16975b = strArr;
        this.f16976c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f16974a = this.f16974a;
            String[] strArr = this.f16975b;
            int i10 = this.f16974a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f16975b = strArr2;
            String[] strArr3 = this.f16976c;
            int i11 = this.f16974a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f16976c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f16974a != bVar.f16974a || !Arrays.equals(this.f16975b, bVar.f16975b)) {
            return false;
        }
        return Arrays.equals(this.f16976c, bVar.f16976c);
    }

    public final int hashCode() {
        return (((this.f16974a * 31) + Arrays.hashCode(this.f16975b)) * 31) + Arrays.hashCode(this.f16976c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f16974a; i10++) {
                if (str.equals(this.f16975b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    @Override
    public final Iterator iterator() {
        return new kotlin.jvm.internal.a(this);
    }
}
