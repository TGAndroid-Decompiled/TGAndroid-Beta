package org.telegram.messenger.support;
public class LongSparseLongArray implements Cloneable {
    private long[] mKeys;
    private int mSize;
    private long[] mValues;

    public LongSparseLongArray() {
        this(10);
    }

    public LongSparseLongArray(int i) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i);
        this.mKeys = new long[idealLongArraySize];
        this.mValues = new long[idealLongArraySize];
        this.mSize = 0;
    }

    public LongSparseLongArray clone() {
        LongSparseLongArray longSparseLongArray = null;
        try {
            LongSparseLongArray longSparseLongArray2 = (LongSparseLongArray) super.clone();
            try {
                longSparseLongArray2.mKeys = (long[]) this.mKeys.clone();
                longSparseLongArray2.mValues = (long[]) this.mValues.clone();
                return longSparseLongArray2;
            } catch (CloneNotSupportedException unused) {
                longSparseLongArray = longSparseLongArray2;
                return longSparseLongArray;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public long get(long j) {
        return get(j, 0L);
    }

    public long get(long j, long j2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j);
        return binarySearch < 0 ? j2 : this.mValues[binarySearch];
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
        long[] jArr2 = this.mValues;
        System.arraycopy(jArr2, i2, jArr2, i, this.mSize - i2);
        this.mSize--;
    }

    public void put(long j, long j2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = j2;
            return;
        }
        int i = binarySearch ^ (-1);
        int i2 = this.mSize;
        if (i2 >= this.mKeys.length) {
            growKeyAndValueArrays(i2 + 1);
        }
        int i3 = this.mSize;
        if (i3 - i != 0) {
            long[] jArr = this.mKeys;
            int i4 = i + 1;
            System.arraycopy(jArr, i, jArr, i4, i3 - i);
            long[] jArr2 = this.mValues;
            System.arraycopy(jArr2, i, jArr2, i4, this.mSize - i);
        }
        this.mKeys[i] = j;
        this.mValues[i] = j2;
        this.mSize++;
    }

    public int size() {
        return this.mSize;
    }

    public long keyAt(int i) {
        return this.mKeys[i];
    }

    public long valueAt(int i) {
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

    public void append(long j, long j2) {
        int i = this.mSize;
        if (i != 0 && j <= this.mKeys[i - 1]) {
            put(j, j2);
            return;
        }
        if (i >= this.mKeys.length) {
            growKeyAndValueArrays(i + 1);
        }
        this.mKeys[i] = j;
        this.mValues[i] = j2;
        this.mSize = i + 1;
    }

    private void growKeyAndValueArrays(int i) {
        int idealLongArraySize = ArrayUtils.idealLongArraySize(i);
        long[] jArr = new long[idealLongArraySize];
        long[] jArr2 = new long[idealLongArraySize];
        long[] jArr3 = this.mKeys;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.mValues;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.mKeys = jArr;
        this.mValues = jArr2;
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
