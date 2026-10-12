package k2;

import ai.p8;
import android.content.ComponentName;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t6;
import org.telegram.ui.Components.w60;
import org.telegram.ui.n9;
import org.telegram.ui.web.b1;
import org.telegram.ui.x9;
import pg.a1;
import pg.d1;
import r0.k1;
import s4.j1;
import s4.p0;
import s4.q0;
import v7.a8;
public class g0 implements n, y2.m, l.w, l.i, pp0, f5, ah.j, n81, g81, r0.n, x9, r4.c, com.google.android.gms.common.api.internal.o, j1, com.google.android.gms.common.api.internal.s, v0.i {
    public final int f14466a;
    public Object f14467b;

    public g0(Object obj, int i10) {
        this.f14466a = i10;
        this.f14467b = obj;
    }

    @Override
    public String A0() {
        return ((b1) this.f14467b).f43194i0;
    }

    @Override
    public void C() {
        x2.p pVar;
        h0 h0Var = (h0) this.f14467b;
        synchronized (h0Var.f11642a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public int D() {
        return ((p0) this.f14467b).G();
    }

    @Override
    public void G(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((h0) this.f14467b).X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override
    public boolean H(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f14467b).getClass();
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f14467b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public void K(String str) {
        b1 b1Var = (b1) this.f14467b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public void L() {
        ((h0) this.f14467b).f14477g1 = true;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        mn0 mn0Var = (mn0) this.f14467b;
        mn0Var.v.setPadding(defaultWindowInsets.f11574a, defaultWindowInsets.f11575b, defaultWindowInsets.f11576c, defaultWindowInsets.d);
        mn0Var.f28601s.requestLayout();
        return k1.f46999b;
    }

    @Override
    public void N(k kVar) {
        n4.y yVar = ((h0) this.f14467b).X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    @Override
    public int U() {
        p0 p0Var = (p0) this.f14467b;
        return p0Var.f48013n - p0Var.C();
    }

    @Override
    public void V() {
        i2.j0 j0Var = ((h0) this.f14467b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.f14467b;
        float f10 = hVar.f16177b;
        float y3 = e2.y(hVar.f16178c, f10, f7, f10);
        hVar.d = y3;
        if (z10) {
            t6 t6Var = hVar.f16179e;
            t6Var.getClass();
            t6Var.c(null, y3);
        }
        hVar.invalidate();
    }

    @Override
    public View Z(int i10) {
        return ((p0) this.f14467b).q(i10);
    }

    @Override
    public boolean Z0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public void a() {
        l2.h hVar = (l2.h) this.f14467b;
        hVar.A.a();
        z4 z4Var = hVar.C;
        if (z4Var == null) {
            return;
        }
        throw z4Var;
    }

    @Override
    public void a0(k kVar) {
        n4.y yVar = ((h0) this.f14467b).X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14466a) {
            case 25:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H0 = eVar.H0();
                k7.a.d(H0, fVar);
                k7.a.c(H0, (s6.a) this.f14467b);
                H0.writeStrongBinder(null);
                eVar.I0(H0, 2);
                return;
            default:
                v8.j jVar = (v8.j) this.f14467b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8698a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f8706a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.O(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void b(long j3) {
        n4.y yVar = ((h0) this.f14467b).X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 13));
        }
    }

    public n4.a c() {
        return new n4.a(((AudioAttributes.Builder) this.f14467b).build());
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f14960z.k().c(false);
        }
        l.w wVar = ((m.h) this.f14467b).f15431e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public int d0(View view) {
        return p0.v(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
    }

    public void e() {
        pg.b1 b1Var = ((d1) this.f14467b).d;
        if (b1Var != null) {
            a1 a1Var = b1Var.f45488s;
            if (a1Var != null) {
                b1Var.cancelRunnable(a1Var);
                b1Var.f45488s = null;
            }
            a1 a1Var2 = new a1(b1Var, 1);
            b1Var.f45488s = a1Var2;
            b1Var.postRunnable(a1Var2, 1L);
        }
    }

    public void f(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f14467b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public g0 g(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f14467b).setUsage(i10);
        return this;
    }

    @Override
    public void g0(ah.a aVar) {
        aVar.a(((aj) this.f14467b).getThemedColor(h6.f20560d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.f14467b;
        float f7 = hVar.f16177b;
        return String.valueOf(Math.round((hVar.f16176a.getProgress() * (hVar.f16178c - f7)) + f7));
    }

    public void h(int i10) {
        g(i10);
    }

    @Override
    public void i() {
        ((h0) this.f14467b).f14479i1 = true;
    }

    @Override
    public void invalidate() {
        ((jh0) this.f14467b).h.invalidate();
    }

    public Object j() {
        if (n7.a.f16486b == null) {
            n7.a.f16486b = new Exception();
        }
        synchronized (n7.a.f16485a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public void l(Canvas canvas) {
        aj ajVar = (aj) this.f14467b;
        canvas.drawColor(ajVar.getThemedColor(h6.f20560d6));
        if (SharedConfig.chatBlurEnabled()) {
            ajVar.F2.b(canvas, -3);
        }
    }

    @Override
    public void l0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public int m(View view) {
        return p0.z(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public void n() {
        i2.j0 j0Var = ((h0) this.f14467b).W;
        if (j0Var != null) {
            j0Var.f11756a.f11845g0 = true;
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        h0 h0Var = (h0) this.f14467b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = h0Var.Z0) != null) {
            jVar.d(i10);
        }
        n4.y yVar = h0Var.X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new p8(yVar, i10, 11));
        }
    }

    @Override
    public void onDismiss() {
        b1 b1Var = (b1) this.f14467b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.f43193h0 = false;
    }

    @Override
    public void onError(Object obj) {
        w0.d e7 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        ae.m mVar = (ae.m) this.f14467b;
        if (mVar.w()) {
            mVar.resumeWith(a8.a(e7));
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        ae.m mVar = (ae.m) this.f14467b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((h0) this.f14467b).X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new bi.f(8, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        w60 w60Var;
        VideoEditedInfo videoEditedInfo;
        p60 p60Var = (p60) this.f14467b;
        q81 q81Var = p60Var.H0.T;
        if (q81Var != null && q81Var.y() && i10 == 4 && (videoEditedInfo = (w60Var = p60Var.H0).S) != null) {
            q81 q81Var2 = w60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            q81Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void q0(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f14467b).setResultCode(i10);
    }

    @Override
    public void s(int i10, long j3, long j10) {
        n4.y yVar = ((h0) this.f14467b).X0;
        Handler handler = (Handler) yVar.f16363b;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    public String toString() {
        switch (this.f14466a) {
            case 17:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f14467b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f14467b;
        m.h hVar = toolbar.f2271a.J;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f15425c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.c0) it.next()).f2672a.t();
        }
    }

    @Override
    public void v(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.n nVar2 = ((r7.i) this.f14467b).f47231b;
        synchronized (nVar2) {
            nVar2.f2145b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f2146c).f6653c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override
    public boolean x(l.k kVar) {
        m.h hVar = (m.h) this.f14467b;
        if (kVar == hVar.f15430c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.f15431e;
        if (wVar == null) {
            return false;
        }
        return wVar.x(kVar);
    }

    public g0(s6.g gVar, s6.a aVar) {
        this.f14466a = 25;
        this.f14467b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public g0(ArrayList arrayList) {
        this.f14466a = 22;
        this.f14467b = DesugarCollections.unmodifiableList(arrayList);
    }

    public g0(int i10) {
        this.f14466a = i10;
        switch (i10) {
            case 9:
                this.f14467b = new SparseArray();
                return;
            case 28:
                return;
            default:
                this.f14467b = new AudioAttributes.Builder();
                return;
        }
    }

    @Override
    public void onError(q81 q81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void z() {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
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
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
