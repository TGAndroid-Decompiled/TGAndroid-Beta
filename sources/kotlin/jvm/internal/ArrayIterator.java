package kotlin.jvm.internal;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.internal.zzdd;
import io.noties.markwon.html.jsoup.nodes.Attribute;
import io.noties.markwon.html.jsoup.nodes.Attributes;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractList;

public class ArrayIterator implements Iterator {
    public final int $r8$classId;
    public final Object array;
    public int index;

    public ArrayIterator(DataEventBuffer dataEventBuffer) {
        this.$r8$classId = 1;
        this.array = dataEventBuffer;
        this.index = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                return this.index < ((Object[]) this.array).length;
            case 1:
                int i = this.index;
                DataEventBuffer dataEventBuffer = (DataEventBuffer) this.array;
                dataEventBuffer.zab();
                return i < dataEventBuffer.zab.size() + (-1);
            case 2:
                return this.index < ((Attributes) this.array).size;
            default:
                return this.index < ((AbstractList) this.array).getSize();
        }
    }

    @Override
    public final Object next() {
        int iIntValue;
        int iIntValue2;
        switch (this.$r8$classId) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.array;
                    int i = this.index;
                    this.index = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.index--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException(Fragment$$ExternalSyntheticOutline0.m(this.index, "Cannot advance the iterator beyond "));
                }
                int i2 = this.index;
                int i3 = i2 + 1;
                this.index = i3;
                DataEventBuffer dataEventBuffer = (DataEventBuffer) this.array;
                dataEventBuffer.zab();
                int iZaa = dataEventBuffer.zaa(i3);
                int i4 = 0;
                DataHolder dataHolder = dataEventBuffer.mDataHolder;
                if (i3 >= 0 && i3 != dataEventBuffer.zab.size()) {
                    if (i3 == dataEventBuffer.zab.size() - 1) {
                        zzah.checkNotNull(dataHolder);
                        iIntValue = dataHolder.zad;
                        iIntValue2 = ((Integer) dataEventBuffer.zab.get(i3)).intValue();
                    } else {
                        iIntValue = ((Integer) dataEventBuffer.zab.get(i2 + 2)).intValue();
                        iIntValue2 = ((Integer) dataEventBuffer.zab.get(i3)).intValue();
                    }
                    i4 = iIntValue - iIntValue2;
                    if (i4 == 1) {
                        int iZaa2 = dataEventBuffer.zaa(i3);
                        zzah.checkNotNull(dataHolder);
                        dataHolder.getWindowIndex(iZaa2);
                        i4 = 1;
                    }
                }
                return new zzdd(dataHolder, iZaa, i4, 0);
            case 2:
                Attributes attributes = (Attributes) this.array;
                String[] strArr = attributes.vals;
                int i5 = this.index;
                String str = strArr[i5];
                String str2 = attributes.keys[i5];
                if (str == null) {
                    str = "";
                }
                Attribute attribute = new Attribute();
                if (str2 == null) {
                    throw new IllegalArgumentException("Object must not be null");
                }
                attribute.key = str2.trim();
                if (str2.length() == 0) {
                    throw new IllegalArgumentException("String must not be empty");
                }
                attribute.val = str;
                attribute.parent = attributes;
                this.index++;
                return attribute;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i6 = this.index;
                this.index = i6 + 1;
                return ((AbstractList) this.array).get(i6);
        }
    }

    @Override
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
            case 2:
                int i = this.index;
                int i2 = i - 1;
                this.index = i2;
                Attributes attributes = (Attributes) this.array;
                int i3 = attributes.size;
                if (i2 >= i3) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    String[] strArr = attributes.keys;
                    System.arraycopy(strArr, i, strArr, i2, i4);
                    String[] strArr2 = attributes.vals;
                    System.arraycopy(strArr2, i, strArr2, i2, i4);
                }
                int i5 = attributes.size - 1;
                attributes.size = i5;
                attributes.keys[i5] = null;
                attributes.vals[i5] = null;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ArrayIterator(Object[] array) {
        this.$r8$classId = 0;
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    public ArrayIterator(AbstractList abstractList) {
        this.$r8$classId = 3;
        this.array = abstractList;
    }

    public ArrayIterator(Attributes attributes) {
        this.$r8$classId = 2;
        this.array = attributes;
        this.index = 0;
    }
}
