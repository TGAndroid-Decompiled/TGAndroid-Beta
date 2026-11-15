package hi;

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
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.du;
import org.telegram.messenger.eu;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.iv;
import org.telegram.messenger.ns;
import org.telegram.messenger.t10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an;
import org.telegram.ui.y51;
public final class l0 implements og.n, tg.c, s51, OnCompleteListener, com.google.android.gms.common.api.internal.q, ii, c4.m, li.j0, l.i, n2.v, o0.a, b3.j, mm0, org.telegram.ui.Components.r4, oi.g0, org.telegram.messenger.za, ue.a, pm0 {
    public final int f14543a;
    public Object f14544b;

    public l0(Object obj, int i7) {
        this.f14543a = i7;
        this.f14544b = obj;
    }

    public boolean A() {
        return ((org.telegram.messenger.h0) this.f14544b).f24006c;
    }

    public m1.e1 B() {
        ce.w wVar = (ce.w) this.f14544b;
        wVar.getClass();
        Object obj = ce.w.f4979e.get(wVar);
        if (obj == de.g.f8066a) {
            obj = null;
        }
        return (m1.e1) obj;
    }

    @Override
    public void C() {
        int i7 = this.f14543a;
    }

    @Override
    public org.telegram.ui.Cells.h9 E() {
        oi.j3 j3Var = ((oi.p4) this.f14544b).O;
        if (j3Var != null) {
            return j3Var.f21757a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void E0() {
        eu euVar = (eu) this.f14544b;
        eu.j0(euVar, null);
        euVar.f23365b0 = null;
    }

    @Override
    public void F() {
        ((n0) this.f14544b).f14722e.invalidate();
    }

    @Override
    public void G() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f14544b;
        synchronized (ffmpegAudioRenderer.f18888a) {
            sVar = ffmpegAudioRenderer.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public void I() {
        boolean z10;
        li.r rVar = (li.r) this.f14544b;
        te.a aVar = rVar.f19624a;
        li.k0 k0Var = rVar.f19632w;
        if (k0Var.f19602n && k0Var.f19600l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        rVar.d.f39895g3.O(true);
    }

    @Override
    public void J(CharSequence charSequence) {
        oi.j3 j3Var = ((oi.p4) this.f14544b).O;
        if (j3Var != null) {
            j3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                j3Var.f21757a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void K(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        boolean z10;
        g2.b a10;
        boolean z11;
        h2.x xVar = (h2.x) this.f14544b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            a8.ja.e("Incomplete Mp4Webvtt Top Level box header found.", z10);
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
                    a8.ja.e("Incomplete vtt cue box header found.", z11);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = xVar.f13521a;
                    int i13 = xVar.f13522b;
                    String str = h2.l0.f13471a;
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
                    aVar.f12766a = charSequence;
                    aVar.f12767b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = l4.h.f19299a;
                    l4.g gVar2 = new l4.g();
                    gVar2.f19292c = charSequence;
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
    public void L(int i7, int i10, boolean z10) {
        ((oi.z1) this.f14544b).x0(i7, i10, z10);
    }

    @Override
    public org.telegram.ui.Cells.g9 N() {
        return (oi.p4) this.f14544b;
    }

    @Override
    public void O(float f10, float f11) {
        iv ivVar;
        org.telegram.ui.Cells.l1 l1Var;
        eu euVar = (eu) this.f14544b;
        du duVar = euVar.f23365b0;
        if (duVar != null && (l1Var = (ivVar = euVar.f22933a).F) != null) {
            l1Var.k1(ivVar.E, duVar.f23136c);
        }
    }

    @Override
    public oi.a P() {
        return ((oi.p4) this.f14544b).f22106a;
    }

    @Override
    public int Q() {
        return 2;
    }

    @Override
    public boolean Q0(float f10, float f11) {
        eu euVar = (eu) this.f14544b;
        du i02 = eu.i0(euVar, f10, f11);
        i02 = (i02 == null || i02.f23135b) ? null : null;
        euVar.f23365b0 = i02;
        if (i02 != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean R() {
        oi.p4 p4Var = (oi.p4) this.f14544b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.f22106a;
            if (j3Var.f21757a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void T(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((FfmpegAudioRenderer) this.f14544b).J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    public JSONObject U() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f14544b;
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

    @Override
    public void V(int i7, int i10) {
        oi.p4 p4Var = (oi.p4) this.f14544b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.f22106a;
            oi.d2 d2Var = j3Var.f21757a.R3;
            if (d2Var != null) {
                d2Var.f(i7, i10);
            }
        }
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public void W() {
        ((FfmpegAudioRenderer) this.f14544b).f2596a0 = true;
    }

    public void X(m1.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: hi.l0.X(m1.e1):void");
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        eu euVar = (eu) this.f14544b;
        if (euVar.f23365b0 != null) {
            du i02 = eu.i0(euVar, f10, f11);
            du duVar = euVar.f23365b0;
            if (i02 == duVar) {
                iv ivVar = euVar.f22933a;
                org.telegram.ui.Cells.l1 l1Var = ivVar.F;
                if (l1Var != null) {
                    l1Var.I1(ivVar.E, duVar.f23136c);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void a(int i7) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f14544b).J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new ai.v0(aVar, i7, 15));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        k7.f fVar = new k7.f(1, (TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
        gVar.f5920c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i7 = t7.a.f57044a;
        obtain.writeStrongBinder(fVar);
        t7.a.b(obtain, (GetCredentialRequest) this.f14544b);
        t7.a.b(obtain, gVar);
        ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 1);
    }

    @Override
    public void b(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f14544b;
        ffmpegAudioRenderer.f2603h0 = true;
        k8.a aVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new di.x2(aVar, j3, 13));
        }
    }

    @Override
    public void c(boolean z10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f14544b).J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new ai.q(13, aVar, z10));
        }
    }

    @Override
    public void c0() {
        oi.p4 p4Var = (oi.p4) this.f14544b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.f22106a;
            oi.q3 q3Var = j3Var.f21757a;
            oi.d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.f21931p3.onContentChanged();
        }
    }

    @Override
    public void close() {
        switch (this.f14543a) {
            case 9:
                ((li.r) this.f14544b).finishFragment();
                return;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14544b;
                if (contentProviderClient != null) {
                    if (contentProviderClient instanceof AutoCloseable) {
                        contentProviderClient.close();
                        return;
                    } else if (contentProviderClient instanceof ExecutorService) {
                        com.google.android.gms.internal.cast.f4.e((ExecutorService) contentProviderClient);
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
    public void d(oi.e1 e1Var) {
        oi.j3 j3Var = ((oi.p4) this.f14544b).O;
        if (j3Var != null) {
            oi.q3 q3Var = j3Var.f21757a;
            oi.q3.Q1(q3Var, e1Var);
            q3Var.f21931p3.b(e1Var, true);
        }
    }

    @Override
    public void d0(vg vgVar) {
        ns.f(kg.n.f0((kg.n) this.f14544b)).d(vgVar);
    }

    @Override
    public void e(float f10) {
        oi.w wVar = (oi.w) this.f14544b;
        gj gjVar = wVar.Q;
        if (gjVar == null) {
            return;
        }
        gjVar.f23777b0 = f10;
        MediaController.B().i0(wVar.Q, f10);
    }

    @Override
    public void f(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f14544b).J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override
    public void g(float f10) {
        gj gjVar = ((oi.w) this.f14544b).Q;
        if (gjVar == null) {
            return;
        }
        gjVar.f23777b0 = f10;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        t10 t10Var;
        switch (this.f14543a) {
            case 27:
                return " ";
            case 28:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f14544b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(s7Var.f31425s)) {
                        sb2.append(s7Var.f31425s);
                    }
                    org.telegram.ui.Cells.r7 r7Var = s7Var.f31424r;
                    if (r7Var != null && (t10Var = r7Var.f31359e) != null) {
                        CharSequence charSequence = (CharSequence) t10Var.d(0, Integer.valueOf(s7Var.f31422f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) s7Var.f31424r.f31359e.d(-1, Integer.valueOf(s7Var.f31424r.b()));
                        CharSequence charSequence3 = (CharSequence) s7Var.f31424r.f31359e.d(1, Integer.valueOf(s7Var.f31424r.a()));
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
                    org.telegram.messenger.a8.g(th2, true);
                    return s7Var.f31425s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) this.f14544b;
                sb3.append(hd.G(y7Var.f41927x2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(hd.G(y7Var.f41927x2 % 60, "Seconds", new Object[0]));
                String sb4 = sb3.toString();
                return hd.a0("AccDescrPlayerDuration", null, 2131754806, sb4, hd.G(y7Var.f41929y2 / 60, "Minutes", new Object[0]) + ' ' + hd.G(y7Var.f41929y2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public void h() {
        oi.p4 p4Var = (oi.p4) this.f14544b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.q3.T1(j3Var.f21757a, p4Var.f22106a);
        }
    }

    @Override
    public void i(l.k kVar) {
        switch (this.f14543a) {
            case 10:
                l0 l0Var = ((ActionMenuView) this.f14544b).L;
                if (l0Var != null) {
                    l0Var.i(kVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f14544b;
                m.h hVar = toolbar.f1917a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f1918a0.f48977c).iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.b0) it.next()).f2326a.t();
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void j() {
        u9 u9Var = (u9) this.f14544b;
        u9Var.A0(null, true);
        if (u9Var.f14696w0) {
            sa saVar = u9Var.f15200k2;
            saVar.f15048d1.f14623f.d();
            saVar.k0(-1, false, true);
            u9Var.f14696w0 = false;
        }
        u9Var.L0(false);
    }

    @Override
    public b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.f14544b;
        long j11 = rVar.f2919a;
        j2.m mVar = rVar.f2920b;
        j2.b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        int i10 = rVar.f2921c;
        hVar.f21265m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16791a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.o.f2915f;
        } else {
            iVar = new b3.i(0, min, false);
        }
        hVar.f21269q.q(tVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public boolean k0() {
        return true;
    }

    @Override
    public void l(boolean z10, float f10) {
        int[] iArr;
        int round;
        switch (this.f14543a) {
            case 27:
                y51 y51Var = (y51) ((org.telegram.ui.Cells.i0) this.f14544b);
                int i7 = (int) (org.telegram.ui.ActionBar.j6.f29082q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                org.telegram.ui.ActionBar.j6.f29082q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = y51Var.f53429f.f46038e;
                    cj0 cj0Var = (cj0) themeActivity.f43386b.K(themeActivity.f43395g0);
                    if (cj0Var != null) {
                        ((org.telegram.ui.Cells.y8) cj0Var.f58535a).setText(hd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.f29082q * 100.0f))));
                    }
                    org.telegram.ui.ActionBar.j6.F(true);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f14544b;
                org.telegram.ui.Cells.r7 r7Var = s7Var.f31424r;
                if (r7Var != null && s7Var.f31423n != null) {
                    if (r7Var.f31358c != null) {
                        double length = f10 * (iArr.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), s7Var.f31424r.f31358c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), s7Var.f31424r.f31358c.length - 1, 0);
                        int[] iArr2 = s7Var.f31424r.f31358c;
                        round = Math.round(org.telegram.messenger.g0.W1(Math.round(((float) (length - Math.floor(length))) * s7Var.f31424r.d) / s7Var.f31424r.d, iArr2[j3], iArr2[j10]));
                    } else {
                        round = Math.round(((s7Var.f31424r.a() - s7Var.f31424r.b()) * f10) + r7Var.b());
                    }
                    int i11 = s7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = s7Var.f31422f;
                    if (i12 != round) {
                        if (s7Var.c(i12) != s7Var.c(round)) {
                            org.telegram.messenger.g0.b4(s7Var.f31421e);
                        }
                        s7Var.f31422f = round;
                        s7Var.e(round, true);
                        z10 z10Var = s7Var.f31423n;
                        if (z10Var != null) {
                            z10Var.a(Integer.valueOf(s7Var.f31422f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().f22377v0, f10);
                }
                gj gjVar = MediaController.B().f22377v0;
                if (gjVar != null && gjVar.I3()) {
                    ((org.telegram.ui.Components.y7) this.f14544b).b1(gjVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean l1() {
        return true;
    }

    @Override
    public void m(b3.l lVar, long j3, long j10, boolean z10) {
        ((o2.h) this.f14544b).x((b3.r) lVar, j3, j10);
    }

    @Override
    public boolean o(l.k kVar, MenuItem menuItem) {
        switch (this.f14543a) {
            case 10:
                m.k kVar2 = ((ActionMenuView) this.f14544b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ia.d) kVar2).f15881b).f1918a0.f48977c).iterator();
                    while (it.hasNext()) {
                        if (((androidx.fragment.app.b0) it.next()).f2326a.p()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f14544b).getClass();
                return false;
        }
    }

    @Override
    public void onComplete(Task task) {
        zd.m mVar = (zd.m) this.f14544b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(af.b.b(exception));
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        x5 x5Var = (x5) this.f14544b;
        v5 v5Var = x5Var.N;
        u51 u51Var = x5Var.f15371y;
        if (u51Var == null) {
            return;
        }
        if (u51Var.d0()) {
            org.telegram.messenger.g0.h3(v5Var);
        } else {
            org.telegram.messenger.g0.r(v5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        tg.r1 r1Var = ((x5) this.f14544b).f15369x;
        if (r1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(r1Var.f57545z0 - f11) >= 1.0E-4f) {
                r1Var.f57545z0 = f11;
                r1Var.requestLayout();
            }
        }
    }

    @Override
    public Cursor p(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14544b;
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
    public int p0() {
        switch (this.f14543a) {
            case 27:
                return 0;
            case 28:
                org.telegram.ui.Cells.r7 r7Var = ((org.telegram.ui.Cells.s7) this.f14544b).f31424r;
                if (r7Var == null) {
                    return 0;
                }
                int[] iArr = r7Var.f31358c;
                if (iArr != null) {
                    return r7Var.d * (iArr.length - 1);
                }
                return r7Var.a() - r7Var.b();
            default:
                return 0;
        }
    }

    @Override
    public void q() {
        ((FfmpegAudioRenderer) this.f14544b).f2602g0 = true;
    }

    @Override
    public void r(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.f14544b;
        if (i7 == 0) {
            long j11 = rVar.f2919a;
            tVar = new x2.t(rVar.f2920b, j3);
        } else {
            long j12 = rVar.f2919a;
            j2.m mVar = rVar.f2920b;
            j2.b0 b0Var = rVar.d;
            tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        hVar.f21269q.s(tVar, rVar.f2921c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public void s(float f10, float f11) {
        eu euVar = (eu) this.f14544b;
        du i02 = eu.i0(euVar, f10, f11);
        du duVar = euVar.f23365b0;
        if (i02 != duVar) {
            duVar = null;
        }
        eu.j0(euVar, duVar);
    }

    @Override
    public void s0() {
        eu euVar = (eu) this.f14544b;
        eu.j0(euVar, euVar.f23365b0);
    }

    @Override
    public void u(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f14544b).J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override
    public void u0() {
        oi.p4 p4Var = (oi.p4) this.f14544b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.f22106a;
            oi.q3.S1(j3Var.f21757a);
        }
    }

    @Override
    public void w(b3.l lVar, long j3, long j10) {
        int size;
        long j11;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.f14544b;
        long j12 = rVar.f2919a;
        j2.m mVar = rVar.f2920b;
        j2.b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        hVar.f21265m.getClass();
        hVar.f21269q.o(tVar, rVar.f2921c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) rVar.f2923f;
        p2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f54525m.size();
        }
        long j13 = cVar.b(0).f54544b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).f54544b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.f54525m.size()) {
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
            if (i10 < hVar.f21265m.R4(rVar.f2921c)) {
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
        synchronized (hVar.f21272t) {
            try {
                if (rVar.f2920b.f16803a.equals(hVar.E)) {
                    Uri uri = hVar.G.f54523k;
                    if (uri == null) {
                        uri = a8.g7.a(rVar.d.f16771c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j11) {
            f5.a aVar = cVar3.f54521i;
            if (aVar != null) {
                String str = aVar.f10925b;
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
                    hVar.K = h2.l0.V(aVar.f10926c) - hVar.J;
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

    @Override
    public void w0(long j3, int i7, long j10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.f14544b).J;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override
    public c4.d x(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    @Override
    public void y(long j3) {
        ((li.r) this.f14544b).presentFragment(an.ua(j3));
    }

    @Override
    public tg.j z() {
        return ((u9) this.f14544b).f14690t0;
    }

    public l0(ga.d dVar) {
        this.f14543a = 3;
        this.f14544b = new File((File) dVar.d, "com.crashlytics.settings.json");
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public l0(int i7) {
        this.f14543a = i7;
        switch (i7) {
            case 12:
                this.f14544b = new ce.w(m1.f1.f19971b);
                return;
            case 24:
                return;
            default:
                this.f14544b = new h2.x();
                return;
        }
    }

    public l0(String str, long j3) {
        this.f14543a = 22;
        this.f14544b = new org.telegram.messenger.l0(str, j3);
    }

    public l0(String str, Set set) {
        this.f14543a = 23;
        this.f14544b = new org.telegram.messenger.o0(str, set);
    }

    public l0(Context context, Uri uri) {
        this.f14543a = 15;
        this.f14544b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public l0(String str, boolean z10) {
        this.f14543a = 21;
        this.f14544b = new org.telegram.messenger.h0(str, z10);
    }

    @Override
    public void M(boolean z10) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void m0(boolean z10) {
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

    private final void D() {
    }

    private final void H() {
    }

    private final void S() {
    }

    @Override
    public void D0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void n0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void t() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
    }

    @Override
    public void e1(View view, float f10, float f11) {
    }

    @Override
    public void n(View view, float f10, float f11) {
    }

    @Override
    public void v(View view, float f10, float f11) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
