package ih;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;
public final class r5 extends FrameLayout {
    public final float f12068a;
    public final s5 f12069b;

    public r5(s5 s5Var, Context context, float f10) {
        super(context);
        this.f12069b = s5Var;
        this.f12068a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this.f12069b.container, new fh.y0(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f12069b.container);
    }
}
