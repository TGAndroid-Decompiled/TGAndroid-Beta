package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class ncb extends mcb {
    public final z9b a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final p39 c;
    public final qcb d;

    public ncb(qcb qcbVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = qcbVar;
        z9b z9bVar = new z9b(null);
        this.a = z9bVar;
        p39 p39Var = new p39(null);
        this.c = p39Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            z9bVar.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            z9bVar.a();
        }
        p39Var.i = true;
        p39Var.e(w49.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override
    public final void a(Canvas canvas, float f) {
        ImageReceiver imageReceiver;
        int i;
        p39 p39Var = this.c;
        wl wlVar = p39Var.b;
        if (wlVar != null) {
            imageReceiver = wlVar.k;
        } else {
            imageReceiver = p39Var.a;
        }
        if (imageReceiver != null && imageReceiver.D() && imageReceiver.C()) {
            b29 y = imageReceiver.y();
            if (y != null && y.t()) {
                return;
            }
            qcb qcbVar = this.d;
            double d = qcbVar.d;
            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
            float f2 = (float) (((mediaAreaCoordinates.x * d) / 100.0d) + qcbVar.b);
            double d2 = qcbVar.c;
            double d3 = qcbVar.e;
            float f3 = (float) (((mediaAreaCoordinates.y * d3) / 100.0d) + d2);
            float f4 = ((float) ((d * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
            float f5 = ((float) ((d3 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
            z9b z9bVar = this.a;
            z9bVar.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f4 + f2), (int) (f5 + f3));
            z9bVar.e = (int) (255.0f * f);
            canvas.save();
            double d4 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
            if (d4 != 0.0d) {
                canvas.rotate((float) d4, f2, f3);
            }
            Rect rect = hl.Q;
            float height = (z9bVar.getBounds().height() * 0.61f) / 2.0f;
            rect.set((int) (z9bVar.getBounds().centerX() - height), (int) (z9bVar.getBounds().centerY() - height), (int) (z9bVar.getBounds().centerX() + height), (int) (z9bVar.getBounds().centerY() + height));
            z9bVar.c(1.0f);
            z9bVar.draw(canvas);
            p39Var.c(rect);
            p39Var.h = f;
            if (z9bVar.a == 1) {
                i = -1;
            } else {
                i = -16777216;
            }
            p39Var.d(i);
            p39Var.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void b(boolean z) {
        this.c.b(z);
    }

    @Override
    public final void c(View view) {
        p39 p39Var = this.c;
        if (p39Var.f == view) {
            return;
        }
        if (p39Var.g) {
            p39Var.b(false);
            p39Var.f = view;
            p39Var.b(true);
            return;
        }
        p39Var.f = view;
    }
}
