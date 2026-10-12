package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class gc {
    public float f5132b;
    public org.telegram.ui.Cells.e7 d;
    public ImageReceiver f5134e;
    public ai.b5 f5135f;
    public int f5131a = 0;
    public final RectF f5133c = new RectF();

    public static ec b(org.telegram.ui.Cells.f7 f7Var) {
        int i10;
        if (f7Var == null) {
            return null;
        }
        org.telegram.ui.Components.y9 imageView = f7Var.getImageView();
        ec ecVar = new ec(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        ecVar.f5133c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        ecVar.d = new org.telegram.ui.Cells.e7(imageView.getContext(), null, false, f7Var.f21860y);
        ecVar.f5132b = Math.max(ecVar.f5133c.width(), ecVar.f5133c.height()) / 2.0f;
        return ecVar;
    }

    public static fc c(ai.a0 a0Var) {
        if (a0Var != null) {
            ImageReceiver imageReceiver = a0Var.f630r;
            if (a0Var.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                fc fcVar = new fc(a0Var, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                a0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                fcVar.f5133c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                fcVar.f5134e = imageReceiver;
                fcVar.f5132b = Math.max(fcVar.f5133c.width(), fcVar.f5133c.height()) / 2.0f;
                return fcVar;
            }
            return null;
        }
        return null;
    }

    public static ec d(ai.kc kcVar) {
        ai.f6 currentPeerView;
        ai.b5 b5Var;
        float x10;
        if (kcVar != null) {
            ec ecVar = new ec(kcVar, 1);
            ai.ac acVar = kcVar.f1281n0;
            if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null && (b5Var = currentPeerView.f953c1) != null) {
                ai.yb ybVar = kcVar.f1292s;
                float f7 = 0.0f;
                if (ybVar == null) {
                    x10 = 0.0f;
                } else {
                    x10 = ybVar.getX();
                }
                ai.yb ybVar2 = kcVar.f1292s;
                if (ybVar2 != null) {
                    f7 = ybVar2.getY();
                }
                ecVar.f5133c.set(b5Var.getX() + currentPeerView.getX() + kcVar.X + x10 + kcVar.v.getLeft(), b5Var.getY() + currentPeerView.getY() + kcVar.W + f7 + kcVar.v.getTop(), (((x10 + kcVar.X) + kcVar.v.getRight()) - (kcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - b5Var.getRight()), (((f7 + kcVar.W) + kcVar.v.getBottom()) - (kcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - b5Var.getBottom()));
                ecVar.f5131a = 1;
                ecVar.f5132b = AndroidUtilities.dp(8.0f);
                ai.f6 t10 = kcVar.t();
                if (t10 != null) {
                    ecVar.f5135f = t10.f953c1;
                }
                return ecVar;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
