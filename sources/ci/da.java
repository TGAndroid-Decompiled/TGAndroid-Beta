package ci;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class da extends aa {
    public final ca f5269a;
    public final TL_stories.TL_mediaAreaWeather f5270b;
    public View f5271c;
    public final ea d;

    public da(ea eaVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = eaVar;
        this.f5270b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f9869c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        ca caVar = new ca(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f5269a = caVar;
        caVar.setMaxWidth(AndroidUtilities.displaySize.x);
        caVar.setIsVideo(false);
        caVar.d(UserConfig.selectedAccount, tLObject.f9869c);
        caVar.setText(tLObject.a());
        caVar.e(3, tL_mediaAreaWeather.color);
        caVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        ea eaVar = this.d;
        double d = eaVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f5270b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20503x * d) / 100.0d;
        double d11 = eaVar.e;
        double d12 = (mediaAreaCoordinates.f20504y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20502w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + eaVar.f5306b), (float) (d12 + eaVar.f5307c));
        ca caVar = this.f5269a;
        float min = Math.min(f10 / ((caVar.getWidthInternal() - caVar.getPaddingLeft()) - caVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((caVar.getHeightInternal() - caVar.getPaddingTop()) - caVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - caVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - caVar.getPaddingTop());
        caVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        ca caVar = this.f5269a;
        if (z10) {
            caVar.K = true;
            if (caVar.L) {
                caVar.f45629s.onAttachedToWindow();
                return;
            } else {
                caVar.f45628r.onAttachedToWindow();
                return;
            }
        }
        caVar.K = false;
        caVar.f45628r.onDetachedFromWindow();
        caVar.f45629s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f5271c = view;
    }
}
