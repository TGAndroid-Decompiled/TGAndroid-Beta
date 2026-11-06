package ld;

import a8.p0;
import hd.c;
import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class b extends c implements a, Serializable {
    public final Enum[] f18255a;

    public b(Enum[] entries) {
        j.e(entries, "entries");
        this.f18255a = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f18255a;
            j.e(enumArr, "<this>");
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r02 = enumArr[ordinal];
            } else {
                r02 = null;
            }
            if (r02 == r42) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f18255a.length;
    }

    @Override
    public final Object get(int i7) {
        Enum[] enumArr = this.f18255a;
        int length = enumArr.length;
        if (i7 >= 0 && i7 < length) {
            return enumArr[i7];
        }
        throw new IndexOutOfBoundsException(p0.m(i7, length, "index: ", ", size: "));
    }

    @Override
    public final int indexOf(Object obj) {
        Enum r12;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f18255a;
            j.e(enumArr, "<this>");
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r12 = enumArr[ordinal];
            } else {
                r12 = null;
            }
            if (r12 == r42) {
                return ordinal;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((Enum) obj);
    }
}
