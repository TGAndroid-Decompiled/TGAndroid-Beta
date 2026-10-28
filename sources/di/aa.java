package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yj0;
public final class aa extends z9 {
    public final e9 f8405a;
    public final TL_stories.TL_mediaAreaSuggestedReaction f8406b;
    public final bh.n0 f8407c;
    public final da d;

    public aa(da daVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = daVar;
        e9 e9Var = new e9(null);
        this.f8405a = e9Var;
        bh.n0 n0Var = new bh.n0(null);
        this.f8407c = n0Var;
        this.f8406b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            e9Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            e9Var.a();
        }
        n0Var.f4094i = true;
        n0Var.e(bh.x0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        ImageReceiver imageReceiver;
        int i10;
        bh.n0 n0Var = this.f8407c;
        org.telegram.ui.Components.t5 t5Var = n0Var.f4090b;
        if (t5Var != null) {
            imageReceiver = t5Var.f32860k;
        } else {
            imageReceiver = n0Var.f4089a;
        }
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null && lottieAnimation.y()) {
                return;
            }
            da daVar = this.d;
            double d = daVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.f8406b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f10 = (float) (((mediaAreaCoordinates.f22264x * d) / 100.0d) + daVar.f8504b);
            double d10 = daVar.f8505c;
            double d11 = daVar.e;
            float f11 = (float) (((mediaAreaCoordinates.f22265y * d11) / 100.0d) + d10);
            float f12 = ((float) ((d * mediaAreaCoordinates.f22263w) / 100.0d)) / 2.0f;
            float f13 = ((float) ((d11 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            e9 e9Var = this.f8405a;
            e9Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
            e9Var.e = (int) (255.0f * f7);
            canvas.save();
            double d12 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d12 != 0.0d) {
                canvas.rotate((float) d12, f10, f11);
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float height = (e9Var.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (e9Var.getBounds().centerX() - height), (int) (e9Var.getBounds().centerY() - height), (int) (e9Var.getBounds().centerX() + height), (int) (e9Var.getBounds().centerY() + height));
            e9Var.c(1.0f);
            e9Var.draw(canvas);
            n0Var.c(rect);
            n0Var.h = f7;
            if (e9Var.f8528a == 1) {
                i10 = -1;
            } else {
                i10 = -16777216;
            }
            n0Var.d(i10);
            n0Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z10) {
        this.f8407c.b(z10);
    }

    @Override
    public final void c(View view) {
        bh.n0 n0Var = this.f8407c;
        if (n0Var.f4092f == view) {
            return;
        }
        if (n0Var.f4093g) {
            n0Var.b(false);
            n0Var.f4092f = view;
            n0Var.b(true);
            return;
        }
        n0Var.f4092f = view;
    }
}
