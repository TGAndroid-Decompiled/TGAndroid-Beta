package oc;

import java.util.Arrays;
import java.util.Iterator;
public final class b implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f16522a = 0;
    public String[] f16523b;
    public String[] f16524c;

    public b() {
        String[] strArr = d;
        this.f16523b = strArr;
        this.f16524c = strArr;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f16522a = this.f16522a;
            String[] strArr = this.f16523b;
            int i10 = this.f16522a;
            String[] strArr2 = new String[i10];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
            this.f16523b = strArr2;
            String[] strArr3 = this.f16524c;
            int i11 = this.f16522a;
            String[] strArr4 = new String[i11];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
            this.f16524c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
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
        if (this.f16522a != bVar.f16522a || !Arrays.equals(this.f16523b, bVar.f16523b)) {
            return false;
        }
        return Arrays.equals(this.f16524c, bVar.f16524c);
    }

    public final int hashCode() {
        return (((this.f16522a * 31) + Arrays.hashCode(this.f16523b)) * 31) + Arrays.hashCode(this.f16524c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.f16522a; i10++) {
                if (str.equals(this.f16523b[i10])) {
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
