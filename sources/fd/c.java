package fd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f10432a = 0;
    public String[] f10433b;
    public String[] f10434c;

    public c() {
        String[] strArr = d;
        this.f10433b = strArr;
        this.f10434c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f10432a = this.f10432a;
            String[] strArr = this.f10433b;
            int i10 = this.f10432a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f10433b = strArr2;
            String[] strArr3 = this.f10434c;
            int i11 = this.f10432a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f10434c = strArr4;
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
        if (this.f10432a != cVar.f10432a || !Arrays.equals(this.f10433b, cVar.f10433b)) {
            return false;
        }
        return Arrays.equals(this.f10434c, cVar.f10434c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f10432a; i10++) {
                if (str.equals(this.f10433b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f10432a * 31) + Arrays.hashCode(this.f10433b)) * 31) + Arrays.hashCode(this.f10434c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
