package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
public final class ay1 implements yv4 {
    public final byte a;
    public final c b;
    public final FrameLayout c;

    public ay1(c cVar, FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = frameLayout;
    }

    @Override
    public final void a(Canvas canvas) {
        byte b = this.a;
        wq1 wq1Var = null;
        FrameLayout frameLayout = this.c;
        c cVar = this.b;
        cVar.getClass();
        switch (b) {
            case 0:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                frameLayout.getLocationInWindow(iArr);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                wma wmaVar = chatActivityEnterView.b2;
                wmaVar.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                Drawable backgroundImage = wmaVar.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                zu1 zu1Var = chatActivityEnterView.E3;
                if (zu1Var != null) {
                    wq1Var = zu1Var.A0;
                }
                if (wq1Var != null && wq1Var.getWidth() > 0) {
                    canvas.translate(wq1Var.getX(), wq1Var.getY());
                    wq1Var.draw(canvas);
                }
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                frameLayout.getLocationInWindow(iArr3);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                wma wmaVar2 = chatActivityEnterView2.b2;
                wmaVar2.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
                Drawable backgroundImage2 = wmaVar2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                zu1 zu1Var2 = chatActivityEnterView2.E3;
                if (zu1Var2 != null) {
                    wq1Var = zu1Var2.A0;
                }
                if (wq1Var != null && wq1Var.getWidth() > 0) {
                    canvas.translate(wq1Var.getX(), wq1Var.getY());
                    wq1Var.draw(canvas);
                }
                canvas.restore();
                return;
        }
    }
}
