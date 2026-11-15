package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ch0;
public final class k9 extends j9 {
    public final o8 f11974a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f11975b;
    public final ch.g0 f11976c;
    public final n9 d;

    public k9(n9 n9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = n9Var;
        o8 o8Var = new o8(null);
        this.f11974a = o8Var;
        ch.g0 g0Var = new ch.g0(null);
        this.f11976c = g0Var;
        this.f11975b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            o8Var.a();
        }
        g0Var.f5078i = true;
        g0Var.e(ch.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i7;
        ch.g0 g0Var = this.f11976c;
        org.telegram.ui.Components.g5 g5Var = g0Var.f5073b;
        if (g5Var != null) {
            imageReceiver = g5Var.f34809k;
        } else {
            imageReceiver = g0Var.f5072a;
        }
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            ch0 B = imageReceiver.B();
            if (B != null && B.y()) {
                return;
            }
            n9 n9Var = this.d;
            double d = n9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f11975b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f28287x * d) / 100.0d) + n9Var.f12093b);
            double d2 = n9Var.f12094c;
            double d10 = n9Var.f12095e;
            float f12 = (float) (((mediaAreaCoordinates.f28288y * d10) / 100.0d) + d2);
            float f13 = ((float) ((d * mediaAreaCoordinates.f28286w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            o8 o8Var = this.f11974a;
            o8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            o8Var.f12131e = (int) (255.0f * f10);
            canvas.save();
            double d11 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d11 != 0.0d) {
                canvas.rotate((float) d11, f11, f12);
            }
            Rect rect = org.telegram.messenger.g0.Q;
            float height = (o8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (o8Var.getBounds().centerX() - height), (int) (o8Var.getBounds().centerY() - height), (int) (o8Var.getBounds().centerX() + height), (int) (o8Var.getBounds().centerY() + height));
            o8Var.c(1.0f);
            o8Var.draw(canvas);
            g0Var.c(rect);
            g0Var.h = f10;
            if (o8Var.f12128a == 1) {
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
        this.f11976c.b(z10);
    }

    @Override
    public final void c(View view) {
        ch.g0 g0Var = this.f11976c;
        if (g0Var.f5076f == view) {
            return;
        }
        if (g0Var.f5077g) {
            g0Var.b(false);
            g0Var.f5076f = view;
            g0Var.b(true);
            return;
        }
        g0Var.f5076f = view;
    }
}
