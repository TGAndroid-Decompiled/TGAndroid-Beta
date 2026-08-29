package nh;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ki0;
import org.telegram.ui.pr0;
import org.telegram.ui.qx;
import org.telegram.ui.ta1;
public final class d6 implements u61, o0.a, o2.n, zn0, vd.e, wf.m, rf.j1, org.telegram.ui.q9, o4.i, OnCompleteListener, pa.m, r5.a, com.google.android.gms.common.api.internal.s, li, vn0, org.telegram.ui.Components.b5, th.g0 {
    public final int f17532a;
    public final Object f17533b;

    public d6(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f17532a = i10;
        this.f17533b = obj;
    }

    @Override
    public boolean A(int i10) {
        switch (this.f17532a) {
            case 10:
                if (i10 == ((zp0) this.f17533b).f35393r) {
                    return true;
                }
                return false;
            default:
                if (i10 == ((mn0) this.f17533b).Z) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void B(CharSequence charSequence) {
        th.e4 e4Var = ((th.g4) this.f17533b).C;
        if (e4Var != null) {
            th.l3 l3Var = (th.l3) e4Var;
            l3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                l3Var.f48559a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public void C(boolean z10) {
        ((pe0) this.f17533b).f31658c.setAspectLock(z10);
    }

    @Override
    public org.telegram.ui.Cells.j9 D() {
        return (th.g4) this.f17533b;
    }

    @Override
    public void E(ArrayList arrayList) {
        boolean z10;
        switch (this.f17532a) {
            case 10:
                return;
            default:
                mn0 mn0Var = (mn0) this.f17533b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    mn0Var.F.add(((rf.i1) arrayList.get(i10)).f47262a);
                }
                qx qxVar = mn0Var.Q;
                if (qxVar != null) {
                    if (mn0Var.f47171z0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qxVar.d(z10, false);
                }
                mn0Var.l();
                return;
        }
    }

    @Override
    public String E0() {
        return ((org.telegram.ui.web.z0) this.f17533b).f44268e0;
    }

    @Override
    public long F(long j10) {
        return 1L;
    }

    @Override
    public th.a G() {
        return ((th.g4) this.f17533b).f48892a;
    }

    @Override
    public long H(long j10, long j11) {
        return 1L;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        th.x1 x1Var = (th.x1) this.f17533b;
        x1Var.s0(i10, i11, z10);
        ki0 ki0Var = x1Var.K0;
        if (ki0Var != null) {
            ki0Var.i();
            x1Var.K0 = null;
        }
    }

    @Override
    public void J(String str) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f17533b;
        try {
            z0Var.L = System.currentTimeMillis();
            z0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            FileLog.e(e10);
        }
    }

    public l3.g0 K(g9.l r42) {
        throw new UnsupportedOperationException("Method not decompiled: nh.d6.K(g9.l):l3.g0");
    }

    @Override
    public boolean M() {
        th.g4 g4Var = (th.g4) this.f17533b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.f48892a;
            if (((th.l3) e4Var).f48559a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void P(boolean z10) {
        pe0 pe0Var = (pe0) this.f17533b;
        pe0Var.getClass();
        oe0 oe0Var = pe0Var.f31656a;
        if (oe0Var != null) {
            ((pr0) oe0Var).a(z10);
        }
    }

    @Override
    public void R() {
        oe0 oe0Var = ((pe0) this.f17533b).f31656a;
        if (oe0Var != null) {
            PhotoViewer photoViewer = ((pr0) oe0Var).f41455a;
            if (photoViewer.Y1 == 1) {
                photoViewer.D2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public boolean T1() {
        return false;
    }

    @Override
    public void W(float f9, boolean z10) {
        ta1 ta1Var = (ta1) ((org.telegram.ui.Cells.k0) this.f17533b);
        int i10 = (int) (org.telegram.ui.ActionBar.g6.f23288q * 100.0f);
        int i11 = (int) (f9 * 100.0f);
        org.telegram.ui.ActionBar.g6.f23288q = f9;
        if (i10 != i11) {
            ThemeActivity themeActivity = ta1Var.f42627e.f44825e;
            vk0 vk0Var = (vk0) themeActivity.f36292b.K(themeActivity.f36293b0);
            if (vk0Var != null) {
                ((org.telegram.ui.Cells.y8) vk0Var.f6432a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.g6.f23288q * 100.0f))));
            }
            org.telegram.ui.ActionBar.g6.E(true);
        }
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f17532a;
        Object obj3 = this.f17533b;
        switch (i10) {
            case 22:
                s5.r rVar = new s5.r(1, (TaskCompletionSource) obj2);
                s5.i iVar = (s5.i) ((s5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.u.d(M0, rVar);
                M0.writeStringArray((String[]) obj3);
                iVar.R0(M0, 6);
                return;
            case 23:
            default:
                m5.l lVar = new m5.l((TaskCompletionSource) obj2);
                u6.i iVar2 = (u6.i) ((u6.c) obj).u();
                Parcel I0 = iVar2.I0();
                int i11 = u6.f.f49121a;
                I0.writeStrongBinder(lVar);
                u6.f.c(I0, (j5.e) obj3);
                iVar2.J0(I0, 1);
                return;
            case 24:
                t6.f fVar = new t6.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = c7.b.f2998a;
                obtain.writeStrongBinder(fVar);
                c7.b.b(obtain, (GetCredentialRequest) obj3);
                c7.b.b(obtain, gVar);
                ((t6.b) ((t6.d) ((t6.e) obj).u())).E0(obtain, 1);
                return;
        }
    }

    @Override
    public long b(long j10) {
        return 0L;
    }

    @Override
    public void c(float f9) {
        th.x xVar = (th.x) this.f17533b;
        MessageObject messageObject = xVar.L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        MediaController.getInstance().seekToProgress(xVar.L, f9);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17533b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                b9.b.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ce.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17533b).createWebView(webView));
    }

    @Override
    public void d(float f9) {
        MessageObject messageObject = ((th.x) this.f17533b).L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
    }

    @Override
    public boolean d1(String str, org.telegram.ui.i9 i9Var) {
        return false;
    }

    @Override
    public void e(th.d1 d1Var) {
        th.e4 e4Var = ((th.g4) this.f17533b).C;
        if (e4Var != null) {
            th.p3 p3Var = ((th.l3) e4Var).f48559a;
            th.p3.M1(p3Var, d1Var);
            p3Var.f48638d3.U(d1Var, true);
        }
    }

    @Override
    public void f(int i10) {
        int i11 = this.f17532a;
        boolean z10 = false;
        Object obj = this.f17533b;
        switch (i11) {
            case 10:
                zp0 zp0Var = (zp0) obj;
                dq0 dq0Var = zp0Var.G;
                zp0Var.f35394s = i10;
                if (zp0Var.v != i10) {
                    zp0Var.d.clear();
                }
                int i12 = zp0Var.F;
                if (zp0Var.h() == 0 && !zp0Var.f35390e.e() && !zp0Var.E) {
                    dq0Var.M.e(false, true);
                } else {
                    dq0Var.f27852t0.b(i12);
                }
                zp0Var.l();
                int i13 = dq0.W0;
                dq0Var.K0(true);
                return;
            default:
                mn0 mn0Var = (mn0) obj;
                mn0Var.f47171z0--;
                mn0Var.f47138a0 = i10;
                if (mn0Var.f47139b0 != i10) {
                    mn0Var.f47160s.clear();
                }
                if (mn0Var.f47141c0 != i10) {
                    mn0Var.E.clear();
                }
                mn0Var.J = true;
                qx qxVar = mn0Var.Q;
                if (qxVar != null) {
                    if (mn0Var.f47171z0 > 0) {
                        z10 = true;
                    }
                    qxVar.d(z10, true);
                }
                mn0Var.l();
                qx qxVar2 = mn0Var.Q;
                if (qxVar2 != null) {
                    qxVar2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ce.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17533b).getStatics());
    }

    @Override
    public void h0(int i10, int i11) {
        th.g4 g4Var = (th.g4) this.f17533b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.f48892a;
            th.b2 b2Var = ((th.l3) e4Var).f48559a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void i() {
        th.g4 g4Var = (th.g4) this.f17533b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.p3.P1(((th.l3) e4Var).f48559a, g4Var.f48892a);
        }
    }

    @Override
    public void i0() {
        th.g4 g4Var = (th.g4) this.f17533b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.f48892a;
            th.p3 p3Var = ((th.l3) e4Var).f48559a;
            th.b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f48638d3.onContentChanged();
        }
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(float f9) {
        return false;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void l0() {
        th.g4 g4Var = (th.g4) this.f17533b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.f48892a;
            th.p3.O1(((th.l3) e4Var).f48559a);
        }
    }

    @Override
    public Cursor m(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17533b;
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
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override
    public long o(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public void o0(Bitmap bitmap) {
        ((r5.h) this.f17533b).e(bitmap, 3);
    }

    @Override
    public void onComplete(Task task) {
        p5.c.h((p5.c) ((p5.j) this.f17533b).f45642c, "joinApplication", task);
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f17533b;
        z0Var.v("scan_qr_popup_closed", null);
        z0Var.f44266d0 = false;
    }

    @Override
    public void onError(x61 x61Var, Exception exc) {
        int i10 = this.f17532a;
    }

    @Override
    public void onRenderedFirstFrame() {
        int i10 = this.f17532a;
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
        int i10 = this.f17532a;
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
        int i10 = this.f17532a;
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f17532a) {
            case 0:
                f6 f6Var = (f6) this.f17533b;
                a6 a6Var = f6Var.H;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                x61 x61Var = f6Var.f17676y;
                if (x61Var != null && x61Var.z()) {
                    AndroidUtilities.runOnUIThread(a6Var);
                    return;
                }
                return;
            default:
                gk0 gk0Var = (gk0) this.f17533b;
                if (z10 && gk0Var.f28905n.o() >= 0) {
                    gk0Var.f28908w = true;
                }
                cg0 cg0Var = gk0Var.f28904f;
                xb0 xb0Var = gk0Var.f28909x;
                cg0Var.a(z10, true);
                AndroidUtilities.cancelRunOnUIThread(xb0Var);
                if (z10) {
                    AndroidUtilities.runOnUIThread(xb0Var, 16L);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f17532a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f17532a) {
            case 0:
                ((f6) this.f17533b).i();
                return;
            default:
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        int i13 = this.f17532a;
    }

    @Override
    public p4.j p(long j10) {
        return (p4.j) this.f17533b;
    }

    @Override
    public Object p2() {
        switch (this.f17532a) {
            case 15:
                Class cls = (Class) this.f17533b;
                try {
                    return pa.r.f45709a.a(cls);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
                }
            default:
                throw new RuntimeException((String) this.f17533b);
        }
    }

    @Override
    public a0.h q() {
        switch (this.f17532a) {
            case 10:
                return null;
            default:
                return null;
        }
    }

    @Override
    public long r(long j10, long j11) {
        return 0L;
    }

    @Override
    public String[] s() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f17533b).getSupportedFeatures();
    }

    @Override
    public a0.h t() {
        switch (this.f17532a) {
            case 10:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void u() {
        oe0 oe0Var = ((pe0) this.f17533b).f31656a;
        if (oe0Var != null) {
            ((pr0) oe0Var).f41455a.f35647a0.invalidate();
        }
    }

    @Override
    public void w() {
        ((org.telegram.ui.Components.j9) this.f17533b).f29619a.invalidate();
    }

    @Override
    public org.telegram.ui.Cells.k9 x() {
        th.e4 e4Var = ((th.g4) this.f17533b).C;
        if (e4Var != null) {
            return ((th.l3) e4Var).f48559a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void x0(zg zgVar) {
        NotificationCenter.getInstance(sf.l.a0((sf.l) this.f17533b)).doOnIdle(zgVar);
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public long z() {
        return 0L;
    }

    public d6(Object obj, int i10) {
        this.f17532a = i10;
        this.f17533b = obj;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
        int i10 = this.f17532a;
    }

    public d6(org.telegram.ui.Components.n nVar) {
        this.f17532a = 12;
        this.f17533b = (com.google.android.gms.internal.play_billing.r) nVar.f30787b;
    }

    public d6(int i10) {
        this.f17532a = i10;
        switch (i10) {
            case 19:
                this.f17533b = new o1.a(18);
                return;
            default:
                this.f17533b = new SparseArray();
                return;
        }
    }

    public d6(TextView textView) {
        this.f17532a = 17;
        this.f17533b = new q1.g(textView);
    }

    public d6(Context context, Uri uri) {
        this.f17532a = 1;
        this.f17533b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void O() {
    }

    private final void S() {
    }

    @Override
    public void L0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void l() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void v() {
    }

    private final void Q(k3.a aVar) {
    }

    private final void T(k3.a aVar) {
    }

    private final void U(k3.a aVar) {
    }

    private final void V(k3.a aVar) {
    }

    private final void X(k3.a aVar) {
    }

    private final void Y(k3.a aVar) {
    }

    private final void Z(ArrayList arrayList) {
    }

    private final void b0(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void S0(MrzRecognizer.Result result) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    private final void L(x61 x61Var, Exception exc) {
    }

    private final void N(x61 x61Var, Exception exc) {
    }

    @Override
    public long g(long j10, long j11) {
        return j11;
    }

    @Override
    public void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    private final void c0(int i10, int i11, float f9, int i12) {
    }

    private final void d0(int i10, int i11, float f9, int i12) {
    }

    @Override
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
