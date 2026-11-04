package id;

import a1.g;
import ed.d;
import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class b extends d implements a, Serializable {
    public final Enum[] f14764a;

    public b(Enum[] entries) {
        j.e(entries, "entries");
        this.f14764a = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f14764a;
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
    public final Object get(int i3) {
        Enum[] enumArr = this.f14764a;
        int length = enumArr.length;
        if (i3 >= 0 && i3 < length) {
            return enumArr[i3];
        }
        throw new IndexOutOfBoundsException(g.n(i3, length, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f14764a.length;
    }

    @Override
    public final int indexOf(Object obj) {
        Enum r12;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f14764a;
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
