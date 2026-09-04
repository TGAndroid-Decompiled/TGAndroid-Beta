package a6;

import ah.g0;
import ah.j1;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import androidx.fragment.app.t;
import androidx.lifecycle.a0;
import bi.gb;
import bi.o5;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.d7;
import di.m0;
import di.z6;
import fb.n;
import fi.y4;
import g6.q;
import g6.r;
import hg.a2;
import hg.k1;
import ig.t0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import ji.a3;
import ji.g1;
import ji.g2;
import ji.h1;
import ji.h5;
import ji.j0;
import ji.j5;
import ji.n2;
import ji.q3;
import ji.v3;
import ji.z0;
import m.i1;
import mg.p;
import n4.y;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.kv0;
import rg.d2;
public final class m implements ek0, a0, kv0, androidx.activity.result.b, v0, OnSuccessListener, SuccessContinuation, p, d71, n, i1, s, a2, j0, g1, k2.n {
    public final int f315a;
    public Object f316b;

    public m(int i10, boolean z10) {
        this.f315a = i10;
    }

    public static com.google.android.gms.common.api.internal.p U(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override
    public void A(CharSequence charSequence) {
        q3 q3Var = ((z0) this.f316b).S;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                q3Var.f14129a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public void B(View view, j1 j1Var, boolean z10, boolean z11) {
        g0 g0Var = (g0) this.f316b;
        g0Var.f535a.ab(null, g0Var.f538e, g0Var.f536b, view, 0.0f, 0.0f, j1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.c(this, 2));
    }

    @Override
    public void C(h1 h1Var) {
        ji.a aVar;
        j5 j5Var = (j5) this.f316b;
        h5 h5Var = j5Var.f13997s;
        if (h5Var != null && (aVar = j5Var.f13749a) != null) {
            v3 v3Var = ((a3) h5Var).f13761a;
            ArrayList arrayList = v3Var.f14256l3;
            long j3 = aVar.f13748t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ji.a) arrayList.get(i11)).f13739k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    g2 g2Var = v3Var.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    ji.a aVar2 = new ji.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f13739k;
                    ArrayList arrayList3 = aVar2.f13739k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a4.a.x(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    v3Var.r4();
                    v3Var.Y2.N(false);
                    g2 g2Var2 = v3Var.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    v3Var.post(new n2(v3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public p9 D() {
        return (z0) this.f316b;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ((gb) ((o5) this.f316b).Q1).f(true);
    }

    @Override
    public ji.a F() {
        return ((z0) this.f316b).f13749a;
    }

    @Override
    public a0.i G() {
        switch (this.f315a) {
            case 22:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void H(MessageObject messageObject) {
        ((gb) ((o5) this.f316b).Q1).f(false);
    }

    @Override
    public void K() {
        ((androidx.media3.decoder.ffmpeg.b) this.f316b).Z = true;
    }

    @Override
    public boolean L() {
        z0 z0Var = (z0) this.f316b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.f13749a;
            if (q3Var.f14129a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        z0 z0Var = (z0) this.f316b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.f13749a;
            g2 g2Var = q3Var.f14129a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void N(Editable editable) {
        ((j5) this.f316b).h();
    }

    @Override
    public void O(k2.k kVar) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override
    public void P() {
        z0 z0Var = (z0) this.f316b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.f13749a;
            v3 v3Var = q3Var.f14129a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.f14249h3.onContentChanged();
        }
    }

    @Override
    public boolean Q(int i10) {
        switch (this.f315a) {
            case 22:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean R(boolean z10) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void V(k2.k kVar) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 1));
        }
    }

    public aa.a X(pf.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.X(pf.b):aa.a");
    }

    @Override
    public void Y(ArrayList arrayList) {
        switch (this.f315a) {
            case 22:
                k1 k1Var = (k1) this.f316b;
                String str = k1Var.Z;
                if (str != null) {
                    k1Var.U(str, k1Var.f11131c0, k1Var.f11132d0, k1Var.f11129b0, k1Var.f11128a0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public dc.d Z(com.google.firebase.messaging.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.Z(com.google.firebase.messaging.m):dc.d");
    }

    @Override
    public void a(h1 h1Var) {
        switch (this.f315a) {
            case 26:
                q3 q3Var = ((z0) this.f316b).S;
                if (q3Var != null) {
                    v3 v3Var = q3Var.f14129a;
                    v3.L1(v3Var, h1Var);
                    v3Var.f14249h3.v(h1Var, true);
                    return;
                }
                return;
            default:
                h5 h5Var = ((j5) this.f316b).f13997s;
                if (h5Var != null) {
                    v3 v3Var2 = ((a3) h5Var).f13761a;
                    v3.L1(v3Var2, h1Var);
                    v3Var2.f14249h3.v(h1Var, true);
                    return;
                }
                return;
        }
    }

    public void a0() {
        ((t) this.f316b).d.R();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f315a) {
            case 19:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f316b);
                iVar.T0(O0, 6);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f316b).f11882k;
                Parcel K0 = iVar2.K0();
                int i10 = i7.f.f11886a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                return;
        }
    }

    @Override
    public void b(long j3) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new bi.g(yVar, j3, 12));
        }
    }

    public void c(HashMap hashMap) {
        if (((SparseArray) this.f316b) == null) {
            this.f316b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f316b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public void c0() {
        z0 z0Var = (z0) this.f316b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.f13749a;
            v3.N1(q3Var.f14129a);
        }
    }

    @Override
    public void d() {
        ((androidx.media3.decoder.ffmpeg.b) this.f316b).f1679f0 = true;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void f(int i10) {
        switch (this.f315a) {
            case 22:
                ((k1) this.f316b).l();
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this, 0));
                return;
        }
    }

    @Override
    public void f0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.f0(java.lang.Object):void");
    }

    @Override
    public void g() {
        z0 z0Var = (z0) this.f316b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            v3.O1(q3Var.f14129a, z0Var.f13749a);
        }
    }

    @Override
    public boolean h(h1 h1Var) {
        return false;
    }

    @Override
    public Object h2() {
        Class cls = (Class) this.f316b;
        try {
            return fb.s.f9458a.a(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }

    @Override
    public TextureView i0() {
        return null;
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f316b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f895b;
        int i10 = aVar.f894a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = u.e("ProxyBillingActivityV2", intent).f4397a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public boolean k(h1 h1Var) {
        return false;
    }

    @Override
    public void m(k6.a aVar) {
        x xVar = (x) this.f316b;
        xVar.f5132o.lock();
        try {
            xVar.f5129l = aVar;
            x.l(xVar);
        } finally {
            xVar.f5132o.unlock();
        }
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void o(h1 h1Var, int i10, int i11) {
        h5 h5Var;
        q9 textSelectionHelper;
        j5 j5Var = (j5) this.f316b;
        if (!j5Var.f13998w && i10 != i11 && (h5Var = j5Var.f13997s) != null && (textSelectionHelper = ((a3) h5Var).f13761a.getTextSelectionHelper()) != null) {
            h1Var.post(new y4(this, h1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new ah.g(yVar, i10, 12));
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new ah.u(8, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.f316b;
        z6 z6Var = d7Var.M;
        g71 g71Var = d7Var.f7099x;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f316b).getClass();
        v7.h5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        d2 d2Var = ((d7) this.f316b).f7097w;
        if (d2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(d2Var.f45168y0 - f10) >= 1.0E-4f) {
                d2Var.f45168y0 = f10;
                d2Var.requestLayout();
            }
        }
    }

    @Override
    public void p(int i10) {
        k6.a aVar;
        x xVar = (x) this.f316b;
        Lock lock = xVar.f5132o;
        lock.lock();
        try {
            if (!xVar.f5131n && (aVar = xVar.f5130m) != null && aVar.c()) {
                xVar.f5131n = true;
                xVar.f5124e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f5131n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void q(int i10, long j3, long j10) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void s() {
        ((m0) this.f316b).f7623e.invalidate();
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.b bVar = (da.b) this.f316b;
        a4.m mVar = (a4.m) bVar.f6655f;
        da.d dVar = (da.d) bVar.f6652b;
        String str = (String) mVar.f283b;
        FileWriter fileWriter2 = null;
        try {
            HashMap i02 = a4.m.i0(dVar);
            aa.a aVar = new aa.a(str, i02);
            aVar.x("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            a4.m.g0(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + i02;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = mVar.j0(aVar.m());
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a O = ((xa.c) bVar.f6653c).O(jSONObject);
            i iVar = (i) bVar.f6654e;
            long j3 = O.f6648c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) iVar.f312b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f6662f;
                        SharedPreferences.Editor edit = ((Context) bVar.f6651a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(O);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f6657i).get()).trySetResult(O);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f6662f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f6651a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(O);
            ((TaskCompletionSource) ((AtomicReference) bVar.f6657i).get()).trySetResult(O);
        }
        return Tasks.forResult(null);
    }

    @Override
    public q9 u() {
        q3 q3Var = ((z0) this.f316b).S;
        if (q3Var == null) {
            return null;
        }
        return q3Var.f14129a.getTextSelectionHelper();
    }

    @Override
    public void v(Bundle bundle) {
        x xVar = (x) this.f316b;
        xVar.f5132o.lock();
        try {
            Bundle bundle2 = xVar.f5128k;
            if (bundle2 == null) {
                xVar.f5128k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f5129l = k6.a.f14804e;
            x.l(xVar);
        } finally {
            xVar.f5132o.unlock();
        }
    }

    @Override
    public a0.i w() {
        switch (this.f315a) {
            case 22:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x() {
        x2.p pVar;
        androidx.media3.decoder.ffmpeg.b bVar = (androidx.media3.decoder.ffmpeg.b) this.f316b;
        synchronized (bVar.f11494a) {
            pVar = bVar.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public void z(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.f316b).I;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    public m(r rVar, String[] strArr) {
        this.f315a = 19;
        this.f316b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public m(Object obj, int i10) {
        this.f315a = i10;
        this.f316b = obj;
    }

    public m(int i10) {
        this.f315a = i10;
        switch (i10) {
            case 10:
                this.f316b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 20:
                this.f316b = new m(21);
                return;
            case 21:
                this.f316b = new i(fc.a.h, 20);
                return;
            default:
                this.f316b = new e2.v(10);
                return;
        }
    }

    @Override
    public void J() {
    }

    @Override
    public void T() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void l() {
    }

    @Override
    public void r() {
    }

    private final void d0(ArrayList arrayList) {
    }

    @Override
    public void E(boolean z10) {
    }

    @Override
    public void W(boolean z10) {
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
    public void y(CharSequence charSequence) {
    }

    @Override
    public void i(int i10, int i11) {
    }

    @Override
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override
    public void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
