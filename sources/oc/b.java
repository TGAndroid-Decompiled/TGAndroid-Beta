package oc;

import java.util.Arrays;
import java.util.Iterator;
public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f16710a = 0;
    public String[] f16711b;
    public String[] f16712c;

    public b() {
        String[] strArr = d;
        this.f16711b = strArr;
        this.f16712c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f16710a = this.f16710a;
            String[] strArr = this.f16711b;
            int i10 = this.f16710a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f16711b = strArr2;
            String[] strArr3 = this.f16712c;
            int i11 = this.f16710a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f16712c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
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
        if (this.f16710a != bVar.f16710a || !Arrays.equals(this.f16711b, bVar.f16711b)) {
            return false;
        }
        return Arrays.equals(this.f16712c, bVar.f16712c);
    }

    public final int hashCode() {
        return (((this.f16710a * 31) + Arrays.hashCode(this.f16711b)) * 31) + Arrays.hashCode(this.f16712c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f16710a; i10++) {
                if (str.equals(this.f16711b[i10])) {
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
