package cd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f4222a = 0;
    public String[] f4223b;
    public String[] f4224c;

    public c() {
        String[] strArr = d;
        this.f4223b = strArr;
        this.f4224c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4222a = this.f4222a;
            String[] strArr = this.f4223b;
            int i10 = this.f4222a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f4223b = strArr2;
            String[] strArr3 = this.f4224c;
            int i11 = this.f4222a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f4224c = strArr4;
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
        if (this.f4222a != cVar.f4222a || !Arrays.equals(this.f4223b, cVar.f4223b)) {
            return false;
        }
        return Arrays.equals(this.f4224c, cVar.f4224c);
    }

    public final int hashCode() {
        return (((this.f4222a * 31) + Arrays.hashCode(this.f4223b)) * 31) + Arrays.hashCode(this.f4224c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f4222a; i10++) {
                if (str.equals(this.f4223b[i10])) {
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
