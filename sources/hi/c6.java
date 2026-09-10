package hi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.db0;
public final class c6 extends CharacterStyle {
    public final int f9504a;
    public final Object f9505b;

    public c6(int i10, FrameLayout frameLayout) {
        this.f9504a = i10;
        this.f9505b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9504a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, ((g6) this.f9505b).f9618a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.j6.f18110n6;
                ((db0) this.f9505b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, ((cj0) this.f9505b).I)));
                return;
        }
    }

    public c6(cj0 cj0Var) {
        this.f9504a = 2;
        this.f9505b = cj0Var;
    }
}
