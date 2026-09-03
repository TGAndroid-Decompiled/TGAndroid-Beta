package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr;
public final class e extends View {
    public final xd.a f4894a;
    public final Drawable f4895b;
    public final Drawable f4896c;

    public e(Context context) {
        super(context);
        this.f4894a = new xd.a(this, mr.h, 320L);
        this.f4895b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f4896c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f4894a.e;
        kf.r.b(canvas, this.f4895b, 1.0f - f10);
        kf.r.b(canvas, this.f4896c, f10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        float f11 = i11 / 2.0f;
        kf.r.d(this.f4895b, f10, f11, 17);
        kf.r.d(this.f4896c, f10, f11, 17);
    }
}
