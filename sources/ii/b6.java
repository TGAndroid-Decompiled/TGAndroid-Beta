package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.xj0;
public final class b6 extends CharacterStyle {
    public final int f12291a;
    public final Object f12292b;

    public b6(int i10, FrameLayout frameLayout) {
        this.f12291a = i10;
        this.f12292b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12291a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.m1(0.4f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, ((f6) this.f12292b).f12415a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.i6.f20982n6;
                ((vb0) this.f12292b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.m1(0.4f, ((xj0) this.f12292b).I)));
                return;
        }
    }

    public b6(xj0 xj0Var) {
        this.f12291a = 2;
        this.f12292b = xj0Var;
    }
}
