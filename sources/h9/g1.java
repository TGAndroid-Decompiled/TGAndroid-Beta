package h9;

import a8.h7;
import a8.ma;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.e4;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.t5;
import hi.ta;
import hi.u5;
import hi.v9;
import hi.w5;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import oi.l3;
import oi.r4;
import oi.s3;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bu;
import org.telegram.messenger.cu;
import org.telegram.messenger.fv;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.s10;
import org.telegram.messenger.y10;
import org.telegram.messenger.za;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c61;
public final class g1 implements h1, og.n, tg.c, g61, com.google.android.gms.common.api.internal.q, si, c4.m, li.j0, l.i, n2.v, o0.a, b3.k, wm0, a5, oi.g0, za, ue.a, zm0 {
    public final int f13992a;
    public Object f13993b;

    public g1(Object obj, int i7) {
        this.f13992a = i7;
        this.f13993b = obj;
    }

    @Override
    public void A(long j3) {
        ((li.s) this.f13993b).presentFragment(bn.ua(j3));
    }

    @Override
    public tg.j B() {
        return ((v9) this.f13993b).f14916t0;
    }

    @Override
    public void C() {
        int i7 = this.f13992a;
    }

    public m1.e1 E() {
        ce.w wVar = (ce.w) this.f13993b;
        wVar.getClass();
        Object obj = ce.w.f5260e.get(wVar);
        if (obj == de.g.f8343a) {
            obj = null;
        }
        return (m1.e1) obj;
    }

    @Override
    public void E0() {
        cu cuVar = (cu) this.f13993b;
        cu.j0(cuVar, null);
        cuVar.f23337b0 = null;
    }

    @Override
    public void F() {
        boolean z10;
        li.s sVar = (li.s) this.f13993b;
        te.a aVar = sVar.f19988a;
        li.k0 k0Var = sVar.f19996w;
        if (k0Var.f19956n && k0Var.f19954l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        sVar.d.f35742g3.O(true);
    }

    public JSONObject K() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f13993b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(aa.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        aa.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    aa.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void L(m1.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: h9.g1.L(m1.e1):void");
    }

    @Override
    public void M(float f10, float f11) {
        fv fvVar;
        org.telegram.ui.Cells.m1 m1Var;
        cu cuVar = (cu) this.f13993b;
        bu buVar = cuVar.f23337b0;
        if (buVar != null && (m1Var = (fvVar = cuVar.f22932a).F) != null) {
            m1Var.k1(fvVar.E, buVar.f23127c);
        }
    }

    @Override
    public void M0() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13993b;
        synchronized (ffmpegAudioRenderer.f19249a) {
            sVar = ffmpegAudioRenderer.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f13992a) {
            case 18:
                ((oi.a2) this.f13993b).x0(i7, i10, z10);
                return;
            default:
                ((hd) this.f13993b).a(Boolean.valueOf(z10), Integer.valueOf(i7), Integer.valueOf(i10));
                return;
        }
    }

    @Override
    public j9 P0() {
        l3 l3Var = ((r4) this.f13993b).O;
        if (l3Var != null) {
            return l3Var.f22176a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void Q() {
        ((FfmpegAudioRenderer) this.f13993b).f2567g0 = true;
    }

    @Override
    public boolean Q0(float f10, float f11) {
        cu cuVar = (cu) this.f13993b;
        bu i02 = cu.i0(cuVar, f10, f11);
        i02 = (i02 == null || i02.f23126b) ? null : null;
        cuVar.f23337b0 = i02;
        if (i02 != null) {
            return true;
        }
        return false;
    }

    @Override
    public void S0(CharSequence charSequence) {
        l3 l3Var = ((r4) this.f13993b).O;
        if (l3Var != null) {
            l3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                l3Var.f22176a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public void W1(long j3, int i7, long j10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f13993b).J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override
    public void Y0(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((FfmpegAudioRenderer) this.f13993b).J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        cu cuVar = (cu) this.f13993b;
        if (cuVar.f23337b0 != null) {
            bu i02 = cu.i0(cuVar, f10, f11);
            bu buVar = cuVar.f23337b0;
            if (i02 == buVar) {
                fv fvVar = cuVar.f22932a;
                org.telegram.ui.Cells.m1 m1Var = fvVar.F;
                if (m1Var != null) {
                    m1Var.I1(fvVar.E, buVar.f23127c);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void a(float f10) {
        oi.w wVar = (oi.w) this.f13993b;
        gj gjVar = wVar.Q;
        if (gjVar == null) {
            return;
        }
        gjVar.f24137b0 = f10;
        MediaController.B().i0(wVar.Q, f10);
    }

    @Override
    public i9 a1() {
        return (r4) this.f13993b;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        k7.f fVar = new k7.f(1, (TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
        gVar.f6198c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i7 = t7.a.f57628a;
        obtain.writeStrongBinder(fVar);
        t7.a.b(obtain, (GetCredentialRequest) this.f13993b);
        t7.a.b(obtain, gVar);
        ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 1);
    }

    @Override
    public void b(l.k kVar) {
        switch (this.f13992a) {
            case 10:
                g1 g1Var = ((ActionMenuView) this.f13993b).L;
                if (g1Var != null) {
                    g1Var.b(kVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f13993b;
                m.h hVar = toolbar.f1886a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f1887a0.f49831c).iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.b0) it.next()).f2291a.t();
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b0(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f13993b).J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13993b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public oi.a c1() {
        return ((r4) this.f13993b).f22468a;
    }

    @Override
    public void close() {
        switch (this.f13992a) {
            case 9:
                ((li.s) this.f13993b).finishFragment();
                return;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13993b;
                if (contentProviderClient != null) {
                    if (contentProviderClient instanceof AutoCloseable) {
                        contentProviderClient.close();
                        return;
                    } else if (contentProviderClient instanceof ExecutorService) {
                        f4.e((ExecutorService) contentProviderClient);
                        return;
                    } else {
                        contentProviderClient.release();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void d(int i7) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f13993b).J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new ai.t0(aVar, i7, 20));
        }
    }

    @Override
    public void e(oi.e1 e1Var) {
        l3 l3Var = ((r4) this.f13993b).O;
        if (l3Var != null) {
            s3 s3Var = l3Var.f22176a;
            s3.Q1(s3Var, e1Var);
            s3Var.f22365p3.k(e1Var, true);
        }
    }

    @Override
    public void f(boolean z10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f13993b).J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new ch.k(12, aVar, z10));
        }
    }

    @Override
    public void f0(gh ghVar) {
        ls.f(kg.n.f0((kg.n) this.f13993b)).d(ghVar);
    }

    @Override
    public void g(float f10) {
        gj gjVar = ((oi.w) this.f13993b).Q;
        if (gjVar == null) {
            return;
        }
        gjVar.f24137b0 = f10;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1() {
        r4 r4Var = (r4) this.f13993b;
        l3 l3Var = r4Var.O;
        if (l3Var != null) {
            oi.a aVar = r4Var.f22468a;
            if (l3Var.f22176a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        s10 s10Var;
        switch (this.f13992a) {
            case 26:
                return " ";
            case 27:
                u7 u7Var = (u7) this.f13993b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(u7Var.f32033s)) {
                        sb2.append(u7Var.f32033s);
                    }
                    t7 t7Var = u7Var.f32032r;
                    if (t7Var != null && (s10Var = t7Var.f31845e) != null) {
                        CharSequence charSequence = (CharSequence) s10Var.g(0, Integer.valueOf(u7Var.f32030f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) u7Var.f32032r.f31845e.g(-1, Integer.valueOf(u7Var.f32032r.b()));
                        CharSequence charSequence3 = (CharSequence) u7Var.f32032r.f31845e.g(1, Integer.valueOf(u7Var.f32032r.a()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence2);
                            sb2.append(" – ");
                            sb2.append(charSequence3);
                        }
                    }
                    if (sb2.length() <= 0) {
                        return null;
                    }
                    return sb2.toString();
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return u7Var.f32033s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                f8 f8Var = (f8) this.f13993b;
                sb3.append(org.telegram.messenger.hd.G(f8Var.f35119x2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(org.telegram.messenger.hd.G(f8Var.f35119x2 % 60, "Seconds", new Object[0]));
                String sb4 = sb3.toString();
                return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754805, sb4, org.telegram.messenger.hd.G(f8Var.f35121y2 / 60, "Minutes", new Object[0]) + ' ' + org.telegram.messenger.hd.G(f8Var.f35121y2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean h(l.k kVar, MenuItem menuItem) {
        switch (this.f13992a) {
            case 10:
                m.k kVar2 = ((ActionMenuView) this.f13993b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((u5) kVar2).f15495b).f1887a0.f49831c).iterator();
                    while (it.hasNext()) {
                        if (((androidx.fragment.app.b0) it.next()).f2291a.p()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f13993b).getClass();
                return false;
        }
    }

    @Override
    public void i() {
        v9 v9Var = (v9) this.f13993b;
        v9Var.A0(null, true);
        if (v9Var.f14922w0) {
            ta taVar = v9Var.f15569k2;
            taVar.f15400d1.f14971f.d();
            taVar.k0(-1, false, true);
            v9Var.f14922w0 = false;
        }
        v9Var.L0(false);
    }

    @Override
    public void j(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13993b;
        ffmpegAudioRenderer.f2568h0 = true;
        k8.a aVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new e4(aVar, j3, 14));
        }
    }

    @Override
    public void k(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f13993b).J;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override
    public void k2() {
        r4 r4Var = (r4) this.f13993b;
        l3 l3Var = r4Var.O;
        if (l3Var != null) {
            oi.a aVar = r4Var.f22468a;
            s3.S1(l3Var.f22176a);
        }
    }

    @Override
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.f13993b;
        long j11 = sVar.f2887a;
        j2.m mVar2 = sVar.f2888b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        int i10 = sVar.f2889c;
        hVar.f21623m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17167a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.p.f2883f;
        } else {
            iVar = new b3.i(0, min, false);
        }
        hVar.f21627q.r(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public void l1(int i7, int i10) {
        r4 r4Var = (r4) this.f13993b;
        l3 l3Var = r4Var.O;
        if (l3Var != null) {
            oi.a aVar = r4Var.f22468a;
            oi.e2 e2Var = l3Var.f22176a.R3;
            if (e2Var != null) {
                e2Var.f(i7, i10);
            }
        }
    }

    @Override
    public Object m(Object obj, Object obj2) {
        return ((g9.k) this.f13993b).apply(obj2);
    }

    @Override
    public boolean m0() {
        return true;
    }

    @Override
    public boolean m1() {
        return true;
    }

    @Override
    public void n(boolean z10, float f10) {
        int[] iArr;
        int round;
        switch (this.f13992a) {
            case 26:
                c61 c61Var = (c61) ((org.telegram.ui.Cells.j0) this.f13993b);
                int i7 = (int) (m6.f29580q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                m6.f29580q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = c61Var.f46455f.f47933e;
                    mj0 mj0Var = (mj0) themeActivity.f43842b.K(themeActivity.f43851g0);
                    if (mj0Var != null) {
                        ((a9) mj0Var.f59111a).setText(org.telegram.messenger.hd.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (m6.f29580q * 100.0f))));
                    }
                    m6.F(true);
                    return;
                }
                return;
            case 27:
                u7 u7Var = (u7) this.f13993b;
                t7 t7Var = u7Var.f32032r;
                if (t7Var != null && u7Var.f32031n != null) {
                    if (t7Var.f31844c != null) {
                        double length = f10 * (iArr.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), u7Var.f32032r.f31844c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), u7Var.f32032r.f31844c.length - 1, 0);
                        int[] iArr2 = u7Var.f32032r.f31844c;
                        round = Math.round(org.telegram.messenger.g0.W1(Math.round(((float) (length - Math.floor(length))) * u7Var.f32032r.d) / u7Var.f32032r.d, iArr2[j3], iArr2[j10]));
                    } else {
                        round = Math.round(((u7Var.f32032r.a() - u7Var.f32032r.b()) * f10) + t7Var.b());
                    }
                    int i11 = u7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = u7Var.f32030f;
                    if (i12 != round) {
                        if (u7Var.c(i12) != u7Var.c(round)) {
                            org.telegram.messenger.g0.a4(u7Var.f32029e);
                        }
                        u7Var.f32030f = round;
                        u7Var.e(round, true);
                        y10 y10Var = u7Var.f32031n;
                        if (y10Var != null) {
                            y10Var.a(Integer.valueOf(u7Var.f32030f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().f22735v0, f10);
                }
                gj gjVar = MediaController.B().f22735v0;
                if (gjVar != null && gjVar.I3()) {
                    ((f8) this.f13993b).c1(gjVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public void o1() {
        ((FfmpegAudioRenderer) this.f13993b).f2561a0 = true;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        w5 w5Var = (w5) this.f13993b;
        t5 t5Var = w5Var.N;
        i61 i61Var = w5Var.f15627y;
        if (i61Var == null) {
            return;
        }
        if (i61Var.d0()) {
            org.telegram.messenger.g0.g3(t5Var);
        } else {
            org.telegram.messenger.g0.r(t5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        tg.t1 t1Var = ((w5) this.f13993b).f15625x;
        if (t1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(t1Var.f58150z0 - f11) >= 1.0E-4f) {
                t1Var.f58150z0 = f11;
                t1Var.requestLayout();
            }
        }
    }

    @Override
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
        ((o2.h) this.f13993b).x((b3.s) mVar, j3, j10);
    }

    @Override
    public c4.d q(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    @Override
    public void r() {
        ((hi.n0) this.f13993b).f15031e.invalidate();
    }

    @Override
    public int r0() {
        switch (this.f13992a) {
            case 26:
                return 0;
            case 27:
                t7 t7Var = ((u7) this.f13993b).f32032r;
                if (t7Var == null) {
                    return 0;
                }
                int[] iArr = t7Var.f31844c;
                if (iArr != null) {
                    return t7Var.d * (iArr.length - 1);
                }
                return t7Var.a() - t7Var.b();
            default:
                return 0;
        }
    }

    @Override
    public void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.f13993b;
        if (i7 == 0) {
            long j11 = sVar.f2887a;
            uVar = new x2.u(sVar.f2888b, j3);
        } else {
            long j12 = sVar.f2887a;
            j2.m mVar2 = sVar.f2888b;
            j2.b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        }
        hVar.f21627q.u(uVar, sVar.f2889c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public void t(float f10, float f11) {
        cu cuVar = (cu) this.f13993b;
        bu i02 = cu.i0(cuVar, f10, f11);
        bu buVar = cuVar.f23337b0;
        if (i02 != buVar) {
            buVar = null;
        }
        cu.j0(cuVar, buVar);
    }

    @Override
    public void t0() {
        cu cuVar = (cu) this.f13993b;
        cu.j0(cuVar, cuVar.f23337b0);
    }

    @Override
    public void u() {
        r4 r4Var = (r4) this.f13993b;
        l3 l3Var = r4Var.O;
        if (l3Var != null) {
            s3.T1(l3Var.f22176a, r4Var.f22468a);
        }
    }

    @Override
    public void u1() {
        r4 r4Var = (r4) this.f13993b;
        l3 l3Var = r4Var.O;
        if (l3Var != null) {
            oi.a aVar = r4Var.f22468a;
            s3 s3Var = l3Var.f22176a;
            oi.e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.g();
            }
            s3Var.f22365p3.onContentChanged();
        }
    }

    @Override
    public void v(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        boolean z10;
        g2.b a10;
        boolean z11;
        h2.x xVar = (h2.x) this.f13993b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.e("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                g2.a aVar = null;
                while (i11 > 0) {
                    if (i11 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ma.e("Incomplete vtt cue box header found.", z11);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = xVar.f13828a;
                    int i13 = xVar.f13829b;
                    String str = h2.l0.f13778a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    xVar.O(i12);
                    i11 = (i11 - 8) - i12;
                    if (m12 == 1937011815) {
                        l4.g gVar = new l4.g();
                        l4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = l4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f13075a = charSequence;
                    aVar.f13076b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = l4.h.f19660a;
                    l4.g gVar2 = new l4.g();
                    gVar2.f19653c = charSequence;
                    a10 = gVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public int y() {
        return 2;
    }

    @Override
    public void z(b3.m mVar, long j3, long j10) {
        int size;
        long j11;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.f13993b;
        long j12 = sVar.f2887a;
        j2.m mVar2 = sVar.f2888b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        hVar.f21623m.getClass();
        hVar.f21627q.p(uVar, sVar.f2889c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) sVar.f2891f;
        p2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f55104m.size();
        }
        long j13 = cVar.b(0).f55123b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).f55123b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.f55104m.size()) {
                h2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.M;
                j11 = -9223372036854775807L;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    h2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                } else {
                    hVar.L = 0;
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.f21623m.R4(sVar.f2889c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        j11 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j3 - j10;
        hVar.J = j3;
        hVar.N += i7;
        synchronized (hVar.f21630t) {
            try {
                if (sVar.f2888b.f17179a.equals(hVar.E)) {
                    Uri uri = hVar.G.f55102k;
                    if (uri == null) {
                        uri = h7.a(sVar.d.f17147c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j11) {
            f5.a aVar = cVar3.f55100i;
            if (aVar != null) {
                String str = aVar.f11239b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.w();
                                return;
                            }
                        }
                        hVar.A(aVar, new nb.a(16));
                        return;
                    }
                    hVar.A(aVar, new Object());
                    return;
                }
                try {
                    hVar.K = h2.l0.V(aVar.f11240c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (e2.t0 e10) {
                    hVar.y(e10);
                    return;
                }
            }
            hVar.w();
            return;
        }
        hVar.z(true);
    }

    public g1(ga.d dVar) {
        this.f13992a = 4;
        this.f13993b = new File((File) dVar.d, "com.crashlytics.settings.json");
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public g1(int i7) {
        this.f13992a = i7;
        switch (i7) {
            case 12:
                this.f13993b = new ce.w(m1.f1.f20332b);
                return;
            case 24:
                return;
            default:
                this.f13993b = new h2.x();
                return;
        }
    }

    public g1(String str, long j3) {
        this.f13992a = 22;
        this.f13993b = new org.telegram.messenger.l0(str, j3);
    }

    public g1(Context context, Uri uri) {
        this.f13992a = 15;
        this.f13993b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g1(String str, Set set) {
        this.f13992a = 23;
        this.f13993b = new org.telegram.messenger.o0(str, set);
    }

    public g1(String str, boolean z10) {
        this.f13992a = 21;
        this.f13993b = new org.telegram.messenger.h0(str, z10);
    }

    private final void H() {
    }

    private final void I() {
    }

    private final void J() {
    }

    @Override
    public void D1() {
    }

    @Override
    public void G() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void w(boolean z10) {
    }

    @Override
    public void onError(i61 i61Var, Exception exc) {
    }

    @Override
    public void e1(View view, float f10, float f11) {
    }

    @Override
    public void o(View view, float f10, float f11) {
    }

    @Override
    public void x(View view, float f10, float f11) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
