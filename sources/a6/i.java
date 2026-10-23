package a6;

import a3.n0;
import ai.l7;
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
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b2.a2;
import b5.p;
import ci.p4;
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
import i2.k0;
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
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xq0;
import rg.d2;
public final class i implements n0, r, xq0, a0, androidx.activity.result.b, p, OnCompleteListener, d9.k, SuccessContinuation, o, zb, f6.a, w, n, z1, je.a, cp0 {
    public static i f305c;
    public final int f306a;
    public Object f307b;

    public i(Object obj, int i10) {
        this.f306a = i10;
        this.f307b = obj;
    }

    public static synchronized i Q(Context context) {
        i V;
        synchronized (i.class) {
            V = V(context.getApplicationContext());
        }
        return V;
    }

    public static synchronized i V(Context context) {
        synchronized (i.class) {
            i iVar = f305c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            f305c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void A(float f7) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.E = f7;
        a8Var.f8723j = true;
        r6Var.w(true);
    }

    @Override
    public void B(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void C(float f7) {
        a8 a8Var = ((r6) this.f307b).d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8704a0 = f7;
        a8Var.f8723j = true;
    }

    @Override
    public void D() {
        ((r6) this.f307b).q(null);
    }

    @Override
    public void F(float f7) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8743t0 = f7;
        a8Var.f8723j = true;
        r6Var.y(true);
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public void H() {
        int i10 = this.f306a;
    }

    @Override
    public void I(int i10, long j10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).X = j10;
        }
    }

    public synchronized void J() {
        ((SharedPreferences) this.f307b).edit().clear().commit();
    }

    @Override
    public void K(long j10) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.D = j10;
        a8Var.f8723j = true;
        r6Var.w(true);
    }

    public StringBuilder N() {
        ff.a aVar = (ff.a) this.f307b;
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
    public boolean O(int i10) {
        return true;
    }

    public boolean P() {
        w0 w0Var = ((i0) this.f307b).d;
        if (w0Var != null && w0Var.b()) {
            return true;
        }
        return false;
    }

    public synchronized void T() {
        synchronized (this) {
            b bVar = (b) this.f307b;
            ReentrantLock reentrantLock = bVar.f289a;
            reentrantLock.lock();
            bVar.f290b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void U() {
        a3.n nVar = (a3.n) this.f307b;
        if (nVar.f163r1 != null) {
            nVar.R0(0, 1);
        }
    }

    @Override
    public void Y() {
        k0 k0Var = ((a3.n) this.f307b).Y;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override
    public void Z(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.f307b;
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
    public void a(float f7) {
        z zVar = (z) this.f307b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f306a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f310a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f307b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).F0(obtain, 1);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f307b).f12761k;
                Parcel J0 = iVar.J0();
                int i11 = i7.f.f12765a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar.K0(J0, 2);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l1 l1Var = (l1) this.f307b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override
    public void b(float f7) {
        MessageObject messageObject = ((z) this.f307b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public void c(int i10) {
        e0 e0Var = ((r6) this.f307b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f8877a == i10) {
                    d0Var.f8878b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) androidx.activity.result.c.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f307b).createWebView(webView));
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        q qVar;
        g.r rVar = (g.r) this.f307b;
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
                rVar.f(qVar.f10706a, qVar, k10);
                rVar.h(qVar, true);
                return;
            }
            rVar.h(qVar, z10);
        }
    }

    @Override
    public void e(float f7) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8745u0 = f7;
        a8Var.f8723j = true;
        r6Var.c();
    }

    @Override
    public void f(int i10) {
        AndroidUtilities.runOnUIThread(new bc(this, 20));
    }

    @Override
    public Object f2() {
        Type type = (Type) this.f307b;
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
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.G = f7;
        a8Var.f8723j = true;
        r6Var.c();
    }

    @Override
    public void g0() {
        switch (this.f306a) {
            case 4:
                qc k10 = ((l7) this.f307b).getBulletinFactory().k(false);
                k10.f29842t = true;
                k10.j();
                return;
            default:
                p4.i0((p4) this.f307b);
                return;
        }
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) androidx.activity.result.c.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f307b).getStatics());
    }

    @Override
    public void h(Object obj) {
        int i10;
        Map map = (Map) obj;
        j0 j0Var = (j0) this.f307b;
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
        String str = f0Var.f3183a;
        if (j0Var.f3197c.f(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public void i(long j10, boolean z10) {
        r6 r6Var = (r6) this.f307b;
        if (!z10) {
            r6Var.m(j10);
            return;
        }
        j81 j81Var = r6Var.e;
        if (j81Var != null) {
            j81Var.L(j10, true);
        } else if (r6Var.j()) {
            r6Var.E.m(j10, true);
        } else {
            j81 j81Var2 = r6Var.f9753y;
            if (j81Var2 != null) {
                j81Var2.L(j10, false);
            }
        }
    }

    @Override
    public void j() {
        r6 r6Var = (r6) this.f307b;
        r6Var.s(null, null, true);
        vb vbVar = ((jb) r6Var).C0;
        jb jbVar = vbVar.X0;
        if (jbVar != null) {
            jbVar.s(null, null, true);
        }
        xa xaVar = vbVar.f10032v1;
        if (xaVar != null) {
            xaVar.o0();
        }
        lb lbVar = vbVar.f9973c1;
        if (lbVar != null) {
            lbVar.setHasRoundVideo(false);
        }
        a8 a8Var = vbVar.K1;
        if (a8Var != null) {
            File file = a8Var.f8733o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vbVar.K1.f8733o0 = null;
            }
            if (vbVar.K1.f8735p0 != null) {
                try {
                    new File(vbVar.K1.f8735p0).delete();
                } catch (Exception unused2) {
                }
                vbVar.K1.f8735p0 = null;
            }
        }
    }

    @Override
    public void k(float f7) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8741s0 = f7;
        a8Var.f8723j = true;
        r6Var.y(true);
    }

    @Override
    public void l(Bitmap bitmap) {
        ((f6.h) this.f307b).e(bitmap, 3);
    }

    @Override
    public void m(boolean z10) {
        r6 r6Var = (r6) this.f307b;
        if (r6Var.j()) {
            r6Var.E.getClass();
        }
        r6Var.x(-4, z10);
    }

    @Override
    public void n(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public boolean o(l.k kVar) {
        Window.Callback callback;
        g.r rVar = (g.r) this.f307b;
        if (kVar == kVar.k() && rVar.O && (callback = rVar.f10727f.getCallback()) != null && !rVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f307b).f7879c, "joinApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f307b;
        Surface surface = nVar.f163r1;
        if (surface != null) {
            nVar.f148b1.B(surface);
            nVar.f166u1 = true;
        }
    }

    @Override
    public void p(float f7) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.P = f7;
        r6Var.c();
    }

    @Override
    public void q(float f7, boolean z10) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var != null) {
            a8Var.Z = f7;
            a8Var.f8723j = true;
            j81 j81Var = r6Var.e;
            if (j81Var != null && j81Var.p() != -9223372036854775807L) {
                r6Var.m(f7 * ((float) r6Var.e.p()));
            }
        }
    }

    @Override
    public String[] r() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f307b).getSupportedFeatures();
    }

    @Override
    public void s(long j10) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.f8739r0 = j10;
        a8Var.f8723j = true;
        r6Var.y(true);
    }

    @Override
    public void t(boolean z10) {
        d2 d2Var;
        vb vbVar = ((jb) ((r6) this.f307b)).C0;
        xa xaVar = vbVar.f10032v1;
        if (xaVar != null) {
            d2 d2Var2 = null;
            if (!z10 && (xaVar.getSelectedEntity() instanceof d2)) {
                vbVar.f10032v1.B0(null, true);
            } else if (z10 && !(vbVar.f10032v1.getSelectedEntity() instanceof d2)) {
                z5 z5Var = vbVar.f10032v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < z5Var.getChildCount()) {
                        View childAt = z5Var.getChildAt(i11);
                        if (childAt instanceof d2) {
                            d2Var = (d2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        d2Var = null;
                        break;
                    }
                }
                if (d2Var != null) {
                    xa xaVar2 = vbVar.f10032v1;
                    z5 z5Var2 = xaVar2.R0;
                    while (true) {
                        if (i10 >= z5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = z5Var2.getChildAt(i10);
                        if (childAt2 instanceof d2) {
                            d2Var2 = (d2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    xaVar2.B0(d2Var2, true);
                }
            }
        }
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        ea.b bVar = (ea.b) this.f307b;
        d9.l lVar = (d9.l) bVar.f8555f;
        ea.d dVar = (ea.d) bVar.f8553b;
        String str = lVar.f7904a;
        FileWriter fileWriter2 = null;
        try {
            HashMap c10 = d9.l.c(dVar);
            androidx.biometric.e eVar = new androidx.biometric.e(str, c10);
            eVar.q("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.q("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d9.l.b(eVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + c10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = lVar.d(eVar.i());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.a Y = ((a4.l) bVar.f8554c).Y(jSONObject);
            qb.c cVar = (qb.c) bVar.e;
            long j10 = Y.f8550c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar.f44852b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f8561f;
                        SharedPreferences.Editor edit = ((Context) bVar.f8552a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(Y);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f8557i).get()).trySetResult(Y);
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
            String str42 = dVar.f8561f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f8552a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(Y);
            ((TaskCompletionSource) ((AtomicReference) bVar.f8557i).get()).trySetResult(Y);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u() {
        ((ei.j0) this.f307b).d.invalidate();
    }

    public c6.o v() {
        c6.o oVar = (c6.o) this.f307b;
        if (oVar.f4888a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4891f) && oVar.f4891f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void w(float f7, int i10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var != null && (arrayList = a8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((a8) r6Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public a0.h x() {
        return null;
    }

    public androidx.biometric.e y(n4.s r41) {
        throw new UnsupportedOperationException("Method not decompiled: a6.i.y(n4.s):androidx.biometric.e");
    }

    @Override
    public void z(float f7) {
        r6 r6Var = (r6) this.f307b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.F = f7;
        a8Var.f8723j = true;
        r6Var.w(true);
    }

    public i(ya.c cVar) {
        this.f306a = 9;
        this.f307b = (com.google.android.gms.internal.play_billing.r) cVar.f50564b;
    }

    public i(Context context, int i10) {
        boolean isEmpty;
        String d;
        this.f306a = i10;
        switch (i10) {
            case 13:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.f307b = sharedPreferences;
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
                        J();
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
                this.f307b = a2;
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
        this.f306a = 10;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f307b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    private final void L() {
    }

    private final void M() {
    }

    @Override
    public void W() {
    }

    public i(JSONObject jSONObject) {
        this.f306a = 10;
        this.f307b = new c6.o(jSONObject);
    }

    @Override
    public void E(boolean z10) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void S(ArrayList arrayList) {
    }

    @Override
    public void onVideoSizeChanged(a2 a2Var) {
    }

    public i(int i10) {
        this.f306a = i10;
        switch (i10) {
            case 23:
                this.f307b = new qb.c(28);
                return;
            case 24:
                return;
            default:
                this.f307b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }
}
