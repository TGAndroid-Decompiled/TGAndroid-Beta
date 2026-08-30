package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nr;
public final class e extends View {
    public final xd.a f4888a;
    public final Drawable f4889b;
    public final Drawable f4890c;

    public e(Context context) {
        super(context);
        this.f4888a = new xd.a(this, nr.h, 320L);
        this.f4889b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f4890c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f4888a.e;
        lf.r.b(canvas, this.f4889b, 1.0f - f10);
        lf.r.b(canvas, this.f4890c, f10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        float f11 = i11 / 2.0f;
        lf.r.d(this.f4889b, f10, f11, 17);
        lf.r.d(this.f4890c, f10, f11, 17);
    }
}
