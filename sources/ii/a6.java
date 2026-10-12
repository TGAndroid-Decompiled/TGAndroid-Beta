package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.zb0;
public final class a6 extends CharacterStyle {
    public final int f12274a;
    public final Object f12275b;

    public a6(int i10, FrameLayout frameLayout) {
        this.f12274a = i10;
        this.f12275b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12274a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, ((e6) this.f12275b).f12400a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.h6.f20744n6;
                ((zb0) this.f12275b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.m1(0.4f, ((ak0) this.f12275b).I)));
                return;
        }
    }

    public a6(ak0 ak0Var) {
        this.f12274a = 2;
        this.f12275b = ak0Var;
    }
}
