package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class q8b extends n8b {
    public final p8b a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final r8b d;

    public q8b(r8b r8bVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = r8bVar;
        this.b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        p8b p8bVar = new p8b(this, a.b, gl.p);
        this.a = p8bVar;
        p8bVar.setMaxWidth(gl.q.x);
        p8bVar.setIsVideo(false);
        p8bVar.d(y6c.t0, tLObject.c);
        p8bVar.setText(tLObject.a());
        p8bVar.e(3, tL_mediaAreaWeather.color);
        p8bVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f) {
        int widthInternal;
        int heightInternal;
        r8b r8bVar = this.d;
        double d = r8bVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.x * d) / 100.0d;
        double d3 = r8bVar.e;
        double d4 = (mediaAreaCoordinates.y * d3) / 100.0d;
        float f2 = (float) ((d * mediaAreaCoordinates.w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + r8bVar.b), (float) (d4 + r8bVar.c));
        p8b p8bVar = this.a;
        float min = Math.min(f2 / ((p8bVar.getWidthInternal() - p8bVar.getPaddingLeft()) - p8bVar.getPaddingRight()), ((float) ((d3 * mediaAreaCoordinates.h) / 100.0d)) / ((p8bVar.getHeightInternal() - p8bVar.getPaddingTop()) - p8bVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d5 = tL_mediaAreaWeather.coordinates.rotation;
        if (d5 != 0.0d) {
            canvas.rotate((float) d5);
        }
        canvas.translate(((-widthInternal) / 2.0f) - p8bVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - p8bVar.getPaddingTop());
        p8bVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z) {
        p8b p8bVar = this.a;
        if (z) {
            p8bVar.L = true;
            if (p8bVar.M) {
                p8bVar.s.I();
                return;
            } else {
                p8bVar.r.I();
                return;
            }
        }
        p8bVar.L = false;
        p8bVar.r.K();
        p8bVar.s.K();
    }

    @Override
    public final void c(View view) {
        this.c = view;
    }
}
