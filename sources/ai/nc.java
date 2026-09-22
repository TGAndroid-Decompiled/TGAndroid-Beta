package ai;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class nc extends kc {
    public final mc f1317a;
    public final TL_stories.TL_mediaAreaWeather f1318b;
    public View f1319c;
    public final oc d;

    public nc(oc ocVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = ocVar;
        this.f1318b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f5103c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        mc mcVar = new mc(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f1317a = mcVar;
        mcVar.setMaxWidth(AndroidUtilities.displaySize.x);
        mcVar.setIsVideo(false);
        mcVar.d(UserConfig.selectedAccount, tLObject.f5103c);
        mcVar.setText(tLObject.a());
        mcVar.e(3, tL_mediaAreaWeather.color);
        mcVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        oc ocVar = this.d;
        double d = ocVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f1318b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f18575x * d) / 100.0d;
        double d11 = ocVar.e;
        double d12 = (mediaAreaCoordinates.f18576y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f18574w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + ocVar.f1374b), (float) (d12 + ocVar.f1375c));
        mc mcVar = this.f1317a;
        float min = Math.min(f10 / ((mcVar.getWidthInternal() - mcVar.getPaddingLeft()) - mcVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((mcVar.getHeightInternal() - mcVar.getPaddingTop()) - mcVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - mcVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - mcVar.getPaddingTop());
        mcVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        mc mcVar = this.f1317a;
        if (z10) {
            mcVar.K = true;
            if (mcVar.L) {
                mcVar.f41969s.onAttachedToWindow();
                return;
            } else {
                mcVar.f41968r.onAttachedToWindow();
                return;
            }
        }
        mcVar.K = false;
        mcVar.f41968r.onDetachedFromWindow();
        mcVar.f41969s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f1319c = view;
    }
}
