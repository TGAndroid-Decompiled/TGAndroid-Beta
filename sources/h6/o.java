package h6;

import a8.p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import bi.e4;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h9.g1;
import hi.d6;
import hi.f6;
import hi.pa;
import hi.rb;
import hi.s0;
import hi.u0;
import hi.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.o1;
import jg.x1;
import jg.y1;
import kg.i0;
import l2.j0;
import li.c0;
import m.x0;
import n2.t0;
import n2.v;
import n2.v0;
import oi.a3;
import oi.b2;
import oi.c5;
import oi.e1;
import oi.e5;
import oi.f1;
import oi.g2;
import oi.h0;
import oi.n2;
import oi.n3;
import oi.t3;
import oi.x;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.jc;
import org.telegram.messenger.l0;
import org.telegram.messenger.lu;
import org.telegram.messenger.m0;
import org.telegram.messenger.ta;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a00;
import org.telegram.ui.dg0;
import org.telegram.ui.ke;
import org.telegram.ui.lw;
import org.telegram.ui.q00;
import org.telegram.ui.uz;
import tg.q1;
public class o implements j6.o, g1, og.n, q1, f61, rb, i6.a, pt0, y1, com.google.android.gms.common.api.internal.q, a00, x0, OnCompleteListener, v, h0, z4, e1, ta, jc, y51 {
    public final int f13935a;
    public Object f13936b;

    public o(int i7, boolean z10) {
        this.f13935a = i7;
    }

    @Override
    public void A(f1 f1Var) {
        oi.a aVar;
        e5 e5Var = (e5) this.f13936b;
        c5 c5Var = e5Var.f22151s;
        if (c5Var != null && (aVar = e5Var.f22598a) != null) {
            t3 t3Var = ((a3) c5Var).f22027a;
            ArrayList arrayList = t3Var.f22503t3;
            long j3 = aVar.f22017t;
            if (j3 != 0) {
                int i7 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((oi.a) arrayList.get(i10)).f22008k.contains(Long.valueOf(j3))) {
                        i7 = i10;
                    }
                }
                if (i7 >= 0) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f22008k;
                    ArrayList arrayList3 = aVar2.f22008k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        p0.z(1, arrayList3);
                    }
                    arrayList.add(i7 + 1, aVar2);
                    t3Var.v4();
                    t3Var.f35323g3.O(false);
                    g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var.post(new n2(t3Var, aVar2, 26));
                }
            }
        }
    }

    public void A0() {
        u0 u0Var = (u0) this.f13936b;
        u0Var.getClass();
        try {
            l8.b bVar = (l8.b) u0Var.f15482b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59422a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void B(fj fjVar) {
        c0 c0Var = (c0) this.f13936b;
        c0Var.f20002u1.presentFragment(tm0.K(c0Var.f30223a, fjVar));
        c0Var.dismiss();
    }

    public void B0(ke keVar) {
        ((w2) this.f13936b).I0 = keVar;
    }

    @Override
    public void C(String str, long j3, long j10, long j11) {
        p pVar = (p) this.f13936b;
        try {
            pVar.a(new n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h.f13913k;
            Log.e(bVar.f17332a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = pVar.f13939q.f13920i.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public void C0() {
        u0 u0Var = (u0) this.f13936b;
        u0Var.getClass();
        try {
            l8.b bVar = (l8.b) u0Var.f15482b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59422a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void D0() {
        ((w2) this.f13936b).show();
    }

    @Override
    public void E(boolean z10) {
        ii.t tVar = (ii.t) this.f13936b;
        te.a aVar = tVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        q00 q00Var = tVar.f51574s;
        if (q00Var != null) {
            q00Var.invalidate();
        }
    }

    @Override
    public void G() {
        ((s0) this.f13936b).d.invalidate();
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        b2 b2Var = (b2) this.f13936b;
        b2Var.x0(i7, i10, z10);
        dg0 dg0Var = b2Var.P0;
        if (dg0Var != null) {
            dg0Var.i();
            b2Var.P0 = null;
        }
    }

    @Override
    public i9 K() {
        n3 n3Var = ((x) this.f13936b).P;
        if (n3Var != null) {
            return n3Var.f22336a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public float K0() {
        return i5.c.d(9.66f, ri.a.d(((ii.t) this.f13936b).f16427c0), 0);
    }

    @Override
    public void M(CharSequence charSequence) {
        n3 n3Var = ((x) this.f13936b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                n3Var.f22336a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void N() {
        a3.s sVar;
        v0 v0Var = (v0) this.f13936b;
        synchronized (v0Var.f19346a) {
            sVar = v0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public h9 P() {
        return (x) this.f13936b;
    }

    @Override
    public void Q(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        jb.m mVar = ((v0) this.f13936b).f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new n2.p(mVar, exc, 1));
        }
    }

    @Override
    public int T0() {
        return ((ii.t) this.f13936b).f16428d0;
    }

    @Override
    public oi.a V() {
        return ((x) this.f13936b).f22598a;
    }

    @Override
    public boolean W() {
        x xVar = (x) this.f13936b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.f22598a;
            if (n3Var.f22336a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean W1(int i7) {
        switch (this.f13935a) {
            case 8:
                if (i7 == ((mm0) this.f13936b).f17568e0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void Y(int i7, int i10) {
        x xVar = (x) this.f13936b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.f22598a;
            g2 g2Var = n3Var.f22336a.R3;
            if (g2Var != null) {
                g2Var.f(i7, i10);
            }
        }
    }

    @Override
    public a0.h Y0() {
        switch (this.f13935a) {
            case 8:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: h6.o.Z(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void a(int i7) {
        u2.j jVar;
        v0 v0Var = (v0) this.f13936b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.f21341d1) != null) {
            jVar.d(i7);
        }
        jb.m mVar = v0Var.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new ai.u0(mVar, i7, 20));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        l7.a aVar = new l7.a((TaskCompletionSource) obj2);
        l7.i iVar = (l7.i) ((l7.c) obj).n();
        String str = ((l7.b) this.f13936b).f19792l;
        Parcel l1 = iVar.l1();
        int i7 = l7.f.f19796a;
        l1.writeStrongBinder(aVar);
        l1.writeString(str);
        iVar.m1(l1, 2);
    }

    @Override
    public void b(long j3) {
        v0 v0Var = (v0) this.f13936b;
        v0Var.n1 = true;
        jb.m mVar = v0Var.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new e4(mVar, j3, 14));
        }
    }

    @Override
    public void c(boolean z10) {
        jb.m mVar = ((v0) this.f13936b).f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new ch.k(12, mVar, z10));
        }
    }

    @Override
    public void c0() {
        ((v0) this.f13936b).f21348k1 = true;
    }

    @Override
    public void d(f1 f1Var) {
        switch (this.f13935a) {
            case 19:
                n3 n3Var = ((x) this.f13936b).P;
                if (n3Var != null) {
                    t3 t3Var = n3Var.f22336a;
                    t3.Q1(t3Var, f1Var);
                    t3Var.f22495p3.b(f1Var, true);
                    return;
                }
                return;
            default:
                c5 c5Var = ((e5) this.f13936b).f22151s;
                if (c5Var != null) {
                    t3 t3Var2 = ((a3) c5Var).f22027a;
                    t3.Q1(t3Var2, f1Var);
                    t3Var2.f22495p3.b(f1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void e0(f1 f1Var, int i7, int i10) {
        c5 c5Var;
        i9 textSelectionHelper;
        e5 e5Var = (e5) this.f13936b;
        if (!e5Var.f22153x && i7 != i10 && (c5Var = e5Var.f22151s) != null && (textSelectionHelper = ((a3) c5Var).f22027a.getTextSelectionHelper()) != null) {
            f1Var.post(new o1(this, f1Var, i10, textSelectionHelper, i7, 3));
        }
    }

    @Override
    public void f(t0 t0Var) {
        jb.m mVar = ((v0) this.f13936b).f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 0));
        }
    }

    @Override
    public void f0() {
        j0 j0Var = ((v0) this.f13936b).Z;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void g() {
        x xVar = (x) this.f13936b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            t3.T1(n3Var.f22336a, xVar.f22598a);
        }
    }

    @Override
    public void g0(Editable editable) {
        ((e5) this.f13936b).g();
    }

    @Override
    public float get() {
        pa paVar = (pa) this.f13936b;
        int i7 = paVar.f15583p1;
        sg.h currentBrush = paVar.f15600y0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.j0.e(i7).f57382i;
        }
        return sg.j0.e(i7).f(String.valueOf(sg.h.f57338a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void h0() {
        x xVar = (x) this.f13936b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.f22598a;
            t3 t3Var = n3Var.f22336a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.f22495p3.onContentChanged();
        }
    }

    @Override
    public void h2(float f10) {
        pa paVar = (pa) this.f13936b;
        sg.j0.e(paVar.f15583p1).k(String.valueOf(sg.h.f57338a.indexOf(paVar.f15600y0.getCurrentBrush())), f10);
        sg.g1 g1Var = paVar.f15573k1;
        g1Var.f57337c = f10;
        paVar.E0(g1Var, null, false);
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void invalidate() {
        ((r1) ((k1) this.f13936b).f31001b).invalidate();
    }

    @Override
    public boolean j(uz uzVar) {
        return false;
    }

    @Override
    public void k0(long j3, int i7, long j10) {
        jb.m mVar = ((v0) this.f13936b).f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new b3.b(mVar, i7, j3, j10, 1));
        }
    }

    @Override
    public void l() {
        ((v0) this.f13936b).f21349m1 = true;
    }

    public long l0(TimeUnit timeUnit) {
        return timeUnit.convert(((l0) this.f13936b).f25429c, TimeUnit.SECONDS);
    }

    @Override
    public boolean m0(boolean z10) {
        return false;
    }

    @Override
    public void m2(ArrayList arrayList) {
        boolean z10;
        switch (this.f13935a) {
            case 8:
                mm0 mm0Var = (mm0) this.f13936b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    mm0Var.K.add(((x1) arrayList.get(i7)).f17812a);
                }
                lw lwVar = mm0Var.V;
                if (lwVar != null) {
                    if (mm0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lwVar.d(z10, false);
                }
                mm0Var.f();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean o(f1 f1Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        ((CountDownLatch) this.f13936b).countDown();
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        f6 f6Var = (f6) this.f13936b;
        d6 d6Var = f6Var.M;
        g0.r(d6Var);
        h61 h61Var = f6Var.E;
        if (h61Var != null && h61Var.d0()) {
            g0.g3(d6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((f6) this.f13936b).i();
    }

    @Override
    public void q() {
        j0 j0Var = ((v0) this.f13936b).Z;
        if (j0Var != null) {
            j0Var.f19510a.f19600j0 = true;
        }
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
        ((lu) this.f13936b).t0(true);
    }

    @Override
    public void s(t0 t0Var) {
        jb.m mVar = ((v0) this.f13936b).f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 1));
        }
    }

    @Override
    public boolean t0(f1 f1Var) {
        return false;
    }

    @Override
    public Object u(Object obj, Object obj2) {
        return ((g9.k) this.f13936b).apply(obj2);
    }

    @Override
    public a0.h u1() {
        switch (this.f13935a) {
            case 8:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void v(int i7) {
        boolean z10;
        switch (this.f13935a) {
            case 8:
                mm0 mm0Var = (mm0) this.f13936b;
                mm0Var.E0--;
                mm0Var.f17570f0 = i7;
                if (mm0Var.f17571g0 != i7) {
                    mm0Var.f17584s.clear();
                }
                if (mm0Var.f17572h0 != i7) {
                    mm0Var.J.clear();
                }
                mm0Var.O = true;
                lw lwVar = mm0Var.V;
                if (lwVar != null) {
                    if (mm0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lwVar.d(z10, true);
                }
                mm0Var.f();
                lw lwVar2 = mm0Var.V;
                if (lwVar2 != null) {
                    lwVar2.c();
                    return;
                }
                return;
            default:
                g0.g3(new i0(this, 1));
                return;
        }
    }

    @Override
    public void w(Bitmap bitmap) {
        j6.b bVar = i6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) p0.f(f10, 9.0f, 16.0f, 0.5f);
            float f12 = (f11 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f12, f10, height + f12);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, f11, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((i6.i) this.f13936b).e(0, bitmap2);
    }

    @Override
    public void w0() {
        x xVar = (x) this.f13936b;
        n3 n3Var = xVar.P;
        if (n3Var != null) {
            oi.a aVar = xVar.f22598a;
            t3.S1(n3Var.f22336a);
        }
    }

    @Override
    public void x(boolean z10, float f10) {
        ((y7) this.f13936b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    public void x0() {
        u0 u0Var = (u0) this.f13936b;
        u0Var.getClass();
        try {
            l8.b bVar = (l8.b) u0Var.f15482b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59422a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void z0() {
        ((w2) this.f13936b).f30254p0 = false;
    }

    public o(Object obj, int i7) {
        this.f13935a = i7;
        this.f13936b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public o(a7.a aVar) {
        this.f13935a = 9;
        q6.m.h(aVar);
        this.f13936b = aVar;
    }

    public o(int i7) {
        this.f13935a = i7;
        switch (i7) {
            case 22:
                this.f13936b = new Object();
                return;
            case 23:
                this.f13936b = new m0();
                return;
            default:
                this.f13936b = new AtomicInteger(0);
                return;
        }
    }

    public o(String str, long j3) {
        this.f13935a = 24;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f13936b = new l0(str, j3);
    }

    public o(Context context, i6 i6Var) {
        this.f13935a = 28;
        w2 w2Var = new w2(1, context, i6Var, false);
        this.f13936b = w2Var;
        w2Var.O();
    }

    @Override
    public void F() {
    }

    @Override
    public void h() {
    }

    @Override
    public void p0() {
    }

    @Override
    public void t() {
    }

    @Override
    public void v0() {
    }

    private final void s0(ArrayList arrayList) {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void L(float f10) {
    }

    @Override
    public void O(int i7) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void T(CharSequence charSequence) {
    }

    @Override
    public void U(long j3) {
    }

    @Override
    public void X(boolean z10) {
    }

    @Override
    public void a0(int i7) {
    }

    @Override
    public void d0(float f10) {
    }

    @Override
    public void e(int i7) {
    }

    @Override
    public void j0(float f10) {
    }

    @Override
    public void k(float f10) {
    }

    @Override
    public void n(float f10) {
    }

    @Override
    public void o0(float f10) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void q0(boolean z10) {
    }

    @Override
    public void r0(float f10) {
    }

    @Override
    public void y0(long j3) {
    }

    @Override
    public void z(float f10) {
    }

    @Override
    public void H(float f10, int i7) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public void b0(float f10, int i7) {
    }

    @Override
    public void m(int i7, int i10) {
    }

    @Override
    public void n0(float f10, int i7) {
    }

    @Override
    public void onError(h61 h61Var, Exception exc) {
    }

    @Override
    public void p(long j3, boolean z10) {
    }

    @Override
    public void u0(int i7, long j3) {
    }

    @Override
    public void S(fj fjVar, View view, int i7) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
