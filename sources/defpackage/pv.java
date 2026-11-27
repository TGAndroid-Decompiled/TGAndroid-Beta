package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o;
public final class pv extends View {
    public final qv a;

    public pv(qv qvVar, Activity activity) {
        super(activity);
        this.a = qvVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        qv qvVar = this.a;
        if (qvVar.e == null) {
            return;
        }
        int b = qvVar.c.b();
        int L2 = hl.L(4.0f) + uh9.y(6.0f, b - 1, hl.L(7.0f) * b);
        float f = qvVar.x + qvVar.w;
        if (L2 < getMeasuredWidth()) {
            L = (getMeasuredWidth() - L2) / 2.0f;
        } else {
            int L3 = hl.L(13.0f);
            int measuredWidth = ((getMeasuredWidth() - hl.L(8.0f)) / 2) / L3;
            L = hl.L(4.0f) - (Utilities.i(f - measuredWidth, Math.max(0, (b - (measuredWidth << 1)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i = 0; i < qvVar.e.items.size(); i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            float L4 = (hl.L(1.0f) * max) + hl.L(2.0f);
            o.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(hl.L(4.0f) + L + (hl.L(13.0f) * i), getMeasuredHeight() / 2.0f, L4, o.D1);
        }
        canvas.restore();
    }
}
