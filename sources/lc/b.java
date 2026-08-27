package lc;

import java.util.Arrays;
import java.util.Iterator;

public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];

    public int f15534a = 0;

    public String[] f15535b;

    public String[] f15536c;

    public b() {
        String[] strArr = d;
        this.f15535b = strArr;
        this.f15536c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f15534a = this.f15534a;
            String[] strArr = this.f15535b;
            int i10 = this.f15534a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f15535b = strArr2;
            String[] strArr3 = this.f15536c;
            int i11 = this.f15534a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f15536c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
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
        if (this.f15534a == bVar.f15534a && Arrays.equals(this.f15535b, bVar.f15535b)) {
            return Arrays.equals(this.f15536c, bVar.f15536c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f15534a * 31) + Arrays.hashCode(this.f15535b)) * 31) + Arrays.hashCode(this.f15536c);
    }

    public final int i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i10 = 0; i10 < this.f15534a; i10++) {
            if (str.equals(this.f15535b[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return new kotlin.jvm.internal.a(this);
    }
}
