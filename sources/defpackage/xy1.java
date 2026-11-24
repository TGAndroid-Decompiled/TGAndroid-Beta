package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
public final class xy1 implements wv4 {
    public final byte a;
    public final c b;
    public final FrameLayout c;

    public xy1(c cVar, FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = frameLayout;
    }

    @Override
    public final void b(Canvas canvas) {
        byte b = this.a;
        vr1 vr1Var = null;
        FrameLayout frameLayout = this.c;
        c cVar = this.b;
        cVar.getClass();
        switch (b) {
            case 0:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                frameLayout.getLocationInWindow(iArr);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                ela elaVar = chatActivityEnterView.c2;
                elaVar.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                Drawable backgroundImage = elaVar.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                yv1 yv1Var = chatActivityEnterView.F3;
                if (yv1Var != null) {
                    vr1Var = yv1Var.A0;
                }
                if (vr1Var != null && vr1Var.getWidth() > 0) {
                    canvas.translate(vr1Var.getX(), vr1Var.getY());
                    vr1Var.draw(canvas);
                }
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                frameLayout.getLocationInWindow(iArr3);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                ela elaVar2 = chatActivityEnterView2.c2;
                elaVar2.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
                Drawable backgroundImage2 = elaVar2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                yv1 yv1Var2 = chatActivityEnterView2.F3;
                if (yv1Var2 != null) {
                    vr1Var = yv1Var2.A0;
                }
                if (vr1Var != null && vr1Var.getWidth() > 0) {
                    canvas.translate(vr1Var.getX(), vr1Var.getY());
                    vr1Var.draw(canvas);
                }
                canvas.restore();
                return;
        }
    }
}
