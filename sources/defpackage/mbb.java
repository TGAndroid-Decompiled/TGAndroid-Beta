package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class mbb {
    public float b;
    public mea d;
    public ImageReceiver e;
    public t58 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static kbb b(nea neaVar) {
        if (neaVar == null) {
            return null;
        }
        de0 imageView = neaVar.getImageView();
        kbb kbbVar = new kbb(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = kbbVar.c;
        rectF.set(i, iArr[1], imageView.getWidth() + i, height);
        kbbVar.d = new mea(imageView.getContext(), null, false, 2131231619, neaVar.E);
        kbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return kbbVar;
    }

    public static lbb c(og3 og3Var) {
        if (og3Var != null) {
            ImageReceiver imageReceiver = og3Var.r;
            if (og3Var.getRootView() != null) {
                float f = imageReceiver.N0;
                lbb lbbVar = new lbb(og3Var, f / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                og3Var.getRootView().getLocationOnScreen(iArr);
                hl.p1(og3Var, (ViewGroup) og3Var.getRootView(), fArr);
                float f2 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f3 = iArr[1] + fArr[1] + imageReceiver.M0;
                RectF rectF = lbbVar.c;
                rectF.set(f2, f3, f2 + f, f + f3);
                lbbVar.e = imageReceiver;
                lbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
                return lbbVar;
            }
            return null;
        }
        return null;
    }

    public static kbb d(lcb lcbVar) {
        o68 currentPeerView;
        t58 t58Var;
        float x;
        if (lcbVar != null) {
            kbb kbbVar = new kbb(lcbVar, (byte) 1);
            acb acbVar = lcbVar.o0;
            if (acbVar != null && (currentPeerView = acbVar.getCurrentPeerView()) != null && (t58Var = currentPeerView.M0) != null) {
                ybb ybbVar = lcbVar.s;
                float f = 0.0f;
                if (ybbVar == null) {
                    x = 0.0f;
                } else {
                    x = ybbVar.getX();
                }
                ybb ybbVar2 = lcbVar.s;
                if (ybbVar2 != null) {
                    f = ybbVar2.getY();
                }
                kbbVar.c.set(t58Var.getX() + currentPeerView.getX() + lcbVar.Y + x + lcbVar.w.getLeft(), t58Var.getY() + currentPeerView.getY() + lcbVar.X + f + lcbVar.w.getTop(), (((x + lcbVar.Y) + lcbVar.w.getRight()) - (lcbVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - t58Var.getRight()), (((f + lcbVar.X) + lcbVar.w.getBottom()) - (lcbVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - t58Var.getBottom()));
                kbbVar.a = true;
                kbbVar.b = hl.L(8.0f);
                o68 w = lcbVar.w();
                if (w != null) {
                    kbbVar.f = w.M0;
                }
                return kbbVar;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z);

    public void a(Canvas canvas, float f) {
    }
}
