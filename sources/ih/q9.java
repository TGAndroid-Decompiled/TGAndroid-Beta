package ih;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class q9 extends n9 {
    public final p9 f12015a;
    public final TL_stories.TL_mediaAreaWeather f12016b;
    public View f12017c;
    public final r9 d;

    public q9(r9 r9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = r9Var;
        this.f12016b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f16113c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        p9 p9Var = new p9(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f12015a = p9Var;
        p9Var.setMaxWidth(AndroidUtilities.displaySize.x);
        p9Var.setIsVideo(false);
        p9Var.d(UserConfig.selectedAccount, tLObject.f16113c);
        p9Var.setText(tLObject.a());
        p9Var.e(3, tL_mediaAreaWeather.color);
        p9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        r9 r9Var = this.d;
        double d = r9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f12016b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d9 = (mediaAreaCoordinates.f22614x * d) / 100.0d;
        double d10 = r9Var.f12089e;
        double d11 = (mediaAreaCoordinates.f22615y * d10) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f22613w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d9 + r9Var.f12087b), (float) (d11 + r9Var.f12088c));
        p9 p9Var = this.f12015a;
        float min = Math.min(f11 / ((p9Var.getWidthInternal() - p9Var.getPaddingLeft()) - p9Var.getPaddingRight()), ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / ((p9Var.getHeightInternal() - p9Var.getPaddingTop()) - p9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-widthInternal) / 2.0f) - p9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - p9Var.getPaddingTop());
        p9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        p9 p9Var = this.f12015a;
        if (z10) {
            p9Var.G = true;
            if (p9Var.H) {
                p9Var.f50085s.onAttachedToWindow();
                return;
            } else {
                p9Var.f50084r.onAttachedToWindow();
                return;
            }
        }
        p9Var.G = false;
        p9Var.f50084r.onDetachedFromWindow();
        p9Var.f50085s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f12017c = view;
    }
}
