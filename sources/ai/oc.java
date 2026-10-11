package ai;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class oc extends lc {
    public final nc f1555a;
    public final TL_stories.TL_mediaAreaWeather f1556b;
    public View f1557c;
    public final pc d;

    public oc(pc pcVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = pcVar;
        this.f1556b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f5351c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        nc ncVar = new nc(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f1555a = ncVar;
        ncVar.setMaxWidth(AndroidUtilities.displaySize.x);
        ncVar.setIsVideo(false);
        ncVar.d(UserConfig.selectedAccount, tLObject.f5351c);
        ncVar.setText(tLObject.a());
        ncVar.e(3, tL_mediaAreaWeather.color);
        ncVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        pc pcVar = this.d;
        double d = pcVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f1556b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20266x * d) / 100.0d;
        double d11 = pcVar.f1602e;
        double d12 = (mediaAreaCoordinates.f20267y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20265w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + pcVar.f1600b), (float) (d12 + pcVar.f1601c));
        nc ncVar = this.f1555a;
        float min = Math.min(f10 / ((ncVar.getWidthInternal() - ncVar.getPaddingLeft()) - ncVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((ncVar.getHeightInternal() - ncVar.getPaddingTop()) - ncVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - ncVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - ncVar.getPaddingTop());
        ncVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        nc ncVar = this.f1555a;
        if (z10) {
            ncVar.K = true;
            if (ncVar.L) {
                ncVar.f46627s.onAttachedToWindow();
                return;
            } else {
                ncVar.f46626r.onAttachedToWindow();
                return;
            }
        }
        ncVar.K = false;
        ncVar.f46626r.onDetachedFromWindow();
        ncVar.f46627s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f1557c = view;
    }
}
