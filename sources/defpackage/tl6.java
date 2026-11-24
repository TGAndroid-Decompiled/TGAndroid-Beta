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
public final class tl6 implements s84 {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public pl6 A;
    public sl6 B;
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
    public final rb3 a;
    public int[] a0;
    public final dbc b;
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
    public final tcb h;
    public int h0;
    public final yw7 i;
    public int i0;
    public final yw7 j;
    public int j0;
    public final yw7 k;
    public boolean k0;
    public final yw7 l;
    public boolean l0;
    public final yw7 m;
    public boolean m0;
    public final yw7 n;
    public short n0;
    public final yw7 o;
    public byte o0;
    public final yw7 p;
    public boolean p0;
    public final yw7 q;
    public u84 q0;
    public final yw7 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = hac.a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        aq1.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        aq1.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        w0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public tl6(tcb tcbVar, int i) {
        boolean z;
        rb3 rb3Var = new rb3();
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
        this.a = rb3Var;
        rb3Var.d = new k44(this, (byte) 15);
        this.h = tcbVar;
        this.F = new SparseArray();
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.g = (i & 2) == 0;
        this.f = true;
        this.b = new dbc();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new yw7(4);
        this.l = new yw7(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new yw7(4);
        this.i = new yw7(add.a);
        this.j = new yw7(4);
        this.n = new yw7();
        this.o = new yw7();
        this.p = new yw7(8);
        this.q = new yw7();
        this.r = new yw7();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] j(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = hac.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final int b(t84 t84Var, u21 u21Var) {
        int i = 0;
        this.U = false;
        boolean z = true;
        while (z) {
            if (this.U) {
                return 0;
            }
            vb3 vb3Var = (vb3) t84Var;
            boolean a = this.a.a(vb3Var);
            if (a) {
                long j = vb3Var.d;
                if (this.Q) {
                    this.R = j;
                    u21Var.a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j2 = this.R;
                    if (j2 != -1) {
                        u21Var.a = j2;
                        this.R = -1L;
                        return 1;
                    }
                }
                long j3 = ((vb3) t84Var).d;
                if (this.M) {
                    this.O = j3;
                    u21Var.a = this.N;
                    this.M = false;
                    return 1;
                } else if (this.C) {
                    long j4 = this.O;
                    if (j4 != -1) {
                        u21Var.a = j4;
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
                sl6 sl6Var = (sl6) sparseArray.valueAt(i);
                sl6Var.d0.getClass();
                g4c g4cVar = sl6Var.W;
                if (g4cVar != null) {
                    g4cVar.a(sl6Var.d0, sl6Var.l);
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final boolean c(t84 t84Var) {
        long o0;
        int i;
        de deVar = new de((byte) 16);
        yw7 yw7Var = (yw7) deVar.c;
        vb3 vb3Var = (vb3) t84Var;
        long j = vb3Var.c;
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j2 = 1024;
        if (i2 != 0 && j <= 1024) {
            j2 = j;
        }
        int i3 = (int) j2;
        vb3Var.d(yw7Var.a, 0, 4, false);
        long C = yw7Var.C();
        deVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i4 = deVar.b + 1;
                deVar.b = i4;
                if (i4 == i3) {
                    break;
                }
                vb3Var.d(yw7Var.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (yw7Var.a[0] & 255);
            } else {
                long o02 = deVar.o0(vb3Var);
                long j3 = deVar.b;
                if (o02 != Long.MIN_VALUE && (i2 == 0 || j3 + o02 < j)) {
                    while (true) {
                        int i5 = (deVar.b > (j3 + o02) ? 1 : (deVar.b == (j3 + o02) ? 0 : -1));
                        if (i5 < 0) {
                            if (deVar.o0(vb3Var) == Long.MIN_VALUE || (o0 = deVar.o0(vb3Var)) < 0 || o0 > 2147483647L) {
                                break;
                            } else if (i != 0) {
                                int i6 = (int) o0;
                                vb3Var.a(i6, false);
                                deVar.b += i6;
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
        rb3 rb3Var = this.a;
        rb3Var.e = (byte) 0;
        rb3Var.b.clear();
        dbc dbcVar = rb3Var.c;
        dbcVar.a = false;
        dbcVar.b = 0;
        dbc dbcVar2 = this.b;
        dbcVar2.a = false;
        dbcVar2.b = 0;
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
                g4c g4cVar = ((sl6) sparseArray.valueAt(i)).W;
                if (g4cVar != null) {
                    g4cVar.b = false;
                    g4cVar.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        if (this.g) {
            u84Var = new yh4(u84Var, this.h);
        }
        this.q0 = u84Var;
    }

    public final void g(int i) {
        if (this.G) {
            return;
        }
        throw bx7.a("Element " + i + " must be in a Cues", null);
    }

    public final void h(int i) {
        if (this.B != null) {
            return;
        }
        throw bx7.a("Element " + i + " must be in a TrackEntry", null);
    }

    public final void i(defpackage.sl6 r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl6.i(sl6, long, int, int, int):void");
    }

    public final pl6 k(int i) {
        pl6 pl6Var = this.A;
        if (pl6Var != null) {
            return pl6Var;
        }
        throw bx7.a("Element " + i + " must be in an EditionEntry", null);
    }

    public final void l() {
        if (this.z) {
            if (this.P == -1 || this.S) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i < sparseArray.size()) {
                        if (((sl6) sparseArray.valueAt(i)).X) {
                            return;
                        }
                        i++;
                    } else {
                        u84 u84Var = this.q0;
                        u84Var.getClass();
                        u84Var.B();
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
        u84 u84Var = this.q0;
        u84Var.getClass();
        u84Var.f0(new od0(this.x));
        this.C = true;
    }

    public final void n(vb3 vb3Var, int i) {
        yw7 yw7Var = this.k;
        if (yw7Var.c >= i) {
            return;
        }
        byte[] bArr = yw7Var.a;
        if (bArr.length < i) {
            yw7Var.c(Math.max(bArr.length << 1, i));
        }
        byte[] bArr2 = yw7Var.a;
        int i2 = yw7Var.c;
        vb3Var.c(bArr2, i2, i - i2, false);
        yw7Var.M(i);
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
            String str = hac.a;
            return hac.b0(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw bx7.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final void q(defpackage.sl6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl6.q(sl6):void");
    }

    public final int r(vb3 vb3Var, sl6 sl6Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        boolean z2;
        boolean z3;
        short s;
        if ("S_TEXT/UTF8".equals(sl6Var.c)) {
            s(vb3Var, r0, i);
            int i3 = this.i0;
            o();
            return i3;
        } else if (!"S_TEXT/ASS".equals(sl6Var.c) && !"S_TEXT/SSA".equals(sl6Var.c)) {
            if ("S_TEXT/WEBVTT".equals(sl6Var.c)) {
                s(vb3Var, u0, i);
                int i4 = this.i0;
                o();
                return i4;
            }
            if (sl6Var.X) {
                sl6Var.e0.getClass();
                go4 h = c1d.h(vb3Var, i, sl6Var.e0);
                sl6Var.e0 = h;
                sl6Var.d0.g(h);
                sl6Var.X = false;
                l();
            }
            yzb yzbVar = sl6Var.d0;
            boolean z4 = this.k0;
            yw7 yw7Var = this.n;
            int i5 = 2;
            boolean z5 = true;
            if (!z4) {
                boolean z6 = sl6Var.j;
                yw7 yw7Var2 = this.k;
                if (z6) {
                    this.d0 &= -1073741825;
                    int i6 = 128;
                    if (!this.l0) {
                        vb3Var.c(yw7Var2.a, 0, 1, false);
                        this.h0++;
                        byte b = yw7Var2.a[0];
                        if ((b & 128) != 128) {
                            this.o0 = b;
                            this.l0 = true;
                        } else {
                            throw bx7.a("Extension bit is set in signal byte", null);
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
                            yw7 yw7Var3 = this.p;
                            vb3Var.c(yw7Var3.a, 0, 8, false);
                            this.h0 += 8;
                            this.p0 = true;
                            byte[] bArr = yw7Var2.a;
                            if (!z3) {
                                i6 = 0;
                            }
                            bArr[0] = (byte) (i6 | 8);
                            yw7Var2.N(0);
                            yzbVar.b(yw7Var2, 1, 1);
                            this.i0++;
                            yw7Var3.N(0);
                            yzbVar.b(yw7Var3, 8, 1);
                            this.i0 += 8;
                        }
                        if (z3) {
                            if (!this.m0) {
                                vb3Var.c(yw7Var2.a, 0, 1, false);
                                this.h0++;
                                yw7Var2.N(0);
                                this.n0 = yw7Var2.A();
                                this.m0 = true;
                            }
                            int i7 = this.n0 << 2;
                            yw7Var2.K(i7);
                            vb3Var.c(yw7Var2.a, 0, i7, false);
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
                                int E = yw7Var2.E();
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
                            yw7 yw7Var4 = this.q;
                            yw7Var4.L(i8, array);
                            yzbVar.b(yw7Var4, i8, 1);
                            this.i0 += i8;
                        }
                    }
                    i2 = 2;
                } else {
                    i2 = 2;
                    byte[] bArr2 = sl6Var.k;
                    if (bArr2 != null) {
                        yw7Var.L(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(sl6Var.c)) {
                    z2 = z;
                } else if (sl6Var.h > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.d0 |= 268435456;
                    this.r.K(0);
                    int i16 = (yw7Var.c + i) - this.h0;
                    yw7Var2.K(4);
                    byte[] bArr3 = yw7Var2.a;
                    bArr3[0] = (byte) ((i16 >> 24) & 255);
                    bArr3[1] = (byte) ((i16 >> 16) & 255);
                    bArr3[i2] = (byte) ((i16 >> 8) & 255);
                    bArr3[3] = (byte) (i16 & 255);
                    yzbVar.b(yw7Var2, 4, i2);
                    this.i0 += 4;
                }
                this.k0 = true;
            }
            int i17 = i + yw7Var.c;
            if (!"V_MPEG4/ISO/AVC".equals(sl6Var.c) && !"V_MPEGH/ISO/HEVC".equals(sl6Var.c)) {
                if (sl6Var.W != null) {
                    if (yw7Var.c != 0) {
                        z5 = false;
                    }
                    jte.p(z5);
                    sl6Var.W.c(vb3Var);
                }
                while (true) {
                    int i18 = this.h0;
                    if (i18 >= i17) {
                        break;
                    }
                    int i19 = i17 - i18;
                    int a = yw7Var.a();
                    if (a > 0) {
                        f2 = Math.min(i19, a);
                        yzbVar.e(f2, yw7Var);
                    } else {
                        f2 = yzbVar.f(vb3Var, i19, false);
                    }
                    this.h0 += f2;
                    this.i0 += f2;
                }
            } else {
                yw7 yw7Var5 = this.j;
                byte[] bArr4 = yw7Var5.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i20 = sl6Var.f0;
                int i21 = 4 - i20;
                while (this.h0 < i17) {
                    int i22 = this.j0;
                    if (i22 == 0) {
                        int min = Math.min(i20, yw7Var.a());
                        vb3Var.c(bArr4, i21 + min, i20 - min, false);
                        if (min > 0) {
                            yw7Var.k(i21, min, bArr4);
                        }
                        this.h0 += i20;
                        yw7Var5.N(0);
                        this.j0 = yw7Var5.E();
                        yw7 yw7Var6 = this.i;
                        yw7Var6.N(0);
                        yzbVar.e(4, yw7Var6);
                        this.i0 += 4;
                    } else {
                        int a2 = yw7Var.a();
                        if (a2 > 0) {
                            f = Math.min(i22, a2);
                            yzbVar.e(f, yw7Var);
                        } else {
                            f = yzbVar.f(vb3Var, i22, false);
                        }
                        this.h0 += f;
                        this.i0 += f;
                        this.j0 -= f;
                    }
                }
            }
            if ("A_VORBIS".equals(sl6Var.c)) {
                yw7 yw7Var7 = this.l;
                yw7Var7.N(0);
                yzbVar.e(4, yw7Var7);
                this.i0 += 4;
            }
            int i23 = this.i0;
            o();
            return i23;
        } else {
            s(vb3Var, t0, i);
            int i24 = this.i0;
            o();
            return i24;
        }
    }

    public final void s(vb3 vb3Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        yw7 yw7Var = this.o;
        byte[] bArr2 = yw7Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            yw7Var.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        vb3Var.c(yw7Var.a, bArr.length, i, false);
        yw7Var.N(0);
        yw7Var.M(length);
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
