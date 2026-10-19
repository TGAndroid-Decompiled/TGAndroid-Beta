package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class qb {
    public float f9664b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public ci.r3 f9666f;
    public int f9663a = 0;
    public final RectF f9665c = new RectF();

    public static ob b(org.telegram.ui.Cells.e7 e7Var) {
        int i10;
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = e7Var.getImageView();
        ob obVar = new ob(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        obVar.f9665c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        obVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.f22193y);
        obVar.f9664b = Math.max(obVar.f9665c.width(), obVar.f9665c.height()) / 2.0f;
        return obVar;
    }

    public static pb c(ci.q qVar) {
        if (qVar != null) {
            ImageReceiver imageReceiver = qVar.f5743r;
            if (qVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                pb pbVar = new pb(qVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                pbVar.f9665c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                pbVar.e = imageReceiver;
                pbVar.f9664b = Math.max(pbVar.f9665c.width(), pbVar.f9665c.height()) / 2.0f;
                return pbVar;
            }
            return null;
        }
        return null;
    }

    public static ob d(ci.aa aaVar) {
        ci.q4 currentPeerView;
        ci.r3 r3Var;
        float x10;
        if (aaVar != null) {
            ob obVar = new ob(aaVar, 1);
            ci.q9 q9Var = aaVar.f5203n0;
            if (q9Var != null && (currentPeerView = q9Var.getCurrentPeerView()) != null && (r3Var = currentPeerView.f5769c1) != null) {
                ci.o9 o9Var = aaVar.f5214s;
                float f7 = 0.0f;
                if (o9Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = o9Var.getX();
                }
                ci.o9 o9Var2 = aaVar.f5214s;
                if (o9Var2 != null) {
                    f7 = o9Var2.getY();
                }
                obVar.f9665c.set(r3Var.getX() + currentPeerView.getX() + aaVar.X + x10 + aaVar.v.getLeft(), r3Var.getY() + currentPeerView.getY() + aaVar.W + f7 + aaVar.v.getTop(), (((x10 + aaVar.X) + aaVar.v.getRight()) - (aaVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - r3Var.getRight()), (((f7 + aaVar.W) + aaVar.v.getBottom()) - (aaVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - r3Var.getBottom()));
                obVar.f9663a = 1;
                obVar.f9664b = AndroidUtilities.dp(8.0f);
                ci.q4 t10 = aaVar.t();
                if (t10 != null) {
                    obVar.f9666f = t10.f5769c1;
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
