package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class sab extends pab {
    public final rab a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final tab d;

    public sab(tab tabVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = tabVar;
        this.b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        rab rabVar = new rab(this, a.b, gm.p);
        this.a = rabVar;
        rabVar.setMaxWidth(gm.q.x);
        rabVar.setIsVideo(false);
        rabVar.d(z8c.t0, tLObject.c);
        rabVar.setText(tLObject.a());
        rabVar.e(3, tL_mediaAreaWeather.color);
        rabVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f) {
        int widthInternal;
        int heightInternal;
        tab tabVar = this.d;
        double d = tabVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.x * d) / 100.0d;
        double d3 = tabVar.e;
        double d4 = (mediaAreaCoordinates.y * d3) / 100.0d;
        float f2 = (float) ((d * mediaAreaCoordinates.w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + tabVar.b), (float) (d4 + tabVar.c));
        rab rabVar = this.a;
        float min = Math.min(f2 / ((rabVar.getWidthInternal() - rabVar.getPaddingLeft()) - rabVar.getPaddingRight()), ((float) ((d3 * mediaAreaCoordinates.h) / 100.0d)) / ((rabVar.getHeightInternal() - rabVar.getPaddingTop()) - rabVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d5 = tL_mediaAreaWeather.coordinates.rotation;
        if (d5 != 0.0d) {
            canvas.rotate((float) d5);
        }
        canvas.translate(((-widthInternal) / 2.0f) - rabVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - rabVar.getPaddingTop());
        rabVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z) {
        rab rabVar = this.a;
        if (z) {
            rabVar.L = true;
            if (rabVar.M) {
                rabVar.s.I();
                return;
            } else {
                rabVar.r.I();
                return;
            }
        }
        rabVar.L = false;
        rabVar.r.K();
        rabVar.s.K();
    }

    @Override
    public final void c(View view) {
        this.c = view;
    }
}
