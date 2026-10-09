package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
public final class mc extends lc {
    public final pb f1433a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f1434b;
    public final zg.e0 f1435c;
    public final pc d;

    public mc(pc pcVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = pcVar;
        pb pbVar = new pb(null);
        this.f1433a = pbVar;
        zg.e0 e0Var = new zg.e0(null);
        this.f1435c = e0Var;
        this.f1434b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            pbVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            pbVar.a();
        }
        e0Var.f54515i = true;
        e0Var.e(zg.n0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        zg.e0 e0Var = this.f1435c;
        org.telegram.ui.Components.s5 s5Var = e0Var.f54510b;
        if (s5Var != null) {
            imageReceiver = s5Var.f30654k;
        } else {
            imageReceiver = e0Var.f54509a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            ck0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            pc pcVar = this.d;
            double d = pcVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f1434b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20272x * d) / 100.0d) + pcVar.f1600b);
            double d10 = pcVar.f1601c;
            double d11 = pcVar.f1602e;
            float f11 = (float) (((mediaAreaCoordinates.f20273y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20271w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            pb pbVar = this.f1433a;
            pbVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            pbVar.f1594e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (pbVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (pbVar.getBounds().centerX() - height), (int) (pbVar.getBounds().centerY() - height), (int) (pbVar.getBounds().centerX() + height), (int) (pbVar.getBounds().centerY() + height));
            pbVar.c(1.0f);
            pbVar.draw(canvas);
            e0Var.c(rect);
            e0Var.h = f7;
            if (pbVar.f1591a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            e0Var.d(i10);
            e0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f1435c.b(z10);
    }

    @Override
    public final void c(View view) {
        zg.e0 e0Var = this.f1435c;
        if (e0Var.f54513f == view) {
            return;
        }
        if (e0Var.f54514g) {
            e0Var.b(false);
            e0Var.f54513f = view;
            e0Var.b(true);
            return;
        }
        e0Var.f54513f = view;
    }
}
