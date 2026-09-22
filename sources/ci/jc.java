package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class jc {
    public float f4860b;
    public org.telegram.ui.Cells.g7 d;
    public ImageReceiver e;
    public ai.a5 f4862f;
    public int f4859a = 0;
    public final RectF f4861c = new RectF();

    public static hc b(org.telegram.ui.Cells.h7 h7Var) {
        int i10;
        if (h7Var == null) {
            return null;
        }
        org.telegram.ui.Components.v9 imageView = h7Var.getImageView();
        hc hcVar = new hc(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        hcVar.f4861c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        hcVar.d = new org.telegram.ui.Cells.g7(imageView.getContext(), null, false, h7Var.f20421y);
        hcVar.f4860b = Math.max(hcVar.f4861c.width(), hcVar.f4861c.height()) / 2.0f;
        return hcVar;
    }

    public static ic c(ai.a0 a0Var) {
        if (a0Var != null) {
            ImageReceiver imageReceiver = a0Var.f499r;
            if (a0Var.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                ic icVar = new ic(a0Var, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                a0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(a0Var, (ViewGroup) a0Var.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                icVar.f4861c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                icVar.e = imageReceiver;
                icVar.f4860b = Math.max(icVar.f4861c.width(), icVar.f4861c.height()) / 2.0f;
                return icVar;
            }
            return null;
        }
        return null;
    }

    public static hc d(ai.jc jcVar) {
        ai.f6 currentPeerView;
        ai.a5 a5Var;
        float x10;
        if (jcVar != null) {
            hc hcVar = new hc(jcVar, 1);
            ai.zb zbVar = jcVar.f1093n0;
            if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null && (a5Var = currentPeerView.f800c1) != null) {
                ai.xb xbVar = jcVar.f1104s;
                float f7 = 0.0f;
                if (xbVar == null) {
                    x10 = 0.0f;
                } else {
                    x10 = xbVar.getX();
                }
                ai.xb xbVar2 = jcVar.f1104s;
                if (xbVar2 != null) {
                    f7 = xbVar2.getY();
                }
                hcVar.f4861c.set(a5Var.getX() + currentPeerView.getX() + jcVar.X + x10 + jcVar.v.getLeft(), a5Var.getY() + currentPeerView.getY() + jcVar.W + f7 + jcVar.v.getTop(), (((x10 + jcVar.X) + jcVar.v.getRight()) - (jcVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - a5Var.getRight()), (((f7 + jcVar.W) + jcVar.v.getBottom()) - (jcVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - a5Var.getBottom()));
                hcVar.f4859a = 1;
                hcVar.f4860b = AndroidUtilities.dp(8.0f);
                ai.f6 t10 = jcVar.t();
                if (t10 != null) {
                    hcVar.f4862f = t10.f800c1;
                }
                return hcVar;
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
