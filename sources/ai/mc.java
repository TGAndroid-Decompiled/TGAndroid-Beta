package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fk0;
public final class mc extends lc {
    public final pb f1431a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f1432b;
    public final zg.e0 f1433c;
    public final pc d;

    public mc(pc pcVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = pcVar;
        pb pbVar = new pb(null);
        this.f1431a = pbVar;
        zg.e0 e0Var = new zg.e0(null);
        this.f1433c = e0Var;
        this.f1432b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            pbVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            pbVar.a();
        }
        e0Var.f54747i = true;
        e0Var.e(zg.n0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        zg.e0 e0Var = this.f1433c;
        org.telegram.ui.Components.s5 s5Var = e0Var.f54742b;
        if (s5Var != null) {
            imageReceiver = s5Var.f30402k;
        } else {
            imageReceiver = e0Var.f54741a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            fk0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            pc pcVar = this.d;
            double d = pcVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f1432b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f20039x * d) / 100.0d) + pcVar.f1598b);
            double d10 = pcVar.f1599c;
            double d11 = pcVar.f1600e;
            float f11 = (float) (((mediaAreaCoordinates.f20040y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f20038w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            pb pbVar = this.f1431a;
            pbVar.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            pbVar.f1592e = (int) (255.0f * f7);
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
            if (pbVar.f1589a == 1) {
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
        this.f1433c.b(z10);
    }

    @Override
    public final void c(View view) {
        zg.e0 e0Var = this.f1433c;
        if (e0Var.f54745f == view) {
            return;
        }
        if (e0Var.f54746g) {
            e0Var.b(false);
            e0Var.f54745f = view;
            e0Var.b(true);
            return;
        }
        e0Var.f54745f = view;
    }
}
