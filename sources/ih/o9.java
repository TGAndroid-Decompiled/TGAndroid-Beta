package ih;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mi0;
public final class o9 extends n9 {
    public final s8 f11916a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f11917b;
    public final hg.i0 f11918c;
    public final r9 d;

    public o9(r9 r9Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = r9Var;
        s8 s8Var = new s8(null);
        this.f11916a = s8Var;
        hg.i0 i0Var = new hg.i0(null);
        this.f11918c = i0Var;
        this.f11917b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            s8Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            s8Var.a();
        }
        i0Var.f10622i = true;
        i0Var.e(hg.r0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        ImageReceiver imageReceiver;
        int i9;
        hg.i0 i0Var = this.f11918c;
        org.telegram.ui.Components.k5 k5Var = i0Var.f10617b;
        if (k5Var != null) {
            imageReceiver = k5Var.f29951k;
        } else {
            imageReceiver = i0Var.f10616a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            mi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.w()) {
                return;
            }
            r9 r9Var = this.d;
            double d = r9Var.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f11917b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f11 = (float) (((mediaAreaCoordinates.f22614x * d) / 100.0d) + r9Var.f12087b);
            double d9 = r9Var.f12088c;
            double d10 = r9Var.f12089e;
            float f12 = (float) (((mediaAreaCoordinates.f22615y * d10) / 100.0d) + d9);
            float f13 = ((float) ((d * mediaAreaCoordinates.f22613w) / 100.0d)) / 2.0f;
            float f14 = ((float) ((d10 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            s8 s8Var = this.f11916a;
            s8Var.setBounds((int) (f11 - f13), (int) (f12 - f14), (int) (f13 + f11), (int) (f14 + f12));
            s8Var.f12129e = (int) (255.0f * f10);
            canvas.save();
            double d11 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d11 != 0.0d) {
                canvas.rotate((float) d11, f11, f12);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (s8Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (s8Var.getBounds().centerX() - height), (int) (s8Var.getBounds().centerY() - height), (int) (s8Var.getBounds().centerX() + height), (int) (s8Var.getBounds().centerY() + height));
            s8Var.c(1.0f);
            s8Var.draw(canvas);
            i0Var.c(rect);
            i0Var.h = f10;
            if (s8Var.f12126a == 1) {
                i9 = -1;
            } else {
                i9 = -16777216;
            }
            i0Var.d(i9);
            i0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f11918c.b(z10);
    }

    @Override
    public final void c(View view) {
        hg.i0 i0Var = this.f11918c;
        if (i0Var.f10620f == view) {
            return;
        }
        if (i0Var.f10621g) {
            i0Var.b(false);
            i0Var.f10620f = view;
            i0Var.b(true);
            return;
        }
        i0Var.f10620f = view;
    }
}
