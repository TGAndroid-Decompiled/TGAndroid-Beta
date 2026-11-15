package fi;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class m9 extends j9 {
    public final l9 f12046a;
    public final TL_stories.TL_mediaAreaWeather f12047b;
    public View f12048c;
    public final n9 d;

    public m9(n9 n9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = n9Var;
        this.f12047b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f14885c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        l9 l9Var = new l9(this, org.telegram.messenger.t0.f26600b, org.telegram.messenger.g0.f23608p);
        this.f12046a = l9Var;
        l9Var.setMaxWidth(org.telegram.messenger.g0.f23609q.x);
        l9Var.setIsVideo(false);
        l9Var.d(m10.f24934t0, tLObject.f14885c);
        l9Var.setText(tLObject.a());
        l9Var.e(3, tL_mediaAreaWeather.color);
        l9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        n9 n9Var = this.d;
        double d = n9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f12047b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.f28287x * d) / 100.0d;
        double d10 = n9Var.f12095e;
        double d11 = (mediaAreaCoordinates.f28288y * d10) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f28286w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + n9Var.f12093b), (float) (d11 + n9Var.f12094c));
        l9 l9Var = this.f12046a;
        float min = Math.min(f11 / ((l9Var.getWidthInternal() - l9Var.getPaddingLeft()) - l9Var.getPaddingRight()), ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / ((l9Var.getHeightInternal() - l9Var.getPaddingTop()) - l9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-widthInternal) / 2.0f) - l9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - l9Var.getPaddingTop());
        l9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        l9 l9Var = this.f12046a;
        if (z10) {
            l9Var.L = true;
            if (l9Var.M) {
                l9Var.f57429s.P();
                return;
            } else {
                l9Var.f57428r.P();
                return;
            }
        }
        l9Var.L = false;
        l9Var.f57428r.R();
        l9Var.f57429s.R();
    }

    @Override
    public final void c(View view) {
        this.f12048c = view;
    }
}
