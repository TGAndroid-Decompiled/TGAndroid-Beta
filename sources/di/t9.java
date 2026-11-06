package di;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class t9 extends q9 {
    public final s9 f9805a;
    public final TL_stories.TL_mediaAreaWeather f9806b;
    public View f9807c;
    public final u9 d;

    public t9(u9 u9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = u9Var;
        this.f9806b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f12823c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        s9 s9Var = new s9(this, org.telegram.messenger.t0.f25563b, org.telegram.messenger.g0.f22543p);
        this.f9805a = s9Var;
        s9Var.setMaxWidth(org.telegram.messenger.g0.f22544q.x);
        s9Var.setIsVideo(false);
        s9Var.d(p10.f24467s0, tLObject.f12823c);
        s9Var.setText(tLObject.a());
        s9Var.e(3, tL_mediaAreaWeather.color);
        s9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        u9 u9Var = this.d;
        double d = u9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f9806b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.f27189x * d) / 100.0d;
        double d10 = u9Var.f9856e;
        double d11 = (mediaAreaCoordinates.f27190y * d10) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f27188w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + u9Var.f9854b), (float) (d11 + u9Var.f9855c));
        s9 s9Var = this.f9805a;
        float min = Math.min(f11 / ((s9Var.getWidthInternal() - s9Var.getPaddingLeft()) - s9Var.getPaddingRight()), ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / ((s9Var.getHeightInternal() - s9Var.getPaddingTop()) - s9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-widthInternal) / 2.0f) - s9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - s9Var.getPaddingTop());
        s9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z9) {
        s9 s9Var = this.f9805a;
        if (z9) {
            s9Var.K = true;
            if (s9Var.L) {
                s9Var.f55744s.P();
                return;
            } else {
                s9Var.f55743r.P();
                return;
            }
        }
        s9Var.K = false;
        s9Var.f55743r.R();
        s9Var.f55744s.R();
    }

    @Override
    public final void c(View view) {
        this.f9807c = view;
    }
}
