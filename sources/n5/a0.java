package n5;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.t6;
import g7.y5;
import j4.c1;
import j4.i1;
import j4.j1;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import mh.l4;
import of.u1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.j9;
import org.telegram.ui.li0;
import org.telegram.ui.qr0;
import org.telegram.ui.r9;
import org.telegram.ui.sa1;
import org.telegram.ui.web.y0;
import org.telegram.ui.xs0;
import qh.b2;
import qh.d1;
import qh.f5;
import qh.o3;
import qh.v2;
import qh.x1;
import xf.q1;
import yf.v1;
public final class a0 implements OnSuccessListener, na.n, o0.a, c1, la.n, on0, td.d, tf.m, h61, u1, r9, com.google.android.gms.common.api.internal.s, x4, qh.c1, OnCompleteListener, s0, v1 {
    public final int f18461a;
    public Object f18462b;

    public a0(Object obj, int i9) {
        this.f18461a = i9;
        this.f18462b = obj;
    }

    @Override
    public boolean A(d1 d1Var) {
        return false;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f18461a) {
            case 13:
                ((qh.p) this.f18462b).H(i9, z10, i10, false, 0L);
                qh.p pVar = (qh.p) this.f18462b;
                li0 li0Var = pVar.K;
                if (li0Var != null) {
                    li0Var.i();
                    pVar.K = null;
                    return;
                }
                return;
            default:
                ((x1) this.f18462b).r0(i9, i10, z10);
                return;
        }
    }

    @Override
    public void B1(Editable editable) {
        f5 f5Var = (f5) this.f18462b;
        qh.a aVar = f5Var.f46834a;
        if (aVar != null) {
            aVar.f46284s = true;
            aVar.f46283r = f5Var.f46392r.A;
        }
        f5Var.u();
        v2 v2Var = f5Var.A;
        if (v2Var != null && f5Var.f46834a != null) {
            v2Var.a();
        }
    }

    @Override
    public void C(boolean z10) {
        be0 be0Var = (be0) this.f18462b;
        be0Var.getClass();
        ae0 ae0Var = be0Var.f27182a;
        if (ae0Var != null) {
            ((qr0) ae0Var).a(z10);
        }
    }

    @Override
    public String C0() {
        return ((y0) this.f18462b).f44078e0;
    }

    @Override
    public void E(int i9, int i10) {
        b2 b2Var;
        f5 f5Var = (f5) this.f18462b;
        v2 v2Var = f5Var.A;
        if (v2Var != null && f5Var.f46834a != null && (b2Var = v2Var.f46757a.F3) != null) {
            b2Var.f(i9, i10);
        }
    }

    @Override
    public void F() {
        ae0 ae0Var = ((be0) this.f18462b).f27182a;
        if (ae0Var != null) {
            PhotoViewer photoViewer = ((qr0) ae0Var).f42183a;
            if (photoViewer.Y1 == 1) {
                photoViewer.D2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean I(float f10) {
        return false;
    }

    @Override
    public void K(String str) {
        y0 y0Var = (y0) this.f18462b;
        try {
            y0Var.L = System.currentTimeMillis();
            y0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public a0.h O() {
        return null;
    }

    @Override
    public void Q(float f10, boolean z10) {
        switch (this.f18461a) {
            case 5:
                sa1 sa1Var = (sa1) ((k0) this.f18462b);
                int i9 = (int) (f6.f23222q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                f6.f23222q = f10;
                if (i9 != i10) {
                    ThemeActivity themeActivity = sa1Var.f42646e.f44444e;
                    ik0 ik0Var = (ik0) themeActivity.f36227b.K(themeActivity.f36228b0);
                    if (ik0Var != null) {
                        ((b9) ik0Var.f5501a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (f6.f23222q * 100.0f))));
                    }
                    f6.E(true);
                    return;
                }
                return;
            default:
                uf.g gVar = (uf.g) this.f18462b;
                float f11 = gVar.f48213b;
                float z11 = e2.c.z(gVar.f48214c, f11, f10, f11);
                gVar.d = z11;
                if (z10) {
                    l6 l6Var = gVar.f48215e;
                    l6Var.getClass();
                    l6Var.b(null, z11);
                }
                gVar.invalidate();
                return;
        }
    }

    @Override
    public boolean T1(boolean z10) {
        return false;
    }

    @Override
    public boolean U1(d1 d1Var) {
        return false;
    }

    @Override
    public Object Y1() {
        Constructor constructor = (Constructor) this.f18462b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            t6 t6Var = qa.c.f46123a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override
    public p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        q5.r rVar = new q5.r(0, (TaskCompletionSource) obj2);
        q5.i iVar = (q5.i) ((q5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.u.d(M0, rVar);
        M0.writeStringArray((String[]) this.f18462b);
        iVar.R0(M0, 5);
    }

    @Override
    public void c(j4.d1 d1Var) {
        o4.r rVar = (o4.r) d1Var;
        o4.l lVar = (o4.l) this.f18462b;
        lVar.C.c(lVar);
    }

    @Override
    public int c0() {
        switch (this.f18461a) {
            case 5:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f18462b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.f((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public void d(d1 d1Var) {
        v2 v2Var = ((f5) this.f18462b).A;
        if (v2Var != null) {
            o3 o3Var = v2Var.f46757a;
            o3.M1(o3Var, d1Var);
            o3Var.f46565d3.f1(d1Var, true);
        }
    }

    @Override
    public void e(int i9) {
        np0 np0Var = (np0) this.f18462b;
        rp0 rp0Var = np0Var.G;
        np0Var.f31150s = i9;
        if (np0Var.v != i9) {
            np0Var.d.clear();
        }
        int i10 = np0Var.F;
        if (np0Var.h() == 0 && !np0Var.f31146e.e() && !np0Var.E) {
            rp0Var.M.e(false, true);
        } else {
            rp0Var.f32266t0.b(i10);
        }
        np0Var.l();
        int i11 = rp0.W0;
        rp0Var.K0(true);
    }

    public void g() {
        o4.r[] rVarArr;
        o4.r[] rVarArr2;
        o4.l lVar = (o4.l) this.f18462b;
        int i9 = lVar.D - 1;
        lVar.D = i9;
        if (i9 > 0) {
            return;
        }
        int i10 = 0;
        for (o4.r rVar : lVar.F) {
            rVar.f();
            i10 += rVar.U.f13491a;
        }
        i1[] i1VarArr = new i1[i10];
        int i11 = 0;
        for (o4.r rVar2 : lVar.F) {
            rVar2.f();
            int i12 = rVar2.U.f13491a;
            int i13 = 0;
            while (i13 < i12) {
                rVar2.f();
                i1VarArr[i11] = rVar2.U.a(i13);
                i13++;
                i11++;
            }
        }
        lVar.E = new j1(i1VarArr);
        lVar.C.f(lVar);
    }

    @Override
    public void g0(float f10) {
        xs0 xs0Var = (xs0) this.f18462b;
        xf.s0.e(xs0Var.L1).k(String.valueOf(xf.m.f49272a.indexOf(xs0Var.S0.getCurrentBrush())), f10);
        q1 q1Var = xs0Var.G1;
        q1Var.f49335c = f10;
        xs0Var.s0(q1Var, null);
    }

    @Override
    public float get() {
        xs0 xs0Var = (xs0) this.f18462b;
        int i9 = xs0Var.L1;
        xf.m currentBrush = xs0Var.S0.getCurrentBrush();
        if (currentBrush == null) {
            return xf.s0.e(i9).f49364i;
        }
        return xf.s0.e(i9).f(String.valueOf(xf.m.f49272a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f18461a) {
            case 5:
                return " ";
            default:
                uf.g gVar = (uf.g) this.f18462b;
                float f10 = gVar.f48213b;
                return String.valueOf(Math.round((gVar.f48212a.getProgress() * (gVar.f48214c - f10)) + f10));
        }
    }

    @Override
    public void h1(CharSequence charSequence) {
        v2 v2Var = ((f5) this.f18462b).A;
        if (v2Var != null && charSequence != null && charSequence.length() > 0) {
            v2Var.f46757a.t4(charSequence.toString());
        }
    }

    @Override
    public boolean i1(String str, j9 j9Var) {
        return false;
    }

    public la.i j(Object obj) {
        la.g gVar = ((oa.a0) this.f18462b).f19107b;
        gVar.getClass();
        if (obj == null) {
            return la.k.f16726a;
        }
        Class<?> cls = obj.getClass();
        oa.n nVar = new oa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public void k() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f18462b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long m10 = m();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + m10);
    }

    @Override
    public void k1(d1 d1Var, int i9, int i10) {
        v2 v2Var;
        n9 textSelectionHelper;
        f5 f5Var = (f5) this.f18462b;
        if (!f5Var.C && i9 != i10 && (v2Var = f5Var.A) != null && (textSelectionHelper = v2Var.f46757a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != f5Var) {
                f5Var.post(new l4(this, d1Var, i10, textSelectionHelper, i9, 6));
            }
        }
    }

    public void l(long j10) {
        long m10 = m();
        if (m10 != j10) {
            if (m10 != -1) {
                if (m10 == -2) {
                    m10 = -2;
                } else {
                    return;
                }
            }
            StringBuilder s10 = aa.d.s(j10, "expected non-string scope or scope ", " but found ");
            s10.append(m10);
            throw new IOException(s10.toString());
        }
    }

    public long m() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f18462b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void n() {
        int i9 = this.f18461a;
    }

    @Override
    public void n1() {
        ((e9) this.f18462b).f27979a.invalidate();
    }

    @Override
    public p0 o(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f18462b) {
            if (cVar.f48246a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void onComplete(Task task) {
        hd.m mVar = (hd.m) this.f18462b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(y5.a(exception));
    }

    @Override
    public void onDismiss() {
        y0 y0Var = (y0) this.f18462b;
        y0Var.v("scan_qr_popup_closed", null);
        y0Var.f44076d0 = false;
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        vj0 vj0Var = (vj0) this.f18462b;
        if (z10 && vj0Var.f33394n.o() >= 0) {
            vj0Var.f33397w = true;
        }
        qf0 qf0Var = vj0Var.f33393f;
        ib0 ib0Var = vj0Var.f33398x;
        qf0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(ib0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(ib0Var, 16L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i9;
        int i10;
        d2 d2Var;
        com.google.android.gms.internal.cast.d1 b10;
        a aVar = (a) this.f18462b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.p0.f3183j) {
            Context context = aVar.f18452a;
            q5.s sVar = aVar.f18456f;
            com.google.android.gms.internal.cast.p0 p0Var = new com.google.android.gms.internal.cast.p0(context, sVar, aVar.f18454c, aVar.f18459j, aVar.f18457g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i9 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i9 == 0) {
                if (z10) {
                    i9 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String j10 = ta.b.j(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            p0Var.h = i10;
            w2.q.b(context);
            p0Var.f3189g = w2.q.a().c(u2.a.f47963e).a("CAST_SENDER_SDK", new t2.c("proto"), com.google.android.gms.internal.cast.a0.f2982a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.f3187e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(j10, 0);
            if (i9 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.f2914c = new n2.p(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new u5.c[]{m5.y.f17490c};
                b11.f2913b = false;
                b11.f2912a = 8426;
                Task e10 = sVar.e(0, b11.b());
                ?? obj2 = new Object();
                obj2.f4402b = p0Var;
                obj2.f4403c = packageName;
                obj2.f4401a = i9;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                x5.l.h(sharedPreferences);
                q5.b bVar = d2.f3071i;
                synchronized (d2.class) {
                    try {
                        if (d2.f3073k == null) {
                            d2.f3073k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.f3073k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = d2Var.f3076c;
                SharedPreferences sharedPreferences2 = d2Var.f3075b;
                HashSet hashSet = d2Var.f3078f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f3079g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.f3072j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j11 = sharedPreferences2.getLong(str3, 0L);
                            if (j11 != 0 && currentTimeMillis - j11 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.d1 b12 = d2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    x5.l.h(d2Var.f3077e);
                    x5.l.h(d2Var.d);
                    d2Var.f3077e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                d2.a(com.google.android.gms.internal.cast.d1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p() {
        f5 f5Var = (f5) this.f18462b;
        v2 v2Var = f5Var.A;
        if (v2Var != null && f5Var.f46834a != null) {
            return v2Var.f46757a.S4();
        }
        return false;
    }

    @Override
    public boolean p0(int i9) {
        if (i9 == ((np0) this.f18462b).f31149r) {
            return true;
        }
        return false;
    }

    @Override
    public void q() {
        ae0 ae0Var = ((be0) this.f18462b).f27182a;
        if (ae0Var != null) {
            ((qr0) ae0Var).f42183a.f35580a0.invalidate();
        }
    }

    @Override
    public Cursor s(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f18462b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public void v(boolean z10) {
        ((be0) this.f18462b).f27184c.setAspectLock(z10);
    }

    @Override
    public a0.h y() {
        return null;
    }

    public a0(q5.s sVar, String[] strArr) {
        this.f18461a = 12;
        this.f18462b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public a0(int i9) {
        this.f18461a = i9;
        switch (i9) {
            case 20:
                this.f18462b = new ArrayDeque(16);
                return;
            default:
                return;
        }
    }

    public a0(v1.c[] initializers) {
        this.f18461a = 19;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f18462b = initializers;
    }

    public a0(Context context, Uri uri) {
        this.f18461a = 2;
        this.f18462b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void L() {
    }

    @Override
    public void b() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void H0(ArrayList arrayList) {
    }

    @Override
    public void L0(d1 d1Var) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
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
    public void onError(k61 k61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
