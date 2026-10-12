package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yj0;
public final class ub extends tb {
    public final ya f3808a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f3809b;
    public final ah.y0 f3810c;
    public final xb d;

    public ub(xb xbVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = xbVar;
        ya yaVar = new ya(null);
        this.f3808a = yaVar;
        ah.y0 y0Var = new ah.y0(null);
        this.f3810c = y0Var;
        this.f3809b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            yaVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            yaVar.a();
        }
        y0Var.f908i = true;
        y0Var.e(ah.i1.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        ah.y0 y0Var = this.f3810c;
        org.telegram.ui.Components.s5 s5Var = y0Var.f904b;
        if (s5Var != null) {
            imageReceiver = s5Var.f29031k;
        } else {
            imageReceiver = y0Var.f903a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            xb xbVar = this.d;
            double d = xbVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f3809b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f19448x * d) / 100.0d) + xbVar.f3998b);
            double d10 = xbVar.f3999c;
            double d11 = xbVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f19449y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f19447w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            ya yaVar = this.f3808a;
            yaVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            yaVar.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (yaVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (yaVar.getBounds().centerX() - height), (int) (yaVar.getBounds().centerY() - height), (int) (yaVar.getBounds().centerX() + height), (int) (yaVar.getBounds().centerY() + height));
            yaVar.c(1.0f);
            yaVar.draw(canvas);
            y0Var.c(rect);
            y0Var.h = f7;
            if (yaVar.f4033a == 1) {
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
        this.f3810c.b(z10);
    }

    @Override
    public final void c(View view) {
        ah.y0 y0Var = this.f3810c;
        if (y0Var.f906f == view) {
            return;
        }
        if (y0Var.f907g) {
            y0Var.b(false);
            y0Var.f906f = view;
            y0Var.b(true);
            return;
        }
        y0Var.f906f = view;
    }
}
