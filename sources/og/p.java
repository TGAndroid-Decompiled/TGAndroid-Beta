package og;

import android.content.Context;
import kg.g2;
import org.telegram.messenger.i0;
public final class p extends g2 {
    public final s f14217r;

    public p(s sVar, Context context) {
        super(context);
        this.f14217r = sVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14217r.f14222b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14217r.f14222b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11093a.f11070b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - i0.L(52.0f));
    }
}
