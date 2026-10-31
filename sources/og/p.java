package og;

import android.content.Context;
import kg.g2;
import org.telegram.messenger.i0;
public final class p extends g2 {
    public final s f14216r;

    public p(s sVar, Context context) {
        super(context);
        this.f14216r = sVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14216r.f14221b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14216r.f14221b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11092a.f11069b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - i0.L(52.0f));
    }
}
