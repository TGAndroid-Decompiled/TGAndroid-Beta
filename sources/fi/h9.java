package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mh0;
public final class h9 extends g9 {
    public final l8 f12078a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f12079b;
    public final ch.g0 f12080c;
    public final k9 d;

    public h9(k9 k9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = k9Var;
        l8 l8Var = new l8(null);
        this.f12078a = l8Var;
        ch.g0 g0Var = new ch.g0(null);
        this.f12080c = g0Var;
        this.f12079b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            l8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            l8Var.a();
        }
        g0Var.f5367i = true;
        g0Var.e(ch.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i7;
        ch.g0 g0Var = this.f12080c;
        org.telegram.ui.Components.o5 o5Var = g0Var.f5362b;
        if (o5Var != null) {
            imageReceiver = o5Var.f37976k;
        } else {
            imageReceiver = g0Var.f5361a;
        }
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            mh0 B = imageReceiver.B();
            if (B != null && B.y()) {
                return;
            }
            k9 k9Var = this.d;
            double d = k9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f12079b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f28641x * d) / 100.0d) + k9Var.f12202b);
            double d2 = k9Var.f12203c;
            double d10 = k9Var.f12204e;
            float f12 = (float) (((mediaAreaCoordinates.f28642y * d10) / 100.0d) + d2);
            float f13 = ((float) ((d * mediaAreaCoordinates.f28640w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            l8 l8Var = this.f12078a;
            l8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            l8Var.f12231e = (int) (255.0f * f10);
            canvas.save();
            double d11 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d11 != 0.0d) {
                canvas.rotate((float) d11, f11, f12);
            }
            Rect rect = org.telegram.messenger.g0.Q;
            float height = (l8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (l8Var.getBounds().centerX() - height), (int) (l8Var.getBounds().centerY() - height), (int) (l8Var.getBounds().centerX() + height), (int) (l8Var.getBounds().centerY() + height));
            l8Var.c(1.0f);
            l8Var.draw(canvas);
            g0Var.c(rect);
            g0Var.h = f10;
            if (l8Var.f12228a == 1) {
                i7 = -1;
            } else {
                i7 = -16777216;
            }
            g0Var.d(i7);
            g0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f12080c.b(z10);
    }

    @Override
    public final void c(View view) {
        ch.g0 g0Var = this.f12080c;
        if (g0Var.f5365f == view) {
            return;
        }
        if (g0Var.f5366g) {
            g0Var.b(false);
            g0Var.f5365f = view;
            g0Var.b(true);
            return;
        }
        g0Var.f5365f = view;
    }
}
