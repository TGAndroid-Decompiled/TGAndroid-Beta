package i5;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import h5.d0;
import j3.c0;
import j3.g2;
import j3.m0;
import j3.n0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import s8.i0;
public final class j extends d4.r {
    public static boolean A1;
    public static boolean B1;
    public static final int[] f7831z1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context R0;
    public final s S0;
    public final f7.b T0;
    public final cb.m U0;
    public final long V0;
    public final int W0;
    public final boolean X0;
    public e8.a Y0;
    public boolean Z0;
    public boolean f7832a1;
    public Surface f7833b1;
    public l f7834c1;
    public boolean f7835d1;
    public int f7836e1;
    public boolean f7837f1;
    public boolean f7838g1;
    public boolean f7839h1;
    public long f7840i1;
    public long f7841j1;
    public long f7842k1;
    public int l1;
    public int f7843m1;
    public int f7844n1;
    public long f7845o1;
    public long f7846p1;
    public long f7847q1;
    public int f7848r1;
    public long f7849s1;
    public y f7850t1;
    public y f7851u1;
    public boolean f7852v1;
    public int f7853w1;
    public i f7854x1;
    public n f7855y1;

    public j(Context context, d4.j jVar, Handler handler, c0 c0Var) {
        super(2, jVar, 30.0f);
        this.V0 = 5000L;
        this.W0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.R0 = applicationContext;
        this.S0 = new s(applicationContext);
        this.T0 = new f7.b(10, handler, c0Var);
        ?? obj = new Object();
        obj.f2425b = this;
        new ArrayDeque();
        new ArrayDeque();
        obj.f2424a = true;
        y yVar = y.f7898e;
        this.U0 = obj;
        this.X0 = "NVIDIA".equals(d0.f7239c);
        this.f7841j1 = -9223372036854775807L;
        this.f7836e1 = 1;
        this.f7850t1 = y.f7898e;
        this.f7853w1 = 0;
        this.f7851u1 = null;
    }

    public static boolean r0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: i5.j.r0(java.lang.String):boolean");
    }

    public static int s0(d4.n r10, j3.n0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: i5.j.s0(d4.n, j3.n0):int");
    }

    public static List t0(Context context, d4.s sVar, n0 n0Var, boolean z4, boolean z10) {
        Iterable e6;
        List e10;
        String str = n0Var.C;
        if (str == null) {
            s8.t tVar = s8.v.f47143b;
            return i0.f47108e;
        }
        if (d0.f7237a >= 26 && "video/dolby-vision".equals(str) && !h.a(context)) {
            String b10 = d4.y.b(n0Var);
            if (b10 == null) {
                s8.t tVar2 = s8.v.f47143b;
                e10 = i0.f47108e;
            } else {
                sVar.getClass();
                e10 = d4.y.e(b10, z4, z10);
            }
            if (!e10.isEmpty()) {
                return e10;
            }
        }
        Pattern pattern = d4.y.f4279a;
        String str2 = n0Var.C;
        sVar.getClass();
        List e11 = d4.y.e(str2, z4, z10);
        String b11 = d4.y.b(n0Var);
        if (b11 == null) {
            s8.t tVar3 = s8.v.f47143b;
            e6 = i0.f47108e;
        } else {
            e6 = d4.y.e(b11, z4, z10);
        }
        s8.t tVar4 = s8.v.f47143b;
        ?? wVar = new com.google.android.gms.common.api.internal.w();
        wVar.d(e11);
        wVar.d(e6);
        return wVar.i();
    }

    public static int u0(d4.n nVar, n0 n0Var) {
        int i10 = n0Var.D;
        List list = n0Var.E;
        if (i10 != -1) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return n0Var.D + i11;
        }
        return s0(nVar, n0Var);
    }

    @Override
    public final n3.k A(d4.n nVar, n0 n0Var, n0 n0Var2) {
        int i10;
        n3.k b10 = nVar.b(n0Var, n0Var2);
        int i11 = b10.f15223e;
        int i12 = n0Var2.H;
        e8.a aVar = this.Y0;
        if (i12 > aVar.f4995a || n0Var2.I > aVar.f4996b) {
            i11 |= 256;
        }
        if (u0(nVar, n0Var2) > this.Y0.f4997c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = nVar.f4235a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new n3.k(str, n0Var, n0Var2, i10, i13);
    }

    public final boolean A0(d4.n nVar) {
        if (d0.f7237a >= 23 && !this.f7852v1 && !r0(nVar.f4235a)) {
            if (!nVar.f4239f || l.e(this.R0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final d4.l B(IllegalStateException illegalStateException, d4.n nVar) {
        Surface surface = this.f7833b1;
        d4.l lVar = new d4.l(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return lVar;
    }

    public final void B0(d4.k kVar, int i10) {
        h5.a.c("skipVideoBuffer");
        kVar.releaseOutputBuffer(i10, false);
        h5.a.q();
        this.M0.f15208f++;
    }

    public final void C0(int i10, int i11) {
        n3.f fVar = this.M0;
        fVar.h += i10;
        int i12 = i10 + i11;
        fVar.f15209g += i12;
        this.l1 += i12;
        int i13 = this.f7843m1 + i12;
        this.f7843m1 = i13;
        fVar.f15210i = Math.max(i13, fVar.f15210i);
        int i14 = this.W0;
        if (i14 > 0 && this.l1 >= i14) {
            v0();
        }
    }

    public final void D0(long j10) {
        n3.f fVar = this.M0;
        fVar.f15212k += j10;
        fVar.f15213l++;
        this.f7847q1 += j10;
        this.f7848r1++;
    }

    @Override
    public final boolean J() {
        if (this.f7852v1 && d0.f7237a < 23) {
            return true;
        }
        return false;
    }

    @Override
    public final float K(float f10, n0[] n0VarArr) {
        float f11 = -1.0f;
        for (n0 n0Var : n0VarArr) {
            float f12 = n0Var.J;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override
    public final ArrayList L(d4.s sVar, n0 n0Var, boolean z4) {
        List t02 = t0(this.R0, sVar, n0Var, z4, this.f7852v1);
        Pattern pattern = d4.y.f4279a;
        ArrayList arrayList = new ArrayList(t02);
        Collections.sort(arrayList, new d4.t(new a1.c(n0Var, 10), 0));
        return arrayList;
    }

    @Override
    public final d4.i M(d4.n nVar, n0 n0Var, MediaCrypto mediaCrypto, float f10) {
        int i10;
        b bVar;
        e8.a aVar;
        boolean z4;
        int i11;
        int i12;
        Point point;
        Point point2;
        int i13;
        int i14;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i15;
        boolean z10;
        int i16;
        boolean z11;
        Pair d;
        int s02;
        l lVar = this.f7834c1;
        if (lVar != null && lVar.f7861a != nVar.f4239f) {
            if (this.f7833b1 == lVar) {
                this.f7833b1 = null;
            }
            lVar.release();
            this.f7834c1 = null;
        }
        String str = nVar.f4237c;
        n0[] n0VarArr = this.f9057r;
        n0VarArr.getClass();
        int i17 = n0Var.H;
        float f11 = n0Var.J;
        int i18 = n0Var.I;
        b bVar2 = n0Var.O;
        int u02 = u0(nVar, n0Var);
        if (n0VarArr.length == 1) {
            if (u02 != -1 && (s02 = s0(nVar, n0Var)) != -1) {
                u02 = Math.min((int) (u02 * 1.5f), s02);
            }
            aVar = new e8.a(i17, i18, u02);
            i10 = i18;
            bVar = bVar2;
        } else {
            int length = n0VarArr.length;
            int i19 = i17;
            int i20 = i18;
            int i21 = 0;
            boolean z12 = false;
            while (i21 < length) {
                n0 n0Var2 = n0VarArr[i21];
                int i22 = i21;
                if (bVar2 != null && n0Var2.O == null) {
                    m0 a2 = n0Var2.a();
                    a2.A = bVar2;
                    n0Var2 = new n0(a2);
                }
                n3.k b10 = nVar.b(n0Var, n0Var2);
                n0[] n0VarArr2 = n0VarArr;
                int i23 = n0Var2.I;
                if (b10.d != 0) {
                    int i24 = n0Var2.H;
                    i15 = length;
                    if (i24 != -1 && i23 != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 |= z10;
                    i19 = Math.max(i19, i24);
                    i20 = Math.max(i20, i23);
                    u02 = Math.max(u02, u0(nVar, n0Var2));
                } else {
                    i15 = length;
                }
                i21 = i22 + 1;
                n0VarArr = n0VarArr2;
                length = i15;
            }
            if (z12) {
                h5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i19 + "x" + i20);
                if (i18 > i17) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i11 = i18;
                } else {
                    i11 = i17;
                }
                boolean z13 = z4;
                if (z4) {
                    i12 = i17;
                } else {
                    i12 = i18;
                }
                float f12 = i12 / i11;
                bVar = bVar2;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = f7831z1[i25];
                    int i27 = i25;
                    int i28 = (int) (i26 * f12);
                    if (i26 <= i11 || i28 <= i12) {
                        break;
                    }
                    int i29 = i12;
                    int i30 = i11;
                    if (d0.f7237a >= 21) {
                        if (z13) {
                            i14 = i28;
                        } else {
                            i14 = i26;
                        }
                        if (!z13) {
                            i26 = i28;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(d0.f(i14, widthAlignment) * widthAlignment, d0.f(i26, heightAlignment) * heightAlignment);
                        }
                        i10 = i18;
                        if (nVar.f(point2.x, point2.y, f11)) {
                            point = point2;
                            break;
                        }
                        i25 = i27 + 1;
                        i18 = i10;
                        i12 = i29;
                        i11 = i30;
                    } else {
                        i10 = i18;
                        try {
                            int f13 = d0.f(i26, 16) * 16;
                            int f14 = d0.f(i28, 16) * 16;
                            if (f13 * f14 <= d4.y.j()) {
                                if (z13) {
                                    i13 = f14;
                                } else {
                                    i13 = f13;
                                }
                                if (!z13) {
                                    f13 = f14;
                                }
                                point2 = new Point(i13, f13);
                                point = point2;
                                break;
                            }
                            i25 = i27 + 1;
                            i18 = i10;
                            i12 = i29;
                            i11 = i30;
                        } catch (d4.v unused) {
                        }
                    }
                }
                i10 = i18;
                point = null;
                if (point != null) {
                    i19 = Math.max(i19, point.x);
                    i20 = Math.max(i20, point.y);
                    m0 a10 = n0Var.a();
                    a10.f9270t = i19;
                    a10.f9271u = i20;
                    u02 = Math.max(u02, s0(nVar, new n0(a10)));
                    h5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i19 + "x" + i20);
                }
            } else {
                i10 = i18;
                bVar = bVar2;
            }
            aVar = new e8.a(i19, i20, u02);
        }
        this.Y0 = aVar;
        if (this.f7852v1) {
            i16 = this.f7853w1;
        } else {
            i16 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i17);
        mediaFormat.setInteger("height", i10);
        h5.a.I(mediaFormat, n0Var.E);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        h5.a.A(mediaFormat, "rotation-degrees", n0Var.K);
        if (bVar != null) {
            b bVar3 = bVar;
            h5.a.A(mediaFormat, "color-transfer", bVar3.f7810c);
            h5.a.A(mediaFormat, "color-standard", bVar3.f7808a);
            h5.a.A(mediaFormat, "color-range", bVar3.f7809b);
            byte[] bArr = bVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(n0Var.C) && (d = d4.y.d(n0Var)) != null) {
            h5.a.A(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f4995a);
        mediaFormat.setInteger("max-height", aVar.f4996b);
        h5.a.A(mediaFormat, "max-input-size", aVar.f4997c);
        if (d0.f7237a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.X0) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f7833b1 == null) {
            if (A0(nVar)) {
                if (this.f7834c1 == null) {
                    this.f7834c1 = l.f(this.R0, nVar.f4239f);
                }
                this.f7833b1 = this.f7834c1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.U0.getClass();
        return new d4.i(nVar, mediaFormat, n0Var, this.f7833b1, mediaCrypto);
    }

    @Override
    public final void N(n3.i iVar) {
        if (this.f7832a1) {
            ByteBuffer byteBuffer = iVar.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s6 == 60 && s9 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        d4.k kVar = this.V;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final void R(Exception exc) {
        h5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new gf.c(14, bVar, exc));
        }
    }

    @Override
    public final void S(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            str2 = str;
            handler.post(new x(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.Z0 = r0(str2);
        d4.n nVar = this.f4249c0;
        nVar.getClass();
        boolean z4 = false;
        if (d0.f7237a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f4236b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (codecProfileLevelArr[i10].profile == 16384) {
                    z4 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f7832a1 = z4;
        int i11 = d0.f7237a;
        if (i11 >= 23 && this.f7852v1) {
            d4.k kVar = this.V;
            kVar.getClass();
            this.f7854x1 = new i(this, kVar);
        }
        Context context = ((j) this.U0.f2425b).R0;
        if (i11 >= 29) {
            int i12 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override
    public final void T(String str) {
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new gf.c(13, bVar, str));
        }
    }

    @Override
    public final n3.k U(f7.b bVar) {
        n3.k U = super.U(bVar);
        n0 n0Var = (n0) bVar.f6121c;
        f7.b bVar2 = this.T0;
        Handler handler = (Handler) bVar2.f6120b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar2, n0Var, U, 9));
        }
        return U;
    }

    @Override
    public final void V(n0 n0Var, MediaFormat mediaFormat) {
        boolean z4;
        int integer;
        int integer2;
        int i10;
        int i11;
        d4.k kVar = this.V;
        if (kVar != null) {
            kVar.g(this.f7836e1);
        }
        if (this.f7852v1) {
            i11 = n0Var.H;
            i10 = n0Var.I;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z4) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f10 = n0Var.L;
        int i13 = n0Var.K;
        int i14 = d0.f7237a;
        cb.m mVar = this.U0;
        if (i14 >= 21) {
            if (i13 == 90 || i13 == 270) {
                f10 = 1.0f / f10;
                int i15 = i10;
                i10 = i11;
                i11 = i15;
            }
            i13 = 0;
        } else {
            mVar.getClass();
        }
        this.f7850t1 = new y(i11, i10, f10, i13);
        float f11 = n0Var.J;
        s sVar = this.S0;
        sVar.f7874f = f11;
        e eVar = sVar.f7870a;
        eVar.f7819a.c();
        eVar.f7820b.c();
        eVar.f7821c = false;
        eVar.d = -9223372036854775807L;
        eVar.f7822e = 0;
        sVar.b();
        mVar.getClass();
    }

    @Override
    public final void X(long j10) {
        super.X(j10);
        if (!this.f7852v1) {
            this.f7844n1--;
        }
    }

    @Override
    public final void Y() {
        q0();
    }

    @Override
    public final void Z(n3.i iVar) {
        boolean z4 = this.f7852v1;
        if (!z4) {
            this.f7844n1++;
        }
        if (d0.f7237a < 23 && z4) {
            long j10 = iVar.f15216f;
            p0(j10);
            x0(this.f7850t1);
            this.M0.f15207e++;
            w0();
            X(j10);
        }
    }

    @Override
    public final void a0(j3.n0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: i5.j.a0(j3.n0):void");
    }

    @Override
    public final void b(int i10, Object obj) {
        l lVar;
        l lVar2;
        long j10;
        Surface surface;
        s sVar = this.S0;
        cb.m mVar = this.U0;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 == 14) {
                                    obj.getClass();
                                    h5.x xVar = (h5.x) obj;
                                    if (xVar.f7312a != 0 && xVar.f7313b != 0 && (surface = this.f7833b1) != null) {
                                        Pair pair = (Pair) mVar.d;
                                        if (pair == null || !((Surface) pair.first).equals(surface) || !((h5.x) ((Pair) mVar.d).second).equals(xVar)) {
                                            mVar.d = Pair.create(surface, xVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) mVar.f2426c;
                            if (copyOnWriteArrayList == null) {
                                mVar.f2426c = new CopyOnWriteArrayList(list);
                                return;
                            }
                            copyOnWriteArrayList.clear();
                            ((CopyOnWriteArrayList) mVar.f2426c).addAll(list);
                            return;
                        }
                        int intValue = ((Integer) obj).intValue();
                        if (sVar.f7877j != intValue) {
                            sVar.f7877j = intValue;
                            sVar.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.f7836e1 = intValue2;
                    d4.k kVar = this.V;
                    if (kVar != null) {
                        kVar.g(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.f7853w1 != intValue3) {
                    this.f7853w1 = intValue3;
                    if (this.f7852v1) {
                        e0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f7855y1 = (n) obj;
            return;
        }
        if (obj instanceof Surface) {
            lVar = (Surface) obj;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            l lVar3 = this.f7834c1;
            if (lVar3 != null) {
                lVar = lVar3;
            } else {
                d4.n nVar = this.f4249c0;
                if (nVar != null && A0(nVar)) {
                    lVar = l.f(this.R0, nVar.f4239f);
                    this.f7834c1 = lVar;
                }
            }
        }
        Surface surface2 = this.f7833b1;
        f7.b bVar = this.T0;
        if (surface2 != lVar) {
            this.f7833b1 = lVar;
            sVar.getClass();
            if (lVar instanceof l) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (sVar.f7873e != lVar2) {
                sVar.a();
                sVar.f7873e = lVar2;
                sVar.c(true);
            }
            this.f7835d1 = false;
            int i11 = this.h;
            d4.k kVar2 = this.V;
            if (kVar2 != null) {
                mVar.getClass();
                if (d0.f7237a >= 23 && lVar != null && !this.Z0) {
                    try {
                        kVar2.h(lVar);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new IllegalArgumentException(th2);
                    }
                } else {
                    e0();
                    P();
                }
            }
            if (lVar != null && lVar != this.f7834c1) {
                y yVar = this.f7851u1;
                if (yVar != null) {
                    bVar.v(yVar);
                }
                q0();
                if (i11 == 2) {
                    long j11 = this.V0;
                    if (j11 > 0) {
                        j10 = SystemClock.elapsedRealtime() + j11;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    this.f7841j1 = j10;
                }
                mVar.getClass();
                return;
            }
            this.f7851u1 = null;
            q0();
            mVar.getClass();
        } else if (lVar != null && lVar != this.f7834c1) {
            y yVar2 = this.f7851u1;
            if (yVar2 != null) {
                bVar.v(yVar2);
            }
            if (this.f7835d1) {
                Surface surface3 = this.f7833b1;
                Handler handler = (Handler) bVar.f6120b;
                if (handler != null) {
                    handler.post(new v(bVar, surface3, SystemClock.elapsedRealtime(), 0));
                }
            }
        }
    }

    @Override
    public final boolean c0(long r33, long r35, d4.k r37, java.nio.ByteBuffer r38, int r39, int r40, int r41, long r42, boolean r44, boolean r45, j3.n0 r46) {
        throw new UnsupportedOperationException("Method not decompiled: i5.j.c0(long, long, d4.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, j3.n0):boolean");
    }

    @Override
    public final String g() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void g0() {
        super.g0();
        this.f7844n1 = 0;
    }

    @Override
    public final boolean i() {
        boolean z4 = this.I0;
        this.U0.getClass();
        return z4;
    }

    @Override
    public final boolean j() {
        l lVar;
        if (super.j()) {
            this.U0.getClass();
            if (this.f7837f1 || (((lVar = this.f7834c1) != null && this.f7833b1 == lVar) || this.V == null || this.f7852v1)) {
                this.f7841j1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.f7841j1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f7841j1) {
            return true;
        }
        this.f7841j1 = -9223372036854775807L;
        return false;
    }

    @Override
    public final void k() {
        f7.b bVar = this.T0;
        this.f7851u1 = null;
        q0();
        this.f7835d1 = false;
        this.f7854x1 = null;
        try {
            super.k();
            n3.f fVar = this.M0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.f6120b;
            if (handler != null) {
                handler.post(new w(bVar, fVar, 0));
            }
            bVar.v(y.f7898e);
        } catch (Throwable th2) {
            bVar.o(this.M0);
            bVar.v(y.f7898e);
            throw th2;
        }
    }

    @Override
    public final boolean k0(d4.n nVar) {
        if (this.f7833b1 == null && !A0(nVar)) {
            return false;
        }
        return true;
    }

    @Override
    public final void l(boolean z4, boolean z10) {
        boolean z11;
        this.M0 = new Object();
        g2 g2Var = this.d;
        g2Var.getClass();
        boolean z12 = g2Var.f9161a;
        if (z12 && this.f7853w1 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        h5.a.i(z11);
        if (this.f7852v1 != z12) {
            this.f7852v1 = z12;
            e0();
        }
        n3.f fVar = this.M0;
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new w(bVar, fVar, 1));
        }
        this.f7838g1 = z10;
        this.f7839h1 = false;
    }

    @Override
    public final void m(long j10, boolean z4) {
        super.m(j10, z4);
        this.U0.getClass();
        q0();
        s sVar = this.S0;
        sVar.f7880m = 0L;
        sVar.f7883p = -1L;
        sVar.f7881n = -1L;
        long j11 = -9223372036854775807L;
        this.f7845o1 = -9223372036854775807L;
        this.f7840i1 = -9223372036854775807L;
        this.f7843m1 = 0;
        if (z4) {
            long j12 = this.V0;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.f7841j1 = j11;
            return;
        }
        this.f7841j1 = -9223372036854775807L;
    }

    @Override
    public final int m0(d4.s sVar, n0 n0Var) {
        boolean z4;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!h5.o.j(n0Var.C)) {
            return e2.c.b(0, 0, 0);
        }
        if (n0Var.F != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        Context context = this.R0;
        List t02 = t0(context, sVar, n0Var, z4, false);
        if (z4 && t02.isEmpty()) {
            t02 = t0(context, sVar, n0Var, false, false);
        }
        if (t02.isEmpty()) {
            return e2.c.b(1, 0, 0);
        }
        int i15 = n0Var.X;
        if (i15 != 0 && i15 != 2) {
            return e2.c.b(2, 0, 0);
        }
        d4.n nVar = (d4.n) t02.get(0);
        boolean d = nVar.d(n0Var);
        if (!d) {
            for (int i16 = 1; i16 < t02.size(); i16++) {
                d4.n nVar2 = (d4.n) t02.get(i16);
                if (nVar2.d(n0Var)) {
                    nVar = nVar2;
                    z10 = false;
                    d = true;
                    break;
                }
            }
        }
        z10 = true;
        if (d) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (nVar.e(n0Var)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (nVar.f4240g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (d0.f7237a >= 26 && "video/dolby-vision".equals(n0Var.C) && !h.a(context)) {
            i13 = 256;
        }
        if (d) {
            List t03 = t0(context, sVar, n0Var, z4, true);
            if (!t03.isEmpty()) {
                Pattern pattern = d4.y.f4279a;
                ArrayList arrayList = new ArrayList(t03);
                Collections.sort(arrayList, new d4.t(new a1.c(n0Var, 10), 0));
                d4.n nVar3 = (d4.n) arrayList.get(0);
                if (nVar3.d(n0Var) && nVar3.e(n0Var)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override
    public final void o() {
        cb.m mVar = this.U0;
        try {
            C();
            e0();
            l.d.D(this.P, null);
            this.P = null;
        } finally {
            mVar.getClass();
            l lVar = this.f7834c1;
            if (lVar != null) {
                if (this.f7833b1 == lVar) {
                    this.f7833b1 = null;
                }
                lVar.release();
                this.f7834c1 = null;
            }
        }
    }

    @Override
    public final void p() {
        this.l1 = 0;
        this.f7842k1 = SystemClock.elapsedRealtime();
        this.f7846p1 = SystemClock.elapsedRealtime() * 1000;
        this.f7847q1 = 0L;
        this.f7848r1 = 0;
        s sVar = this.S0;
        sVar.d = true;
        sVar.f7880m = 0L;
        sVar.f7883p = -1L;
        sVar.f7881n = -1L;
        p pVar = sVar.f7871b;
        if (pVar != null) {
            r rVar = sVar.f7872c;
            rVar.getClass();
            rVar.f7868b.sendEmptyMessage(1);
            pVar.r(new hg.f(sVar, 3));
        }
        sVar.c(false);
    }

    @Override
    public final void q() {
        this.f7841j1 = -9223372036854775807L;
        v0();
        int i10 = this.f7848r1;
        if (i10 != 0) {
            long j10 = this.f7847q1;
            f7.b bVar = this.T0;
            Handler handler = (Handler) bVar.f6120b;
            if (handler != null) {
                handler.post(new u(bVar, j10, i10));
            }
            this.f7847q1 = 0L;
            this.f7848r1 = 0;
        }
        s sVar = this.S0;
        sVar.d = false;
        p pVar = sVar.f7871b;
        if (pVar != null) {
            pVar.s();
            r rVar = sVar.f7872c;
            rVar.getClass();
            rVar.f7868b.sendEmptyMessage(2);
        }
        sVar.a();
    }

    public final void q0() {
        d4.k kVar;
        this.f7837f1 = false;
        if (d0.f7237a >= 23 && this.f7852v1 && (kVar = this.V) != null) {
            this.f7854x1 = new i(this, kVar);
        }
    }

    @Override
    public final void t(long j10, long j11) {
        super.t(j10, j11);
        this.U0.getClass();
    }

    public final void v0() {
        if (this.l1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f7842k1;
            int i10 = this.l1;
            f7.b bVar = this.T0;
            Handler handler = (Handler) bVar.f6120b;
            if (handler != null) {
                handler.post(new u(bVar, i10, j10));
            }
            this.l1 = 0;
            this.f7842k1 = elapsedRealtime;
        }
    }

    @Override
    public final void w(float f10, float f11) {
        super.w(f10, f11);
        s sVar = this.S0;
        sVar.f7876i = f10;
        sVar.f7880m = 0L;
        sVar.f7883p = -1L;
        sVar.f7881n = -1L;
        sVar.c(false);
    }

    public final void w0() {
        this.f7839h1 = true;
        if (!this.f7837f1) {
            this.f7837f1 = true;
            Surface surface = this.f7833b1;
            f7.b bVar = this.T0;
            Handler handler = (Handler) bVar.f6120b;
            if (handler != null) {
                handler.post(new v(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f7835d1 = true;
        }
    }

    public final void x0(y yVar) {
        if (!yVar.equals(y.f7898e) && !yVar.equals(this.f7851u1)) {
            this.f7851u1 = yVar;
            this.T0.v(yVar);
        }
    }

    public final void y0(d4.k kVar, int i10) {
        h5.a.c("releaseOutputBuffer");
        kVar.releaseOutputBuffer(i10, true);
        h5.a.q();
        this.M0.f15207e++;
        this.f7843m1 = 0;
        this.U0.getClass();
        this.f7846p1 = SystemClock.elapsedRealtime() * 1000;
        x0(this.f7850t1);
        w0();
    }

    public final void z0(d4.k kVar, int i10, long j10) {
        h5.a.c("releaseOutputBuffer");
        kVar.b(i10, j10);
        h5.a.q();
        this.M0.f15207e++;
        this.f7843m1 = 0;
        this.U0.getClass();
        this.f7846p1 = SystemClock.elapsedRealtime() * 1000;
        x0(this.f7850t1);
        w0();
    }
}
