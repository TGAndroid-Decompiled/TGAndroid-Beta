package k2;

import ai.u3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import gi.m4;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ki.b3;
import ki.g1;
import ki.g5;
import ki.h1;
import ki.h2;
import ki.o2;
import ki.r3;
import ki.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.y71;
import v7.i8;
public final class w0 implements x, ki.j0, g1, l.w, l.i, k1.f, e5, bh.h, y71, oe.a, com.google.android.gms.common.api.internal.r, n5.b, v0.i {
    public final int f14831a;
    public Object f14832b;

    public w0(Object obj, int i10) {
        this.f14831a = i10;
        this.f14832b = obj;
    }

    @Override
    public void B() {
        x2.n nVar;
        x0 x0Var = (x0) this.f14832b;
        synchronized (x0Var.f12313a) {
            nVar = x0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f14832b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public m9 D() {
        return (ki.z0) this.f14832b;
    }

    @Override
    public ki.a F() {
        return ((ki.z0) this.f14832b).f15113a;
    }

    @Override
    public void G(Editable editable) {
        ((g5) this.f14832b).h();
    }

    @Override
    public boolean H() {
        ki.z0 z0Var = (ki.z0) this.f14832b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15113a;
            if (r3Var.f15490a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void I(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((x0) this.f14832b).f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override
    public void J(bh.a aVar) {
        switch (this.f14831a) {
            case 11:
                aVar.a(((ti) this.f14832b).getThemedColor(h6.f20989d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((er0) this.f14832b).getThemedColor(h6.f20989d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public void K(int i10, int i11) {
        ki.z0 z0Var = (ki.z0) this.f14832b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15113a;
            h2 h2Var = r3Var.f15490a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void L() {
        ((x0) this.f14832b).f14842j1 = true;
    }

    @Override
    public boolean M(boolean z10) {
        return false;
    }

    @Override
    public void N() {
        ki.z0 z0Var = (ki.z0) this.f14832b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15113a;
            w3 w3Var = r3Var.f15490a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15594f3.onContentChanged();
        }
    }

    @Override
    public boolean P(h1 h1Var) {
        return false;
    }

    @Override
    public void Q(u0 u0Var) {
        qf.b bVar = ((x0) this.f14832b).f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 1));
        }
    }

    @Override
    public void R(h1 h1Var, int i10, int i11) {
        ki.e5 e5Var;
        n9 textSelectionHelper;
        g5 g5Var = (g5) this.f14832b;
        if (!g5Var.f15289w && i10 != i11 && (e5Var = g5Var.f15288s) != null && (textSelectionHelper = ((b3) e5Var).f15146a.getTextSelectionHelper()) != null) {
            h1Var.post(new m4(this, h1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public void T(u0 u0Var) {
        qf.b bVar = ((x0) this.f14832b).f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new t(bVar, u0Var, 0));
        }
    }

    @Override
    public void U() {
        i2.l0 l0Var = ((x0) this.f14832b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public void X() {
        ki.z0 z0Var = (ki.z0) this.f14832b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            ki.a aVar = z0Var.f15113a;
            w3.P1(r3Var.f15490a);
        }
    }

    @Override
    public void a(long j10) {
        x0 x0Var = (x0) this.f14832b;
        x0Var.f14844m1 = true;
        qf.b bVar = x0Var.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new u3(bVar, j10, 13));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14831a) {
            case 18:
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel N0 = zVar.N0();
                r7.d.c(N0, (g8.e) this.f14832b);
                r7.d.d(N0, fVar);
                N0.writeString(null);
                zVar.R0(N0, 63);
                return;
            default:
                v8.j jVar = (v8.j) this.f14832b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8399a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f8407a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.O(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void b(Canvas canvas) {
        switch (this.f14831a) {
            case 11:
                ti tiVar = (ti) this.f14832b;
                canvas.drawColor(tiVar.getThemedColor(h6.f20989d6));
                if (SharedConfig.chatBlurEnabled()) {
                    tiVar.F2.b(canvas, -3);
                    return;
                }
                return;
            default:
                er0 er0Var = (er0) this.f14832b;
                canvas.drawColor(er0Var.getThemedColor(h6.f20989d6));
                if (SharedConfig.chatBlurEnabled()) {
                    er0Var.P0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void c(h1 h1Var) {
        switch (this.f14831a) {
            case 1:
                r3 r3Var = ((ki.z0) this.f14832b).S;
                if (r3Var != null) {
                    w3 w3Var = r3Var.f15490a;
                    w3.N1(w3Var, h1Var);
                    w3Var.f15594f3.o(h1Var, true);
                    return;
                }
                return;
            default:
                ki.e5 e5Var = ((g5) this.f14832b).f15288s;
                if (e5Var != null) {
                    w3 w3Var2 = ((b3) e5Var).f15146a;
                    w3.N1(w3Var2, h1Var);
                    w3Var2.f15594f3.o(h1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f15734z.k().c(false);
        }
        l.w wVar = ((m.i) this.f14832b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g() {
        ki.z0 z0Var = (ki.z0) this.f14832b;
        r3 r3Var = z0Var.S;
        if (r3Var != null) {
            w3.Q1(r3Var.f15490a, z0Var.f15113a);
        }
    }

    @Override
    public Object mo27get() {
        return new s5.i((Context) ((hd.a) this.f14832b).mo27get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override
    public ee.b getData() {
        return ((k1.z) this.f14832b).f14634c;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public Object h(td.p pVar, md.c cVar) {
        return ((k1.z) this.f14832b).h(new n1.c(pVar, null, 0), cVar);
    }

    public void i(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f14832b;
        if (pVar == eVar.f44107y && mVar != null) {
            p4.u uVar = eVar.f44106x.f44198a;
            String d = mVar.d();
            p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f44107y, 3, eVar.f44106x, collection);
                eVar.f44106x = null;
                eVar.f44107y = null;
            }
        } else if (pVar == eVar.e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public void j() {
        ((x0) this.f14832b).l1 = true;
    }

    @Override
    public void k(h1 h1Var) {
        ki.a aVar;
        g5 g5Var = (g5) this.f14832b;
        ki.e5 e5Var = g5Var.f15288s;
        if (e5Var != null && (aVar = g5Var.f15113a) != null) {
            w3 w3Var = ((b3) e5Var).f15146a;
            ArrayList arrayList = w3Var.f15602j3;
            long j10 = aVar.f15112t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ki.a) arrayList.get(i11)).f15103k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    h2 h2Var = w3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    ki.a aVar2 = new ki.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f15103k;
                    ArrayList arrayList3 = aVar2.f15103k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a1.g.y(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    w3Var.t4();
                    w3Var.W2.N(false);
                    h2 h2Var2 = w3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var.post(new o2(w3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void l() {
        i2.l0 l0Var = ((x0) this.f14832b).Y;
        if (l0Var != null) {
            l0Var.f12476a.f12556i0 = true;
        }
    }

    public byte m() {
        int read = ((com.google.firebase.messaging.d) this.f14832b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void n(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f14832b;
        m.i iVar = toolbar.f2789a.J;
        if (iVar != null && iVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f16205c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.b0) it.next()).f3166a.t();
        }
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        d71 d71Var = (d71) this.f14832b;
        float f11 = -dp;
        d71Var.f25443g.inset(f11, f11);
        boolean contains = d71Var.f25443g.contains(f7, f10);
        float f12 = dp;
        d71Var.f25443g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        x0 x0Var = (x0) this.f14832b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = x0Var.f14835c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = x0Var.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 14));
        }
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((d71) this.f14832b).f25445j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((d71) this.f14832b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((d71) this.f14832b).h.c(false);
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        be.m mVar = (be.m) this.f14832b;
        if (mVar.w()) {
            mVar.resumeWith(i8.a(e));
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
        be.m mVar = (be.m) this.f14832b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((x0) this.f14832b).f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new ah.t(12, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        m60 m60Var;
        VideoEditedInfo videoEditedInfo;
        f60 f60Var = (f60) this.f14832b;
        b81 b81Var = f60Var.H0.T;
        if (b81Var != null && b81Var.y() && i10 == 4 && (videoEditedInfo = (m60Var = f60Var.H0).S) != null) {
            b81 b81Var2 = m60Var.T;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            b81Var2.K(j10);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p() {
        return ((m() & 255) << 24) | ((m() & 255) << 16) | ((m() & 255) << 8) | (m() & 255);
    }

    @Override
    public boolean q(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f14832b).getClass();
        return false;
    }

    @Override
    public boolean r(l.k kVar) {
        m.i iVar = (m.i) this.f14832b;
        if (kVar == iVar.f16220c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        iVar.getClass();
        l.w wVar = iVar.e;
        if (wVar == null) {
            return false;
        }
        return wVar.r(kVar);
    }

    @Override
    public boolean s(h1 h1Var) {
        return false;
    }

    @Override
    public void t(int i10, long j10, long j11) {
        qf.b bVar = ((x0) this.f14832b).f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new s(bVar, i10, j10, j11, 0));
        }
    }

    public int u() {
        return ((m() & Byte.MAX_VALUE) << 21) | ((m() & Byte.MAX_VALUE) << 14) | ((m() & Byte.MAX_VALUE) << 7) | (m() & Byte.MAX_VALUE);
    }

    public void v(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f14832b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public n9 w() {
        r3 r3Var = ((ki.z0) this.f14832b).S;
        if (r3Var == null) {
            return null;
        }
        return r3Var.f15490a.getTextSelectionHelper();
    }

    @Override
    public void z(CharSequence charSequence) {
        r3 r3Var = ((ki.z0) this.f14832b).S;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f15490a.u4(charSequence.toString());
            }
        }
    }

    public w0(int i10) {
        this.f14831a = i10;
        switch (i10) {
            case 26:
                return;
            default:
                this.f14832b = new SparseArray();
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public w0(TextView textView) {
        this.f14831a = 17;
        this.f14832b = new q1.g(textView);
    }

    @Override
    public void onError(b81 b81Var, Exception exc) {
        FileLog.e(exc);
    }

    public w0(int i10, int i11) {
        this.f14831a = 13;
        this.f14832b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void o() {
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
    public void x(CharSequence charSequence) {
    }

    @Override
    public void f(int i10, int i11) {
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
