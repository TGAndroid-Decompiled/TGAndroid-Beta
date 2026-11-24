package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ProfileActivity;
public final class dh0 implements vi5 {
    public final byte a;
    public final Object b;
    public final Object c;

    public dh0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        byte b = this.a;
        ucbVar.b = true;
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        float f;
        Canvas canvas2;
        float f2;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ww9 ww9Var = (ww9) obj2;
                tl0.a(ww9Var, canvas, rectF, ww9Var, (FrameLayout) obj);
                return;
            case 1:
                r59 r59Var = (r59) obj2;
                tl0.a(r59Var, canvas, rectF, r59Var, (FrameLayout) obj);
                return;
            case 2:
                ((au0) obj2).f.d(canvas, rectF, (je) obj);
                return;
            case 3:
                ((y71) obj2).c0.d(canvas, rectF, (xg0) obj);
                return;
            case 4:
                t93 t93Var = (t93) obj2;
                a6 a6Var = (a6) obj;
                int childCount = t93Var.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = t93Var.a.getChildAt(i);
                    if (childAt instanceof r59) {
                        r59 r59Var2 = (r59) childAt;
                        tl0.a(r59Var2, canvas, rectF, r59Var2, a6Var);
                    }
                }
                return;
            case 5:
                ((re5) obj2).n.w(canvas, rectF, (FrameLayout) obj);
                return;
            case 6:
                ((cm6) obj2).S.w(canvas, rectF, (ne6) obj);
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                nfc nfcVar = (nfc) obj;
                RectF rectF2 = ProfileActivity.e7;
                Paint paint = profileActivity.Y6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                wp8 wp8Var = profileActivity.O;
                if (wp8Var != null && wp8Var.getParent() == profileActivity.a) {
                    f = profileActivity.b6;
                } else {
                    f = 0.0f;
                }
                int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i2 < 0) {
                    xq8 xq8Var = profileActivity.d1;
                    RectF rectF3 = ProfileActivity.e7;
                    if (zgc.c(xq8Var, viewGroup, rectF3) && RectF.intersects(rectF3, rectF)) {
                        tl0.a(new ms0(profileActivity, (byte) 8), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    po8 po8Var = profileActivity.a;
                    Objects.requireNonNull(po8Var);
                    tl0.a(new ms0(po8Var, (byte) 9), canvas, rectF, profileActivity.a, viewGroup);
                    nfcVar.g(canvas, rectF);
                }
                if (f > 0.0f) {
                    if (i2 < 0) {
                        f2 = profileActivity.O.getY() + profileActivity.a.getY();
                    } else {
                        f2 = Float.MAX_VALUE;
                    }
                    paint.setColor(cmb.v0(cmb.Z6, profileActivity.A0));
                    paint.setAlpha((int) (f * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, f2), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.w(canvas2, rectF, viewGroup);
                ProfileActivity.G1(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.G1(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.G1(profileActivity.n0, canvas2, rectF, viewGroup);
                return;
            case 8:
                ((nxa) obj2).V.d(canvas, rectF, (kwa) obj);
                return;
            default:
                ((yfb) obj2).V.d(canvas, rectF, (kwa) obj);
                return;
        }
    }
}
