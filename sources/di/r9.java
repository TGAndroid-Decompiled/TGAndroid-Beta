package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.zg0;
public final class r9 extends q9 {
    public final v8 f9733a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f9734b;
    public final ch.f0 f9735c;
    public final u9 d;

    public r9(u9 u9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = u9Var;
        v8 v8Var = new v8(null);
        this.f9733a = v8Var;
        ch.f0 f0Var = new ch.f0(null);
        this.f9735c = f0Var;
        this.f9734b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            v8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            v8Var.a();
        }
        f0Var.f6247i = true;
        f0Var.e(ch.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i7;
        ch.f0 f0Var = this.f9735c;
        org.telegram.ui.Components.i5 i5Var = f0Var.f6242b;
        if (i5Var != null) {
            imageReceiver = i5Var.f34450k;
        } else {
            imageReceiver = f0Var.f6241a;
        }
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            zg0 B = imageReceiver.B();
            if (B != null && B.y()) {
                return;
            }
            u9 u9Var = this.d;
            double d = u9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f9734b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f27188x * d) / 100.0d) + u9Var.f9854b);
            double d2 = u9Var.f9855c;
            double d10 = u9Var.f9856e;
            float f12 = (float) (((mediaAreaCoordinates.f27189y * d10) / 100.0d) + d2);
            float f13 = ((float) ((d * mediaAreaCoordinates.f27187w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            v8 v8Var = this.f9733a;
            v8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            v8Var.f9879e = (int) (255.0f * f10);
            canvas.save();
            double d11 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d11 != 0.0d) {
                canvas.rotate((float) d11, f11, f12);
            }
            Rect rect = org.telegram.messenger.g0.Q;
            float height = (v8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (v8Var.getBounds().centerX() - height), (int) (v8Var.getBounds().centerY() - height), (int) (v8Var.getBounds().centerX() + height), (int) (v8Var.getBounds().centerY() + height));
            v8Var.c(1.0f);
            v8Var.draw(canvas);
            f0Var.c(rect);
            f0Var.h = f10;
            if (v8Var.f9876a == 1) {
                i7 = -1;
            } else {
                i7 = -16777216;
            }
            f0Var.d(i7);
            f0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z9) {
        this.f9735c.b(z9);
    }

    @Override
    public final void c(View view) {
        ch.f0 f0Var = this.f9735c;
        if (f0Var.f6245f == view) {
            return;
        }
        if (f0Var.f6246g) {
            f0Var.b(false);
            f0Var.f6245f = view;
            f0Var.b(true);
            return;
        }
        f0Var.f6245f = view;
    }
}
