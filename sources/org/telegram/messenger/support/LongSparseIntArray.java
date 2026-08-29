package org.telegram.messenger.support;
public class LongSparseIntArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private int[] mValues;

    public LongSparseIntArray() {
        this(10);
    }

    private static int binarySearch(long[] jArr, int i10, int i11, long j10) {
        int i12 = i11 + i10;
        int i13 = i10 - 1;
        int i14 = i12;
        while (i14 - i13 > 1) {
            int i15 = (i14 + i13) / 2;
            if (jArr[i15] < j10) {
                i13 = i15;
            } else {
                i14 = i15;
            }
        }
        if (i14 == i12) {
            return ~i12;
        }
        if (jArr[i14] == j10) {
            return i14;
        }
        return ~i14;
    }

    private void growKeyAndValueArrays(int i10) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i10);
        long[] jArr = new long[idealLongArraySize];
        int[] iArr = new int[idealLongArraySize];
        long[] jArr2 = this.mKeys;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        int[] iArr2 = this.mValues;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.mKeys = jArr;
        this.mValues = iArr;
    }

    public void append(long j10, int i10) {
        int i11 = this.mSize;
        if (i11 != 0 && j10 <= this.mKeys[i11 - 1]) {
            put(j10, i10);
            return;
        }
        if (i11 >= this.mKeys.length) {
            growKeyAndValueArrays(i11 + 1);
        }
        this.mKeys[i11] = j10;
        this.mValues[i11] = i10;
        this.mSize = i11 + 1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void delete(long j10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        if (binarySearch >= 0) {
            removeAt(binarySearch);
        }
    }

    public int get(long j10) {
        return get(j10, 0);
    }

    public int indexOfKey(long j10) {
        return binarySearch(this.mKeys, 0, this.mSize, j10);
    }

    public int indexOfValue(long j10) {
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (this.mValues[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    public long keyAt(int i10) {
        return this.mKeys[i10];
    }

    public void put(long j10, int i10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = i10;
            return;
        }
        int i11 = ~binarySearch;
        int i12 = this.mSize;
        if (i12 >= this.mKeys.length) {
            growKeyAndValueArrays(i12 + 1);
        }
        int i13 = this.mSize;
        if (i13 - i11 != 0) {
            long[] jArr = this.mKeys;
            int i14 = i11 + 1;
            System.arraycopy(jArr, i11, jArr, i14, i13 - i11);
            int[] iArr = this.mValues;
            System.arraycopy(iArr, i11, iArr, i14, this.mSize - i11);
        }
        this.mKeys[i11] = j10;
        this.mValues[i11] = i10;
        this.mSize++;
    }

    public void removeAt(int i10) {
        long[] jArr = this.mKeys;
        int i11 = i10 + 1;
        System.arraycopy(jArr, i11, jArr, i10, this.mSize - i11);
        int[] iArr = this.mValues;
        System.arraycopy(iArr, i11, iArr, i10, this.mSize - i11);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public int valueAt(int i10) {
        return this.mValues[i10];
    }

    public LongSparseIntArray(int i10) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i10);
        this.mKeys = new long[idealLongArraySize];
        this.mValues = new int[idealLongArraySize];
        this.mSize = 0;
    }

    public LongSparseIntArray clone() {
        try {
            LongSparseIntArray longSparseIntArray = (LongSparseIntArray) super.clone();
            try {
                longSparseIntArray.mKeys = (long[]) this.mKeys.clone();
                longSparseIntArray.mValues = (int[]) this.mValues.clone();
                return longSparseIntArray;
            } catch (CloneNotSupportedException unused) {
                return longSparseIntArray;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public int get(long j10, int i10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        return binarySearch < 0 ? i10 : this.mValues[binarySearch];
    }
}
