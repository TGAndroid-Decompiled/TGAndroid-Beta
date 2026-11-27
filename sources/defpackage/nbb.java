package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class nbb {
    public float b;
    public mea d;
    public ImageReceiver e;
    public u58 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static lbb b(nea neaVar) {
        if (neaVar == null) {
            return null;
        }
        de0 imageView = neaVar.getImageView();
        lbb lbbVar = new lbb(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = lbbVar.c;
        rectF.set(i, iArr[1], imageView.getWidth() + i, height);
        lbbVar.d = new mea(imageView.getContext(), null, false, 2131231619, neaVar.E);
        lbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return lbbVar;
    }

    public static mbb c(og3 og3Var) {
        if (og3Var != null) {
            ImageReceiver imageReceiver = og3Var.r;
            if (og3Var.getRootView() != null) {
                float f = imageReceiver.N0;
                mbb mbbVar = new mbb(og3Var, f / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                og3Var.getRootView().getLocationOnScreen(iArr);
                hl.p1(og3Var, (ViewGroup) og3Var.getRootView(), fArr);
                float f2 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f3 = iArr[1] + fArr[1] + imageReceiver.M0;
                RectF rectF = mbbVar.c;
                rectF.set(f2, f3, f2 + f, f + f3);
                mbbVar.e = imageReceiver;
                mbbVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
                return mbbVar;
            }
            return null;
        }
        return null;
    }

    public static lbb d(lcb lcbVar) {
        o68 currentPeerView;
        u58 u58Var;
        float x;
        if (lcbVar != null) {
            lbb lbbVar = new lbb(lcbVar, (byte) 1);
            bcb bcbVar = lcbVar.o0;
            if (bcbVar != null && (currentPeerView = bcbVar.getCurrentPeerView()) != null && (u58Var = currentPeerView.M0) != null) {
                zbb zbbVar = lcbVar.s;
                float f = 0.0f;
                if (zbbVar == null) {
                    x = 0.0f;
                } else {
                    x = zbbVar.getX();
                }
                zbb zbbVar2 = lcbVar.s;
                if (zbbVar2 != null) {
                    f = zbbVar2.getY();
                }
                lbbVar.c.set(u58Var.getX() + currentPeerView.getX() + lcbVar.Y + x + lcbVar.w.getLeft(), u58Var.getY() + currentPeerView.getY() + lcbVar.X + f + lcbVar.w.getTop(), (((x + lcbVar.Y) + lcbVar.w.getRight()) - (lcbVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - u58Var.getRight()), (((f + lcbVar.X) + lcbVar.w.getBottom()) - (lcbVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - u58Var.getBottom()));
                lbbVar.a = true;
                lbbVar.b = hl.L(8.0f);
                o68 w = lcbVar.w();
                if (w != null) {
                    lbbVar.f = w.M0;
                }
                return lbbVar;
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
