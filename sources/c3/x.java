package c3;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
public final class x {
    public long f4119a;
    public long f4120b;

    public x(long j10, long j11) {
        this.f4119a = j10;
        this.f4120b = j11;
    }

    public static boolean a(int i3) {
        if (i3 != 0 && i3 != 4 && i3 != 8) {
            return false;
        }
        return true;
    }

    public static c3.x b(java.io.File r29) {
        throw new UnsupportedOperationException("Method not decompiled: c3.x.b(java.io.File):c3.x");
    }

    public static long c(int i3, ByteBuffer byteBuffer) {
        if (i3 != 4) {
            if (i3 != 8) {
                return 0L;
            }
            return byteBuffer.getLong();
        }
        return byteBuffer.getInt() & 4294967295L;
    }

    public static String d(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer, long j10) {
        long j11;
        int i3;
        String str;
        long j12;
        int i10;
        long j13;
        int i11;
        int i12;
        long j14;
        int i13;
        int i14;
        long j15;
        int i15;
        int i16;
        char c2 = 4;
        byteBuffer.position(4);
        int i17 = -1;
        ByteBuffer byteBuffer2 = null;
        while (true) {
            char c10 = c2;
            int i18 = 2;
            if (byteBuffer.remaining() >= 8) {
                int position = byteBuffer.position();
                str = null;
                j12 = 1;
                long j16 = byteBuffer.getInt() & 4294967295L;
                int i19 = byteBuffer.getInt();
                if (j16 >= 8) {
                    j11 = 4294967295L;
                    if (j16 > byteBuffer.limit() - position) {
                        break;
                    }
                    int i20 = position + ((int) j16);
                    ByteBuffer byteBuffer3 = (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(position + 8)).limit(i20);
                    if (i19 == 1768517222) {
                        int i21 = byteBuffer3.get() & 255;
                        byteBuffer3.position(byteBuffer3.position() + 3);
                        if (i21 == 0) {
                            j14 = byteBuffer3.getShort() & 65535;
                        } else {
                            j14 = byteBuffer3.getInt() & 4294967295L;
                        }
                        long j17 = 0;
                        for (int i22 = 8; j17 < j14 && byteBuffer3.remaining() >= i22 && i17 < 0; i22 = 8) {
                            int position2 = byteBuffer3.position();
                            long j18 = j17;
                            long j19 = byteBuffer3.getInt() & 4294967295L;
                            int i23 = byteBuffer3.getInt();
                            if (j19 < 8 || j19 > byteBuffer3.limit() - position2) {
                                break;
                            }
                            if (i23 == 1768842853 && byteBuffer3.remaining() >= 12) {
                                int i24 = byteBuffer3.get() & 255;
                                byteBuffer3.position(byteBuffer3.position() + 3);
                                if (i24 >= i18) {
                                    if (i24 == i18) {
                                        i15 = byteBuffer3.getShort() & 65535;
                                    } else {
                                        i15 = byteBuffer3.getInt();
                                    }
                                    byteBuffer3.getShort();
                                    if (byteBuffer3.getInt() == 1835625829) {
                                        int i25 = ((int) j19) + position2;
                                        String[] strArr = new String[i18];
                                        int i26 = 0;
                                        while (i26 < i18 && byteBuffer3.position() < i25) {
                                            int position3 = byteBuffer3.position();
                                            while (byteBuffer3.position() < i25 && byteBuffer3.get() != 0) {
                                            }
                                            int position4 = byteBuffer3.position() - position3;
                                            if (byteBuffer3.get(byteBuffer3.position() - 1) == 0) {
                                                i16 = 1;
                                            } else {
                                                i16 = 0;
                                            }
                                            strArr[i26] = new String(byteBuffer3.array(), byteBuffer3.arrayOffset() + position3, Math.max(0, position4 - i16));
                                            i26++;
                                            i17 = i17;
                                            position2 = position2;
                                            j14 = j14;
                                            i18 = 2;
                                        }
                                        i13 = i17;
                                        i14 = position2;
                                        j15 = j14;
                                        if ("application/rdf+xml".equalsIgnoreCase(strArr[1])) {
                                            i17 = i15;
                                            byteBuffer3.position(i14 + ((int) j19));
                                            j17 = j18 + 1;
                                            j14 = j15;
                                            i18 = 2;
                                        }
                                        i17 = i13;
                                        byteBuffer3.position(i14 + ((int) j19));
                                        j17 = j18 + 1;
                                        j14 = j15;
                                        i18 = 2;
                                    }
                                }
                            }
                            i13 = i17;
                            i14 = position2;
                            j15 = j14;
                            i17 = i13;
                            byteBuffer3.position(i14 + ((int) j19));
                            j17 = j18 + 1;
                            j14 = j15;
                            i18 = 2;
                        }
                        i17 = i17;
                    } else if (i19 == 1768714083) {
                        byteBuffer2 = byteBuffer3;
                    }
                    byteBuffer.position(i20);
                    c2 = c10;
                } else {
                    j11 = 4294967295L;
                    break;
                }
            } else {
                j11 = 4294967295L;
                i3 = 0;
                str = null;
                j12 = 1;
                break;
            }
        }
        i3 = 0;
        if (i17 >= 0 && byteBuffer2 != null) {
            int i27 = byteBuffer2.get() & 255;
            byteBuffer2.position(byteBuffer2.position() + 3);
            short s6 = byteBuffer2.getShort();
            int i28 = s6 & 65535;
            int i29 = (i28 >> 12) & 15;
            int i30 = (i28 >> 8) & 15;
            int i31 = (i28 >> 4) & 15;
            if (i27 != 1 && i27 != 2) {
                i10 = i3;
            } else {
                i10 = s6 & 15;
            }
            if (a(i29) && a(i30) && a(i31) && a(i10)) {
                int i32 = i10 + i29 + i30;
                if (i27 < 2) {
                    j13 = byteBuffer2.getShort() & 65535;
                } else {
                    j13 = byteBuffer2.getInt() & j11;
                }
                long j20 = 0;
                while (true) {
                    if (j20 >= j13) {
                        break;
                    }
                    if (i27 < 2) {
                        i11 = byteBuffer2.getShort() & 65535;
                    } else {
                        i11 = byteBuffer2.getInt();
                    }
                    int i33 = i11;
                    if (i27 != 1 && i27 != 2) {
                        i12 = 0;
                    } else {
                        i12 = byteBuffer2.getShort() & 15;
                    }
                    byteBuffer2.getShort();
                    long c11 = c(i31, byteBuffer2);
                    int i34 = byteBuffer2.getShort() & 65535;
                    long j21 = j20;
                    long j22 = j13;
                    if (i34 * i32 > byteBuffer2.remaining()) {
                        break;
                    } else if (i33 != i17) {
                        byteBuffer2.position((i34 * i32) + byteBuffer2.position());
                        j20 = j21 + j12;
                        j13 = j22;
                    } else if (i12 == 0 && i34 != 0 && i34 <= 64) {
                        long[] jArr = new long[i34];
                        long[] jArr2 = new long[i34];
                        long j23 = 0;
                        int i35 = 0;
                        while (true) {
                            if (i35 < i34) {
                                c(i10, byteBuffer2);
                                jArr[i35] = c(i29, byteBuffer2) + c11;
                                long c12 = c(i30, byteBuffer2);
                                jArr2[i35] = c12;
                                long j24 = jArr[i35];
                                if (j24 < 0 || c12 <= 0 || c12 > j10 - j24) {
                                    break;
                                }
                                j23 += c12;
                                i35++;
                            } else if (j23 <= 1048576) {
                                byte[] bArr = new byte[(int) j23];
                                int i36 = 0;
                                for (int i37 = 0; i37 < i34; i37++) {
                                    randomAccessFile.seek(jArr[i37]);
                                    randomAccessFile.readFully(bArr, i36, (int) jArr2[i37]);
                                    i36 += (int) jArr2[i37];
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

    public x() {
        this.f4119a = -9223372036854775807L;
        this.f4120b = -9223372036854775807L;
    }
}
