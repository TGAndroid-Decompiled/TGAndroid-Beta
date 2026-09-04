package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.ua0;
public final class c6 extends CharacterStyle {
    public final int f13847a;
    public final Object f13848b;

    public c6(int i10, FrameLayout frameLayout) {
        this.f13847a = i10;
        this.f13848b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f13847a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, ((g6) this.f13848b).f13929a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.j6.f20846n6;
                ((ua0) this.f13848b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, ((si0) this.f13848b).I)));
                return;
        }
    }

    public c6(si0 si0Var) {
        this.f13847a = 2;
        this.f13848b = si0Var;
    }
}
