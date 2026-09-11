package bi;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class tb extends qb {
    public final sb f3764a;
    public final TL_stories.TL_mediaAreaWeather f3765b;
    public View f3766c;
    public final ub d;

    public tb(ub ubVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = ubVar;
        this.f3765b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f7706c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        sb sbVar = new sb(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f3764a = sbVar;
        sbVar.setMaxWidth(AndroidUtilities.displaySize.x);
        sbVar.setIsVideo(false);
        sbVar.d(UserConfig.selectedAccount, tLObject.f7706c);
        sbVar.setText(tLObject.a());
        sbVar.e(3, tL_mediaAreaWeather.color);
        sbVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        ub ubVar = this.d;
        double d = ubVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f3765b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20104x * d) / 100.0d;
        double d11 = ubVar.f3845e;
        double d12 = (mediaAreaCoordinates.f20105y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20103w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + ubVar.f3843b), (float) (d12 + ubVar.f3844c));
        sb sbVar = this.f3764a;
        float min = Math.min(f10 / ((sbVar.getWidthInternal() - sbVar.getPaddingLeft()) - sbVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((sbVar.getHeightInternal() - sbVar.getPaddingTop()) - sbVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - sbVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - sbVar.getPaddingTop());
        sbVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        sb sbVar = this.f3764a;
        if (z10) {
            sbVar.K = true;
            if (sbVar.L) {
                sbVar.f45509s.onAttachedToWindow();
                return;
            } else {
                sbVar.f45508r.onAttachedToWindow();
                return;
            }
        }
        sbVar.K = false;
        sbVar.f45508r.onDetachedFromWindow();
        sbVar.f45509s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f3766c = view;
    }
}
