package d3;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
public final class x {
    public long f8096a;
    public long f8097b;

    public x(long j3, long j10) {
        this.f8096a = j3;
        this.f8097b = j10;
    }

    public static boolean a(int i7) {
        if (i7 != 0 && i7 != 4 && i7 != 8) {
            return false;
        }
        return true;
    }

    public static d3.x b(java.io.File r29) {
        throw new UnsupportedOperationException("Method not decompiled: d3.x.b(java.io.File):d3.x");
    }

    public static long c(int i7, ByteBuffer byteBuffer) {
        if (i7 != 4) {
            if (i7 != 8) {
                return 0L;
            }
            return byteBuffer.getLong();
        }
        return byteBuffer.getInt() & 4294967295L;
    }

    public static String d(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer, long j3) {
        long j10;
        int i7;
        String str;
        long j11;
        int i10;
        long j12;
        int i11;
        int i12;
        long j13;
        int i13;
        int i14;
        long j14;
        int i15;
        int i16;
        char c10 = 4;
        byteBuffer.position(4);
        int i17 = -1;
        ByteBuffer byteBuffer2 = null;
        while (true) {
            char c11 = c10;
            int i18 = 2;
            if (byteBuffer.remaining() >= 8) {
                int position = byteBuffer.position();
                str = null;
                j11 = 1;
                long j15 = byteBuffer.getInt() & 4294967295L;
                int i19 = byteBuffer.getInt();
                if (j15 >= 8) {
                    j10 = 4294967295L;
                    if (j15 > byteBuffer.limit() - position) {
                        break;
                    }
                    int i20 = position + ((int) j15);
                    ByteBuffer byteBuffer3 = (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(position + 8)).limit(i20);
                    if (i19 == 1768517222) {
                        int i21 = byteBuffer3.get() & 255;
                        byteBuffer3.position(byteBuffer3.position() + 3);
                        if (i21 == 0) {
                            j13 = byteBuffer3.getShort() & 65535;
                        } else {
                            j13 = byteBuffer3.getInt() & 4294967295L;
                        }
                        long j16 = 0;
                        for (int i22 = 8; j16 < j13 && byteBuffer3.remaining() >= i22 && i17 < 0; i22 = 8) {
                            int position2 = byteBuffer3.position();
                            long j17 = j16;
                            long j18 = byteBuffer3.getInt() & 4294967295L;
                            int i23 = byteBuffer3.getInt();
                            if (j18 < 8 || j18 > byteBuffer3.limit() - position2) {
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
                                        int i25 = ((int) j18) + position2;
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
                                            j13 = j13;
                                            i18 = 2;
                                        }
                                        i13 = i17;
                                        i14 = position2;
                                        j14 = j13;
                                        if ("application/rdf+xml".equalsIgnoreCase(strArr[1])) {
                                            i17 = i15;
                                            byteBuffer3.position(i14 + ((int) j18));
                                            j16 = j17 + 1;
                                            j13 = j14;
                                            i18 = 2;
                                        }
                                        i17 = i13;
                                        byteBuffer3.position(i14 + ((int) j18));
                                        j16 = j17 + 1;
                                        j13 = j14;
                                        i18 = 2;
                                    }
                                }
                            }
                            i13 = i17;
                            i14 = position2;
                            j14 = j13;
                            i17 = i13;
                            byteBuffer3.position(i14 + ((int) j18));
                            j16 = j17 + 1;
                            j13 = j14;
                            i18 = 2;
                        }
                        i17 = i17;
                    } else if (i19 == 1768714083) {
                        byteBuffer2 = byteBuffer3;
                    }
                    byteBuffer.position(i20);
                    c10 = c11;
                } else {
                    j10 = 4294967295L;
                    break;
                }
            } else {
                j10 = 4294967295L;
                i7 = 0;
                str = null;
                j11 = 1;
                break;
            }
        }
        i7 = 0;
        if (i17 >= 0 && byteBuffer2 != null) {
            int i27 = byteBuffer2.get() & 255;
            byteBuffer2.position(byteBuffer2.position() + 3);
            short s5 = byteBuffer2.getShort();
            int i28 = s5 & 65535;
            int i29 = (i28 >> 12) & 15;
            int i30 = (i28 >> 8) & 15;
            int i31 = (i28 >> 4) & 15;
            if (i27 != 1 && i27 != 2) {
                i10 = i7;
            } else {
                i10 = s5 & 15;
            }
            if (a(i29) && a(i30) && a(i31) && a(i10)) {
                int i32 = i10 + i29 + i30;
                if (i27 < 2) {
                    j12 = byteBuffer2.getShort() & 65535;
                } else {
                    j12 = byteBuffer2.getInt() & j10;
                }
                long j19 = 0;
                while (true) {
                    if (j19 >= j12) {
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
                    long c12 = c(i31, byteBuffer2);
                    int i34 = byteBuffer2.getShort() & 65535;
                    long j20 = j19;
                    long j21 = j12;
                    if (i34 * i32 > byteBuffer2.remaining()) {
                        break;
                    } else if (i33 != i17) {
                        byteBuffer2.position((i34 * i32) + byteBuffer2.position());
                        j19 = j20 + j11;
                        j12 = j21;
                    } else if (i12 == 0 && i34 != 0 && i34 <= 64) {
                        long[] jArr = new long[i34];
                        long[] jArr2 = new long[i34];
                        long j22 = 0;
                        int i35 = 0;
                        while (true) {
                            if (i35 < i34) {
                                c(i10, byteBuffer2);
                                jArr[i35] = c(i29, byteBuffer2) + c12;
                                long c13 = c(i30, byteBuffer2);
                                jArr2[i35] = c13;
                                long j23 = jArr[i35];
                                if (j23 < 0 || c13 <= 0 || c13 > j3 - j23) {
                                    break;
                                }
                                j22 += c13;
                                i35++;
                            } else if (j22 <= 1048576) {
                                byte[] bArr = new byte[(int) j22];
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
        this.f8096a = -9223372036854775807L;
        this.f8097b = -9223372036854775807L;
    }
}
