package defpackage;

import java.io.Serializable;
public final class n34 extends y2 implements m34, Serializable {
    public final Enum[] a;

    public n34(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    @Override
    public final boolean contains(Object obj) {
        Enum r2;
        if (obj instanceof Enum) {
            Enum r3 = (Enum) obj;
            int ordinal = r3.ordinal();
            Enum[] enumArr = this.a;
            enumArr.getClass();
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r2 = enumArr[ordinal];
            } else {
                r2 = null;
            }
            if (r2 == r3) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        k93.i(b00.g(i, length, "index: ", ", size: "));
        return null;
    }

    @Override
    public final int h() {
        return this.a.length;
    }

    @Override
    public final int indexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.a;
        enumArr.getClass();
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r3 = enumArr[ordinal];
        } else {
            r3 = null;
        }
        if (r3 != r4) {
            return -1;
        }
        return ordinal;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.a;
        enumArr.getClass();
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r3 = enumArr[ordinal];
        } else {
            r3 = null;
        }
        if (r3 != r4) {
            return -1;
        }
        return ordinal;
    }
}
