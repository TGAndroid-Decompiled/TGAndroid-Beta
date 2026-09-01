package eh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class e extends View {
    public final xd.a f5620a;
    public final Drawable f5621b;
    public final Drawable f5622c;

    public e(Context context) {
        super(context);
        this.f5620a = new xd.a(this, pr.h, 320L);
        this.f5621b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.f5622c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f5620a.f50505e;
        lf.r.b(canvas, this.f5621b, 1.0f - f10);
        lf.r.b(canvas, this.f5622c, f10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        float f11 = i11 / 2.0f;
        lf.r.d(this.f5621b, f10, f11, 17);
        lf.r.d(this.f5622c, f10, f11, 17);
    }
}
