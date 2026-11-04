package gi;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import b8.cg;
import b8.zb;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cv;
import org.telegram.messenger.o10;
import org.telegram.messenger.u10;
import org.telegram.messenger.yt;
import org.telegram.messenger.zi;
import org.telegram.messenger.zt;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.om0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ew;
import org.telegram.ui.r51;
import org.telegram.ui.vf0;
public final class v5 implements k51, za, h6.a, com.google.android.gms.common.api.internal.p, b4.m, kg.u1, m.e2, zd.b, l.w, m.k, m2.x, mi.j0, org.telegram.ui.Components.r4, mi.g1, o0.b, p5.b, org.telegram.messenger.ma, org.telegram.messenger.ta, re.a, om0 {
    public final int f13687a;
    public Object f13688b;

    public v5(int i3) {
        this.f13687a = i3;
    }

    @Override
    public b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    @Override
    public void B1(Editable editable) {
        ((mi.f5) this.f13688b).g();
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public void D() {
        int i3 = this.f13687a;
    }

    @Override
    public boolean E(l.k kVar) {
        m.h hVar = (m.h) this.f13688b;
        if (kVar == hVar.f18594c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.f18595e;
        if (wVar == null) {
            return false;
        }
        return wVar.E(kVar);
    }

    @Override
    public void F(byte[] bArr, int i3, int i10, b4.l lVar, g2.k kVar) {
        boolean z10;
        f2.b a10;
        boolean z11;
        g2.y yVar = (g2.y) this.f13688b;
        yVar.L(i3 + i10, bArr);
        yVar.N(i3);
        ArrayList arrayList = new ArrayList();
        while (yVar.a() > 0) {
            if (yVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.e("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int m10 = yVar.m();
            if (yVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                f2.a aVar = null;
                while (i11 > 0) {
                    if (i11 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zb.e("Incomplete vtt cue box header found.", z11);
                    int m11 = yVar.m();
                    int m12 = yVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = yVar.f11923a;
                    int i13 = yVar.f11924b;
                    String str = g2.n0.f11873a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    yVar.O(i12);
                    i11 = (i11 - 8) - i12;
                    if (m12 == 1937011815) {
                        k4.g gVar = new k4.g();
                        k4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = k4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f11339a = charSequence;
                    aVar.f11340b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = k4.h.f16865a;
                    k4.g gVar2 = new k4.g();
                    gVar2.f16858c = charSequence;
                    a10 = gVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                yVar.O(m10 - 8);
            }
        }
        kVar.accept(new b4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void F1() {
        mi.x xVar = (mi.x) this.f13688b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.f20029a;
            mi.t3 t3Var = n3Var.f19761a;
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
        m2.v0 v0Var = (m2.v0) this.f13688b;
        synchronized (v0Var.f16443a) {
            nVar = v0Var.I;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public void H0() {
        zt ztVar = (zt) this.f13688b;
        zt.j0(ztVar, null);
        ztVar.f26974b0 = null;
    }

    @Override
    public void J(m2.t0 t0Var) {
        m2.t tVar = ((m2.v0) this.f13688b).f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 1));
        }
    }

    @Override
    public boolean J1(int i3) {
        if (i3 == ((bm0) this.f13688b).f16962e0) {
            return true;
        }
        return false;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        mi.c2 c2Var = (mi.c2) this.f13688b;
        c2Var.x0(i3, i10, z10);
        vf0 vf0Var = c2Var.P0;
        if (vf0Var != null) {
            vf0Var.h();
            c2Var.P0 = null;
        }
    }

    @Override
    public boolean M0(mi.h1 h1Var) {
        return false;
    }

    @Override
    public void N(Exception exc) {
        g2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        m2.t tVar = ((m2.v0) this.f13688b).f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new m2.p(tVar, exc, 1));
        }
    }

    @Override
    public void O(float f10, float f11) {
        cv cvVar;
        org.telegram.ui.Cells.l1 l1Var;
        zt ztVar = (zt) this.f13688b;
        yt ytVar = ztVar.f26974b0;
        if (ytVar != null && (l1Var = (cvVar = ztVar.f26434a).F) != null) {
            l1Var.d1(cvVar.E, ytVar.f26635c);
        }
    }

    @Override
    public org.telegram.ui.Cells.h9 O0() {
        mi.n3 n3Var = ((mi.x) this.f13688b).P;
        if (n3Var != null) {
            return n3Var.f19761a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void Q() {
        ((m2.v0) this.f13688b).k1 = true;
    }

    @Override
    public void S(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f13688b;
        Handler handler = eVar.f17397f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f17398n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (kVar == ((l.d) arrayList.get(i3)).f17391b) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i10 = i3 + 1;
        if (i10 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i10);
        }
        handler.postAtTime(new cg(this, dVar, mVar, kVar, false, 2), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public Cursor T0(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13688b;
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
    public Object U(zd.c cVar, hd.c cVar2) {
        Object U = ((w9.b) this.f13688b).U(new db.z0(cVar, 1), cVar2);
        if (U == gd.a.f12241a) {
            return U;
        }
        return dd.k.f8801a;
    }

    @Override
    public boolean U0(float f10, float f11) {
        zt ztVar = (zt) this.f13688b;
        yt i02 = zt.i0(ztVar, f10, f11);
        i02 = (i02 == null || i02.f26634b) ? null : null;
        ztVar.f26974b0 = i02;
        if (i02 != null) {
            return true;
        }
        return false;
    }

    @Override
    public void V0(mi.h1 h1Var) {
        mi.a aVar;
        mi.f5 f5Var = (mi.f5) this.f13688b;
        mi.d5 d5Var = f5Var.f19605s;
        if (d5Var != null && (aVar = f5Var.f20029a) != null) {
            mi.t3 t3Var = ((mi.a3) d5Var).f19458a;
            ArrayList arrayList = t3Var.f19924t3;
            long j10 = aVar.f19447t;
            if (j10 != 0) {
                int i3 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((mi.a) arrayList.get(i10)).f19438k.contains(Long.valueOf(j10))) {
                        i3 = i10;
                    }
                }
                if (i3 >= 0) {
                    mi.g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    mi.a aVar2 = new mi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f19438k;
                    ArrayList arrayList3 = aVar2.f19438k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a1.g.y(1, arrayList3);
                    }
                    arrayList.add(i3 + 1, aVar2);
                    t3Var.v4();
                    t3Var.f35594g3.O(false);
                    mi.g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var.post(new mi.n2(t3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void W0(CharSequence charSequence) {
        mi.n3 n3Var = ((mi.x) this.f13688b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                n3Var.f19761a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public boolean X1(boolean z10) {
        return false;
    }

    @Override
    public int Y() {
        return 2;
    }

    @Override
    public void Z() {
        k2.l0 l0Var = ((m2.v0) this.f13688b).Z;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        zt ztVar = (zt) this.f13688b;
        if (ztVar.f26974b0 != null) {
            yt i02 = zt.i0(ztVar, f10, f11);
            yt ytVar = ztVar.f26974b0;
            if (i02 == ytVar) {
                cv cvVar = ztVar.f26434a;
                org.telegram.ui.Cells.l1 l1Var = cvVar.F;
                if (l1Var != null) {
                    l1Var.x1(cvVar.E, ytVar.f26635c);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void a(int i3) {
        t2.j jVar;
        m2.v0 v0Var = (m2.v0) this.f13688b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.f19014d1) != null) {
            jVar.d(i3);
        }
        m2.t tVar = v0Var.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new cg.l0(tVar, i3, 14));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.f fVar = new j7.f(0, (TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
        gVar.f6590c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i3 = s7.a.f54671a;
        obtain.writeStrongBinder(fVar);
        s7.a.b(obtain, (i7.f) this.f13688b);
        s7.a.b(obtain, gVar);
        ((j7.b) ((j7.d) ((j7.e) obj).m())).H0(obtain, 6);
    }

    @Override
    public void b(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f17393z.k().c(false);
        }
        l.w wVar = ((m.h) this.f13688b).f18595e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override
    public void b2(ArrayList arrayList) {
        boolean z10;
        bm0 bm0Var = (bm0) this.f13688b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            bm0Var.K.add(((kg.t1) arrayList.get(i3)).f17197a);
        }
        ew ewVar = bm0Var.V;
        if (ewVar != null) {
            if (bm0Var.E0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ewVar.d(z10, false);
        }
        bm0Var.f();
    }

    @Override
    public boolean c0(mi.h1 h1Var) {
        return false;
    }

    @Override
    public void c2() {
        mi.x xVar = (mi.x) this.f13688b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.f20029a;
            mi.t3.S1(n3Var.f19761a);
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13688b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f13688b).f17397f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void e(boolean z10) {
        m2.t tVar = ((m2.v0) this.f13688b).f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new ci.e1(12, tVar, z10));
        }
    }

    @Override
    public void e0(long j10, int i3, long j11) {
        m2.t tVar = ((m2.v0) this.f13688b).f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new a3.b(tVar, i3, j10, j11, 1));
        }
    }

    @Override
    public org.telegram.ui.Cells.g9 e1() {
        return (mi.x) this.f13688b;
    }

    @Override
    public void f(mi.h1 h1Var) {
        switch (this.f13687a) {
            case 15:
                mi.n3 n3Var = ((mi.x) this.f13688b).P;
                if (n3Var != null) {
                    mi.t3 t3Var = n3Var.f19761a;
                    mi.t3.Q1(t3Var, h1Var);
                    t3Var.f19916p3.E(h1Var, true);
                    return;
                }
                return;
            default:
                mi.d5 d5Var = ((mi.f5) this.f13688b).f19605s;
                if (d5Var != null) {
                    mi.t3 t3Var2 = ((mi.a3) d5Var).f19458a;
                    mi.t3.Q1(t3Var2, h1Var);
                    t3Var2.f19916p3.E(h1Var, true);
                    return;
                }
                return;
        }
    }

    public boolean f0() {
        return ((org.telegram.messenger.h0) this.f13688b).f22814c;
    }

    @Override
    public void g(long j10) {
        m2.v0 v0Var = (m2.v0) this.f13688b;
        v0Var.f19022n1 = true;
        m2.t tVar = v0Var.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new ci.e3(tVar, j10, 13));
        }
    }

    @Override
    public boolean g0() {
        return true;
    }

    @Override
    public Object mo5get() {
        return new k4.j((Context) ((c9.o) this.f13688b).f4279a, new kb.a(27), new v7.s(26));
    }

    @Override
    public CharSequence getContentDescription() {
        o10 o10Var;
        switch (this.f13687a) {
            case 26:
                return " ";
            case 27:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f13688b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(s7Var.f30349s)) {
                        sb2.append(s7Var.f30349s);
                    }
                    org.telegram.ui.Cells.r7 r7Var = s7Var.f30348r;
                    if (r7Var != null && (o10Var = r7Var.f30283e) != null) {
                        CharSequence charSequence = (CharSequence) o10Var.d(0, Integer.valueOf(s7Var.f30346f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) s7Var.f30348r.f30283e.d(-1, Integer.valueOf(s7Var.f30348r.b()));
                        CharSequence charSequence3 = (CharSequence) s7Var.f30348r.f30283e.d(1, Integer.valueOf(s7Var.f30348r.a()));
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
                    return s7Var.f30349s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) this.f13688b;
                sb3.append(bd.G(z7Var.f40969u2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(bd.G(z7Var.f40969u2 % 60, "Seconds", new Object[0]));
                String sb4 = sb3.toString();
                return bd.a0("AccDescrPlayerDuration", null, 2131754806, sb4, bd.G(z7Var.f40971v2 / 60, "Minutes", new Object[0]) + ' ' + bd.G(z7Var.f40971v2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public mi.a j1() {
        return ((mi.x) this.f13688b).f20029a;
    }

    @Override
    public void k(boolean z10, float f10) {
        int[] iArr;
        int round;
        switch (this.f13687a) {
            case 26:
                r51 r51Var = (r51) ((org.telegram.ui.Cells.i0) this.f13688b);
                int i3 = (int) (org.telegram.ui.ActionBar.k6.f28114q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                org.telegram.ui.ActionBar.k6.f28114q = f10;
                if (i3 != i10) {
                    ThemeActivity themeActivity = r51Var.f49107f.f50398e;
                    bj0 bj0Var = (bj0) themeActivity.f42043b.K(themeActivity.f42052g0);
                    if (bj0Var != null) {
                        ((org.telegram.ui.Cells.y8) bj0Var.f55540a).setText(bd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.f28114q * 100.0f))));
                    }
                    org.telegram.ui.ActionBar.k6.F(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f13688b;
                org.telegram.ui.Cells.r7 r7Var = s7Var.f30348r;
                if (r7Var != null && s7Var.f30347n != null) {
                    if (r7Var.f30282c != null) {
                        double length = f10 * (iArr.length - 1);
                        int j10 = Utilities.j((int) Math.floor(length), s7Var.f30348r.f30282c.length - 1, 0);
                        int j11 = Utilities.j((int) Math.ceil(length), s7Var.f30348r.f30282c.length - 1, 0);
                        int[] iArr2 = s7Var.f30348r.f30282c;
                        round = Math.round(org.telegram.messenger.g0.W1(Math.round(((float) (length - Math.floor(length))) * s7Var.f30348r.d) / s7Var.f30348r.d, iArr2[j10], iArr2[j11]));
                    } else {
                        round = Math.round(((s7Var.f30348r.a() - s7Var.f30348r.b()) * f10) + r7Var.b());
                    }
                    int i11 = s7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = s7Var.f30346f;
                    if (i12 != round) {
                        if (s7Var.c(i12) != s7Var.c(round)) {
                            org.telegram.messenger.g0.c4(s7Var.f30345e);
                        }
                        s7Var.f30346f = round;
                        s7Var.e(round, true);
                        u10 u10Var = s7Var.f30347n;
                        if (u10Var != null) {
                            u10Var.a(Integer.valueOf(s7Var.f30346f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().f21348v0, f10);
                }
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null && ziVar.J3()) {
                    ((org.telegram.ui.Components.z7) this.f13688b).b1(ziVar, false);
                    return;
                }
                return;
        }
    }

    public ha.b k0(JSONObject jSONObject) {
        ha.d sVar;
        int i3 = jSONObject.getInt("settings_version");
        if (i3 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i3 + ". Using default settings values.", null);
            sVar = new ra.e(9);
        } else {
            sVar = new v7.s(9);
        }
        return sVar.l((nb.a) this.f13688b, jSONObject);
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public void l(mi.h1 h1Var, int i3, int i10) {
        mi.d5 d5Var;
        org.telegram.ui.Cells.h9 textSelectionHelper;
        mi.f5 f5Var = (mi.f5) this.f13688b;
        if (!f5Var.f19607x && i3 != i10 && (d5Var = f5Var.f19605s) != null && (textSelectionHelper = ((mi.a3) d5Var).f19458a.getTextSelectionHelper()) != null) {
            h1Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 3));
        }
    }

    @Override
    public boolean l1() {
        mi.x xVar = (mi.x) this.f13688b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.f20029a;
            if (n3Var.f19761a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        y5 y5Var = (y5) this.f13688b;
        u5 u5Var = y5Var.M;
        org.telegram.messenger.g0.r(u5Var);
        m51 m51Var = y5Var.E;
        if (m51Var != null && m51Var.d0()) {
            org.telegram.messenger.g0.h3(u5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((y5) this.f13688b).i();
    }

    @Override
    public void p() {
        ((m2.v0) this.f13688b).m1 = true;
    }

    @Override
    public void q() {
        k2.l0 l0Var = ((m2.v0) this.f13688b).Z;
        if (l0Var != null) {
            l0Var.f16620a.f16702j0 = true;
        }
    }

    @Override
    public int q0() {
        switch (this.f13687a) {
            case 26:
                return 0;
            case 27:
                org.telegram.ui.Cells.r7 r7Var = ((org.telegram.ui.Cells.s7) this.f13688b).f30348r;
                if (r7Var == null) {
                    return 0;
                }
                int[] iArr = r7Var.f30282c;
                if (iArr != null) {
                    return r7Var.d * (iArr.length - 1);
                }
                return r7Var.a() - r7Var.b();
            default:
                return 0;
        }
    }

    @Override
    public void q1(int i3, int i10) {
        mi.x xVar = (mi.x) this.f13688b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.f20029a;
            mi.g2 g2Var = n3Var.f19761a.R3;
            if (g2Var != null) {
                g2Var.f(i3, i10);
            }
        }
    }

    @Override
    public void r(int i3) {
        boolean z10;
        bm0 bm0Var = (bm0) this.f13688b;
        bm0Var.E0--;
        bm0Var.f16964f0 = i3;
        if (bm0Var.f16965g0 != i3) {
            bm0Var.f16978s.clear();
        }
        if (bm0Var.f16966h0 != i3) {
            bm0Var.J.clear();
        }
        bm0Var.O = true;
        ew ewVar = bm0Var.V;
        if (ewVar != null) {
            if (bm0Var.E0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ewVar.d(z10, true);
        }
        bm0Var.f();
        ew ewVar2 = bm0Var.V;
        if (ewVar2 != null) {
            ewVar2.c();
        }
    }

    @Override
    public boolean s1() {
        return true;
    }

    @Override
    public void t(float f10, float f11) {
        zt ztVar = (zt) this.f13688b;
        yt i02 = zt.i0(ztVar, f10, f11);
        yt ytVar = ztVar.f26974b0;
        if (i02 != ytVar) {
            ytVar = null;
        }
        zt.j0(ztVar, ytVar);
    }

    @Override
    public void u() {
        mi.x xVar = (mi.x) this.f13688b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.t3.T1(n3Var.f19761a, xVar.f20029a);
        }
    }

    @Override
    public void u0() {
        zt ztVar = (zt) this.f13688b;
        zt.j0(ztVar, ztVar.f26974b0);
    }

    @Override
    public void v(m2.t0 t0Var) {
        m2.t tVar = ((m2.v0) this.f13688b).f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 0));
        }
    }

    @Override
    public void w(boolean z10, float f10) {
        ((q4) this.f13688b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override
    public void z(Bitmap bitmap) {
        ((h6.h) this.f13688b).e(bitmap, 3);
    }

    public v5(Object obj, int i3) {
        this.f13687a = i3;
        this.f13688b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public v5(z6.a aVar) {
        this.f13687a = 10;
        p6.m.g(aVar);
        this.f13688b = aVar;
    }

    public v5() {
        this.f13687a = 6;
        this.f13688b = new g2.y();
    }

    public v5(String str, long j10) {
        this.f13687a = 21;
        this.f13688b = new org.telegram.messenger.l0(str, j10);
    }

    public v5(String str, Set set) {
        this.f13687a = 22;
        this.f13688b = new org.telegram.messenger.o0(str, set);
    }

    public v5(Context context, Uri uri) {
        this.f13687a = 18;
        this.f13688b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public v5(String str, boolean z10) {
        this.f13687a = 20;
        this.f13688b = new org.telegram.messenger.h0(str, z10);
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void I(float f10) {
    }

    @Override
    public void K(long j10) {
    }

    @Override
    public void M(boolean z10) {
    }

    @Override
    public void R(float f10) {
    }

    @Override
    public void T(float f10) {
    }

    @Override
    public void W(float f10) {
    }

    @Override
    public void a0(float f10) {
    }

    @Override
    public void c(int i3) {
    }

    @Override
    public void d0(long j10) {
    }

    @Override
    public void g1(CharSequence charSequence) {
    }

    @Override
    public void i(float f10) {
    }

    @Override
    public void j(float f10) {
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void y(float f10) {
    }

    private final void h0() {
    }

    private final void i0() {
    }

    private final void j0() {
    }

    @Override
    public void X() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void s() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void A(int i3, int i10) {
    }

    @Override
    public void H(float f10, int i3) {
    }

    @Override
    public void P(float f10, int i3) {
    }

    @Override
    public void V(float f10, int i3) {
    }

    @Override
    public void b0(int i3, long j10) {
    }

    @Override
    public void n(long j10, boolean z10) {
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override
    public void o(View view, float f10, float f11) {
    }

    @Override
    public void o1(View view, float f10, float f11) {
    }

    @Override
    public void x(View view, float f10, float f11) {
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
