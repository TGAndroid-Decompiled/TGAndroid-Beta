package k2;

import ai.f8;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import b2.v0;
import ci.e7;
import e9.a1;
import gg.w1;
import i2.n1;
import i2.t0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class h0 extends r2.s implements t0 {
    public final Context W0;
    public final n4.x X0;
    public final p Y0;
    public final r2.k Z0;
    public int f14473a1;
    public boolean f14474b1;
    public boolean f14475c1;
    public b2.s f14476d1;
    public b2.s f14477e1;
    public long f14478f1;
    public boolean f14479g1;
    public boolean f14480h1;
    public boolean f14481i1;
    public int f14482j1;
    public boolean f14483k1;
    public long l1;

    public h0(Context context, r2.l lVar, Handler handler, i2.c0 c0Var, p pVar) {
        super(1, lVar, 44100.0f);
        r2.k kVar;
        if (Build.VERSION.SDK_INT >= 35) {
            kVar = new r2.k();
        } else {
            kVar = null;
        }
        this.W0 = context.getApplicationContext();
        this.Y0 = pVar;
        this.Z0 = kVar;
        this.f14482j1 = -1000;
        this.X0 = new n4.x(handler, c0Var);
        this.l1 = -9223372036854775807L;
        ((d0) pVar).f14451s = new g0(this, 0);
    }

    public final void A0() {
        l();
        long i10 = ((d0) this.Y0).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.f14479g1) {
                i10 = Math.max(this.f14478f1, i10);
            }
            this.f14478f1 = i10;
            this.f14479g1 = false;
        }
    }

    @Override
    public final i2.h D(r2.p pVar, b2.s sVar, b2.s sVar2) {
        int i10;
        i2.h b10 = pVar.b(sVar, sVar2);
        int i11 = b10.f11719e;
        if (this.V == null && t0(sVar2)) {
            i11 |= 32768;
        }
        if (z0(pVar, sVar2) > this.f14473a1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = pVar.f47020a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.h(str, sVar, sVar2, i10, i12);
    }

    @Override
    public final float M(float f7, b2.s sVar, b2.s[] sVarArr) {
        int i10 = -1;
        for (b2.s sVar2 : sVarArr) {
            int i11 = sVar2.K;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f7;
    }

    @Override
    public final ArrayList N(r2.j jVar, b2.s sVar, boolean z10) {
        a1 f7;
        r2.p pVar;
        if (sVar.f3643r == null) {
            f7 = a1.f8714e;
        } else {
            if (((d0) this.Y0).G(sVar)) {
                List d = r2.x.d("audio/raw", false, false);
                if (d.isEmpty()) {
                    pVar = null;
                } else {
                    pVar = (r2.p) d.get(0);
                }
                if (pVar != null) {
                    f7 = e9.i0.z(pVar);
                }
            }
            f7 = r2.x.f(jVar, sVar, z10, false);
        }
        HashMap hashMap = r2.x.f47065a;
        ArrayList arrayList = new ArrayList(f7);
        Collections.sort(arrayList, new f8(new m4.w(sVar, 28), 3));
        return arrayList;
    }

    @Override
    public final long O(long j3, long j10) {
        boolean z10;
        float f7;
        if (this.l1 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f14483k1) {
            if (z10 || this.J0) {
                return 1000000L;
            }
        } else {
            long h = ((d0) this.Y0).h();
            if (z10 && h != -9223372036854775807L) {
                float min = (float) Math.min(h, this.l1 - j3);
                if (h() != null) {
                    f7 = h().f3673a;
                } else {
                    f7 = 1.0f;
                }
                this.h.getClass();
                return Math.max(10000L, ((min / f7) / 2.0f) - (e2.d0.P(SystemClock.elapsedRealtime()) - j10));
            }
        }
        return 10000L;
    }

    @Override
    public final com.google.firebase.messaging.n P(r2.p r13, b2.s r14, android.media.MediaCrypto r15, float r16) {
        throw new UnsupportedOperationException("Method not decompiled: k2.h0.P(r2.p, b2.s, android.media.MediaCrypto, float):com.google.firebase.messaging.n");
    }

    @Override
    public final void Q(h2.h hVar) {
        b2.s sVar;
        if (Build.VERSION.SDK_INT >= 29 && (sVar = hVar.f10982a) != null && Objects.equals(sVar.f3643r, "audio/opus") && this.f47058w0) {
            ByteBuffer byteBuffer = hVar.f10986f;
            byteBuffer.getClass();
            b2.s sVar2 = hVar.f10982a;
            sVar2.getClass();
            int i10 = sVar2.M;
            if (byteBuffer.remaining() == 8) {
                ((d0) this.Y0).D(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override
    public final void W(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new f(xVar, exc, 0));
        }
    }

    @Override
    public final void X(long j3, long j10, String str) {
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new a3.g0(xVar, str, j3, j10, 2));
        }
    }

    @Override
    public final void Y(String str) {
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new w1(25, xVar, str));
        }
    }

    @Override
    public final i2.h Z(n4.x xVar) {
        b2.s sVar = (b2.s) xVar.f16695c;
        sVar.getClass();
        this.f14476d1 = sVar;
        i2.h Z = super.Z(xVar);
        n4.x xVar2 = this.X0;
        Handler handler = (Handler) xVar2.f16694b;
        if (handler != null) {
            handler.post(new gg.t(xVar2, sVar, Z, 21));
        }
        return Z;
    }

    @Override
    public final long a() {
        if (this.f11648n == 2) {
            A0();
        }
        return this.f14478f1;
    }

    @Override
    public final void a0(b2.s sVar, MediaFormat mediaFormat) {
        int i10;
        b2.s sVar2 = this.f14477e1;
        boolean z10 = true;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (this.f47038b0 != null) {
            mediaFormat.getClass();
            String str = sVar.f3643r;
            int i11 = sVar.J;
            if ("audio/raw".equals(str)) {
                i10 = sVar.L;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e2.d0.A(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i10 = 2;
            }
            b2.r rVar = new b2.r();
            rVar.f3585q = r0.n("audio/raw");
            rVar.K = i10;
            rVar.L = sVar.M;
            rVar.M = sVar.N;
            rVar.f3579k = sVar.f3637l;
            rVar.f3571a = sVar.f3628a;
            rVar.f3572b = sVar.f3629b;
            rVar.f3573c = e9.i0.v(sVar.f3630c);
            rVar.d = sVar.d;
            rVar.f3574e = sVar.f3631e;
            rVar.f3575f = sVar.f3632f;
            rVar.I = mediaFormat.getInteger("channel-count");
            rVar.J = mediaFormat.getInteger("sample-rate");
            sVar = new b2.s(rVar);
            boolean z11 = this.f14474b1;
            int i12 = sVar.J;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f14475c1) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
        }
        try {
            int i14 = Build.VERSION.SDK_INT;
            p pVar = this.Y0;
            if (i14 >= 29) {
                if (this.f47058w0) {
                    n1 n1Var = this.d;
                    n1Var.getClass();
                    if (n1Var.f11802a != 0) {
                        n1 n1Var2 = this.d;
                        n1Var2.getClass();
                        int i15 = n1Var2.f11802a;
                        d0 d0Var = (d0) pVar;
                        d0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        d0Var.f14439j = i15;
                    }
                }
                d0 d0Var2 = (d0) pVar;
                d0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                e2.d.g(z10);
                d0Var2.f14439j = 0;
            }
            ((d0) pVar).d(sVar, iArr);
        } catch (l e7) {
            throw d(e7, e7.f14511a, false, 5001);
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.f14481i1;
        this.f14481i1 = false;
        return z10;
    }

    @Override
    public final void b0() {
        this.Y0.getClass();
    }

    @Override
    public final void c(int i10, Object obj) {
        a4.l lVar;
        v0 v0Var;
        r2.k kVar;
        p pVar = this.Y0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 12) {
                        if (i10 != 16) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    if (i10 == 11) {
                                        i2.j0 j0Var = (i2.j0) obj;
                                        j0Var.getClass();
                                        this.W = j0Var;
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                ((d0) pVar).A(intValue);
                                if (Build.VERSION.SDK_INT >= 35 && (kVar = this.Z0) != null) {
                                    kVar.d(intValue);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            d0 d0Var = (d0) pVar;
                            d0Var.E = ((Boolean) obj).booleanValue();
                            v vVar = d0Var.f14453u;
                            if (vVar != null && vVar.f14572j) {
                                v0Var = v0.d;
                            } else {
                                v0Var = d0Var.D;
                            }
                            w wVar = new w(v0Var, -9223372036854775807L, -9223372036854775807L);
                            if (d0Var.q()) {
                                d0Var.B = wVar;
                                return;
                            } else {
                                d0Var.C = wVar;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f14482j1 = ((Integer) obj).intValue();
                        r2.m mVar = this.f47038b0;
                        if (mVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f14482j1));
                            mVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    d0 d0Var2 = (d0) pVar;
                    AudioDeviceInfo audioDeviceInfo2 = null;
                    if (audioDeviceInfo == null) {
                        lVar = null;
                    } else {
                        d0Var2.getClass();
                        lVar = new a4.l(audioDeviceInfo, 25);
                    }
                    d0Var2.f14426b0 = lVar;
                    e7 e7Var = d0Var2.f14456y;
                    if (e7Var != null) {
                        e7Var.c(audioDeviceInfo);
                    }
                    AudioTrack audioTrack = d0Var2.f14454w;
                    if (audioTrack != null) {
                        a4.l lVar2 = d0Var2.f14426b0;
                        if (lVar2 != null) {
                            audioDeviceInfo2 = (AudioDeviceInfo) lVar2.f297b;
                        }
                        audioTrack.setPreferredDevice(audioDeviceInfo2);
                        return;
                    }
                    return;
                }
                b2.f fVar = (b2.f) obj;
                fVar.getClass();
                ((d0) pVar).C(fVar);
                return;
            }
            b2.e eVar = (b2.e) obj;
            eVar.getClass();
            ((d0) pVar).z(eVar);
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        d0 d0Var3 = (d0) pVar;
        if (d0Var3.P != floatValue) {
            d0Var3.P = floatValue;
            if (d0Var3.q()) {
                d0Var3.f14454w.setVolume(d0Var3.P);
            }
        }
    }

    @Override
    public final void d0() {
        ((d0) this.Y0).M = true;
    }

    @Override
    public final void f(v0 v0Var) {
        ((d0) this.Y0).F(v0Var);
    }

    @Override
    public final boolean g0(long j3, long j10, r2.m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.l1 = -9223372036854775807L;
        if (this.f14477e1 != null && (i11 & 2) != 0) {
            mVar.getClass();
            mVar.c(i10);
            return true;
        }
        p pVar = this.Y0;
        if (z10) {
            if (mVar != null) {
                mVar.c(i10);
            }
            this.N0.f11697f += i12;
            ((d0) pVar).M = true;
            return true;
        }
        try {
            if (((d0) pVar).n(j11, i12, byteBuffer)) {
                if (mVar != null) {
                    mVar.c(i10);
                }
                this.N0.f11696e += i12;
                return true;
            }
            this.l1 = j11;
            return false;
        } catch (m e7) {
            b2.s sVar2 = this.f14476d1;
            if (this.f47058w0) {
                n1 n1Var = this.d;
                n1Var.getClass();
                if (n1Var.f11802a != 0) {
                    i14 = 5004;
                    throw d(e7, sVar2, e7.f14514b, i14);
                }
            }
            i14 = 5001;
            throw d(e7, sVar2, e7.f14514b, i14);
        } catch (o e10) {
            if (this.f47058w0) {
                n1 n1Var2 = this.d;
                n1Var2.getClass();
                if (n1Var2.f11802a != 0) {
                    i13 = 5003;
                    throw d(e10, sVar, e10.f14524b, i13);
                }
            }
            i13 = 5002;
            throw d(e10, sVar, e10.f14524b, i13);
        }
    }

    @Override
    public final v0 h() {
        return ((d0) this.Y0).D;
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void j0() {
        int i10;
        try {
            ((d0) this.Y0).w();
            long j3 = this.H0;
            if (j3 != -9223372036854775807L) {
                this.l1 = j3;
            }
        } catch (o e7) {
            if (this.f47058w0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw d(e7, e7.f14525c, e7.f14524b, i10);
        }
    }

    @Override
    public final boolean l() {
        if (this.J0) {
            d0 d0Var = (d0) this.Y0;
            if (d0Var.q()) {
                if (d0Var.T && !d0Var.o()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean m() {
        if (!((d0) this.Y0).o() && !super.m()) {
            return false;
        }
        return true;
    }

    @Override
    public final void o() {
        n4.x xVar = this.X0;
        this.f14480h1 = true;
        this.f14476d1 = null;
        this.l1 = -9223372036854775807L;
        try {
            ((d0) this.Y0).g();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.o();
                throw th2;
            } finally {
            }
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.N0 = obj;
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new g(xVar, obj, 1));
        }
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.f11803b;
        p pVar = this.Y0;
        if (z12) {
            d0 d0Var = (d0) pVar;
            e2.d.g(d0Var.X);
            if (!d0Var.f14428c0) {
                d0Var.f14428c0 = true;
                d0Var.g();
            }
        } else {
            d0 d0Var2 = (d0) pVar;
            if (d0Var2.f14428c0) {
                d0Var2.f14428c0 = false;
                d0Var2.g();
            }
        }
        j2.k kVar = this.f11647f;
        kVar.getClass();
        d0 d0Var3 = (d0) pVar;
        d0Var3.f14450r = kVar;
        e2.x xVar2 = this.h;
        xVar2.getClass();
        d0Var3.h.G = xVar2;
    }

    @Override
    public final void q(long j3, boolean z10) {
        super.q(j3, z10);
        ((d0) this.Y0).g();
        this.f14478f1 = j3;
        this.l1 = -9223372036854775807L;
        this.f14481i1 = false;
        this.f14479g1 = true;
    }

    @Override
    public final void r() {
        r2.k kVar;
        e7 e7Var = ((d0) this.Y0).f14456y;
        if (e7Var != null) {
            Context context = (Context) e7Var.f5030b;
            if (e7Var.f5029a) {
                e7Var.h = null;
                c cVar = (c) e7Var.f5032e;
                if (cVar != null) {
                    c2.d.e(context).unregisterAudioDeviceCallback(cVar);
                }
                context.unregisterReceiver((androidx.mediarouter.app.g) e7Var.f5033f);
                d dVar = (d) e7Var.f5034g;
                if (dVar != null) {
                    dVar.f14417a.unregisterContentObserver(dVar);
                }
                e7Var.f5029a = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 35 && (kVar = this.Z0) != null) {
            kVar.b();
        }
    }

    @Override
    public final void s() {
        p pVar = this.Y0;
        this.f14481i1 = false;
        this.l1 = -9223372036854775807L;
        try {
            this.f47058w0 = false;
            k0();
            i0();
            hg.c.A(this.V, null);
            this.V = null;
        } finally {
            if (this.f14480h1) {
                this.f14480h1 = false;
                ((d0) pVar).y();
            }
        }
    }

    @Override
    public final void t() {
        ((d0) this.Y0).u();
        this.f14483k1 = true;
    }

    @Override
    public final boolean t0(b2.s sVar) {
        n1 n1Var = this.d;
        n1Var.getClass();
        if (n1Var.f11802a != 0) {
            int y02 = y0(sVar);
            if ((y02 & 512) != 0) {
                n1 n1Var2 = this.d;
                n1Var2.getClass();
                if (n1Var2.f11802a != 2 && (y02 & 1024) == 0) {
                    if (sVar.M == 0 && sVar.N == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return ((d0) this.Y0).G(sVar);
    }

    @Override
    public final void u() {
        A0();
        this.f14483k1 = false;
        ((d0) this.Y0).t();
    }

    @Override
    public final int u0(r2.j r18, b2.s r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.h0.u0(r2.j, b2.s):int");
    }

    public final int y0(b2.s sVar) {
        int i10;
        e j3 = ((d0) this.Y0).j(sVar);
        if (!j3.f14458a) {
            return 0;
        }
        if (j3.f14459b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (j3.f14460c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int z0(r2.p pVar, b2.s sVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(pVar.f47020a) && (i10 = Build.VERSION.SDK_INT) < 24 && (i10 != 23 || !e2.d0.M(this.W0))) {
            return -1;
        }
        return sVar.f3644s;
    }

    @Override
    public final t0 i() {
        return this;
    }
}
