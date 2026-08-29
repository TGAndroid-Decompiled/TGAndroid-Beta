package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
public final class e extends View {
    public final vd.a f2651a;
    public final Drawable f2652b;
    public final Drawable f2653c;

    public e(Context context) {
        super(context);
        this.f2651a = new vd.a(this, jr.h, 320L);
        this.f2652b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f2653c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f9 = this.f2651a.f49505e;
        jf.r.b(canvas, this.f2652b, 1.0f - f9);
        jf.r.b(canvas, this.f2653c, f9);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f9 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        jf.r.d(this.f2652b, f9, f10, 17);
        jf.r.d(this.f2653c, f9, f10, 17);
    }
}
