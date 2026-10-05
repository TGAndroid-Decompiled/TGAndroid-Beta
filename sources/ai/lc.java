package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kj0;
public final class lc extends kc {
    public final ob f1317a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f1318b;
    public final zg.d0 f1319c;
    public final oc d;

    public lc(oc ocVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = ocVar;
        ob obVar = new ob(null);
        this.f1317a = obVar;
        zg.d0 d0Var = new zg.d0(null);
        this.f1319c = d0Var;
        this.f1318b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            obVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            obVar.a();
        }
        d0Var.f53370i = true;
        d0Var.e(zg.m0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        zg.d0 d0Var = this.f1319c;
        org.telegram.ui.Components.q5 q5Var = d0Var.f53365b;
        if (q5Var != null) {
            imageReceiver = q5Var.f29935k;
        } else {
            imageReceiver = d0Var.f53364a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            kj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            oc ocVar = this.d;
            double d = ocVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f1318b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20281x * d) / 100.0d) + ocVar.f1489b);
            double d10 = ocVar.f1490c;
            double d11 = ocVar.f1491e;
            float f11 = (float) (((mediaAreaCoordinates.f20282y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20280w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            ob obVar = this.f1317a;
            obVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            obVar.f1483e = (int) (255.0f * f7);
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
            d0Var.c(rect);
            d0Var.h = f7;
            if (obVar.f1480a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            d0Var.d(i10);
            d0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f1319c.b(z10);
    }

    @Override
    public final void c(View view) {
        zg.d0 d0Var = this.f1319c;
        if (d0Var.f53368f == view) {
            return;
        }
        if (d0Var.f53369g) {
            d0Var.b(false);
            d0Var.f53368f = view;
            d0Var.b(true);
            return;
        }
        d0Var.f53368f = view;
    }
}
