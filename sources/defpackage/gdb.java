package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.LaunchActivity;
public final class gdb extends ViewGroup {
    public final LaunchActivity a;
    public final Rect b;
    public View c;
    public int d;
    public int e;
    public boolean f;

    public gdb(LaunchActivity launchActivity) {
        super(launchActivity);
        this.b = new Rect();
        this.a = launchActivity;
        setWillNotDraw(false);
    }

    public final void a(View view, Rect rect) {
        View view2 = this.c;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.c = view;
        Rect rect2 = this.b;
        if (rect != null) {
            rect2.set(rect);
        } else {
            rect2.setEmpty();
        }
        if (view != null && view.getParent() != this) {
            gl.B2(view);
            addView(view);
        }
        requestLayout();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c != null && this.f) {
            canvas.drawColor(-16777216);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c == null) {
            return;
        }
        if (!this.f) {
            Rect rect = this.b;
            if (!rect.isEmpty()) {
                this.c.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override
    public final void onMeasure(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdb.onMeasure(int, int):void");
    }
}
