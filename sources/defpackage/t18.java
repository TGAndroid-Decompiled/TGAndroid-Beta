package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.p;
public final class t18 extends FrameLayout {
    public final Paint a;
    public float b;
    public zna c;
    public final p d;

    public t18(p pVar, Context context) {
        super(context);
        this.d = pVar;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        float f;
        float f2;
        zna znaVar = this.c;
        if (znaVar != null) {
            znaVar.d();
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
            zna znaVar2 = new zna(new xk4(f3 * 100.0f));
            aoa aoaVar = new aoa(f * 100.0f);
            if (z) {
                f2 = 500.0f;
            } else {
                f2 = 650.0f;
            }
            aoaVar.b(f2);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            this.c = znaVar2;
            znaVar2.b(new h20(this, (byte) 10));
            this.c.a(new hx0(this, (byte) 5));
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
        int i = cmb.N6;
        p pVar = this.d;
        canvas.drawColor(pVar.getThemedColor(i));
        int themedColor = pVar.getThemedColor(cmb.Ui);
        Paint paint = this.a;
        paint.setColor(themedColor);
        if (jb6.a0) {
            L = getWidth() - gm.L(28.0f);
        } else {
            L = gm.L(28.0f);
        }
        canvas.drawCircle(L, -gm.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
