package kc;

import java.util.Arrays;
import java.util.Iterator;
public final class c implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int f14756a = 0;
    public String[] f14757b;
    public String[] f14758c;

    public c() {
        String[] strArr = d;
        this.f14757b = strArr;
        this.f14758c = strArr;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f14756a = this.f14756a;
            String[] strArr = this.f14757b;
            int i9 = this.f14756a;
            String[] strArr2 = new String[i9];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i9));
            this.f14757b = strArr2;
            String[] strArr3 = this.f14758c;
            int i10 = this.f14756a;
            String[] strArr4 = new String[i10];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
            this.f14758c = strArr4;
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
        if (this.f14756a != cVar.f14756a || !Arrays.equals(this.f14757b, cVar.f14757b)) {
            return false;
        }
        return Arrays.equals(this.f14758c, cVar.f14758c);
    }

    public final int hashCode() {
        return (((this.f14756a * 31) + Arrays.hashCode(this.f14757b)) * 31) + Arrays.hashCode(this.f14758c);
    }

    public final int i(String str) {
        if (str != null) {
            for (int i9 = 0; i9 < this.f14756a; i9++) {
                if (str.equals(this.f14757b[i9])) {
                    return i9;
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
