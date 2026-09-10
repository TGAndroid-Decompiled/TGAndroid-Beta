package d5;

import java.util.Random;
public final class a extends Random {
    public long f6279a;
    public long f6280b;

    @Override
    public final int next(int i10) {
        return ((int) nextLong()) >>> (32 - i10);
    }

    @Override
    public final boolean nextBoolean() {
        if (nextLong() >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i10, 8);
            while (true) {
                int i11 = min - 1;
                if (min > 0) {
                    bArr[i10] = (byte) nextLong;
                    nextLong >>>= 8;
                    i10++;
                    min = i11;
                }
            }
        }
    }

    @Override
    public final double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override
    public final float nextFloat() {
        return (((int) nextLong()) >>> 8) * 5.9604645E-8f;
    }

    @Override
    public final int nextInt() {
        return (int) nextLong();
    }

    @Override
    public final long nextLong() {
        long j3 = this.f6279a;
        long j10 = this.f6280b;
        long j11 = j3 + j10;
        long j12 = j10 ^ j3;
        this.f6279a = (Long.rotateLeft(j3, 55) ^ j12) ^ (j12 << 14);
        this.f6280b = Long.rotateLeft(j12, 36);
        return j11;
    }

    @Override
    public final void setSeed(long j3) {
        if (this.f6279a == 0 && this.f6280b == 0) {
            return;
        }
        throw new RuntimeException("No seed set");
    }
}
