package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
public final class vl6 implements e84 {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public rl6 A;
    public ul6 B;
    public boolean C;
    public int D;
    public long E;
    public final SparseArray F;
    public boolean G;
    public long H;
    public int I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public long R;
    public boolean S;
    public long T;
    public boolean U;
    public byte V;
    public long W;
    public long X;
    public int Y;
    public int Z;
    public final ya3 a;
    public int[] a0;
    public final cdc b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final LongSparseArray d;
    public int d0;
    public final boolean e;
    public int e0;
    public final boolean f;
    public boolean f0;
    public final boolean g;
    public long g0;
    public final peb h;
    public int h0;
    public final ey7 i;
    public int i0;
    public final ey7 j;
    public int j0;
    public final ey7 k;
    public boolean k0;
    public final ey7 l;
    public boolean l0;
    public final ey7 m;
    public boolean m0;
    public final ey7 n;
    public short n0;
    public final ey7 o;
    public byte o0;
    public final ey7 p;
    public boolean p0;
    public final ey7 q;
    public g84 q0;
    public final ey7 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = gcc.a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        bp1.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        bp1.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        w0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public vl6(peb pebVar, int i) {
        boolean z;
        ya3 ya3Var = new ya3();
        this.u = -1L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        this.L = -1;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.R = -1L;
        this.T = -9223372036854775807L;
        this.a = ya3Var;
        ya3Var.d = new v34(this, (byte) 14);
        this.h = pebVar;
        this.F = new SparseArray();
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.g = (i & 2) == 0;
        this.f = true;
        this.b = new cdc();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new ey7(4);
        this.l = new ey7(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new ey7(4);
        this.i = new ey7(rfd.a);
        this.j = new ey7(4);
        this.n = new ey7();
        this.o = new ey7();
        this.p = new ey7(8);
        this.q = new ey7();
        this.r = new ey7();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] j(long j, long j2, String str) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = gcc.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        int i = 0;
        this.U = false;
        boolean z = true;
        while (z) {
            if (this.U) {
                return 0;
            }
            cb3 cb3Var = (cb3) f84Var;
            boolean a = this.a.a(cb3Var);
            if (a) {
                long j = cb3Var.d;
                if (this.Q) {
                    this.R = j;
                    v11Var.a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j2 = this.R;
                    if (j2 != -1) {
                        v11Var.a = j2;
                        this.R = -1L;
                        return 1;
                    }
                }
                long j3 = ((cb3) f84Var).d;
                if (this.M) {
                    this.O = j3;
                    v11Var.a = this.N;
                    this.M = false;
                    return 1;
                } else if (this.C) {
                    long j4 = this.O;
                    if (j4 != -1) {
                        v11Var.a = j4;
                        this.O = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            z = a;
        }
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                ul6 ul6Var = (ul6) sparseArray.valueAt(i);
                ul6Var.d0.getClass();
                g6c g6cVar = ul6Var.W;
                if (g6cVar != null) {
                    g6cVar.a(ul6Var.d0, ul6Var.l);
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        long q0;
        int i;
        ed edVar = new ed((byte) 16);
        ey7 ey7Var = (ey7) edVar.c;
        cb3 cb3Var = (cb3) f84Var;
        long j = cb3Var.c;
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j2 = 1024;
        if (i2 != 0 && j <= 1024) {
            j2 = j;
        }
        int i3 = (int) j2;
        cb3Var.d(ey7Var.a, 0, 4, false);
        long C = ey7Var.C();
        edVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i4 = edVar.b + 1;
                edVar.b = i4;
                if (i4 == i3) {
                    break;
                }
                cb3Var.d(ey7Var.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (ey7Var.a[0] & 255);
            } else {
                long q02 = edVar.q0(cb3Var);
                long j3 = edVar.b;
                if (q02 != Long.MIN_VALUE && (i2 == 0 || j3 + q02 < j)) {
                    while (true) {
                        int i5 = (edVar.b > (j3 + q02) ? 1 : (edVar.b == (j3 + q02) ? 0 : -1));
                        if (i5 < 0) {
                            if (edVar.q0(cb3Var) == Long.MIN_VALUE || (q0 = edVar.q0(cb3Var)) < 0 || q0 > 2147483647L) {
                                break;
                            } else if (i != 0) {
                                int i6 = (int) q0;
                                cb3Var.a(i6, false);
                                edVar.b += i6;
                            }
                        } else if (i5 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        this.T = -9223372036854775807L;
        this.V = (byte) 0;
        ya3 ya3Var = this.a;
        ya3Var.e = (byte) 0;
        ya3Var.b.clear();
        cdc cdcVar = ya3Var.c;
        cdcVar.a = false;
        cdcVar.b = 0;
        cdc cdcVar2 = this.b;
        cdcVar2.a = false;
        cdcVar2.b = 0;
        o();
        this.G = false;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        if (!this.C) {
            this.F.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                g6c g6cVar = ((ul6) sparseArray.valueAt(i)).W;
                if (g6cVar != null) {
                    g6cVar.b = false;
                    g6cVar.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        if (this.g) {
            g84Var = new vh4(g84Var, this.h);
        }
        this.q0 = g84Var;
    }

    public final void g(int i) {
        if (this.G) {
            return;
        }
        throw hy7.a("Element " + i + " must be in a Cues", null);
    }

    public final void h(int i) {
        if (this.B != null) {
            return;
        }
        throw hy7.a("Element " + i + " must be in a TrackEntry", null);
    }

    public final void i(defpackage.ul6 r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl6.i(ul6, long, int, int, int):void");
    }

    public final rl6 k(int i) {
        rl6 rl6Var = this.A;
        if (rl6Var != null) {
            return rl6Var;
        }
        throw hy7.a("Element " + i + " must be in an EditionEntry", null);
    }

    public final void l() {
        if (this.z) {
            if (this.P == -1 || this.S) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i < sparseArray.size()) {
                        if (((ul6) sparseArray.valueAt(i)).X) {
                            return;
                        }
                        i++;
                    } else {
                        g84 g84Var = this.q0;
                        g84Var.getClass();
                        g84Var.D();
                        this.z = false;
                        return;
                    }
                }
            }
        }
    }

    public final void m() {
        if (this.C) {
            return;
        }
        if (this.e && this.N != -1) {
            this.M = true;
            return;
        }
        g84 g84Var = this.q0;
        g84Var.getClass();
        g84Var.m0(new qc0(this.x));
        this.C = true;
    }

    public final void n(cb3 cb3Var, int i) {
        ey7 ey7Var = this.k;
        if (ey7Var.c >= i) {
            return;
        }
        byte[] bArr = ey7Var.a;
        if (bArr.length < i) {
            ey7Var.c(Math.max(bArr.length << 1, i));
        }
        byte[] bArr2 = ey7Var.a;
        int i2 = ey7Var.c;
        cb3Var.c(bArr2, i2, i - i2, false);
        ey7Var.M(i);
    }

    public final void o() {
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = (short) 0;
        this.o0 = (byte) 0;
        this.p0 = false;
        this.n.K(0);
    }

    public final long p(long j) {
        long j2 = this.v;
        if (j2 != -9223372036854775807L) {
            String str = gcc.a;
            return gcc.b0(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw hy7.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final void q(defpackage.ul6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl6.q(ul6):void");
    }

    public final int r(cb3 cb3Var, ul6 ul6Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        boolean z2;
        boolean z3;
        short s;
        if ("S_TEXT/UTF8".equals(ul6Var.c)) {
            s(cb3Var, r0, i);
            int i3 = this.i0;
            o();
            return i3;
        } else if (!"S_TEXT/ASS".equals(ul6Var.c) && !"S_TEXT/SSA".equals(ul6Var.c)) {
            if ("S_TEXT/WEBVTT".equals(ul6Var.c)) {
                s(cb3Var, u0, i);
                int i4 = this.i0;
                o();
                return i4;
            }
            if (ul6Var.X) {
                ul6Var.e0.getClass();
                ko4 h = s3d.h(cb3Var, i, ul6Var.e0);
                ul6Var.e0 = h;
                ul6Var.d0.g(h);
                ul6Var.X = false;
                l();
            }
            x1c x1cVar = ul6Var.d0;
            boolean z4 = this.k0;
            ey7 ey7Var = this.n;
            int i5 = 2;
            boolean z5 = true;
            if (!z4) {
                boolean z6 = ul6Var.j;
                ey7 ey7Var2 = this.k;
                if (z6) {
                    this.d0 &= -1073741825;
                    int i6 = 128;
                    if (!this.l0) {
                        cb3Var.c(ey7Var2.a, 0, 1, false);
                        this.h0++;
                        byte b = ey7Var2.a[0];
                        if ((b & 128) != 128) {
                            this.o0 = b;
                            this.l0 = true;
                        } else {
                            throw hy7.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b2 = this.o0;
                    if ((b2 & 1) == 1) {
                        if ((b2 & 2) == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.d0 |= 1073741824;
                        if (!this.p0) {
                            ey7 ey7Var3 = this.p;
                            cb3Var.c(ey7Var3.a, 0, 8, false);
                            this.h0 += 8;
                            this.p0 = true;
                            byte[] bArr = ey7Var2.a;
                            if (!z3) {
                                i6 = 0;
                            }
                            bArr[0] = (byte) (i6 | 8);
                            ey7Var2.N(0);
                            x1cVar.b(ey7Var2, 1, 1);
                            this.i0++;
                            ey7Var3.N(0);
                            x1cVar.b(ey7Var3, 8, 1);
                            this.i0 += 8;
                        }
                        if (z3) {
                            if (!this.m0) {
                                cb3Var.c(ey7Var2.a, 0, 1, false);
                                this.h0++;
                                ey7Var2.N(0);
                                this.n0 = ey7Var2.A();
                                this.m0 = true;
                            }
                            int i7 = this.n0 << 2;
                            ey7Var2.K(i7);
                            cb3Var.c(ey7Var2.a, 0, i7, false);
                            this.h0 += i7;
                            short s2 = (short) ((this.n0 / 2) + 1);
                            int i8 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.s;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.s = ByteBuffer.allocate(i8);
                            }
                            this.s.position(0);
                            this.s.putShort(s2);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                s = this.n0;
                                if (i9 >= s) {
                                    break;
                                }
                                int E = ey7Var2.E();
                                int i11 = i9 % 2;
                                int i12 = i5;
                                ByteBuffer byteBuffer2 = this.s;
                                int i13 = E - i10;
                                if (i11 == 0) {
                                    byteBuffer2.putShort((short) i13);
                                } else {
                                    byteBuffer2.putInt(i13);
                                }
                                i9++;
                                i10 = E;
                                i5 = i12;
                            }
                            i2 = i5;
                            int i14 = (i - this.h0) - i10;
                            int i15 = s % 2;
                            ByteBuffer byteBuffer3 = this.s;
                            if (i15 == 1) {
                                byteBuffer3.putInt(i14);
                            } else {
                                byteBuffer3.putShort((short) i14);
                                this.s.putInt(0);
                            }
                            byte[] array = this.s.array();
                            ey7 ey7Var4 = this.q;
                            ey7Var4.L(i8, array);
                            x1cVar.b(ey7Var4, i8, 1);
                            this.i0 += i8;
                        }
                    }
                    i2 = 2;
                } else {
                    i2 = 2;
                    byte[] bArr2 = ul6Var.k;
                    if (bArr2 != null) {
                        ey7Var.L(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(ul6Var.c)) {
                    z2 = z;
                } else if (ul6Var.h > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.d0 |= 268435456;
                    this.r.K(0);
                    int i16 = (ey7Var.c + i) - this.h0;
                    ey7Var2.K(4);
                    byte[] bArr3 = ey7Var2.a;
                    bArr3[0] = (byte) ((i16 >> 24) & 255);
                    bArr3[1] = (byte) ((i16 >> 16) & 255);
                    bArr3[i2] = (byte) ((i16 >> 8) & 255);
                    bArr3[3] = (byte) (i16 & 255);
                    x1cVar.b(ey7Var2, 4, i2);
                    this.i0 += 4;
                }
                this.k0 = true;
            }
            int i17 = i + ey7Var.c;
            if (!"V_MPEG4/ISO/AVC".equals(ul6Var.c) && !"V_MPEGH/ISO/HEVC".equals(ul6Var.c)) {
                if (ul6Var.W != null) {
                    if (ey7Var.c != 0) {
                        z5 = false;
                    }
                    yve.p(z5);
                    ul6Var.W.c(cb3Var);
                }
                while (true) {
                    int i18 = this.h0;
                    if (i18 >= i17) {
                        break;
                    }
                    int i19 = i17 - i18;
                    int a = ey7Var.a();
                    if (a > 0) {
                        f2 = Math.min(i19, a);
                        x1cVar.e(f2, ey7Var);
                    } else {
                        f2 = x1cVar.f(cb3Var, i19, false);
                    }
                    this.h0 += f2;
                    this.i0 += f2;
                }
            } else {
                ey7 ey7Var5 = this.j;
                byte[] bArr4 = ey7Var5.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i20 = ul6Var.f0;
                int i21 = 4 - i20;
                while (this.h0 < i17) {
                    int i22 = this.j0;
                    if (i22 == 0) {
                        int min = Math.min(i20, ey7Var.a());
                        cb3Var.c(bArr4, i21 + min, i20 - min, false);
                        if (min > 0) {
                            ey7Var.k(i21, min, bArr4);
                        }
                        this.h0 += i20;
                        ey7Var5.N(0);
                        this.j0 = ey7Var5.E();
                        ey7 ey7Var6 = this.i;
                        ey7Var6.N(0);
                        x1cVar.e(4, ey7Var6);
                        this.i0 += 4;
                    } else {
                        int a2 = ey7Var.a();
                        if (a2 > 0) {
                            f = Math.min(i22, a2);
                            x1cVar.e(f, ey7Var);
                        } else {
                            f = x1cVar.f(cb3Var, i22, false);
                        }
                        this.h0 += f;
                        this.i0 += f;
                        this.j0 -= f;
                    }
                }
            }
            if ("A_VORBIS".equals(ul6Var.c)) {
                ey7 ey7Var7 = this.l;
                ey7Var7.N(0);
                x1cVar.e(4, ey7Var7);
                this.i0 += 4;
            }
            int i23 = this.i0;
            o();
            return i23;
        } else {
            s(cb3Var, t0, i);
            int i24 = this.i0;
            o();
            return i24;
        }
    }

    public final void s(cb3 cb3Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        ey7 ey7Var = this.o;
        byte[] bArr2 = ey7Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            ey7Var.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        cb3Var.c(ey7Var.a, bArr.length, i, false);
        ey7Var.N(0);
        ey7Var.M(length);
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
