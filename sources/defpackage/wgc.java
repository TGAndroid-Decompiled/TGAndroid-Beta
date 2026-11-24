package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class wgc extends FrameLayout {
    public static final int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final xgc f;

    public wgc(xgc xgcVar, Context context) {
        super(context);
        this.f = xgcVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new xi((byte) 23));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xgc xgcVar = this.f;
        aic aicVar = xgcVar.r;
        aic aicVar2 = xgcVar.s;
        aicVar.setPivotX(aicVar2.getMeasuredWidth());
        aicVar.setPivotY(aicVar2.getMeasuredHeight());
        aicVar.setTranslationX((1.0f / getScaleX()) * (-gl.L(4.0f)) * xgcVar.w);
        aicVar.setTranslationY((1.0f / getScaleY()) * (-gl.L(4.0f)) * xgcVar.w);
        aicVar.setRoundCorners((1.0f / getScaleY()) * gl.L(8.0f) * xgcVar.w);
        aicVar.setScaleX(((1.0f - xgcVar.w) * 0.6f) + 0.4f);
        aicVar.setScaleY(((1.0f - xgcVar.w) * 0.6f) + 0.4f);
        aicVar.setAlpha(Math.min(1.0f, 1.0f - xgcVar.w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = gl.L(16.0f);
        this.c = gl.L(16.0f);
        this.d = gl.L(60.0f);
        this.e = gl.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgc.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
