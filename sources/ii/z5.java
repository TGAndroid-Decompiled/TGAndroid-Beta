package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ti0;
public final class z5 extends CharacterStyle {
    public final int f11805a;
    public final Object f11806b;

    public z5(int i10, FrameLayout frameLayout) {
        this.f11805a = i10;
        this.f11806b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11805a) {
            case 0:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, j6.v0(j6.Oh, ((d6) this.f11806b).f11337a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = j6.f19047n6;
                ((ta0) this.f11806b).getClass();
                textPaint.setColor(j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, ((ti0) this.f11806b).I)));
                return;
        }
    }

    public z5(ti0 ti0Var) {
        this.f11805a = 2;
        this.f11806b = ti0Var;
    }
}
