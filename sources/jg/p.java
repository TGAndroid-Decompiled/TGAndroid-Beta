package jg;

import android.content.Context;
import fg.p2;
import org.telegram.messenger.AndroidUtilities;
public final class p extends p2 {
    public final s f10057n;

    public p(s sVar, Context context) {
        super(context);
        this.f10057n = sVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10057n.f10063b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10057n.f10063b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f6501a.f6452b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
