package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class mqa extends FrameLayout {
    public final sna a;
    public final lqa b;
    public final lqa c;
    public final lqa d;
    public boolean e;
    public final xl3 f;
    public final RectF h;

    public mqa(Context context, wjb wjbVar, sna snaVar) {
        super(context);
        this.f = new xl3((byte) 7);
        this.h = new RectF();
        this.a = snaVar;
        lqa lqaVar = new lqa(context, wjbVar);
        this.b = lqaVar;
        lqa lqaVar2 = new lqa(context, wjbVar);
        this.c = lqaVar2;
        lqa lqaVar3 = new lqa(context, wjbVar);
        this.d = lqaVar3;
        addView(lqaVar, nme.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(lqaVar2, nme.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(lqaVar3, nme.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(cqa cqaVar, float f, boolean z, cqa cqaVar2, float f2, boolean z2, cqa cqaVar3, float f3, boolean z3) {
        float f4;
        sna snaVar = this.a;
        lqa lqaVar = this.b;
        if (cqaVar != null) {
            if (z) {
                f = Math.max(0.5f, f);
            }
            lqaVar.setVisibility(0);
            lqaVar.e(cqaVar.a, cqaVar.b, snaVar);
            lqaVar.setTranslationY(gl.L(36.0f) * ((f - 0.5f) / 1.5f));
        } else {
            lqaVar.setVisibility(4);
        }
        lqa lqaVar2 = this.c;
        if (cqaVar2 != null) {
            if (z2) {
                f4 = Math.max(0.5f, f2);
            } else {
                f4 = f2;
            }
            float f5 = (f4 - 0.5f) / 1.5f;
            lqaVar2.setVisibility(0);
            lqaVar2.e(cqaVar2.a, cqaVar2.b, snaVar);
            lqaVar2.setTranslationY(gl.L(36.0f) * f5);
            if (z2 && f5 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jk(lqaVar2, (byte) 1));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            lqaVar2.setVisibility(4);
        }
        lqa lqaVar3 = this.d;
        if (cqaVar3 != null) {
            float f6 = f3;
            if (z3) {
                f6 = Math.max(0.5f, f6);
            }
            lqaVar3.setVisibility(0);
            lqaVar3.e(cqaVar3.a, cqaVar3.b, snaVar);
            lqaVar3.setTranslationY(gl.L(36.0f) * ((f6 - 0.5f) / 1.5f));
            return;
        }
        lqaVar3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), gl.L(8.0f));
        xl3 xl3Var = this.f;
        xl3Var.s(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - gl.L(8.0f), getWidth(), getHeight());
        xl3Var.s(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(37.66f), 1073741824));
    }
}
