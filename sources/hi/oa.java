package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class oa {
    public float f15200b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver f15202e;
    public fi.c3 f15203f;
    public int f15199a = 0;
    public final RectF f15201c = new RectF();

    public static ma b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.q9 imageView = e7Var.getImageView();
        ma maVar = new ma(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = maVar.f15201c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        maVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, 2131231616, e7Var.E);
        maVar.f15200b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return maVar;
    }

    public static na c(fi.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f12361r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.N0;
                na naVar = new na(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.M0;
                naVar.f15201c.set(f11, f12, f11 + f10, f10 + f12);
                naVar.f15202e = imageReceiver;
                naVar.f15200b = Math.max(naVar.f15201c.width(), naVar.f15201c.height()) / 2.0f;
                return naVar;
            }
            return null;
        }
        return null;
    }

    public static ma d(fi.f9 f9Var) {
        fi.z3 currentPeerView;
        fi.c3 c3Var;
        float x10;
        if (f9Var != null) {
            ma maVar = new ma(f9Var, 1);
            fi.v8 v8Var = f9Var.f11983o0;
            if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null && (c3Var = currentPeerView.M0) != null) {
                fi.t8 t8Var = f9Var.f11992s;
                float f10 = 0.0f;
                if (t8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = t8Var.getX();
                }
                fi.t8 t8Var2 = f9Var.f11992s;
                if (t8Var2 != null) {
                    f10 = t8Var2.getY();
                }
                maVar.f15201c.set(c3Var.getX() + currentPeerView.getX() + f9Var.Y + x10 + f9Var.f12001w.getLeft(), c3Var.getY() + currentPeerView.getY() + f9Var.X + f10 + f9Var.f12001w.getTop(), (((x10 + f9Var.Y) + f9Var.f12001w.getRight()) - (f9Var.f12001w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - c3Var.getRight()), (((f10 + f9Var.X) + f9Var.f12001w.getBottom()) - (f9Var.f12001w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - c3Var.getBottom()));
                maVar.f15199a = 1;
                maVar.f15200b = org.telegram.messenger.g0.L(8.0f);
                fi.z3 z10 = f9Var.z();
                if (z10 != null) {
                    maVar.f15203f = z10.M0;
                }
                return maVar;
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
