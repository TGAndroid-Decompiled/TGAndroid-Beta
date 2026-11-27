package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class pcb extends mcb {
    public final ocb a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final qcb d;

    public pcb(qcb qcbVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = qcbVar;
        this.b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        ocb ocbVar = new ocb(this, a.b, hl.p);
        this.a = ocbVar;
        ocbVar.setMaxWidth(hl.q.x);
        ocbVar.setIsVideo(false);
        ocbVar.d(yac.t0, tLObject.c);
        ocbVar.setText(tLObject.a());
        ocbVar.e(3, tL_mediaAreaWeather.color);
        ocbVar.f();
    }

    @Override
    public final void a(Canvas canvas, float f) {
        int widthInternal;
        int heightInternal;
        qcb qcbVar = this.d;
        double d = qcbVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.x * d) / 100.0d;
        double d3 = qcbVar.e;
        double d4 = (mediaAreaCoordinates.y * d3) / 100.0d;
        float f2 = (float) ((d * mediaAreaCoordinates.w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + qcbVar.b), (float) (d4 + qcbVar.c));
        ocb ocbVar = this.a;
        float min = Math.min(f2 / ((ocbVar.getWidthInternal() - ocbVar.getPaddingLeft()) - ocbVar.getPaddingRight()), ((float) ((d3 * mediaAreaCoordinates.h) / 100.0d)) / ((ocbVar.getHeightInternal() - ocbVar.getPaddingTop()) - ocbVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d5 = tL_mediaAreaWeather.coordinates.rotation;
        if (d5 != 0.0d) {
            canvas.rotate((float) d5);
        }
        canvas.translate(((-widthInternal) / 2.0f) - ocbVar.getPaddingLeft(), ((-heightInternal) / 2.0f) - ocbVar.getPaddingTop());
        ocbVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z) {
        ocb ocbVar = this.a;
        if (z) {
            ocbVar.L = true;
            if (ocbVar.M) {
                ocbVar.s.I();
                return;
            } else {
                ocbVar.r.I();
                return;
            }
        }
        ocbVar.L = false;
        ocbVar.r.K();
        ocbVar.s.K();
    }

    @Override
    public final void c(View view) {
        this.c = view;
    }
}
