package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ib0;
public final class a6 extends CharacterStyle {
    public final int f11244a;
    public final Object f11245b;

    public a6(int i10, FrameLayout frameLayout) {
        this.f11244a = i10;
        this.f11245b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11244a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, ((e6) this.f11245b).f11360a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.h6.f19260n6;
                ((ib0) this.f11245b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, ((gj0) this.f11245b).I)));
                return;
        }
    }

    public a6(gj0 gj0Var) {
        this.f11244a = 2;
        this.f11245b = gj0Var;
    }
}
