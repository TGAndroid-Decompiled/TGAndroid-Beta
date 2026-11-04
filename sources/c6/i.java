package c6;

import a3.q;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.f0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import bi.o0;
import c3.j0;
import ci.l6;
import ci.r6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.a2;
import d5.o;
import e6.e0;
import ei.l4;
import ei.n9;
import ei.o3;
import ei.o9;
import g.s;
import g9.g1;
import gi.x9;
import i6.n;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k2.l0;
import l.w;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nv0;
import org.telegram.ui.tu0;
import p6.m;
import tg.h1;
import tg.k0;
import ug.k1;
public final class i implements a0, androidx.activity.result.b, a3.k, j0, p, eo0, p0, o, fb.b, qe.b, n9, OnCompleteListener, w, n, g1, z80, k1 {
    public static i f4233c;
    public final int f4234a;
    public Object f4235b;

    public i(d0 d0Var) {
        this.f4234a = 12;
        this.f4235b = new WeakReference(d0Var);
    }

    public static synchronized i D(Context context) {
        i H;
        synchronized (i.class) {
            H = H(context.getApplicationContext());
        }
        return H;
    }

    public static synchronized i H(Context context) {
        synchronized (i.class) {
            i iVar = f4233c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f4233c = iVar2;
            return iVar2;
        }
    }

    public static com.google.android.gms.common.api.internal.o x(Looper looper, Object obj, String str) {
        m.h(obj, "Listener must not be null");
        m.h(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.o(looper, obj, str);
    }

    public void A() {
        ((u) this.f4235b).d.R();
    }

    public void B(int i3) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c2;
        o0 o0Var = ((bi.j0) this.f4235b).f3755e;
        if (o0Var != null && o0Var.d != i3) {
            boolean z11 = true;
            if (o0Var.f3808c.d && i3 == 2) {
                i3 = 1;
            }
            o0Var.d = i3;
            SharedPreferences.Editor edit = o0Var.f().edit();
            if (o0Var.d == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z10).apply();
            int i10 = o0Var.d;
            if (i10 == 0) {
                if (o0Var.f3811n != 0) {
                    ConnectionsManager.getInstance(o0Var.f3806a).cancelRequest(o0Var.f3811n, true);
                    o0Var.f3811n = 0;
                    return;
                }
                return;
            }
            if (i10 == 2 && (c2 = o0Var.c()) != null) {
                o0Var.f3810f = c2;
                o0Var.f3807b.setFreeLink(o0Var.d(c2));
            }
            if (o0Var.d != 1) {
                z11 = false;
            }
            o0Var.n(false, z11);
        }
    }

    public void C() {
        d0 d0Var = (d0) ((WeakReference) this.f4235b).get();
        if (d0Var == null) {
            return;
        }
        d0Var.k();
    }

    @Override
    public void C0() {
        ac k10 = ((l6) this.f4235b).k().k(false);
        k10.f31802t = true;
        k10.j();
    }

    @Override
    public boolean E(l.k kVar) {
        Window.Callback callback = ((s) this.f4235b).f11746f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void F(float f10, int i3) {
        dh.o oVar = (dh.o) this.f4235b;
        oVar.f9103c.setLayerType(0, null);
        if (f10 == 0.0f && !oVar.P) {
            oVar.f9103c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.F.setFocusableInTouchMode(false);
            }
        }
        hs.e().k(hs.k1, 512);
    }

    public synchronized void G() {
        synchronized (this) {
            b bVar = (b) this.f4235b;
            ReentrantLock reentrantLock = bVar.f4216a;
            reentrantLock.lock();
            bVar.f4217b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    public void I(IBinder iBinder) {
        synchronized (((HashMap) this.f4235b)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new a9.a();
            for (Map.Entry entry : ((HashMap) this.f4235b).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((dh.o) this.f4235b).j0(f10);
    }

    @Override
    public void a(m6.a aVar) {
        com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.f4235b;
        g1Var.f6687o.lock();
        try {
            g1Var.f6685m = aVar;
            g1Var.j();
        } finally {
            g1Var.f6687o.unlock();
        }
    }

    @Override
    public void a0() {
        c3.l lVar = (c3.l) this.f4235b;
        if (lVar.f4074s1 != null) {
            lVar.R0(0, 1);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f4234a) {
            case 8:
                c8.d dVar = new c8.d(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i3 = c8.a.f4238a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((n8.a) this.f4235b).writeToParcel(obtain, 0);
                ((c8.c) ((c8.f) obj).m()).H0(obtain, 2);
                return;
            default:
                i6.w wVar = (i6.w) obj;
                i6.f fVar = (i6.f) wVar.m();
                e6.d0 d0Var = ((e0) this.f4235b).f9693l;
                Parcel P0 = fVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, d0Var);
                fVar.U0(P0, 18);
                i6.f fVar2 = (i6.f) wVar.m();
                fVar2.U0(fVar2.P0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override
    public void b(l.k kVar, boolean z10) {
        ((s) this.f4235b).h(kVar);
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) xe.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f4235b).createWebView(webView));
    }

    @Override
    public void d(int i3) {
        com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.f4235b;
        Lock lock = g1Var.f6687o;
        Lock lock2 = g1Var.f6687o;
        lock.lock();
        try {
            if (g1Var.f6686n) {
                g1Var.f6686n = false;
                g1Var.f6677b.d(i3);
                g1Var.f6685m = null;
                g1Var.f6684l = null;
            } else {
                g1Var.f6686n = true;
                g1Var.d.onConnectionSuspended(i3);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override
    public void g(Object obj) {
        Bundle extras;
        switch (this.f4234a) {
            case 4:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f4235b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f1814a;
                int i3 = f0Var.f1815b;
                androidx.fragment.app.s n4 = j0Var.f1828c.n(str);
                if (n4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                n4.x(i3, aVar.f1281a, aVar.f1282b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f4235b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1282b;
                int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f9593a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f1281a;
                if (i11 != -1 || i10 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public Object mo5get() {
        n9.h firebaseApp = (n9.h) ((e.a) this.f4235b).f9205a;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        db.p0 p0Var = db.p0.f8714a;
        return db.p0.a(firebaseApp);
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) xe.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f4235b).getStatics());
    }

    @Override
    public void h(a3.m mVar, long j10, long j11) {
        boolean z10;
        n2.d dVar = (n2.d) this.f4235b;
        synchronized (b3.b.f2346b) {
            z10 = b3.b.f2347c;
        }
        if (!z10) {
            dVar.f20147a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.b();
    }

    @Override
    public void i(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.f4235b;
        try {
            nVar.a(new g6.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            i6.b bVar = g6.h.f12006k;
            Log.e(bVar.f14620a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = nVar.f12027q.f12013i.iterator();
        while (it.hasNext()) {
            ((g6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void i0() {
        l0 l0Var = ((c3.l) this.f4235b).Z;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public boolean j(long j10, int i3, int i10, int i11, o9 o9Var) {
        ImageReceiver imageReceiver;
        l4 l4Var;
        l4 l4Var2;
        l4 l4Var3;
        l4 l4Var4;
        o9Var.f10727b = null;
        o9Var.f10728c = null;
        tu0 tu0Var = (tu0) this.f4235b;
        nv0 nv0Var = tu0Var.h;
        ArrayList arrayList = tu0Var.f42036x;
        if (tu0Var.O < 0.2f) {
            o9Var.f10727b = nv0Var.getImageReceiver();
            o9Var.f10728c = null;
            o9Var.f10726a = nv0Var;
            o9Var.h = 0.0f;
            o9Var.f10732i = g0.f22608q.y;
            o9Var.f10731g = (View) tu0Var.getParent();
            o9Var.d = tu0Var.E;
            o9Var.f10737n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 < arrayList.size()) {
                l4 l4Var5 = (l4) arrayList.get(i12);
                if (l4Var5.f10608e >= 1.0f && l4Var5.f10605a == i10) {
                    int i13 = i12 - 1;
                    if (i13 >= 0) {
                        l4Var3 = (l4) arrayList.get(i13);
                    } else {
                        l4Var3 = null;
                    }
                    int i14 = i12 - 2;
                    if (i14 >= 0) {
                        l4Var4 = (l4) arrayList.get(i14);
                    } else {
                        l4Var4 = null;
                    }
                    l4 d = ProfileStoriesView.d(l4Var3, l4Var4, l4Var5);
                    imageReceiver = l4Var5.f10606b;
                    l4Var2 = d;
                    l4Var = l4Var5;
                } else {
                    i12++;
                }
            } else {
                imageReceiver = null;
                l4Var = null;
                l4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        o9Var.f10728c = imageReceiver;
        o9Var.f10727b = null;
        o9Var.f10726a = tu0Var;
        o9Var.h = 0.0f;
        o9Var.f10732i = g0.f22608q.y;
        o9Var.f10731g = (View) tu0Var.getParent();
        if (l4Var != null && l4Var2 != null) {
            o9Var.f10730f = new r6(this, new RectF(l4Var.f10615m), l4Var, new RectF(l4Var2.f10615m), l4Var2);
            return true;
        }
        o9Var.f10730f = null;
        return true;
    }

    @Override
    public a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        ((n2.d) this.f4235b).f20147a.y(iOException);
        return q.f105e;
    }

    @Override
    public Object l(Object obj, Object obj2) {
        return ((f9.k) this.f4235b).apply(obj2);
    }

    @Override
    public String[] m() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f4235b).getSupportedFeatures();
    }

    @Override
    public Paint.FontMetricsInt n() {
        return ((gi.m) this.f4235b).f13144f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.f4235b;
        g1Var.f6687o.lock();
        try {
            g1Var.f6685m = m6.a.f19175f;
            g1Var.j();
        } finally {
            g1Var.f6687o.unlock();
        }
    }

    @Override
    public void onComplete(Task task) {
        f6.c.h((f6.c) ((f6.j) this.f4235b).f11487c, "launchApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        c3.l lVar = (c3.l) this.f4235b;
        Surface surface = lVar.f4074s1;
        if (surface != null) {
            lVar.f4060c1.y(surface);
            lVar.f4077v1 = true;
        }
    }

    @Override
    public void p(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.p(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void r(long j10, int i3, o3 o3Var) {
        int i10 = ProfileStoriesView.f42008t0;
        ((tu0) this.f4235b).f(true, false);
        o3Var.run();
    }

    @Override
    public void s(float f10) {
        x9 x9Var = (x9) this.f4235b;
        k0.e(x9Var.f13222p1).k(String.valueOf(tg.h.f55183a.indexOf(x9Var.f13239y0.getCurrentBrush())), f10);
        h1 h1Var = x9Var.k1;
        h1Var.f55188c = f10;
        x9Var.B0(h1Var, null, false);
    }

    @Override
    public void t(int i3, int i10, CharSequence charSequence, boolean z10) {
        gi.g gVar = ((gi.m) this.f4235b).f13144f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i3, i10 + i3, charSequence);
            if (z10) {
                i6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i3 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public void u(StringBuilder sb2, Iterator it) {
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.f4235b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(com.google.android.gms.internal.clearcut.e.d(entry.getKey()));
            sb2.append("=");
            sb2.append(com.google.android.gms.internal.clearcut.e.d(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) eVar.f7212a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(com.google.android.gms.internal.clearcut.e.d(entry2.getKey()));
                sb2.append("=");
                sb2.append(com.google.android.gms.internal.clearcut.e.d(entry2.getValue()));
            }
        }
    }

    @Override
    public void v(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f4235b;
        Handler handler = g0Var.B0;
        a3.o oVar = g0Var.C0;
        handler.removeCallbacks(oVar);
        TextView textView = g0Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(oVar, 2000L);
    }

    public e2.q y(b4.n r24) {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.y(b4.n):e2.q");
    }

    public p7.d z(ua.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.z(ua.b):p7.d");
    }

    public i(Object obj, int i3) {
        this.f4234a = i3;
        this.f4235b = obj;
    }

    public i(int i3) {
        this.f4234a = i3;
        switch (i3) {
            case 9:
                this.f4235b = new i(17);
                return;
            case 11:
                this.f4235b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 17:
                this.f4235b = new android.support.v4.media.c(bc.a.h, 4);
                return;
            case 19:
                return;
            default:
                this.f4235b = new HashMap();
                return;
        }
    }

    @Override
    public float get() {
        x9 x9Var = (x9) this.f4235b;
        int i3 = x9Var.f13222p1;
        tg.h currentBrush = x9Var.f13239y0.getCurrentBrush();
        if (currentBrush == null) {
            return k0.e(i3).f55235i;
        }
        return k0.e(i3).f(String.valueOf(tg.h.f55183a.indexOf(currentBrush)), currentBrush.d());
    }

    public i(Context context) {
        String e10;
        this.f4234a = 0;
        b a10 = b.a(context);
        this.f4235b = a10;
        a10.b();
        String e11 = a10.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = a10.e(b.f("googleSignInOptions", e11))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e10);
        } catch (JSONException unused) {
        }
    }

    @Override
    public void W() {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void f(a2 a2Var) {
    }

    @Override
    public void w(String str) {
    }

    @Override
    public void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3) {
    }

    @Override
    public void q(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void M(a3.m mVar, long j10, long j11, int i3) {
    }

    @Override
    public void q0(a3.m mVar, long j10, long j11, boolean z10) {
    }
}
