package fa;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import c3.h;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.j;
import e2.d;
import e9.z;
import f2.a1;
import f2.g1;
import f2.q1;
import f2.t1;
import f2.v1;
import f2.z0;
import f7.d7;
import g.q;
import gh.k5;
import ih.i4;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import k5.i;
import kh.n0;
import kh.o6;
import kh.r6;
import l3.e;
import m.w3;
import m.y0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.z51;
import r0.j0;
import r0.m1;
import r4.f;
import tf.m;
import x5.l;
import yf.b2;
public class c implements f, a0, o, v0, y2.b, d, v1, r0.o, gp0, z51, m, h61, e, SuccessContinuation, y0 {
    public static volatile c f6032c;
    public final int f6033a;
    public Object f6034b;

    public c(Object obj, int i9) {
        this.f6033a = i9;
        this.f6034b = obj;
    }

    public static p D(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public void A() {
        int i9 = this.f6033a;
    }

    @Override
    public int B(View view) {
        return z0.y(view) + ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void E(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: fa.c.E(java.lang.Object):void");
    }

    public Set I() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f6034b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f6034b);
        }
        return unmodifiableSet;
    }

    public void J() {
        ((u) this.f6034b).d.R();
    }

    public void K(h hVar, Thread thread, Throwable th) {
        e9.o oVar = (e9.o) this.f6034b;
        synchronized (oVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    z.a(oVar.f5026e.R(new e9.l(oVar, System.currentTimeMillis(), th, thread, hVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void L(q1 q1Var, d5.p pVar, d5.p pVar2) {
        int i9;
        int i10;
        boolean z10;
        q1 T;
        int i11;
        RecyclerView recyclerView = (RecyclerView) this.f6034b;
        recyclerView.f1339b.k(q1Var);
        recyclerView.h(q1Var);
        q1Var.q(false);
        t1 t1Var = (t1) recyclerView.V;
        t1Var.getClass();
        int i12 = pVar.f4376a;
        int i13 = pVar.f4377b;
        View view = q1Var.f5501a;
        if (pVar2 == null) {
            i9 = view.getLeft();
        } else {
            i9 = pVar2.f4376a;
        }
        int i14 = i9;
        if (pVar2 == null) {
            i10 = view.getTop();
        } else {
            i10 = pVar2.f4377b;
        }
        int i15 = i10;
        if (!q1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = t1Var.r(q1Var, pVar, i12, i13, i14, i15);
        } else {
            int i16 = q1Var.h;
            int i17 = -1;
            if (i16 != -1) {
                for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i11 = T.h) >= 0 && i11 < i16 && i11 > i17) {
                        i17 = i11;
                    }
                }
            }
            q1Var.f5507i = (q1Var.h - i17) + (i17 * 1000);
            t1Var.s(q1Var, pVar);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        boolean z10;
        m1 m1Var2;
        int b10;
        int c10;
        boolean z11;
        int c11;
        int d = m1Var.d();
        q qVar = (q) this.f6034b;
        Context context = qVar.f7015e;
        int d9 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.f7030y;
        int i9 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f7030y.getLayoutParams();
            boolean z12 = true;
            if (qVar.f7030y.isShown()) {
                if (qVar.f7020h0 == null) {
                    qVar.f7020h0 = new Rect();
                    qVar.f7021i0 = new Rect();
                }
                Rect rect = qVar.f7020h0;
                Rect rect2 = qVar.f7021i0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.F;
                Method method = w3.f17123a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                m1 f10 = j0.f(qVar.F);
                if (f10 == null) {
                    b10 = 0;
                } else {
                    b10 = f10.b();
                }
                if (f10 == null) {
                    c10 = 0;
                } else {
                    c10 = f10.c();
                }
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 > 0 && qVar.H == null) {
                    View view2 = new View(context);
                    qVar.H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    qVar.F.addView(qVar.H, -1, layoutParams);
                } else {
                    View view3 = qVar.H;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            qVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = qVar.H;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = qVar.H;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c11 = f0.e.c(context, 2131099654);
                    } else {
                        c11 = f0.e.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c11);
                }
                if (!qVar.M && z12) {
                    d9 = 0;
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
                qVar.f7030y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = qVar.H;
        if (view6 != null) {
            if (z10) {
                i9 = 0;
            }
            view6.setVisibility(i9);
        }
        if (d != d9) {
            m1Var2 = m1Var.f(m1Var.b(), d9, m1Var.c(), m1Var.a());
        } else {
            m1Var2 = m1Var;
        }
        return j0.h(view, m1Var2);
    }

    public void M(q1 q1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f6034b;
        z0 z0Var = recyclerView.f1368x;
        View view = q1Var.f5501a;
        g1 g1Var = recyclerView.f1339b;
        a5.m mVar = z0Var.f5562a;
        i iVar = (i) mVar.f98b;
        int indexOfChild = ((RecyclerView) iVar.f14659b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((f2.d) mVar.f99c).K(indexOfChild)) {
                mVar.B(view);
            }
            iVar.O(indexOfChild);
        }
        g1Var.g(view);
    }

    @Override
    public UUID a() {
        return h3.h.f9436a;
    }

    @Override
    public int b(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public int c(View view) {
        return z0.x(view) - ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).leftMargin;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void g(int i9, Object obj) {
        String str;
        switch (i9) {
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
        if (i9 != 6 && i9 != 7 && i9 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f6034b).setResultCode(i9);
    }

    @Override
    public Object mo28get() {
        return new j((Context) ((nc.a) this.f6034b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(j.d).intValue());
    }

    @Override
    public long h(int i9) {
        boolean z10;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        return 0L;
    }

    @Override
    public void h0() {
        switch (this.f6033a) {
            case 19:
                gc k10 = ((k5) this.f6034b).getBulletinFactory().k(false);
                k10.f28747t = true;
                k10.j();
                return;
            default:
                i4.j0((i4) this.f6034b);
                return;
        }
    }

    @Override
    public void i(Object obj) {
        ((q7.c) obj).onLocationAvailability((LocationAvailability) this.f6034b);
    }

    @Override
    public int j() {
        return 1;
    }

    @Override
    public int l() {
        return ((z0) this.f6034b).D();
    }

    @Override
    public List m(long j10) {
        if (j10 >= 0) {
            return (List) this.f6034b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void n(int i9) {
        u5.a aVar;
        x xVar = (x) this.f6034b;
        Lock lock = xVar.f2929o;
        lock.lock();
        try {
            if (!xVar.f2928n && (aVar = xVar.f2927m) != null && aVar.c()) {
                xVar.f2928n = true;
                xVar.f2921e.onConnectionSuspended(i9);
                lock.unlock();
            }
            xVar.f2928n = false;
            x.k(xVar, i9);
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        r6 r6Var = (r6) this.f6034b;
        o6 o6Var = r6Var.I;
        k61 k61Var = r6Var.f15960x;
        if (k61Var == null) {
            return;
        }
        if (k61Var.z()) {
            AndroidUtilities.runOnUIThread(o6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(o6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        r6 r6Var = (r6) this.f6034b;
        r6Var.getClass();
        r6Var.getClass();
        b2 b2Var = r6Var.f15958w;
        if (b2Var != null) {
            float f11 = i9 / i10;
            if (Math.abs(b2Var.f49767u0 - f11) >= 1.0E-4f) {
                b2Var.f49767u0 = f11;
                b2Var.requestLayout();
            }
        }
    }

    @Override
    public void q() {
        ((n0) this.f6034b).f15723e.invalidate();
    }

    @Override
    public int r() {
        return 1;
    }

    @Override
    public void s(Bundle bundle) {
        x xVar = (x) this.f6034b;
        xVar.f2929o.lock();
        try {
            Bundle bundle2 = xVar.f2925k;
            if (bundle2 == null) {
                xVar.f2925k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f2926l = u5.a.f48098e;
            x.l(xVar);
        } finally {
            xVar.f2929o.unlock();
        }
    }

    @Override
    public void t(u5.a aVar) {
        x xVar = (x) this.f6034b;
        xVar.f2929o.lock();
        try {
            xVar.f2926l = aVar;
            x.l(xVar);
        } finally {
            xVar.f2929o.unlock();
        }
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        h hVar = (h) this.f6034b;
        d7 d7Var = (d7) hVar.f2304f;
        l9.c cVar = (l9.c) hVar.f2301b;
        String str = d7Var.f5642a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = d7.b(cVar);
            a5.m mVar = new a5.m(str, b10);
            mVar.x("User-Agent", "Crashlytics Android SDK/18.6.0");
            mVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d7.a(mVar, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = d7Var.c(mVar.k());
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            jSONObject = null;
        }
        if (jSONObject != null) {
            l9.a N = ((i) hVar.f2302c).N(jSONObject);
            android.support.v4.media.c cVar2 = (android.support.v4.media.c) hVar.f2303e;
            long j10 = N.f16699c;
            cVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar2.f281b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        e9.h.c(fileWriter, "Failed to close settings writer.");
                        h.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f16706f;
                        SharedPreferences.Editor edit = ((Context) hVar.f2300a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) hVar.h).set(N);
                        ((TaskCompletionSource) ((AtomicReference) hVar.f2306i).get()).trySetResult(N);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    e9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                e9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            e9.h.c(fileWriter, "Failed to close settings writer.");
            h.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f16706f;
            SharedPreferences.Editor edit2 = ((Context) hVar.f2300a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) hVar.h).set(N);
            ((TaskCompletionSource) ((AtomicReference) hVar.f2306i).get()).trySetResult(N);
        }
        return Tasks.forResult(null);
    }

    @Override
    public int u() {
        z0 z0Var = (z0) this.f6034b;
        return z0Var.f5572m - z0Var.E();
    }

    @Override
    public boolean w(String str) {
        return false;
    }

    @Override
    public l3.d x() {
        return (l3.d) this.f6034b;
    }

    @Override
    public k3.b y() {
        return null;
    }

    @Override
    public View z(int i9) {
        return ((z0) this.f6034b).q(i9);
    }

    public c(ArrayList arrayList) {
        this.f6033a = 1;
        this.f6034b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(int i9) {
        this.f6033a = i9;
        switch (i9) {
            case 8:
                this.f6034b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 16:
                return;
            default:
                this.f6034b = new HashSet();
                return;
        }
    }

    private final void G() {
    }

    private final void H() {
    }

    @Override
    public void F() {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void f(int i9) {
    }

    @Override
    public void k(a6.a aVar) {
    }

    @Override
    public void o(int i9) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void p(a6.a aVar) {
    }

    @Override
    public void v(boolean z10) {
    }

    @Override
    public void onError(k61 k61Var, Exception exc) {
    }
}
