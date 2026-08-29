package m5;

import ag.j2;
import ag.o1;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import bg.f3;
import bg.u3;
import bg.v2;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import eg.z1;
import f2.s1;
import f2.w0;
import g.q;
import g5.p;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import l.d0;
import l.w;
import l3.b0;
import l3.n;
import l3.r;
import nh.a6;
import nh.f6;
import nh.m0;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.b61;
import wf.m;
public final class i implements a0, v2, o, s, s1, l0, w, p, b61, r, l.i, n3.e, SuccessContinuation, m, u61, WebMessageListenerBoundaryInterface {
    public static i f16878c;
    public final int f16879a;
    public Object f16880b;

    public i(int i10) {
        this.f16879a = i10;
    }

    public static synchronized i J(Context context) {
        i M;
        synchronized (i.class) {
            M = M(context.getApplicationContext());
        }
        return M;
    }

    public static synchronized i M(Context context) {
        synchronized (i.class) {
            i iVar = f16878c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            f16878c = iVar2;
            return iVar2;
        }
    }

    @Override
    public boolean B(String str) {
        return false;
    }

    @Override
    public n3.d D() {
        return (n3.d) this.f16880b;
    }

    @Override
    public m3.b E() {
        return null;
    }

    public StringBuilder F() {
        ne.a aVar = (ne.a) this.f16880b;
        if (aVar instanceof ie.o) {
            StringBuilder sb2 = ((ie.o) aVar).f8959b.f8944b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public Boolean G() {
        Bundle bundle = (Bundle) this.f16880b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public boolean H() {
        x0 x0Var = ((j0) this.f16880b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public void I() {
        ((u) this.f16880b).d.R();
    }

    @Override
    public void K(float f9) {
        ((u3) this.f16880b).setOutlineWidth(f9);
    }

    public synchronized void L() {
        synchronized (this) {
            b bVar = (b) this.f16880b;
            ReentrantLock reentrantLock = bVar.f16861a;
            reentrantLock.lock();
            bVar.f16862b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void S(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: m5.i.S(java.lang.Object):void");
    }

    @Override
    public void a(long j10) {
        n access$100 = b0.access$100((FfmpegAudioRenderer) this.f16880b);
        Handler handler = access$100.f14150a;
        if (handler != null) {
            handler.post(new z1(access$100, j10, 3));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16879a) {
            case 11:
                e6.f fVar = new e6.f(0, (TaskCompletionSource) obj2);
                e6.e eVar = (e6.e) ((e6.h) obj).u();
                Parcel G0 = eVar.G0();
                w6.a.d(G0, fVar);
                w6.a.c(G0, (e6.a) this.f16880b);
                eVar.H0(G0, 1);
                return;
            default:
                h8.j jVar = (h8.j) this.f16880b;
                q7.b bVar = (q7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                q7.a aVar = new q7.a(0, (TaskCompletionSource) obj2);
                try {
                    q7.i iVar = (q7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = q7.c.f46417a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f46425a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.v0(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void b(l.k kVar, boolean z10) {
        switch (this.f16879a) {
            case 14:
                ((q) this.f16880b).g(kVar);
                return;
            default:
                if (kVar instanceof d0) {
                    ((d0) kVar).f13958z.k().c(false);
                }
                w wVar = ((m.i) this.f16880b).f16564e;
                if (wVar != null) {
                    wVar.b(kVar, z10);
                    return;
                }
                return;
        }
    }

    @Override
    public void c(eg.n nVar) {
        nVar.c(((WindowManager) this.f16880b).getDefaultDisplay());
    }

    @Override
    public int d(View view) {
        return w0.x(view) - ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public UUID e() {
        return j3.h.f10473a;
    }

    @Override
    public float get() {
        return ((u3) this.f16880b).B;
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public boolean h(l.k kVar) {
        switch (this.f16879a) {
            case 14:
                Window.Callback callback = ((q) this.f16880b).f6927f.getCallback();
                if (callback != null) {
                    callback.onMenuOpened(108, kVar);
                    return true;
                }
                return true;
            default:
                m.i iVar = (m.i) this.f16880b;
                if (kVar == iVar.f16563c) {
                    return false;
                }
                ((d0) kVar).A.getClass();
                iVar.getClass();
                w wVar = iVar.f16564e;
                if (wVar == null) {
                    return false;
                }
                return wVar.h(kVar);
        }
    }

    @Override
    public void i(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f16880b;
        m.i iVar = toolbar.f1004a.F;
        if (iVar != null && iVar.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.S.f14097c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.b0) it.next()).f1419a.t();
        }
    }

    @Override
    public k0 j(n0 n0Var, IOException iOException, int i10) {
        o4.h hVar = ((o4.d) this.f16880b).f19149a;
        f5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.u(true);
        return q0.f3605e;
    }

    @Override
    public void k(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        s7.c cVar = (s7.c) obj;
        androidx.activity.n nVar2 = ((d7.i) this.f16880b).f5440b;
        synchronized (nVar2) {
            nVar2.f880a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f881b).f3887c;
        }
        if (nVar != null) {
            ((d7.c) nVar2.f882c).c(nVar, 2441);
        }
    }

    @Override
    public void m(n0 n0Var, long j10, long j11) {
        boolean z10;
        o4.d dVar = (o4.d) this.f16880b;
        synchronized (f5.a.f6564i) {
            z10 = f5.a.f6565j;
        }
        if (!z10) {
            IOException iOException = new IOException(new ConcurrentModificationException());
            o4.h hVar = dVar.f19149a;
            f5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
            hVar.u(true);
            return;
        }
        dVar.a();
    }

    @Override
    public int n() {
        return ((w0) this.f16880b).D();
    }

    @Override
    public void o(int i10, long j10, long j11) {
        n access$100 = b0.access$100((FfmpegAudioRenderer) this.f16880b);
        Handler handler = access$100.f14150a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(access$100, i10, j10, j11, 1));
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: m5.i.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n access$100 = b0.access$100((FfmpegAudioRenderer) this.f16880b);
        Handler handler = access$100.f14150a;
        if (handler != null) {
            handler.post(new hh.f(5, access$100, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        f6 f6Var = (f6) this.f16880b;
        a6 a6Var = f6Var.I;
        x61 x61Var = f6Var.f17675x;
        if (x61Var == null) {
            return;
        }
        if (x61Var.z()) {
            AndroidUtilities.runOnUIThread(a6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        f6 f6Var = (f6) this.f16880b;
        f6Var.getClass();
        f6Var.getClass();
        f3 f3Var = f6Var.f17673w;
        if (f3Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(f3Var.f2205u0 - f10) >= 1.0E-4f) {
                f3Var.f2205u0 = f10;
                f3Var.requestLayout();
            }
        }
    }

    @Override
    public boolean q(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f16880b).getClass();
        return false;
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public int s() {
        w0 w0Var = (w0) this.f16880b;
        return w0Var.f6506m - w0Var.E();
    }

    @Override
    public int t() {
        return 1;
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        e3.f fVar = (e3.f) this.f16880b;
        g5.c cVar = (g5.c) fVar.f5816f;
        n9.c cVar2 = (n9.c) fVar.f5813b;
        String str = cVar.f7032a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = g5.c.b(cVar2);
            androidx.biometric.e eVar = new androidx.biometric.e(str, b10);
            eVar.x("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            g5.c.a(eVar, cVar2);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = cVar.c(eVar.k());
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            jSONObject = null;
        }
        if (jSONObject != null) {
            n9.a j10 = ((o1) fVar.f5814c).j(jSONObject);
            za.c cVar3 = (za.c) fVar.f5815e;
            long j11 = j10.f17166c;
            cVar3.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j11);
                fileWriter = new FileWriter((File) cVar3.f50799b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        g9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.f.f("Loaded settings: ", jSONObject);
                        String str4 = cVar2.f17173f;
                        SharedPreferences.Editor edit = ((Context) fVar.f5812a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) fVar.h).set(j10);
                        ((TaskCompletionSource) ((AtomicReference) fVar.f5818i).get()).trySetResult(j10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    g9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                g9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            g9.h.c(fileWriter, "Failed to close settings writer.");
            e3.f.f("Loaded settings: ", jSONObject);
            String str42 = cVar2.f17173f;
            SharedPreferences.Editor edit2 = ((Context) fVar.f5812a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) fVar.h).set(j10);
            ((TaskCompletionSource) ((AtomicReference) fVar.f5818i).get()).trySetResult(j10);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16879a) {
            case 5:
                be.b bVar = be.b.f2073e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ba.a) this.f16880b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 6:
            default:
                return super.toString();
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f16880b).flattenToShortString() + " }";
        }
    }

    @Override
    public void u() {
        ((m0) this.f16880b).f18106e.invalidate();
    }

    @Override
    public void v(Exception exc) {
        f5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        n access$100 = b0.access$100((FfmpegAudioRenderer) this.f16880b);
        Handler handler = access$100.f14150a;
        if (handler != null) {
            handler.post(new l3.k(access$100, exc, 1));
        }
    }

    @Override
    public void w() {
        ((FfmpegAudioRenderer) this.f16880b).onPositionDiscontinuity();
    }

    @Override
    public View y(int i10) {
        return ((w0) this.f16880b).q(i10);
    }

    @Override
    public int z(View view) {
        return w0.y(view) + ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).rightMargin;
    }

    public i(e6.g gVar, e6.a aVar) {
        this.f16879a = 11;
        this.f16880b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(Object obj, int i10) {
        this.f16879a = i10;
        this.f16880b = obj;
    }

    public i(Context context, int i10) {
        String d;
        this.f16879a = i10;
        switch (i10) {
            case 22:
                kotlin.jvm.internal.j.e(context, "context");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                this.f16880b = bundle == null ? Bundle.EMPTY : bundle;
                return;
            default:
                b a2 = b.a(context);
                this.f16880b = a2;
                a2.b();
                String d10 = a2.d("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
                    return;
                }
                try {
                    GoogleSignInOptions.b(d);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    @Override
    public void A() {
    }

    @Override
    public void R() {
    }

    @Override
    public void f() {
    }

    @Override
    public void x() {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void P(boolean z10) {
    }

    @Override
    public void l(j2 j2Var) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void p(j2 j2Var) {
    }

    @Override
    public void onError(x61 x61Var, Exception exc) {
    }

    @Override
    public void g(n0 n0Var, long j10, long j11, boolean z10) {
    }
}
