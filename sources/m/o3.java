package m;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import oi.a6;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zb;
public final class o3 implements q5.b {
    public final Object f20252a;
    public final Object f20253b;
    public Object f20254c;
    public Object d;
    public Object f20255e;
    public Object f20256f;
    public Object h;

    public o3() {
        this.f20252a = new float[16];
        this.f20253b = new float[16];
        this.f20254c = new float[16];
        this.d = new float[16];
        this.f20255e = new float[16];
        this.f20256f = new float[4];
        this.h = new float[4];
    }

    public void a() {
        e(null);
        x60 x60Var = (x60) this.f20254c;
        if (x60Var != null) {
            x60Var.v();
            this.f20254c = null;
        }
        this.d = null;
        this.f20255e = null;
        this.f20256f = null;
    }

    public void b(a6 a6Var, ArrayList arrayList) {
        i6 i6Var = (i6) this.f20253b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                oi.k0 k0Var = (oi.k0) obj;
                kg.x1 x1Var = new kg.x1(a6Var.getContext(), k0Var, i6Var);
                x1Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                x1Var.setBackground(n6.a0(n6.w0(n6.f29543i6, i6Var), 0, 0));
                x1Var.setOnClickListener(new ah.h(this, a6Var, k0Var, 19));
                ((LinearLayout) this.d).addView(x1Var, na.o(-1, 48));
            }
        }
    }

    public void c(int i7, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f20252a;
        float f13 = (i7 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i7) {
            f13 = i7;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f20253b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.f20254c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.f20253b, 0, (float[]) this.f20254c, 0);
        Matrix.multiplyMM((float[]) this.f20255e, 0, (float[]) this.f20252a, 0, (float[]) this.d, 0);
        if (z10) {
            f12 = 0.0125f;
        } else {
            f12 = -0.0125f;
        }
        if (!z10) {
            f14 = -1.0f;
        }
        float f15 = f14;
        float f16 = -f15;
        d(f12, 0.618561f, f15, i7, i10, fArr, 0);
        d(f12, 0.618561f, f16, i7, i10, fArr, 2);
        d(f12, -0.593561f, f16, i7, i10, fArr, 4);
        d(f12, -0.593561f, f15, i7, i10, fArr, 6);
    }

    public float d(float f10, float f11, float f12, int i7, int i10, float[] fArr, int i11) {
        float[] fArr2 = (float[]) this.f20256f;
        fArr2[0] = f10;
        fArr2[1] = f11;
        fArr2[2] = f12;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.f20255e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = com.google.android.gms.internal.vision.e2.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = org.telegram.ui.Cells.c0.z(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    public void e(a6 a6Var) {
        a6 a6Var2 = (a6) this.h;
        if (a6Var2 != a6Var) {
            if (a6Var2 != null) {
                a6Var2.setShowCommandBackground(false);
            }
            this.h = a6Var;
            if (a6Var != null) {
                a6Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(long j3, long j10, boolean z10) {
        boolean z11;
        i6 i6Var = (i6) this.f20254c;
        Context context = (Context) this.f20252a;
        if (!z10) {
            this.f20256f = null;
            fc fcVar = (fc) this.h;
            if (fcVar != null) {
                fcVar.b();
                this.h = null;
                return;
            }
            return;
        }
        if (((zb) this.f20256f) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            zb zbVar = new zb(context, i6Var);
            this.f20256f = zbVar;
            zbVar.f42810a.setAutoRepeat(true);
            ((zb) this.f20256f).f42810a.f(2131624005, 32, 32, null);
            ((zb) this.f20256f).f42810a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ((zb) this.f20256f).f42811b.setText(gd.a0(null, null, 2131744467, (String) this.d));
            dc dcVar = new dc(context, i6Var, true);
            dcVar.f34267b = new hi.w(this, 1);
            ((zb) this.f20256f).setButton(dcVar);
            this.h = fc.f((FrameLayout) this.f20253b, (zb) this.f20256f, -1);
        }
        if (j10 > 0) {
            ((zb) this.f20256f).f42812c.c(gd.a0(null, null, 2131744466, org.telegram.messenger.g0.i0(Math.min(j3, j10), false, false), org.telegram.messenger.g0.i0(j10, false, false)), !z11, true);
        }
        if (z11) {
            ((fc) this.h).k(true);
        }
    }

    public void g(a6 a6Var, String str) {
        x60 x60Var;
        x60 x60Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a10 = oi.k0.a(str);
        if (a10.isEmpty()) {
            a();
            return;
        }
        e(a6Var);
        if (((a6) this.f20256f) == a6Var && a10.equals((ArrayList) this.f20255e) && (x60Var2 = (x60) this.f20254c) != null && x60Var2.E()) {
            return;
        }
        if (((a6) this.f20256f) == a6Var && (x60Var = (x60) this.f20254c) != null && x60Var.E() && ((LinearLayout) this.d) != null) {
            this.f20255e = a10;
            b(a6Var, a10);
            ((x60) this.f20254c).P();
            return;
        }
        a();
        e(a6Var);
        this.f20256f = a6Var;
        this.f20255e = a10;
        LinearLayout linearLayout = new LinearLayout(a6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(a6Var, a10);
        x60 m10 = ((oi.l0) this.f20252a).m(a6Var.getEditText());
        m10.T = true;
        m10.f41892s = 0;
        m10.f41894t = false;
        m10.r((LinearLayout) this.d, na.o(220, -2));
        m10.f41860a0 = org.telegram.messenger.g0.L(240.0f);
        m10.f41873i = 3;
        m10.b0(-org.telegram.messenger.g0.L(12.0f), 0.0f);
        m10.f41886p = new kg.i0(this, 28);
        m10.f41871g0 = true;
        if (m10.E()) {
            m10.D();
        }
        m10.a0();
        this.f20254c = m10;
    }

    @Override
    public Object mo23get() {
        qb.a aVar = new qb.a(28);
        pb.b bVar = new pb.b(28);
        ?? obj = new Object();
        obj.f16279a = (Context) ((fd.a) this.f20252a).mo23get();
        obj.f16280b = (p5.e) ((fd.a) this.f20253b).mo23get();
        obj.f16281c = (v5.d) ((fd.a) this.f20254c).mo23get();
        obj.d = (i61) ((i61) this.d).mo23get();
        obj.f16282e = (Executor) ((fd.a) this.f20255e).mo23get();
        obj.f16283f = (w5.c) ((fd.a) this.f20256f).mo23get();
        obj.f16284g = aVar;
        obj.h = bVar;
        obj.f16285i = (v5.c) ((fd.a) this.h).mo23get();
        return obj;
    }

    public o3(Context context, FrameLayout frameLayout, i6 i6Var, String str, Runnable runnable) {
        this.f20252a = context;
        this.f20253b = frameLayout;
        this.f20254c = i6Var;
        this.d = str;
        this.f20255e = runnable;
    }

    public o3(oi.l0 l0Var, i6 i6Var) {
        this.f20252a = l0Var;
        this.f20253b = i6Var;
    }

    public o3(fd.a aVar, fd.a aVar2, fd.a aVar3, i61 i61Var, fd.a aVar4, fd.a aVar5, fd.a aVar6) {
        this.f20252a = aVar;
        this.f20253b = aVar2;
        this.f20254c = aVar3;
        this.d = i61Var;
        this.f20255e = aVar4;
        this.f20256f = aVar5;
        this.h = aVar6;
    }

    public o3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.f20255e = new Rect();
        this.f20256f = new int[2];
        this.h = new int[2];
        this.f20252a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        this.f20253b = inflate;
        this.f20254c = (TextView) inflate.findViewById(2131296515);
        layoutParams.setTitle(o3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
    }

    public o3(String str, ga.d dVar, ba.e eVar) {
        this.d = new ab.q(this, false);
        this.f20255e = new ab.q(this, true);
        ?? obj = new Object();
        obj.f5136a = new ArrayList();
        obj.f5137b = 128;
        this.f20256f = obj;
        this.h = new AtomicMarkableReference(null, false);
        this.f20254c = str;
        this.f20252a = new ca.h(dVar);
        this.f20253b = eVar;
    }
}
