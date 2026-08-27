package j3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import h3.x1;
import hh.m5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class n0 extends y3.q implements d5.o {
    public final Context E0;
    public final n F0;
    public final t G0;
    public int H0;
    public boolean I0;
    public h3.t0 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public h3.l0 O0;

    public n0(Context context, y3.j jVar, Handler handler, h3.h0 h0Var, t tVar) {
        super(1, jVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = tVar;
        this.F0 = new n(handler, h0Var);
        ((j0) tVar).f12372r = new k5.i(this, 20);
    }

    public static p8.z R(y3.r rVar, h3.t0 t0Var, boolean z10, t tVar) {
        String str = t0Var.B;
        if (str == null) {
            p8.x xVar = p8.z.f45604b;
            return p8.l0.f45555e;
        }
        if (((j0) tVar).h(t0Var) != 0) {
            List listE = y3.w.e("audio/raw", false, false);
            y3.n nVar = listE.isEmpty() ? null : (y3.n) listE.get(0);
            if (nVar != null) {
                return p8.z.y(nVar);
            }
        }
        rVar.getClass();
        List listE2 = y3.w.e(str, z10, false);
        String strB = y3.w.b(t0Var);
        if (strB == null) {
            return p8.z.u(listE2);
        }
        List listE3 = y3.w.e(strB, z10, false);
        p8.x xVar2 = p8.z.f45604b;
        p8.w wVar = new p8.w();
        wVar.b(listE2);
        wVar.b(listE3);
        return wVar.c();
    }

    @Override
    public final void A() {
        ((j0) this.G0).G = true;
    }

    @Override
    public final boolean C(long j10, long j11, y3.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, h3.t0 t0Var) throws h3.n {
        byteBuffer.getClass();
        if (this.J0 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.releaseOutputBuffer(i10, false);
            return true;
        }
        t tVar = this.G0;
        if (z10) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.f49539z0.f14422f += i12;
            ((j0) tVar).G = true;
            return true;
        }
        try {
            if (!((j0) tVar).l(j12, i12, byteBuffer)) {
                return false;
            }
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.f49539z0.f14421e += i12;
            return true;
        } catch (q e9) {
            throw createRendererException(e9, e9.f12402c, e9.f12401b, 5001);
        } catch (s e10) {
            throw createRendererException(e10, t0Var, e10.f12435b, 5002);
        }
    }

    @Override
    public final void F() throws h3.n {
        try {
            ((j0) this.G0).t();
        } catch (s e9) {
            throw createRendererException(e9, e9.f12436c, e9.f12435b, 5002);
        }
    }

    @Override
    public final boolean L(h3.t0 t0Var) {
        return ((j0) this.G0).h(t0Var) != 0;
    }

    @Override
    public final int M(y3.r r13, h3.t0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: j3.n0.M(y3.r, h3.t0):int");
    }

    public final int Q(y3.n nVar, h3.t0 t0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f49495a) || (i10 = d5.g0.f4795a) >= 24 || (i10 == 23 && d5.g0.F(this.E0))) {
            return t0Var.C;
        }
        return -1;
    }

    public final void S() {
        long jG = ((j0) this.G0).g(isEnded());
        if (jG != Long.MIN_VALUE) {
            if (!this.M0) {
                jG = Math.max(this.K0, jG);
            }
            this.K0 = jG;
            this.M0 = false;
        }
    }

    @Override
    public final k3.l b(y3.n nVar, h3.t0 t0Var, h3.t0 t0Var2) {
        k3.l lVarB = nVar.b(t0Var, t0Var2);
        int i10 = lVarB.f14436e;
        if (Q(nVar, t0Var2) > this.H0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new k3.l(nVar.f49495a, t0Var, t0Var2, i11 != 0 ? 0 : lVarB.d, i11);
    }

    @Override
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final x1 getPlaybackParameters() {
        j0 j0Var = (j0) this.G0;
        return j0Var.f12365k ? j0Var.f12378y : j0Var.i().f12339a;
    }

    @Override
    public final long getPositionUs() {
        if (getState() == 2) {
            S();
        }
        return this.K0;
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        t tVar = this.G0;
        if (i10 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            j0 j0Var = (j0) tVar;
            if (j0Var.J != fFloatValue) {
                j0Var.J = fFloatValue;
                if (j0Var.o()) {
                    if (d5.g0.f4795a >= 21) {
                        j0Var.f12375u.setVolume(j0Var.J);
                        return;
                    }
                    AudioTrack audioTrack = j0Var.f12375u;
                    float f10 = j0Var.J;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            e eVar = (e) obj;
            j0 j0Var2 = (j0) tVar;
            if (j0Var2.v.equals(eVar)) {
                return;
            }
            j0Var2.v = eVar;
            if (j0Var2.Z) {
                return;
            }
            j0Var2.e();
            return;
        }
        if (i10 == 6) {
            ((j0) tVar).z((x) obj);
            return;
        }
        switch (i10) {
            case 9:
                j0 j0Var3 = (j0) tVar;
                j0Var3.x(j0Var3.i().f12339a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                j0 j0Var4 = (j0) tVar;
                if (j0Var4.W != iIntValue) {
                    j0Var4.W = iIntValue;
                    j0Var4.V = iIntValue != 0;
                    j0Var4.e();
                }
                break;
            case 11:
                this.O0 = (h3.l0) obj;
                break;
            case 12:
                if (d5.g0.f4795a >= 23) {
                    m0.a(tVar, obj);
                }
                break;
        }
    }

    @Override
    public final boolean isEnded() {
        if (!this.f49532v0) {
            return false;
        }
        j0 j0Var = (j0) this.G0;
        if (j0Var.o()) {
            return j0Var.S && !j0Var.m();
        }
        return true;
    }

    @Override
    public final boolean isReady() {
        return ((j0) this.G0).m() || super.isReady();
    }

    @Override
    public final float l(float f10, h3.t0[] t0VarArr) {
        int iMax = -1;
        for (h3.t0 t0Var : t0VarArr) {
            int i10 = t0Var.P;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override
    public final ArrayList m(y3.r rVar, h3.t0 t0Var, boolean z10) {
        p8.z zVarR = R(rVar, t0Var, z10, this.G0);
        Pattern pattern = y3.w.f49545a;
        ArrayList arrayList = new ArrayList(zVarR);
        Collections.sort(arrayList, new ag.h(new t0.c(t0Var, 5), 6));
        return arrayList;
    }

    @Override
    public final y3.i o(y3.n nVar, h3.t0 t0Var, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        h3.t0[] streamFormats = getStreamFormats();
        int iQ = Q(nVar, t0Var);
        if (streamFormats.length != 1) {
            for (h3.t0 t0Var2 : streamFormats) {
                if (nVar.b(t0Var, t0Var2).d != 0) {
                    iQ = Math.max(iQ, Q(nVar, t0Var2));
                }
            }
        }
        this.H0 = iQ;
        String str = nVar.f49495a;
        int i10 = d5.g0.f4795a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(d5.g0.f4797c)) {
            String str2 = d5.g0.f4796b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.I0 = z10;
        String str3 = nVar.f49497c;
        int i11 = this.H0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i12 = t0Var.O;
        String str4 = t0Var.B;
        mediaFormat.setInteger("channel-count", i12);
        int i13 = t0Var.P;
        mediaFormat.setInteger("sample-rate", i13);
        d5.a.I(mediaFormat, t0Var.D);
        d5.a.A(mediaFormat, "max-input-size", i11);
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                if (i10 == 23) {
                    String str5 = d5.g0.d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f10);
                }
            }
        }
        if (i10 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
            if (((j0) this.G0).h(d5.g0.v(4, t0Var.O, i13)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.J0 = (!"audio/raw".equals(nVar.f49496b) || "audio/raw".equals(str4)) ? null : t0Var;
        return new y3.i(nVar, mediaFormat, t0Var, null, mediaCrypto);
    }

    @Override
    public final void onDisabled() {
        n nVar = this.F0;
        this.N0 = true;
        try {
            ((j0) this.G0).e();
            try {
                super.onDisabled();
            } finally {
                nVar.a(this.f49539z0);
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
                nVar.a(this.f49539z0);
            }
        }
    }

    @Override
    public final void onEnabled(boolean z10, boolean z11) {
        k3.f fVar = new k3.f();
        this.f49539z0 = fVar;
        n nVar = this.F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new l(nVar, fVar, 0));
        }
        boolean z12 = getConfiguration().f7935a;
        t tVar = this.G0;
        if (z12) {
            ((j0) tVar).d();
        } else {
            j0 j0Var = (j0) tVar;
            if (j0Var.Z) {
                j0Var.Z = false;
                j0Var.e();
            }
        }
        ((j0) tVar).f12371q = getPlayerId();
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        ((j0) this.G0).e();
        this.K0 = j10;
        this.L0 = true;
        this.M0 = true;
    }

    @Override
    public final void onQueueInputBuffer(k3.i iVar) {
        if (!this.L0 || iVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(iVar.d - this.K0) > 500000) {
            this.K0 = iVar.d;
        }
        this.L0 = false;
    }

    @Override
    public final void onReset() {
        t tVar = this.G0;
        try {
            super.onReset();
        } finally {
            if (this.N0) {
                this.N0 = false;
                ((j0) tVar).v();
            }
        }
    }

    @Override
    public final void onStarted() {
        ((j0) this.G0).r();
    }

    @Override
    public final void onStopped() {
        S();
        ((j0) this.G0).q();
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        ((j0) this.G0).A(x1Var);
    }

    @Override
    public final void t(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        n nVar = this.F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new k(nVar, exc, 0));
        }
    }

    @Override
    public final void u(long j10, long j11, String str) {
        n nVar = this.F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new e5.w(nVar, str, j10, j11, 2));
        }
    }

    @Override
    public final void v(String str) {
        n nVar = this.F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new m5(13, nVar, str));
        }
    }

    @Override
    public final k3.l w(h3.u0 u0Var) {
        k3.l lVarW = super.w(u0Var);
        h3.t0 t0Var = u0Var.f8207b;
        n nVar = this.F0;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new m(nVar, t0Var, lVarW, 0));
        }
        return lVarW;
    }

    @Override
    public final void x(h3.t0 t0Var, MediaFormat mediaFormat) throws h3.n {
        int iU;
        h3.t0 t0Var2 = this.J0;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (this.I != null) {
            String str = t0Var.B;
            int i10 = t0Var.O;
            if ("audio/raw".equals(str)) {
                iU = t0Var.Q;
            } else if (d5.g0.f4795a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iU = mediaFormat.containsKey("v-bits-per-sample") ? d5.g0.u(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iU = mediaFormat.getInteger("pcm-encoding");
            }
            h3.s0 s0Var = new h3.s0();
            s0Var.f8135o = "audio/raw";
            s0Var.D = iU;
            s0Var.E = t0Var.R;
            s0Var.F = t0Var.S;
            s0Var.B = mediaFormat.getInteger("channel-count");
            s0Var.C = mediaFormat.getInteger("sample-rate");
            t0Var = new h3.t0(s0Var);
            if (this.I0 && t0Var.O == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            ((j0) this.G0).b(t0Var, iArr);
        } catch (p e9) {
            throw createRendererException(e9, e9.f12399a, 5001);
        }
    }

    @Override
    public final void y() {
        this.G0.getClass();
    }

    @Override
    public final d5.o getMediaClock() {
        return this;
    }
}
