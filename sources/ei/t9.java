package ei;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ch0;
public final class t9 extends s9 {
    public final v8 f11066a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f11067b;
    public final dh.e0 f11068c;
    public final w9 d;

    public t9(w9 w9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = w9Var;
        v8 v8Var = new v8(null);
        this.f11066a = v8Var;
        dh.e0 e0Var = new dh.e0(null);
        this.f11068c = e0Var;
        this.f11067b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            v8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            v8Var.a();
        }
        e0Var.f8996i = true;
        e0Var.e(dh.n0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i3;
        dh.e0 e0Var = this.f11068c;
        org.telegram.ui.Components.g5 g5Var = e0Var.f8991b;
        if (g5Var != null) {
            imageReceiver = g5Var.f33971k;
        } else {
            imageReceiver = e0Var.f8990a;
        }
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ch0 B = imageReceiver.B();
            if (B != null && B.y()) {
                return;
            }
            w9 w9Var = this.d;
            double d = w9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f11067b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f27237x * d) / 100.0d) + w9Var.f11194b);
            double d10 = w9Var.f11195c;
            double d11 = w9Var.f11196e;
            float f12 = (float) (((mediaAreaCoordinates.f27238y * d11) / 100.0d) + d10);
            float f13 = ((float) ((d * mediaAreaCoordinates.f27236w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            v8 v8Var = this.f11066a;
            v8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            v8Var.f11135e = (int) (255.0f * f10);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f11, f12);
            }
            Rect rect = org.telegram.messenger.g0.Q;
            float height = (v8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (v8Var.getBounds().centerX() - height), (int) (v8Var.getBounds().centerY() - height), (int) (v8Var.getBounds().centerX() + height), (int) (v8Var.getBounds().centerY() + height));
            v8Var.c(1.0f);
            v8Var.draw(canvas);
            e0Var.c(rect);
            e0Var.h = f10;
            if (v8Var.f11132a == 1) {
                i3 = -1;
            } else {
                i3 = -16777216;
            }
            e0Var.d(i3);
            e0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f11068c.b(z10);
    }

    @Override
    public final void c(View view) {
        dh.e0 e0Var = this.f11068c;
        if (e0Var.f8994f == view) {
            return;
        }
        if (e0Var.f8995g) {
            e0Var.b(false);
            e0Var.f8994f = view;
            e0Var.b(true);
            return;
        }
        e0Var.f8994f = view;
    }
}
