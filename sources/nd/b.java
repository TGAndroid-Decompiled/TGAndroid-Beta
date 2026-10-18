package nd;

import a1.g;
import java.io.Serializable;
import jd.c;
import kotlin.jvm.internal.i;
public final class b extends c implements a, Serializable {
    public final Enum[] f17378a;

    public b(Enum[] entries) {
        i.e(entries, "entries");
        this.f17378a = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f17378a;
            i.e(enumArr, "<this>");
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
    public final Object get(int i10) {
        Enum[] enumArr = this.f17378a;
        int length = enumArr.length;
        if (i10 >= 0 && i10 < length) {
            return enumArr[i10];
        }
        throw new IndexOutOfBoundsException(g.l(i10, length, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f17378a.length;
    }

    @Override
    public final int indexOf(Object obj) {
        Enum r12;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f17378a;
            i.e(enumArr, "<this>");
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
