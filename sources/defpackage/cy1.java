package defpackage;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cy1 extends ImageView {
    public float a;
    public final ChatActivityEnterView b;

    public cy1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.a;
    }

    @Override
    public final void setTranslationX(float f) {
        float f2;
        float alpha;
        this.a = f;
        float f3 = -44.0f;
        float L = gm.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f4 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        tx1 tx1Var = chatActivityEnterView.A2;
        float f5 = 0.0f;
        if (tx1Var != null && tx1Var.getVisibility() == 0) {
            f2 = -44.0f;
        } else {
            f2 = 0.0f;
        }
        float L2 = gm.L(f2);
        tx1 tx1Var2 = chatActivityEnterView.A2;
        if (tx1Var2 == null) {
            alpha = 0.0f;
        } else {
            alpha = tx1Var2.getAlpha();
        }
        float f6 = (L2 * alpha) + f4;
        tx1 tx1Var3 = chatActivityEnterView.n2;
        if (tx1Var3 == null || tx1Var3.getVisibility() != 0) {
            f3 = 0.0f;
        }
        float L3 = gm.L(f3);
        tx1 tx1Var4 = chatActivityEnterView.n2;
        if (tx1Var4 != null) {
            f5 = tx1Var4.getAlpha();
        }
        super.setTranslationX((L3 * f5) + f6);
    }
}
