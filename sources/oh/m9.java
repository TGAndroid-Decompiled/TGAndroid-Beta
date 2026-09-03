package oh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class m9 extends j9 {
    public final l9 f17473a;
    public final TL_stories.TL_mediaAreaWeather f17474b;
    public View f17475c;
    public final n9 d;

    public m9(n9 n9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = n9Var;
        this.f17474b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f46283c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        l9 l9Var = new l9(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f17473a = l9Var;
        l9Var.setMaxWidth(AndroidUtilities.displaySize.x);
        l9Var.setIsVideo(false);
        l9Var.d(UserConfig.selectedAccount, tLObject.f46283c);
        l9Var.setText(tLObject.a());
        l9Var.e(3, tL_mediaAreaWeather.color);
        l9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        n9 n9Var = this.d;
        double d = n9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f17474b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f21079x * d) / 100.0d;
        double d11 = n9Var.f17517e;
        double d12 = (mediaAreaCoordinates.f21080y * d11) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f21078w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + n9Var.f17515b), (float) (d12 + n9Var.f17516c));
        l9 l9Var = this.f17473a;
        float min = Math.min(f11 / ((l9Var.getWidthInternal() - l9Var.getPaddingLeft()) - l9Var.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((l9Var.getHeightInternal() - l9Var.getPaddingTop()) - l9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - l9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - l9Var.getPaddingTop());
        l9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z4) {
        l9 l9Var = this.f17473a;
        if (z4) {
            l9Var.H = true;
            if (l9Var.I) {
                l9Var.f5302s.onAttachedToWindow();
                return;
            } else {
                l9Var.f5301r.onAttachedToWindow();
                return;
            }
        }
        l9Var.H = false;
        l9Var.f5301r.onDetachedFromWindow();
        l9Var.f5302s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f17475c = view;
    }
}
