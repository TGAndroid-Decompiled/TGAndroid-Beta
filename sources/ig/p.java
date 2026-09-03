package ig;

import android.content.Context;
import eg.q2;
import org.telegram.messenger.AndroidUtilities;
public final class p extends q2 {
    public final s f7517n;

    public p(s sVar, Context context) {
        super(context);
        this.f7517n = sVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7517n.f7522b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7517n.f7522b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f5457a.f5417b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
