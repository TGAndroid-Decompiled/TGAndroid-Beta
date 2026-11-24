package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
public final class lx1 implements ut4 {
    public final byte a;
    public final c b;
    public final FrameLayout c;

    public lx1(c cVar, FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = frameLayout;
    }

    @Override
    public final void b(Canvas canvas) {
        byte b = this.a;
        jq1 jq1Var = null;
        FrameLayout frameLayout = this.c;
        c cVar = this.b;
        cVar.getClass();
        switch (b) {
            case 0:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                frameLayout.getLocationInWindow(iArr);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                cja cjaVar = chatActivityEnterView.c2;
                cjaVar.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                Drawable backgroundImage = cjaVar.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                mu1 mu1Var = chatActivityEnterView.F3;
                if (mu1Var != null) {
                    jq1Var = mu1Var.A0;
                }
                if (jq1Var != null && jq1Var.getWidth() > 0) {
                    canvas.translate(jq1Var.getX(), jq1Var.getY());
                    jq1Var.draw(canvas);
                }
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                frameLayout.getLocationInWindow(iArr3);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                cja cjaVar2 = chatActivityEnterView2.c2;
                cjaVar2.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
                Drawable backgroundImage2 = cjaVar2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                mu1 mu1Var2 = chatActivityEnterView2.F3;
                if (mu1Var2 != null) {
                    jq1Var = mu1Var2.A0;
                }
                if (jq1Var != null && jq1Var.getWidth() > 0) {
                    canvas.translate(jq1Var.getX(), jq1Var.getY());
                    jq1Var.draw(canvas);
                }
                canvas.restore();
                return;
        }
    }
}
