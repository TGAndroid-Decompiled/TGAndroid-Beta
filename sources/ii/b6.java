package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.hb0;
public final class b6 extends CharacterStyle {
    public final int f12243a;
    public final Object f12244b;

    public b6(int i10, FrameLayout frameLayout) {
        this.f12243a = i10;
        this.f12244b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12243a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, ((f6) this.f12244b).f12367a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.i6.f21003n6;
                ((hb0) this.f12244b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.4f, ((fj0) this.f12244b).I)));
                return;
        }
    }

    public b6(fj0 fj0Var) {
        this.f12243a = 2;
        this.f12244b = fj0Var;
    }
}
