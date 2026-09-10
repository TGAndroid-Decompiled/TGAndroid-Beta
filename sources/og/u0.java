package og;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import bi.ge;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ey0;
import org.telegram.ui.i5;
import org.telegram.ui.m4;
import org.telegram.ui.uw;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.z41;
import zh.a3;
import zh.t7;
import zh.u7;
import zh.v2;
public final class u0 implements f6, no0, du, ge, ml0, eh.a, q71, p2.s, com.google.android.gms.common.api.internal.s, n5.b, y2.p, SuccessContinuation {
    public final int f14496a;
    public Object f14497b;
    public Object f14498c;

    public u0(int i10) {
        this.f14496a = i10;
    }

    public static u0 e(View view) {
        return new u0(view);
    }

    @Override
    public Paint F(String str) {
        return j6.S0(str);
    }

    @Override
    public int F0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f14497b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return j6.w0(null, i10, false);
    }

    @Override
    public void I(float f7, boolean z10) {
        kc0 kc0Var = (kc0) this.f14497b;
        tf0 tf0Var = (tf0) this.f14498c;
        t71 t71Var = tf0Var.d;
        if (t71Var != null) {
            long p5 = t71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            tf0Var.e = j3;
            tf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(kc0Var);
                AndroidUtilities.runOnUIThread(kc0Var, 120L);
            }
        }
    }

    @Override
    public y2.p J() {
        return new u0(16, ((p2.s) this.f14497b).J(), (List) this.f14498c);
    }

    @Override
    public y2.p T(p2.o oVar, p2.l lVar) {
        return new u0(16, ((p2.s) this.f14497b).T(oVar, lVar), (List) this.f14498c);
    }

    @Override
    public void W(float f7, boolean z10) {
        ((TextView) this.f14497b).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.f14498c).f33536b.M();
    }

    @Override
    public boolean a() {
        return j6.I.q();
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: og.u0.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        wy wyVar = (wy) this.f14498c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f19817n2) {
                wyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        uw uwVar = wyVar.f38536z0;
        if (uwVar != null && uwVar.getVisibility() == 0 && wyVar.f38536z0.f26528n) {
            return false;
        }
        return wyVar.o4(view, i10, f7, ((vy) this.f14497b).d);
    }

    @Override
    public int e0(int i10) {
        return F0(i10);
    }

    public ArrayList f() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f14497b;
        Class cls = (Class) ((l2.g) this.f14498c).f12719b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new q9.c(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public int f1(int i10) {
        return ((SparseIntArray) this.f14497b).get(i10);
    }

    public View g(int i10, int i11, int i12, int i13) {
        int i14;
        s4.g1 g1Var = (s4.g1) this.f14498c;
        s4.h1 h1Var = (s4.h1) this.f14497b;
        int m10 = h1Var.m();
        int q6 = h1Var.q();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View r10 = h1Var.r(i10);
            int f7 = h1Var.f(r10);
            int s10 = h1Var.s(r10);
            g1Var.f41653b = m10;
            g1Var.f41654c = q6;
            g1Var.d = f7;
            g1Var.e = s10;
            if (i12 != 0) {
                g1Var.f41652a = i12;
                if (g1Var.a()) {
                    return r10;
                }
            }
            if (i13 != 0) {
                g1Var.f41652a = i13;
                if (g1Var.a()) {
                    view = r10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        Object mo28get = ((fd.a) this.f14497b).mo28get();
        fd.a aVar2 = (fd.a) this.f14498c;
        return new s5.g(aVar, bVar, s5.a.f41779f, (s5.i) mo28get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((wy) this.f14498c).finishPreviewFragment();
        }
    }

    @Override
    public void j() {
        ((fu) this.f14497b).getText();
        ((f3) this.f14498c).b();
    }

    @Override
    public bh.d k() {
        return new bh.f(this);
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override
    public Object l2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.p) this.f14497b).l2(uri, kVar);
        List list = (List) this.f14498c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public boolean m0() {
        return false;
    }

    public boolean o(View view) {
        s4.g1 g1Var = (s4.g1) this.f14498c;
        s4.h1 h1Var = (s4.h1) this.f14497b;
        int m10 = h1Var.m();
        int q6 = h1Var.q();
        int f7 = h1Var.f(view);
        int s10 = h1Var.s(view);
        g1Var.f41653b = m10;
        g1Var.f41654c = q6;
        g1Var.d = f7;
        g1Var.e = s10;
        g1Var.f41652a = 24579;
        return g1Var.a();
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f14498c;
        int i10 = secretMediaViewer.f30552b0;
        if (i10 > 0) {
            secretMediaViewer.f30552b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new ey0(25, this, (File) this.f14497b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f14498c;
        z41 z41Var = secretMediaViewer.f30569i1;
        if (secretMediaViewer.f30602y != null && secretMediaViewer.f30566h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(z41Var);
            AndroidUtilities.runOnUIThread(z41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f30551b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f30551b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f30597w.getVisibility() != 0) {
                secretMediaViewer.f30597w.setVisibility(0);
            }
            if (secretMediaViewer.f30602y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f30584q1);
                        return;
                    }
                    secretMediaViewer.f30602y.L(0L, false);
                    secretMediaViewer.f30602y.C();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        m4 m4Var = ((SecretMediaViewer) this.f14498c).f30597w;
        if (m4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            m4Var.a(f10, 0);
        }
    }

    @Override
    public void p(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((wy) this.f14498c).movePreviewFragment(f7);
        }
    }

    public void q(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14497b;
        v2 v2Var = (v2) this.f14498c;
        u7 u7Var = v2Var.e;
        u7.B1 = f7;
        t7 t7Var = u7Var.f48974z0;
        if (t7Var != null) {
            t7Var.setSpeed(f7);
        }
        a3.a0(v2Var.f48986l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f14496a) {
            case 21:
                da.a aVar = (da.a) obj;
                w9.m mVar = ((w9.k) this.f14498c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.m.b(mVar), mVar.f43904m.y((Executor) this.f14497b, null));
            default:
                return ((w9.m) this.f14498c).e.p(new u4.g(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f14496a) {
            case 12:
                return "Bounds{lower=" + ((i0.c) this.f14497b) + " upper=" + ((i0.c) this.f14498c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f14497b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f14498c;
        qg.c1 c1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f30278h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.f17872a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        c1Var.d(0, (-premiumPreviewFragment.f30273d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f30270b0, 0, premiumPreviewFragment.f30273d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f30273d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, c1Var.f40690f);
    }

    @Override
    public ColorFilter w() {
        return j6.f18251v3;
    }

    public u0(int i10, Object obj, Object obj2) {
        this.f14496a = i10;
        this.f14497b = obj;
        this.f14498c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f14498c;
        if (secretMediaViewer.f30555c0) {
            return;
        }
        secretMediaViewer.f30555c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public u0(Object obj, Object obj2, boolean z10, int i10) {
        this.f14496a = i10;
        this.f14498c = obj;
        this.f14497b = obj2;
    }

    public u0() {
        this.f14496a = 23;
        this.f14497b = new AtomicInteger();
        this.f14498c = new AtomicInteger();
    }

    public u0(Context context) {
        this.f14496a = 17;
        this.f14497b = context;
        this.f14498c = null;
    }

    public u0(View view) {
        this.f14496a = 5;
        e71 e71Var = new e71(this, view);
        this.f14497b = e71Var;
        view.addOnLayoutChangeListener(e71Var);
    }

    public u0(tf0 tf0Var) {
        this.f14496a = 4;
        this.f14498c = tf0Var;
        this.f14497b = new kc0(this, 9);
    }

    public u0(String str, String str2) {
        this.f14496a = 19;
        this.f14497b = str;
        this.f14498c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public u0(s4.h1 h1Var) {
        this.f14496a = 14;
        this.f14497b = h1Var;
        ?? obj = new Object();
        obj.f41652a = 0;
        this.f14498c = obj;
    }

    public u0(w9.k kVar, Executor executor, String str) {
        this.f14496a = 21;
        this.f14498c = kVar;
        this.f14497b = executor;
    }

    public u0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f14496a = 8;
        this.f14498c = premiumPreviewFragment;
        this.f14497b = new Paint();
    }

    @Override
    public void H(float f7) {
    }

    @Override
    public void Q(long j3) {
    }

    @Override
    public void S(boolean z10) {
    }

    @Override
    public void X(float f7) {
    }

    @Override
    public void b() {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void d0(float f7) {
    }

    @Override
    public void g0(float f7) {
    }

    @Override
    public void h0() {
    }

    @Override
    public void i(float f7) {
    }

    @Override
    public void l0(float f7) {
    }

    @Override
    public void m(float f7) {
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
    public void q0(long j3) {
    }

    @Override
    public void r() {
    }

    @Override
    public void x(float f7) {
    }

    @Override
    public void y() {
    }

    @Override
    public void z(boolean z10) {
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void V(float f7, int i10) {
    }

    @Override
    public void f0(float f7, int i10) {
    }

    @Override
    public void n(long j3, boolean z10) {
    }

    @Override
    public void n0(int i10, long j3) {
    }
}
