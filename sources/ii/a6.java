package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.fb0;
public final class a6 extends CharacterStyle {
    public final int f11230a;
    public final Object f11231b;

    public a6(int i10, FrameLayout frameLayout) {
        this.f11230a = i10;
        this.f11231b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11230a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, ((e6) this.f11231b).f11346a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.h6.f19243n6;
                ((fb0) this.f11231b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, ((dj0) this.f11231b).I)));
                return;
        }
    }

    public a6(dj0 dj0Var) {
        this.f11230a = 2;
        this.f11231b = dj0Var;
    }
}
