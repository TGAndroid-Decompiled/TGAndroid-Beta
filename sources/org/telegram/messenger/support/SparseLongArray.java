package org.telegram.messenger.support;

public class SparseLongArray implements Cloneable {
    private int[] mKeys;
    private int mSize;
    private long[] mValues;

    public SparseLongArray() {
        this(10);
    }

    private static int binarySearch(int[] iArr, int i10, int i11, long j10) {
        int i12 = i11 + i10;
        int i13 = i10 - 1;
        int i14 = i12;
        while (i14 - i13 > 1) {
            int i15 = (i14 + i13) / 2;
            if (iArr[i15] < j10) {
                i13 = i15;
            } else {
                i14 = i15;
            }
        }
        if (i14 == i12) {
            return ~i12;
        }
        return ((long) iArr[i14]) == j10 ? i14 : ~i14;
    }

    private void growKeyAndValueArrays(int i10) {
        int iIdealLongArraySize = ArrayUtils.idealLongArraySize(i10);
        int[] iArr = new int[iIdealLongArraySize];
        long[] jArr = new long[iIdealLongArraySize];
        int[] iArr2 = this.mKeys;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.mKeys = iArr;
        this.mValues = jArr;
    }

    public void append(int i10, long j10) {
        int i11 = this.mSize;
        if (i11 != 0 && i10 <= this.mKeys[i11 - 1]) {
            put(i10, j10);
            return;
        }
        if (i11 >= this.mKeys.length) {
            growKeyAndValueArrays(i11 + 1);
        }
        this.mKeys[i11] = i10;
        this.mValues[i11] = j10;
        this.mSize = i11 + 1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void delete(int i10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            removeAt(iBinarySearch);
        }
    }

    public long get(int i10) {
        return get(i10, 0L);
    }

    public int indexOfKey(int i10) {
        return binarySearch(this.mKeys, 0, this.mSize, i10);
    }

    public int indexOfValue(long j10) {
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (this.mValues[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    public int keyAt(int i10) {
        return this.mKeys[i10];
    }

    public void put(int i10, long j10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = j10;
            return;
        }
        int i11 = ~iBinarySearch;
        int i12 = this.mSize;
        if (i12 >= this.mKeys.length) {
            growKeyAndValueArrays(i12 + 1);
        }
        int i13 = this.mSize;
        if (i13 - i11 != 0) {
            int[] iArr = this.mKeys;
            int i14 = i11 + 1;
            System.arraycopy(iArr, i11, iArr, i14, i13 - i11);
            long[] jArr = this.mValues;
            System.arraycopy(jArr, i11, jArr, i14, this.mSize - i11);
        }
        this.mKeys[i11] = i10;
        this.mValues[i11] = j10;
        this.mSize++;
    }

    public void removeAt(int i10) {
        int[] iArr = this.mKeys;
        int i11 = i10 + 1;
        System.arraycopy(iArr, i11, iArr, i10, this.mSize - i11);
        long[] jArr = this.mValues;
        System.arraycopy(jArr, i11, jArr, i10, this.mSize - i11);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public long valueAt(int i10) {
        return this.mValues[i10];
    }

    public SparseLongArray(int i10) {
        int iIdealLongArraySize = ArrayUtils.idealLongArraySize(i10);
        this.mKeys = new int[iIdealLongArraySize];
        this.mValues = new long[iIdealLongArraySize];
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

    public long get(int i10, long j10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        return iBinarySearch < 0 ? j10 : this.mValues[iBinarySearch];
    }
}
