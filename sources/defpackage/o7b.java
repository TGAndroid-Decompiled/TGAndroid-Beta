package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class o7b {
    public float b;
    public vaa d;
    public ImageReceiver e;
    public d28 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static m7b b(waa waaVar) {
        if (waaVar == null) {
            return null;
        }
        be0 imageView = waaVar.getImageView();
        m7b m7bVar = new m7b(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = m7bVar.c;
        rectF.set(i, iArr[1], imageView.getWidth() + i, height);
        m7bVar.d = new vaa(imageView.getContext(), null, false, 2131231619, waaVar.E);
        m7bVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return m7bVar;
    }

    public static n7b c(uf3 uf3Var) {
        if (uf3Var != null) {
            ImageReceiver imageReceiver = uf3Var.r;
            if (uf3Var.getRootView() != null) {
                float f = imageReceiver.N0;
                n7b n7bVar = new n7b(uf3Var, f / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                uf3Var.getRootView().getLocationOnScreen(iArr);
                gl.p1(uf3Var, (ViewGroup) uf3Var.getRootView(), fArr);
                float f2 = iArr[0] + fArr[0] + imageReceiver.L0;
                float f3 = iArr[1] + fArr[1] + imageReceiver.M0;
                RectF rectF = n7bVar.c;
                rectF.set(f2, f3, f2 + f, f + f3);
                n7bVar.e = imageReceiver;
                n7bVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
                return n7bVar;
            }
            return null;
        }
        return null;
    }

    public static m7b d(m8b m8bVar) {
        y28 currentPeerView;
        d28 d28Var;
        float x;
        if (m8bVar != null) {
            m7b m7bVar = new m7b(m8bVar, (byte) 1);
            c8b c8bVar = m8bVar.o0;
            if (c8bVar != null && (currentPeerView = c8bVar.getCurrentPeerView()) != null && (d28Var = currentPeerView.S0) != null) {
                a8b a8bVar = m8bVar.s;
                float f = 0.0f;
                if (a8bVar == null) {
                    x = 0.0f;
                } else {
                    x = a8bVar.getX();
                }
                a8b a8bVar2 = m8bVar.s;
                if (a8bVar2 != null) {
                    f = a8bVar2.getY();
                }
                m7bVar.c.set(d28Var.getX() + currentPeerView.getX() + m8bVar.Y + x + m8bVar.w.getLeft(), d28Var.getY() + currentPeerView.getY() + m8bVar.X + f + m8bVar.w.getTop(), (((x + m8bVar.Y) + m8bVar.w.getRight()) - (m8bVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - d28Var.getRight()), (((f + m8bVar.X) + m8bVar.w.getBottom()) - (m8bVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - d28Var.getBottom()));
                m7bVar.a = true;
                m7bVar.b = gl.L(8.0f);
                y28 w = m8bVar.w();
                if (w != null) {
                    m7bVar.f = w.S0;
                }
                return m7bVar;
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
