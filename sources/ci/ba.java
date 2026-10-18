package ci;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uj0;
public final class ba extends aa {
    public final f9 f5201a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f5202b;
    public final ah.y0 f5203c;
    public final ea d;

    public ba(ea eaVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = eaVar;
        f9 f9Var = new f9(null);
        this.f5201a = f9Var;
        ah.y0 y0Var = new ah.y0(null);
        this.f5203c = y0Var;
        this.f5202b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            f9Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            f9Var.a();
        }
        y0Var.f914i = true;
        y0Var.e(ah.i1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        ah.y0 y0Var = this.f5203c;
        org.telegram.ui.Components.r5 r5Var = y0Var.f910b;
        if (r5Var != null) {
            imageReceiver = r5Var.f29842k;
        } else {
            imageReceiver = y0Var.f909a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            uj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            ea eaVar = this.d;
            double d = eaVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f5202b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20503x * d) / 100.0d) + eaVar.f5306b);
            double d10 = eaVar.f5307c;
            double d11 = eaVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f20504y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20502w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            f9 f9Var = this.f5201a;
            f9Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            f9Var.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (f9Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (f9Var.getBounds().centerX() - height), (int) (f9Var.getBounds().centerY() - height), (int) (f9Var.getBounds().centerX() + height), (int) (f9Var.getBounds().centerY() + height));
            f9Var.c(1.0f);
            f9Var.draw(canvas);
            y0Var.c(rect);
            y0Var.h = f7;
            if (f9Var.f5327a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            y0Var.d(i10);
            y0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f5203c.b(z10);
    }

    @Override
    public final void c(View view) {
        ah.y0 y0Var = this.f5203c;
        if (y0Var.f912f == view) {
            return;
        }
        if (y0Var.f913g) {
            y0Var.b(false);
            y0Var.f912f = view;
            y0Var.b(true);
            return;
        }
        y0Var.f912f = view;
    }
}
