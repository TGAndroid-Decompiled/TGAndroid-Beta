package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class na {
    public float f14782b;
    public org.telegram.ui.Cells.b7 d;
    public ImageReceiver f14784e;
    public fi.e3 f14785f;
    public int f14781a = 0;
    public final RectF f14783c = new RectF();

    public static la b(org.telegram.ui.Cells.c7 c7Var) {
        if (c7Var == null) {
            return null;
        }
        org.telegram.ui.Components.i9 imageView = c7Var.getImageView();
        la laVar = new la(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = laVar.f14783c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        laVar.d = new org.telegram.ui.Cells.b7(imageView.getContext(), null, false, 2131231615, c7Var.E);
        laVar.f14782b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return laVar;
    }

    public static ma c(fi.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f12152r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.N0;
                ma maVar = new ma(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.M0;
                maVar.f14783c.set(f11, f12, f11 + f10, f10 + f12);
                maVar.f14784e = imageReceiver;
                maVar.f14782b = Math.max(maVar.f14783c.width(), maVar.f14783c.height()) / 2.0f;
                return maVar;
            }
            return null;
        }
        return null;
    }

    public static la d(fi.i9 i9Var) {
        fi.b4 currentPeerView;
        fi.e3 e3Var;
        float x10;
        if (i9Var != null) {
            la laVar = new la(i9Var, 1);
            fi.y8 y8Var = i9Var.f11861o0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null && (e3Var = currentPeerView.M0) != null) {
                fi.w8 w8Var = i9Var.f11870s;
                float f10 = 0.0f;
                if (w8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = w8Var.getX();
                }
                fi.w8 w8Var2 = i9Var.f11870s;
                if (w8Var2 != null) {
                    f10 = w8Var2.getY();
                }
                laVar.f14783c.set(e3Var.getX() + currentPeerView.getX() + i9Var.Y + x10 + i9Var.f11879w.getLeft(), e3Var.getY() + currentPeerView.getY() + i9Var.X + f10 + i9Var.f11879w.getTop(), (((x10 + i9Var.Y) + i9Var.f11879w.getRight()) - (i9Var.f11879w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - e3Var.getRight()), (((f10 + i9Var.X) + i9Var.f11879w.getBottom()) - (i9Var.f11879w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - e3Var.getBottom()));
                laVar.f14781a = 1;
                laVar.f14782b = org.telegram.messenger.g0.L(8.0f);
                fi.b4 z10 = i9Var.z();
                if (z10 != null) {
                    laVar.f14785f = z10.M0;
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
