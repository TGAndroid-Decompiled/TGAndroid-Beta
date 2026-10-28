package a4;

import a8.ca;
import a8.rd;
import a8.yb;
import ag.r0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.e0;
import androidx.lifecycle.a0;
import bi.h7;
import bi.r3;
import c5.p;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.q4;
import f6.o;
import fi.ta;
import h6.n;
import i2.m0;
import ig.j1;
import ig.z1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k2.t;
import k2.u;
import k2.v0;
import k2.x0;
import k2.y;
import li.b2;
import li.q;
import m.u3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.cr0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.pi0;
import r0.b0;
import r0.i0;
import r0.k1;
import rg.m;
import rg.q1;
import rg.s0;
import sg.w1;
public final class l implements z3.d, a0, androidx.activity.result.b, oe.d, cr0, p, OnSuccessListener, n, fe.b, w1, r0.n, hb.n, r, z1, y, e5 {
    public final int f278a;
    public final Object f279b;

    public l(b6.i iVar) {
        this.f278a = 11;
        this.f279b = (com.google.android.gms.internal.play_billing.r) iVar.f3670b;
    }

    public void A(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f279b).putParcelable(str, bitmap);
    }

    public void B(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f279b).putLong("android.media.metadata.DURATION", j10);
    }

    @Override
    public java.lang.Object C(fe.c r7, nd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: a4.l.C(fe.c, nd.c):java.lang.Object");
    }

    @Override
    public void D(v0 v0Var) {
        rf.b bVar = ((x0) this.f279b).f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 1));
        }
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((bh.u) this.f279b).f0(f7);
    }

    public void F(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f279b).putCharSequence(str, str2);
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f278a) {
            case 28:
                ((q) this.f279b).K(i10, z10, i11, false, 0L);
                q qVar = (q) this.f279b;
                pi0 pi0Var = qVar.O;
                if (pi0Var != null) {
                    pi0Var.h();
                    qVar.O = null;
                    return;
                }
                return;
            default:
                ((b2) this.f279b).t0(i10, i11, z10);
                return;
        }
    }

    public JSONObject H() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f279b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(y9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        y9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    y9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            y9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            y9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void J(v0 v0Var) {
        rf.b bVar = ((x0) this.f279b).f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 0));
        }
    }

    @Override
    public void N() {
        m0 m0Var = ((x0) this.f279b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override
    public k1 P0(View view, k1 k1Var) {
        boolean z10;
        k1 k1Var2;
        int b10;
        int c10;
        boolean z11;
        int color;
        int d = k1Var.d();
        g.r rVar = (g.r) this.f279b;
        Context context = rVar.e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = rVar.f12190y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f12190y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f12190y.isShown()) {
                if (rVar.f12181l0 == null) {
                    rVar.f12181l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f12181l0;
                Rect rect2 = rVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = u3.f17867a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = i0.f47143a;
                k1 a2 = b0.a(viewGroup2);
                if (a2 == null) {
                    b10 = 0;
                } else {
                    b10 = a2.b();
                }
                if (a2 == null) {
                    c10 = 0;
                } else {
                    c10 = a2.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && rVar.L == null) {
                    View view2 = new View(context);
                    rVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                } else {
                    View view3 = rVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = rVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!rVar.Q && z12) {
                    d10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                rVar.f12190y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = rVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            k1Var2 = k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a());
        } else {
            k1Var2 = k1Var;
        }
        return i0.h(view, k1Var2);
    }

    @Override
    public void Q(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.f279b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f2283l0.d(null);
        }
    }

    @Override
    public void R() {
        int i10 = this.f278a;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public Object U1() {
        Constructor constructor = (Constructor) this.f279b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            rd rdVar = kb.c.f16504a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override
    public void V(float f7) {
        ta taVar = (ta) this.f279b;
        s0.e(taVar.f10816u1).k(String.valueOf(m.f47500a.indexOf(taVar.D0.getCurrentBrush())), f7);
        q1 q1Var = taVar.f10806p1;
        q1Var.f47562c = f7;
        taVar.B0(q1Var, null, false);
    }

    @Override
    public void a(long j10) {
        x0 x0Var = (x0) this.f279b;
        x0Var.f16322m1 = true;
        rf.b bVar = x0Var.f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new r3(bVar, j10, 13));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        i7.f fVar = new i7.f(1, (TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = r7.a.f47339a;
        obtain.writeStrongBinder(fVar);
        r7.a.b(obtain, (GetCredentialRequest) this.f279b);
        r7.a.b(obtain, gVar);
        ((i7.b) ((i7.d) ((i7.e) obj).u())).F0(obtain, 1);
    }

    @Override
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f279b).getSupportedFeatures();
    }

    @Override
    public int c(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ve.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f279b).createWebView(webView));
    }

    @Override
    public void d(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f279b;
        e0 e0Var = (e0) i0Var.F.pollLast();
        if (e0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = e0Var.f2624a;
        int i10 = e0Var.f2625b;
        androidx.fragment.app.r g7 = i0Var.f2638c.g(str);
        if (g7 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        g7.x(i10, aVar.f2133a, aVar.f2134b);
    }

    @Override
    public long e(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        return 0L;
    }

    @Override
    public void f(int i10) {
        ((j1) this.f279b).l();
    }

    @Override
    public List g(long j10) {
        if (j10 >= 0) {
            return (List) this.f279b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public float get() {
        ta taVar = (ta) this.f279b;
        int i10 = taVar.f10816u1;
        m currentBrush = taVar.D0.getCurrentBrush();
        if (currentBrush == null) {
            return s0.e(i10).f47583i;
        }
        return s0.e(i10).f(String.valueOf(m.f47500a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ve.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f279b).getStatics());
    }

    @Override
    public void h(String str, long j10, long j11, long j12) {
        o oVar = (o) this.f279b;
        try {
            oVar.a(new f6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            h6.b bVar = f6.h.f10212k;
            Log.e(bVar.f12620a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f10233q.f10218i.iterator();
        while (it.hasNext()) {
            ((f6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void i() {
        ((x0) this.f279b).l1 = true;
    }

    @Override
    public void j() {
        m0 m0Var = ((x0) this.f279b).Y;
        if (m0Var != null) {
            m0Var.f13659a.f13739i0 = true;
        }
    }

    @Override
    public int k() {
        return 1;
    }

    @Override
    public boolean k0(int i10) {
        return true;
    }

    public void l(StringBuilder sb2, Iterator it) {
        d5.j jVar = (d5.j) this.f279b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d5.j.f(entry.getKey()));
            sb2.append("=");
            sb2.append(d5.j.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) jVar.f7988a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d5.j.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(d5.j.f(entry2.getValue()));
            }
        }
    }

    @Override
    public void m(int i10, long j10, long j11) {
        rf.b bVar = ((x0) this.f279b).f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new t(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public void n() {
        x2.o oVar;
        x0 x0Var = (x0) this.f279b;
        synchronized (x0Var.f13489a) {
            oVar = x0Var.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    public d6.o o() {
        d6.o oVar = (d6.o) this.f279b;
        if (oVar.f8111a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f8114f) && oVar.f8114f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        x0 x0Var = (x0) this.f279b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = x0Var.f16313c1) != null) {
            jVar.d(i10);
        }
        rf.b bVar = x0Var.f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new r0(bVar, i10, 15));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        rf.b bVar = ((x0) this.f279b).f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new bh.n(12, bVar, z10));
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((e6.a) this.f279b).getClass();
        ca.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public c2.s p(c2.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: a4.l.p(c2.b):c2.s");
    }

    @Override
    public void p0(ArrayList arrayList) {
        j1 j1Var = (j1) this.f279b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.f14112c0, j1Var.f14113d0, j1Var.f14110b0, j1Var.f14109a0);
        }
    }

    public synchronized void q() {
        ((SharedPreferences) this.f279b).edit().clear().commit();
    }

    @Override
    public void r(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        rf.b bVar = ((x0) this.f279b).f16311a1;
        Handler handler = (Handler) bVar.f47370b;
        if (handler != null) {
            handler.post(new k2.r(bVar, exc, 1));
        }
    }

    @Override
    public void t(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: a4.l.t(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void v() {
        ((x0) this.f279b).f16320j1 = true;
    }

    @Override
    public void v0() {
        switch (this.f278a) {
            case 7:
                qc k10 = ((h7) this.f279b).getBulletinFactory().k(false);
                k10.f31872u = true;
                k10.j();
                return;
            default:
                q4.h0((q4) this.f279b);
                return;
        }
    }

    public boolean w() {
        w0 w0Var = ((com.google.android.gms.common.api.internal.i0) this.f279b).d;
        if (w0Var != null && w0Var.b()) {
            return true;
        }
        return false;
    }

    public void x(bb.e0 e0Var) {
        ((m5.r) ((j5.f) ((ra.b) this.f279b).get())).a("FIREBASE_APPQUALITY_SESSION", new j5.c("json"), new a1.c(this, 3)).a(new j5.a(null, e0Var, j5.d.f15512a, null), new m4.x0(11));
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void z(float f7, int i10) {
        bh.u uVar = (bh.u) this.f279b;
        uVar.f4151c.setLayerType(0, null);
        if (f7 == 0.0f && !uVar.N) {
            uVar.f4151c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                uVar.E.setFocusableInTouchMode(false);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public l(Object obj, int i10) {
        this.f278a = i10;
        this.f279b = obj;
    }

    public l(MediaInfo mediaInfo) {
        this.f278a = 12;
        d6.o oVar = new d6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f279b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public l(JSONObject jSONObject) {
        this.f278a = 12;
        this.f279b = new d6.o(jSONObject);
    }

    public l(da.c cVar) {
        this.f278a = 17;
        this.f279b = new File(cVar.f8274b, "com.crashlytics.settings.json");
    }

    public l(Context context) {
        boolean isEmpty;
        this.f278a = 10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f279b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                q();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    private final void s() {
    }

    private final void u() {
    }

    public l(int i10) {
        this.f278a = i10;
        switch (i10) {
            case 25:
                this.f279b = new rb.c(hc.a.h, 26);
                return;
            default:
                this.f279b = new Bundle();
                return;
        }
    }

    public l(MediaMetadataCompat mediaMetadataCompat) {
        this.f278a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f2022a);
        this.f279b = bundle;
        android.support.v4.media.session.b0.a(bundle);
    }
}
