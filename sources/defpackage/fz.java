package defpackage;

import java.util.Arrays;
import java.util.Iterator;
public final class fz implements Iterable, Cloneable {
    public static final String[] d = new String[0];
    public int a = 0;
    public String[] b;
    public String[] c;

    public fz() {
        String[] strArr = d;
        this.b = strArr;
        this.c = strArr;
    }

    public final Object clone() {
        try {
            fz fzVar = (fz) super.clone();
            fzVar.a = this.a;
            String[] strArr = this.b;
            int i = this.a;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.b = strArr2;
            String[] strArr3 = this.c;
            int i2 = this.a;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.c = strArr4;
            return fzVar;
        } catch (CloneNotSupportedException e) {
            rjb.m(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fz.class == obj.getClass()) {
            fz fzVar = (fz) obj;
            if (this.a == fzVar.a && Arrays.equals(this.b, fzVar.b)) {
                return Arrays.equals(this.c, fzVar.c);
            }
            return false;
        }
        return false;
    }

    public final int h(String str) {
        if (str != null) {
            for (int i = 0; i < this.a; i++) {
                if (str.equals(this.b[i])) {
                    return i;
                }
            }
            return -1;
        }
        u36.j("Object must not be null");
        return 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    @Override
    public final Iterator iterator() {
        return new v2(this);
    }
}
