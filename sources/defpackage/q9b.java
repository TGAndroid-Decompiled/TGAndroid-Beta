package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class q9b {
    public float b;
    public vca d;
    public ImageReceiver e;
    public g48 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static o9b b(wca wcaVar) {
        if (wcaVar == null) {
            return null;
        }
        bf0 imageView = wcaVar.getImageView();
        o9b o9bVar = new o9b(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = o9bVar.c;
        rectF.set(i, iArr[1], imageView.getWidth() + i, height);
        o9bVar.d = new vca(imageView.getContext(), null, false, 2131231620, wcaVar.E);
        o9bVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return o9bVar;
    }

    public static p9b c(hh3 hh3Var) {
        if (hh3Var != null) {
            ImageReceiver imageReceiver = hh3Var.r;
            if (hh3Var.getRootView() != null) {
                float f = imageReceiver.N0;
                p9b p9bVar = new p9b(hh3Var, f / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                hh3Var.getRootView().getLocationOnScreen(iArr);
                gm.p1(hh3Var, (ViewGroup) hh3Var.getRootView(), fArr);
                float f2 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f3 = iArr[1] + fArr[1] + imageReceiver.M0;
                RectF rectF = p9bVar.c;
                rectF.set(f2, f3, f2 + f, f + f3);
                p9bVar.e = imageReceiver;
                p9bVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
                return p9bVar;
            }
            return null;
        }
        return null;
    }

    public static o9b d(oab oabVar) {
        a58 currentPeerView;
        g48 g48Var;
        float x;
        if (oabVar != null) {
            o9b o9bVar = new o9b(oabVar, (byte) 1);
            eab eabVar = oabVar.o0;
            if (eabVar != null && (currentPeerView = eabVar.getCurrentPeerView()) != null && (g48Var = currentPeerView.S0) != null) {
                cab cabVar = oabVar.s;
                float f = 0.0f;
                if (cabVar == null) {
                    x = 0.0f;
                } else {
                    x = cabVar.getX();
                }
                cab cabVar2 = oabVar.s;
                if (cabVar2 != null) {
                    f = cabVar2.getY();
                }
                o9bVar.c.set(g48Var.getX() + currentPeerView.getX() + oabVar.Y + x + oabVar.w.getLeft(), g48Var.getY() + currentPeerView.getY() + oabVar.X + f + oabVar.w.getTop(), (((x + oabVar.Y) + oabVar.w.getRight()) - (oabVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - g48Var.getRight()), (((f + oabVar.X) + oabVar.w.getBottom()) - (oabVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - g48Var.getBottom()));
                o9bVar.a = true;
                o9bVar.b = gm.L(8.0f);
                a58 w = oabVar.w();
                if (w != null) {
                    o9bVar.f = w.S0;
                }
                return o9bVar;
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
