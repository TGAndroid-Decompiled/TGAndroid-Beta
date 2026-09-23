package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yi0;
public final class lc extends kc {
    public final ob f1218a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f1219b;
    public final zg.g0 f1220c;
    public final oc d;

    public lc(oc ocVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ocVar;
        ob obVar = new ob(null);
        this.f1218a = obVar;
        zg.g0 g0Var = new zg.g0(null);
        this.f1220c = g0Var;
        this.f1219b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            obVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            obVar.a();
        }
        g0Var.f48978i = true;
        g0Var.e(zg.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        zg.g0 g0Var = this.f1220c;
        org.telegram.ui.Components.q5 q5Var = g0Var.f48974b;
        if (q5Var != null) {
            imageReceiver = q5Var.f27230k;
        } else {
            imageReceiver = g0Var.f48973a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            yi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            oc ocVar = this.d;
            double d = ocVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f1219b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f18315x * d) / 100.0d) + ocVar.f1375b);
            double d10 = ocVar.f1376c;
            double d11 = ocVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f18316y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f18314w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            ob obVar = this.f1218a;
            obVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            obVar.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (obVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (obVar.getBounds().centerX() - height), (int) (obVar.getBounds().centerY() - height), (int) (obVar.getBounds().centerX() + height), (int) (obVar.getBounds().centerY() + height));
            obVar.c(1.0f);
            obVar.draw(canvas);
            g0Var.c(rect);
            g0Var.h = f7;
            if (obVar.f1367a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            g0Var.d(i10);
            g0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f1220c.b(z10);
    }

    @Override
    public final void c(View view) {
        zg.g0 g0Var = this.f1220c;
        if (g0Var.f48976f == view) {
            return;
        }
        if (g0Var.f48977g) {
            g0Var.b(false);
            g0Var.f48976f = view;
            g0Var.b(true);
            return;
        }
        g0Var.f48976f = view;
    }
}
