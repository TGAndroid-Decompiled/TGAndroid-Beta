package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class nb {
    public float f11322b;
    public org.telegram.ui.Cells.j7 d;
    public ImageReceiver e;
    public di.q3 f11324f;
    public int f11321a = 0;
    public final RectF f11323c = new RectF();

    public static lb b(org.telegram.ui.Cells.k7 k7Var) {
        int i10;
        if (k7Var == null) {
            return null;
        }
        org.telegram.ui.Components.y9 imageView = k7Var.getImageView();
        lb lbVar = new lb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        lbVar.f11323c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        lbVar.d = new org.telegram.ui.Cells.j7(imageView.getContext(), null, false, k7Var.f24351y);
        lbVar.f11322b = Math.max(lbVar.f11323c.width(), lbVar.f11323c.height()) / 2.0f;
        return lbVar;
    }

    public static mb c(di.q qVar) {
        if (qVar != null) {
            ImageReceiver imageReceiver = qVar.f8941r;
            if (qVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                mb mbVar = new mb(qVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                mbVar.f11323c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                mbVar.e = imageReceiver;
                mbVar.f11322b = Math.max(mbVar.f11323c.width(), mbVar.f11323c.height()) / 2.0f;
                return mbVar;
            }
            return null;
        }
        return null;
    }

    public static lb d(di.y9 y9Var) {
        di.q4 currentPeerView;
        di.q3 q3Var;
        float x9;
        if (y9Var != null) {
            lb lbVar = new lb(y9Var, 1);
            di.o9 o9Var = y9Var.f9444n0;
            if (o9Var != null && (currentPeerView = o9Var.getCurrentPeerView()) != null && (q3Var = currentPeerView.R0) != null) {
                di.m9 m9Var = y9Var.f9455s;
                float f7 = 0.0f;
                if (m9Var == null) {
                    x9 = 0.0f;
                } else {
                    x9 = m9Var.getX();
                }
                di.m9 m9Var2 = y9Var.f9455s;
                if (m9Var2 != null) {
                    f7 = m9Var2.getY();
                }
                lbVar.f11323c.set(q3Var.getX() + currentPeerView.getX() + y9Var.X + x9 + y9Var.v.getLeft(), q3Var.getY() + currentPeerView.getY() + y9Var.W + f7 + y9Var.v.getTop(), (((x9 + y9Var.X) + y9Var.v.getRight()) - (y9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - q3Var.getRight()), (((f7 + y9Var.W) + y9Var.v.getBottom()) - (y9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - q3Var.getBottom()));
                lbVar.f11321a = 1;
                lbVar.f11322b = AndroidUtilities.dp(8.0f);
                di.q4 u10 = y9Var.u();
                if (u10 != null) {
                    lbVar.f11324f = u10.R0;
                }
                return lbVar;
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
