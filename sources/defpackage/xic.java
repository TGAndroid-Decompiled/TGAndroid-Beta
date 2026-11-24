package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class xic extends FrameLayout {
    public static final int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final yic f;

    public xic(yic yicVar, Context context) {
        super(context);
        this.f = yicVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new xj((byte) 23));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yic yicVar = this.f;
        akc akcVar = yicVar.r;
        akc akcVar2 = yicVar.s;
        akcVar.setPivotX(akcVar2.getMeasuredWidth());
        akcVar.setPivotY(akcVar2.getMeasuredHeight());
        akcVar.setTranslationX((1.0f / getScaleX()) * (-gm.L(4.0f)) * yicVar.w);
        akcVar.setTranslationY((1.0f / getScaleY()) * (-gm.L(4.0f)) * yicVar.w);
        akcVar.setRoundCorners((1.0f / getScaleY()) * gm.L(8.0f) * yicVar.w);
        akcVar.setScaleX(((1.0f - yicVar.w) * 0.6f) + 0.4f);
        akcVar.setScaleY(((1.0f - yicVar.w) * 0.6f) + 0.4f);
        akcVar.setAlpha(Math.min(1.0f, 1.0f - yicVar.w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = gm.L(16.0f);
        this.c = gm.L(16.0f);
        this.d = gm.L(60.0f);
        this.e = gm.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xic.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
