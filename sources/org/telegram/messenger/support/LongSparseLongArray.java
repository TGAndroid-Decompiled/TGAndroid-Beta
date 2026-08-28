package org.telegram.messenger.support;
public class LongSparseLongArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private long[] mValues;

    public LongSparseLongArray() {
        this(10);
    }

    private static int binarySearch(long[] jArr, int i9, int i10, long j10) {
        int i11 = i10 + i9;
        int i12 = i9 - 1;
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

    private void growKeyAndValueArrays(int i9) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i9);
        long[] jArr = new long[idealLongArraySize];
        long[] jArr2 = new long[idealLongArraySize];
        long[] jArr3 = this.mKeys;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.mValues;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.mKeys = jArr;
        this.mValues = jArr2;
    }

    public void append(long j10, long j11) {
        int i9 = this.mSize;
        if (i9 != 0 && j10 <= this.mKeys[i9 - 1]) {
            put(j10, j11);
            return;
        }
        if (i9 >= this.mKeys.length) {
            growKeyAndValueArrays(i9 + 1);
        }
        this.mKeys[i9] = j10;
        this.mValues[i9] = j11;
        this.mSize = i9 + 1;
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

    public long get(long j10) {
        return get(j10, 0L);
    }

    public int indexOfKey(long j10) {
        return binarySearch(this.mKeys, 0, this.mSize, j10);
    }

    public int indexOfValue(long j10) {
        for (int i9 = 0; i9 < this.mSize; i9++) {
            if (this.mValues[i9] == j10) {
                return i9;
            }
        }
        return -1;
    }

    public long keyAt(int i9) {
        return this.mKeys[i9];
    }

    public void put(long j10, long j11) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = j11;
            return;
        }
        int i9 = ~binarySearch;
        int i10 = this.mSize;
        if (i10 >= this.mKeys.length) {
            growKeyAndValueArrays(i10 + 1);
        }
        int i11 = this.mSize;
        if (i11 - i9 != 0) {
            long[] jArr = this.mKeys;
            int i12 = i9 + 1;
            System.arraycopy(jArr, i9, jArr, i12, i11 - i9);
            long[] jArr2 = this.mValues;
            System.arraycopy(jArr2, i9, jArr2, i12, this.mSize - i9);
        }
        this.mKeys[i9] = j10;
        this.mValues[i9] = j11;
        this.mSize++;
    }

    public void removeAt(int i9) {
        long[] jArr = this.mKeys;
        int i10 = i9 + 1;
        System.arraycopy(jArr, i10, jArr, i9, this.mSize - i10);
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, i10, jArr2, i9, this.mSize - i10);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public long valueAt(int i9) {
        return this.mValues[i9];
    }

    public LongSparseLongArray(int i9) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i9);
        this.mKeys = new long[idealLongArraySize];
        this.mValues = new long[idealLongArraySize];
        this.mSize = 0;
    }

    public LongSparseLongArray clone() {
        try {
            LongSparseLongArray longSparseLongArray = (LongSparseLongArray) super.clone();
            try {
                longSparseLongArray.mKeys = (long[]) this.mKeys.clone();
                longSparseLongArray.mValues = (long[]) this.mValues.clone();
                return longSparseLongArray;
            } catch (CloneNotSupportedException unused) {
                return longSparseLongArray;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public long get(long j10, long j11) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        return binarySearch < 0 ? j11 : this.mValues[binarySearch];
    }
}
