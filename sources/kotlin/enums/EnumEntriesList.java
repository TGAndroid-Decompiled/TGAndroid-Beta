package kotlin.enums;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;

public final class EnumEntriesList extends AbstractList implements EnumEntries, Serializable {
    public final Enum[] entries;

    public EnumEntriesList(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.entries = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.entries;
        Intrinsics.checkNotNullParameter(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == element;
    }

    @Override
    public final Object get(int i) {
        Enum[] enumArr = this.entries;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override
    public final int getSize() {
        return this.entries.length;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.entries;
        Intrinsics.checkNotNullParameter(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
