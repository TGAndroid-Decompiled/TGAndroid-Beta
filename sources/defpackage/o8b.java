package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class o8b extends n8b {
    public final b6b a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final b09 c;
    public final r8b d;

    public o8b(r8b r8bVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = r8bVar;
        b6b b6bVar = new b6b(null);
        this.a = b6bVar;
        b09 b09Var = new b09(null);
        this.c = b09Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            b6bVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            b6bVar.a();
        }
        b09Var.i = true;
        b09Var.e(h19.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f) {
        ImageReceiver imageReceiver;
        int i;
        b09 b09Var = this.c;
        vl vlVar = b09Var.b;
        if (vlVar != null) {
            imageReceiver = vlVar.k;
        } else {
            imageReceiver = b09Var.a;
        }
        if (imageReceiver != null && imageReceiver.D() && imageReceiver.C()) {
            oy8 y = imageReceiver.y();
            if (y != null && y.t()) {
                return;
            }
            r8b r8bVar = this.d;
            double d = r8bVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f2 = (float) (((mediaAreaCoordinates.x * d) / 100.0d) + r8bVar.b);
            double d2 = r8bVar.c;
            double d3 = r8bVar.e;
            float f3 = (float) (((mediaAreaCoordinates.y * d3) / 100.0d) + d2);
            float f4 = ((float) ((d * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
            float f5 = ((float) ((d3 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            b6b b6bVar = this.a;
            b6bVar.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f4 + f2), (int) (f5 + f3));
            b6bVar.e = (int) (255.0f * f);
            canvas.save();
            double d4 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d4 != 0.0d) {
                canvas.rotate((float) d4, f2, f3);
            }
            Rect rect = gl.Q;
            float height = (b6bVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (b6bVar.getBounds().centerX() - height), (int) (b6bVar.getBounds().centerY() - height), (int) (b6bVar.getBounds().centerX() + height), (int) (b6bVar.getBounds().centerY() + height));
            b6bVar.c(1.0f);
            b6bVar.draw(canvas);
            b09Var.c(rect);
            b09Var.h = f;
            if (b6bVar.a == 1) {
                i = -1;
            } else {
                i = -16777216;
            }
            b09Var.d(i);
            b09Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z) {
        this.c.b(z);
    }

    @Override
    public final void c(View view) {
        b09 b09Var = this.c;
        if (b09Var.f == view) {
            return;
        }
        if (b09Var.g) {
            b09Var.b(false);
            b09Var.f = view;
            b09Var.b(true);
            return;
        }
        b09Var.f = view;
    }
}
