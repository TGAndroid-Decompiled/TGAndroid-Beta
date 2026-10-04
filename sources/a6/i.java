package a6;

import a3.m0;
import ai.fc;
import ai.g6;
import ai.gc;
import ai.h6;
import ai.q4;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import b5.p;
import ci.b7;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.n;
import fi.s0;
import fi.t0;
import g6.q;
import g6.r;
import gg.b2;
import gg.k1;
import i2.j0;
import ii.e2;
import ii.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.f01;
import org.telegram.ui.lz0;
import org.telegram.ui.yn;
import org.telegram.ui.zi0;
public final class i implements m0, s, fc, a0, androidx.activity.result.b, p, ya0, a81, k0, v0, OnCompleteListener, f6.a, n, s0, w, b2, he.a, so0, d5 {
    public static i f324c;
    public final int f325a;
    public Object f326b;

    public i(r rVar, String[] strArr) {
        this.f325a = 24;
        this.f326b = strArr;
    }

    public static boolean N(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String Q(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static synchronized i R(Context context) {
        i T;
        synchronized (i.class) {
            T = T(context.getApplicationContext());
        }
        return T;
    }

    public static synchronized i T(Context context) {
        synchronized (i.class) {
            i iVar = f324c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f324c = iVar2;
            return iVar2;
        }
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public void B() {
        j0 j0Var = ((a3.n) this.f326b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void C(ArrayList arrayList) {
        k1 k1Var = (k1) this.f326b;
        String str = k1Var.Z;
        if (str != null) {
            k1Var.U(str, k1Var.f10671c0, k1Var.f10672d0, k1Var.f10669b0, k1Var.f10668a0);
        }
    }

    @Override
    public com.google.android.gms.common.api.internal.e E(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void F(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((ci.m) this.f326b).f5518f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public boolean H(String str) {
        String M = M(str);
        if (!"1".equals(M) && !Boolean.parseBoolean(M)) {
            return false;
        }
        return true;
    }

    public Integer I(String str) {
        String M = M(str);
        if (!TextUtils.isEmpty(M)) {
            try {
                return Integer.valueOf(Integer.parseInt(M));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + Q(str) + "(" + M + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray J(String str) {
        String M = M(str);
        if (!TextUtils.isEmpty(M)) {
            try {
                return new JSONArray(M);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + Q(str) + ": " + M + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        e2 e2Var = (e2) this.f326b;
        e2Var.s0(i10, i11, z10);
        zi0 zi0Var = e2Var.O0;
        if (zi0Var != null) {
            zi0Var.i();
            e2Var.O0 = null;
        }
    }

    public String L(Resources resources, String str, String str2) {
        String[] strArr;
        String M = M(str2);
        if (!TextUtils.isEmpty(M)) {
            return M;
        }
        String M2 = M(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(M2)) {
            return null;
        }
        int identifier = resources.getIdentifier(M2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Q(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray J = J(str2.concat("_loc_args"));
        if (J == null) {
            strArr = null;
        } else {
            int length = J.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = J.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + Q(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e7);
            return null;
        }
    }

    public String M(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f326b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle O() {
        Bundle bundle = (Bundle) this.f326b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public da.a P(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.s2((na.d) this.f326b, jSONObject);
    }

    public synchronized void S() {
        synchronized (this) {
            b bVar = (b) this.f326b;
            ReentrantLock reentrantLock = bVar.f307a;
            reentrantLock.lock();
            bVar.f308b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void a(int i10) {
        ((k1) this.f326b).l();
    }

    @Override
    public void a0(long j3, int i10, ai.d5 d5Var) {
        int i11 = ProfileStoriesView.f34494s0;
        ((lz0) this.f326b).f(true, false);
        d5Var.run();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f325a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f331a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f326b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 1);
                return;
            case 24:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f326b);
                iVar.T0(O0, 7);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f326b).f11987k;
                Parcel K0 = iVar2.K0();
                int i11 = i7.f.f11991a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                return;
        }
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f326b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        g.r rVar;
        g.s sVar = (g.s) this.f326b;
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
        g.r[] rVarArr = sVar.U;
        if (rVarArr != null) {
            i10 = rVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                rVar = rVarArr[i11];
                if (rVar != null && rVar.h == kVar) {
                    break;
                }
                i11++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (z11) {
                sVar.f(rVar.f10080a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z10);
        }
    }

    @Override
    public void close() {
        ((fi.s) this.f326b).finishFragment();
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f326b).createWebView(webView));
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((z) this.f326b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f326b).getStatics());
    }

    @Override
    public void h() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f326b;
        m0Var.f6582a.lock();
        try {
            m0Var.f6591m = new g0(m0Var, m0Var.f6588j, m0Var.f6589k, m0Var.d, m0Var.f6590l, m0Var.f6582a, m0Var.f6584c);
            m0Var.f6591m.u();
            m0Var.f6583b.signalAll();
        } finally {
            m0Var.f6582a.unlock();
        }
    }

    @Override
    public void i(k6.a aVar) {
        x xVar = (x) this.f326b;
        xVar.f6659o.lock();
        try {
            xVar.f6657m = aVar;
            x.l(xVar);
        } finally {
            xVar.f6659o.unlock();
        }
    }

    @Override
    public boolean i1(long j3, int i10, int i11, int i12, gc gcVar) {
        ImageReceiver imageReceiver;
        h6 h6Var;
        h6 h6Var2;
        h6 h6Var3;
        h6 h6Var4;
        gcVar.f990b = null;
        gcVar.f991c = null;
        lz0 lz0Var = (lz0) this.f326b;
        f01 f01Var = lz0Var.h;
        ArrayList arrayList = lz0Var.f34520w;
        if (lz0Var.N < 0.2f) {
            gcVar.f990b = f01Var.getImageReceiver();
            gcVar.f991c = null;
            gcVar.f989a = f01Var;
            gcVar.h = 0.0f;
            gcVar.f995i = AndroidUtilities.displaySize.y;
            gcVar.f994g = (View) lz0Var.getParent();
            gcVar.d = lz0Var.f34522y;
            gcVar.f1000n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                h6 h6Var5 = (h6) arrayList.get(i13);
                if (h6Var5.f1029e >= 1.0f && h6Var5.f1026a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        h6Var3 = (h6) arrayList.get(i14);
                    } else {
                        h6Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        h6Var4 = (h6) arrayList.get(i15);
                    } else {
                        h6Var4 = null;
                    }
                    h6 d = ProfileStoriesView.d(h6Var3, h6Var4, h6Var5);
                    imageReceiver = h6Var5.f1027b;
                    h6Var2 = d;
                    h6Var = h6Var5;
                }
                i13++;
            } else {
                imageReceiver = null;
                h6Var = null;
                h6Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        gcVar.f991c = imageReceiver;
        gcVar.f990b = null;
        gcVar.f989a = lz0Var;
        gcVar.h = 0.0f;
        gcVar.f995i = AndroidUtilities.displaySize.y;
        gcVar.f994g = (View) lz0Var.getParent();
        if (h6Var != null && h6Var2 != null) {
            gcVar.f993f = new g6(this, new RectF(h6Var.f1036m), h6Var, new RectF(h6Var2.f1036m), h6Var2);
            return true;
        }
        gcVar.f993f = null;
        return true;
    }

    @Override
    public void j(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f325a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f326b;
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
                androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = g0Var.f2609a;
                if (k0Var.f2620c.l(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f326b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f2083b;
                int i12 = aVar.f2082a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i12 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                }
                int i13 = u.e("ProxyBillingActivityV2", intent).f4204a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i13, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i13 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void k(long j3) {
        ((fi.s) this.f326b).presentFragment(yn.Q9(j3));
    }

    @Override
    public void l() {
        boolean z10;
        fi.s sVar = (fi.s) this.f326b;
        le.b bVar = sVar.f9965a;
        t0 t0Var = sVar.v;
        if (t0Var.f9986n && t0Var.f9984l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.f25250f3.N(true);
    }

    @Override
    public void m(Bitmap bitmap) {
        ((f6.i) this.f326b).e(bitmap, 3);
    }

    @Override
    public String[] n() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f326b).getSupportedFeatures();
    }

    @Override
    public void o(int i10) {
        x xVar = (x) this.f326b;
        Lock lock = xVar.f6659o;
        lock.lock();
        try {
            if (xVar.f6658n) {
                xVar.f6658n = false;
                x.k(xVar, i10);
            } else {
                xVar.f6658n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f326b).f8148c, "launchApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f326b;
        Surface surface = nVar.f173n1;
        if (surface != null) {
            nVar.Z0.M(surface);
            nVar.f176q1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.f326b;
        z6 z6Var = b7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        d81 d81Var = b7Var.f4771y;
        if (d81Var != null && d81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.f326b).i();
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f326b;
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
    public void q() {
        a3.n nVar = (a3.n) this.f326b;
        if (nVar.f173n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override
    public Paint.FontMetricsInt r() {
        return ((ci.m) this.f326b).f5518f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void s(Bundle bundle) {
        x xVar = (x) this.f326b;
        xVar.f6659o.lock();
        try {
            xVar.f6657m = k6.a.f14663e;
            x.l(xVar);
        } finally {
            xVar.f6659o.unlock();
        }
    }

    @Override
    public void u() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f326b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f6586f.values()) {
            cVar.disconnect();
        }
        m0Var.f6593o.F = Collections.EMPTY_SET;
    }

    @Override
    public boolean v(l.k kVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.f326b;
        if (kVar == kVar.k() && sVar.O && (callback = sVar.f10103f.getCallback()) != null && !sVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void w0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.f326b;
        Handler handler = e0Var.A0;
        q4 q4Var = e0Var.B0;
        handler.removeCallbacks(q4Var);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(q4Var, 2000L);
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    public i(Object obj, int i10) {
        this.f325a = i10;
        this.f326b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(Context context) {
        String d;
        this.f325a = 0;
        b a2 = b.a(context);
        this.f326b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i10) {
        this.f325a = i10;
        switch (i10) {
            case 8:
                this.f326b = new e2.v(10);
                return;
            case 9:
                return;
            default:
                this.f326b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public i(Bundle bundle) {
        this.f325a = 15;
        this.f326b = new Bundle(bundle);
    }

    @Override
    public void D() {
    }

    @Override
    public void G(String str) {
    }

    @Override
    public void e(Bundle bundle) {
    }

    @Override
    public void f(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void t(int i10) {
    }

    @Override
    public void onError(d81 d81Var, Exception exc) {
    }

    @Override
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void p(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
