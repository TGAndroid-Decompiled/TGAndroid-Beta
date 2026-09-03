package nh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class m9 extends j9 {
    public final l9 f15628a;
    public final TL_stories.TL_mediaAreaWeather f15629b;
    public View f15630c;
    public final n9 d;

    public m9(n9 n9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = n9Var;
        this.f15629b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f42705c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        l9 l9Var = new l9(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f15628a = l9Var;
        l9Var.setMaxWidth(AndroidUtilities.displaySize.x);
        l9Var.setIsVideo(false);
        l9Var.d(UserConfig.selectedAccount, tLObject.f42705c);
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
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f15629b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f19391x * d) / 100.0d;
        double d11 = n9Var.e;
        double d12 = (mediaAreaCoordinates.f19392y * d11) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f19390w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + n9Var.f15658b), (float) (d12 + n9Var.f15659c));
        l9 l9Var = this.f15628a;
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
        l9 l9Var = this.f15628a;
        if (z4) {
            l9Var.H = true;
            if (l9Var.I) {
                l9Var.f4652s.onAttachedToWindow();
                return;
            } else {
                l9Var.f4651r.onAttachedToWindow();
                return;
            }
        }
        l9Var.H = false;
        l9Var.f4651r.onDetachedFromWindow();
        l9Var.f4652s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f15630c = view;
    }
}
