package hi;

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
import android.text.style.CharacterStyle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.jc;
import org.telegram.messenger.lu;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.b00;
import org.telegram.ui.eg0;
import org.telegram.ui.fr0;
import org.telegram.ui.ke;
import org.telegram.ui.mw;
import org.telegram.ui.r00;
import org.telegram.ui.vz;
public class w4 implements tg.l1, d61, xa, i6.a, nt0, com.google.android.gms.common.api.internal.q, jg.y1, b00, m.x0, OnCompleteListener, n2.v, oi.g0, org.telegram.ui.Components.z4, oi.d1, org.telegram.messenger.ta, jc, w51, org.telegram.ui.Cells.l1, te.d {
    public final int f15644a;
    public Object f15645b;

    public w4(int i7, boolean z10) {
        this.f15644a = i7;
    }

    public void A2(ke keVar) {
        ((org.telegram.ui.ActionBar.x2) this.f15645b).I0 = keVar;
    }

    public void B2() {
        u5 u5Var = (u5) this.f15645b;
        u5Var.getClass();
        try {
            l8.b bVar = (l8.b) u5Var.f15539b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59297a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean C() {
        return false;
    }

    public void C2() {
        ((org.telegram.ui.ActionBar.x2) this.f15645b).show();
    }

    @Override
    public boolean D(float f10) {
        return false;
    }

    @Override
    public void D1() {
        l2.i0 i0Var = ((n2.u0) this.f15645b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public boolean E1(boolean z10) {
        return false;
    }

    @Override
    public void G(boolean z10) {
        ii.t tVar = (ii.t) this.f15645b;
        te.a aVar = tVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        r00 r00Var = tVar.f51839s;
        if (r00Var != null) {
            r00Var.invalidate();
        }
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean J(oi.e1 e1Var) {
        return false;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public a0.h K0() {
        switch (this.f15644a) {
            case 6:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public void M0() {
        a3.s sVar;
        n2.u0 u0Var = (n2.u0) this.f15645b;
        synchronized (u0Var.f19255a) {
            sVar = u0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        oi.z1 z1Var = (oi.z1) this.f15645b;
        z1Var.x0(i7, i10, z10);
        eg0 eg0Var = z1Var.P0;
        if (eg0Var != null) {
            eg0Var.i();
            z1Var.P0 = null;
        }
    }

    @Override
    public org.telegram.ui.Cells.i9 P0() {
        oi.m3 m3Var = ((oi.w) this.f15645b).P;
        if (m3Var != null) {
            return m3Var.f22180a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void P1(ArrayList arrayList) {
        boolean z10;
        switch (this.f15644a) {
            case 6:
                km0 km0Var = (km0) this.f15645b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    km0Var.K.add(((jg.x1) arrayList.get(i7)).f17719a);
                }
                mw mwVar = km0Var.V;
                if (mwVar != null) {
                    if (km0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mwVar.d(z10, false);
                }
                km0Var.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void Q() {
        ((n2.u0) this.f15645b).f21255m1 = true;
    }

    @Override
    public void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public boolean S(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void S0(CharSequence charSequence) {
        oi.m3 m3Var = ((oi.w) this.f15645b).P;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f22180a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f15645b;
        org.telegram.ui.Cells.f fVar = aaVar.E;
        if (aaVar.a()) {
            aaVar.f30409y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.q1 q1Var, fj fjVar) {
        return false;
    }

    @Override
    public boolean U(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((ii.t) this.f15645b).f16339c0), 0);
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        ((lu) this.f15645b).t0(true);
    }

    @Override
    public boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public void W1(long j3, int i7, long j10) {
        k8.a aVar = ((n2.u0) this.f15645b).f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override
    public void Y0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((n2.u0) this.f15645b).f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    @Override
    public int Z() {
        return 0;
    }

    @Override
    public boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void a0() {
        l2.i0 i0Var = ((n2.u0) this.f15645b).Z;
        if (i0Var != null) {
            i0Var.f19412a.f19502j0 = true;
        }
    }

    @Override
    public org.telegram.ui.Cells.h9 a1() {
        return (oi.w) this.f15645b;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15644a) {
            case 5:
                j6.r rVar = new j6.r(2, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.t) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray((String[]) this.f15645b);
                iVar.u1(p12, 7);
                return;
            default:
                l7.a aVar = new l7.a((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                String str = ((l7.b) this.f15645b).f19698l;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.f19702a;
                l1.writeStrongBinder(aVar);
                l1.writeString(str);
                iVar2.m1(l1, 2);
                return;
        }
    }

    @Override
    public boolean b() {
        return ((org.telegram.ui.Cells.aa) this.f15645b).a();
    }

    @Override
    public void b0(n2.s0 s0Var) {
        k8.a aVar = ((n2.u0) this.f15645b).f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override
    public jh.a c0() {
        return null;
    }

    @Override
    public oi.a c1() {
        return ((oi.w) this.f15645b).f22442a;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public void d(int i7) {
        u2.j jVar;
        n2.u0 u0Var = (n2.u0) this.f15645b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = u0Var.f21247d1) != null) {
            jVar.d(i7);
        }
        k8.a aVar = u0Var.f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new ai.w0(aVar, i7, 18));
        }
    }

    @Override
    public boolean d0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public a0.h d1() {
        switch (this.f15644a) {
            case 6:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean d2(oi.e1 e1Var) {
        return false;
    }

    @Override
    public void e(oi.e1 e1Var) {
        switch (this.f15644a) {
            case 17:
                oi.m3 m3Var = ((oi.w) this.f15645b).P;
                if (m3Var != null) {
                    oi.s3 s3Var = m3Var.f22180a;
                    oi.s3.Q1(s3Var, e1Var);
                    s3Var.f22337p3.k(e1Var, true);
                    return;
                }
                return;
            default:
                oi.b5 b5Var = ((oi.d5) this.f15645b).f21996s;
                if (b5Var != null) {
                    oi.s3 s3Var2 = ((oi.z2) b5Var).f22551a;
                    oi.s3.Q1(s3Var2, e1Var);
                    s3Var2.f22337p3.k(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void f(boolean z10) {
        k8.a aVar = ((n2.u0) this.f15645b).f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new ch.k(12, aVar, z10));
        }
    }

    @Override
    public boolean f1(fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public void g0(boolean z10, float f10) {
        ((e7) this.f15645b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override
    public boolean g1() {
        oi.w wVar = (oi.w) this.f15645b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22442a;
            if (m3Var.f22180a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f15645b;
        org.telegram.ui.Cells.f fVar = aaVar.E;
        if (aaVar.a()) {
            aaVar.f30409y = 0;
            q1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public float get() {
        v9 v9Var = (v9) this.f15645b;
        int i7 = v9Var.f14922p1;
        sg.h currentBrush = v9Var.f14939y0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).f57267i;
        }
        return sg.k0.e(i7).f(String.valueOf(sg.h.f57214a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String i(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.q1) ((org.telegram.ui.Cells.j1) this.f15645b).f30860b).invalidate();
    }

    @Override
    public void j(long j3) {
        n2.u0 u0Var = (n2.u0) this.f15645b;
        u0Var.n1 = true;
        k8.a aVar = u0Var.f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new bi.y3(aVar, j3, 14));
        }
    }

    @Override
    public int j1() {
        return ((ii.t) this.f15645b).f16340d0;
    }

    @Override
    public void k(n2.s0 s0Var) {
        k8.a aVar = ((n2.u0) this.f15645b).f21245b1;
        Handler handler = (Handler) aVar.f18183b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override
    public int k0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public void k2() {
        oi.w wVar = (oi.w) this.f15645b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22442a;
            oi.s3.S1(m3Var.f22180a);
        }
    }

    @Override
    public void l1(int i7, int i10) {
        oi.w wVar = (oi.w) this.f15645b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22442a;
            oi.e2 e2Var = m3Var.f22180a.R3;
            if (e2Var != null) {
                e2Var.f(i7, i10);
            }
        }
    }

    @Override
    public void m1() {
        ((org.telegram.ui.Components.g9) this.f15645b).f35424a.invalidate();
    }

    @Override
    public boolean n0() {
        return b();
    }

    public long n2(TimeUnit timeUnit) {
        return timeUnit.convert(((org.telegram.messenger.l0) this.f15645b).f25310c, TimeUnit.SECONDS);
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void o1() {
        ((n2.u0) this.f15645b).f21254k1 = true;
    }

    @Override
    public void onComplete(Task task) {
        ((CountDownLatch) this.f15645b).countDown();
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        w5 w5Var = (w5) this.f15645b;
        t5 t5Var = w5Var.M;
        org.telegram.messenger.g0.r(t5Var);
        f61 f61Var = w5Var.E;
        if (f61Var != null && f61Var.d0()) {
            org.telegram.messenger.g0.g3(t5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((w5) this.f15645b).i();
    }

    @Override
    public boolean p0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override
    public void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f15645b;
        org.telegram.ui.Cells.f fVar = aaVar.E;
        if (aaVar.a()) {
            aaVar.f30409y = 2;
            q1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void r(int i7) {
        boolean z10;
        switch (this.f15644a) {
            case 6:
                km0 km0Var = (km0) this.f15645b;
                km0Var.E0--;
                km0Var.f17477f0 = i7;
                if (km0Var.f17478g0 != i7) {
                    km0Var.f17491s.clear();
                }
                if (km0Var.f17479h0 != i7) {
                    km0Var.J.clear();
                }
                km0Var.O = true;
                mw mwVar = km0Var.V;
                if (mwVar != null) {
                    if (km0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mwVar.d(z10, true);
                }
                km0Var.f();
                mw mwVar2 = km0Var.V;
                if (mwVar2 != null) {
                    mwVar2.c();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.j0(this, 1));
                return;
        }
    }

    @Override
    public boolean r0(vz vzVar) {
        return false;
    }

    @Override
    public void r1(oi.e1 e1Var, int i7, int i10) {
        oi.b5 b5Var;
        org.telegram.ui.Cells.i9 textSelectionHelper;
        oi.d5 d5Var = (oi.d5) this.f15645b;
        if (!d5Var.f21998x && i7 != i10 && (b5Var = d5Var.f21996s) != null && (textSelectionHelper = ((oi.z2) b5Var).f22551a.getTextSelectionHelper()) != null) {
            e1Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 3));
        }
    }

    public void r2() {
        u5 u5Var = (u5) this.f15645b;
        u5Var.getClass();
        try {
            l8.b bVar = (l8.b) u5Var.f15539b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59297a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void s1(Editable editable) {
        ((oi.d5) this.f15645b).g();
    }

    @Override
    public void t0(fj fjVar) {
        li.d0 d0Var = (li.d0) this.f15645b;
        d0Var.f19911u1.presentFragment(rm0.I(d0Var.f30189a, fjVar));
        d0Var.dismiss();
    }

    @Override
    public void u() {
        oi.w wVar = (oi.w) this.f15645b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.s3.T1(m3Var.f22180a, wVar.f22442a);
        }
    }

    @Override
    public void u1() {
        oi.w wVar = (oi.w) this.f15645b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22442a;
            oi.s3 s3Var = m3Var.f22180a;
            oi.e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.g();
            }
            s3Var.f22337p3.onContentChanged();
        }
    }

    public void u2() {
        ((org.telegram.ui.ActionBar.x2) this.f15645b).f30220p0 = false;
    }

    @Override
    public void v0(Bitmap bitmap) {
        j6.b bVar = i6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) a8.p0.f(f10, 9.0f, 16.0f, 0.5f);
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
        ((i6.h) this.f15645b).e(0, bitmap2);
    }

    @Override
    public boolean v1(int i7) {
        switch (this.f15644a) {
            case 6:
                if (i7 == ((km0) this.f15645b).f17475e0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    public void w2() {
        u5 u5Var = (u5) this.f15645b;
        u5Var.getClass();
        try {
            l8.b bVar = (l8.b) u5Var.f15539b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59297a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void x0(oi.e1 e1Var) {
        oi.a aVar;
        oi.d5 d5Var = (oi.d5) this.f15645b;
        oi.b5 b5Var = d5Var.f21996s;
        if (b5Var != null && (aVar = d5Var.f22442a) != null) {
            oi.s3 s3Var = ((oi.z2) b5Var).f22551a;
            ArrayList arrayList = s3Var.f22345t3;
            long j3 = aVar.f21926t;
            if (j3 != 0) {
                int i7 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((oi.a) arrayList.get(i10)).f21917k.contains(Long.valueOf(j3))) {
                        i7 = i10;
                    }
                }
                if (i7 >= 0) {
                    oi.e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.d();
                    }
                    oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f21917k;
                    ArrayList arrayList3 = aVar2.f21917k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a8.p0.z(1, arrayList3);
                    }
                    arrayList.add(i7 + 1, aVar2);
                    s3Var.v4();
                    s3Var.f34607g3.O(false);
                    oi.e2 e2Var2 = s3Var.R3;
                    if (e2Var2 != null) {
                        e2Var2.h();
                    }
                    s3Var.post(new oi.l2(s3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public boolean y0(fj fjVar) {
        return true;
    }

    @Override
    public void y1(float f10) {
        v9 v9Var = (v9) this.f15645b;
        sg.k0.e(v9Var.f14922p1).k(String.valueOf(sg.h.f57214a.indexOf(v9Var.f14939y0.getCurrentBrush())), f10);
        sg.h1 h1Var = v9Var.f14915k1;
        h1Var.f57220c = f10;
        v9Var.B0(h1Var, null, false);
    }

    @Override
    public String z(long j3) {
        return null;
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        if (i7 == ((org.telegram.ui.Cells.aa) this.f15645b).f30409y) {
            return true;
        }
        return false;
    }

    @Override
    public org.telegram.ui.Cells.j9 z2() {
        return null;
    }

    public w4(j6.s sVar, String[] strArr) {
        this.f15644a = 5;
        this.f15645b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public w4(Object obj, int i7) {
        this.f15644a = i7;
        this.f15645b = obj;
    }

    public w4(a7.a aVar) {
        this.f15644a = 7;
        q6.m.h(aVar);
        this.f15645b = aVar;
    }

    public w4(int i7) {
        this.f15644a = i7;
        switch (i7) {
            case 20:
                this.f15645b = new Object();
                return;
            case 21:
                this.f15645b = new org.telegram.messenger.m0();
                return;
            default:
                this.f15645b = new AtomicInteger(0);
                return;
        }
    }

    public w4(String str, long j3) {
        this.f15644a = 22;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f15645b = new org.telegram.messenger.l0(str, j3);
    }

    public w4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f15644a = 26;
        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, context, i6Var, false);
        this.f15645b = x2Var;
        x2Var.O();
    }

    @Override
    public void A0() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void H() {
    }

    @Override
    public void N1() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void c() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void m() {
    }

    @Override
    public void n() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void v() {
    }

    @Override
    public void x2() {
    }

    private final void o2(ArrayList arrayList) {
    }

    @Override
    public void A1(int i7) {
    }

    @Override
    public void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void D0(boolean z10) {
    }

    @Override
    public void E(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void F(float f10) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void L(cj cjVar) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void M1(float f10) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void P(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void Q0(float f10) {
    }

    @Override
    public void R(fj fjVar) {
    }

    @Override
    public void R0(int i7) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void Y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void b1(CharSequence charSequence) {
    }

    @Override
    public void b2(float f10) {
    }

    @Override
    public void e1(long j3) {
    }

    @Override
    public void g(int i7) {
    }

    @Override
    public void h0(int i7) {
    }

    @Override
    public void h1(boolean z10) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void m2(long j3) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void q1(float f10) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void s0(float f10) {
    }

    @Override
    public void t(float f10) {
    }

    @Override
    public void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void w1(float f10) {
    }

    @Override
    public void x(boolean z10) {
    }

    @Override
    public void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void A(int i7, int i10) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void G1(float f10, int i7) {
    }

    @Override
    public void I(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void J0(float f10, int i7) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public void M(long j3, boolean z10) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.q1 q1Var, i10 i10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void i2(int i7, long j3) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public void n1(float f10, int i7) {
    }

    @Override
    public void onError(f61 f61Var, Exception exc) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void Z0(fj fjVar, View view, int i7) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override
    public void p(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void X(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}
