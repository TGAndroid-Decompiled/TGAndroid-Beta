package k2;

import ai.n8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vi;
import pg.u0;
import qg.w1;
import qg.x0;
import v7.u7;
public final class u implements n, l.x, l.j, k1.f, c5, ah.k, q71, me.a, w1, com.google.android.gms.common.api.internal.o, s4.e0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public final int f13383a;
    public Object f13384b;

    public u(int i10, boolean z10) {
        this.f13383a = i10;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f13384b).p(i10, i11);
    }

    @Override
    public void G() {
        x2.q qVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13384b;
        synchronized (ffmpegAudioRenderer.f10685a) {
            qVar = ffmpegAudioRenderer.H;
        }
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f13384b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public void K(ah.a aVar) {
        switch (this.f13383a) {
            case 12:
                aVar.a(((vi) this.f13384b).getThemedColor(j6.f19094d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((uq0) this.f13384b).getThemedColor(j6.f19094d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public void M0(int i10, int i11) {
        ((s4.h0) this.f13384b).t(i10, i11);
    }

    @Override
    public void P(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override
    public void S() {
        ((FfmpegAudioRenderer) this.f13384b).Z = true;
    }

    @Override
    public void V(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    @Override
    public Object a(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.f13384b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.f13384b;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8043a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8051a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override
    public void b(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    public l5.j c() {
        Context context = (Context) this.f13384b;
        if (context != null) {
            ?? obj = new Object();
            obj.f14096a = n5.a.a(l5.m.f14102a);
            a9.r rVar = new a9.r(context);
            obj.f14097b = rVar;
            obj.f14098c = n5.a.a(new m5.e(0, rVar, new a4.m(rVar, 29)));
            a9.r rVar2 = obj.f14097b;
            obj.d = new l.d(rVar2);
            fd.a a2 = n5.a.a(new m5.e(20, obj.d, n5.a.a(new u(rVar2, 25))));
            obj.e = a2;
            qb.b bVar = new qb.b(19);
            a9.r rVar3 = obj.f14097b;
            lf.h hVar = new lf.h(rVar3, a2, bVar, 21);
            fd.a aVar = obj.f14096a;
            fd.a aVar2 = obj.f14098c;
            cf.c cVar = new cf.c(aVar, aVar2, hVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f14503a = rVar3;
            obj2.f14504b = aVar2;
            obj2.f14505c = a2;
            obj2.d = hVar;
            obj2.e = aVar;
            obj2.f14506f = a2;
            obj2.h = a2;
            ?? obj3 = new Object();
            obj3.f15748a = aVar;
            obj3.f15749b = a2;
            obj3.f15750c = hVar;
            obj3.d = a2;
            obj.f14099f = n5.a.a(new aa.a(cVar, obj2, obj3, false, 28));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override
    public void d(Canvas canvas) {
        switch (this.f13383a) {
            case 12:
                vi viVar = (vi) this.f13384b;
                canvas.drawColor(viVar.getThemedColor(j6.f19094d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    return;
                }
                return;
            default:
                uq0 uq0Var = (uq0) this.f13384b;
                canvas.drawColor(uq0Var.getThemedColor(j6.f19094d6));
                if (SharedConfig.chatBlurEnabled()) {
                    uq0Var.O0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    public void e() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13384b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long h = h();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + h);
    }

    public void f(long j3) {
        long h = h();
        if (h != j3) {
            if (h != -1) {
                if (h == -2) {
                    h = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(h);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).f13911z.k().c(false);
        }
        l.x xVar = ((m.h) this.f13384b).e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f13384b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public ce.b getData() {
        return ((k1.a0) this.f13384b).f13154c;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public long h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13384b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public void j0(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f13384b).s(i10, i11);
    }

    @Override
    public void k1(int i10, int i11) {
        ((s4.h0) this.f13384b).r(i10, i11, null);
    }

    @Override
    public void l(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f13384b);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        v61 v61Var = (v61) this.f13384b;
        float f11 = -dp;
        v61Var.f28944g.inset(f11, f11);
        boolean contains = v61Var.f28944g.contains(f7, f10);
        float f12 = dp;
        v61Var.f28944g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void o() {
        ((FfmpegAudioRenderer) this.f13384b).f2657f0 = true;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new n8(yVar, i10, 11));
        }
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((v61) this.f13384b).f28946j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((v61) this.f13384b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((v61) this.f13384b).h.c(false);
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        zd.m mVar = (zd.m) this.f13384b;
        if (mVar.w()) {
            mVar.resumeWith(u7.a(e));
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        zd.m mVar = (zd.m) this.f13384b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        a60 a60Var;
        VideoEditedInfo videoEditedInfo;
        u50 u50Var = (u50) this.f13384b;
        t71 t71Var = u50Var.H0.R;
        if (t71Var != null && t71Var.y() && i10 == 4 && (videoEditedInfo = (a60Var = u50Var.H0).Q) != null) {
            t71 t71Var2 = a60Var.R;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            t71Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void r(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f13384b;
        m.h hVar = toolbar.f2025a.J;
        if (hVar != null && hVar.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f14216c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.c0) it.next()).f2402a.t();
        }
    }

    @Override
    public boolean t(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f13384b).getClass();
        return false;
    }

    @Override
    public boolean v(l.l lVar) {
        m.h hVar = (m.h) this.f13384b;
        if (lVar == hVar.f14407c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        l.x xVar = hVar.e;
        if (xVar == null) {
            return false;
        }
        return xVar.v(lVar);
    }

    @Override
    public void x(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13384b).I;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void y(float f7) {
        x0 x0Var = (x0) this.f13384b;
        u0.e(x0Var.f41996a).k("-1", f7);
        x0Var.e.setBrushSize(f7);
    }

    public u(Object obj, int i10) {
        this.f13383a = i10;
        this.f13384b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public u(int i10) {
        this.f13383a = i10;
        switch (i10) {
            case 10:
                this.f13384b = new SparseArray();
                return;
            default:
                this.f13384b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        x0 x0Var = (x0) this.f13384b;
        int i10 = x0Var.f41996a;
        pg.m currentBrush = x0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f41308i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
    }

    public u(TextView textView) {
        this.f13383a = 19;
        this.f13384b = new q1.g(textView);
    }

    public u(Context context, n4.y yVar) {
        this.f13383a = 7;
        n4.x xVar = ((n4.r) yVar.f15217a).f15201c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13384b = new n4.j(context, xVar);
        } else {
            this.f13384b = new n4.j(context, xVar);
        }
    }

    public u(int i10, int i11) {
        this.f13383a = 14;
        this.f13384b = ApplicationLoader.applicationContext.getSharedPreferences(a4.a.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void e0() {
    }

    @Override
    public void q() {
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
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
