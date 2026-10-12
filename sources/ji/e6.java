package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ub0;
public final class e6 extends CharacterStyle {
    public final int f13255a;
    public final Object f13256b;

    public e6(int i10, FrameLayout frameLayout) {
        this.f13255a = i10;
        this.f13256b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f13255a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.m1(0.4f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, ((i6) this.f13256b).f13334a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.g6.f20084n6;
                ((ub0) this.f13256b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.m1(0.4f, ((tj0) this.f13256b).I)));
                return;
        }
    }

    public e6(tj0 tj0Var) {
        this.f13255a = 2;
        this.f13256b = tj0Var;
    }
}
