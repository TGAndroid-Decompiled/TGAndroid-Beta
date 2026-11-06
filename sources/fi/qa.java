package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class qa {
    public float f12686b;
    public org.telegram.ui.Cells.c7 d;
    public ImageReceiver f12688e;
    public di.j3 f12689f;
    public int f12685a = 0;
    public final RectF f12687c = new RectF();

    public static oa b(org.telegram.ui.Cells.d7 d7Var) {
        if (d7Var == null) {
            return null;
        }
        org.telegram.ui.Components.l9 imageView = d7Var.getImageView();
        oa oaVar = new oa(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = oaVar.f12687c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        oaVar.d = new org.telegram.ui.Cells.c7(imageView.getContext(), null, false, 2131231615, d7Var.D);
        oaVar.f12686b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return oaVar;
    }

    public static pa c(di.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f9490r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.M0;
                pa paVar = new pa(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.K0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.L0;
                paVar.f12687c.set(f11, f12, f11 + f10, f10 + f12);
                paVar.f12688e = imageReceiver;
                paVar.f12686b = Math.max(paVar.f12687c.width(), paVar.f12687c.height()) / 2.0f;
                return paVar;
            }
            return null;
        }
        return null;
    }

    public static oa d(di.p9 p9Var) {
        di.i4 currentPeerView;
        di.j3 j3Var;
        float x10;
        if (p9Var != null) {
            oa oaVar = new oa(p9Var, 1);
            di.f9 f9Var = p9Var.f9559n0;
            if (f9Var != null && (currentPeerView = f9Var.getCurrentPeerView()) != null && (j3Var = currentPeerView.L0) != null) {
                di.d9 d9Var = p9Var.f9569s;
                float f10 = 0.0f;
                if (d9Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = d9Var.getX();
                }
                di.d9 d9Var2 = p9Var.f9569s;
                if (d9Var2 != null) {
                    f10 = d9Var2.getY();
                }
                oaVar.f12687c.set(j3Var.getX() + currentPeerView.getX() + p9Var.X + x10 + p9Var.f9578w.getLeft(), j3Var.getY() + currentPeerView.getY() + p9Var.W + f10 + p9Var.f9578w.getTop(), (((x10 + p9Var.X) + p9Var.f9578w.getRight()) - (p9Var.f9578w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((f10 + p9Var.W) + p9Var.f9578w.getBottom()) - (p9Var.f9578w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                oaVar.f12685a = 1;
                oaVar.f12686b = org.telegram.messenger.g0.L(8.0f);
                di.i4 z9 = p9Var.z();
                if (z9 != null) {
                    oaVar.f12689f = z9.L0;
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
