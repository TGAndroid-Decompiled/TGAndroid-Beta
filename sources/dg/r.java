package dg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import zf.w1;
public final class r extends w1 {
    public final u f4545n;

    public r(u uVar, Context context) {
        super(context);
        this.f4545n = uVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4545n.f4551b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4545n.f4551b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f50764a.f50734b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
