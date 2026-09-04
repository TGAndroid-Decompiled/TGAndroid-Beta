package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xi0;
public final class rb extends qb {
    public final va f3676a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f3677b;
    public final ah.z0 f3678c;
    public final ub d;

    public rb(ub ubVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ubVar;
        va vaVar = new va(null);
        this.f3676a = vaVar;
        ah.z0 z0Var = new ah.z0(null);
        this.f3678c = z0Var;
        this.f3677b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            vaVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            vaVar.a();
        }
        z0Var.f733i = true;
        z0Var.e(ah.j1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        ah.z0 z0Var = this.f3678c;
        org.telegram.ui.Components.q5 q5Var = z0Var.f728b;
        if (q5Var != null) {
            imageReceiver = q5Var.f29584k;
        } else {
            imageReceiver = z0Var.f727a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.w()) {
                return;
            }
            ub ubVar = this.d;
            double d = ubVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f3677b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20104x * d) / 100.0d) + ubVar.f3843b);
            double d10 = ubVar.f3844c;
            double d11 = ubVar.f3845e;
            float f11 = (float) (((mediaAreaCoordinates.f20105y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20103w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            va vaVar = this.f3676a;
            vaVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            vaVar.f3914e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (vaVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (vaVar.getBounds().centerX() - height), (int) (vaVar.getBounds().centerY() - height), (int) (vaVar.getBounds().centerX() + height), (int) (vaVar.getBounds().centerY() + height));
            vaVar.c(1.0f);
            vaVar.draw(canvas);
            z0Var.c(rect);
            z0Var.h = f7;
            if (vaVar.f3911a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            z0Var.d(i10);
            z0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f3678c.b(z10);
    }

    @Override
    public final void c(View view) {
        ah.z0 z0Var = this.f3678c;
        if (z0Var.f731f == view) {
            return;
        }
        if (z0Var.f732g) {
            z0Var.b(false);
            z0Var.f731f = view;
            z0Var.b(true);
            return;
        }
        z0Var.f731f = view;
    }
}
