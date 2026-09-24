package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class gc {
    public float f4736b;
    public org.telegram.ui.Cells.f7 d;
    public ImageReceiver e;
    public ai.a5 f4738f;
    public int f4735a = 0;
    public final RectF f4737c = new RectF();

    public static ec b(org.telegram.ui.Cells.g7 g7Var) {
        int i10;
        if (g7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = g7Var.getImageView();
        ec ecVar = new ec(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        ecVar.f4737c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        ecVar.d = new org.telegram.ui.Cells.f7(imageView.getContext(), null, false, g7Var.f20349y);
        ecVar.f4736b = Math.max(ecVar.f4737c.width(), ecVar.f4737c.height()) / 2.0f;
        return ecVar;
    }

    public static fc c(ai.a0 a0Var) {
        if (a0Var != null) {
            ImageReceiver imageReceiver = a0Var.f499r;
            if (a0Var.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                fc fcVar = new fc(a0Var, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                a0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                fcVar.f4737c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                fcVar.e = imageReceiver;
                fcVar.f4736b = Math.max(fcVar.f4737c.width(), fcVar.f4737c.height()) / 2.0f;
                return fcVar;
            }
            return null;
        }
        return null;
    }

    public static ec d(ai.jc jcVar) {
        ai.e6 currentPeerView;
        ai.a5 a5Var;
        float x10;
        if (jcVar != null) {
            ec ecVar = new ec(jcVar, 1);
            ai.zb zbVar = jcVar.f1087n0;
            if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null && (a5Var = currentPeerView.f776c1) != null) {
                ai.xb xbVar = jcVar.f1098s;
                float f7 = 0.0f;
                if (xbVar == null) {
                    x10 = 0.0f;
                } else {
                    x10 = xbVar.getX();
                }
                ai.xb xbVar2 = jcVar.f1098s;
                if (xbVar2 != null) {
                    f7 = xbVar2.getY();
                }
                ecVar.f4737c.set(a5Var.getX() + currentPeerView.getX() + jcVar.X + x10 + jcVar.v.getLeft(), a5Var.getY() + currentPeerView.getY() + jcVar.W + f7 + jcVar.v.getTop(), (((x10 + jcVar.X) + jcVar.v.getRight()) - (jcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - a5Var.getRight()), (((f7 + jcVar.W) + jcVar.v.getBottom()) - (jcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - a5Var.getBottom()));
                ecVar.f4735a = 1;
                ecVar.f4736b = AndroidUtilities.dp(8.0f);
                ai.e6 t10 = jcVar.t();
                if (t10 != null) {
                    ecVar.f4738f = t10.f776c1;
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
