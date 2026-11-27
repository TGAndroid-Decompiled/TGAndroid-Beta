package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class clc extends FrameLayout {
    public static final int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final dlc f;

    public clc(dlc dlcVar, Context context) {
        super(context);
        this.f = dlcVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new yi((byte) 22));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dlc dlcVar = this.f;
        hmc hmcVar = dlcVar.r;
        hmc hmcVar2 = dlcVar.s;
        hmcVar.setPivotX(hmcVar2.getMeasuredWidth());
        hmcVar.setPivotY(hmcVar2.getMeasuredHeight());
        hmcVar.setTranslationX((1.0f / getScaleX()) * (-hl.L(4.0f)) * dlcVar.w);
        hmcVar.setTranslationY((1.0f / getScaleY()) * (-hl.L(4.0f)) * dlcVar.w);
        hmcVar.setRoundCorners((1.0f / getScaleY()) * hl.L(8.0f) * dlcVar.w);
        hmcVar.setScaleX(((1.0f - dlcVar.w) * 0.6f) + 0.4f);
        hmcVar.setScaleY(((1.0f - dlcVar.w) * 0.6f) + 0.4f);
        hmcVar.setAlpha(Math.min(1.0f, 1.0f - dlcVar.w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = hl.L(16.0f);
        this.c = hl.L(16.0f);
        this.d = hl.L(60.0f);
        this.e = hl.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clc.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
