package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class na {
    public float f15136b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver f15138e;
    public fi.c3 f15139f;
    public int f15135a = 0;
    public final RectF f15137c = new RectF();

    public static la b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.q9 imageView = e7Var.getImageView();
        la laVar = new la(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = laVar.f15137c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        laVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, 2131231616, e7Var.E);
        laVar.f15136b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return laVar;
    }

    public static ma c(fi.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f12406r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.N0;
                ma maVar = new ma(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.M0;
                maVar.f15137c.set(f11, f12, f11 + f10, f10 + f12);
                maVar.f15138e = imageReceiver;
                maVar.f15136b = Math.max(maVar.f15137c.width(), maVar.f15137c.height()) / 2.0f;
                return maVar;
            }
            return null;
        }
        return null;
    }

    public static la d(fi.f9 f9Var) {
        fi.z3 currentPeerView;
        fi.c3 c3Var;
        float x10;
        if (f9Var != null) {
            la laVar = new la(f9Var, 1);
            fi.v8 v8Var = f9Var.f12027o0;
            if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null && (c3Var = currentPeerView.M0) != null) {
                fi.t8 t8Var = f9Var.f12036s;
                float f10 = 0.0f;
                if (t8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = t8Var.getX();
                }
                fi.t8 t8Var2 = f9Var.f12036s;
                if (t8Var2 != null) {
                    f10 = t8Var2.getY();
                }
                laVar.f15137c.set(c3Var.getX() + currentPeerView.getX() + f9Var.Y + x10 + f9Var.f12045w.getLeft(), c3Var.getY() + currentPeerView.getY() + f9Var.X + f10 + f9Var.f12045w.getTop(), (((x10 + f9Var.Y) + f9Var.f12045w.getRight()) - (f9Var.f12045w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - c3Var.getRight()), (((f10 + f9Var.X) + f9Var.f12045w.getBottom()) - (f9Var.f12045w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - c3Var.getBottom()));
                laVar.f15135a = 1;
                laVar.f15136b = org.telegram.messenger.g0.L(8.0f);
                fi.z3 z10 = f9Var.z();
                if (z10 != null) {
                    laVar.f15139f = z10.M0;
                }
                return laVar;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
