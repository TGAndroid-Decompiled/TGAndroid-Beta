package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.ta0;
public final class z5 extends CharacterStyle {
    public final int f11802a;
    public final Object f11803b;

    public z5(int i10, FrameLayout frameLayout) {
        this.f11802a = i10;
        this.f11803b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11802a) {
            case 0:
                textPaint.setColor(i6.v(i6.l1(0.55f, textPaint.getColor()), i6.l1(0.4f, i6.v0(i6.Oh, ((d6) this.f11803b).f11334a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = i6.f19021n6;
                ((ta0) this.f11803b).getClass();
                textPaint.setColor(i6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(i6.v(i6.l1(0.55f, textPaint.getColor()), i6.l1(0.4f, ((si0) this.f11803b).I)));
                return;
        }
    }

    public z5(si0 si0Var) {
        this.f11802a = 2;
        this.f11803b = si0Var;
    }
}
