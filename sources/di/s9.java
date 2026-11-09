package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ah0;
public final class s9 extends r9 {
    public final w8 f9764a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f9765b;
    public final ch.f0 f9766c;
    public final v9 d;

    public s9(v9 v9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = v9Var;
        w8 w8Var = new w8(null);
        this.f9764a = w8Var;
        ch.f0 f0Var = new ch.f0(null);
        this.f9766c = f0Var;
        this.f9765b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            w8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            w8Var.a();
        }
        f0Var.f6245i = true;
        f0Var.e(ch.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i7;
        ch.f0 f0Var = this.f9766c;
        org.telegram.ui.Components.i5 i5Var = f0Var.f6240b;
        if (i5Var != null) {
            imageReceiver = i5Var.f34568k;
        } else {
            imageReceiver = f0Var.f6239a;
        }
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ah0 B = imageReceiver.B();
            if (B != null && B.y()) {
                return;
            }
            v9 v9Var = this.d;
            double d = v9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f9765b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f27192x * d) / 100.0d) + v9Var.f9882b);
            double d2 = v9Var.f9883c;
            double d10 = v9Var.f9884e;
            float f12 = (float) (((mediaAreaCoordinates.f27193y * d10) / 100.0d) + d2);
            float f13 = ((float) ((d * mediaAreaCoordinates.f27191w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            w8 w8Var = this.f9764a;
            w8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            w8Var.f9908e = (int) (255.0f * f10);
            canvas.save();
            double d11 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d11 != 0.0d) {
                canvas.rotate((float) d11, f11, f12);
            }
            Rect rect = org.telegram.messenger.g0.Q;
            float height = (w8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (w8Var.getBounds().centerX() - height), (int) (w8Var.getBounds().centerY() - height), (int) (w8Var.getBounds().centerX() + height), (int) (w8Var.getBounds().centerY() + height));
            w8Var.c(1.0f);
            w8Var.draw(canvas);
            f0Var.c(rect);
            f0Var.h = f10;
            if (w8Var.f9905a == 1) {
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
        this.f9766c.b(z9);
    }

    @Override
    public final void c(View view) {
        ch.f0 f0Var = this.f9766c;
        if (f0Var.f6243f == view) {
            return;
        }
        if (f0Var.f6244g) {
            f0Var.b(false);
            f0Var.f6243f = view;
            f0Var.b(true);
            return;
        }
        f0Var.f6243f = view;
    }
}
