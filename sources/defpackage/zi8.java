package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zi8 extends FrameLayout implements rt7 {
    public final ylb a;
    public final ArrayList b;
    public final yi8 c;
    public final yi8 d;
    public final yi8 e;
    public final boolean f;

    public zi8(Context context, ylb ylbVar) {
        super(context);
        c26[] values;
        this.b = new ArrayList();
        this.a = ylbVar;
        for (c26 c26Var : c26.values()) {
            if (c26Var.e) {
                this.b.add(c26Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            fc4.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f = true;
            return;
        }
        this.c = a(context, 0);
        this.d = a(context, 1);
        this.e = a(context, 2);
        setClipChildren(false);
    }

    public final yi8 a(Context context, int i) {
        c26 c26Var = (c26) this.b.get(i);
        ?? msVar = new ms(context);
        cta ctaVar = new cta(20);
        msVar.e = ctaVar;
        Paint paint = new Paint(1);
        msVar.f = paint;
        ctaVar.r = (byte) 12;
        ctaVar.s = (byte) 8;
        ctaVar.t = (byte) 6;
        if (i == 1) {
            ctaVar.N = 1001;
        }
        if (i == 0) {
            ctaVar.N = 1002;
        }
        ctaVar.O = this.a;
        ctaVar.P = cmb.Pk;
        ctaVar.c();
        paint.setColor(-1);
        msVar.setLayoutParams(qoe.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        msVar.setForeground(c26Var.c);
        msVar.setBackgroundResource(c26Var.b);
        msVar.setPadding(gm.L(8.0f));
        msVar.setBackgroundOuterPadding(gm.L(32.0f));
        addView(msVar);
        return msVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int L = gm.L(76.0f);
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
        float interpolation = d53.i.getInterpolation(abs);
        int right = getRight();
        yi8 yi8Var = this.e;
        yi8Var.setTranslationX(((yi8Var.getWidth() * 1.5f) + (right - yi8Var.getRight()) + gm.L(32.0f)) * interpolation);
        yi8Var.setTranslationY(gm.L(16.0f) * interpolation);
        float f2 = 1.0f;
        float i = Utilities.i(gm.R1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        yi8Var.setScaleX(i);
        yi8Var.setScaleY(i);
        int top = getTop();
        yi8 yi8Var2 = this.c;
        yi8Var2.setTranslationY((((top - yi8Var2.getTop()) - (yi8Var2.getHeight() * 1.8f)) - gm.L(32.0f)) * abs);
        yi8Var2.setTranslationX(gm.L(16.0f) * abs);
        float i2 = Utilities.i(gm.R1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        yi8Var2.setScaleX(i2);
        yi8Var2.setScaleY(i2);
        float interpolation2 = d53.g.getInterpolation(abs);
        int left = getLeft();
        yi8 yi8Var3 = this.d;
        yi8Var3.setTranslationX((((left - yi8Var3.getLeft()) - (yi8Var3.getWidth() * 2.5f)) + gm.L(32.0f)) * interpolation2);
        yi8Var3.setTranslationY(((yi8Var3.getHeight() * 2.5f) + (getBottom() - yi8Var3.getBottom()) + gm.L(32.0f)) * interpolation2);
        float i3 = Utilities.i(gm.R1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        yi8Var3.setScaleX(i3);
        yi8Var3.setScaleY(i3);
        if (abs < 0.4f) {
            f2 = abs / 0.4f;
        }
        yi8Var.h = f2;
        yi8Var2.h = f2;
        yi8Var3.h = f2;
    }
}
