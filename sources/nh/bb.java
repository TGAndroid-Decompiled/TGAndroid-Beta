package nh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class bb {
    public float f17445b;
    public org.telegram.ui.Cells.b7 d;
    public ImageReceiver f17447e;
    public lh.h3 f17448f;
    public int f17444a = 0;
    public final RectF f17446c = new RectF();

    public static za b(org.telegram.ui.Cells.c7 c7Var) {
        int i10;
        if (c7Var == null) {
            return null;
        }
        org.telegram.ui.Components.t9 imageView = c7Var.getImageView();
        za zaVar = new za(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        zaVar.f17446c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        zaVar.d = new org.telegram.ui.Cells.b7(imageView.getContext(), null, false, c7Var.f24182y);
        zaVar.f17445b = Math.max(zaVar.f17446c.width(), zaVar.f17446c.height()) / 2.0f;
        return zaVar;
    }

    public static ab c(lh.o oVar) {
        if (oVar != null) {
            ImageReceiver imageReceiver = oVar.f16001r;
            if (oVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                ab abVar = new ab(oVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                oVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                abVar.f17446c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                abVar.f17447e = imageReceiver;
                abVar.f17445b = Math.max(abVar.f17446c.width(), abVar.f17446c.height()) / 2.0f;
                return abVar;
            }
            return null;
        }
        return null;
    }

    public static za d(lh.i9 i9Var) {
        lh.d4 currentPeerView;
        lh.h3 h3Var;
        float x4;
        if (i9Var != null) {
            za zaVar = new za(i9Var, 1);
            lh.y8 y8Var = i9Var.f15765j0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null && (h3Var = currentPeerView.Y0) != null) {
                lh.w8 w8Var = i9Var.f15783s;
                float f9 = 0.0f;
                if (w8Var == null) {
                    x4 = 0.0f;
                } else {
                    x4 = w8Var.getX();
                }
                lh.w8 w8Var2 = i9Var.f15783s;
                if (w8Var2 != null) {
                    f9 = w8Var2.getY();
                }
                zaVar.f17446c.set(h3Var.getX() + currentPeerView.getX() + i9Var.T + x4 + i9Var.v.getLeft(), h3Var.getY() + currentPeerView.getY() + i9Var.S + f9 + i9Var.v.getTop(), (((x4 + i9Var.T) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - h3Var.getRight()), (((f9 + i9Var.S) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - h3Var.getBottom()));
                zaVar.f17444a = 1;
                zaVar.f17445b = AndroidUtilities.dp(8.0f);
                lh.d4 t10 = i9Var.t();
                if (t10 != null) {
                    zaVar.f17448f = t10.Y0;
                }
                return zaVar;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f9) {
    }
}
