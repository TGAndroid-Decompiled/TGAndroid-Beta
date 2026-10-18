package k0;

import a1.g;
import a6.m;
import ai.t3;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import bh.h;
import com.google.android.gms.common.api.internal.o;
import gi.m4;
import i2.k0;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k1.f;
import k1.z;
import k2.q;
import k2.s;
import k2.t;
import k2.u0;
import k2.w0;
import k2.x;
import ki.b3;
import ki.g1;
import ki.g5;
import ki.h1;
import ki.h2;
import ki.j0;
import ki.o2;
import ki.r3;
import ki.w3;
import ki.z0;
import l.i;
import l.k;
import l.w;
import md.c;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x71;
import org.telegram.ui.n9;
import org.telegram.ui.web.b1;
import org.telegram.ui.x9;
import qf.e;
import r2.j;
import r4.d;
import rg.m2;
import rg.v1;
import s4.d0;
import s4.g0;
import s4.o0;
import td.p;
import x2.n;
public final class b implements x, j0, g1, w, i, f, n5.b, e5, h, x71, oe.a, x9, d, o, v1, d0 {
    public final int f14563a;
    public Object f14564b;

    public b(Object obj, int i10) {
        this.f14563a = i10;
        this.f14564b = obj;
    }

    public static FingerprintManager w(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    @Override
    public void A() {
        n nVar;
        w0 w0Var = (w0) this.f14564b;
        synchronized (w0Var.f12312a) {
            nVar = w0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public m9 B() {
        return (z0) this.f14564b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f14564b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public void E(String str) {
        b1 b1Var = (b1) this.f14564b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public ki.a F() {
        return ((z0) this.f14564b).f15110a;
    }

    @Override
    public boolean G() {
        z0 z0Var = (z0) this.f14564b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15110a;
            if (r3Var.f15487a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void H(bh.a aVar) {
        switch (this.f14563a) {
            case 13:
                aVar.a(((ti) this.f14564b).getThemedColor(h6.f20986d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((dr0) this.f14564b).getThemedColor(h6.f20986d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public void I(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((w0) this.f14564b).f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    public void J(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f14564b;
        int L = recyclerView.e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.e.K(i15);
            s4.b1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.f45912c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f45918l) == 0) {
                    if (U.f45919m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f45919m = arrayList;
                        U.f45920n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f45919m.add(obj);
                }
                ((o0) K.getLayoutParams()).f46016c = true;
            }
        }
        e eVar = recyclerView.f3607b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s4.b1 b1Var = (s4.b1) arrayList2.get(size);
            if (b1Var != null && (i12 = b1Var.f45912c) >= i10 && i12 < i14) {
                b1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f3638y0 = true;
    }

    @Override
    public void K(int i10, int i11) {
        z0 z0Var = (z0) this.f14564b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15110a;
            h2 h2Var = r3Var.f15487a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void L() {
        ((w0) this.f14564b).f14838j1 = true;
    }

    @Override
    public void M(Editable editable) {
        ((g5) this.f14564b).h();
    }

    @Override
    public void N() {
        z0 z0Var = (z0) this.f14564b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15110a;
            w3 w3Var = r3Var.f15487a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15591f3.onContentChanged();
        }
    }

    public void O(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f14564b;
        int L = recyclerView.e.L();
        for (int i12 = 0; i12 < L; i12++) {
            s4.b1 U = RecyclerView.U(recyclerView.e.K(i12));
            if (U != null && !U.r() && U.f45912c >= i10) {
                U.n(i11, false);
                recyclerView.f3631u0.f46069f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3607b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            s4.b1 b1Var = (s4.b1) arrayList.get(i13);
            if (b1Var != null && b1Var.f45912c >= i10) {
                b1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3636x0 = true;
    }

    @Override
    public void P(u0 u0Var) {
        qf.b bVar = ((w0) this.f14564b).f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 1));
        }
    }

    @Override
    public boolean Q(boolean z10) {
        return false;
    }

    @Override
    public boolean R(h1 h1Var) {
        return false;
    }

    @Override
    public void S(u0 u0Var) {
        qf.b bVar = ((w0) this.f14564b).f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 0));
        }
    }

    @Override
    public void T() {
        k0 k0Var = ((w0) this.f14564b).Y;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override
    public void U(float f7) {
        ((m2) this.f14564b).setOutlineWidth(f7);
    }

    @Override
    public boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public void V(h1 h1Var, int i10, int i11) {
        ki.e5 e5Var;
        org.telegram.ui.Cells.n9 textSelectionHelper;
        g5 g5Var = (g5) this.f14564b;
        if (!g5Var.f15286w && i10 != i11 && (e5Var = g5Var.f15285s) != null && (textSelectionHelper = ((b3) e5Var).f15143a.getTextSelectionHelper()) != null) {
            h1Var.post(new m4(this, h1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public void W() {
        z0 z0Var = (z0) this.f14564b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15110a;
            w3.P1(r3Var.f15487a);
        }
    }

    @Override
    public void X(int i10, int i11) {
        ((g0) this.f14564b).s(i10, i11);
    }

    public void Y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f14564b;
        int L = recyclerView.e.L();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < L; i20++) {
            s4.b1 U = RecyclerView.U(recyclerView.e.K(i20));
            if (U != null && (i18 = U.f45912c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f3631u0.f46069f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3607b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            s4.b1 b1Var = (s4.b1) arrayList.get(i21);
            if (b1Var != null && (i17 = b1Var.f45912c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b1Var.n(i11 - i10, false);
                } else {
                    b1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3636x0 = true;
    }

    public byte Z() {
        int read = ((com.google.firebase.messaging.d) this.f14564b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public Object a(p pVar, c cVar) {
        return ((z) this.f14564b).a(new n1.c(pVar, null, 0), cVar);
    }

    public int a0() {
        return ((Z() & 255) << 24) | ((Z() & 255) << 16) | ((Z() & 255) << 8) | (Z() & 255);
    }

    @Override
    public void a1(int i10, int i11) {
        ((g0) this.f14564b).r(i10, i11, null);
    }

    @Override
    public void b(k kVar) {
        Toolbar toolbar = (Toolbar) this.f14564b;
        m.i iVar = toolbar.f2791a.J;
        if (iVar != null && iVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f16202c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).f3168a.t();
        }
    }

    public int b0() {
        return ((Z() & Byte.MAX_VALUE) << 21) | ((Z() & Byte.MAX_VALUE) << 14) | ((Z() & Byte.MAX_VALUE) << 7) | (Z() & Byte.MAX_VALUE);
    }

    @Override
    public void c(h1 h1Var) {
        switch (this.f14563a) {
            case 2:
                r3 r3Var = ((z0) this.f14564b).S;
                if (r3Var != null) {
                    w3 w3Var = r3Var.f15487a;
                    w3.N1(w3Var, h1Var);
                    w3Var.f15591f3.n(h1Var, true);
                    return;
                }
                return;
            default:
                ki.e5 e5Var = ((g5) this.f14564b).f15285s;
                if (e5Var != null) {
                    w3 w3Var2 = ((b3) e5Var).f15143a;
                    w3.N1(w3Var2, h1Var);
                    w3Var2.f15591f3.n(h1Var, true);
                    return;
                }
                return;
        }
    }

    public void c0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f14564b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void d(k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f15731z.k().c(false);
        }
        w wVar = ((m.i) this.f14564b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public void e(long j10) {
        w0 w0Var = (w0) this.f14564b;
        w0Var.f14840m1 = true;
        qf.b bVar = w0Var.f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new t3(bVar, j10, 13));
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g() {
        z0 z0Var = (z0) this.f14564b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            w3.Q1(r3Var.f15487a, z0Var.f15110a);
        }
    }

    @Override
    public Object mo27get() {
        switch (this.f14563a) {
            case 8:
                return this.f14564b;
            default:
                String packageName = ((Context) ((hd.a) this.f14564b).mo27get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override
    public ee.b getData() {
        return ((z) this.f14564b).f14633c;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public void i(androidx.biometric.e eVar, b2.t tVar, m mVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.f4010c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        tVar.f4010c = cancellationSignal3;
                        if (tVar.f4009b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) tVar.f4010c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager w9 = w((Context) this.f14564b);
        if (w9 != null) {
            if (eVar != null) {
                Mac mac = (Mac) eVar.d;
                Signature signature = (Signature) eVar.f2819b;
                Cipher cipher = (Cipher) eVar.f2820c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            w9.authenticate(cryptoObject, cancellationSignal, 0, new a(mVar), null);
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public void j() {
        ((w0) this.f14564b).l1 = true;
    }

    @Override
    public void k() {
        k0 k0Var = ((w0) this.f14564b).Y;
        if (k0Var != null) {
            k0Var.f12471a.f12551i0 = true;
        }
    }

    @Override
    public void l(h1 h1Var) {
        ki.a aVar;
        g5 g5Var = (g5) this.f14564b;
        ki.e5 e5Var = g5Var.f15285s;
        if (e5Var != null && (aVar = g5Var.f15110a) != null) {
            w3 w3Var = ((b3) e5Var).f15143a;
            ArrayList arrayList = w3Var.f15599j3;
            long j10 = aVar.f15109t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ki.a) arrayList.get(i11)).f15100k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    h2 h2Var = w3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    ki.a aVar2 = new ki.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f15100k;
                    ArrayList arrayList3 = aVar2.f15100k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        g.y(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    w3Var.t4();
                    w3Var.W2.N(false);
                    h2 h2Var2 = w3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var.post(new o2(w3Var, aVar2, 26));
                }
            }
        }
    }

    public void n(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f14564b;
        int i10 = aVar.f45882a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f3635x.X(recyclerView, aVar.f45883b, aVar.d);
                    return;
                }
                recyclerView.f3635x.a0(recyclerView, aVar.f45883b, aVar.d, aVar.f45884c);
                return;
            }
            recyclerView.f3635x.Y(recyclerView, aVar.f45883b, aVar.d);
            return;
        }
        recyclerView.f3635x.V(recyclerView, aVar.f45883b, aVar.d);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        c71 c71Var = (c71) this.f14564b;
        float f11 = -dp;
        c71Var.f25113g.inset(f11, f11);
        boolean contains = c71Var.f25113g.contains(f7, f10);
        float f12 = dp;
        c71Var.f25113g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void o(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.o oVar = ((r7.i) this.f14564b).f45040b;
        synchronized (oVar) {
            oVar.f2671a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.f2672b).f6478c;
        }
        if (nVar != null) {
            ((r7.c) oVar.f2673c).c(nVar, 2441);
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        j jVar;
        w0 w0Var = (w0) this.f14564b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = w0Var.f14831c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = w0Var.f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((c71) this.f14564b).f25115j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((c71) this.f14564b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((c71) this.f14564b).h.c(false);
    }

    @Override
    public void onDismiss() {
        b1 b1Var = (b1) this.f14564b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.f42530h0 = false;
    }

    @Override
    public void onError(a81 a81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((w0) this.f14564b).f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new ah.t(12, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        m60 m60Var;
        VideoEditedInfo videoEditedInfo;
        f60 f60Var = (f60) this.f14564b;
        a81 a81Var = f60Var.H0.T;
        if (a81Var != null && a81Var.y() && i10 == 4 && (videoEditedInfo = (m60Var = f60Var.H0).S) != null) {
            a81 a81Var2 = m60Var.T;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            a81Var2.K(j10);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p(k kVar, MenuItem menuItem) {
        ((Toolbar) this.f14564b).getClass();
        return false;
    }

    @Override
    public String p0() {
        return ((b1) this.f14564b).f42531i0;
    }

    @Override
    public boolean q(h1 h1Var) {
        return false;
    }

    @Override
    public void r(Canvas canvas) {
        switch (this.f14563a) {
            case 13:
                ti tiVar = (ti) this.f14564b;
                canvas.drawColor(tiVar.getThemedColor(h6.f20986d6));
                if (SharedConfig.chatBlurEnabled()) {
                    tiVar.F2.b(canvas, -3);
                    return;
                }
                return;
            default:
                dr0 dr0Var = (dr0) this.f14564b;
                canvas.drawColor(dr0Var.getThemedColor(h6.f20986d6));
                if (SharedConfig.chatBlurEnabled()) {
                    dr0Var.O0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void s(int i10, long j10, long j11) {
        qf.b bVar = ((w0) this.f14564b).f14829a1;
        Handler handler = (Handler) bVar.f44442b;
        if (handler != null) {
            handler.post(new s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public org.telegram.ui.Cells.n9 t() {
        r3 r3Var = ((z0) this.f14564b).S;
        if (r3Var == null) {
            return null;
        }
        return r3Var.f15487a.getTextSelectionHelper();
    }

    @Override
    public void t0(int i10, int i11) {
        ((g0) this.f14564b).t(i10, i11);
    }

    public String toString() {
        switch (this.f14563a) {
            case 19:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f14564b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public boolean u(k kVar) {
        m.i iVar = (m.i) this.f14564b;
        if (kVar == iVar.f16217c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        iVar.getClass();
        w wVar = iVar.e;
        if (wVar == null) {
            return false;
        }
        return wVar.u(kVar);
    }

    @Override
    public void v(CharSequence charSequence) {
        r3 r3Var = ((z0) this.f14564b).S;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f15487a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public void x() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void y(int i10, int i11) {
        ((g0) this.f14564b).p(i10, i11);
    }

    @Override
    public void z(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f14564b).setResultCode(i10);
    }

    public b(int i10) {
        this.f14563a = i10;
        switch (i10) {
            case 29:
                return;
            default:
                this.f14564b = new SparseArray();
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public b(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f14563a = 21;
        this.f14564b = new GestureDetector(context, onGestureListener, null);
    }

    @Override
    public float get() {
        return ((m2) this.f14564b).F;
    }

    public b(EditText editText) {
        this.f14563a = 20;
        this.f14564b = new mi.q(editText);
    }

    public b(int i10, int i11) {
        this.f14563a = 15;
        this.f14564b = ApplicationLoader.applicationContext.getSharedPreferences(g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void m() {
    }

    @Override
    public void D(CharSequence charSequence) {
    }

    @Override
    public void F0(MrzRecognizer.Result result) {
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
    public void h(int i10, int i11) {
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
