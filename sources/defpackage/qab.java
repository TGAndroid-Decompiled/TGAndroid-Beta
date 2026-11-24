package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class qab extends pab {
    public final d8b a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final d29 c;
    public final tab d;

    public qab(tab tabVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = tabVar;
        d8b d8bVar = new d8b(null);
        this.a = d8bVar;
        d29 d29Var = new d29(null);
        this.c = d29Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            d8bVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            d8bVar.a();
        }
        d29Var.i = true;
        d29Var.e(k39.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f) {
        ImageReceiver imageReceiver;
        int i;
        d29 d29Var = this.c;
        vm vmVar = d29Var.b;
        if (vmVar != null) {
            imageReceiver = vmVar.k;
        } else {
            imageReceiver = d29Var.a;
        }
        if (imageReceiver != null && imageReceiver.D() && imageReceiver.C()) {
            p09 y = imageReceiver.y();
            if (y != null && y.t()) {
                return;
            }
            tab tabVar = this.d;
            double d = tabVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f2 = (float) (((mediaAreaCoordinates.x * d) / 100.0d) + tabVar.b);
            double d2 = tabVar.c;
            double d3 = tabVar.e;
            float f3 = (float) (((mediaAreaCoordinates.y * d3) / 100.0d) + d2);
            float f4 = ((float) ((d * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
            float f5 = ((float) ((d3 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            d8b d8bVar = this.a;
            d8bVar.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f4 + f2), (int) (f5 + f3));
            d8bVar.e = (int) (255.0f * f);
            canvas.save();
            double d4 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d4 != 0.0d) {
                canvas.rotate((float) d4, f2, f3);
            }
            Rect rect = gm.Q;
            float height = (d8bVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (d8bVar.getBounds().centerX() - height), (int) (d8bVar.getBounds().centerY() - height), (int) (d8bVar.getBounds().centerX() + height), (int) (d8bVar.getBounds().centerY() + height));
            d8bVar.c(1.0f);
            d8bVar.draw(canvas);
            d29Var.c(rect);
            d29Var.h = f;
            if (d8bVar.a == 1) {
                i = -1;
            } else {
                i = -16777216;
            }
            d29Var.d(i);
            d29Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z) {
        this.c.b(z);
    }

    @Override
    public final void c(View view) {
        d29 d29Var = this.c;
        if (d29Var.f == view) {
            return;
        }
        if (d29Var.g) {
            d29Var.b(false);
            d29Var.f = view;
            d29Var.b(true);
            return;
        }
        d29Var.f = view;
    }
}
