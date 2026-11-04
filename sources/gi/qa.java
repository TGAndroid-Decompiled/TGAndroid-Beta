package gi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class qa {
    public float f13453b;
    public org.telegram.ui.Cells.b7 d;
    public ImageReceiver f13455e;
    public ei.m3 f13456f;
    public int f13452a = 0;
    public final RectF f13454c = new RectF();

    public static oa b(org.telegram.ui.Cells.c7 c7Var) {
        if (c7Var == null) {
            return null;
        }
        org.telegram.ui.Components.k9 imageView = c7Var.getImageView();
        oa oaVar = new oa(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = oaVar.f13454c;
        rectF.set(i3, iArr[1], imageView.getWidth() + i3, height);
        oaVar.d = new org.telegram.ui.Cells.b7(imageView.getContext(), null, false, 2131231615, c7Var.E);
        oaVar.f13453b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return oaVar;
    }

    public static pa c(ei.q qVar) {
        if (qVar != null) {
            ImageReceiver imageReceiver = qVar.f10789r;
            if (qVar.getRootView() != null) {
                float f10 = imageReceiver.N0;
                pa paVar = new pa(qVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(qVar, (ViewGroup) qVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.M0;
                paVar.f13454c.set(f11, f12, f11 + f10, f10 + f12);
                paVar.f13455e = imageReceiver;
                paVar.f13453b = Math.max(paVar.f13454c.width(), paVar.f13454c.height()) / 2.0f;
                return paVar;
            }
            return null;
        }
        return null;
    }

    public static oa d(ei.r9 r9Var) {
        ei.j4 currentPeerView;
        ei.m3 m3Var;
        float x10;
        if (r9Var != null) {
            oa oaVar = new oa(r9Var, 1);
            ei.g9 g9Var = r9Var.f10939o0;
            if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null && (m3Var = currentPeerView.M0) != null) {
                ei.e9 e9Var = r9Var.f10948s;
                float f10 = 0.0f;
                if (e9Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = e9Var.getX();
                }
                ei.e9 e9Var2 = r9Var.f10948s;
                if (e9Var2 != null) {
                    f10 = e9Var2.getY();
                }
                oaVar.f13454c.set(m3Var.getX() + currentPeerView.getX() + r9Var.Y + x10 + r9Var.f10957w.getLeft(), m3Var.getY() + currentPeerView.getY() + r9Var.X + f10 + r9Var.f10957w.getTop(), (((x10 + r9Var.Y) + r9Var.f10957w.getRight()) - (r9Var.f10957w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - m3Var.getRight()), (((f10 + r9Var.X) + r9Var.f10957w.getBottom()) - (r9Var.f10957w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - m3Var.getBottom()));
                oaVar.f13452a = 1;
                oaVar.f13453b = org.telegram.messenger.g0.L(8.0f);
                ei.j4 H = r9Var.H();
                if (H != null) {
                    oaVar.f13456f = H.M0;
                }
                return oaVar;
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
