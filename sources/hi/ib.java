package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class ib {
    public float f14709b;
    public org.telegram.ui.Cells.c7 d;
    public ImageReceiver f14711e;
    public fi.c3 f14712f;
    public int f14708a = 0;
    public final RectF f14710c = new RectF();

    public static gb b(org.telegram.ui.Cells.d7 d7Var) {
        if (d7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = d7Var.getImageView();
        gb gbVar = new gb(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = gbVar.f14710c;
        rectF.set(i7, iArr[1], imageView.getWidth() + i7, height);
        gbVar.d = new org.telegram.ui.Cells.c7(imageView.getContext(), null, false, 2131231619, d7Var.E);
        gbVar.f14709b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return gbVar;
    }

    public static hb c(fi.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f12368r;
            if (pVar.getRootView() != null) {
                float f10 = imageReceiver.N0;
                hb hbVar = new hb(pVar, f10 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float f11 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f12 = iArr[1] + fArr[1] + imageReceiver.M0;
                hbVar.f14710c.set(f11, f12, f11 + f10, f10 + f12);
                hbVar.f14711e = imageReceiver;
                hbVar.f14709b = Math.max(hbVar.f14710c.width(), hbVar.f14710c.height()) / 2.0f;
                return hbVar;
            }
            return null;
        }
        return null;
    }

    public static gb d(fi.f9 f9Var) {
        fi.z3 currentPeerView;
        fi.c3 c3Var;
        float x10;
        if (f9Var != null) {
            gb gbVar = new gb(f9Var, 1);
            fi.v8 v8Var = f9Var.f11989o0;
            if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null && (c3Var = currentPeerView.M0) != null) {
                fi.t8 t8Var = f9Var.f11998s;
                float f10 = 0.0f;
                if (t8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = t8Var.getX();
                }
                fi.t8 t8Var2 = f9Var.f11998s;
                if (t8Var2 != null) {
                    f10 = t8Var2.getY();
                }
                gbVar.f14710c.set(c3Var.getX() + currentPeerView.getX() + f9Var.Y + x10 + f9Var.f12007w.getLeft(), c3Var.getY() + currentPeerView.getY() + f9Var.X + f10 + f9Var.f12007w.getTop(), (((x10 + f9Var.Y) + f9Var.f12007w.getRight()) - (f9Var.f12007w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - c3Var.getRight()), (((f10 + f9Var.X) + f9Var.f12007w.getBottom()) - (f9Var.f12007w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - c3Var.getBottom()));
                gbVar.f14708a = 1;
                gbVar.f14709b = org.telegram.messenger.g0.L(8.0f);
                fi.z3 z10 = f9Var.z();
                if (z10 != null) {
                    gbVar.f14712f = z10.M0;
                }
                return gbVar;
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
