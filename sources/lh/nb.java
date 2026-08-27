package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public abstract class nb {

    public float f16455b;
    public org.telegram.ui.Cells.a7 d;

    public ImageReceiver f16457e;

    public jh.j3 f16458f;

    public int f16454a = 0;

    public final RectF f16456c = new RectF();

    public static lb b(org.telegram.ui.Cells.b7 b7Var) {
        if (b7Var == null) {
            return null;
        }
        org.telegram.ui.Components.n9 imageView = b7Var.getImageView();
        lb lbVar = new lb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        lbVar.f16456c.set(i10, iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        lbVar.d = new org.telegram.ui.Cells.a7(imageView.getContext(), null, false, b7Var.f24125y);
        lbVar.f16455b = Math.max(lbVar.f16456c.width(), lbVar.f16456c.height()) / 2.0f;
        return lbVar;
    }

    public static mb c(jh.o oVar) {
        if (oVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = oVar.f13726r;
        if (oVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        mb mbVar = new mb(oVar, imageWidth / 2.0f);
        int[] iArr = new int[2];
        float[] fArr = new float[2];
        oVar.getRootView().getLocationOnScreen(iArr);
        AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
        mbVar.f16456c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        mbVar.f16457e = imageReceiver;
        mbVar.f16455b = Math.max(mbVar.f16456c.width(), mbVar.f16456c.height()) / 2.0f;
        return mbVar;
    }

    public static lb d(jh.i9 i9Var) {
        jh.e4 currentPeerView;
        jh.j3 j3Var;
        if (i9Var == null) {
            return null;
        }
        lb lbVar = new lb(i9Var, 1);
        jh.y8 y8Var = i9Var.f13487j0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (j3Var = currentPeerView.Y0) == null) {
            return null;
        }
        jh.w8 w8Var = i9Var.f13505s;
        float x8 = w8Var == null ? 0.0f : w8Var.getX();
        jh.w8 w8Var2 = i9Var.f13505s;
        float y10 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        lbVar.f16456c.set(j3Var.getX() + currentPeerView.getX() + i9Var.T + x8 + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.S + y10 + i9Var.v.getTop(), (((x8 + i9Var.T) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((y10 + i9Var.S) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
        lbVar.f16454a = 1;
        lbVar.f16455b = AndroidUtilities.dp(8.0f);
        jh.e4 e4VarT = i9Var.t();
        if (e4VarT != null) {
            lbVar.f16458f = e4VarT.Y0;
        }
        return lbVar;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
