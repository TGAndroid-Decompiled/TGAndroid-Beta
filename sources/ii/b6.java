package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.zj0;
public final class b6 extends CharacterStyle {
    public final int f12290a;
    public final Object f12291b;

    public b6(int i10, FrameLayout frameLayout) {
        this.f12290a = i10;
        this.f12291b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12290a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, ((f6) this.f12291b).f12414a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.h6.f20971n6;
                ((wb0) this.f12291b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.m1(0.4f, ((zj0) this.f12291b).I)));
                return;
        }
    }

    public b6(zj0 zj0Var) {
        this.f12290a = 2;
        this.f12291b = zj0Var;
    }
}
