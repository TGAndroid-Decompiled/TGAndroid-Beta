package bb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dg.q3;
import dg.s2;
import f0.f;
import f2.p1;
import f2.w0;
import g.q;
import g5.h0;
import g5.m0;
import gg.y1;
import i5.p;
import j3.g0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import k1.d0;
import k1.g;
import l.i;
import l.k;
import l.w;
import l3.n0;
import l3.t;
import l8.m;
import m.h;
import m.v3;
import m8.e0;
import nh.e9;
import nh.f9;
import nh.g4;
import nh.k3;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.fz0;
import r0.j0;
import r0.m1;
import r4.d;
import wc.c;
public final class b implements a0, androidx.activity.result.b, k0, v0, s2, p1, o, r0.o, h0, p, t, OnCompleteListener, w, i, g, e9 {
    public final int f1771a;
    public Object f1772b;

    public b(int i10) {
        this.f1771a = i10;
    }

    public static boolean O(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String R(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public void A(float f10) {
        ((q3) this.f1772b).setOutlineWidth(f10);
    }

    @Override
    public View B(int i10) {
        return ((f2.v0) this.f1772b).q(i10);
    }

    @Override
    public Object C(dd.p pVar, c cVar) {
        return ((d0) this.f1772b).C(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public boolean D() {
        return true;
    }

    @Override
    public int E(View view) {
        return f2.v0.v(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void F() {
        g0 g0Var = ((n0) this.f1772b).f11311c1;
        if (g0Var != null) {
            g0Var.f8566a.f8633n.d(2);
        }
    }

    @Override
    public void G(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.h0 h0Var = (androidx.biometric.h0) this.f1772b;
        Handler handler = h0Var.f484x0;
        androidx.activity.i iVar = h0Var.f485y0;
        handler.removeCallbacks(iVar);
        TextView textView = h0Var.D0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override
    public e H(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public boolean I(String str) {
        String N = N(str);
        if (!"1".equals(N) && !Boolean.parseBoolean(N)) {
            return false;
        }
        return true;
    }

    public Integer J(String str) {
        String N = N(str);
        if (!TextUtils.isEmpty(N)) {
            try {
                return Integer.valueOf(Integer.parseInt(N));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + R(str) + "(" + N + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray K(String str) {
        String N = N(str);
        if (!TextUtils.isEmpty(N)) {
            try {
                return new JSONArray(N);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + R(str) + ": " + N + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public PackageInfo L(int i10, String str) {
        return ((Context) this.f1772b).getPackageManager().getPackageInfo(str, i10);
    }

    public String M(Resources resources, String str, String str2) {
        String[] strArr;
        String N = N(str2);
        if (!TextUtils.isEmpty(N)) {
            return N;
        }
        String N2 = N(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(N2)) {
            return null;
        }
        int identifier = resources.getIdentifier(N2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", R(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray K = K(str2.concat("_loc_args"));
        if (K == null) {
            strArr = null;
        } else {
            int length = K.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = K.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + R(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override
    public m1 M0(View view, m1 m1Var) {
        boolean z4;
        m1 m1Var2;
        int b10;
        int c3;
        boolean z10;
        int c10;
        int d = m1Var.d();
        q qVar = (q) this.f1772b;
        Context context = qVar.e;
        int d10 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.f6313y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f6313y.getLayoutParams();
            boolean z11 = true;
            if (qVar.f6313y.isShown()) {
                if (qVar.f6304i0 == null) {
                    qVar.f6304i0 = new Rect();
                    qVar.f6305j0 = new Rect();
                }
                Rect rect = qVar.f6304i0;
                Rect rect2 = qVar.f6305j0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.G;
                Method method = v3.f13650a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                m1 f10 = j0.f(qVar.G);
                if (f10 == null) {
                    b10 = 0;
                } else {
                    b10 = f10.b();
                }
                if (f10 == null) {
                    c3 = 0;
                } else {
                    c3 = f10.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
                if (i11 > 0 && qVar.I == null) {
                    View view2 = new View(context);
                    qVar.I = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c3;
                    qVar.G.addView(qVar.I, -1, layoutParams);
                } else {
                    View view3 = qVar.I;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c3;
                            qVar.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = qVar.I;
                if (view4 == null) {
                    z11 = false;
                }
                if (z11 && view4.getVisibility() != 0) {
                    View view5 = qVar.I;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c10 = f.c(context, 2131099654);
                    } else {
                        c10 = f.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c10);
                }
                if (!qVar.N && z11) {
                    d10 = 0;
                }
                z4 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z11 = false;
            }
            if (z11) {
                qVar.f6313y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z4 = false;
        }
        View view6 = qVar.I;
        if (view6 != null) {
            if (z4) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            m1Var2 = m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a());
        } else {
            m1Var2 = m1Var;
        }
        return j0.h(view, m1Var2);
    }

    public String N(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f1772b;
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

    public Bundle P() {
        Bundle bundle = (Bundle) this.f1772b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void Q(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f1772b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public boolean V0(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        g4 g4Var;
        g4 g4Var2;
        g4 g4Var3;
        g4 g4Var4;
        f9Var.f15313b = null;
        f9Var.f15314c = null;
        fz0 fz0Var = (fz0) this.f1772b;
        a01 a01Var = fz0Var.h;
        ArrayList arrayList = fz0Var.f32299w;
        if (fz0Var.K < 0.2f) {
            f9Var.f15313b = a01Var.getImageReceiver();
            f9Var.f15314c = null;
            f9Var.f15312a = a01Var;
            f9Var.h = 0.0f;
            f9Var.f15317i = AndroidUtilities.displaySize.y;
            f9Var.f15316g = (View) fz0Var.getParent();
            f9Var.d = fz0Var.f32301y;
            f9Var.f15322n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                g4 g4Var5 = (g4) arrayList.get(i13);
                if (g4Var5.e >= 1.0f && g4Var5.f15330a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        g4Var3 = (g4) arrayList.get(i14);
                    } else {
                        g4Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        g4Var4 = (g4) arrayList.get(i15);
                    } else {
                        g4Var4 = null;
                    }
                    g4 d = ProfileStoriesView.d(g4Var3, g4Var4, g4Var5);
                    imageReceiver = g4Var5.f15331b;
                    g4Var2 = d;
                    g4Var = g4Var5;
                }
                i13++;
            } else {
                imageReceiver = null;
                g4Var = null;
                g4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.f15314c = imageReceiver;
        f9Var.f15313b = null;
        f9Var.f15312a = fz0Var;
        f9Var.h = 0.0f;
        f9Var.f15317i = AndroidUtilities.displaySize.y;
        f9Var.f15316g = (View) fz0Var.getParent();
        if (g4Var != null && g4Var2 != null) {
            f9Var.f15315f = new f1.a(this, new RectF(g4Var.f15339m), g4Var, new RectF(g4Var2.f15339m), g4Var2);
            return true;
        }
        f9Var.f15315f = null;
        return true;
    }

    @Override
    public c4.e X(g5.j0 j0Var, IOException iOException, int i10) {
        r4.g gVar = ((d) this.f1772b).f43300a;
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.e;
    }

    @Override
    public void a(long j10) {
        f7.b bVar = ((n0) this.f1772b).S0;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override
    public void c(k kVar, boolean z4) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f11129z.k().c(false);
        }
        w wVar = ((h) this.f1772b).e;
        if (wVar != null) {
            wVar.c(kVar, z4);
        }
    }

    @Override
    public void e() {
        g0 g0Var = ((n0) this.f1772b).f11311c1;
        if (g0Var != null) {
            g0Var.f8566a.T = true;
        }
    }

    @Override
    public int f(View view) {
        return f2.v0.z(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).topMargin;
    }

    @Override
    public void g(Object obj) {
        ((u7.c) obj).onLocationResult((LocationResult) this.f1772b);
    }

    @Override
    public float get() {
        return ((q3) this.f1772b).C;
    }

    @Override
    public od.b getData() {
        return ((d0) this.f1772b).f9552c;
    }

    @Override
    public void h() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f1772b;
        m0Var.f2805a.lock();
        try {
            m0Var.f2813m = new com.google.android.gms.common.api.internal.g0(m0Var, m0Var.f2810j, m0Var.f2811k, m0Var.d, m0Var.f2812l, m0Var.f2805a, m0Var.f2807c);
            m0Var.f2813m.w();
            m0Var.f2806b.signalAll();
        } finally {
            m0Var.f2805a.unlock();
        }
    }

    @Override
    public void i(k kVar) {
        Toolbar toolbar = (Toolbar) this.f1772b;
        h hVar = toolbar.f449a.G;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.T.f11787c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).f841a.t();
        }
    }

    @Override
    public int j() {
        return ((f2.v0) this.f1772b).G();
    }

    @Override
    public void k1(g5.j0 j0Var, long j10, long j11) {
        boolean z4;
        d dVar = (d) this.f1772b;
        synchronized (h5.a.f6909i) {
            z4 = h5.a.f6910j;
        }
        if (!z4) {
            IOException iOException = new IOException(new ConcurrentModificationException());
            r4.g gVar = dVar.f43300a;
            h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
            gVar.u(true);
            return;
        }
        dVar.a();
    }

    @Override
    public void l(gg.f fVar) {
        fVar.a(((WindowManager) this.f1772b).getDefaultDisplay());
    }

    @Override
    public void m(int i10) {
        x xVar = (x) this.f1772b;
        Lock lock = xVar.f2882o;
        lock.lock();
        try {
            if (xVar.f2881n) {
                xVar.f2881n = false;
                x.k(xVar, i10);
            } else {
                xVar.f2881n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void n(int i10, long j10, long j11) {
        f7.b bVar = ((n0) this.f1772b).S0;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void o(Bundle bundle) {
        x xVar = (x) this.f1772b;
        xVar.f2882o.lock();
        try {
            xVar.f2880m = y5.a.e;
            x.l(xVar);
        } finally {
            xVar.f2882o.unlock();
        }
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f1772b;
        if (task.isSuccessful()) {
            m.K0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        m.K0(e0Var, false, null);
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((n0) this.f1772b).S0;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new jh.f(1, bVar, z4));
        }
    }

    @Override
    public boolean p(k kVar) {
        h hVar = (h) this.f1772b;
        if (kVar == hVar.f13492c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar == null) {
            return false;
        }
        return wVar.p(kVar);
    }

    @Override
    public boolean q(k kVar, MenuItem menuItem) {
        ((Toolbar) this.f1772b).getClass();
        return false;
    }

    @Override
    public void r() {
        f5.p pVar;
        n0 n0Var = (n0) this.f1772b;
        synchronized (n0Var.f8470a) {
            pVar = n0Var.f8479y;
        }
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override
    public int s() {
        f2.v0 v0Var = (f2.v0) this.f1772b;
        return v0Var.f5846n - v0Var.C();
    }

    public String toString() {
        switch (this.f1771a) {
            case 9:
                de.b bVar = de.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((da.a) this.f1772b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(Exception exc) {
        h5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((n0) this.f1772b).S0;
        Handler handler = (Handler) bVar.f6001b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    @Override
    public void v(y5.a aVar) {
        x xVar = (x) this.f1772b;
        xVar.f2882o.lock();
        try {
            xVar.f2880m = aVar;
            x.l(xVar);
        } finally {
            xVar.f2882o.unlock();
        }
    }

    @Override
    public void w() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f1772b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f2808f.values()) {
            cVar.disconnect();
        }
        m0Var.f2815o.C = Collections.EMPTY_SET;
    }

    @Override
    public void x(Object obj) {
        int i10;
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f1772b;
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
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = f0Var.f854a;
        if (j0Var.f868c.r(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public void y() {
        ((n0) this.f1772b).f11309a1 = true;
    }

    @Override
    public void z0(long j10, int i10, k3 k3Var) {
        int i11 = ProfileStoriesView.f32277p0;
        ((fz0) this.f1772b).f(true, false);
        k3Var.run();
    }

    public b(Object obj, int i10) {
        this.f1771a = i10;
        this.f1772b = obj;
    }

    public b(Set set) {
        this.f1771a = 0;
        this.f1772b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.getClass();
            ((HashMap) this.f1772b).put(androidx.activity.result.c.class, aVar.f1770a);
        }
    }

    public b() {
        this.f1771a = 3;
        this.f1772b = new LinkedHashMap(0, 0.75f, true);
    }

    public b(Bundle bundle) {
        this.f1771a = 8;
        this.f1772b = new Bundle(bundle);
    }

    @Override
    public void z() {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void d(Bundle bundle) {
    }

    @Override
    public void t(int i10) {
    }

    @Override
    public void k(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
    }

    @Override
    public void x0(g5.j0 j0Var, long j10, long j11, boolean z4) {
    }
}
