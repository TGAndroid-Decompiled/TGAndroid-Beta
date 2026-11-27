package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.p;
public final class w28 extends FrameLayout {
    public final Paint a;
    public float b;
    public vpa c;
    public final p d;

    public w28(p pVar, Context context) {
        super(context);
        this.d = pVar;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        float f;
        float f2;
        vpa vpaVar = this.c;
        if (vpaVar != null) {
            vpaVar.d();
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2) {
            float f3 = this.b;
            if (f3 == f) {
                return;
            }
            vpa vpaVar2 = new vpa(new xk4(f3 * 100.0f));
            wpa wpaVar = new wpa(f * 100.0f);
            if (z) {
                f2 = 500.0f;
            } else {
                f2 = 650.0f;
            }
            wpaVar.b(f2);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            this.c = vpaVar2;
            vpaVar2.b(new i10(this, (byte) 11));
            this.c.a(new iw0(this, (byte) 6));
            this.c.h();
            return;
        }
        this.b = f;
        TextView textView = this.d.V;
        if (textView != null) {
            textView.setAlpha((f * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        super.onDraw(canvas);
        int i = aob.O6;
        p pVar = this.d;
        canvas.drawColor(pVar.getThemedColor(i));
        int themedColor = pVar.getThemedColor(aob.Vi);
        Paint paint = this.a;
        paint.setColor(themedColor);
        if (ob6.a0) {
            L = getWidth() - hl.L(28.0f);
        } else {
            L = hl.L(28.0f);
        }
        canvas.drawCircle(L, -hl.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
