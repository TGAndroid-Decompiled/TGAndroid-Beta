package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class u4f {
    public static int a(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static long b(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = (j2 ^ (j4 ^ (j4 >>> 47))) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long c(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length >= 0 && length <= bArr2.length) {
            char c = '/';
            char c2 = 0;
            if (length <= 32) {
                if (length <= 16) {
                    if (length >= 8) {
                        long j = (length << 1) - 7286425919675154353L;
                        long e = e(0, bArr2) - 7286425919675154353L;
                        long e2 = e(length - 8, bArr2);
                        return b((Long.rotateRight(e2, 37) * j) + e, (Long.rotateRight(e, 25) + e2) * j, j);
                    } else if (length >= 4) {
                        return b(length + ((a(0, bArr2) & 4294967295L) << 3), a(length - 4, bArr2) & 4294967295L, (length << 1) - 7286425919675154353L);
                    } else if (length <= 0) {
                        return -7286425919675154353L;
                    } else {
                        long j2 = (((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L));
                        return (j2 ^ (j2 >>> 47)) * (-7286425919675154353L);
                    }
                }
                long j3 = (length << 1) - 7286425919675154353L;
                long e3 = e(0, bArr2) * (-5435081209227447693L);
                long e4 = e(8, bArr2);
                long e5 = e(length - 8, bArr2) * j3;
                return b(Long.rotateRight(e5, 30) + Long.rotateRight(e3 + e4, 43) + (e(length - 16, bArr2) * (-7286425919675154353L)), Long.rotateRight(e4 - 7286425919675154353L, 18) + e3 + e5, j3);
            }
            char c3 = '@';
            if (length <= 64) {
                long j4 = (length << 1) - 7286425919675154353L;
                long e6 = e(0, bArr2) * (-7286425919675154353L);
                long e7 = e(8, bArr2);
                long e8 = e(length - 8, bArr2) * j4;
                long rotateRight = Long.rotateRight(e8, 30) + Long.rotateRight(e6 + e7, 43) + (e(length - 16, bArr2) * (-7286425919675154353L));
                long b = b(rotateRight, Long.rotateRight(e7 - 7286425919675154353L, 18) + e6 + e8, j4);
                long e9 = e(16, bArr2) * j4;
                long e10 = e(24, bArr2);
                long e11 = (e(length - 32, bArr2) + rotateRight) * j4;
                return b(Long.rotateRight(e11, 30) + Long.rotateRight(e9 + e10, 43) + ((e(length - 24, bArr2) + b) * j4), Long.rotateRight(e10 + e6, 18) + e9 + e11, j4);
            }
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long e12 = e(0, bArr2) + 95310865018149119L;
            int i = length - 1;
            int i2 = (i / 64) << 6;
            int i3 = i & 63;
            int i4 = i2 + i3;
            int i5 = i4 - 63;
            long j5 = 2480279821605975764L;
            long j6 = 1390051526045402406L;
            int i6 = i3;
            int i7 = 0;
            while (true) {
                long j7 = e12 + j5 + jArr[c2];
                char c4 = c2;
                long j8 = j5 + jArr[1];
                long rotateRight2 = (Long.rotateRight(e(i7 + 8, bArr2) + j7, 37) * (-5435081209227447693L)) ^ jArr2[1];
                char c5 = c3;
                long e13 = e(i7 + 40, bArr2) + jArr[c4] + (Long.rotateRight(e(i7 + 48, bArr2) + j8, 42) * (-5435081209227447693L));
                long rotateRight3 = Long.rotateRight(j6 + jArr2[c4], 33) * (-5435081209227447693L);
                char c6 = c;
                int i8 = i6;
                d(bArr2, i7, jArr[1] * (-5435081209227447693L), rotateRight2 + jArr2[c4], jArr);
                int i9 = i7;
                long[] jArr3 = jArr;
                d(bArr2, i9 + 32, rotateRight3 + jArr2[1], e(i9 + 16, bArr2) + e13, jArr2);
                i7 = i9 + 64;
                if (i7 == i2) {
                    long j9 = ((rotateRight2 & 255) << 1) - 5435081209227447693L;
                    long j10 = jArr2[c4] + i8;
                    jArr2[c4] = j10;
                    long j11 = jArr3[c4] + j10;
                    jArr3[c4] = j11;
                    jArr2[c4] = jArr2[c4] + j11;
                    long j12 = rotateRight3 + e13 + jArr3[c4];
                    long j13 = e13 + jArr3[1];
                    long rotateRight4 = (Long.rotateRight(e(i4 - 55, bArr2) + j12, 37) * j9) ^ (jArr2[1] * 9);
                    long e14 = e(i4 - 23, bArr2) + (jArr3[c4] * 9) + (Long.rotateRight(e(i4 - 15, bArr2) + j13, 42) * j9);
                    long rotateRight5 = Long.rotateRight(rotateRight2 + jArr2[c4], 33) * j9;
                    d(bArr2, i5, jArr3[1] * j9, jArr2[c4] + rotateRight4, jArr3);
                    d(bArr2, i4 - 31, jArr2[1] + rotateRight5, e(i4 - 47, bArr2) + e14, jArr2);
                    return b(((e14 ^ (e14 >>> c6)) * (-4348849565147123417L)) + b(jArr3[c4], jArr2[c4], j9) + rotateRight4, b(jArr3[1], jArr2[1], j9) + rotateRight5, j9);
                }
                bArr2 = bArr;
                e12 = rotateRight3;
                jArr = jArr3;
                c2 = c4;
                j6 = rotateRight2;
                c3 = c5;
                j5 = e13;
                i6 = i8;
                c = c6;
            }
        } else {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public static void d(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long e = e(i, bArr);
        long e2 = e(i + 8, bArr);
        long e3 = e(i + 16, bArr);
        long e4 = e(i + 24, bArr);
        long j3 = j + e;
        long rotateRight = Long.rotateRight(j2 + j3 + e4, 21);
        long j4 = e2 + j3 + e3;
        jArr[0] = j4 + e4;
        jArr[1] = Long.rotateRight(j4, 44) + rotateRight + j3;
    }

    public static long e(int i, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
