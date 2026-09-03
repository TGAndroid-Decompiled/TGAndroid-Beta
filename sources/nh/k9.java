package nh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gj0;
public final class k9 extends j9 {
    public final o8 f15538a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f15539b;
    public final mg.h0 f15540c;
    public final n9 d;

    public k9(n9 n9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = n9Var;
        o8 o8Var = new o8(null);
        this.f15538a = o8Var;
        mg.h0 h0Var = new mg.h0(null);
        this.f15540c = h0Var;
        this.f15539b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            o8Var.a();
        }
        h0Var.f14003i = true;
        h0Var.e(mg.q0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i10;
        mg.h0 h0Var = this.f15540c;
        org.telegram.ui.Components.l5 l5Var = h0Var.f13999b;
        if (l5Var != null) {
            imageReceiver = l5Var.f26587k;
        } else {
            imageReceiver = h0Var.f13998a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            gj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.w()) {
                return;
            }
            n9 n9Var = this.d;
            double d = n9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f15539b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f19391x * d) / 100.0d) + n9Var.f15658b);
            double d10 = n9Var.f15659c;
            double d11 = n9Var.e;
            float f12 = (float) (((mediaAreaCoordinates.f19392y * d11) / 100.0d) + d10);
            float f13 = ((float) ((d * mediaAreaCoordinates.f19390w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            o8 o8Var = this.f15538a;
            o8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            o8Var.e = (int) (255.0f * f10);
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
            if (o8Var.f15693a == 1) {
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
        this.f15540c.b(z4);
    }

    @Override
    public final void c(View view) {
        mg.h0 h0Var = this.f15540c;
        if (h0Var.f14001f == view) {
            return;
        }
        if (h0Var.f14002g) {
            h0Var.b(false);
            h0Var.f14001f = view;
            h0Var.b(true);
            return;
        }
        h0Var.f14001f = view;
    }
}
