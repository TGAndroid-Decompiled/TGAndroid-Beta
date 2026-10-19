package ci;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class ea extends ba {
    public final da f5372a;
    public final TL_stories.TL_mediaAreaWeather f5373b;
    public View f5374c;
    public final fa d;

    public ea(fa faVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = faVar;
        this.f5373b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f9870c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        da daVar = new da(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f5372a = daVar;
        daVar.setMaxWidth(AndroidUtilities.displaySize.x);
        daVar.setIsVideo(false);
        daVar.d(UserConfig.selectedAccount, tLObject.f9870c);
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
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f5373b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f20506x * d) / 100.0d;
        double d11 = faVar.e;
        double d12 = (mediaAreaCoordinates.f20507y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f20505w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + faVar.f5407b), (float) (d12 + faVar.f5408c));
        da daVar = this.f5372a;
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
        da daVar = this.f5372a;
        if (z10) {
            daVar.K = true;
            if (daVar.L) {
                daVar.f45628s.onAttachedToWindow();
                return;
            } else {
                daVar.f45627r.onAttachedToWindow();
                return;
            }
        }
        daVar.K = false;
        daVar.f45627r.onDetachedFromWindow();
        daVar.f45628s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f5374c = view;
    }
}
