package k2;

import ai.o8;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
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
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.os0;
import pg.u0;
import qg.v1;
import qg.w0;
import v7.u7;
public final class u implements n, l.x, l.j, k1.f, d5, lg.o, r71, me.a, v1, com.google.android.gms.common.api.internal.o, s4.e0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public Object f13371a;

    public u(Object obj) {
        this.f13371a = obj;
    }

    public static float[] f(ArrayList arrayList) {
        double d;
        double d10;
        float f7;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
        float f11;
        int i10;
        float f12;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f13 = pointF3.x;
                double d14 = d12;
                double d15 = f13 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f14 = pointF4.x;
                dArr5[1] = (f14 - f12) / 3.0d;
                double d16 = f14 - f13;
                dArr5[2] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i12] = ((f15 - f16) / d16) - ((f16 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f17 = pointF6.x;
                    if (i21 < ((int) f17)) {
                        float f18 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - pointF5.x;
                        double d23 = (f18 - f11) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f19 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f19 > f7) {
                            f19 = 255.0f;
                        } else if (f19 < 0.0f) {
                            f19 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f19));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) hg.k0.g(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) hg.k0.g(1, arrayList2)).x;
        if (f21 < f7) {
            for (int i24 = ((int) f21) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f13371a).p(i10, i11);
    }

    @Override
    public void G() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f13371a;
        synchronized (ffmpegAudioRenderer.f10641a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f13371a;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public void K(boolean z10) {
        ((ef0) this.f13371a).f24055c.setAspectLock(z10);
    }

    @Override
    public void O0(int i10, int i11) {
        ((s4.h0) this.f13371a).t(i10, i11);
    }

    @Override
    public void P(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override
    public void S() {
        ((FfmpegAudioRenderer) this.f13371a).Z = true;
    }

    @Override
    public void V(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    @Override
    public void Z(float f7) {
        w0 w0Var = (w0) this.f13371a;
        u0.e(w0Var.f42004a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override
    public Object a(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.f13371a).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.f13371a;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8027a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8035a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override
    public void b(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    public void c(HashMap hashMap) {
        if (((SparseArray) this.f13371a) == null) {
            this.f13371a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f13371a).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public void d(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f13371a);
    }

    public l5.j e() {
        Context context = (Context) this.f13371a;
        if (context != null) {
            ?? obj = new Object();
            obj.f14124a = n5.a.a(l5.m.f14130a);
            a9.r rVar = new a9.r(context);
            obj.f14125b = rVar;
            obj.f14126c = n5.a.a(new n4.y(26, rVar, new a4.m(rVar, 28)));
            a9.r rVar2 = obj.f14125b;
            obj.d = new l.d(rVar2);
            fd.a a2 = n5.a.a(new o0.a(16, obj.d, n5.a.a(new u(rVar2))));
            obj.e = a2;
            qb.b bVar = new qb.b(19);
            a9.r rVar3 = obj.f14125b;
            la.h hVar = new la.h(rVar3, a2, bVar, 22);
            fd.a aVar = obj.f14124a;
            fd.a aVar2 = obj.f14126c;
            cf.c cVar = new cf.c(aVar, aVar2, hVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f14550a = rVar3;
            obj2.f14551b = aVar2;
            obj2.f14552c = a2;
            obj2.d = hVar;
            obj2.e = aVar;
            obj2.f14553f = a2;
            obj2.h = a2;
            ?? obj3 = new Object();
            obj3.f41365a = aVar;
            obj3.f41366b = a2;
            obj3.f41367c = hVar;
            obj3.d = a2;
            obj.f14127f = n5.a.a(new aa.a(cVar, obj2, obj3, false, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override
    public void e0(boolean z10) {
        ef0 ef0Var = (ef0) this.f13371a;
        ef0Var.getClass();
        df0 df0Var = ef0Var.f24053a;
        if (df0Var != null) {
            ((os0) df0Var).a(z10);
        }
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).f13939z.k().c(false);
        }
        l.x xVar = ((m.h) this.f13371a).e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override
    public void g0() {
        df0 df0Var = ((ef0) this.f13371a).f24053a;
        if (df0Var != null) {
            PhotoViewer photoViewer = ((os0) df0Var).f36249a;
            if (photoViewer.f31209c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f13371a).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public ce.b getData() {
        return ((k1.a0) this.f13371a).f13145c;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public void h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13371a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long j3 = j();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + j3);
    }

    public void i(long j3) {
        long j10 = j();
        if (j10 != j3) {
            if (j10 != -1) {
                if (j10 == -2) {
                    j10 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(j10);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    public long j() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13371a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void j0(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f13371a).s(i10, i11);
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f13371a).r(i10, i11, null);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        x61 x61Var = (x61) this.f13371a;
        float f11 = -dp;
        x61Var.f30321g.inset(f11, f11);
        boolean contains = x61Var.f30321g.contains(f7, f10);
        float f12 = dp;
        x61Var.f30321g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void o() {
        ((FfmpegAudioRenderer) this.f13371a).f2651f0 = true;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((x61) this.f13371a).f30323j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((x61) this.f13371a).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((x61) this.f13371a).h.c(false);
    }

    @Override
    public void onError(u71 u71Var, Exception exc) {
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
        zd.m mVar = (zd.m) this.f13371a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        tk0 tk0Var = (tk0) this.f13371a;
        if (z10 && tk0Var.f28622n.n() >= 0) {
            tk0Var.f28625w = true;
        }
        sg0 sg0Var = tk0Var.f28621f;
        jc0 jc0Var = tk0Var.f28626x;
        sg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(jc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(jc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f13371a;
        m.h hVar = toolbar.f2019a.J;
        if (hVar != null && hVar.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.d).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.c0) it.next()).f2396a.t();
        }
    }

    @Override
    public boolean s(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f13371a).getClass();
        return false;
    }

    @Override
    public boolean v(l.l lVar) {
        m.h hVar = (m.h) this.f13371a;
        if (lVar == hVar.f14454c) {
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
    public void y(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.f13371a).I;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void z() {
        df0 df0Var = ((ef0) this.f13371a).f24053a;
        if (df0Var != null) {
            ((os0) df0Var).f36249a.f31225e0.invalidate();
        }
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        zd.m mVar = (zd.m) this.f13371a;
        if (mVar.w()) {
            mVar.resumeWith(u7.a(e));
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public float get() {
        w0 w0Var = (w0) this.f13371a;
        int i10 = w0Var.f42004a;
        pg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f41277i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public void f0() {
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
