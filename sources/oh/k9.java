package oh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ij0;
public final class k9 extends j9 {
    public final o8 f17383a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f17384b;
    public final ng.h0 f17385c;
    public final n9 d;

    public k9(n9 n9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = n9Var;
        o8 o8Var = new o8(null);
        this.f17383a = o8Var;
        ng.h0 h0Var = new ng.h0(null);
        this.f17385c = h0Var;
        this.f17384b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            o8Var.a();
        }
        h0Var.f16081i = true;
        h0Var.e(ng.q0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i10;
        ng.h0 h0Var = this.f17385c;
        org.telegram.ui.Components.l5 l5Var = h0Var.f16076b;
        if (l5Var != null) {
            imageReceiver = l5Var.f28604k;
        } else {
            imageReceiver = h0Var.f16075a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            ij0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.w()) {
                return;
            }
            n9 n9Var = this.d;
            double d = n9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f17384b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f21077x * d) / 100.0d) + n9Var.f17513b);
            double d10 = n9Var.f17514c;
            double d11 = n9Var.f17515e;
            float f12 = (float) (((mediaAreaCoordinates.f21078y * d11) / 100.0d) + d10);
            float f13 = ((float) ((d * mediaAreaCoordinates.f21076w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            o8 o8Var = this.f17383a;
            o8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            o8Var.f17562e = (int) (255.0f * f10);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f11, f12);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (o8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (o8Var.getBounds().centerX() - height), (int) (o8Var.getBounds().centerY() - height), (int) (o8Var.getBounds().centerX() + height), (int) (o8Var.getBounds().centerY() + height));
            o8Var.c(1.0f);
            o8Var.draw(canvas);
            h0Var.c(rect);
            h0Var.h = f10;
            if (o8Var.f17559a == 1) {
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
    public final void b(boolean z4) {
        this.f17385c.b(z4);
    }

    @Override
    public final void c(View view) {
        ng.h0 h0Var = this.f17385c;
        if (h0Var.f16079f == view) {
            return;
        }
        if (h0Var.f16080g) {
            h0Var.b(false);
            h0Var.f16079f = view;
            h0Var.b(true);
            return;
        }
        h0Var.f16079f = view;
    }
}
