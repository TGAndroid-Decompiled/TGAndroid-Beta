package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hj0;
public final class lc extends kc {
    public final ob f1219a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f1220b;
    public final zg.f0 f1221c;
    public final oc d;

    public lc(oc ocVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ocVar;
        ob obVar = new ob(null);
        this.f1219a = obVar;
        zg.f0 f0Var = new zg.f0(null);
        this.f1221c = f0Var;
        this.f1220b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            obVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            obVar.a();
        }
        f0Var.f49330i = true;
        f0Var.e(zg.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        zg.f0 f0Var = this.f1221c;
        org.telegram.ui.Components.p5 p5Var = f0Var.f49326b;
        if (p5Var != null) {
            imageReceiver = p5Var.f27162k;
        } else {
            imageReceiver = f0Var.f49325a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            oc ocVar = this.d;
            double d = ocVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f1220b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f18560x * d) / 100.0d) + ocVar.f1377b);
            double d10 = ocVar.f1378c;
            double d11 = ocVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f18561y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f18559w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            ob obVar = this.f1219a;
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
            f0Var.c(rect);
            f0Var.h = f7;
            if (obVar.f1369a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            f0Var.d(i10);
            f0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f1221c.b(z10);
    }

    @Override
    public final void c(View view) {
        zg.f0 f0Var = this.f1221c;
        if (f0Var.f49328f == view) {
            return;
        }
        if (f0Var.f49329g) {
            f0Var.b(false);
            f0Var.f49328f = view;
            f0Var.b(true);
            return;
        }
        f0Var.f49328f = view;
    }
}
