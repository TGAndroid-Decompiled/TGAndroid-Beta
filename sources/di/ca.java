package di;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class ca extends z9 {
    public final ba f8473a;
    public final TL_stories.TL_mediaAreaWeather f8474b;
    public View f8475c;
    public final da d;

    public ca(da daVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = daVar;
        this.f8474b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f11455c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        ba baVar = new ba(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f8473a = baVar;
        baVar.setMaxWidth(AndroidUtilities.displaySize.x);
        baVar.setIsVideo(false);
        baVar.d(UserConfig.selectedAccount, tLObject.f11455c);
        baVar.setText(tLObject.a());
        baVar.e(3, tL_mediaAreaWeather.color);
        baVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        da daVar = this.d;
        double d = daVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f8474b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f22263x * d) / 100.0d;
        double d11 = daVar.e;
        double d12 = (mediaAreaCoordinates.f22264y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f22262w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + daVar.f8505b), (float) (d12 + daVar.f8506c));
        ba baVar = this.f8473a;
        float min = Math.min(f10 / ((baVar.getWidthInternal() - baVar.getPaddingLeft()) - baVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((baVar.getHeightInternal() - baVar.getPaddingTop()) - baVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - baVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - baVar.getPaddingTop());
        baVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        ba baVar = this.f8473a;
        if (z10) {
            baVar.K = true;
            if (baVar.L) {
                baVar.f48512s.onAttachedToWindow();
                return;
            } else {
                baVar.f48511r.onAttachedToWindow();
                return;
            }
        }
        baVar.K = false;
        baVar.f48511r.onDetachedFromWindow();
        baVar.f48512s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f8475c = view;
    }
}
