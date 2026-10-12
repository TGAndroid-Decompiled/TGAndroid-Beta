package bi;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class wb extends tb {
    public final vb f3936a;
    public final TL_stories.TL_mediaAreaWeather f3937b;
    public View f3938c;
    public final xb d;

    public wb(xb xbVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = xbVar;
        this.f3937b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f7091c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        vb vbVar = new vb(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f3936a = vbVar;
        vbVar.setMaxWidth(AndroidUtilities.displaySize.x);
        vbVar.setIsVideo(false);
        vbVar.d(UserConfig.selectedAccount, tLObject.f7091c);
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
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f3937b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d10 = (mediaAreaCoordinates.f19448x * d) / 100.0d;
        double d11 = xbVar.e;
        double d12 = (mediaAreaCoordinates.f19449y * d11) / 100.0d;
        float f10 = (float) ((d * mediaAreaCoordinates.f19447w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d10 + xbVar.f3998b), (float) (d12 + xbVar.f3999c));
        vb vbVar = this.f3936a;
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
        vb vbVar = this.f3936a;
        if (z10) {
            vbVar.K = true;
            if (vbVar.L) {
                vbVar.f44567s.onAttachedToWindow();
                return;
            } else {
                vbVar.f44566r.onAttachedToWindow();
                return;
            }
        }
        vbVar.K = false;
        vbVar.f44566r.onDetachedFromWindow();
        vbVar.f44567s.onDetachedFromWindow();
    }

    @Override
    public final void c(View view) {
        this.f3938c = view;
    }
}
