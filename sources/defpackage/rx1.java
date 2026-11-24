package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rx1 extends d02 {
    public final ChatActivityEnterView G;

    public rx1(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.G2;
        float[] fArr = chatActivityEnterView.G6;
        float[] fArr2 = chatActivityEnterView.F6;
        int i = ChatActivityEnterView.z7;
        if (chatActivityEnterView.n0()) {
            if (chatActivityEnterView.E6 == null) {
                p09 p09Var = new p09(2131623977, gm.L(28.0f), gm.L(28.0f), false, null);
                chatActivityEnterView.E6 = p09Var;
                p09Var.E(true);
                chatActivityEnterView.E6.p0 = false;
                int F0 = chatActivityEnterView.F0(cmb.Uf);
                p09 p09Var2 = chatActivityEnterView.E6;
                p09Var2.a0 = true;
                p09Var2.L(F0, "Cup Grey");
                chatActivityEnterView.E6.L(F0, "Box_Grey 2");
                chatActivityEnterView.E6.L(F0, "Box Grey");
                chatActivityEnterView.E6.j();
                chatActivityEnterView.E6.M(this);
                chatActivityEnterView.E6.O(true, 0.0f);
            }
            p09 p09Var3 = chatActivityEnterView.E6;
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float f2 = 1.0f;
            if (getScaleX() != 0.0f) {
                f = getScaleX();
            } else {
                f = 1.0f;
            }
            if (getScaleY() != 0.0f) {
                f2 = getScaleY();
            }
            if (chatActivityEnterView.h0(chatActivityEnterView.b2, fArr2) && chatActivityEnterView.h0(this, fArr)) {
                width = aq1.z(fArr2[0], fArr[0], f, width);
            }
            float L = gm.L(14.0f) / f;
            float L2 = gm.L(14.0f) / f2;
            p09Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
            p09Var3.draw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f2 != null && !chatActivityEnterView.X0 && !this.x && !hs6.d0(chatActivityEnterView.R).v0[0].isEmpty() && paint != null) {
            canvas.drawCircle(gm.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - gm.L(8.0f), gm.L(5.0f), paint);
        }
    }
}
