package a6;

import a3.n0;
import ai.k7;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.lifecycle.a0;
import b2.a2;
import b5.p;
import ci.q4;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.j1;
import e9.l1;
import ei.a8;
import ei.bc;
import ei.d0;
import ei.e0;
import ei.jb;
import ei.lb;
import ei.r6;
import ei.vb;
import ei.xa;
import ei.z5;
import ei.zb;
import g.q;
import gb.n;
import hg.z1;
import i2.j0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import ki.z;
import l.w;
import mg.o;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.xo0;
import rg.b2;
public final class i implements n0, r, sq0, a0, androidx.activity.result.b, p, OnCompleteListener, d9.k, SuccessContinuation, o, zb, f6.a, w, n, z1, je.a, xo0 {
    public static i f304c;
    public final int f305a;
    public Object f306b;

    public i(Object obj, int i10) {
        this.f305a = i10;
        this.f306b = obj;
    }

    public static synchronized i F(Context context) {
        i L;
        synchronized (i.class) {
            L = L(context.getApplicationContext());
        }
        return L;
    }

    public static synchronized i L(Context context) {
        synchronized (i.class) {
            i iVar = f304c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            f304c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void A(float f7, boolean z10) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var != null) {
            a8Var.Z = f7;
            a8Var.f8716j = true;
            a81 a81Var = r6Var.e;
            if (a81Var != null && a81Var.p() != -9223372036854775807L) {
                r6Var.m(f7 * ((float) r6Var.e.p()));
            }
        }
    }

    public boolean B() {
        w0 w0Var = ((i0) this.f306b).d;
        if (w0Var != null && w0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public void C(long j10) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8732r0 = j10;
        a8Var.f8716j = true;
        r6Var.y(true);
    }

    @Override
    public void E(boolean z10) {
        b2 b2Var;
        vb vbVar = ((jb) ((r6) this.f306b)).C0;
        xa xaVar = vbVar.f10016v1;
        if (xaVar != null) {
            b2 b2Var2 = null;
            if (!z10 && (xaVar.getSelectedEntity() instanceof b2)) {
                vbVar.f10016v1.C0(null, true);
            } else if (z10 && !(vbVar.f10016v1.getSelectedEntity() instanceof b2)) {
                z5 z5Var = vbVar.f10016v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < z5Var.getChildCount()) {
                        View childAt = z5Var.getChildAt(i11);
                        if (childAt instanceof b2) {
                            b2Var = (b2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        b2Var = null;
                        break;
                    }
                }
                if (b2Var != null) {
                    xa xaVar2 = vbVar.f10016v1;
                    z5 z5Var2 = xaVar2.R0;
                    while (true) {
                        if (i10 >= z5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = z5Var2.getChildAt(i10);
                        if (childAt2 instanceof b2) {
                            b2Var2 = (b2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    xaVar2.C0(b2Var2, true);
                }
            }
        }
    }

    @Override
    public void G(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void H() {
        int i10 = this.f305a;
    }

    public synchronized void I() {
        synchronized (this) {
            b bVar = (b) this.f306b;
            ReentrantLock reentrantLock = bVar.f288a;
            reentrantLock.lock();
            bVar.f289b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public void K(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.F = f7;
        a8Var.f8716j = true;
        r6Var.w(true);
    }

    @Override
    public void M(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.E = f7;
        a8Var.f8716j = true;
        r6Var.w(true);
    }

    @Override
    public void N(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void P(float f7) {
        a8 a8Var = ((r6) this.f306b).d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8697a0 = f7;
        a8Var.f8716j = true;
    }

    @Override
    public void Q() {
        ((r6) this.f306b).q(null);
    }

    @Override
    public void S(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8736t0 = f7;
        a8Var.f8716j = true;
        r6Var.y(true);
    }

    @Override
    public void T(int i10, long j10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void U() {
        j0 j0Var = ((a3.n) this.f306b).Y;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void W(long j10) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.D = j10;
        a8Var.f8716j = true;
        r6Var.w(true);
    }

    @Override
    public void Z(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.f306b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f306b).getSupportedFeatures();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f305a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f311a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f306b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).F0(obtain, 1);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f306b).f12733k;
                Parcel J0 = iVar.J0();
                int i11 = i7.f.f12737a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar.K0(J0, 2);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l1 l1Var = (l1) this.f306b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f306b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(float f7) {
        MessageObject messageObject = ((z) this.f306b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) androidx.activity.result.c.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f306b).createWebView(webView));
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        q qVar;
        g.r rVar = (g.r) this.f306b;
        l.k k10 = kVar.k();
        int i11 = 0;
        if (k10 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k10;
        }
        q[] qVarArr = rVar.U;
        if (qVarArr != null) {
            i10 = qVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                qVar = qVarArr[i11];
                if (qVar != null && qVar.h == kVar) {
                    break;
                }
                i11++;
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (z11) {
                rVar.g(qVar.f10688a, qVar, k10);
                rVar.i(qVar, true);
                return;
            }
            rVar.i(qVar, z10);
        }
    }

    @Override
    public void e(int i10) {
        e0 e0Var = ((r6) this.f306b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f8867a == i10) {
                    d0Var.f8868b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void f(int i10) {
        AndroidUtilities.runOnUIThread(new bc(this, 20));
    }

    @Override
    public Object f2() {
        Type type = (Type) this.f306b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void g(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8738u0 = f7;
        a8Var.f8716j = true;
        r6Var.c();
    }

    @Override
    public void g0() {
        switch (this.f305a) {
            case 4:
                qc k10 = ((k7) this.f306b).getBulletinFactory().k(false);
                k10.f29649t = true;
                k10.j();
                return;
            default:
                q4.j0((q4) this.f306b);
                return;
        }
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) androidx.activity.result.c.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f306b).getStatics());
    }

    @Override
    public void h() {
        a3.n nVar = (a3.n) this.f306b;
        if (nVar.f163r1 != null) {
            nVar.R0(0, 1);
        }
    }

    @Override
    public void i(Object obj) {
        int i10;
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f306b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((Boolean) arrayList.get(i11)).booleanValue()) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            iArr[i11] = i10;
        }
        androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = f0Var.f3179a;
        if (j0Var.f3193c.f(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public c6.o j() {
        c6.o oVar = (c6.o) this.f306b;
        if (oVar.f4885a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4888f) && oVar.f4888f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void k(Bitmap bitmap) {
        ((f6.h) this.f306b).e(bitmap, 3);
    }

    @Override
    public void l(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.G = f7;
        a8Var.f8716j = true;
        r6Var.c();
    }

    public androidx.biometric.e m(n4.s r41) {
        throw new UnsupportedOperationException("Method not decompiled: a6.i.m(n4.s):androidx.biometric.e");
    }

    public synchronized void n() {
        ((SharedPreferences) this.f306b).edit().clear().commit();
    }

    @Override
    public void o(long j10, boolean z10) {
        r6 r6Var = (r6) this.f306b;
        if (!z10) {
            r6Var.m(j10);
            return;
        }
        a81 a81Var = r6Var.e;
        if (a81Var != null) {
            a81Var.L(j10, true);
        } else if (r6Var.j()) {
            r6Var.E.m(j10, true);
        } else {
            a81 a81Var2 = r6Var.f9739y;
            if (a81Var2 != null) {
                a81Var2.L(j10, false);
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f306b).f7869c, "joinApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f306b;
        Surface surface = nVar.f163r1;
        if (surface != null) {
            nVar.f148b1.G(surface);
            nVar.f166u1 = true;
        }
    }

    @Override
    public void q() {
        r6 r6Var = (r6) this.f306b;
        r6Var.s(null, null, true);
        vb vbVar = ((jb) r6Var).C0;
        jb jbVar = vbVar.X0;
        if (jbVar != null) {
            jbVar.s(null, null, true);
        }
        xa xaVar = vbVar.f10016v1;
        if (xaVar != null) {
            xaVar.p0();
        }
        lb lbVar = vbVar.f9957c1;
        if (lbVar != null) {
            lbVar.setHasRoundVideo(false);
        }
        a8 a8Var = vbVar.K1;
        if (a8Var != null) {
            File file = a8Var.f8726o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vbVar.K1.f8726o0 = null;
            }
            if (vbVar.K1.f8728p0 != null) {
                try {
                    new File(vbVar.K1.f8728p0).delete();
                } catch (Exception unused2) {
                }
                vbVar.K1.f8728p0 = null;
            }
        }
    }

    @Override
    public void r() {
        ((ei.j0) this.f306b).d.invalidate();
    }

    @Override
    public void t(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8734s0 = f7;
        a8Var.f8716j = true;
        r6Var.y(true);
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        ea.b bVar = (ea.b) this.f306b;
        d9.l lVar = (d9.l) bVar.f8550f;
        ea.d dVar = (ea.d) bVar.f8548b;
        String str = lVar.f7894a;
        FileWriter fileWriter2 = null;
        try {
            HashMap c10 = d9.l.c(dVar);
            androidx.biometric.e eVar = new androidx.biometric.e(str, c10);
            eVar.s("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.s("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d9.l.b(eVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + c10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = lVar.d(eVar.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.a M = ((ag.b) bVar.f8549c).M(jSONObject);
            m mVar = (m) bVar.e;
            long j10 = M.f8545c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) mVar.f310b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f8556f;
                        SharedPreferences.Editor edit = ((Context) bVar.f8547a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(M);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f8552i).get()).trySetResult(M);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                x9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x9.h.c(fileWriter, "Failed to close settings writer.");
            ea.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f8556f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f8547a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(M);
            ((TaskCompletionSource) ((AtomicReference) bVar.f8552i).get()).trySetResult(M);
        }
        return Tasks.forResult(null);
    }

    @Override
    public boolean u(l.k kVar) {
        Window.Callback callback;
        g.r rVar = (g.r) this.f306b;
        if (kVar == kVar.k() && rVar.O && (callback = rVar.f10709f.getCallback()) != null && !rVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public StringBuilder v() {
        ff.a aVar = (ff.a) this.f306b;
        if (aVar instanceof af.r) {
            StringBuilder sb2 = ((af.r) aVar).f627b.f613b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void w(boolean z10) {
        r6 r6Var = (r6) this.f306b;
        if (r6Var.j()) {
            r6Var.E.getClass();
        }
        r6Var.x(-4, z10);
    }

    @Override
    public void x(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void z(float f7) {
        r6 r6Var = (r6) this.f306b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.P = f7;
        r6Var.c();
    }

    public i(ya.c cVar) {
        this.f305a = 9;
        this.f306b = (com.google.android.gms.internal.play_billing.r) cVar.f50136b;
    }

    public i(Context context, int i10) {
        boolean isEmpty;
        String d;
        this.f305a = i10;
        switch (i10) {
            case 13:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.f306b = sharedPreferences;
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
                        n();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                        return;
                    }
                    return;
                }
            default:
                b a2 = b.a(context);
                this.f306b = a2;
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

    public i(MediaInfo mediaInfo) {
        this.f305a = 10;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f306b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    private final void p() {
    }

    private final void s() {
    }

    @Override
    public void V() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void Y(ArrayList arrayList) {
    }

    @Override
    public void onVideoSizeChanged(a2 a2Var) {
    }

    public i(JSONObject jSONObject) {
        this.f305a = 10;
        this.f306b = new c6.o(jSONObject);
    }

    public i(int i10) {
        this.f305a = i10;
        switch (i10) {
            case 23:
                this.f306b = new m(28);
                return;
            case 24:
                return;
            default:
                this.f306b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }
}
