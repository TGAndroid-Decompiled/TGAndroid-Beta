package gg;

import android.content.Context;
import cg.s2;
import org.telegram.messenger.AndroidUtilities;
public final class p extends s2 {
    public final s f7327n;

    public p(s sVar, Context context) {
        super(context);
        this.f7327n = sVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7327n.f7333b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7327n.f7333b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f3367a.f3331b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
