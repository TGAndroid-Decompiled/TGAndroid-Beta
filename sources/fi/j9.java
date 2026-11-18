package fi;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class j9 extends g9 {
    public final i9 f12170a;
    public final TL_stories.TL_mediaAreaWeather f12171b;
    public View f12172c;
    public final k9 d;

    public j9(k9 k9Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = k9Var;
        this.f12171b = tL_mediaAreaWeather;
        ?? tLObject = new TLObject();
        tLObject.f15297c = tL_mediaAreaWeather.emoji;
        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
        i9 i9Var = new i9(this, org.telegram.messenger.t0.f26913b, org.telegram.messenger.g0.f24117p);
        this.f12170a = i9Var;
        i9Var.setMaxWidth(org.telegram.messenger.g0.f24118q.x);
        i9Var.setIsVideo(false);
        i9Var.d(j10.f24770t0, tLObject.f15297c);
        i9Var.setText(tLObject.a());
        i9Var.e(3, tL_mediaAreaWeather.color);
        i9Var.f();
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        int widthInternal;
        int heightInternal;
        k9 k9Var = this.d;
        double d = k9Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.f12171b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        double d2 = (mediaAreaCoordinates.f28639x * d) / 100.0d;
        double d10 = k9Var.f12201e;
        double d11 = (mediaAreaCoordinates.f28640y * d10) / 100.0d;
        float f11 = (float) ((d * mediaAreaCoordinates.f28638w) / 100.0d);
        canvas.save();
        canvas.translate((float) (d2 + k9Var.f12199b), (float) (d11 + k9Var.f12200c));
        i9 i9Var = this.f12170a;
        float min = Math.min(f11 / ((i9Var.getWidthInternal() - i9Var.getPaddingLeft()) - i9Var.getPaddingRight()), ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / ((i9Var.getHeightInternal() - i9Var.getPaddingTop()) - i9Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d12 = tL_mediaAreaWeather.coordinates.rotation;
        if (d12 != 0.0d) {
            canvas.rotate((float) d12);
        }
        canvas.translate(((-widthInternal) / 2.0f) - i9Var.getPaddingLeft(), ((-heightInternal) / 2.0f) - i9Var.getPaddingTop());
        i9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        i9 i9Var = this.f12170a;
        if (z10) {
            i9Var.L = true;
            if (i9Var.M) {
                i9Var.f58012s.P();
                return;
            } else {
                i9Var.f58011r.P();
                return;
            }
        }
        i9Var.L = false;
        i9Var.f58011r.R();
        i9Var.f58012s.R();
    }

    @Override
    public final void c(View view) {
        this.f12172c = view;
    }
}
