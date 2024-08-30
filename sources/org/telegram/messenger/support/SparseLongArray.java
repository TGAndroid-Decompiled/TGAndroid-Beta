package org.telegram.messenger.support;

public class SparseLongArray implements Cloneable {
    private int[] mKeys;
    private int mSize;
    private long[] mValues;

    public SparseLongArray() {
        this(10);
    }

    public SparseLongArray(int i) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i);
        this.mKeys = new int[idealLongArraySize];
        this.mValues = new long[idealLongArraySize];
        this.mSize = 0;
    }

    private static int binarySearch(int[] iArr, int i, int i2, long j) {
        int i3 = i2 + i;
        int i4 = i - 1;
        int i5 = i3;
        while (i5 - i4 > 1) {
            int i6 = (i5 + i4) / 2;
            if (iArr[i6] < j) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        return i5 == i3 ? i3 ^ (-1) : ((long) iArr[i5]) == j ? i5 : i5 ^ (-1);
    }

    private void growKeyAndValueArrays(int i) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i);
        int[] iArr = new int[idealLongArraySize];
        long[] jArr = new long[idealLongArraySize];
        int[] iArr2 = this.mKeys;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.mKeys = iArr;
        this.mValues = jArr;
    }

    public void append(int i, long j) {
        int i2 = this.mSize;
        if (i2 != 0 && i <= this.mKeys[i2 - 1]) {
            put(i, j);
            return;
        }
        if (i2 >= this.mKeys.length) {
            growKeyAndValueArrays(i2 + 1);
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = j;
        this.mSize = i2 + 1;
    }

    public void clear() {
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

    public void delete(int i) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch >= 0) {
            removeAt(binarySearch);
        }
    }

    public long get(int i) {
        return get(i, 0L);
    }

    public long get(int i, long j) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        return binarySearch < 0 ? j : this.mValues[binarySearch];
    }

    public int indexOfKey(int i) {
        return binarySearch(this.mKeys, 0, this.mSize, i);
    }

    public int indexOfValue(long j) {
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public int keyAt(int i) {
        return this.mKeys[i];
    }

    public void put(int i, long j) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = j;
            return;
        }
        int i2 = binarySearch ^ (-1);
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            growKeyAndValueArrays(i3 + 1);
        }
        int i4 = this.mSize - i2;
        if (i4 != 0) {
            int[] iArr = this.mKeys;
            int i5 = i2 + 1;
            System.arraycopy(iArr, i2, iArr, i5, i4);
            long[] jArr = this.mValues;
            System.arraycopy(jArr, i2, jArr, i5, this.mSize - i2);
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = j;
        this.mSize++;
    }

    public void removeAt(int i) {
        int[] iArr = this.mKeys;
        int i2 = i + 1;
        System.arraycopy(iArr, i2, iArr, i, this.mSize - i2);
        long[] jArr = this.mValues;
        System.arraycopy(jArr, i2, jArr, i, this.mSize - i2);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public long valueAt(int i) {
        return this.mValues[i];
    }
}
