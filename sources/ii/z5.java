package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fj0;
public final class z5 extends CharacterStyle {
    public final int f11806a;
    public final Object f11807b;

    public z5(int i10, FrameLayout frameLayout) {
        this.f11806a = i10;
        this.f11807b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11806a) {
            case 0:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, j6.v0(j6.Oh, ((d6) this.f11807b).f11338a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = j6.f19294n6;
                ((eb0) this.f11807b).getClass();
                textPaint.setColor(j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, ((fj0) this.f11807b).I)));
                return;
        }
    }

    public z5(fj0 fj0Var) {
        this.f11806a = 2;
        this.f11807b = fj0Var;
    }
}
