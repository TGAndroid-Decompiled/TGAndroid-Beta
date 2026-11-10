package di;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class u9 extends r9 {
    public final t9 f9852a;
    public final TL_stories.TL_mediaAreaWeather f9853b;
    public View f9854c;
    public final v9 d;

    public u9(v9 v9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = v9Var;
        this.f9853b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f12823c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        t9 t9Var = new t9(this, org.telegram.messenger.t0.f25570b, org.telegram.messenger.g0.f22566p);
        this.f9852a = t9Var;
        t9Var.setMaxWidth(org.telegram.messenger.g0.f22567q.x);
        t9Var.setIsVideo(false);
        t9Var.d(p10.f24474s0, tLObject.f12823c);
        t9Var.setText(tLObject.a());
        t9Var.e(3, tL_mediaAreaWeather.color);
        t9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        v9 v9Var = this.d;
        double d = v9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f9853b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.f27196x * d) / 100.0d;
        double d10 = v9Var.f9889e;
        double d11 = (mediaAreaCoordinates.f27197y * d10) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f27195w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + v9Var.f9887b), (float) (d11 + v9Var.f9888c));
        t9 t9Var = this.f9852a;
        float min = Math.min(f11 / ((t9Var.getWidthInternal() - t9Var.getPaddingLeft()) - t9Var.getPaddingRight()), ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / ((t9Var.getHeightInternal() - t9Var.getPaddingTop()) - t9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-widthInternal) / 2.0f) - t9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - t9Var.getPaddingTop());
        t9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z9) {
        t9 t9Var = this.f9852a;
        if (z9) {
            t9Var.K = true;
            if (t9Var.L) {
                t9Var.f55848s.P();
                return;
            } else {
                t9Var.f55847r.P();
                return;
            }
        }
        t9Var.K = false;
        t9Var.f55847r.R();
        t9Var.f55848s.R();
    }

    @Override
    public final void c(View view) {
        this.f9854c = view;
    }
}
