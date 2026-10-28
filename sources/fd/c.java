package fd;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f10431a = 0;
    public String[] f10432b;
    public String[] f10433c;

    public c() {
        String[] strArr = d;
        this.f10432b = strArr;
        this.f10433c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f10431a = this.f10431a;
            String[] strArr = this.f10432b;
            int i10 = this.f10431a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f10432b = strArr2;
            String[] strArr3 = this.f10433c;
            int i11 = this.f10431a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f10433c = strArr4;
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
        if (this.f10431a != cVar.f10431a || !Arrays.equals(this.f10432b, cVar.f10432b)) {
            return false;
        }
        return Arrays.equals(this.f10433c, cVar.f10433c);
    }

    public final int h(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f10431a; i10++) {
                if (str.equals(this.f10432b[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final int hashCode() {
        return (((this.f10431a * 31) + Arrays.hashCode(this.f10432b)) * 31) + Arrays.hashCode(this.f10433c);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
