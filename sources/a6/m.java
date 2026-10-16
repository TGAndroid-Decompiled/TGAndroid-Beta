package a6;

import ab.e0;
import ah.f0;
import ah.i1;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.a0;
import bi.q5;
import c6.o;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.a7;
import di.i0;
import di.x6;
import g6.n;
import gb.p;
import hg.y1;
import hg.z1;
import i2.l0;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import ji.d2;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.p4;
import ji.r;
import ji.r4;
import ji.t3;
import ji.x3;
import k2.t;
import k2.t0;
import k2.x;
import k2.y0;
import l5.q;
import m.k1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.gj0;
import org.telegram.ui.ky;
import v7.r8;
public final class m implements fl0, a0, xq0, k0, v0, OnCompleteListener, mg.e, f81, n, k1, p, s, z1, f5, j0, x {
    public final int f310a;
    public Object f311b;

    public m(int i10) {
        this.f310a = i10;
    }

    public static boolean Q(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String X(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public void A(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.A(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void B() {
        ((k2.v0) this.f311b).f14035j1 = true;
    }

    @Override
    public com.google.android.gms.common.api.internal.e C(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void C0() {
        r4 r4Var = (r4) this.f311b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13123a;
            x3 x3Var = ((t3) p4Var).f13529a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13630f3.onContentChanged();
        }
    }

    @Override
    public void D(t0 t0Var) {
        qf.b bVar = ((k2.v0) this.f311b).f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 1));
        }
    }

    public o E() {
        o oVar = (o) this.f311b;
        if (oVar.f4515a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4518f) && oVar.f4518f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public boolean E0(int i10) {
        if (i10 == ((so0) this.f311b).f10572d0) {
            return true;
        }
        return false;
    }

    @Override
    public void F(t0 t0Var) {
        qf.b bVar = ((k2.v0) this.f311b).f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 0));
        }
    }

    @Override
    public void G() {
        l0 l0Var = ((k2.v0) this.f311b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public void H() {
        ((i0) this.f311b).f7025f.o();
    }

    public c2.r I(c2.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.I(c2.b):c2.r");
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f310a) {
            case 25:
                ((r) this.f311b).K(i10, z10, i11, false, 0L);
                r rVar = (r) this.f311b;
                gj0 gj0Var = rVar.O;
                if (gj0Var != null) {
                    gj0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                d2 d2Var = (d2) this.f311b;
                d2Var.s0(i10, i11, z10);
                gj0 gj0Var2 = d2Var.O0;
                if (gj0Var2 != null) {
                    gj0Var2.i();
                    d2Var.O0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h K() {
        return null;
    }

    public boolean L(String str) {
        String P = P(str);
        if (!"1".equals(P) && !Boolean.parseBoolean(P)) {
            return false;
        }
        return true;
    }

    public Integer M(String str) {
        String P = P(str);
        if (!TextUtils.isEmpty(P)) {
            try {
                return Integer.valueOf(Integer.parseInt(P));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + X(str) + "(" + P + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray N(String str) {
        String P = P(str);
        if (!TextUtils.isEmpty(P)) {
            try {
                return new JSONArray(P);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + X(str) + ": " + P + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String O(Resources resources, String str, String str2) {
        String[] strArr;
        String P = P(str2);
        if (!TextUtils.isEmpty(P)) {
            return P;
        }
        String P2 = P(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(P2)) {
            return null;
        }
        int identifier = resources.getIdentifier(P2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", X(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray N = N(str2.concat("_loc_args"));
        if (N == null) {
            strArr = null;
        } else {
            int length = N.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = N.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + X(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override
    public void O0(ArrayList arrayList) {
        boolean z10;
        so0 so0Var = (so0) this.f311b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            so0Var.J.add(((y1) arrayList.get(i10)).f10805a);
        }
        ky kyVar = so0Var.U;
        if (kyVar != null) {
            if (so0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kyVar.d(z10, false);
        }
        so0Var.l();
    }

    public String P(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f311b;
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

    @Override
    public void Q0() {
        ((i0) this.f311b).f7025f.k();
    }

    public void R(e0 e0Var) {
        ((q) ((i5.f) ((qa.b) this.f311b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 2)).a(new i5.a(null, e0Var, i5.d.f11323a, null), new y0(2));
    }

    @Override
    public void R0() {
        r4 r4Var = (r4) this.f311b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13123a;
            x3.P1(((t3) p4Var).f13529a);
        }
    }

    public void S() {
        ((androidx.fragment.app.t) this.f311b).d.R();
    }

    public Bundle T() {
        Bundle bundle = (Bundle) this.f311b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public JSONObject V() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f311b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void V0(float f7) {
        ((i0) this.f311b).f7025f.setRotation(f7);
    }

    @Override
    public o9 W() {
        p4 p4Var = ((r4) this.f311b).G;
        if (p4Var != null) {
            return ((t3) p4Var).f13529a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void a(h1 h1Var) {
        p4 p4Var = ((r4) this.f311b).G;
        if (p4Var != null) {
            x3 x3Var = ((t3) p4Var).f13529a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public void a0(CharSequence charSequence) {
        p4 p4Var = ((r4) this.f311b).G;
        if (p4Var != null) {
            t3 t3Var = (t3) p4Var;
            t3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                t3Var.f13529a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = q7.a.f43067a;
        obtain.writeStrongBinder(fVar);
        q7.a.b(obtain, (g7.f) this.f311b);
        q7.a.b(obtain, gVar);
        ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain, 6);
    }

    @Override
    public void b(long j10) {
        k2.v0 v0Var = (k2.v0) this.f311b;
        v0Var.f14037m1 = true;
        qf.b bVar = v0Var.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new bi.g(bVar, j10, 13));
        }
    }

    @Override
    public void b0() {
        ((i0) this.f311b).f7025f.f15559a.g(1, true);
    }

    @Override
    public void d() {
        m0 m0Var = (m0) this.f311b;
        m0Var.f4991a.lock();
        try {
            m0Var.f4999m = new g0(m0Var, m0Var.f4996j, m0Var.f4997k, m0Var.d, m0Var.f4998l, m0Var.f4991a, m0Var.f4993c);
            m0Var.f4999m.q();
            m0Var.f4992b.signalAll();
        } finally {
            m0Var.f4991a.unlock();
        }
    }

    @Override
    public void f(int i10) {
        boolean z10;
        so0 so0Var = (so0) this.f311b;
        so0Var.D0--;
        so0Var.f10573e0 = i10;
        if (so0Var.f10575f0 != i10) {
            so0Var.f10589s.clear();
        }
        if (so0Var.f10576g0 != i10) {
            so0Var.I.clear();
        }
        so0Var.N = true;
        ky kyVar = so0Var.U;
        if (kyVar != null) {
            if (so0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kyVar.d(z10, true);
        }
        so0Var.l();
        ky kyVar2 = so0Var.U;
        if (kyVar2 != null) {
            kyVar2.c();
        }
    }

    @Override
    public void g() {
        ((k2.v0) this.f311b).l1 = true;
    }

    @Override
    public n9 g0() {
        return (r4) this.f311b;
    }

    @Override
    public void h() {
        r4 r4Var = (r4) this.f311b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            x3.Q1(((t3) p4Var).f13529a, r4Var.f13123a);
        }
    }

    @Override
    public void i() {
        l0 l0Var = ((k2.v0) this.f311b).Y;
        if (l0Var != null) {
            l0Var.f11086a.f11165i0 = true;
        }
    }

    @Override
    public Object i2() {
        Constructor constructor = (Constructor) this.f311b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            r8 r8Var = jb.c.f12958a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public ji.a j0() {
        return ((r4) this.f311b).f13123a;
    }

    @Override
    public void k(String str, long j10, long j11, long j12) {
        e6.o oVar = (e6.o) this.f311b;
        try {
            oVar.a(new e6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f8491k;
            Log.e(bVar.f9937a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f8512q.f8497i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public a0.h k0() {
        return null;
    }

    @Override
    public void l(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f311b;
        xVar.f5063o.lock();
        try {
            xVar.f5061m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5063o.unlock();
        }
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(View view, i1 i1Var, boolean z10, boolean z11) {
        f0 f0Var = (f0) this.f311b;
        f0Var.f723a.eb(null, f0Var.e, f0Var.f724b, view, 0.0f, 0.0f, i1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.d(this, 3));
    }

    @Override
    public void n0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.n0(java.lang.Object):void");
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        k2.v0 v0Var = (k2.v0) this.f311b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.f14028c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = v0Var.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 13));
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f311b).f6414c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((k2.v0) this.f311b).f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new ah.t(9, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        a7 a7Var = (a7) this.f311b;
        x6 x6Var = a7Var.L;
        AndroidUtilities.cancelRunOnUIThread(x6Var);
        i81 i81Var = a7Var.f6628y;
        if (i81Var != null && i81Var.y()) {
            AndroidUtilities.runOnUIThread(x6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((a7) this.f311b).i();
    }

    @Override
    public boolean p() {
        i0 i0Var = (i0) this.f311b;
        i0Var.d.invalidate();
        return i0Var.f7025f.j();
    }

    @Override
    public boolean p0() {
        r4 r4Var = (r4) this.f311b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13123a;
            if (((t3) p4Var).f13529a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void q() {
        m0 m0Var = (m0) this.f311b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f4994f.values()) {
            cVar.disconnect();
        }
        m0Var.f5001o.F = Collections.EMPTY_SET;
    }

    @Override
    public boolean r0() {
        i0 i0Var = (i0) this.f311b;
        di.g0 g0Var = i0Var.f7025f;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        i0Var.d.invalidate();
        return m10;
    }

    @Override
    public void s(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f311b;
        Lock lock = xVar.f5063o;
        lock.lock();
        try {
            if (xVar.f5062n) {
                xVar.f5062n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.f5062n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void s0() {
        q5.j0((q5) this.f311b);
    }

    @Override
    public void t(int i10, long j10, long j11) {
        qf.b bVar = ((k2.v0) this.f311b).f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public void t0(int i10, int i11) {
        r4 r4Var = (r4) this.f311b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13123a;
            h2 h2Var = ((t3) p4Var).f13529a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    public void v(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f311b;
        xVar.f5063o.lock();
        try {
            xVar.f5061m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5063o.unlock();
        }
    }

    @Override
    public void w() {
        x2.n nVar;
        k2.v0 v0Var = (k2.v0) this.f311b;
        synchronized (v0Var.f10919a) {
            nVar = v0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public void x(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((k2.v0) this.f311b).f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new k2.q(bVar, exc, 1));
        }
    }

    @Override
    public boolean z() {
        return false;
    }

    public m(a4.l lVar) {
        this.f310a = 8;
        this.f311b = (com.google.android.gms.internal.play_billing.r) lVar.f279b;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public m(Object obj, int i10) {
        this.f310a = i10;
        this.f311b = obj;
    }

    public m(MediaInfo mediaInfo) {
        this.f310a = 9;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f311b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public m(x6.a aVar) {
        this.f310a = 24;
        n6.l.h(aVar);
        this.f311b = aVar;
    }

    public m(JSONObject jSONObject) {
        this.f310a = 9;
        this.f311b = new o(jSONObject);
    }

    public m(ca.c cVar) {
        this.f310a = 17;
        this.f311b = new File(cVar.f4678b, "com.crashlytics.settings.json");
    }

    public m() {
        this.f310a = 23;
        this.f311b = new ya.c(gc.a.h, 22);
    }

    public m(Bundle bundle) {
        this.f310a = 12;
        this.f311b = new Bundle(bundle);
    }

    @Override
    public void U() {
    }

    @Override
    public void y() {
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
    public void onError(i81 i81Var, Exception exc) {
    }

    @Override
    public void e(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
