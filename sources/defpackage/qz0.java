package defpackage;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
public final class qz0 {
    public long a;
    public long b;

    public qz0() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public static boolean a(int i) {
        if (i != 0 && i != 4 && i != 8) {
            return false;
        }
        return true;
    }

    public static defpackage.qz0 b(java.io.File r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.b(java.io.File):qz0");
    }

    public static long c(int i, ByteBuffer byteBuffer) {
        if (i != 4) {
            if (i != 8) {
                return 0L;
            }
            return byteBuffer.getLong();
        }
        return byteBuffer.getInt() & 4294967295L;
    }

    public static String d(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer, long j) {
        long j2;
        int i;
        String str;
        long j3;
        int i2;
        long j4;
        int i3;
        int i4;
        long j5;
        int i5;
        int i6;
        long j6;
        int i7;
        int i8;
        char c = 4;
        byteBuffer.position(4);
        int i9 = -1;
        ByteBuffer byteBuffer2 = null;
        while (true) {
            char c2 = c;
            int i10 = 2;
            if (byteBuffer.remaining() >= 8) {
                int position = byteBuffer.position();
                str = null;
                j3 = 1;
                long j7 = byteBuffer.getInt() & 4294967295L;
                int i11 = byteBuffer.getInt();
                if (j7 >= 8) {
                    j2 = 4294967295L;
                    if (j7 > byteBuffer.limit() - position) {
                        break;
                    }
                    int i12 = position + ((int) j7);
                    ByteBuffer byteBuffer3 = (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(position + 8)).limit(i12);
                    if (i11 == 1768517222) {
                        int i13 = byteBuffer3.get() & 255;
                        byteBuffer3.position(byteBuffer3.position() + 3);
                        if (i13 == 0) {
                            j5 = byteBuffer3.getShort() & 65535;
                        } else {
                            j5 = byteBuffer3.getInt() & 4294967295L;
                        }
                        long j8 = 0;
                        for (int i14 = 8; j8 < j5 && byteBuffer3.remaining() >= i14 && i9 < 0; i14 = 8) {
                            int position2 = byteBuffer3.position();
                            long j9 = j8;
                            long j10 = byteBuffer3.getInt() & 4294967295L;
                            int i15 = byteBuffer3.getInt();
                            if (j10 < 8 || j10 > byteBuffer3.limit() - position2) {
                                break;
                            }
                            if (i15 == 1768842853 && byteBuffer3.remaining() >= 12) {
                                int i16 = byteBuffer3.get() & 255;
                                byteBuffer3.position(byteBuffer3.position() + 3);
                                if (i16 >= i10) {
                                    if (i16 == i10) {
                                        i7 = byteBuffer3.getShort() & 65535;
                                    } else {
                                        i7 = byteBuffer3.getInt();
                                    }
                                    byteBuffer3.getShort();
                                    if (byteBuffer3.getInt() == 1835625829) {
                                        int i17 = ((int) j10) + position2;
                                        String[] strArr = new String[i10];
                                        int i18 = 0;
                                        while (i18 < i10 && byteBuffer3.position() < i17) {
                                            int position3 = byteBuffer3.position();
                                            while (byteBuffer3.position() < i17 && byteBuffer3.get() != 0) {
                                            }
                                            int position4 = byteBuffer3.position() - position3;
                                            if (byteBuffer3.get(byteBuffer3.position() - 1) == 0) {
                                                i8 = 1;
                                            } else {
                                                i8 = 0;
                                            }
                                            strArr[i18] = new String(byteBuffer3.array(), byteBuffer3.arrayOffset() + position3, Math.max(0, position4 - i8));
                                            i18++;
                                            i9 = i9;
                                            position2 = position2;
                                            j5 = j5;
                                            i10 = 2;
                                        }
                                        i5 = i9;
                                        i6 = position2;
                                        j6 = j5;
                                        if ("application/rdf+xml".equalsIgnoreCase(strArr[1])) {
                                            i9 = i7;
                                            byteBuffer3.position(i6 + ((int) j10));
                                            j8 = j9 + 1;
                                            j5 = j6;
                                            i10 = 2;
                                        }
                                        i9 = i5;
                                        byteBuffer3.position(i6 + ((int) j10));
                                        j8 = j9 + 1;
                                        j5 = j6;
                                        i10 = 2;
                                    }
                                }
                            }
                            i5 = i9;
                            i6 = position2;
                            j6 = j5;
                            i9 = i5;
                            byteBuffer3.position(i6 + ((int) j10));
                            j8 = j9 + 1;
                            j5 = j6;
                            i10 = 2;
                        }
                        i9 = i9;
                    } else if (i11 == 1768714083) {
                        byteBuffer2 = byteBuffer3;
                    }
                    byteBuffer.position(i12);
                    c = c2;
                } else {
                    j2 = 4294967295L;
                    break;
                }
            } else {
                j2 = 4294967295L;
                i = 0;
                str = null;
                j3 = 1;
                break;
            }
        }
        i = 0;
        if (i9 >= 0 && byteBuffer2 != null) {
            int i19 = byteBuffer2.get() & 255;
            byteBuffer2.position(byteBuffer2.position() + 3);
            short s = byteBuffer2.getShort();
            int i20 = s & 65535;
            int i21 = (i20 >> 12) & 15;
            int i22 = (i20 >> 8) & 15;
            int i23 = (i20 >> 4) & 15;
            if (i19 != 1 && i19 != 2) {
                i2 = i;
            } else {
                i2 = s & 15;
            }
            if (a(i21) && a(i22) && a(i23) && a(i2)) {
                int i24 = i2 + i21 + i22;
                if (i19 < 2) {
                    j4 = byteBuffer2.getShort() & 65535;
                } else {
                    j4 = byteBuffer2.getInt() & j2;
                }
                long j11 = 0;
                while (true) {
                    if (j11 >= j4) {
                        break;
                    }
                    if (i19 < 2) {
                        i3 = byteBuffer2.getShort() & 65535;
                    } else {
                        i3 = byteBuffer2.getInt();
                    }
                    int i25 = i3;
                    if (i19 != 1 && i19 != 2) {
                        i4 = 0;
                    } else {
                        i4 = byteBuffer2.getShort() & 15;
                    }
                    byteBuffer2.getShort();
                    long c3 = c(i23, byteBuffer2);
                    int i26 = byteBuffer2.getShort() & 65535;
                    long j12 = j11;
                    long j13 = j4;
                    if (i26 * i24 > byteBuffer2.remaining()) {
                        break;
                    } else if (i25 != i9) {
                        byteBuffer2.position((i26 * i24) + byteBuffer2.position());
                        j11 = j12 + j3;
                        j4 = j13;
                    } else if (i4 == 0 && i26 != 0 && i26 <= 64) {
                        long[] jArr = new long[i26];
                        long[] jArr2 = new long[i26];
                        long j14 = 0;
                        int i27 = 0;
                        while (true) {
                            if (i27 < i26) {
                                c(i2, byteBuffer2);
                                jArr[i27] = c(i21, byteBuffer2) + c3;
                                long c4 = c(i22, byteBuffer2);
                                jArr2[i27] = c4;
                                long j15 = jArr[i27];
                                if (j15 < 0 || c4 <= 0 || c4 > j - j15) {
                                    break;
                                }
                                j14 += c4;
                                i27++;
                            } else if (j14 <= 1048576) {
                                byte[] bArr = new byte[(int) j14];
                                int i28 = 0;
                                for (int i29 = 0; i29 < i26; i29++) {
                                    randomAccessFile.seek(jArr[i29]);
                                    randomAccessFile.readFully(bArr, i28, (int) jArr2[i29]);
                                    i28 += (int) jArr2[i29];
                                }
                                return new String(bArr, "UTF-8");
                            }
                        }
                    }
                }
            }
        }
        return str;
    }

    public qz0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
