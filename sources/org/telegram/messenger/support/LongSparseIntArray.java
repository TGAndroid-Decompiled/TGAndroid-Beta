package org.telegram.messenger.support;
public class LongSparseIntArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private int[] mValues;

    public LongSparseIntArray() {
        this(10);
    }

    private static int binarySearch(long[] jArr, int i3, int i10, long j10) {
        int i11 = i10 + i3;
        int i12 = i3 - 1;
        int i13 = i11;
        while (i13 - i12 > 1) {
            int i14 = (i13 + i12) / 2;
            if (jArr[i14] < j10) {
                i12 = i14;
            } else {
                i13 = i14;
            }
        }
        if (i13 == i11) {
            return ~i11;
        }
        if (jArr[i13] == j10) {
            return i13;
        }
        return ~i13;
    }

    private void growKeyAndValueArrays(int i3) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i3);
        long[] jArr = new long[idealLongArraySize];
        int[] iArr = new int[idealLongArraySize];
        long[] jArr2 = this.mKeys;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        int[] iArr2 = this.mValues;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.mKeys = jArr;
        this.mValues = iArr;
    }

    public void append(long j10, int i3) {
        int i10 = this.mSize;
        if (i10 != 0 && j10 <= this.mKeys[i10 - 1]) {
            put(j10, i3);
            return;
        }
        if (i10 >= this.mKeys.length) {
            growKeyAndValueArrays(i10 + 1);
        }
        this.mKeys[i10] = j10;
        this.mValues[i10] = i3;
        this.mSize = i10 + 1;
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
        for (int i3 = 0; i3 < this.mSize; i3++) {
            if (this.mValues[i3] == j10) {
                return i3;
            }
        }
        return -1;
    }

    public long keyAt(int i3) {
        return this.mKeys[i3];
    }

    public void put(long j10, int i3) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = i3;
            return;
        }
        int i10 = ~binarySearch;
        int i11 = this.mSize;
        if (i11 >= this.mKeys.length) {
            growKeyAndValueArrays(i11 + 1);
        }
        int i12 = this.mSize;
        if (i12 - i10 != 0) {
            long[] jArr = this.mKeys;
            int i13 = i10 + 1;
            System.arraycopy(jArr, i10, jArr, i13, i12 - i10);
            int[] iArr = this.mValues;
            System.arraycopy(iArr, i10, iArr, i13, this.mSize - i10);
        }
        this.mKeys[i10] = j10;
        this.mValues[i10] = i3;
        this.mSize++;
    }

    public void removeAt(int i3) {
        long[] jArr = this.mKeys;
        int i10 = i3 + 1;
        System.arraycopy(jArr, i10, jArr, i3, this.mSize - i10);
        int[] iArr = this.mValues;
        System.arraycopy(iArr, i10, iArr, i3, this.mSize - i10);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public int valueAt(int i3) {
        return this.mValues[i3];
    }

    public LongSparseIntArray(int i3) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i3);
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

    public int get(long j10, int i3) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        return binarySearch < 0 ? i3 : this.mValues[binarySearch];
    }
}
