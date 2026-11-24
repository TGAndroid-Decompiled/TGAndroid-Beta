package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.p;
public final class qz7 extends FrameLayout {
    public final Paint a;
    public float b;
    public yla c;
    public final p d;

    public qz7(p pVar, Context context) {
        super(context);
        this.d = pVar;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        float f;
        float f2;
        yla ylaVar = this.c;
        if (ylaVar != null) {
            ylaVar.d();
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
            yla ylaVar2 = new yla(new ti4(f3 * 100.0f));
            zla zlaVar = new zla(f * 100.0f);
            if (z) {
                f2 = 500.0f;
            } else {
                f2 = 650.0f;
            }
            zlaVar.b(f2);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            this.c = ylaVar2;
            ylaVar2.b(new h10(this, (byte) 10));
            this.c.a(new zv0(this, (byte) 5));
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
        int i = bkb.N6;
        p pVar = this.d;
        canvas.drawColor(pVar.getThemedColor(i));
        int themedColor = pVar.getThemedColor(bkb.Ui);
        Paint paint = this.a;
        paint.setColor(themedColor);
        if (k96.a0) {
            L = getWidth() - gl.L(28.0f);
        } else {
            L = gl.L(28.0f);
        }
        canvas.drawCircle(L, -gl.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
