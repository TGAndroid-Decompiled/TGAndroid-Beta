package gc;

import a3.s;
import a8.p0;
import a8.t9;
import ai.w0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.g;
import h6.h;
import hi.m;
import hi.q4;
import hi.u9;
import hi.v5;
import hi.wa;
import hi.x5;
import j6.i;
import j6.r;
import j6.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.o1;
import jg.x1;
import jg.y1;
import l2.i0;
import li.d0;
import m.x0;
import n2.p;
import n2.s0;
import n2.u0;
import n2.v;
import oi.a5;
import oi.c5;
import oi.d1;
import oi.d2;
import oi.e1;
import oi.g0;
import oi.k2;
import oi.k3;
import oi.q3;
import oi.w;
import oi.x2;
import oi.z1;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.j6;
import org.telegram.messenger.l0;
import org.telegram.messenger.m0;
import org.telegram.messenger.ua;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.bg0;
import org.telegram.ui.jw;
import org.telegram.ui.o00;
import org.telegram.ui.sz;
import org.telegram.ui.yz;
import sg.h1;
import sg.k0;
import tg.l1;
import u2.j;
public class b implements g90, l1, s51, wa, i6.a, ft0, q, y1, yz, x0, OnCompleteListener, v, g0, r4, d1, ua {
    public final int f13133a;
    public Object f13134b;

    public b(int i7, boolean z10) {
        this.f13133a = i7;
    }

    public void B0() {
        ia.d dVar = (ia.d) this.f13134b;
        dVar.getClass();
        try {
            l8.b bVar = (l8.b) dVar.f15881b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f58728a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void C0() {
        ia.d dVar = (ia.d) this.f13134b;
        dVar.getClass();
        try {
            l8.b bVar = (l8.b) dVar.f15881b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f58728a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void D0() {
        ia.d dVar = (ia.d) this.f13134b;
        dVar.getClass();
        try {
            l8.b bVar = (l8.b) dVar.f15881b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.f58728a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public h9 E() {
        k3 k3Var = ((w) this.f13134b).P;
        if (k3Var != null) {
            return k3Var.f21773a.getTextSelectionHelper();
        }
        return null;
    }

    public float E0(int i7, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        b bVar;
        int i21;
        boolean z12 = true;
        if (Math.abs(i12 - i10) > Math.abs(i11 - i7)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = -1;
        if (i13 < i15) {
            i17 = 1;
        } else {
            i17 = -1;
        }
        if (i14 < i16) {
            i24 = 1;
        }
        int i25 = i15 + i17;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 != i25) {
                if (z10) {
                    i19 = i27;
                } else {
                    i19 = i26;
                }
                if (z10) {
                    i20 = i26;
                } else {
                    i20 = i27;
                }
                boolean z13 = z10;
                if (i28 == z12) {
                    z11 = z12;
                    i21 = abs;
                    bVar = this;
                } else {
                    z11 = false;
                    bVar = this;
                    i21 = abs;
                }
                if (z11 == ((cc.b) bVar.f13134b).b(i19, i20)) {
                    if (i28 == 2) {
                        return t9.b(i26, i27, i13, i14);
                    }
                    i28++;
                }
                i23 += abs2;
                if (i23 > 0) {
                    if (i27 == i16) {
                        i18 = 2;
                        break;
                    }
                    i27 += i24;
                    i23 -= i21;
                }
                i26 += i17;
                abs = i21;
                z10 = z13;
                z12 = true;
                i22 = 2;
            } else {
                i18 = i22;
                break;
            }
        }
        if (i28 == i18) {
            return t9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    @Override
    public void F(boolean z10) {
        ii.f fVar = (ii.f) this.f13134b;
        te.a aVar = fVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        o00 o00Var = fVar.f50080s;
        if (o00Var != null) {
            o00Var.invalidate();
        }
    }

    public float F0(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.f13134b;
        float E0 = E0(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f4872a;
            if (i13 >= i15) {
                int i16 = i15 - 1;
                f10 = ((i15 - 1) - i7) / (i13 - i7);
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i10;
        int i17 = (int) (f12 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f12 / (i10 - i17);
        } else {
            int i18 = bVar.f4873b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (E0(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + E0) - 1.0f;
    }

    @Override
    public void G() {
        s sVar;
        u0 u0Var = (u0) this.f13134b;
        synchronized (u0Var.f18888a) {
            sVar = u0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    public void G0() {
        h hVar = (h) this.f13134b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f13613i.iterator();
            while (it2.hasNext()) {
                ((g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public void J(CharSequence charSequence) {
        k3 k3Var = ((w) this.f13134b).P;
        if (k3Var != null) {
            k3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                k3Var.f21773a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public a0.h K() {
        switch (this.f13133a) {
            case 10:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        z1 z1Var = (z1) this.f13134b;
        z1Var.x0(i7, i10, z10);
        bg0 bg0Var = z1Var.P0;
        if (bg0Var != null) {
            bg0Var.i();
            z1Var.P0 = null;
        }
    }

    @Override
    public g9 N() {
        return (w) this.f13134b;
    }

    @Override
    public oi.a P() {
        return ((w) this.f13134b).f22106a;
    }

    @Override
    public Paint.FontMetricsInt Q() {
        return ((m) this.f13134b).f14623f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public boolean R() {
        w wVar = (w) this.f13134b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.f22106a;
            if (k3Var.f21773a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void T(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((u0) this.f13134b).f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new p(aVar, exc, 1));
        }
    }

    @Override
    public a0.h U() {
        switch (this.f13133a) {
            case 10:
                return null;
            default:
                return null;
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((ii.f) this.f13134b).f15955c0), 0);
    }

    @Override
    public void V(int i7, int i10) {
        w wVar = (w) this.f13134b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.f22106a;
            d2 d2Var = k3Var.f21773a.R3;
            if (d2Var != null) {
                d2Var.f(i7, i10);
            }
        }
    }

    @Override
    public void W() {
        ((u0) this.f13134b).f20890k1 = true;
    }

    @Override
    public void Z(e1 e1Var, int i7, int i10) {
        a5 a5Var;
        h9 textSelectionHelper;
        c5 c5Var = (c5) this.f13134b;
        if (!c5Var.f21617x && i7 != i10 && (a5Var = c5Var.f21615s) != null && (textSelectionHelper = ((x2) a5Var).f22119a.getTextSelectionHelper()) != null) {
            e1Var.post(new o1(this, e1Var, i10, textSelectionHelper, i7, 3));
        }
    }

    @Override
    public void a(int i7) {
        j jVar;
        u0 u0Var = (u0) this.f13134b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = u0Var.f20883d1) != null) {
            jVar.d(i7);
        }
        k8.a aVar = u0Var.f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new w0(aVar, i7, 15));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13133a) {
            case 9:
                r rVar = new r(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((t) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray((String[]) this.f13134b);
                iVar.u1(p12, 7);
                return;
            default:
                l7.a aVar = new l7.a((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                String str = ((l7.b) this.f13134b).f19331l;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.f19335a;
                l1.writeStrongBinder(aVar);
                l1.writeString(str);
                iVar2.m1(l1, 2);
                return;
        }
    }

    @Override
    public void b(long j3) {
        u0 u0Var = (u0) this.f13134b;
        u0Var.n1 = true;
        k8.a aVar = u0Var.f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new di.x2(aVar, j3, 13));
        }
    }

    @Override
    public void b0(Editable editable) {
        ((c5) this.f13134b).g();
    }

    @Override
    public int b1() {
        return ((ii.f) this.f13134b).f15956d0;
    }

    @Override
    public void c(boolean z10) {
        k8.a aVar = ((u0) this.f13134b).f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new ai.q(13, aVar, z10));
        }
    }

    @Override
    public void c0() {
        w wVar = (w) this.f13134b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.f22106a;
            q3 q3Var = k3Var.f21773a;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.f21931p3.onContentChanged();
        }
    }

    @Override
    public void d(e1 e1Var) {
        switch (this.f13133a) {
            case 22:
                k3 k3Var = ((w) this.f13134b).P;
                if (k3Var != null) {
                    q3 q3Var = k3Var.f21773a;
                    q3.Q1(q3Var, e1Var);
                    q3Var.f21931p3.b(e1Var, true);
                    return;
                }
                return;
            default:
                a5 a5Var = ((c5) this.f13134b).f21615s;
                if (a5Var != null) {
                    q3 q3Var2 = ((x2) a5Var).f22119a;
                    q3.Q1(q3Var2, e1Var);
                    q3Var2.f21931p3.b(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean e0(int i7) {
        switch (this.f13133a) {
            case 10:
                if (i7 == ((cm0) this.f13134b).f17089e0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void f(s0 s0Var) {
        k8.a aVar = ((u0) this.f13134b).f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public float get() {
        u9 u9Var = (u9) this.f13134b;
        int i7 = u9Var.f14683p1;
        sg.h currentBrush = u9Var.f14700y0.getCurrentBrush();
        if (currentBrush == null) {
            return k0.e(i7).f56693i;
        }
        return k0.e(i7).f(String.valueOf(sg.h.f56640a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void h() {
        w wVar = (w) this.f13134b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            q3.T1(k3Var.f21773a, wVar.f22106a);
        }
    }

    @Override
    public boolean h0(boolean z10) {
        return false;
    }

    @Override
    public void i(int i7) {
        boolean z10;
        switch (this.f13133a) {
            case 10:
                cm0 cm0Var = (cm0) this.f13134b;
                cm0Var.E0--;
                cm0Var.f17091f0 = i7;
                if (cm0Var.f17092g0 != i7) {
                    cm0Var.f17105s.clear();
                }
                if (cm0Var.f17093h0 != i7) {
                    cm0Var.J.clear();
                }
                cm0Var.O = true;
                jw jwVar = cm0Var.V;
                if (jwVar != null) {
                    if (cm0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jwVar.d(z10, true);
                }
                cm0Var.f();
                jw jwVar2 = cm0Var.V;
                if (jwVar2 != null) {
                    jwVar2.c();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new hi.e1(this, 27));
                return;
        }
    }

    @Override
    public boolean l(sz szVar) {
        return false;
    }

    @Override
    public void l0(ArrayList arrayList) {
        boolean z10;
        switch (this.f13133a) {
            case 10:
                cm0 cm0Var = (cm0) this.f13134b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    cm0Var.K.add(((x1) arrayList.get(i7)).f17333a);
                }
                jw jwVar = cm0Var.V;
                if (jwVar != null) {
                    if (cm0Var.E0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jwVar.d(z10, false);
                }
                cm0Var.f();
                return;
            default:
                return;
        }
    }

    public float m0(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.f3139b;
        int i10 = (int) cVar2.f3139b;
        float F0 = F0((int) cVar.f3138a, i7, (int) cVar2.f3138a, i10);
        float F02 = F0((int) cVar2.f3138a, i10, (int) cVar.f3138a, i7);
        if (Float.isNaN(F0)) {
            return F02 / 7.0f;
        }
        if (Float.isNaN(F02)) {
            return F0 / 7.0f;
        }
        return (F0 + F02) / 14.0f;
    }

    @Override
    public void n0() {
        i0 i0Var = ((u0) this.f13134b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public boolean o(e1 e1Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        ((CountDownLatch) this.f13134b).countDown();
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        x5 x5Var = (x5) this.f13134b;
        v5 v5Var = x5Var.M;
        org.telegram.messenger.g0.r(v5Var);
        u51 u51Var = x5Var.E;
        if (u51Var != null && u51Var.d0()) {
            org.telegram.messenger.g0.h3(v5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((x5) this.f13134b).i();
    }

    @Override
    public void p0(int i7, int i10, CharSequence charSequence, boolean z10) {
        hi.g gVar = ((m) this.f13134b).f14623f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void q() {
        ((u0) this.f13134b).f20891m1 = true;
    }

    @Override
    public boolean q0(e1 e1Var) {
        return false;
    }

    @Override
    public void r0(float f10) {
        u9 u9Var = (u9) this.f13134b;
        k0.e(u9Var.f14683p1).k(String.valueOf(sg.h.f56640a.indexOf(u9Var.f14700y0.getCurrentBrush())), f10);
        h1 h1Var = u9Var.f14676k1;
        h1Var.f56646c = f10;
        u9Var.B0(h1Var, null, false);
    }

    @Override
    public void t() {
        i0 i0Var = ((u0) this.f13134b).Z;
        if (i0Var != null) {
            i0Var.f19045a.f19135j0 = true;
        }
    }

    @Override
    public void u(s0 s0Var) {
        k8.a aVar = ((u0) this.f13134b).f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override
    public void u0() {
        w wVar = (w) this.f13134b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.f22106a;
            q3.S1(k3Var.f21773a);
        }
    }

    @Override
    public void v(boolean z10, float f10) {
        ((q4) this.f13134b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override
    public void w0(long j3, int i7, long j10) {
        k8.a aVar = ((u0) this.f13134b).f20881b1;
        Handler handler = (Handler) aVar.f17788b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override
    public void x(Bitmap bitmap) {
        j6.b bVar = i6.h.v;
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
        ((i6.h) this.f13134b).e(0, bitmap2);
    }

    public cc.e x0(ab.q r24) {
        throw new UnsupportedOperationException("Method not decompiled: gc.b.x0(ab.q):cc.e");
    }

    @Override
    public void y(gj gjVar) {
        d0 d0Var = (d0) this.f13134b;
        d0Var.f19547u1.presentFragment(jm0.K(d0Var.f29679a, gjVar));
        d0Var.dismiss();
    }

    public hc.a y0(float f10, float f11, int i7, int i10) {
        int i11;
        hc.a b10;
        hc.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i12);
        cc.b bVar = (cc.b) this.f13134b;
        int min = Math.min(bVar.f4872a - 1, i7 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i10 - i12);
            int min2 = Math.min(bVar.f4873b - 1, i10 + i12) - max2;
            if (min2 >= f12) {
                cc.b bVar2 = (cc.b) this.f13134b;
                hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
                int i13 = bVar3.f13816e;
                int i14 = bVar3.f13815c;
                int i15 = i13 + i14;
                int i16 = bVar3.f13817f;
                int i17 = (i16 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i18 = 0; i18 < i16; i18++) {
                    if ((i18 & 1) == 0) {
                        i11 = (i18 + 1) / 2;
                    } else {
                        i11 = -((i18 + 1) / 2);
                    }
                    int i19 = i11 + i17;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i20 = i14;
                    while (i20 < i15 && !bVar2.b(i20, i19)) {
                        i20++;
                    }
                    int i21 = 0;
                    while (i20 < i15) {
                        if (bVar2.b(i20, i19)) {
                            if (i21 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i21 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i21 = 1;
                            } else {
                                i21++;
                                iArr[i21] = iArr[i21] + 1;
                            }
                        } else {
                            if (i21 == 1) {
                                i21++;
                            }
                            iArr[i21] = iArr[i21] + 1;
                        }
                        i20++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f13814b;
                if (!arrayList.isEmpty()) {
                    return (hc.a) arrayList.get(0);
                }
                throw bc.e.a();
            }
            throw bc.e.a();
        }
        throw bc.e.a();
    }

    @Override
    public void z(e1 e1Var) {
        oi.a aVar;
        c5 c5Var = (c5) this.f13134b;
        a5 a5Var = c5Var.f21615s;
        if (a5Var != null && (aVar = c5Var.f22106a) != null) {
            q3 q3Var = ((x2) a5Var).f22119a;
            ArrayList arrayList = q3Var.f21939t3;
            long j3 = aVar.f21560t;
            if (j3 != 0) {
                int i7 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((oi.a) arrayList.get(i10)).f21551k.contains(Long.valueOf(j3))) {
                        i7 = i10;
                    }
                }
                if (i7 >= 0) {
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f21551k;
                    ArrayList arrayList3 = aVar2.f21551k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        p0.z(1, arrayList3);
                    }
                    arrayList.add(i7 + 1, aVar2);
                    q3Var.v4();
                    q3Var.f39892g3.O(false);
                    d2 d2Var2 = q3Var.R3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    q3Var.post(new k2(q3Var, aVar2, 26));
                }
            }
        }
    }

    public long z0(TimeUnit timeUnit) {
        return timeUnit.convert(((l0) this.f13134b).f24791c, TimeUnit.SECONDS);
    }

    public b(j6.s sVar, String[] strArr) {
        this.f13133a = 9;
        this.f13134b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public b(Object obj, int i7) {
        this.f13133a = i7;
        this.f13134b = obj;
    }

    public b(a7.a aVar) {
        this.f13133a = 11;
        q6.m.g(aVar);
        this.f13134b = aVar;
    }

    public b(int i7) {
        this.f13133a = i7;
        switch (i7) {
            case 13:
                this.f13134b = new HashMap();
                return;
            case 17:
                this.f13134b = new AtomicInteger(0);
                return;
            case 25:
                this.f13134b = new Object();
                return;
            case 26:
                this.f13134b = new m0();
                return;
            default:
                this.f13134b = new d6.i(ec.a.h, 15);
                return;
        }
    }

    public b(String str, long j3) {
        this.f13133a = 27;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f13134b = new l0(str, j3);
    }

    @Override
    public void B() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k0() {
    }

    @Override
    public void s() {
    }

    private final void A0(ArrayList arrayList) {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void C(int i7) {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void I(CharSequence charSequence) {
    }

    @Override
    public void O(long j3) {
    }

    @Override
    public void S(boolean z10) {
    }

    @Override
    public void Y(float f10) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void e(int i7) {
    }

    @Override
    public void f0(float f10) {
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
    public void t0(long j3) {
    }

    @Override
    public void v0(String str) {
    }

    @Override
    public void w(float f10) {
    }

    @Override
    public void D(float f10, int i7) {
    }

    @Override
    public void X(float f10, int i7) {
    }

    @Override
    public void i0(float f10, int i7) {
    }

    @Override
    public void m(int i7, int i10) {
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
    }

    @Override
    public void p(long j3, boolean z10) {
    }

    @Override
    public void s0(int i7, long j3) {
    }

    @Override
    public void M(gj gjVar, View view, int i7) {
    }

    @Override
    public void a0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void r(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
