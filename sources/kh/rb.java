package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class rb {
    public float f15973b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver f15975e;
    public ih.l3 f15976f;
    public int f15972a = 0;
    public final RectF f15974c = new RectF();

    public static pb b(org.telegram.ui.Cells.e7 e7Var) {
        int i9;
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.o9 imageView = e7Var.getImageView();
        pb pbVar = new pb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        pbVar.f15974c.set(iArr[0], iArr[1], imageView.getWidth() + i9, imageView.getHeight() + iArr[1]);
        pbVar.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.f24318y);
        pbVar.f15973b = Math.max(pbVar.f15974c.width(), pbVar.f15974c.height()) / 2.0f;
        return pbVar;
    }

    public static qb c(ih.q qVar) {
        if (qVar != null) {
            ImageReceiver imageReceiver = qVar.f11985r;
            if (qVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                qb qbVar = new qb(qVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(qVar, (ViewGroup) qVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                qbVar.f15974c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                qbVar.f15975e = imageReceiver;
                qbVar.f15973b = Math.max(qbVar.f15974c.width(), qbVar.f15974c.height()) / 2.0f;
                return qbVar;
            }
            return null;
        }
        return null;
    }

    public static pb d(ih.m9 m9Var) {
        ih.i4 currentPeerView;
        ih.l3 l3Var;
        float x10;
        if (m9Var != null) {
            pb pbVar = new pb(m9Var, 1);
            ih.c9 c9Var = m9Var.f11806j0;
            if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null && (l3Var = currentPeerView.Y0) != null) {
                ih.a9 a9Var = m9Var.f11824s;
                float f10 = 0.0f;
                if (a9Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = a9Var.getX();
                }
                ih.a9 a9Var2 = m9Var.f11824s;
                if (a9Var2 != null) {
                    f10 = a9Var2.getY();
                }
                pbVar.f15974c.set(l3Var.getX() + currentPeerView.getX() + m9Var.T + x10 + m9Var.v.getLeft(), l3Var.getY() + currentPeerView.getY() + m9Var.S + f10 + m9Var.v.getTop(), (((x10 + m9Var.T) + m9Var.v.getRight()) - (m9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - l3Var.getRight()), (((f10 + m9Var.S) + m9Var.v.getBottom()) - (m9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - l3Var.getBottom()));
                pbVar.f15972a = 1;
                pbVar.f15973b = AndroidUtilities.dp(8.0f);
                ih.i4 t10 = m9Var.t();
                if (t10 != null) {
                    pbVar.f15976f = t10.Y0;
                }
                return pbVar;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f10) {
    }
}
