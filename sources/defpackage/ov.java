package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o;
public final class ov extends View {
    public final pv a;

    public ov(pv pvVar, Activity activity) {
        super(activity);
        this.a = pvVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        pv pvVar = this.a;
        if (pvVar.e == null) {
            return;
        }
        int b = pvVar.c.b();
        int L2 = gl.L(4.0f) + de9.y(6.0f, b - 1, gl.L(7.0f) * b);
        float f = pvVar.x + pvVar.w;
        if (L2 < getMeasuredWidth()) {
            L = (getMeasuredWidth() - L2) / 2.0f;
        } else {
            int L3 = gl.L(13.0f);
            int measuredWidth = ((getMeasuredWidth() - gl.L(8.0f)) / 2) / L3;
            L = gl.L(4.0f) - (Utilities.i(f - measuredWidth, Math.max(0, (b - (measuredWidth << 1)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i = 0; i < pvVar.e.items.size(); i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            float L4 = (gl.L(1.0f) * max) + gl.L(2.0f);
            o.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(gl.L(4.0f) + L + (gl.L(13.0f) * i), getMeasuredHeight() / 2.0f, L4, o.D1);
        }
        canvas.restore();
    }
}
