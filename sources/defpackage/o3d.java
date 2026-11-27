package defpackage;

import java.util.Random;
public final class o3d extends Random {
    public long a;
    public long b;

    @Override
    public final int next(int i) {
        return ((int) nextLong()) >>> (32 - i);
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
        int i = 0;
        while (i < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i, 8);
            while (true) {
                int i2 = min - 1;
                if (min > 0) {
                    bArr[i] = (byte) nextLong;
                    nextLong >>>= 8;
                    i++;
                    min = i2;
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
        long j = this.a;
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = j2 ^ j;
        this.a = (Long.rotateLeft(j, 55) ^ j4) ^ (j4 << 14);
        this.b = Long.rotateLeft(j4, 36);
        return j3;
    }

    @Override
    public final void setSeed(long j) {
        if (this.a == 0 && this.b == 0) {
            return;
        }
        xi4.l("No seed set");
    }
}
