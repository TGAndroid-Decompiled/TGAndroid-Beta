package bi;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class wb extends tb {
    public final vb f3940a;
    public final TL_stories.TL_mediaAreaWeather f3941b;
    public View f3942c;
    public final xb d;

    public wb(xb xbVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = xbVar;
        this.f3941b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f7094c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        vb vbVar = new vb(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f3940a = vbVar;
        vbVar.setMaxWidth(AndroidUtilities.displaySize.x);
        vbVar.setIsVideo(false);
        vbVar.d(UserConfig.selectedAccount, tLObject.f7094c);
        vbVar.setText(tLObject.a());
        vbVar.e(3, tL_mediaAreaWeather.color);
        vbVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        int widthInternal;
        int heightInternal;
        xb xbVar = this.d;
        double d = xbVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f3941b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f19148x * d) / 100.0d;
        double d11 = xbVar.e;
        double d12 = (mediaAreaCoordinates.f19149y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f19147w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + xbVar.f4002b), (float) (d12 + xbVar.f4003c));
        vb vbVar = this.f3940a;
        float min = Math.min(f10 / ((vbVar.getWidthInternal() - vbVar.getPaddingLeft()) - vbVar.getPaddingRight()), ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / ((vbVar.getHeightInternal() - vbVar.getPaddingTop()) - vbVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - vbVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - vbVar.getPaddingTop());
        vbVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        vb vbVar = this.f3940a;
        if (z10) {
            vbVar.K = true;
            if (vbVar.L) {
                vbVar.f44326s.onAttachedToWindow();
                return;
            } else {
                vbVar.f44325r.onAttachedToWindow();
                return;
            }
        }
        vbVar.K = false;
        vbVar.f44325r.onDetachedFromWindow();
        vbVar.f44326s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f3942c = view;
    }
}
