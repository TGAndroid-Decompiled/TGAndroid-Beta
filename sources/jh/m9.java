package jh;

import android.graphics.Canvas;
import android.view.View;
import lh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

public final class m9 extends j9 {

    public final l9 f13669a;

    public final TL_stories.TL_mediaAreaWeather f13670b;

    public View f13671c;
    public final n9 d;

    public m9(n9 n9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = n9Var;
        this.f13670b = tL_mediaAreaWeather;
        pc pcVar = new pc();
        pcVar.f16550c = tL_mediaAreaWeather.emoji;
        pcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        l9 l9Var = new l9(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.f13669a = l9Var;
        l9Var.setMaxWidth(AndroidUtilities.displaySize.x);
        l9Var.setIsVideo(false);
        l9Var.d(UserConfig.selectedAccount, pcVar.f16550c);
        l9Var.setText(pcVar.a());
        l9Var.e(3, tL_mediaAreaWeather.color);
        l9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        n9 n9Var = this.d;
        double d = n9Var.f13717b;
        double d10 = n9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f13670b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f11 = (float) (((mediaAreaCoordinates.f22614x * d10) / 100.0d) + d);
        double d11 = n9Var.f13718c;
        double d12 = n9Var.f13719e;
        float f12 = (float) (((mediaAreaCoordinates.f22615y * d12) / 100.0d) + d11);
        float f13 = (float) ((d10 * mediaAreaCoordinates.f22613w) / 100.0d);
        float f14 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f11, f12);
        l9 l9Var = this.f13669a;
        int widthInternal = (l9Var.getWidthInternal() - l9Var.getPaddingLeft()) - l9Var.getPaddingRight();
        int heightInternal = (l9Var.getHeightInternal() - l9Var.getPaddingTop()) - l9Var.getPaddingBottom();
        float fMin = Math.min(f13 / widthInternal, f14 / heightInternal);
        canvas.scale(fMin, fMin);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-widthInternal) / 2.0f) - l9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - l9Var.getPaddingTop());
        l9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        l9 l9Var = this.f13669a;
        if (!z10) {
            l9Var.G = false;
            l9Var.f50679r.onDetachedFromWindow();
            l9Var.f50680s.onDetachedFromWindow();
        } else {
            l9Var.G = true;
            if (l9Var.H) {
                l9Var.f50680s.onAttachedToWindow();
            } else {
                l9Var.f50679r.onAttachedToWindow();
            }
        }
    }

    @Override
    public final void c(View view) {
        this.f13671c = view;
    }
}
