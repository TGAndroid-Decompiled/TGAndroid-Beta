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
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.j10;
import org.telegram.messenger.kc;
import org.telegram.messenger.mu;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.b00;
import org.telegram.ui.eg0;
import org.telegram.ui.gr0;
import org.telegram.ui.ke;
import org.telegram.ui.mw;
import org.telegram.ui.r00;
import org.telegram.ui.vz;
public class x4 implements tg.m1, g61, xa, i6.a, qt0, com.google.android.gms.common.api.internal.q, jg.y1, b00, m.x0, OnCompleteListener, n2.v, oi.g0, org.telegram.ui.Components.a5, oi.d1, org.telegram.messenger.ua, kc, z51, org.telegram.ui.Cells.m1, te.d {
    public final int f15679a;
    public Object f15680b;

    public x4(int i7, boolean z10) {
        this.f15679a = i7;
    }

    public void A2(ke keVar) {
        ((org.telegram.ui.ActionBar.w2) this.f15680b).I0 = keVar;
    }

    public void B2() {
        u5 u5Var = (u5) this.f15680b;
        u5Var.getClass();
        try {
            l8.b bVar = (l8.b) u5Var.f15495b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59303a;
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
        ((org.telegram.ui.ActionBar.w2) this.f15680b).show();
    }

    @Override
    public boolean D(float f10) {
        return false;
    }

    @Override
    public void D1() {
        l2.i0 i0Var = ((n2.u0) this.f15680b).Z;
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
        ii.t tVar = (ii.t) this.f15680b;
        te.a aVar = tVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        r00 r00Var = tVar.f51841s;
        if (r00Var != null) {
            r00Var.invalidate();
        }
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
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
        switch (this.f15679a) {
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
        n2.u0 u0Var = (n2.u0) this.f15680b;
        synchronized (u0Var.f19249a) {
            sVar = u0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        oi.a2 a2Var = (oi.a2) this.f15680b;
        a2Var.x0(i7, i10, z10);
        eg0 eg0Var = a2Var.P0;
        if (eg0Var != null) {
            eg0Var.i();
            a2Var.P0 = null;
        }
    }

    @Override
    public org.telegram.ui.Cells.j9 P0() {
        oi.m3 m3Var = ((oi.w) this.f15680b).P;
        if (m3Var != null) {
            return m3Var.f22206a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void P1(ArrayList arrayList) {
        boolean z10;
        switch (this.f15679a) {
            case 6:
                mm0 mm0Var = (mm0) this.f15680b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    mm0Var.K.add(((jg.x1) arrayList.get(i7)).f17710a);
                }
                mw mwVar = mm0Var.V;
                if (mwVar != null) {
                    if (mm0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mwVar.d(z10, false);
                }
                mm0Var.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void Q() {
        ((n2.u0) this.f15680b).f21249m1 = true;
    }

    @Override
    public void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public boolean S(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void S0(CharSequence charSequence) {
        oi.m3 m3Var = ((oi.w) this.f15680b).P;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f22206a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f15680b;
        org.telegram.ui.Cells.f fVar = baVar.E;
        if (baVar.a()) {
            baVar.f30465y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.r1 r1Var, gj gjVar) {
        return false;
    }

    @Override
    public boolean U(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((ii.t) this.f15680b).f16330c0), 0);
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        ((mu) this.f15680b).t0(true);
    }

    @Override
    public boolean V0(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
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
        k8.a aVar = ((n2.u0) this.f15680b).f21239b1;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override
    public void Y0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((n2.u0) this.f15680b).f21239b1;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    @Override
    public int Z() {
        return 0;
    }

    @Override
    public boolean Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void a0() {
        l2.i0 i0Var = ((n2.u0) this.f15680b).Z;
        if (i0Var != null) {
            i0Var.f19406a.f19496j0 = true;
        }
    }

    @Override
    public org.telegram.ui.Cells.i9 a1() {
        return (oi.w) this.f15680b;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15679a) {
            case 5:
                j6.r rVar = new j6.r(2, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.t) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray((String[]) this.f15680b);
                iVar.u1(p12, 7);
                return;
            default:
                l7.a aVar = new l7.a((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                String str = ((l7.b) this.f15680b).f19692l;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.f19696a;
                l1.writeStrongBinder(aVar);
                l1.writeString(str);
                iVar2.m1(l1, 2);
                return;
        }
    }

    @Override
    public boolean b() {
        return ((org.telegram.ui.Cells.ba) this.f15680b).a();
    }

    @Override
    public void b0(n2.s0 s0Var) {
        k8.a aVar = ((n2.u0) this.f15680b).f21239b1;
        Handler handler = (Handler) aVar.f18177b;
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
        return ((oi.w) this.f15680b).f22468a;
    }

    @Override
    public gr0 c2() {
        return null;
    }

    @Override
    public void d(int i7) {
        u2.j jVar;
        n2.u0 u0Var = (n2.u0) this.f15680b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = u0Var.f21241d1) != null) {
            jVar.d(i7);
        }
        k8.a aVar = u0Var.f21239b1;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new ai.t0(aVar, i7, 20));
        }
    }

    @Override
    public boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public a0.h d1() {
        switch (this.f15679a) {
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
        switch (this.f15679a) {
            case 17:
                oi.m3 m3Var = ((oi.w) this.f15680b).P;
                if (m3Var != null) {
                    oi.s3 s3Var = m3Var.f22206a;
                    oi.s3.Q1(s3Var, e1Var);
                    s3Var.f22365p3.k(e1Var, true);
                    return;
                }
                return;
            default:
                oi.b5 b5Var = ((oi.d5) this.f15680b).f22022s;
                if (b5Var != null) {
                    oi.s3 s3Var2 = ((oi.z2) b5Var).f22543a;
                    oi.s3.Q1(s3Var2, e1Var);
                    s3Var2.f22365p3.k(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void f(boolean z10) {
        k8.a aVar = ((n2.u0) this.f15680b).f21239b1;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new ch.k(12, aVar, z10));
        }
    }

    @Override
    public boolean f1(gj gjVar) {
        return org.telegram.ui.Cells.c0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public void g0(boolean z10, float f10) {
        ((e7) this.f15680b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override
    public boolean g1() {
        oi.w wVar = (oi.w) this.f15680b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22468a;
            if (m3Var.f22206a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f15680b;
        org.telegram.ui.Cells.f fVar = baVar.E;
        if (baVar.a()) {
            baVar.f30465y = 0;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public float get() {
        v9 v9Var = (v9) this.f15680b;
        int i7 = v9Var.f14909p1;
        sg.h currentBrush = v9Var.f14926y0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).f57277i;
        }
        return sg.k0.e(i7).f(String.valueOf(sg.h.f57224a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String i(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.r1) ((org.telegram.ui.Cells.k1) this.f15680b).f30909b).invalidate();
    }

    @Override
    public void j(long j3) {
        n2.u0 u0Var = (n2.u0) this.f15680b;
        u0Var.n1 = true;
        k8.a aVar = u0Var.f21239b1;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new bi.e4(aVar, j3, 14));
        }
    }

    @Override
    public int j1() {
        return ((ii.t) this.f15680b).f16331d0;
    }

    @Override
    public void k(n2.s0 s0Var) {
        k8.a aVar = ((n2.u0) this.f15680b).f21239b1;
        Handler handler = (Handler) aVar.f18177b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override
    public int k0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public void k2() {
        oi.w wVar = (oi.w) this.f15680b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22468a;
            oi.s3.S1(m3Var.f22206a);
        }
    }

    @Override
    public void l1(int i7, int i10) {
        oi.w wVar = (oi.w) this.f15680b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22468a;
            oi.e2 e2Var = m3Var.f22206a.R3;
            if (e2Var != null) {
                e2Var.f(i7, i10);
            }
        }
    }

    @Override
    public void m1() {
        ((org.telegram.ui.Components.g9) this.f15680b).f35440a.invalidate();
    }

    @Override
    public boolean n0() {
        return b();
    }

    public long n2(TimeUnit timeUnit) {
        return timeUnit.convert(((org.telegram.messenger.l0) this.f15680b).f25140c, TimeUnit.SECONDS);
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void o1() {
        ((n2.u0) this.f15680b).f21248k1 = true;
    }

    @Override
    public void onComplete(Task task) {
        ((CountDownLatch) this.f15680b).countDown();
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        w5 w5Var = (w5) this.f15680b;
        t5 t5Var = w5Var.M;
        org.telegram.messenger.g0.r(t5Var);
        i61 i61Var = w5Var.E;
        if (i61Var != null && i61Var.d0()) {
            org.telegram.messenger.g0.g3(t5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((w5) this.f15680b).i();
    }

    @Override
    public boolean p0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override
    public void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f15680b;
        org.telegram.ui.Cells.f fVar = baVar.E;
        if (baVar.a()) {
            baVar.f30465y = 2;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void r(int i7) {
        boolean z10;
        switch (this.f15679a) {
            case 6:
                mm0 mm0Var = (mm0) this.f15680b;
                mm0Var.E0--;
                mm0Var.f17468f0 = i7;
                if (mm0Var.f17469g0 != i7) {
                    mm0Var.f17482s.clear();
                }
                if (mm0Var.f17470h0 != i7) {
                    mm0Var.J.clear();
                }
                mm0Var.O = true;
                mw mwVar = mm0Var.V;
                if (mwVar != null) {
                    if (mm0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mwVar.d(z10, true);
                }
                mm0Var.f();
                mw mwVar2 = mm0Var.V;
                if (mwVar2 != null) {
                    mwVar2.c();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.s0(this, 0));
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
        org.telegram.ui.Cells.j9 textSelectionHelper;
        oi.d5 d5Var = (oi.d5) this.f15680b;
        if (!d5Var.f22024x && i7 != i10 && (b5Var = d5Var.f22022s) != null && (textSelectionHelper = ((oi.z2) b5Var).f22543a.getTextSelectionHelper()) != null) {
            e1Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 3));
        }
    }

    public void r2() {
        u5 u5Var = (u5) this.f15680b;
        u5Var.getClass();
        try {
            l8.b bVar = (l8.b) u5Var.f15495b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59303a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void s1(Editable editable) {
        ((oi.d5) this.f15680b).g();
    }

    @Override
    public void t0(gj gjVar) {
        li.d0 d0Var = (li.d0) this.f15680b;
        d0Var.f19905u1.presentFragment(tm0.I(d0Var.f30139a, gjVar));
        d0Var.dismiss();
    }

    @Override
    public void u() {
        oi.w wVar = (oi.w) this.f15680b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.s3.T1(m3Var.f22206a, wVar.f22468a);
        }
    }

    @Override
    public void u1() {
        oi.w wVar = (oi.w) this.f15680b;
        oi.m3 m3Var = wVar.P;
        if (m3Var != null) {
            oi.a aVar = wVar.f22468a;
            oi.s3 s3Var = m3Var.f22206a;
            oi.e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.g();
            }
            s3Var.f22365p3.onContentChanged();
        }
    }

    public void u2() {
        ((org.telegram.ui.ActionBar.w2) this.f15680b).f30170p0 = false;
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
        ((i6.h) this.f15680b).e(0, bitmap2);
    }

    @Override
    public boolean v1(int i7) {
        switch (this.f15679a) {
            case 6:
                if (i7 == ((mm0) this.f15680b).f17466e0) {
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
        u5 u5Var = (u5) this.f15680b;
        u5Var.getClass();
        try {
            l8.b bVar = (l8.b) u5Var.f15495b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f59303a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void x0(oi.e1 e1Var) {
        oi.a aVar;
        oi.d5 d5Var = (oi.d5) this.f15680b;
        oi.b5 b5Var = d5Var.f22022s;
        if (b5Var != null && (aVar = d5Var.f22468a) != null) {
            oi.s3 s3Var = ((oi.z2) b5Var).f22543a;
            ArrayList arrayList = s3Var.f22373t3;
            long j3 = aVar.f21917t;
            if (j3 != 0) {
                int i7 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((oi.a) arrayList.get(i10)).f21908k.contains(Long.valueOf(j3))) {
                        i7 = i10;
                    }
                }
                if (i7 >= 0) {
                    oi.e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.d();
                    }
                    oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f21908k;
                    ArrayList arrayList3 = aVar2.f21908k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a8.p0.z(1, arrayList3);
                    }
                    arrayList.add(i7 + 1, aVar2);
                    s3Var.v4();
                    s3Var.f35742g3.O(false);
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
    public boolean y0(gj gjVar) {
        return true;
    }

    @Override
    public void y1(float f10) {
        v9 v9Var = (v9) this.f15680b;
        sg.k0.e(v9Var.f14909p1).k(String.valueOf(sg.h.f57224a.indexOf(v9Var.f14926y0.getCurrentBrush())), f10);
        sg.h1 h1Var = v9Var.f14902k1;
        h1Var.f57230c = f10;
        v9Var.B0(h1Var, null, false);
    }

    @Override
    public String z(long j3) {
        return null;
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        if (i7 == ((org.telegram.ui.Cells.ba) this.f15680b).f30465y) {
            return true;
        }
        return false;
    }

    @Override
    public org.telegram.ui.Cells.k9 z2() {
        return null;
    }

    public x4(j6.s sVar, String[] strArr) {
        this.f15679a = 5;
        this.f15680b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public x4(Object obj, int i7) {
        this.f15679a = i7;
        this.f15680b = obj;
    }

    public x4(a7.a aVar) {
        this.f15679a = 7;
        q6.m.h(aVar);
        this.f15680b = aVar;
    }

    public x4(int i7) {
        this.f15679a = i7;
        switch (i7) {
            case 20:
                this.f15680b = new Object();
                return;
            case 21:
                this.f15680b = new org.telegram.messenger.m0();
                return;
            default:
                this.f15680b = new AtomicInteger(0);
                return;
        }
    }

    public x4(String str, long j3) {
        this.f15679a = 22;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f15680b = new org.telegram.messenger.l0(str, j3);
    }

    public x4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f15679a = 26;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
        this.f15680b = w2Var;
        w2Var.O();
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
    public void B(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void D0(boolean z10) {
    }

    @Override
    public void E(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void F(float f10) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void L(dj djVar) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void M1(float f10) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void O1(gj gjVar) {
    }

    @Override
    public void P(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void Q0(float f10) {
    }

    @Override
    public void R(gj gjVar) {
    }

    @Override
    public void R0(int i7) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void Y(org.telegram.ui.Cells.r1 r1Var) {
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
    public void j2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.r1 r1Var) {
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
    public void q(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void q1(float f10) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void s0(float f10) {
    }

    @Override
    public void t(float f10) {
    }

    @Override
    public void w(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void w1(float f10) {
    }

    @Override
    public void x(boolean z10) {
    }

    @Override
    public void y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void A(int i7, int i10) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void G1(float f10, int i7) {
    }

    @Override
    public void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void J0(float f10, int i7) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public void M(long j3, boolean z10) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.r1 r1Var, j10 j10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void i2(int i7, long j3) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public void n1(float f10, int i7) {
    }

    @Override
    public void onError(i61 i61Var, Exception exc) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void Z0(gj gjVar, View view, int i7) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override
    public void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}
