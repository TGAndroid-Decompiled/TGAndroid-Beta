package ci;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uj0;
public final class ca extends ba {
    public final g9 f5304a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f5305b;
    public final ah.y0 f5306c;
    public final fa d;

    public ca(fa faVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = faVar;
        g9 g9Var = new g9(null);
        this.f5304a = g9Var;
        ah.y0 y0Var = new ah.y0(null);
        this.f5306c = y0Var;
        this.f5305b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            g9Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            g9Var.a();
        }
        y0Var.f914i = true;
        y0Var.e(ah.i1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        ah.y0 y0Var = this.f5306c;
        org.telegram.ui.Components.r5 r5Var = y0Var.f910b;
        if (r5Var != null) {
            imageReceiver = r5Var.f29841k;
        } else {
            imageReceiver = y0Var.f909a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            uj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            fa faVar = this.d;
            double d = faVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f5305b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20503x * d) / 100.0d) + faVar.f5407b);
            double d10 = faVar.f5408c;
            double d11 = faVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f20504y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20502w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            g9 g9Var = this.f5304a;
            g9Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            g9Var.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (g9Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (g9Var.getBounds().centerX() - height), (int) (g9Var.getBounds().centerY() - height), (int) (g9Var.getBounds().centerX() + height), (int) (g9Var.getBounds().centerY() + height));
            g9Var.c(1.0f);
            g9Var.draw(canvas);
            y0Var.c(rect);
            y0Var.h = f7;
            if (g9Var.f5428a == 1) {
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
        this.f5306c.b(z10);
    }

    @Override
    public final void c(View view) {
        ah.y0 y0Var = this.f5306c;
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
