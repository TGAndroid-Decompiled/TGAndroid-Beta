package ji;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bc1;
import org.telegram.ui.l9;
import org.telegram.ui.ss0;
import org.telegram.ui.t9;
import org.telegram.ui.zt0;
public class u4 implements j0, m.x0, n5.b, eo0, le.f, mg.p, d71, hg.a2, t9, r4.c, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1, com.google.android.gms.common.api.internal.s {
    public final int f14246a;
    public Object f14247b;

    public u4(Object obj, int i10) {
        this.f14246a = i10;
        this.f14247b = obj;
    }

    @Override
    public void A(CharSequence charSequence) {
        o3 o3Var = ((w4) this.f14247b).N;
        if (o3Var != null) {
            o3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                o3Var.f14124a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public void B() {
        int i10 = this.f14246a;
    }

    public void C(aa.a aVar) {
        h8.j jVar = (h8.j) this.f14247b;
        jVar.f10934a = aVar;
        Iterator it = jVar.f10936c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10936c.clear();
        jVar.f10935b = null;
    }

    @Override
    public p9 D() {
        return (w4) this.f14247b;
    }

    @Override
    public void E(boolean z10) {
        ((ue0) this.f14247b).f30897c.setAspectLock(z10);
    }

    @Override
    public a F() {
        return ((w4) this.f14247b).f13775a;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public void H(float f7) {
        zt0 zt0Var = (zt0) this.f14247b;
        qg.s0.e(zt0Var.P1).k(String.valueOf(qg.m.f44508a.indexOf(zt0Var.W0.getCurrentBrush())), f7);
        qg.q1 q1Var = zt0Var.K1;
        q1Var.f44571c = f7;
        zt0Var.s0(q1Var, null);
    }

    @Override
    public void K(String str) {
        org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f14247b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public String K0() {
        return ((org.telegram.ui.web.d1) this.f14247b).f42075i0;
    }

    @Override
    public boolean L() {
        w4 w4Var = (w4) this.f14247b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.f13775a;
            if (o3Var.f14124a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        w4 w4Var = (w4) this.f14247b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.f13775a;
            g2 g2Var = o3Var.f14124a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    public boolean N(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void O(s4.c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        s4.c1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f14247b;
        recyclerView.f1894b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        s4.f1 f1Var = (s4.f1) recyclerView.f1897c0;
        f1Var.getClass();
        int i13 = q0Var.f2287a;
        int i14 = q0Var.f2288b;
        View view = c1Var.f45766a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f2287a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f2288b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f45772i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override
    public void P() {
        w4 w4Var = (w4) this.f14247b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.f13775a;
            v3 v3Var = o3Var.f14124a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.f14275h3.onContentChanged();
        }
    }

    @Override
    public boolean Q(int i10) {
        if (i10 == ((dq0) this.f14247b).f25472r) {
            return true;
        }
        return false;
    }

    public void R(s4.c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f14247b;
        s4.o0 o0Var = recyclerView.f1923x;
        View view = c1Var.f45766a;
        pf.e eVar = recyclerView.f1894b;
        m2.t tVar = o0Var.f45869a;
        l.d dVar = (l.d) tVar.f15845c;
        int indexOfChild = ((RecyclerView) dVar.f15098b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) tVar.d).F(indexOfChild)) {
                tVar.R(view);
            }
            dVar.C(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void W(boolean z10) {
        ue0 ue0Var = (ue0) this.f14247b;
        ue0Var.getClass();
        te0 te0Var = ue0Var.f30895a;
        if (te0Var != null) {
            ((ss0) te0Var).a(z10);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f14246a) {
            case 7:
                ng.h hVar = (ng.h) this.f14247b;
                float f10 = hVar.f16765b;
                float z11 = com.google.android.gms.internal.vision.e2.z(hVar.f16766c, f10, f7, f10);
                hVar.d = z11;
                if (z10) {
                    s6 s6Var = hVar.f16767e;
                    s6Var.getClass();
                    s6Var.b(null, z11);
                }
                hVar.invalidate();
                return;
            default:
                bc1 bc1Var = (bc1) ((org.telegram.ui.Cells.k0) this.f14247b);
                int i10 = (int) (org.telegram.ui.ActionBar.j6.f20918q * 100.0f);
                int i11 = (int) (f7 * 100.0f);
                org.telegram.ui.ActionBar.j6.f20918q = f7;
                if (i10 != i11) {
                    ThemeActivity themeActivity = bc1Var.f34760e.f36653e;
                    vk0 vk0Var = (vk0) themeActivity.f34203b.K(themeActivity.f34211f0);
                    if (vk0Var != null) {
                        ((e9) vk0Var.f45766a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.f20918q * 100.0f))));
                    }
                    org.telegram.ui.ActionBar.j6.E(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void a(h1 h1Var) {
        o3 o3Var = ((w4) this.f14247b).N;
        if (o3Var != null) {
            v3 v3Var = o3Var.f14124a;
            v3.L1(v3Var, h1Var);
            v3Var.f14275h3.v(h1Var, true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        Parcel I0 = eVar.I0();
        k7.a.d(I0, fVar);
        k7.a.c(I0, (s6.a) this.f14247b);
        eVar.J0(I0, 1);
    }

    @Override
    public int b(View view) {
        return s4.o0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void b0() {
        te0 te0Var = ((ue0) this.f14247b).f30895a;
        if (te0Var != null) {
            PhotoViewer photoViewer = ((ss0) te0Var).f40548a;
            if (photoViewer.f33559c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public void c0() {
        w4 w4Var = (w4) this.f14247b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            a aVar = w4Var.f13775a;
            v3.N1(o3Var.f14124a);
        }
    }

    @Override
    public int e() {
        return ((s4.o0) this.f14247b).D();
    }

    @Override
    public void f(int i10) {
        dq0 dq0Var = (dq0) this.f14247b;
        hq0 hq0Var = dq0Var.K;
        dq0Var.f25473s = i10;
        if (dq0Var.v != i10) {
            dq0Var.d.clear();
        }
        int i11 = dq0Var.J;
        if (dq0Var.h() == 0 && !dq0Var.f25469e.e() && !dq0Var.I) {
            hq0Var.Q.e(false, true);
        } else {
            hq0Var.f26845x0.b(i11);
        }
        dq0Var.l();
        int i12 = hq0.f26813a1;
        hq0Var.K0(true);
    }

    @Override
    public boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public void g() {
        w4 w4Var = (w4) this.f14247b;
        o3 o3Var = w4Var.N;
        if (o3Var != null) {
            v3.O1(o3Var.f14124a, w4Var.f13775a);
        }
    }

    @Override
    public Object mo28get() {
        return new m2.t((Context) ((l.d) this.f14247b).f15098b, new t7.u(23), new rb.a(23), 2);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f14246a) {
            case 7:
                ng.h hVar = (ng.h) this.f14247b;
                float f7 = hVar.f16765b;
                return String.valueOf(Math.round((hVar.f16764a.getProgress() * (hVar.f16766c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j(float f7) {
        return false;
    }

    @Override
    public int l0() {
        switch (this.f14246a) {
            case 7:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public int m() {
        s4.o0 o0Var = (s4.o0) this.f14247b;
        return o0Var.f45879m - o0Var.E();
    }

    public void n() {
        qg.a1 a1Var = ((qg.c1) this.f14247b).d;
        if (a1Var != null) {
            qg.z0 z0Var = a1Var.f44403s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.f44403s = null;
            }
            qg.z0 z0Var2 = new qg.z0(a1Var, 1);
            a1Var.f44403s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    public s0.c o(int i10) {
        return null;
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f14247b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.f42074h0 = false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        gk0 gk0Var = (gk0) this.f14247b;
        if (z10 && gk0Var.f26449n.n() >= 0) {
            gk0Var.f26452w = true;
        }
        fg0 fg0Var = gk0Var.f26448f;
        cc0 cc0Var = gk0Var.f26453x;
        fg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(cc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(cc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.o oVar = ((r7.i) this.f14247b).f44970b;
        synchronized (oVar) {
            oVar.f895b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.f896c).f5103c;
        }
        if (nVar != null) {
            ((r7.c) oVar.d).c(nVar, 2441);
        }
    }

    @Override
    public void q() {
        ((n9) this.f14247b).f28717a.invalidate();
    }

    @Override
    public View r(int i10) {
        return ((s4.o0) this.f14247b).q(i10);
    }

    @Override
    public void s() {
        te0 te0Var = ((ue0) this.f14247b).f30895a;
        if (te0Var != null) {
            ((ss0) te0Var).f40548a.f33576e0.invalidate();
        }
    }

    @Override
    public int t(View view) {
        return s4.o0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).rightMargin;
    }

    public String toString() {
        switch (this.f14246a) {
            case 16:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f14247b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public q9 u() {
        o3 o3Var = ((w4) this.f14247b).N;
        if (o3Var != null) {
            return o3Var.f14124a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void x(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f14247b).setResultCode(i10);
    }

    public String y(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.f14247b;
            ka.e eVar = new ka.e(stringWriter, dVar.f14906a, dVar.f14907b, dVar.f14908c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f14910b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public s0.c z(int i10) {
        return null;
    }

    public u4(s6.g gVar, s6.a aVar) {
        this.f14246a = 25;
        this.f14247b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public u4(EditText editText) {
        this.f14246a = 17;
        this.f14247b = new o0.a(editText);
    }

    public u4(int i10) {
        this.f14246a = i10;
        switch (i10) {
            case 27:
                return;
            case 28:
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f14247b = new zg0(this);
                    return;
                } else {
                    this.f14247b = new zg0(this);
                    return;
                }
            case 29:
                this.f14247b = new CopyOnWriteArrayList();
                return;
        }
    }

    @Override
    public float get() {
        zt0 zt0Var = (zt0) this.f14247b;
        int i10 = zt0Var.P1;
        qg.m currentBrush = zt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f44600i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.f44508a.indexOf(currentBrush)), currentBrush.d());
    }

    private final void I() {
    }

    private final void J() {
    }

    @Override
    public void c() {
    }

    @Override
    public void k() {
    }

    @Override
    public void W0(MrzRecognizer.Result result) {
    }

    @Override
    public void Y(ArrayList arrayList) {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void l(int i10) {
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
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
