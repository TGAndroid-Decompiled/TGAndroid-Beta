package cb;

import a0.f;
import a8.m1;
import a8.p0;
import a8.t6;
import ai.e;
import ai.s0;
import ai.y0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.a0;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.Window;
import androidx.biometric.q;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.z;
import androidx.emoji2.text.k;
import androidx.fragment.app.e0;
import androidx.fragment.app.j0;
import b3.i;
import b3.j;
import bi.k7;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.x;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.i0;
import d3.l;
import d8.d;
import di.g9;
import di.i4;
import e2.x1;
import f6.y;
import fi.g;
import fi.w5;
import fi.x9;
import fi.y5;
import fi.za;
import g.s;
import j$.util.DesugarCollections;
import j6.r;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import l.w;
import m.q3;
import m6.n;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dr0;
import q6.m;
import sg.h;
import sg.j1;
import sg.l0;
import tg.l1;
public final class c implements SuccessContinuation, k, androidx.activity.result.b, co0, j, te.b, o0, i0, p, dr0, d90, l1, p51, za, w, OnSuccessListener {
    public static volatile c f6038c;
    public final int f6039a;
    public Object f6040b;

    public c(d0 d0Var) {
        this.f6039a = 15;
        this.f6040b = new WeakReference(d0Var);
    }

    public static o o(Looper looper, Object obj, String str) {
        m.h(obj, "Listener must not be null");
        m.h(looper, "Looper must not be null");
        return new o(looper, obj, str);
    }

    @Override
    public boolean A(l.k kVar) {
        Window.Callback callback = ((s) this.f6040b).f13362f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public void B(String str, String str2) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f6040b).putCharSequence(str, str2);
    }

    @Override
    public void C0() {
        cc k10 = ((k7) this.f6040b).k().k(false);
        k10.f32537t = true;
        k10.j();
    }

    public void D() {
        d0 d0Var = (d0) ((WeakReference) this.f6040b).get();
        if (d0Var == null) {
            return;
        }
        d0Var.l();
    }

    public void E(IBinder iBinder) {
        synchronized (((HashMap) this.f6040b)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new b9.a();
            for (Map.Entry entry : ((HashMap) this.f6040b).entrySet()) {
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
    public void F(float f10, int i7) {
        ch.o oVar = (ch.o) this.f6040b;
        oVar.f6343c.setLayerType(0, null);
        if (f10 == 0.0f && !oVar.O) {
            oVar.f6343c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.E.setFocusableInTouchMode(false);
            }
        }
        qs.e().k(qs.f25009k1, 512);
    }

    @Override
    public void I(ij ijVar) {
        ((g9) ((i4) this.f6040b).f9221z1).f(false);
    }

    @Override
    public void I0(ij ijVar) {
        ((g9) ((i4) this.f6040b).f9221z1).f(true);
    }

    @Override
    public Paint.FontMetricsInt R0() {
        return ((fi.m) this.f6040b).f12365f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void X(float f10) {
        x9 x9Var = (x9) this.f6040b;
        l0.e(x9Var.f12538o1).k(String.valueOf(h.f54968a.indexOf(x9Var.f12555x0.getCurrentBrush())), f10);
        j1 j1Var = x9Var.f12531j1;
        j1Var.f55019c = f10;
        x9Var.B0(j1Var, null, false);
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((ch.o) this.f6040b).j0(f10);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        d dVar = new d(0, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i7 = d8.a.f8212a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        ((o8.a) this.f6040b).writeToParcel(obtain, 0);
        ((d8.c) ((d8.f) obj).n()).H0(obtain, 2);
    }

    @Override
    public void b(t6 t6Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new aa.s(this, t6Var, threadPoolExecutor, 6));
    }

    @Override
    public void c(l.k kVar, boolean z9) {
        ((s) this.f6040b).g(kVar);
    }

    @Override
    public void d(n6.a aVar) {
        f1 f1Var = (f1) this.f6040b;
        f1Var.f6610o.lock();
        try {
            f1Var.f6608m = aVar;
            f1Var.j();
        } finally {
            f1Var.f6610o.unlock();
        }
    }

    @Override
    public void f(Object obj) {
        int i7;
        Bundle extras;
        switch (this.f6039a) {
            case 8:
                Map map = (Map) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f6040b;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Boolean) arrayList.get(i10)).booleanValue()) {
                        i7 = 0;
                    } else {
                        i7 = -1;
                    }
                    iArr[i10] = i7;
                }
                e0 e0Var = (e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = e0Var.f2384a;
                if (i0Var.f2398c.o(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f6040b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1859b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f11151a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar.f1858a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public float get() {
        x9 x9Var = (x9) this.f6040b;
        int i7 = x9Var.f12538o1;
        h currentBrush = x9Var.f12555x0.getCurrentBrush();
        if (currentBrush == null) {
            return l0.e(i7).f55041i;
        }
        return l0.e(i7).f(String.valueOf(h.f54968a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void i(int i7) {
        f1 f1Var = (f1) this.f6040b;
        Lock lock = f1Var.f6610o;
        Lock lock2 = f1Var.f6610o;
        lock.lock();
        try {
            if (f1Var.f6609n) {
                f1Var.f6609n = false;
                f1Var.f6600b.i(i7);
                f1Var.f6608m = null;
                f1Var.f6607l = null;
            } else {
                f1Var.f6609n = true;
                f1Var.d.onConnectionSuspended(i7);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override
    public void k(Bundle bundle) {
        f1 f1Var = (f1) this.f6040b;
        f1Var.f6610o.lock();
        try {
            f1Var.f6608m = n6.a.f20484f;
            f1Var.j();
        } finally {
            f1Var.f6610o.unlock();
        }
    }

    public void l(n nVar, v vVar) {
        j0 j0Var = (j0) this.f6040b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            j0 j0Var2 = (j0) this.f6040b;
            q qVar = (q) j0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                j0Var2.A(true);
                j0Var2.E();
            }
            androidx.fragment.app.u k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            z zVar = qVar.f2019l0;
            zVar.f2030f = nVar;
            int i7 = nVar.f19917a;
            if (i7 == 0) {
                if (vVar != null) {
                    i7 = 15;
                } else {
                    i7 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
                zVar.f2031g = m1.a();
            } else {
                zVar.f2031g = vVar;
            }
            if (qVar.Q()) {
                qVar.f2019l0.f2034k = qVar.q(2131689577);
            } else {
                qVar.f2019l0.f2034k = null;
            }
            if (qVar.Q() && new a0(new t(k10, 0)).d(255) != 0) {
                qVar.f2019l0.f2037n = true;
                qVar.S();
            } else if (qVar.f2019l0.f2039p) {
                qVar.f2018k0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public TextureView l0() {
        return null;
    }

    @Override
    public void m() {
        l lVar = (l) this.f6040b;
        if (lVar.f8047r1 != null) {
            lVar.R0(0, 1);
        }
    }

    public f6.o n() {
        f6.o oVar = (f6.o) this.f6040b;
        if (oVar.f11301a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f11304e)) {
                if (!Double.isNaN(oVar.f11305f) && oVar.f11305f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        ((o2.d) this.f6040b).f20725a.y(iOException);
        return b3.o.f2960e;
    }

    @Override
    public void o1(b3.l lVar, long j3, long j10) {
        boolean z9;
        o2.d dVar = (o2.d) this.f6040b;
        synchronized (c3.b.f5263b) {
            z9 = c3.b.f5264c;
        }
        if (!z9) {
            dVar.f20725a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.b();
    }

    @Override
    public void onFirstFrameRendered() {
        l lVar = (l) this.f6040b;
        Surface surface = lVar.f8047r1;
        if (surface != null) {
            lVar.f8033b1.g0(surface);
            lVar.f8050u1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        y5 y5Var = (y5) this.f6040b;
        w5 w5Var = y5Var.L;
        g0.r(w5Var);
        s51 s51Var = y5Var.D;
        if (s51Var != null && s51Var.d0()) {
            g0.h3(w5Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i7;
        int i10;
        a2 a2Var;
        a1 b10;
        g6.a aVar = (g6.a) this.f6040b;
        Bundle bundle = (Bundle) obj;
        if (m0.f6906j) {
            Context context = aVar.f13521a;
            r rVar = aVar.f13525f;
            m0 m0Var = new m0(context, rVar, aVar.f13523c, aVar.f13528j, aVar.f13526g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i7 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            boolean z9 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i7 == 0) {
                if (z9) {
                    i7 = 0;
                    z9 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String q10 = rf.b.q(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            m0Var.h = i10;
            o5.s.b(context);
            m0Var.f6912g = o5.s.a().c(m5.a.f19869e).a("CAST_SENDER_SDK", new l5.c("proto"), x.f7054a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.f6910e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(q10, 0);
            if (i7 != 0) {
                com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                b11.f6682c = new h9.f1(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 2);
                b11.d = new n6.c[]{y.f11347c};
                b11.f6681b = false;
                b11.f6680a = 8426;
                Task e10 = rVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f19918b = m0Var;
                obj2.f19919c = packageName;
                obj2.f19917a = i7;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z9) {
                m.g(sharedPreferences);
                j6.b bVar = a2.f6790i;
                synchronized (a2.class) {
                    try {
                        if (a2.f6792k == null) {
                            a2.f6792k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.f6792k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.f6795c;
                SharedPreferences sharedPreferences2 = a2Var.f6794b;
                HashSet hashSet = a2Var.f6797f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.f6798g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.f6791j;
                if (str2.equals(string) && str.equals(string2)) {
                    a2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                a1 b12 = a2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = a2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    a2Var.c(hashSet3);
                    m.g(a2Var.f6796e);
                    m.g(a2Var.d);
                    a2Var.f6796e.post(a2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    a2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                a2.a(a1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((y5) this.f6040b).i();
    }

    public int p(int[] iArr, int i7) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        int i12;
        ec.a aVar = (ec.a) this.f6040b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i13 = 1;
                while (i13 < length && iArr[i13] == 0) {
                    i13++;
                }
                if (i13 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i14 = length - i13;
                    int[] iArr4 = new int[i14];
                    System.arraycopy(iArr, i13, iArr4, 0, i14);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i7];
            boolean z9 = true;
            for (int i15 = 0; i15 < i7; i15++) {
                int i16 = aVar.f10727a[aVar.f10732g + i15];
                if (i16 == 0) {
                    i12 = iArr2[iArr2.length - 1];
                } else {
                    if (i16 == 1) {
                        i11 = 0;
                        for (int i17 : iArr2) {
                            ec.a aVar2 = ec.a.h;
                            i11 ^= i17;
                        }
                    } else {
                        i11 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i18 = 1; i18 < length2; i18++) {
                            i11 = aVar.c(i16, i11) ^ iArr2[i18];
                        }
                    }
                    i12 = i11;
                }
                iArr5[(i7 - 1) - i15] = i12;
                if (i12 != 0) {
                    z9 = false;
                }
            }
            if (z9) {
                return 0;
            }
            ec.b bVar = new ec.b(aVar, iArr5);
            ec.b a10 = aVar.a(i7, 1);
            ec.b bVar2 = aVar.f10729c;
            if (a10.d() >= bVar.d()) {
                a10 = bVar;
                bVar = a10;
            }
            ec.b bVar3 = aVar.d;
            ec.b bVar4 = a10;
            ec.b bVar5 = bVar;
            ec.b bVar6 = bVar4;
            ec.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i7) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    ec.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    ec.b a11 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        ec.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a11;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                ec.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                ec.b bVar10 = bVarArr[0];
                ec.b bVar11 = bVarArr[1];
                int d2 = bVar10.d();
                if (d2 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d2];
                    int i19 = 0;
                    for (int i20 = 1; i20 < aVar.f10730e && i19 < d2; i20++) {
                        if (bVar10.b(i20) == 0) {
                            iArr6[i19] = aVar.b(i20);
                            i19++;
                        }
                    }
                    if (i19 == d2) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i21 = 0; i21 < length3; i21++) {
                    int b12 = aVar.b(iArr3[i21]);
                    int i22 = 1;
                    for (int i23 = 0; i23 < length3; i23++) {
                        if (i21 != i23) {
                            int c12 = aVar.c(iArr3[i23], b12);
                            if ((c12 & 1) == 0) {
                                i10 = c12 | 1;
                            } else {
                                i10 = c12 & (-2);
                            }
                            i22 = aVar.c(i22, i10);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
                    iArr7[i21] = c13;
                    if (aVar.f10732g != 0) {
                        iArr7[i21] = aVar.c(c13, b12);
                    }
                }
                for (int i24 = 0; i24 < iArr3.length; i24++) {
                    int length4 = iArr.length - 1;
                    int i25 = iArr3[i24];
                    if (i25 != 0) {
                        int i26 = length4 - aVar.f10728b[i25];
                        if (i26 >= 0) {
                            iArr[i26] = iArr[i26] ^ iArr7[i24];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void q() {
        l2.l0 l0Var = ((l) this.f6040b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    public Set s() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f6040b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f6040b);
        }
        return unmodifiableSet;
    }

    @Override
    public void t(boolean z9, float f10) {
        ((e) this.f6040b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        aa.q qVar = ((aa.o) this.f6040b).f829e;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(aa.q.b(qVar), qVar.f844m.h(null, qVar.f837e.f3135a));
    }

    public void v(h6.m mVar) {
        q3 q3Var = (q3) this.f6040b;
        q3Var.f19226b = mVar;
        Iterator it = ((LinkedList) q3Var.f19227c).iterator();
        while (it.hasNext()) {
            ((a7.c) it.next()).b();
        }
        ((LinkedList) q3Var.f19227c).clear();
    }

    public void w(int i7) {
        boolean z9;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        y0 y0Var = ((s0) this.f6040b).f1620e;
        if (y0Var != null && y0Var.d != i7) {
            boolean z10 = true;
            if (y0Var.f1691c.d && i7 == 2) {
                i7 = 1;
            }
            y0Var.d = i7;
            SharedPreferences.Editor edit = y0Var.f().edit();
            if (y0Var.d == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z9).apply();
            int i10 = y0Var.d;
            if (i10 == 0) {
                if (y0Var.f1694n != 0) {
                    ConnectionsManager.getInstance(y0Var.f1689a).cancelRequest(y0Var.f1694n, true);
                    y0Var.f1694n = 0;
                    return;
                }
                return;
            }
            if (i10 == 2 && (c10 = y0Var.c()) != null) {
                y0Var.f1693f = c10;
                y0Var.f1690b.setFreeLink(y0Var.d(c10));
            }
            if (y0Var.d != 1) {
                z10 = false;
            }
            y0Var.n(false, z10);
        }
    }

    public void y(String str, Bitmap bitmap) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f6040b).putParcelable(str, bitmap);
    }

    public void z(long j3) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f6040b).putLong("android.media.metadata.DURATION", j3);
    }

    @Override
    public void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        g gVar = ((fi.m) this.f6040b).f12365f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z9) {
                i6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(Object obj, int i7) {
        this.f6039a = i7;
        this.f6040b = obj;
    }

    public c(MediaInfo mediaInfo) {
        this.f6039a = 23;
        f6.o oVar = new f6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f6040b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.f6039a = 23;
        this.f6040b = new f6.o(jSONObject);
    }

    public c(int i7) {
        this.f6039a = i7;
        switch (i7) {
            case 5:
                this.f6040b = new Bundle();
                return;
            case 10:
                this.f6040b = new HashMap();
                return;
            case 14:
                this.f6040b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 20:
                return;
            default:
                this.f6040b = new HashSet();
                return;
        }
    }

    public c(Context context) {
        this.f6039a = 7;
        this.f6040b = context.getApplicationContext();
    }

    public c(aa.o oVar, String str) {
        this.f6039a = 2;
        this.f6040b = oVar;
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.f6039a = 5;
        Bundle bundle = new Bundle(mediaMetadataCompat.f1728a);
        this.f6040b = bundle;
        a0.g(bundle);
    }

    @Override
    public void V() {
    }

    @Override
    public void W() {
    }

    @Override
    public void r() {
    }

    public c(LaunchActivity launchActivity, Executor executor, a8.l1 l1Var) {
        this.f6039a = 6;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            j0 s5 = launchActivity.s();
            z zVar = (z) new a0(launchActivity).i(z.class);
            this.f6040b = s5;
            zVar.d = executor;
            zVar.f2029e = l1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void G(float f10) {
    }

    @Override
    public void G1(String str) {
    }

    @Override
    public void J(long j3) {
    }

    @Override
    public void K(boolean z9) {
    }

    @Override
    public void O(float f10) {
    }

    @Override
    public void Q(float f10) {
    }

    @Override
    public void T(float f10) {
    }

    @Override
    public void a(x1 x1Var) {
    }

    @Override
    public void a0(float f10) {
    }

    @Override
    public void e(int i7) {
    }

    @Override
    public void e0(long j3) {
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void h(float f10) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void x(boolean z9) {
    }

    @Override
    public void C(float f10, int i7) {
    }

    @Override
    public void N(float f10, int i7) {
    }

    @Override
    public void S(float f10, int i7) {
    }

    @Override
    public void b0(int i7, long j3) {
    }

    @Override
    public void j(long j3, boolean z9) {
    }

    @Override
    public void onError(s51 s51Var, Exception exc) {
    }

    @Override
    public void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
    }

    @Override
    public void e1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void M0(b3.l lVar, long j3, long j10, int i7) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override
    public void q0(b3.l lVar, long j3, long j10, boolean z9) {
    }
}
