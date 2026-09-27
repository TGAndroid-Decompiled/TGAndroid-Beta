package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gb0;
public final class a6 extends CharacterStyle {
    public final int f11233a;
    public final Object f11234b;

    public a6(int i10, FrameLayout frameLayout) {
        this.f11233a = i10;
        this.f11234b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f11233a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, ((e6) this.f11234b).f11349a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.i6.f19242n6;
                ((gb0) this.f11234b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.4f, ((fj0) this.f11234b).I)));
                return;
        }
    }

    public a6(fj0 fj0Var) {
        this.f11233a = 2;
        this.f11234b = fj0Var;
    }
}
