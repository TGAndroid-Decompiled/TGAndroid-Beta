package lh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xi0;
public final class k9 extends j9 {
    public final o8 f15867a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f15868b;
    public final kg.h0 f15869c;
    public final n9 d;

    public k9(n9 n9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = n9Var;
        o8 o8Var = new o8(null);
        this.f15867a = o8Var;
        kg.h0 h0Var = new kg.h0(null);
        this.f15869c = h0Var;
        this.f15868b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            o8Var.a();
        }
        h0Var.f13729i = true;
        h0Var.e(kg.q0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f9) {
        ImageReceiver imageReceiver;
        int i10;
        kg.h0 h0Var = this.f15869c;
        org.telegram.ui.Components.p5 p5Var = h0Var.f13724b;
        if (p5Var != null) {
            imageReceiver = p5Var.f31593k;
        } else {
            imageReceiver = h0Var.f13723a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.w()) {
                return;
            }
            n9 n9Var = this.d;
            double d = n9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f15868b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f22626x * d) / 100.0d) + n9Var.f15992b);
            double d10 = n9Var.f15993c;
            double d11 = n9Var.f15994e;
            float f11 = (float) (((mediaAreaCoordinates.f22627y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f22625w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            o8 o8Var = this.f15867a;
            o8Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            o8Var.f16030e = (int) (255.0f * f9);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (o8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (o8Var.getBounds().centerX() - height), (int) (o8Var.getBounds().centerY() - height), (int) (o8Var.getBounds().centerX() + height), (int) (o8Var.getBounds().centerY() + height));
            o8Var.c(1.0f);
            o8Var.draw(canvas);
            h0Var.c(rect);
            h0Var.h = f9;
            if (o8Var.f16027a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            h0Var.d(i10);
            h0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f15869c.b(z10);
    }

    @Override
    public final void c(View view) {
        kg.h0 h0Var = this.f15869c;
        if (h0Var.f13727f == view) {
            return;
        }
        if (h0Var.f13728g) {
            h0Var.b(false);
            h0Var.f13727f = view;
            h0Var.b(true);
            return;
        }
        h0Var.f13727f = view;
    }
}
