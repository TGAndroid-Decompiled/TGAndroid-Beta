package org.telegram.messenger.support;

public class LongSparseIntArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private int[] mValues;

    public LongSparseIntArray() {
        this(10);
    }

    public LongSparseIntArray(int i) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i);
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

    public int get(long j) {
        return get(j, 0);
    }

    public int get(long j, int i) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j);
        return binarySearch < 0 ? i : this.mValues[binarySearch];
    }

    public void delete(long j) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j);
        if (binarySearch >= 0) {
            removeAt(binarySearch);
        }
    }

    public void removeAt(int i) {
        long[] jArr = this.mKeys;
        int i2 = i + 1;
        System.arraycopy(jArr, i2, jArr, i, this.mSize - i2);
        int[] iArr = this.mValues;
        System.arraycopy(iArr, i2, iArr, i, this.mSize - i2);
        this.mSize--;
    }

    public void put(long j, int i) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = i;
            return;
        }
        int i2 = binarySearch ^ (-1);
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            growKeyAndValueArrays(i3 + 1);
        }
        int i4 = this.mSize - i2;
        if (i4 != 0) {
            long[] jArr = this.mKeys;
            int i5 = i2 + 1;
            System.arraycopy(jArr, i2, jArr, i5, i4);
            int[] iArr = this.mValues;
            System.arraycopy(iArr, i2, iArr, i5, this.mSize - i2);
        }
        this.mKeys[i2] = j;
        this.mValues[i2] = i;
        this.mSize++;
    }

    public int size() {
        return this.mSize;
    }

    public long keyAt(int i) {
        return this.mKeys[i];
    }

    public int valueAt(int i) {
        return this.mValues[i];
    }

    public int indexOfKey(long j) {
        return binarySearch(this.mKeys, 0, this.mSize, j);
    }

    public int indexOfValue(long j) {
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void append(long j, int i) {
        int i2 = this.mSize;
        if (i2 != 0 && j <= this.mKeys[i2 - 1]) {
            put(j, i);
            return;
        }
        if (i2 >= this.mKeys.length) {
            growKeyAndValueArrays(i2 + 1);
        }
        this.mKeys[i2] = j;
        this.mValues[i2] = i;
        this.mSize = i2 + 1;
    }

    private void growKeyAndValueArrays(int i) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i);
        long[] jArr = new long[idealLongArraySize];
        int[] iArr = new int[idealLongArraySize];
        long[] jArr2 = this.mKeys;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        int[] iArr2 = this.mValues;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.mKeys = jArr;
        this.mValues = iArr;
    }

    private static int binarySearch(long[] jArr, int i, int i2, long j) {
        int i3 = i2 + i;
        int i4 = i - 1;
        int i5 = i3;
        while (i5 - i4 > 1) {
            int i6 = (i5 + i4) / 2;
            if (jArr[i6] < j) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        return i5 == i3 ? i3 ^ (-1) : jArr[i5] == j ? i5 : i5 ^ (-1);
    }
}
