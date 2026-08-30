package ig;

import android.content.Context;
import eg.q2;
import org.telegram.messenger.AndroidUtilities;
public final class p extends q2 {
    public final s f7535n;

    public p(s sVar, Context context) {
        super(context);
        this.f7535n = sVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7535n.f7540b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7535n.f7540b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f5468a.f5428b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
