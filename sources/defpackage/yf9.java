package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.IntSupplier;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CheckBoxBase;
public final class yf9 implements oac, ee, hk3, zw9, ou3, lk9, ch0, mm0, ln5, h59, i99, g59, p4b, lh2, af7, ctc, kac, wv4, qy2, g94, w18 {
    public final byte a;
    public final Object b;

    public yf9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        View view = ((ysa) this.b).b;
        if (view instanceof cm1) {
            ((cm1) view).T();
        } else {
            view.invalidate();
        }
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void a(String str) {
        h4b storiesController;
        nha nhaVar = ((nea) this.b).d;
        storiesController = nhaVar.getStoriesController();
        storiesController.q(nhaVar.m1, str, new nda(nhaVar, (byte) 1));
    }

    @Override
    public final void b(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                op9 op9Var = (op9) obj;
                Paint paint = op9Var.K;
                RectF rectF = op9Var.d;
                op9Var.d(canvas);
                pp9 pp9Var = op9Var.P;
                FrameLayout frameLayout = pp9Var.h;
                TextureView textureView = pp9Var.n;
                if (frameLayout.getVisibility() == 0 && frameLayout.getWidth() > 0) {
                    canvas.save();
                    canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
                    canvas.concat(frameLayout.getMatrix());
                    float L = (1.0f - pp9Var.U) * gm.L(12.0f);
                    rectF.set(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight());
                    canvas.clipRect(rectF);
                    paint.setColor(-16777216);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    if (textureView.isAvailable() && textureView.isAttachedToWindow()) {
                        canvas.translate(textureView.getLeft(), textureView.getTop());
                        canvas.concat(textureView.getMatrix());
                        textureView.draw(canvas);
                    }
                    canvas.restore();
                    return;
                }
                return;
            default:
                ana anaVar = (ana) obj;
                canvas.save();
                canvas.translate(anaVar.a.getX(), anaVar.a.getY());
                anaVar.a.draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int v;
        k47 k47Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                rp9 rp9Var = (rp9) obj;
                if (z && !z2) {
                    rp9Var.a();
                    return;
                }
                return;
            default:
                sha shaVar = (sha) obj;
                ImageReceiver imageReceiver2 = shaVar.d;
                ImageReceiver imageReceiver3 = shaVar.c;
                if (z && !z2 && (k47Var = shaVar.n) != null && k47Var.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.f0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z && !z2 && shaVar.x0 && imageReceiver3.n() != null) {
                    int I0 = gm.I0(imageReceiver3.n());
                    shaVar.a = I0;
                    CheckBoxBase checkBoxBase = shaVar.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (v = cmb.v(I0, cmb.p1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 28:
                jac jacVar = (jac) obj;
                if (i == 1) {
                    jacVar.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    jacVar.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                lf2 lf2Var = (lf2) obj;
                if (i == 1) {
                    lf2Var.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    lf2Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void d(float r19, float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf9.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void e(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                h2a h2aVar = (h2a) obj;
                if (h2aVar != null) {
                    h2aVar.c();
                    return;
                }
                return;
            default:
                z3b z3bVar = (z3b) obj;
                if (z) {
                    z3bVar.p(30, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(float f) {
        k47 k47Var = ((pi9) this.b).X;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(k47Var, f);
    }

    @Override
    public final boolean g(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 12:
                ju9 ju9Var = (ju9) obj;
                ny0 ny0Var = ju9Var.c;
                k47 E = ny0Var.E(i);
                ju9 ju9Var2 = (ju9) ny0Var.d;
                if (E == null) {
                    return false;
                }
                if (!ju9Var.J.u()) {
                    ju9Var.J.f();
                    ny0Var.l(0, ju9Var2.r);
                }
                if (ju9Var.J.u()) {
                    ju9Var.J.i(E, view, 0);
                    if (!ju9Var.J.u()) {
                        ny0Var.l(0, ju9Var2.r);
                    }
                    ug4 ug4Var = ju9Var.K;
                    int e1 = E.e1();
                    ug4Var.a = k47.B0(E.k);
                    ug4Var.b = e1;
                }
                return true;
            default:
                return ((s0a) obj).Z0(i, view);
        }
    }

    @Override
    public final void i() {
        wca wcaVar = (wca) this.b;
        float progress = 1.0f - (wcaVar.d.getProgress() * 0.143f);
        bf0 bf0Var = wcaVar.a;
        bf0Var.setScaleX(progress);
        bf0Var.setScaleY(progress);
        wcaVar.invalidate();
    }

    @Override
    public final Object j(Integer num, Object obj) {
        return (CharSequence) ((pb) this.b).a((Integer) obj);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                c6c c6cVar = (c6c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                if (((ch9[]) obj3)[0] != null && (view instanceof xk9)) {
                    ((xk9) view).A();
                    return;
                }
                return;
            default:
                ((jva) obj3).R((ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
        }
    }

    @Override
    public final void l(int i, int i2) {
        ela elaVar = (ela) this.b;
        elaVar.x = i;
        elaVar.y = i2;
        xd9 xd9Var = elaVar.M;
        if (xd9Var != null) {
            xd9Var.invalidate();
        }
    }

    @Override
    public final void m() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((ck9) obj).g();
                return;
            default:
                kk9 kk9Var = (kk9) obj;
                ll0 ll0Var = kk9Var.a;
                if (ll0Var != null) {
                    ll0Var.s = true;
                    ll0Var.r = kk9Var.r.q2;
                }
                kk9Var.w();
                kg9 kg9Var = kk9Var.F;
                if (kg9Var != null && kk9Var.a != null) {
                    kg9Var.a.W3();
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(long j) {
        ((jsa) this.b).f();
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        return ((IntSupplier) this.b).getAsInt();
    }

    @Override
    public final boolean q(defpackage.nk3 r24, java.util.ArrayList r25, java.lang.CharSequence r26, boolean r27, boolean r28, int r29, int r30, defpackage.sxb r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf9.q(nk3, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, sxb):boolean");
    }

    @Override
    public final void r(he heVar, int i) {
        ((eb7) this.b).run();
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void t(long j, yw7 yw7Var) {
        vsd.a(j, yw7Var, ((xx9) this.b).c);
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    private final void y(ImageReceiver imageReceiver) {
    }

    @Override
    public final void h(float f) {
    }

    private final void v(int i, Drawable drawable) {
    }

    private final void w(int i, Drawable drawable) {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
