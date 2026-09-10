package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class xd {
    public float f3943b;
    public org.telegram.ui.Cells.g7 d;
    public ImageReceiver e;
    public zh.h2 f3945f;
    public int f3942a = 0;
    public final RectF f3944c = new RectF();

    public static ud b(org.telegram.ui.Cells.h7 h7Var) {
        int i10;
        if (h7Var == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = h7Var.getImageView();
        ud udVar = new ud(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        udVar.f3944c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        udVar.d = new org.telegram.ui.Cells.g7(imageView.getContext(), null, false, h7Var.f19275y);
        udVar.f3943b = Math.max(udVar.f3944c.width(), udVar.f3944c.height()) / 2.0f;
        return udVar;
    }

    public static wd c(zh.k kVar) {
        if (kVar != null) {
            ImageReceiver imageReceiver = kVar.f48570r;
            if (kVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                wd wdVar = new wd(kVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                kVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(kVar, (ViewGroup) kVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                wdVar.f3944c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                wdVar.e = imageReceiver;
                wdVar.f3943b = Math.max(wdVar.f3944c.width(), wdVar.f3944c.height()) / 2.0f;
                return wdVar;
            }
            return null;
        }
        return null;
    }

    public static ud d(zh.u7 u7Var) {
        zh.a3 currentPeerView;
        zh.h2 h2Var;
        float x10;
        if (u7Var != null) {
            ud udVar = new ud(u7Var, 1);
            zh.k7 k7Var = u7Var.f48947n0;
            if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null && (h2Var = currentPeerView.f48160c1) != null) {
                zh.i7 i7Var = u7Var.f48958s;
                float f7 = 0.0f;
                if (i7Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = i7Var.getX();
                }
                zh.i7 i7Var2 = u7Var.f48958s;
                if (i7Var2 != null) {
                    f7 = i7Var2.getY();
                }
                udVar.f3944c.set(h2Var.getX() + currentPeerView.getX() + u7Var.X + x10 + u7Var.v.getLeft(), h2Var.getY() + currentPeerView.getY() + u7Var.W + f7 + u7Var.v.getTop(), (((x10 + u7Var.X) + u7Var.v.getRight()) - (u7Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - h2Var.getRight()), (((f7 + u7Var.W) + u7Var.v.getBottom()) - (u7Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - h2Var.getBottom()));
                udVar.f3942a = 1;
                udVar.f3943b = AndroidUtilities.dp(8.0f);
                zh.a3 t10 = u7Var.t();
                if (t10 != null) {
                    udVar.f3945f = t10.f48160c1;
                }
                return udVar;
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
