package defpackage;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cx1 extends ImageView {
    public float a;
    public final ChatActivityEnterView b;

    public cx1(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        float L = hl.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f4 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        vw1 vw1Var = chatActivityEnterView.z2;
        float f5 = 0.0f;
        if (vw1Var != null && vw1Var.getVisibility() == 0) {
            f2 = -44.0f;
        } else {
            f2 = 0.0f;
        }
        float L2 = hl.L(f2);
        vw1 vw1Var2 = chatActivityEnterView.z2;
        if (vw1Var2 == null) {
            alpha = 0.0f;
        } else {
            alpha = vw1Var2.getAlpha();
        }
        float f6 = (L2 * alpha) + f4;
        vw1 vw1Var3 = chatActivityEnterView.m2;
        if (vw1Var3 == null || vw1Var3.getVisibility() != 0) {
            f3 = 0.0f;
        }
        float L3 = hl.L(f3);
        vw1 vw1Var4 = chatActivityEnterView.m2;
        if (vw1Var4 != null) {
            f5 = vw1Var4.getAlpha();
        }
        super.setTranslationX((L3 * f5) + f6);
    }
}
