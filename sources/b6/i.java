package b6;

import a3.n;
import a3.n0;
import ag.r0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import b2.b2;
import bi.r3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.x;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.p9;
import di.q4;
import f9.g1;
import fi.m6;
import fi.o6;
import g.q;
import i2.m0;
import ig.y1;
import ig.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k2.u;
import k2.v0;
import k2.y;
import l.w;
import li.f2;
import li.i0;
import li.q3;
import li.v3;
import li.y0;
import ng.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.t;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.c20;
import org.telegram.ui.lx;
import org.telegram.ui.yu0;
import sg.d2;
public final class i implements n0, a0, androidx.activity.result.b, iw0, j0, u0, yu0, OnSuccessListener, g1, o, p81, w, r, z1, y, i0 {
    public static i f3668c;
    public final int f3669a;
    public Object f3670b;

    public i(int i10, boolean z10) {
        this.f3669a = i10;
    }

    public static boolean Y(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String d0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static synchronized i e0(Context context) {
        i h02;
        synchronized (i.class) {
            h02 = h0(context.getApplicationContext());
        }
        return h02;
    }

    public static synchronized i h0(Context context) {
        synchronized (i.class) {
            i iVar = f3668c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f3668c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void A() {
        m0 m0Var = ((n) this.f3670b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override
    public void B(boolean z10) {
        switch (this.f3669a) {
            case 7:
                oe.b bVar = ((bi.y) this.f3670b).f5737s;
                if (bVar != null) {
                    bVar.a(z10, true);
                    return;
                }
                return;
            default:
                gi.h hVar = (gi.h) this.f3670b;
                oe.b bVar2 = hVar.Y;
                if (bVar2 != null) {
                    bVar2.a(z10, true);
                }
                c20 c20Var = hVar.f38720s;
                if (c20Var != null) {
                    c20Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void B0(MessageObject messageObject) {
        ((p9) ((q4) this.f3670b).F1).f(true);
    }

    @Override
    public s9 C() {
        q3 q3Var = ((y0) this.f3670b).S;
        if (q3Var == null) {
            return null;
        }
        return q3Var.f17429a.getTextSelectionHelper();
    }

    @Override
    public void D(v0 v0Var) {
        rf.b bVar = ((FfmpegAudioRenderer) this.f3670b).I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 1));
        }
    }

    @Override
    public void E(MessageObject messageObject) {
        ((p9) ((q4) this.f3670b).F1).f(false);
    }

    @Override
    public boolean F() {
        return true;
    }

    @Override
    public com.google.android.gms.common.api.internal.e G(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void I(CharSequence charSequence) {
        q3 q3Var = ((y0) this.f3670b).S;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                q3Var.f17429a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public void J(v0 v0Var) {
        rf.b bVar = ((FfmpegAudioRenderer) this.f3670b).I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 0));
        }
    }

    @Override
    public r9 K() {
        return (y0) this.f3670b;
    }

    @Override
    public li.a L() {
        return ((y0) this.f3670b).f17653a;
    }

    @Override
    public boolean M() {
        y0 y0Var = (y0) this.f3670b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.f17653a;
            if (q3Var.f17429a.Y4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void O(int i10, int i11) {
        y0 y0Var = (y0) this.f3670b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.f17653a;
            f2 f2Var = q3Var.f17429a.R3;
            if (f2Var != null) {
                f2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void Q(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.f3670b;
        Handler handler = e0Var.A0;
        a5.d dVar = e0Var.B0;
        handler.removeCallbacks(dVar);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(dVar, 2000L);
    }

    public boolean R(String str) {
        String X = X(str);
        if (!"1".equals(X) && !Boolean.parseBoolean(X)) {
            return false;
        }
        return true;
    }

    @Override
    public void S() {
        y0 y0Var = (y0) this.f3670b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.f17653a;
            v3 v3Var = q3Var.f17429a;
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.f17557p3.onContentChanged();
        }
    }

    public Integer T(String str) {
        String X = X(str);
        if (!TextUtils.isEmpty(X)) {
            try {
                return Integer.valueOf(Integer.parseInt(X));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + d0(str) + "(" + X + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public a0.h U() {
        return null;
    }

    public JSONArray V(String str) {
        String X = X(str);
        if (!TextUtils.isEmpty(X)) {
            try {
                return new JSONArray(X);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + d0(str) + ": " + X + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    @Override
    public float V0() {
        int i10;
        int currentActionBarHeight;
        switch (this.f3669a) {
            case 7:
                i10 = bi.y.b0((bi.y) this.f3670b).f13451b;
                currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
                break;
            default:
                i10 = ((gi.h) this.f3670b).f12504b0;
                currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
                break;
        }
        return t.c(9.0f, (currentActionBarHeight * 2) + i10, 0);
    }

    public String W(Resources resources, String str, String str2) {
        String[] strArr;
        String X = X(str2);
        if (!TextUtils.isEmpty(X)) {
            return X;
        }
        String X2 = X(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(X2)) {
            return null;
        }
        int identifier = resources.getIdentifier(X2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", d0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray V = V(str2.concat("_loc_args"));
        if (V == null) {
            strArr = null;
        } else {
            int length = V.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = V.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + d0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String X(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f3670b;
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

    public Bundle Z() {
        Bundle bundle = (Bundle) this.f3670b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void a(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f3670b;
        ffmpegAudioRenderer.f2872g0 = true;
        rf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new r3(bVar, j10, 13));
        }
    }

    @Override
    public void a0() {
        y0 y0Var = (y0) this.f3670b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.f17653a;
            v3.U1(q3Var.f17429a);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f3669a) {
            case 25:
                i7.f fVar = new i7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = r7.a.f47304a;
                obtain.writeStrongBinder(fVar);
                r7.a.b(obtain, (h7.f) this.f3670b);
                r7.a.b(obtain, gVar);
                ((i7.b) ((i7.d) ((i7.e) obj).u())).F0(obtain, 6);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                j7.i iVar = (j7.i) ((j7.c) obj).u();
                Parcel J0 = iVar.J0();
                int i11 = j7.f.f15538a;
                J0.writeStrongBinder(lVar);
                j7.f.c(J0, (y5.e) this.f3670b);
                iVar.K0(J0, 1);
                return;
        }
    }

    @Override
    public void b(li.g1 g1Var) {
        q3 q3Var = ((y0) this.f3670b).S;
        if (q3Var != null) {
            v3 v3Var = q3Var.f17429a;
            v3.S1(v3Var, g1Var);
            v3Var.f17557p3.s(g1Var, true);
        }
    }

    public fa.a b0(JSONObject jSONObject) {
        qb.a aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new Object();
        } else {
            aVar = new qb.a(8);
        }
        return aVar.E((sb.b) this.f3670b, jSONObject);
    }

    @Override
    public int b1() {
        switch (this.f3669a) {
            case 7:
                return bi.y.c0((bi.y) this.f3670b).d;
            default:
                return ((gi.h) this.f3670b).f12505c0;
        }
    }

    public b2.u0 c0(c3.p r12, q3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: b6.i.c0(c3.p, q3.g, int):b2.u0");
    }

    @Override
    public void d(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f3669a) {
            case 4:
                Map map = (Map) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f3670b;
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
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = e0Var.f2624a;
                if (i0Var.f2638c.g(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f3670b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f2134b;
                int i12 = aVar.f2133a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i12 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                }
                int i13 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f7985a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i13, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i13 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void f(int i10) {
        boolean z10;
        wo0 wo0Var = (wo0) this.f3670b;
        wo0Var.D0--;
        wo0Var.f14077e0 = i10;
        if (wo0Var.f14079f0 != i10) {
            wo0Var.f14093s.clear();
        }
        if (wo0Var.f14080g0 != i10) {
            wo0Var.I.clear();
        }
        wo0Var.N = true;
        lx lxVar = wo0Var.U;
        if (lxVar != null) {
            if (wo0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lxVar.d(z10, true);
        }
        wo0Var.l();
        lx lxVar2 = wo0Var.U;
        if (lxVar2 != null) {
            lxVar2.c();
        }
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public void g(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        q qVar;
        g.r rVar = (g.r) this.f3670b;
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
                rVar.f(qVar.f12154a, qVar, k10);
                rVar.h(qVar, true);
                return;
            }
            rVar.h(qVar, z10);
        }
    }

    public synchronized void g0() {
        synchronized (this) {
            b bVar = (b) this.f3670b;
            ReentrantLock reentrantLock = bVar.f3652a;
            reentrantLock.lock();
            bVar.f3653b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void h() {
        y0 y0Var = (y0) this.f3670b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            v3.V1(q3Var.f17429a, y0Var.f17653a);
        }
    }

    @Override
    public void i() {
        ((FfmpegAudioRenderer) this.f3670b).f2871f0 = true;
    }

    @Override
    public void k() {
        l0 l0Var = (l0) this.f3670b;
        l0Var.f6565a.lock();
        try {
            l0Var.f6573m = new f0(l0Var, l0Var.f6570j, l0Var.f6571k, l0Var.d, l0Var.f6572l, l0Var.f6565a, l0Var.f6567c);
            l0Var.f6573m.u();
            l0Var.f6566b.signalAll();
        } finally {
            l0Var.f6565a.unlock();
        }
    }

    @Override
    public boolean k0(int i10) {
        if (i10 == ((wo0) this.f3670b).f14076d0) {
            return true;
        }
        return false;
    }

    @Override
    public Object l(Object obj, Object obj2) {
        return ((e9.k) this.f3670b).apply(obj2);
    }

    @Override
    public void m(int i10, long j10, long j11) {
        rf.b bVar = ((FfmpegAudioRenderer) this.f3670b).I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new k2.t(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public void n() {
        x2.o oVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f3670b;
        synchronized (ffmpegAudioRenderer.f13490a) {
            oVar = ffmpegAudioRenderer.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        rf.b bVar = ((FfmpegAudioRenderer) this.f3670b).I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new r0(bVar, i10, 15));
        }
    }

    @Override
    public void onFirstFrameRendered() {
        n nVar = (n) this.f3670b;
        Surface surface = nVar.f163r1;
        if (surface != null) {
            nVar.f148b1.E(surface);
            nVar.f166u1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        rf.b bVar = ((FfmpegAudioRenderer) this.f3670b).I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new bh.n(12, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        o6 o6Var = (o6) this.f3670b;
        m6 m6Var = o6Var.M;
        s81 s81Var = o6Var.f11391x;
        if (s81Var == null) {
            return;
        }
        if (s81Var.y()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        a2 a2Var;
        a1 b10;
        e6.a aVar = (e6.a) this.f3670b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.m0.f6825j) {
            Context context = aVar.f9783a;
            h6.r rVar = aVar.f9786f;
            com.google.android.gms.internal.cast.m0 m0Var = new com.google.android.gms.internal.cast.m0(context, rVar, aVar.f9785c, aVar.f9789j, aVar.f9787g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z10) {
                    i10 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String u10 = b10.u(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            m0Var.h = i11;
            m5.t.b(context);
            m0Var.f6830g = m5.t.a().c(k5.a.e).a("CAST_SENDER_SDK", new j5.c("proto"), x.f6956a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.u b11 = v.b();
                b11.f6622c = new c3.l0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new l6.c[]{d6.y.f8153c};
                b11.f6621b = false;
                b11.f6620a = 8426;
                Task e = rVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f16424b = m0Var;
                obj2.f16425c = packageName;
                obj2.f16423a = i10;
                obj2.d = sharedPreferences;
                e.addOnSuccessListener(obj2);
            }
            if (z10) {
                o6.l.h(sharedPreferences);
                h6.b bVar = a2.f6722i;
                synchronized (a2.class) {
                    try {
                        if (a2.f6724k == null) {
                            a2.f6724k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.f6724k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.f6727c;
                SharedPreferences sharedPreferences2 = a2Var.f6726b;
                HashSet hashSet = a2Var.f6728f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.f6729g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.f6723j;
                if (str2.equals(string) && str.equals(string2)) {
                    a2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
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
                    o6.l.h(a2Var.e);
                    o6.l.h(a2Var.d);
                    a2Var.e.post(a2Var.d);
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
    public void onVideoSizeChanged(b2 b2Var) {
    }

    @Override
    public void p(int i10) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f3670b;
        Lock lock = wVar.f6636o;
        lock.lock();
        try {
            if (wVar.f6635n) {
                wVar.f6635n = false;
                com.google.android.gms.common.api.internal.w.k(wVar, i10);
            } else {
                wVar.f6635n = true;
                wVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void p0(ArrayList arrayList) {
        boolean z10;
        wo0 wo0Var = (wo0) this.f3670b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            wo0Var.J.add(((y1) arrayList.get(i10)).f14305a);
        }
        lx lxVar = wo0Var.U;
        if (lxVar != null) {
            if (wo0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lxVar.d(z10, false);
        }
        wo0Var.l();
    }

    @Override
    public void q() {
        ((fi.m0) this.f3670b).e.invalidate();
    }

    @Override
    public void r(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        rf.b bVar = ((FfmpegAudioRenderer) this.f3670b).I;
        Handler handler = (Handler) bVar.f47335b;
        if (handler != null) {
            handler.post(new k2.r(bVar, exc, 1));
        }
    }

    @Override
    public void s(Bundle bundle) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f3670b;
        wVar.f6636o.lock();
        try {
            wVar.f6634m = l6.a.e;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.f6636o.unlock();
        }
    }

    @Override
    public boolean t(l.k kVar) {
        Window.Callback callback;
        g.r rVar = (g.r) this.f3670b;
        if (kVar == kVar.k() && rVar.O && (callback = rVar.f12175f.getCallback()) != null && !rVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void u() {
        l0 l0Var = (l0) this.f3670b;
        for (com.google.android.gms.common.api.c cVar : l0Var.f6568f.values()) {
            cVar.disconnect();
        }
        l0Var.f6575o.F = Collections.EMPTY_SET;
    }

    @Override
    public void v() {
        ((FfmpegAudioRenderer) this.f3670b).Z = true;
    }

    @Override
    public void w(l6.a aVar) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f3670b;
        wVar.f6636o.lock();
        try {
            wVar.f6634m = aVar;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.f6636o.unlock();
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void z() {
        n nVar = (n) this.f3670b;
        if (nVar.f163r1 != null) {
            nVar.R0(0, 1);
        }
    }

    public i(j7.b bVar, y5.e eVar) {
        this.f3669a = 27;
        this.f3670b = eVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        d2 d2Var = ((o6) this.f3670b).f11389w;
        if (d2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(d2Var.f48188y0 - f10) >= 1.0E-4f) {
                d2Var.f48188y0 = f10;
                d2Var.requestLayout();
            }
        }
    }

    public i(Object obj, int i10) {
        this.f3669a = i10;
        this.f3670b = obj;
    }

    public i(Context context) {
        String d;
        this.f3669a = 0;
        b a2 = b.a(context);
        this.f3670b = a2;
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
        this.f3669a = i10;
        switch (i10) {
            case 6:
                this.f3670b = new rf.b[bg.b.values().length];
                return;
            case 8:
                this.f3670b = new e2.x(10);
                return;
            case 17:
                this.f3670b = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
            default:
                this.f3670b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public i(Bundle bundle) {
        this.f3669a = 12;
        this.f3670b = new Bundle(bundle);
    }

    @Override
    public void N() {
    }

    @Override
    public void P() {
    }

    @Override
    public void j() {
    }

    @Override
    public void H(boolean z10) {
    }

    @Override
    public void c(Bundle bundle) {
    }

    @Override
    public void o(int i10) {
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
    public void x(boolean z10) {
    }

    @Override
    public void onError(s81 s81Var, Exception exc) {
    }

    @Override
    public void e(l6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
