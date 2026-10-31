package jg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.t5;
public abstract class i extends FrameLayout {
    public final Paint f10011a;
    public final Paint f10012b;
    public final Paint f10013c;
    public int d;
    public final t5 e;
    public boolean f10014f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f10011a = paint;
        Paint paint2 = new Paint(1);
        this.f10012b = paint2;
        Paint paint3 = new Paint(1);
        this.f10013c = paint3;
        this.e = new t5(this, 0L, 250L, gr.h);
        this.f10014f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.i0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.N(2.66f));
        paint3.setShadowLayer(org.telegram.messenger.i0.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f7, float f10);

    public final void b() {
        j jVar = this.h;
        oj0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f29084a;
        layoutParams.topMargin = (int) selectionBounds.f29085b;
        layoutParams.width = (int) selectionBounds.f29086c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.d(this.f10014f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: jg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
