package ei;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class v9 extends s9 {
    public final u9 f11140a;
    public final TL_stories.TL_mediaAreaWeather f11141b;
    public View f11142c;
    public final w9 d;

    public v9(w9 w9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = w9Var;
        this.f11141b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f13584c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        u9 u9Var = new u9(this, org.telegram.messenger.t0.f25457b, org.telegram.messenger.g0.f22607p);
        this.f11140a = u9Var;
        u9Var.setMaxWidth(org.telegram.messenger.g0.f22608q.x);
        u9Var.setIsVideo(false);
        u9Var.d(h10.f22829t0, tLObject.f13584c);
        u9Var.setText(tLObject.a());
        u9Var.e(3, tL_mediaAreaWeather.color);
        u9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        w9 w9Var = this.d;
        double d = w9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f11141b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f27237x * d) / 100.0d;
        double d11 = w9Var.f11196e;
        double d12 = (mediaAreaCoordinates.f27238y * d11) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f27236w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + w9Var.f11194b), (float) (d12 + w9Var.f11195c));
        u9 u9Var = this.f11140a;
        float min = Math.min(f11 / ((u9Var.getWidthInternal() - u9Var.getPaddingLeft()) - u9Var.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((u9Var.getHeightInternal() - u9Var.getPaddingTop()) - u9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - u9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - u9Var.getPaddingTop());
        u9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        u9 u9Var = this.f11140a;
        if (z10) {
            u9Var.L = true;
            if (u9Var.M) {
                u9Var.f56126s.P();
                return;
            } else {
                u9Var.f56125r.P();
                return;
            }
        }
        u9Var.L = false;
        u9Var.f56125r.R();
        u9Var.f56126s.R();
    }

    @Override
    public final void c(View view) {
        this.f11142c = view;
    }
}
