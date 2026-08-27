package eg;

import ag.k3;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class q extends k3 {

    public final t f5436n;

    public q(t tVar, Context context) {
        super(context);
        this.f5436n = tVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5436n.f5442b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5436n.f5442b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f540a.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
