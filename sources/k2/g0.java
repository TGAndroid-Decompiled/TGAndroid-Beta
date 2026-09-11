package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.wp0;
import zh.w3;
public final class g0 implements n, l.j, l2.h, k1.f, d5, bh.h, d71, g81, com.google.android.gms.common.api.internal.s, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener, wp0 {
    public final int f14577a;
    public Object f14578b;

    public g0(Object obj, int i10) {
        this.f14577a = i10;
        this.f14578b = obj;
    }

    public void A(float f7) {
        i81 i81Var = (i81) this.f14578b;
        if (f7 == 1.0f) {
            View[] viewArr = i81Var.f27017e;
            View[] viewArr2 = i81Var.f27017e;
            if (viewArr[1] != null) {
                i81Var.F();
                i81Var.h.put(i81Var.f27018f[1], viewArr2[1]);
                i81Var.removeView(viewArr2[1]);
                i81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            i81Var.z(i81Var.f27015b);
            return;
        }
        View[] viewArr3 = i81Var.f27017e;
        View[] viewArr4 = i81Var.f27017e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (i81Var.f27024y) {
            i81Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            i81Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            i81Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            i81Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        i81Var.w(false);
    }

    public void B() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f14578b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long D = D();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + D);
    }

    public void C(long j3) {
        long D = D();
        if (D != j3) {
            if (D != -1) {
                if (D == -2) {
                    D = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(D);
            throw new IOException(t10.toString());
        }
    }

    public long D() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f14578b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.f14578b;
        f0Var.l0(i10, i11, z10);
        f0Var.dismiss();
    }

    @Override
    public void K() {
        ((h0) this.f14578b).f14589h1 = true;
    }

    @Override
    public void O(k kVar) {
        n4.y yVar = ((h0) this.f14578b).Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    @Override
    public void T() {
        i2.i0 i0Var = ((h0) this.f14578b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public void V(k kVar) {
        n4.y yVar = ((h0) this.f14578b).Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override
    public long a(long j3) {
        return 0L;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        Parcel I0 = aVar.I0();
        k7.a.c(I0, (n6.o) this.f14578b);
        try {
            aVar.f324b.transact(1, I0, null, 1);
            I0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            I0.recycle();
            throw th2;
        }
    }

    @Override
    public void b(long j3) {
        n4.y yVar = ((h0) this.f14578b).Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new bi.g(yVar, j3, 12));
        }
    }

    @Override
    public void d() {
        ((h0) this.f14578b).f14591j1 = true;
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j g(long j3) {
        return (m2.j) this.f14578b;
    }

    @Override
    public Object mo28get() {
        return new s5.i((Context) ((fd.a) this.f14578b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override
    public ce.b getData() {
        return ((k1.a0) this.f14578b).f14432c;
    }

    @Override
    public Object h(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.f14578b).h(new n1.c(pVar, null, 0), cVar);
    }

    public boolean i(int i10) {
        a81 a81Var = ((i81) this.f14578b).L;
        if (a81Var == null) {
            return false;
        }
        return a81Var.c(i10);
    }

    public void j(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f14578b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override
    public void k(Canvas canvas) {
        switch (this.f14577a) {
            case 9:
                vi viVar = (vi) this.f14578b;
                canvas.drawColor(viVar.getThemedColor(j6.f20663d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    return;
                }
                return;
            default:
                hq0 hq0Var = (hq0) this.f14578b;
                canvas.drawColor(hq0Var.getThemedColor(j6.f20663d6));
                if (SharedConfig.chatBlurEnabled()) {
                    hq0Var.O0.b(canvas, -3);
                    return;
                }
                return;
        }
    }

    @Override
    public void l() {
        i2.i0 i0Var = ((h0) this.f14578b).W;
        if (i0Var != null) {
            i0Var.f11588a.f11669g0 = true;
        }
    }

    public void m() {
        HashMap hashMap = (HashMap) this.f14578b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    @Override
    public void n(l.l lVar) {
        xa.c cVar = ((ActionMenuView) this.f14578b).K;
        if (cVar != null) {
            cVar.n(lVar);
        }
    }

    @Override
    public long o(long j3, long j10) {
        return 0L;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        h0 h0Var = (h0) this.f14578b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = h0Var.f14582a1) != null) {
            jVar.d(i10);
        }
        n4.y yVar = h0Var.Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new ah.g(yVar, i10, 12));
        }
    }

    @Override
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.f14578b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.M0(e0Var, false, null);
    }

    @Override
    public void onError(g71 g71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((h0) this.f14578b).Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new ah.u(8, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        w50 w50Var;
        VideoEditedInfo videoEditedInfo;
        v50 v50Var = (v50) this.f14578b;
        g71 g71Var = v50Var.H0.O;
        if (g71Var != null && g71Var.y() && i10 == 4 && (videoEditedInfo = (w50Var = v50Var.H0).N) != null) {
            g71 g71Var2 = w50Var.O;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            g71Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f14578b);
    }

    @Override
    public void q(int i10, long j3, long j10) {
        n4.y yVar = ((h0) this.f14578b).Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    public StringBuilder r() {
        df.a aVar = (df.a) this.f14578b;
        if (aVar instanceof ye.m) {
            StringBuilder sb2 = ((ye.m) aVar).f50042b.f50027b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public boolean s(l.l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.f14578b).P;
        if (kVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((l.d) kVar).f15072b).W.f15818c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.a0) it.next()).f1403a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean t() {
        return true;
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public void v(bh.a aVar) {
        switch (this.f14577a) {
            case 9:
                aVar.a(((vi) this.f14578b).getThemedColor(j6.f20663d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((hq0) this.f14578b).getThemedColor(j6.f20663d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public long w(long j3) {
        return 1L;
    }

    @Override
    public void x() {
        x2.p pVar;
        h0 h0Var = (h0) this.f14578b;
        synchronized (h0Var.f11494a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public long y(long j3, long j10) {
        return 1L;
    }

    @Override
    public void z(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((h0) this.f14578b).Y0;
        Handler handler = (Handler) yVar.f16496b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override
    public void z0() {
        qc k10 = ((w3) this.f14578b).getBulletinFactory().k(false);
        k10.f29689t = true;
        k10.j();
    }

    public g0(int i10) {
        this.f14577a = i10;
        switch (i10) {
            case 7:
                this.f14578b = new SparseArray();
                return;
            case 11:
                this.f14578b = new HashMap();
                return;
            case 19:
                return;
            default:
                this.f14578b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public g0(Context context, n4.y yVar) {
        this.f14577a = 4;
        n4.x xVar = ((n4.r) yVar.f16496b).f16478c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f14578b = new n4.j(context, xVar);
        } else {
            this.f14578b = new n4.j(context, xVar);
        }
    }

    @Override
    public void U() {
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
    public long c(long j3, long j10) {
        return j10;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
