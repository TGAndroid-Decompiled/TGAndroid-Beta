package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class na {
    public float f15133b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver f15135e;
    public fi.c3 f15136f;
    public int f15132a = 0;
    public final RectF f15134c = new RectF();

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
        RectF rectF = laVar.f15134c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        laVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, 2131231616, e7Var.E);
        laVar.f15133b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return laVar;
    }

    public static ma c(fi.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f12403r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.N0;
                ma maVar = new ma(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.M0;
                maVar.f15134c.set(f11, f12, f11 + f10, f10 + f12);
                maVar.f15135e = imageReceiver;
                maVar.f15133b = Math.max(maVar.f15134c.width(), maVar.f15134c.height()) / 2.0f;
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
            fi.v8 v8Var = f9Var.f12024o0;
            if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null && (c3Var = currentPeerView.M0) != null) {
                fi.t8 t8Var = f9Var.f12033s;
                float f10 = 0.0f;
                if (t8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = t8Var.getX();
                }
                fi.t8 t8Var2 = f9Var.f12033s;
                if (t8Var2 != null) {
                    f10 = t8Var2.getY();
                }
                laVar.f15134c.set(c3Var.getX() + currentPeerView.getX() + f9Var.Y + x10 + f9Var.f12042w.getLeft(), c3Var.getY() + currentPeerView.getY() + f9Var.X + f10 + f9Var.f12042w.getTop(), (((x10 + f9Var.Y) + f9Var.f12042w.getRight()) - (f9Var.f12042w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - c3Var.getRight()), (((f10 + f9Var.X) + f9Var.f12042w.getBottom()) - (f9Var.f12042w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - c3Var.getBottom()));
                laVar.f15132a = 1;
                laVar.f15133b = org.telegram.messenger.g0.L(8.0f);
                fi.z3 z10 = f9Var.z();
                if (z10 != null) {
                    laVar.f15136f = z10.M0;
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
