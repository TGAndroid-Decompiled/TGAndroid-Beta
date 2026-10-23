package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class qb {
    public float f9680b;
    public org.telegram.ui.Cells.f7 d;
    public ImageReceiver e;
    public ci.q3 f9682f;
    public int f9679a = 0;
    public final RectF f9681c = new RectF();

    public static ob b(org.telegram.ui.Cells.g7 g7Var) {
        int i10;
        if (g7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = g7Var.getImageView();
        ob obVar = new ob(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        obVar.f9681c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        obVar.d = new org.telegram.ui.Cells.f7(imageView.getContext(), null, false, g7Var.f22424y);
        obVar.f9680b = Math.max(obVar.f9681c.width(), obVar.f9681c.height()) / 2.0f;
        return obVar;
    }

    public static pb c(ci.q qVar) {
        if (qVar != null) {
            ImageReceiver imageReceiver = qVar.f5760r;
            if (qVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                pb pbVar = new pb(qVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                pbVar.f9681c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                pbVar.e = imageReceiver;
                pbVar.f9680b = Math.max(pbVar.f9681c.width(), pbVar.f9681c.height()) / 2.0f;
                return pbVar;
            }
            return null;
        }
        return null;
    }

    public static ob d(ci.z9 z9Var) {
        ci.p4 currentPeerView;
        ci.q3 q3Var;
        float x10;
        if (z9Var != null) {
            ob obVar = new ob(z9Var, 1);
            ci.p9 p9Var = z9Var.f6249n0;
            if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null && (q3Var = currentPeerView.f5656c1) != null) {
                ci.n9 n9Var = z9Var.f6260s;
                float f7 = 0.0f;
                if (n9Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = n9Var.getX();
                }
                ci.n9 n9Var2 = z9Var.f6260s;
                if (n9Var2 != null) {
                    f7 = n9Var2.getY();
                }
                obVar.f9681c.set(q3Var.getX() + currentPeerView.getX() + z9Var.X + x10 + z9Var.v.getLeft(), q3Var.getY() + currentPeerView.getY() + z9Var.W + f7 + z9Var.v.getTop(), (((x10 + z9Var.X) + z9Var.v.getRight()) - (z9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - q3Var.getRight()), (((f7 + z9Var.W) + z9Var.v.getBottom()) - (z9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - q3Var.getBottom()));
                obVar.f9679a = 1;
                obVar.f9680b = AndroidUtilities.dp(8.0f);
                ci.p4 t10 = z9Var.t();
                if (t10 != null) {
                    obVar.f9682f = t10.f5656c1;
                }
                return obVar;
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
