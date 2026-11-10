package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class qa {
    public float f12691b;
    public org.telegram.ui.Cells.c7 d;
    public ImageReceiver f12693e;
    public di.j3 f12694f;
    public int f12690a = 0;
    public final RectF f12692c = new RectF();

    public static oa b(org.telegram.ui.Cells.d7 d7Var) {
        if (d7Var == null) {
            return null;
        }
        org.telegram.ui.Components.k9 imageView = d7Var.getImageView();
        oa oaVar = new oa(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = oaVar.f12692c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        oaVar.d = new org.telegram.ui.Cells.c7(imageView.getContext(), null, false, 2131231615, d7Var.D);
        oaVar.f12691b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return oaVar;
    }

    public static pa c(di.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f9484r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.M0;
                pa paVar = new pa(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.K0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.L0;
                paVar.f12692c.set(f11, f12, f11 + f10, f10 + f12);
                paVar.f12693e = imageReceiver;
                paVar.f12691b = Math.max(paVar.f12692c.width(), paVar.f12692c.height()) / 2.0f;
                return paVar;
            }
            return null;
        }
        return null;
    }

    public static oa d(di.q9 q9Var) {
        di.j4 currentPeerView;
        di.j3 j3Var;
        float x10;
        if (q9Var != null) {
            oa oaVar = new oa(q9Var, 1);
            di.g9 g9Var = q9Var.f9629n0;
            if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null && (j3Var = currentPeerView.L0) != null) {
                di.e9 e9Var = q9Var.f9639s;
                float f10 = 0.0f;
                if (e9Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = e9Var.getX();
                }
                di.e9 e9Var2 = q9Var.f9639s;
                if (e9Var2 != null) {
                    f10 = e9Var2.getY();
                }
                oaVar.f12692c.set(j3Var.getX() + currentPeerView.getX() + q9Var.X + x10 + q9Var.f9648w.getLeft(), j3Var.getY() + currentPeerView.getY() + q9Var.W + f10 + q9Var.f9648w.getTop(), (((x10 + q9Var.X) + q9Var.f9648w.getRight()) - (q9Var.f9648w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((f10 + q9Var.W) + q9Var.f9648w.getBottom()) - (q9Var.f9648w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                oaVar.f12690a = 1;
                oaVar.f12691b = org.telegram.messenger.g0.L(8.0f);
                di.j4 z9 = q9Var.z();
                if (z9 != null) {
                    oaVar.f12694f = z9.L0;
                }
                return oaVar;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z9);

    public void a(Canvas canvas, float f10) {
    }
}
