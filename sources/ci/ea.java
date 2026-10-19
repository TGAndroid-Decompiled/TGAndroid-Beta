package ci;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class ea extends ba {
    public final da f5370a;
    public final TL_stories.TL_mediaAreaWeather f5371b;
    public View f5372c;
    public final fa d;

    public ea(fa faVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = faVar;
        this.f5371b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f9868c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        da daVar = new da(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f5370a = daVar;
        daVar.setMaxWidth(AndroidUtilities.displaySize.x);
        daVar.setIsVideo(false);
        daVar.d(UserConfig.selectedAccount, tLObject.f9868c);
        daVar.setText(tLObject.a());
        daVar.e(3, tL_mediaAreaWeather.color);
        daVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        fa faVar = this.d;
        double d = faVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f5371b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20504x * d) / 100.0d;
        double d11 = faVar.e;
        double d12 = (mediaAreaCoordinates.f20505y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20503w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + faVar.f5405b), (float) (d12 + faVar.f5406c));
        da daVar = this.f5370a;
        float min = Math.min(f10 / ((daVar.getWidthInternal() - daVar.getPaddingLeft()) - daVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((daVar.getHeightInternal() - daVar.getPaddingTop()) - daVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - daVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - daVar.getPaddingTop());
        daVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        da daVar = this.f5370a;
        if (z10) {
            daVar.K = true;
            if (daVar.L) {
                daVar.f45630s.onAttachedToWindow();
                return;
            } else {
                daVar.f45629r.onAttachedToWindow();
                return;
            }
        }
        daVar.K = false;
        daVar.f45629r.onDetachedFromWindow();
        daVar.f45630s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f5372c = view;
    }
}
