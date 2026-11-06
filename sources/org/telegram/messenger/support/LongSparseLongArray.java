package org.telegram.messenger.support;
public class LongSparseLongArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private long[] mValues;

    public LongSparseLongArray() {
        this(10);
    }

    private static int binarySearch(long[] jArr, int i7, int i10, long j3) {
        int i11 = i10 + i7;
        int i12 = i7 - 1;
        int i13 = i11;
        while (i13 - i12 > 1) {
            int i14 = (i13 + i12) / 2;
            if (jArr[i14] < j3) {
                i12 = i14;
            } else {
                i13 = i14;
            }
        }
        if (i13 == i11) {
            return ~i11;
        }
        if (jArr[i13] == j3) {
            return i13;
        }
        return ~i13;
    }

    private void growKeyAndValueArrays(int i7) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i7);
        long[] jArr = new long[idealLongArraySize];
        long[] jArr2 = new long[idealLongArraySize];
        long[] jArr3 = this.mKeys;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.mValues;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.mKeys = jArr;
        this.mValues = jArr2;
    }

    public void append(long j3, long j10) {
        int i7 = this.mSize;
        if (i7 != 0 && j3 <= this.mKeys[i7 - 1]) {
            put(j3, j10);
            return;
        }
        if (i7 >= this.mKeys.length) {
            growKeyAndValueArrays(i7 + 1);
        }
        this.mKeys[i7] = j3;
        this.mValues[i7] = j10;
        this.mSize = i7 + 1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void delete(long j3) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j3);
        if (binarySearch >= 0) {
            removeAt(binarySearch);
        }
    }

    public long get(long j3) {
        return get(j3, 0L);
    }

    public int indexOfKey(long j3) {
        return binarySearch(this.mKeys, 0, this.mSize, j3);
    }

    public int indexOfValue(long j3) {
        for (int i7 = 0; i7 < this.mSize; i7++) {
            if (this.mValues[i7] == j3) {
                return i7;
            }
        }
        return -1;
    }

    public long keyAt(int i7) {
        return this.mKeys[i7];
    }

    public void put(long j3, long j10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j3);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = j10;
            return;
        }
        int i7 = ~binarySearch;
        int i10 = this.mSize;
        if (i10 >= this.mKeys.length) {
            growKeyAndValueArrays(i10 + 1);
        }
        int i11 = this.mSize;
        if (i11 - i7 != 0) {
            long[] jArr = this.mKeys;
            int i12 = i7 + 1;
            System.arraycopy(jArr, i7, jArr, i12, i11 - i7);
            long[] jArr2 = this.mValues;
            System.arraycopy(jArr2, i7, jArr2, i12, this.mSize - i7);
        }
        this.mKeys[i7] = j3;
        this.mValues[i7] = j10;
        this.mSize++;
    }

    public void removeAt(int i7) {
        long[] jArr = this.mKeys;
        int i10 = i7 + 1;
        System.arraycopy(jArr, i10, jArr, i7, this.mSize - i10);
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, i10, jArr2, i7, this.mSize - i10);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public long valueAt(int i7) {
        return this.mValues[i7];
    }

    public LongSparseLongArray(int i7) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i7);
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

    public long get(long j3, long j10) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j3);
        return binarySearch < 0 ? j10 : this.mValues[binarySearch];
    }
}
