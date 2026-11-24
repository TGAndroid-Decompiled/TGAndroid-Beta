package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.IntSupplier;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LaunchActivity;
public final class wh9 implements et3, ji9, bg0, ml0, ll5, e39, wi3, g79, d39, o2b, xf2, yc7, arc, j8c, ut4, gx2, x74, n8c, tz7, lf0, OnSuccessListener {
    public final byte a;
    public final Object b;

    public wh9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int v;
        k27 k27Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                qn9 qn9Var = (qn9) obj;
                if (z && !z2) {
                    qn9Var.a();
                    return;
                }
                return;
            default:
                qfa qfaVar = (qfa) obj;
                ImageReceiver imageReceiver2 = qfaVar.d;
                ImageReceiver imageReceiver3 = qfaVar.c;
                if (z && !z2 && (k27Var = qfaVar.n) != null && k27Var.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.f0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z && !z2 && qfaVar.x0 && imageReceiver3.n() != null) {
                    int I0 = gl.I0(imageReceiver3.n());
                    qfaVar.a = I0;
                    CheckBoxBase checkBoxBase = qfaVar.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (v = bkb.v(I0, bkb.p1(0.25f, -1)))) {
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
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void a(String str) {
        g2b storiesController;
        nfa nfaVar = ((nca) this.b).d;
        storiesController = nfaVar.getStoriesController();
        storiesController.q(nfaVar.m1, str, new nba(nfaVar, (byte) 1));
    }

    @Override
    public final void b(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                nn9 nn9Var = (nn9) obj;
                Paint paint = nn9Var.K;
                RectF rectF = nn9Var.d;
                nn9Var.d(canvas);
                on9 on9Var = nn9Var.P;
                FrameLayout frameLayout = on9Var.h;
                TextureView textureView = on9Var.n;
                if (frameLayout.getVisibility() == 0 && frameLayout.getWidth() > 0) {
                    canvas.save();
                    canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
                    canvas.concat(frameLayout.getMatrix());
                    float L = (1.0f - on9Var.U) * gl.L(12.0f);
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
                zka zkaVar = (zka) obj;
                canvas.save();
                canvas.translate(zkaVar.a.getX(), zkaVar.a.getY());
                zkaVar.a.draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 24:
                i8c i8cVar = (i8c) obj;
                if (i == 1) {
                    i8cVar.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    i8cVar.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 25:
                ae2 ae2Var = (ae2) obj;
                if (i == 1) {
                    ae2Var.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    ae2Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                et4 et4Var = (et4) obj;
                if (i == 1) {
                    et4Var.a(Boolean.TRUE, null);
                    return;
                } else if (i != 3) {
                    et4Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final boolean d(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                hs9 hs9Var = (hs9) obj;
                gx0 gx0Var = hs9Var.c;
                k27 E = gx0Var.E(i);
                hs9 hs9Var2 = (hs9) gx0Var.d;
                if (E == null) {
                    return false;
                }
                if (!hs9Var.J.t()) {
                    hs9Var.J.c();
                    gx0Var.l(0, hs9Var2.r);
                }
                if (hs9Var.J.t()) {
                    hs9Var.J.f(E, view, 0);
                    if (!hs9Var.J.t()) {
                        gx0Var.l(0, hs9Var2.r);
                    }
                    se4 se4Var = hs9Var.K;
                    int e1 = E.e1();
                    se4Var.a = k27.B0(E.k);
                    se4Var.b = e1;
                }
                return true;
            default:
                return ((qy9) obj).Z0(i, view);
        }
    }

    @Override
    public final void e(float r19, float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh9.e(float, float, int, android.view.View):void");
    }

    @Override
    public final void f() {
        waa waaVar = (waa) this.b;
        float progress = 1.0f - (waaVar.d.getProgress() * 0.143f);
        be0 be0Var = waaVar.a;
        be0Var.setScaleX(progress);
        be0Var.setScaleY(progress);
        waaVar.invalidate();
    }

    @Override
    public final Object g(Integer num, Object obj) {
        return (CharSequence) ((pb) this.b).a((Integer) obj);
    }

    @Override
    public final void h(int i, int i2) {
        cja cjaVar = (cja) this.b;
        cjaVar.x = i;
        cjaVar.y = i2;
        si9 si9Var = cjaVar.M;
        if (si9Var != null) {
            si9Var.invalidate();
        }
    }

    @Override
    public final void i(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 13:
                f0a f0aVar = (f0a) obj;
                if (f0aVar != null) {
                    f0aVar.c();
                    return;
                }
                return;
            default:
                y1b y1bVar = (y1b) obj;
                if (z) {
                    y1bVar.p(30, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        d S;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 23:
                ((gta) obj3).R((ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
            default:
                gva gvaVar = (gva) obj3;
                c4c c4cVar = (c4c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                Object obj4 = c4cVar.H;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    jva.k1(gvaVar.getContext(), false, 0L, gvaVar.c, (TL_stars.StarsTransaction) c4cVar.H, gvaVar.b);
                    return;
                } else if ((obj4 instanceof TL_wallet.walletTransaction) && (S = LaunchActivity.S()) != null) {
                    S.presentFragment(new hmc());
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final int k(wjb wjbVar, boolean z) {
        return ((IntSupplier) this.b).getAsInt();
    }

    @Override
    public final void m() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ai9) obj).g();
                return;
            default:
                ii9 ii9Var = (ii9) obj;
                lk0 lk0Var = ii9Var.a;
                if (lk0Var != null) {
                    lk0Var.s = true;
                    lk0Var.r = ii9Var.r.q2;
                }
                ii9Var.w();
                ge9 ge9Var = ii9Var.F;
                if (ge9Var != null && ii9Var.a != null) {
                    ge9Var.a.W3();
                    return;
                }
                return;
        }
    }

    @Override
    public final void o(long j) {
        ((jqa) this.b).f();
    }

    @Override
    public final void onSuccess(Object obj) {
        a61 a61Var = (a61) this.b;
        dab dabVar = (dab) obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dabVar.a.size(); i++) {
            cab cabVar = (cab) dabVar.a.get(i);
            ?? obj2 = new Object();
            obj2.a = cabVar.a;
            obj2.b = cabVar.d;
            obj2.c = cabVar.e;
            obj2.d = cabVar.b;
            obj2.e = cabVar.c;
            arrayList.add(obj2);
        }
        a61Var.a(arrayList);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        View view = ((xqa) this.b).b;
        if (view instanceof uk1) {
            ((uk1) view).W();
        } else {
            view.invalidate();
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        hi3 hi3Var = (hi3) this.b;
        int i3 = hi3Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = hi3Var.C0;
        for (se4 se4Var : hashMap.keySet()) {
            arrayList2.add((k27) hashMap.get(se4Var));
        }
        hashMap.clear();
        hi3Var.R(false);
        boolean z3 = true;
        if (arrayList.size() <= 1 && ((zc7) arrayList.get(0)).a != y6c.h(j5.a(i3).a).e() && charSequence == null) {
            long j = ((zc7) arrayList.get(0)).a;
            Bundle l = ir2.l("scrollToTopOnResume", true);
            if (cf3.B(j)) {
                l.putInt("enc_id", (int) (j & 4294967295L));
            } else {
                if (cf3.D(j)) {
                    l.putLong("user_id", j);
                } else {
                    l.putLong("chat_id", -j);
                }
                if (!na7.q1(j5.a(i3).a).A(l, cj3Var, null, null)) {
                    return true;
                }
            }
            mu1 mu1Var = new mu1(l);
            cj3Var.presentFragment(mu1Var, true);
            mu1Var.Qb(arrayList2);
            return true;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            long j2 = ((zc7) arrayList.get(i4)).a;
            if (charSequence != null) {
                z3a.B(j5.a(i3).a).q0(x3a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            z3a.B(j5.a(i3).a).p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i4++;
            z3 = z3;
        }
        boolean z4 = z3;
        cj3Var.finishFragment();
        return z4;
    }

    @Override
    public final void s(long j, xu7 xu7Var) {
        sqd.a(j, xu7Var, ((uv9) this.b).c);
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    private final void w(ImageReceiver imageReceiver) {
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    private final void n(int i, Drawable drawable) {
    }

    private final void u(int i, Drawable drawable) {
    }

    @Override
    public final void F(float f, int i) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
