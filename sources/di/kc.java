package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class kc {
    public float f7511b;
    public org.telegram.ui.Cells.e7 d;
    public ImageReceiver f7513e;
    public bi.l4 f7514f;
    public int f7510a = 0;
    public final RectF f7512c = new RectF();

    public static ic b(org.telegram.ui.Cells.f7 f7Var) {
        int i10;
        if (f7Var == null) {
            return null;
        }
        org.telegram.ui.Components.x9 imageView = f7Var.getImageView();
        ic icVar = new ic(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        icVar.f7512c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        icVar.d = new org.telegram.ui.Cells.e7(imageView.getContext(), null, false, f7Var.f21967y);
        icVar.f7511b = Math.max(icVar.f7512c.width(), icVar.f7512c.height()) / 2.0f;
        return icVar;
    }

    public static jc c(bi.u uVar) {
        if (uVar != null) {
            ImageReceiver imageReceiver = uVar.f3802r;
            if (uVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                jc jcVar = new jc(uVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                uVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(uVar, (ViewGroup) uVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                jcVar.f7512c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                jcVar.f7513e = imageReceiver;
                jcVar.f7511b = Math.max(jcVar.f7512c.width(), jcVar.f7512c.height()) / 2.0f;
                return jcVar;
            }
            return null;
        }
        return null;
    }

    public static ic d(bi.pb pbVar) {
        bi.o5 currentPeerView;
        bi.l4 l4Var;
        float x10;
        if (pbVar != null) {
            ic icVar = new ic(pbVar, 1);
            bi.fb fbVar = pbVar.f3588n0;
            if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null && (l4Var = currentPeerView.f3436c1) != null) {
                bi.db dbVar = pbVar.f3599s;
                float f7 = 0.0f;
                if (dbVar == null) {
                    x10 = 0.0f;
                } else {
                    x10 = dbVar.getX();
                }
                bi.db dbVar2 = pbVar.f3599s;
                if (dbVar2 != null) {
                    f7 = dbVar2.getY();
                }
                icVar.f7512c.set(l4Var.getX() + currentPeerView.getX() + pbVar.X + x10 + pbVar.v.getLeft(), l4Var.getY() + currentPeerView.getY() + pbVar.W + f7 + pbVar.v.getTop(), (((x10 + pbVar.X) + pbVar.v.getRight()) - (pbVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - l4Var.getRight()), (((f7 + pbVar.W) + pbVar.v.getBottom()) - (pbVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - l4Var.getBottom()));
                icVar.f7510a = 1;
                icVar.f7511b = AndroidUtilities.dp(8.0f);
                bi.o5 t10 = pbVar.t();
                if (t10 != null) {
                    icVar.f7514f = t10.f3436c1;
                }
                return icVar;
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
