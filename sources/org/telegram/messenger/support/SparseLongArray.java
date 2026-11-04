package org.telegram.messenger.support;
public class SparseLongArray implements Cloneable {
    private int[] mKeys;
    private int mSize;
    private long[] mValues;

    public SparseLongArray() {
        this(10);
    }

    private static int binarySearch(int[] iArr, int i3, int i10, long j10) {
        int i11 = i10 + i3;
        int i12 = i3 - 1;
        int i13 = i11;
        while (i13 - i12 > 1) {
            int i14 = (i13 + i12) / 2;
            if (iArr[i14] < j10) {
                i12 = i14;
            } else {
                i13 = i14;
            }
        }
        if (i13 == i11) {
            return ~i11;
        }
        if (iArr[i13] == j10) {
            return i13;
        }
        return ~i13;
    }

    private void growKeyAndValueArrays(int i3) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i3);
        int[] iArr = new int[idealLongArraySize];
        long[] jArr = new long[idealLongArraySize];
        int[] iArr2 = this.mKeys;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.mKeys = iArr;
        this.mValues = jArr;
    }

    public void append(int i3, long j10) {
        int i10 = this.mSize;
        if (i10 != 0 && i3 <= this.mKeys[i10 - 1]) {
            put(i3, j10);
            return;
        }
        if (i10 >= this.mKeys.length) {
            growKeyAndValueArrays(i10 + 1);
        }
        this.mKeys[i10] = i3;
        this.mValues[i10] = j10;
        this.mSize = i10 + 1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void delete(int i3) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i3);
        if (binarySearch >= 0) {
            removeAt(binarySearch);
        }
    }

    public long get(int i3) {
        return get(i3, 0L);
    }

    public int indexOfKey(int i3) {
        return binarySearch(this.mKeys, 0, this.mSize, i3);
    }

    public int indexOfValue(long j10) {
        for (int i3 = 0; i3 < this.mSize; i3++) {
            if (this.mValues[i3] == j10) {
                return i3;
            }
        }
        return -1;
    }

    public int keyAt(int i3) {
        return this.mKeys[i3];
    }

    public void put(int i3, long j10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i3);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = j10;
            return;
        }
        int i10 = ~binarySearch;
        int i11 = this.mSize;
        if (i11 >= this.mKeys.length) {
            growKeyAndValueArrays(i11 + 1);
        }
        int i12 = this.mSize;
        if (i12 - i10 != 0) {
            int[] iArr = this.mKeys;
            int i13 = i10 + 1;
            System.arraycopy(iArr, i10, iArr, i13, i12 - i10);
            long[] jArr = this.mValues;
            System.arraycopy(jArr, i10, jArr, i13, this.mSize - i10);
        }
        this.mKeys[i10] = i3;
        this.mValues[i10] = j10;
        this.mSize++;
    }

    public void removeAt(int i3) {
        int[] iArr = this.mKeys;
        int i10 = i3 + 1;
        System.arraycopy(iArr, i10, iArr, i3, this.mSize - i10);
        long[] jArr = this.mValues;
        System.arraycopy(jArr, i10, jArr, i3, this.mSize - i10);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public long valueAt(int i3) {
        return this.mValues[i3];
    }

    public SparseLongArray(int i3) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i3);
        this.mKeys = new int[idealLongArraySize];
        this.mValues = new long[idealLongArraySize];
        this.mSize = 0;
    }

    public SparseLongArray clone() {
        try {
            SparseLongArray sparseLongArray = (SparseLongArray) super.clone();
            try {
                sparseLongArray.mKeys = (int[]) this.mKeys.clone();
                sparseLongArray.mValues = (long[]) this.mValues.clone();
                return sparseLongArray;
            } catch (CloneNotSupportedException unused) {
                return sparseLongArray;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public long get(int i3, long j10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i3);
        return binarySearch < 0 ? j10 : this.mValues[binarySearch];
    }
}
