package k2;

import ai.o8;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import b2.s0;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.b2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.l9;
import org.telegram.ui.ms0;
import org.telegram.ui.t9;
import org.telegram.ui.tb1;
import org.telegram.ui.web.b1;
import pg.a1;
import pg.d1;
import s4.h1;
import s4.o0;
import s4.p0;
import w7.x8;
public class u implements n, e2, y2.h, le.e, l.i, l2.h, k1.f, eo0, le.g, lg.o, c71, b2, t9, com.google.android.gms.common.api.internal.s, h1 {
    public final int f13370a;
    public Object f13371b;

    public u(Object obj, int i10) {
        this.f13370a = i10;
        this.f13371b = obj;
    }

    @Override
    public boolean A(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.f13371b).P;
        if (kVar2 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((a4.m) kVar2).f275b).W.f14012c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.c0) it.next()).f2394a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void C(float f7, int i10) {
        ((le.k) this.f13371b).i(f7);
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        ((le.k) this.f13371b).i(f7);
    }

    @Override
    public void E() {
        ((m9) this.f13371b).f26142a.invalidate();
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public void G(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f13371b;
        Handler handler = eVar.f13704f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f13705n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f13699b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i11);
        }
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, dVar, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean H() {
        return true;
    }

    @Override
    public View I(int i10) {
        return ((o0) this.f13371b).q(i10);
    }

    @Override
    public void J() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13371b;
        synchronized (ffmpegAudioRenderer.f10638a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public String J0() {
        return ((b1) this.f13371b).f38641i0;
    }

    @Override
    public void K(String str) {
        b1 b1Var = (b1) this.f13371b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void L(boolean z10) {
        ((ue0) this.f13371b).f28469c.setAspectLock(z10);
    }

    @Override
    public long M() {
        return 0L;
    }

    @Override
    public int N(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public boolean O(int i10) {
        if (i10 == ((dq0) this.f13371b).f23444r) {
            return true;
        }
        return false;
    }

    @Override
    public long P(long j3) {
        return 1L;
    }

    @Override
    public void R(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override
    public long S(long j3, long j10) {
        return 1L;
    }

    @Override
    public Object T(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.f13371b).T(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void U() {
        ((FfmpegAudioRenderer) this.f13371b).Z = true;
    }

    @Override
    public void V(y2.j jVar, long j3, long j10, boolean z10) {
        ((l2.g) this.f13371b).w((y2.p) jVar, j10);
    }

    public void W() {
        pg.b1 b1Var = ((d1) this.f13371b).d;
        if (b1Var != null) {
            a1 a1Var = b1Var.f40769s;
            if (a1Var != null) {
                b1Var.cancelRunnable(a1Var);
                b1Var.f40769s = null;
            }
            a1 a1Var2 = new a1(b1Var, 1);
            b1Var.f40769s = a1Var2;
            b1Var.postRunnable(a1Var2, 1L);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        tb1 tb1Var = (tb1) ((org.telegram.ui.Cells.k0) this.f13371b);
        int i10 = (int) (h6.f19019q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        h6.f19019q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = tb1Var.e.e;
            wk0 wk0Var = (wk0) themeActivity.f31522b.K(themeActivity.f31529f0);
            if (wk0Var != null) {
                ((f9) wk0Var.f42627a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.f19019q * 100.0f))));
            }
            h6.E(true);
        }
    }

    @Override
    public void Y(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    public s0.d Z(int i10) {
        return null;
    }

    public s0.d a0(int i10) {
        return null;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13370a) {
            case 21:
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f13371b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, (s6.a) this.f13371b);
                eVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public long b(long j3) {
        return 0L;
    }

    public void b0(aa.a aVar) {
        h8.j jVar = (h8.j) this.f13371b;
        jVar.f10133a = aVar;
        Iterator it = jVar.f10135c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10135c.clear();
        jVar.f10134b = null;
    }

    public boolean c0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public int d(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    public void d0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13371b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long f02 = f0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + f02);
    }

    @Override
    public void e(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    public void e0(long j3) {
        long f02 = f0();
        if (f02 != j3) {
            if (f02 != -1) {
                if (f02 == -2) {
                    f02 = -2;
                } else {
                    return;
                }
            }
            StringBuilder u10 = a4.a.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(f02);
            throw new IOException(u10.toString());
        }
    }

    @Override
    public boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    public long f0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13371b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void g0(boolean z10) {
        ue0 ue0Var = (ue0) this.f13371b;
        ue0Var.getClass();
        te0 te0Var = ue0Var.f28467a;
        if (te0Var != null) {
            ((ms0) te0Var).a(z10);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public ce.b getData() {
        return ((k1.a0) this.f13371b).f13142c;
    }

    @Override
    public void h(int i10) {
        dq0 dq0Var = (dq0) this.f13371b;
        hq0 hq0Var = dq0Var.K;
        dq0Var.f23445s = i10;
        if (dq0Var.v != i10) {
            dq0Var.d.clear();
        }
        int i11 = dq0Var.J;
        if (dq0Var.h() == 0 && !dq0Var.e.e() && !dq0Var.I) {
            hq0Var.Q.e(false, true);
        } else {
            hq0Var.f24803x0.b(i11);
        }
        dq0Var.l();
        int i12 = hq0.f24772a1;
        hq0Var.K0(true);
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public void k0() {
        te0 te0Var = ((ue0) this.f13371b).f28467a;
        if (te0Var != null) {
            PhotoViewer photoViewer = ((ms0) te0Var).f35384a;
            if (photoViewer.f30892c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override
    public void l0(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override
    public m2.j m(long j3) {
        return (m2.j) this.f13371b;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public k4.d n(y2.j r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.u.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.f13371b;
        if (i10 == 0) {
            long j11 = pVar.f46252a;
            tVar = new u2.t(pVar.f46253b);
        } else {
            long j12 = pVar.f46252a;
            Uri uri = pVar.d.f9335c;
            tVar = new u2.t(j10);
        }
        gVar.f13820q.s(tVar, pVar.f46254c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override
    public void onDismiss() {
        b1 b1Var = (b1) this.f13371b;
        b1Var.z("scan_qr_popup_closed", null);
        b1Var.f38640h0 = false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        hk0 hk0Var = (hk0) this.f13371b;
        if (z10 && hk0Var.f24711n.n() >= 0) {
            hk0Var.f24714w = true;
        }
        fg0 fg0Var = hk0Var.f24710f;
        ac0 ac0Var = hk0Var.f24715x;
        fg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(ac0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(ac0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p() {
        ((FfmpegAudioRenderer) this.f13371b).f2649f0 = true;
    }

    @Override
    public void q(y2.j jVar, long j3, long j10) {
        int size;
        int i10;
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.f13371b;
        long j12 = pVar.f46252a;
        Uri uri = pVar.d.f9335c;
        u2.t tVar = new u2.t(j10);
        gVar.f13816m.getClass();
        gVar.f13820q.p(tVar, pVar.f46254c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) pVar.f46255f;
        m2.c cVar2 = gVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f14390m.size();
        }
        long j13 = cVar.b(0).f14407b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).f14407b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f14390m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                    }
                } else {
                    i10 = i11;
                }
                gVar.M = 0;
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.f13816m.L3(pVar.f46254c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * 1000, 5000));
                return;
            }
            gVar.C = new IOException();
            return;
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j3 - j10;
        gVar.K = j3;
        gVar.O += i10;
        synchronized (gVar.f13823t) {
            try {
                if (pVar.f46253b.f9363a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.f14388k;
                    if (uri2 == null) {
                        uri2 = x8.a(pVar.d.f9335c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (cVar3.d && gVar.L == j11) {
            lf.g gVar2 = cVar3.f14386i;
            if (gVar2 != null) {
                String str = gVar2.f14006b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                gVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                gVar.v();
                                return;
                            }
                        }
                        gVar.z(gVar2, new ob.a(12));
                        return;
                    }
                    gVar.z(gVar2, new Object());
                    return;
                }
                try {
                    gVar.L = e2.d0.T(gVar2.f14007c) - gVar.K;
                    gVar.y(true);
                    return;
                } catch (s0 e) {
                    gVar.x(e);
                    return;
                }
            }
            gVar.v();
            return;
        }
        gVar.y(true);
    }

    @Override
    public void s(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f13371b).f13704f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void t(l.k kVar) {
        ka.c cVar = ((ActionMenuView) this.f13371b).K;
        if (cVar != null) {
            cVar.t(kVar);
        }
    }

    public String toString() {
        switch (this.f13370a) {
            case 17:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f13371b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public int u() {
        return ((o0) this.f13371b).D();
    }

    @Override
    public long v(long j3, long j10) {
        return 0L;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public int x() {
        o0 o0Var = (o0) this.f13371b;
        return o0Var.f42728m - o0Var.E();
    }

    @Override
    public void y(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371b).I;
        Handler handler = (Handler) yVar.f14969b;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void z() {
        te0 te0Var = ((ue0) this.f13371b).f28467a;
        if (te0Var != null) {
            ((ms0) te0Var).f35384a.f30908e0.invalidate();
        }
    }

    public u(s6.g gVar, s6.a aVar) {
        this.f13370a = 25;
        this.f13371b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public u(int i10) {
        this.f13370a = i10;
        switch (i10) {
            case 23:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f13371b = new ah0(this);
                    return;
                } else {
                    this.f13371b = new ah0(this);
                    return;
                }
            case 27:
                return;
            case 29:
                this.f13371b = new CopyOnWriteArrayList();
                return;
            default:
                this.f13371b = new ArrayDeque(16);
                return;
        }
    }

    public u(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f13370a = 20;
        this.f13371b = new GestureDetector(context, onGestureListener, null);
    }

    public u(Context context, n4.y yVar) {
        this.f13370a = 7;
        n4.x xVar = ((n4.r) yVar.f14969b).f14952c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13371b = new n4.j(context, xVar);
        } else {
            this.f13371b = new n4.j(context, xVar);
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void a() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void l() {
    }

    @Override
    public void r() {
    }

    @Override
    public void Q(ArrayList arrayList) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public long c(long j3, long j10) {
        return j10;
    }

    @Override
    public void onError(f71 f71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
