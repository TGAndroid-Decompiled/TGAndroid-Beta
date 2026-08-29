package bg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
public abstract class j extends FrameLayout {
    public final Paint f2324a;
    public final Paint f2325b;
    public final Paint f2326c;
    public int d;
    public final d6 f2327e;
    public boolean f2328f;
    public final k h;

    public j(k kVar, Context context) {
        super(context);
        this.h = kVar;
        Paint paint = new Paint(1);
        this.f2324a = paint;
        Paint paint2 = new Paint(1);
        this.f2325b = paint2;
        Paint paint3 = new Paint(1);
        this.f2326c = paint3;
        this.f2327e = new d6(this, 0L, 250L, jr.h);
        this.f2328f = true;
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

    public abstract int a(float f9, float f10);

    public final void b() {
        k kVar = this.h;
        hk0 selectionBounds = kVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f29195a;
        layoutParams.topMargin = (int) selectionBounds.f29196b;
        layoutParams.width = (int) selectionBounds.f29197c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(kVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f2327e.e(this.f2328f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: bg.j.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
