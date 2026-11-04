package gi;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.os.Handler;
import android.os.Parcel;
import android.util.LongSparseArray;
import android.view.View;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.uy;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.om0;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.pz;
import org.telegram.ui.ts;
import org.telegram.ui.vz;
public class w5 implements k51, h6.a, com.google.android.gms.common.api.internal.p, vz, OnCompleteListener, kg.u1, m.x0, m2.x, lm0, org.telegram.ui.Components.r4, mi.j0, n2.i, org.telegram.messenger.qa, org.telegram.messenger.ka, uy, hh.a, om0 {
    public final int f13797a;
    public Object f13798b;

    public w5(int i3, boolean z10) {
        this.f13797a = i3;
    }

    public static void X(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public void B(Location location) {
        yy yyVar = (yy) this.f13798b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = yyVar.f26683n;
        for (Map.Entry entry : hashMap.entrySet()) {
            zi ziVar = (zi) entry.getValue();
            yyVar.r0(wy.d(tL_messageMediaGeo, zi.B0(ziVar.f26868k), ziVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public long C() {
        return 0L;
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public int F() {
        int i3;
        hh.a P = P();
        hh.a S = S();
        if (P != null) {
            i3 = P.F();
        } else {
            i3 = 0;
        }
        if (S != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.i5) this.f13798b).f27631a, S.F(), i3);
        }
        return i3;
    }

    @Override
    public void F1() {
        mi.t4 t4Var = (mi.t4) this.f13798b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.f20029a;
            mi.t3 t3Var = m3Var.f19749a;
            mi.g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.f19916p3.onContentChanged();
        }
    }

    @Override
    public void G() {
        z2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13798b;
        synchronized (ffmpegAudioRenderer.f16443a) {
            nVar = ffmpegAudioRenderer.I;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public long H(long j10) {
        return 1L;
    }

    @Override
    public boolean I() {
        return false;
    }

    @Override
    public void J(m2.t0 t0Var) {
        m2.t tVar = ((FfmpegAudioRenderer) this.f13798b).J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 1));
        }
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public long K(long j10, long j11) {
        return 1L;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f13797a) {
            case 15:
                ((mi.c2) this.f13798b).x0(i3, i10, z10);
                return;
            default:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f13798b;
                e0Var.q1(i3, i10, z10);
                e0Var.dismiss();
                return;
        }
    }

    @Override
    public int M() {
        int i3;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f13798b;
        hh.a P = P();
        if (P != null && i5Var.d.b()) {
            i3 = P.M();
        } else {
            i3 = 0;
        }
        hh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.f27631a, S.M(), i3);
        }
        return i3;
    }

    @Override
    public void N(Exception exc) {
        g2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        m2.t tVar = ((FfmpegAudioRenderer) this.f13798b).J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new m2.p(tVar, exc, 1));
        }
    }

    @Override
    public float O() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f13798b;
        hh.a P = P();
        hh.a S = S();
        if (P != null) {
            f10 = P.O();
        } else {
            f10 = -1.0f;
        }
        if (S != null) {
            f11 = S.O();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, i5Var.f27631a);
        }
        if (i5Var.f27631a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public org.telegram.ui.Cells.h9 O0() {
        mi.m3 m3Var = ((mi.t4) this.f13798b).O;
        if (m3Var != null) {
            return m3Var.f19749a.getTextSelectionHelper();
        }
        return null;
    }

    public hh.a P() {
        org.telegram.ui.ActionBar.s4 s4Var = ((org.telegram.ui.ActionBar.i5) this.f13798b).d;
        if (s4Var != null) {
            return s4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public void Q() {
        ((FfmpegAudioRenderer) this.f13798b).f2071a0 = true;
    }

    public org.telegram.messenger.x9 R() {
        l8.d dVar = (l8.d) this.f13798b;
        p6.m.i("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.f18106b, dVar.d), new LatLng(dVar.f18107c, dVar.f18108e));
        ?? obj = new Object();
        obj.f26356a = latLngBounds;
        return obj;
    }

    public hh.a S() {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f13798b;
        if (i5Var.f27631a < 1.0f && (s4Var = i5Var.d) != null) {
            return s4Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    public int T() {
        return ((org.telegram.messenger.j0) this.f13798b).f23620c;
    }

    public LongSparseArray U(long j10, long j11) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f13798b).get(j10);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j11);
    }

    public w5 V(org.telegram.messenger.va vaVar) {
        l8.d dVar = (l8.d) this.f13798b;
        LatLng latLng = new LatLng(vaVar.f25843a, vaVar.f25844b);
        dVar.getClass();
        double d = dVar.f18106b;
        double d10 = latLng.f7751a;
        dVar.f18106b = Math.min(d, d10);
        dVar.f18107c = Math.max(dVar.f18107c, d10);
        boolean isNaN = Double.isNaN(dVar.d);
        double d11 = latLng.f7752b;
        if (isNaN) {
            dVar.d = d11;
            dVar.f18108e = d11;
            return this;
        }
        double d12 = dVar.d;
        double d13 = dVar.f18108e;
        if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
            if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                dVar.d = d11;
                return this;
            }
            dVar.f18108e = d11;
        }
        return this;
    }

    @Override
    public float W() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f13798b;
        hh.a P = P();
        hh.a S = S();
        if (P != null) {
            f10 = P.W();
        } else {
            f10 = -1.0f;
        }
        if (S != null) {
            f11 = S.W();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, i5Var.f27631a);
        }
        if (i5Var.f27631a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public void W0(CharSequence charSequence) {
        mi.m3 m3Var = ((mi.t4) this.f13798b).O;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f19749a.w4(charSequence.toString());
            }
        }
    }

    public void Y(long j10, long j11, long j12, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f13798b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j10, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j11);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
        }
        longSparseArray3.get(j12);
        longSparseArray3.put(j12, obj);
    }

    @Override
    public void a(int i3) {
        m2.t tVar = ((FfmpegAudioRenderer) this.f13798b).J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new cg.l0(tVar, i3, 14));
        }
    }

    @Override
    public float a0() {
        float f10;
        hh.a P = P();
        hh.a S = S();
        if (P != null) {
            f10 = P.a0();
        } else {
            f10 = 0.0f;
        }
        if (S != null) {
            return org.telegram.messenger.g0.T1(S.a0(), f10, ((org.telegram.ui.ActionBar.i5) this.f13798b).f27631a);
        }
        return f10;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13797a) {
            case 3:
                i6.q qVar = new i6.q(2, (TaskCompletionSource) obj2);
                i6.i iVar = (i6.i) ((i6.s) obj).m();
                Parcel P0 = iVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, qVar);
                P0.writeStringArray((String[]) this.f13798b);
                iVar.U0(P0, 7);
                return;
            default:
                c6.l lVar = new c6.l((TaskCompletionSource) obj2);
                k7.i iVar2 = (k7.i) ((k7.c) obj).m();
                Parcel L0 = iVar2.L0();
                int i3 = k7.f.f16904a;
                L0.writeStrongBinder(lVar);
                k7.f.c(L0, (z5.e) this.f13798b);
                iVar2.M0(L0, 1);
                return;
        }
    }

    @Override
    public long b(long j10) {
        return 0L;
    }

    public Object b0(long j10, long j11, long j12) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f13798b).get(j10);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j11)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j12);
        longSparseArray.remove(j12);
        return obj;
    }

    @Override
    public void c(float f10) {
        mi.x xVar = (mi.x) this.f13798b;
        zi ziVar = xVar.Q;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
        MediaController.B().i0(xVar.Q, f10);
    }

    @Override
    public int c0() {
        int i3;
        hh.a P = P();
        hh.a S = S();
        if (P != null) {
            i3 = P.c0();
        } else {
            i3 = 0;
        }
        if (S != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.i5) this.f13798b).f27631a, S.c0(), i3);
        }
        return i3;
    }

    @Override
    public void c2() {
        mi.t4 t4Var = (mi.t4) this.f13798b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.f20029a;
            mi.t3.S1(m3Var.f19749a);
        }
    }

    @Override
    public void d(float f10) {
        zi ziVar = ((mi.x) this.f13798b).Q;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
    }

    public void d0(ad.b bVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((oc.u) this.f13798b).f21009c) {
            }
            throw new oc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), bVar);
        }
    }

    @Override
    public void e(boolean z10) {
        m2.t tVar = ((FfmpegAudioRenderer) this.f13798b).J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new ci.e1(12, tVar, z10));
        }
    }

    @Override
    public void e0(long j10, int i3, long j11) {
        m2.t tVar = ((FfmpegAudioRenderer) this.f13798b).J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new a3.b(tVar, i3, j10, j11, 1));
        }
    }

    @Override
    public org.telegram.ui.Cells.g9 e1() {
        return (mi.t4) this.f13798b;
    }

    @Override
    public void f(mi.h1 h1Var) {
        mi.m3 m3Var = ((mi.t4) this.f13798b).O;
        if (m3Var != null) {
            mi.t3 t3Var = m3Var.f19749a;
            mi.t3.Q1(t3Var, h1Var);
            t3Var.f19916p3.E(h1Var, true);
        }
    }

    @Override
    public void g(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13798b;
        ffmpegAudioRenderer.f2078h0 = true;
        m2.t tVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new ci.e3(tVar, j10, 13));
        }
    }

    @Override
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ts tsVar = (ts) this.f13798b;
        sb2.append((Object) tsVar.f28989a.getText());
        sb2.append(" ");
        sb2.append((Object) tsVar.f28990b.getText());
        return sb2.toString();
    }

    @Override
    public long j(long j10, long j11) {
        return 0L;
    }

    @Override
    public mi.a j1() {
        return ((mi.t4) this.f13798b).f20029a;
    }

    @Override
    public void k(boolean z10, float f10) {
        float A;
        ts tsVar = (ts) this.f13798b;
        if (f10 <= 0.25f) {
            A = a1.g.A(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                A = a1.g.A(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    A = a1.g.A(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    A = a1.g.A(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i3 = (int) A;
        long j10 = i3;
        boolean z11 = true;
        tsVar.f28990b.setText(bd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.g0.i0(j10, false, false)));
        tsVar.d = j10;
        org.telegram.ui.Cells.q8[] q8VarArr = tsVar.h;
        AnimatorSet[] animatorSetArr = tsVar.f49879n;
        if (tsVar.f49877e == DataAutoDownloadActivity.o0(tsVar.f49880r)) {
            tsVar.f49878f.setText(bd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(j10, false, false)));
            if (i3 <= 2097152) {
                z11 = false;
            }
            if (z11 != q8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                q8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Cells.w9(tsVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public long l(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public boolean l1() {
        mi.t4 t4Var = (mi.t4) this.f13798b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.f20029a;
            if (m3Var.f19749a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public o2.j m(long j10) {
        return (o2.j) this.f13798b;
    }

    @Override
    public boolean n(pz pzVar) {
        return false;
    }

    @Override
    public void o(zi ziVar) {
        ji.b0 b0Var = (ji.b0) this.f13798b;
        b0Var.f16270r1.presentFragment(im0.M(b0Var.f28583a, ziVar));
        b0Var.dismiss();
    }

    @Override
    public void onComplete(Task task) {
        ((CountDownLatch) this.f13798b).countDown();
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        y5 y5Var = (y5) this.f13798b;
        u5 u5Var = y5Var.N;
        m51 m51Var = y5Var.f13969y;
        if (m51Var == null) {
            return;
        }
        if (m51Var.d0()) {
            org.telegram.messenger.g0.h3(u5Var);
        } else {
            org.telegram.messenger.g0.r(u5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        ug.r1 r1Var = ((y5) this.f13798b).f13967x;
        if (r1Var != null) {
            float f11 = i3 / i10;
            if (Math.abs(r1Var.f56244z0 - f11) >= 1.0E-4f) {
                r1Var.f56244z0 = f11;
                r1Var.requestLayout();
            }
        }
    }

    @Override
    public void p() {
        ((FfmpegAudioRenderer) this.f13798b).f2077g0 = true;
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public void q1(int i3, int i10) {
        mi.t4 t4Var = (mi.t4) this.f13798b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.f20029a;
            mi.g2 g2Var = m3Var.f19749a.R3;
            if (g2Var != null) {
                g2Var.f(i3, i10);
            }
        }
    }

    @Override
    public void r(int i3) {
        org.telegram.messenger.g0.h3(new lg.n(this, 2));
    }

    @Override
    public long s(long j10, long j11) {
        return 0L;
    }

    @Override
    public void u() {
        mi.t4 t4Var = (mi.t4) this.f13798b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.t3.T1(m3Var.f19749a, t4Var.f20029a);
        }
    }

    @Override
    public int u0() {
        int i3;
        hh.a P = P();
        hh.a S = S();
        if (P != null) {
            i3 = P.u0();
        } else {
            i3 = 0;
        }
        if (S != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.i5) this.f13798b).f27631a, S.u0(), i3);
        }
        return i3;
    }

    @Override
    public void v(m2.t0 t0Var) {
        m2.t tVar = ((FfmpegAudioRenderer) this.f13798b).J;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 0));
        }
    }

    @Override
    public int w0() {
        int i3;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f13798b;
        hh.a P = P();
        if (P != null) {
            i3 = P.w0();
        } else {
            i3 = 0;
        }
        if (i5Var.f27631a < 1.0f && (s4Var = i5Var.d) != null) {
            return i0.a.f(i5Var.f27631a, s4Var.getButtonsGlassBackgroundColor(), i3);
        }
        return i3;
    }

    @Override
    public int x() {
        int i3;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f13798b;
        hh.a P = P();
        if (P != null && i5Var.d.b()) {
            i3 = P.x();
        } else {
            i3 = 0;
        }
        hh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.f27631a, S.x(), i3);
        }
        return i3;
    }

    @Override
    public void y() {
        yy yyVar = (yy) this.f13798b;
        HashMap hashMap = yyVar.f26683n;
        yyVar.getNotificationCenter().k(hs.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public void z(Bitmap bitmap) {
        i6.b bVar = h6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int e10 = (int) a1.g.e(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (e10 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, e10, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((h6.h) this.f13798b).e(bitmap2, 0);
    }

    public w5(com.google.android.gms.common.api.j jVar, Object obj, int i3) {
        this.f13797a = i3;
        this.f13798b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public w5(Object obj, int i3) {
        this.f13797a = i3;
        this.f13798b = obj;
    }

    public w5(z6.a aVar) {
        this.f13797a = 4;
        p6.m.g(aVar);
        this.f13798b = aVar;
    }

    public w5(int i3) {
        this.f13797a = i3;
        switch (i3) {
            case 18:
                this.f13798b = new ConcurrentHashMap(16);
                return;
            case 23:
                this.f13798b = new LongSparseArray();
                return;
            default:
                this.f13798b = new AtomicInteger(0);
                return;
        }
    }

    public w5(String str, int i3) {
        this.f13797a = 21;
        this.f13798b = new org.telegram.messenger.j0(str, i3);
    }

    public w5(String str, String str2) {
        this.f13797a = 22;
        this.f13798b = new org.telegram.messenger.n0(str, str2);
    }

    @Override
    public void E(int i3) {
    }

    @Override
    public void b2(ArrayList arrayList) {
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void t(int i3) {
    }

    @Override
    public void D() {
    }

    @Override
    public void Z() {
    }

    @Override
    public void h() {
    }

    @Override
    public void q() {
    }

    @Override
    public long i(long j10, long j11) {
        return j11;
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override
    public void w(zi ziVar, View view, int i3) {
    }
}
