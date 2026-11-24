package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class v2 implements Iterator {
    public final byte a;
    public int b;
    public final Object c;

    public v2(Object[] objArr) {
        this.a = (byte) 1;
        objArr.getClass();
        this.c = objArr;
    }

    @Override
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (this.b >= ((y2) obj).h()) {
                    return false;
                }
                return true;
            case 1:
                if (this.b >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
            default:
                if (this.b >= ((fz) obj).a) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (hasNext()) {
                    int i = this.b;
                    this.b = i + 1;
                    return ((y2) obj).get(i);
                }
                u36.g();
                return null;
            case 1:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                fz fzVar = (fz) obj;
                String[] strArr = fzVar.c;
                int i3 = this.b;
                String str = strArr[i3];
                String str2 = fzVar.b[i3];
                if (str == null) {
                    str = "";
                }
                ?? obj2 = new Object();
                if (str2 != null) {
                    obj2.a = str2.trim();
                    if (str2.length() != 0) {
                        obj2.b = str;
                        obj2.c = fzVar;
                        this.b++;
                        return obj2;
                    }
                    u36.j("String must not be empty");
                    return null;
                }
                u36.j("Object must not be null");
                return null;
        }
    }

    @Override
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                fz fzVar = (fz) this.c;
                int i = this.b;
                int i2 = i - 1;
                this.b = i2;
                int i3 = fzVar.a;
                if (i2 < i3) {
                    int i4 = (i3 - i2) - 1;
                    if (i4 > 0) {
                        String[] strArr = fzVar.b;
                        System.arraycopy(strArr, i, strArr, i2, i4);
                        String[] strArr2 = fzVar.c;
                        System.arraycopy(strArr2, i, strArr2, i2, i4);
                    }
                    int i5 = fzVar.a - 1;
                    fzVar.a = i5;
                    fzVar.b[i5] = null;
                    fzVar.c[i5] = null;
                    return;
                }
                u36.j("Must be false");
                return;
        }
    }

    public v2(y2 y2Var) {
        this.a = (byte) 0;
        this.c = y2Var;
    }

    public v2(fz fzVar) {
        this.a = (byte) 2;
        this.c = fzVar;
        this.b = 0;
    }
}
