package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kj0;
public final class lc extends kc {
    public final ob f1216a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f1217b;
    public final zg.g0 f1218c;
    public final oc d;

    public lc(oc ocVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ocVar;
        ob obVar = new ob(null);
        this.f1216a = obVar;
        zg.g0 g0Var = new zg.g0(null);
        this.f1218c = g0Var;
        this.f1217b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            obVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            obVar.a();
        }
        g0Var.f49354i = true;
        g0Var.e(zg.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        zg.g0 g0Var = this.f1218c;
        org.telegram.ui.Components.p5 p5Var = g0Var.f49350b;
        if (p5Var != null) {
            imageReceiver = p5Var.f27256k;
        } else {
            imageReceiver = g0Var.f49349a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            kj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            oc ocVar = this.d;
            double d = ocVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f1217b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f18575x * d) / 100.0d) + ocVar.f1374b);
            double d10 = ocVar.f1375c;
            double d11 = ocVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f18576y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f18574w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            ob obVar = this.f1216a;
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
            if (obVar.f1366a == 1) {
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
        this.f1218c.b(z10);
    }

    @Override
    public final void c(View view) {
        zg.g0 g0Var = this.f1218c;
        if (g0Var.f49352f == view) {
            return;
        }
        if (g0Var.f49353g) {
            g0Var.b(false);
            g0Var.f49352f = view;
            g0Var.b(true);
            return;
        }
        g0Var.f49352f = view;
    }
}
