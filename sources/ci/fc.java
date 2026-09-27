package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class fc {
    public float f4713b;
    public org.telegram.ui.Cells.f7 d;
    public ImageReceiver e;
    public ai.a5 f4715f;
    public int f4712a = 0;
    public final RectF f4714c = new RectF();

    public static dc b(org.telegram.ui.Cells.g7 g7Var) {
        int i10;
        if (g7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = g7Var.getImageView();
        dc dcVar = new dc(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        dcVar.f4714c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        dcVar.d = new org.telegram.ui.Cells.f7(imageView.getContext(), null, false, g7Var.f20365y);
        dcVar.f4713b = Math.max(dcVar.f4714c.width(), dcVar.f4714c.height()) / 2.0f;
        return dcVar;
    }

    public static ec c(ai.a0 a0Var) {
        if (a0Var != null) {
            ImageReceiver imageReceiver = a0Var.f502r;
            if (a0Var.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                ec ecVar = new ec(a0Var, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                a0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                ecVar.f4714c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.e = imageReceiver;
                ecVar.f4713b = Math.max(ecVar.f4714c.width(), ecVar.f4714c.height()) / 2.0f;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    public static dc d(ai.jc jcVar) {
        ai.e6 currentPeerView;
        ai.a5 a5Var;
        float x10;
        if (jcVar != null) {
            dc dcVar = new dc(jcVar, 1);
            ai.zb zbVar = jcVar.f1089n0;
            if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null && (a5Var = currentPeerView.f779c1) != null) {
                ai.xb xbVar = jcVar.f1100s;
                float f7 = 0.0f;
                if (xbVar == null) {
                    x10 = 0.0f;
                } else {
                    x10 = xbVar.getX();
                }
                ai.xb xbVar2 = jcVar.f1100s;
                if (xbVar2 != null) {
                    f7 = xbVar2.getY();
                }
                dcVar.f4714c.set(a5Var.getX() + currentPeerView.getX() + jcVar.X + x10 + jcVar.v.getLeft(), a5Var.getY() + currentPeerView.getY() + jcVar.W + f7 + jcVar.v.getTop(), (((x10 + jcVar.X) + jcVar.v.getRight()) - (jcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - a5Var.getRight()), (((f7 + jcVar.W) + jcVar.v.getBottom()) - (jcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - a5Var.getBottom()));
                dcVar.f4712a = 1;
                dcVar.f4713b = AndroidUtilities.dp(8.0f);
                ai.e6 t10 = jcVar.t();
                if (t10 != null) {
                    dcVar.f4715f = t10.f779c1;
                }
                return dcVar;
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
