package org.telegram.messenger.support;

public class LongSparseLongArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private long[] mValues;

    public LongSparseLongArray() {
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
        return jArr[i14] == j10 ? i14 : ~i14;
    }

    private void growKeyAndValueArrays(int i10) {
        int iIdealLongArraySize = ArrayUtils.idealLongArraySize(i10);
        long[] jArr = new long[iIdealLongArraySize];
        long[] jArr2 = new long[iIdealLongArraySize];
        long[] jArr3 = this.mKeys;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.mValues;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.mKeys = jArr;
        this.mValues = jArr2;
    }

    public void append(long j10, long j11) {
        int i10 = this.mSize;
        if (i10 != 0 && j10 <= this.mKeys[i10 - 1]) {
            put(j10, j11);
            return;
        }
        if (i10 >= this.mKeys.length) {
            growKeyAndValueArrays(i10 + 1);
        }
        this.mKeys[i10] = j10;
        this.mValues[i10] = j11;
        this.mSize = i10 + 1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void delete(long j10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        if (iBinarySearch >= 0) {
            removeAt(iBinarySearch);
        }
    }

    public long get(long j10) {
        return get(j10, 0L);
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

    public void put(long j10, long j11) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = j11;
            return;
        }
        int i10 = ~iBinarySearch;
        int i11 = this.mSize;
        if (i11 >= this.mKeys.length) {
            growKeyAndValueArrays(i11 + 1);
        }
        int i12 = this.mSize;
        if (i12 - i10 != 0) {
            long[] jArr = this.mKeys;
            int i13 = i10 + 1;
            System.arraycopy(jArr, i10, jArr, i13, i12 - i10);
            long[] jArr2 = this.mValues;
            System.arraycopy(jArr2, i10, jArr2, i13, this.mSize - i10);
        }
        this.mKeys[i10] = j10;
        this.mValues[i10] = j11;
        this.mSize++;
    }

    public void removeAt(int i10) {
        long[] jArr = this.mKeys;
        int i11 = i10 + 1;
        System.arraycopy(jArr, i11, jArr, i10, this.mSize - i11);
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, i11, jArr2, i10, this.mSize - i11);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public long valueAt(int i10) {
        return this.mValues[i10];
    }

    public LongSparseLongArray(int i10) {
        int iIdealLongArraySize = ArrayUtils.idealLongArraySize(i10);
        this.mKeys = new long[iIdealLongArraySize];
        this.mValues = new long[iIdealLongArraySize];
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
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, j10);
        return iBinarySearch < 0 ? j11 : this.mValues[iBinarySearch];
    }
}
