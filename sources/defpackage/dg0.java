package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ProfileActivity;
public final class dg0 implements yi5 {
    public final byte a;
    public final Object b;
    public final Object c;

    public dg0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        byte b = this.a;
        qebVar.b = true;
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        float f;
        Canvas canvas2;
        float f2;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ny9 ny9Var = (ny9) obj2;
                uk0.a(ny9Var, canvas, rectF, ny9Var, (FrameLayout) obj);
                return;
            case 1:
                d79 d79Var = (d79) obj2;
                uk0.a(d79Var, canvas, rectF, d79Var, (FrameLayout) obj);
                return;
            case 2:
                ((at0) obj2).f.d(canvas, rectF, (kd) obj);
                return;
            case 3:
                ((z61) obj2).c0.d(canvas, rectF, (tg0) obj);
                return;
            case 4:
                a93 a93Var = (a93) obj2;
                b6 b6Var = (b6) obj;
                int childCount = a93Var.a.getChildCount();
                while (i < childCount) {
                    View childAt = a93Var.a.getChildAt(i);
                    if (childAt instanceof d79) {
                        d79 d79Var2 = (d79) childAt;
                        uk0.a(d79Var2, canvas, rectF, d79Var2, b6Var);
                    }
                    i++;
                }
                return;
            case 5:
                ((ue5) obj2).n.u(canvas, rectF, (FrameLayout) obj);
                return;
            case 6:
                ((em6) obj2).S.u(canvas, rectF, (d26) obj);
                return;
            case 7:
                d26 d26Var = (d26) obj;
                jm7[] jm7VarArr = ((lm7) obj2).b;
                int length = jm7VarArr.length;
                while (i < length) {
                    im7 im7Var = jm7VarArr[i].f;
                    if (im7Var != null && im7Var.H && im7Var.getVisibility() == 0 && im7Var.getAlpha() > 0.0f) {
                        uk0.a(im7Var, canvas, rectF, im7Var, d26Var);
                    }
                    i++;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                lhc lhcVar = (lhc) obj;
                RectF rectF2 = ProfileActivity.Z6;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                gr8 gr8Var = profileActivity.O;
                if (gr8Var != null && gr8Var.getParent() == profileActivity.a) {
                    f = profileActivity.W5;
                } else {
                    f = 0.0f;
                }
                int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i2 < 0) {
                    is8 is8Var = profileActivity.d1;
                    RectF rectF3 = ProfileActivity.Z6;
                    if (yic.c(is8Var, viewGroup, rectF3) && RectF.intersects(rectF3, rectF)) {
                        uk0.a(new mr0(profileActivity, (byte) 8), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    zp8 zp8Var = profileActivity.a;
                    Objects.requireNonNull(zp8Var);
                    uk0.a(new mr0(zp8Var, (byte) 9), canvas, rectF, profileActivity.a, viewGroup);
                    lhcVar.g(canvas, rectF);
                }
                if (f > 0.0f) {
                    if (i2 < 0) {
                        f2 = profileActivity.O.getY() + profileActivity.a.getY();
                    } else {
                        f2 = Float.MAX_VALUE;
                    }
                    paint.setColor(aob.v0(aob.a7, profileActivity.A0));
                    paint.setAlpha((int) (f * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f2), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.u(canvas2, rectF, viewGroup);
                ProfileActivity.F1(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.F1(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.F1(profileActivity.n0, canvas2, rectF, viewGroup);
                return;
            case 9:
                ((nza) obj2).V.d(canvas, rectF, (kya) obj);
                return;
            default:
                ((thb) obj2).V.d(canvas, rectF, (kya) obj);
                return;
        }
    }
}
