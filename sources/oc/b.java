package oc;

import java.util.Arrays;
import java.util.Iterator;
public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f16708a = 0;
    public String[] f16709b;
    public String[] f16710c;

    public b() {
        String[] strArr = d;
        this.f16709b = strArr;
        this.f16710c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f16708a = this.f16708a;
            String[] strArr = this.f16709b;
            int i10 = this.f16708a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f16709b = strArr2;
            String[] strArr3 = this.f16710c;
            int i11 = this.f16708a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f16710c = strArr4;
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
        if (this.f16708a != bVar.f16708a || !Arrays.equals(this.f16709b, bVar.f16709b)) {
            return false;
        }
        return Arrays.equals(this.f16710c, bVar.f16710c);
    }

    public final int hashCode() {
        return (((this.f16708a * 31) + Arrays.hashCode(this.f16709b)) * 31) + Arrays.hashCode(this.f16710c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f16708a; i10++) {
                if (str.equals(this.f16709b[i10])) {
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
