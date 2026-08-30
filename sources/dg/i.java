package dg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z5;
public abstract class i extends FrameLayout {
    public final Paint f4563a;
    public final Paint f4564b;
    public final Paint f4565c;
    public int d;
    public final z5 e;
    public boolean f4566f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f4563a = paint;
        Paint paint2 = new Paint(1);
        this.f4564b = paint2;
        Paint paint3 = new Paint(1);
        this.f4565c = paint3;
        this.e = new z5(this, 0L, 250L, nr.h);
        this.f4566f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint3.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f10, float f11);

    public final void b() {
        j jVar = this.h;
        sk0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f28722a;
        layoutParams.topMargin = (int) selectionBounds.f28723b;
        layoutParams.width = (int) selectionBounds.f28724c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.e(this.f4566f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: dg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
