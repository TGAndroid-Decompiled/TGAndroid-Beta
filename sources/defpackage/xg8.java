package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class xg8 extends FrameLayout implements qr7 {
    public final wjb a;
    public final ArrayList b;
    public final wg8 c;
    public final wg8 d;
    public final wg8 e;
    public final boolean f;

    public xg8(Context context, wjb wjbVar) {
        super(context);
        c06[] values;
        this.b = new ArrayList();
        this.a = wjbVar;
        for (c06 c06Var : c06.values()) {
            if (c06Var.e) {
                this.b.add(c06Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            fa4.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f = true;
            return;
        }
        this.c = a(context, 0);
        this.d = a(context, 1);
        this.e = a(context, 2);
        setClipChildren(false);
    }

    public final wg8 a(Context context, int i) {
        c06 c06Var = (c06) this.b.get(i);
        ?? mrVar = new mr(context);
        bra braVar = new bra(20);
        mrVar.e = braVar;
        Paint paint = new Paint(1);
        mrVar.f = paint;
        braVar.r = (byte) 12;
        braVar.s = (byte) 8;
        braVar.t = (byte) 6;
        if (i == 1) {
            braVar.N = 1001;
        }
        if (i == 0) {
            braVar.N = 1002;
        }
        braVar.O = this.a;
        braVar.P = bkb.Pk;
        braVar.c();
        paint.setColor(-1);
        mrVar.setLayoutParams(nme.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        mrVar.setForeground(c06Var.c);
        mrVar.setBackgroundResource(c06Var.b);
        mrVar.setPadding(gl.L(8.0f));
        mrVar.setBackgroundOuterPadding(gl.L(32.0f));
        addView(mrVar);
        return mrVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int L = gl.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i3 = (int) (f * 0.95f);
        layoutParams2.rightMargin = i3;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i3;
    }

    @Override
    public void setOffset(float f) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f / getMeasuredWidth());
        float interpolation = s33.i.getInterpolation(abs);
        int right = getRight();
        wg8 wg8Var = this.e;
        wg8Var.setTranslationX(((wg8Var.getWidth() * 1.5f) + (right - wg8Var.getRight()) + gl.L(32.0f)) * interpolation);
        wg8Var.setTranslationY(gl.L(16.0f) * interpolation);
        float f2 = 1.0f;
        float i = Utilities.i(gl.R1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        wg8Var.setScaleX(i);
        wg8Var.setScaleY(i);
        int top = getTop();
        wg8 wg8Var2 = this.c;
        wg8Var2.setTranslationY((((top - wg8Var2.getTop()) - (wg8Var2.getHeight() * 1.8f)) - gl.L(32.0f)) * abs);
        wg8Var2.setTranslationX(gl.L(16.0f) * abs);
        float i2 = Utilities.i(gl.R1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        wg8Var2.setScaleX(i2);
        wg8Var2.setScaleY(i2);
        float interpolation2 = s33.g.getInterpolation(abs);
        int left = getLeft();
        wg8 wg8Var3 = this.d;
        wg8Var3.setTranslationX((((left - wg8Var3.getLeft()) - (wg8Var3.getWidth() * 2.5f)) + gl.L(32.0f)) * interpolation2);
        wg8Var3.setTranslationY(((wg8Var3.getHeight() * 2.5f) + (getBottom() - wg8Var3.getBottom()) + gl.L(32.0f)) * interpolation2);
        float i3 = Utilities.i(gl.R1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        wg8Var3.setScaleX(i3);
        wg8Var3.setScaleY(i3);
        if (abs < 0.4f) {
            f2 = abs / 0.4f;
        }
        wg8Var.h = f2;
        wg8Var2.h = f2;
        wg8Var3.h = f2;
    }
}
