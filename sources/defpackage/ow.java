package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o;
public final class ow extends View {
    public final pw a;

    public ow(pw pwVar, Activity activity) {
        super(activity);
        this.a = pwVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        pw pwVar = this.a;
        if (pwVar.e == null) {
            return;
        }
        int b = pwVar.c.b();
        int L2 = gm.L(4.0f) + hg9.y(6.0f, b - 1, gm.L(7.0f) * b);
        float f = pwVar.x + pwVar.w;
        if (L2 < getMeasuredWidth()) {
            L = (getMeasuredWidth() - L2) / 2.0f;
        } else {
            int L3 = gm.L(13.0f);
            int measuredWidth = ((getMeasuredWidth() - gm.L(8.0f)) / 2) / L3;
            L = gm.L(4.0f) - (Utilities.i(f - measuredWidth, Math.max(0, (b - (measuredWidth << 1)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i = 0; i < pwVar.e.items.size(); i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            float L4 = (gm.L(1.0f) * max) + gm.L(2.0f);
            o.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(gm.L(4.0f) + L + (gm.L(13.0f) * i), getMeasuredHeight() / 2.0f, L4, o.D1);
        }
        canvas.restore();
    }
}
