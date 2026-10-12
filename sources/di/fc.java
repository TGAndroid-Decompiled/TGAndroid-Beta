package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class fc {
    public float f6956b;
    public org.telegram.ui.Cells.f7 d;
    public ImageReceiver e;
    public bi.o4 f6958f;
    public int f6955a = 0;
    public final RectF f6957c = new RectF();

    public static dc b(org.telegram.ui.Cells.g7 g7Var) {
        int i10;
        if (g7Var == null) {
            return null;
        }
        org.telegram.ui.Components.z9 imageView = g7Var.getImageView();
        dc dcVar = new dc(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        dcVar.f6957c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        dcVar.d = new org.telegram.ui.Cells.f7(imageView.getContext(), null, false, g7Var.f21233y);
        dcVar.f6956b = Math.max(dcVar.f6957c.width(), dcVar.f6957c.height()) / 2.0f;
        return dcVar;
    }

    public static ec c(bi.u uVar) {
        if (uVar != null) {
            ImageReceiver imageReceiver = uVar.f3765r;
            if (uVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                ec ecVar = new ec(uVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                uVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(uVar, (ViewGroup) uVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                ecVar.f6957c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.e = imageReceiver;
                ecVar.f6956b = Math.max(ecVar.f6957c.width(), ecVar.f6957c.height()) / 2.0f;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    public static dc d(bi.sb sbVar) {
        bi.q5 currentPeerView;
        bi.o4 o4Var;
        float x10;
        if (sbVar != null) {
            dc dcVar = new dc(sbVar, 1);
            bi.ib ibVar = sbVar.f3689n0;
            if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null && (o4Var = currentPeerView.f3511c1) != null) {
                bi.gb gbVar = sbVar.f3700s;
                float f7 = 0.0f;
                if (gbVar == null) {
                    x10 = 0.0f;
                } else {
                    x10 = gbVar.getX();
                }
                bi.gb gbVar2 = sbVar.f3700s;
                if (gbVar2 != null) {
                    f7 = gbVar2.getY();
                }
                dcVar.f6957c.set(o4Var.getX() + currentPeerView.getX() + sbVar.X + x10 + sbVar.v.getLeft(), o4Var.getY() + currentPeerView.getY() + sbVar.W + f7 + sbVar.v.getTop(), (((x10 + sbVar.X) + sbVar.v.getRight()) - (sbVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - o4Var.getRight()), (((f7 + sbVar.W) + sbVar.v.getBottom()) - (sbVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - o4Var.getBottom()));
                dcVar.f6955a = 1;
                dcVar.f6956b = AndroidUtilities.dp(8.0f);
                bi.q5 t10 = sbVar.t();
                if (t10 != null) {
                    dcVar.f6958f = t10.f3511c1;
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
