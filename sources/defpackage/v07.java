package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class v07 extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final w07 e;

    public v07(w07 w07Var, Context context) {
        super(context);
        this.e = w07Var;
        this.a = new GestureDetector(getContext(), new rm3(this, (byte) 1));
        this.b = new Path();
        this.c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height = getHeight();
        w07 w07Var = this.e;
        int i5 = w07Var.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w07Var.f;
        int i6 = w07Var.b;
        int c = (height - w07Var.c()) / 2;
        int width = getWidth();
        tr8 tr8Var = w07Var.h;
        int measuredWidth = (width - tr8Var.getMeasuredWidth()) / 2;
        tr8Var.layout(measuredWidth, c, tr8Var.getMeasuredWidth() + measuredWidth, tr8Var.getMeasuredHeight() + c);
        t07 t07Var = w07Var.n;
        t07Var.layout(tr8Var.getLeft(), tr8Var.getTop(), tr8Var.getRight(), t07Var.getMeasuredHeight() + tr8Var.getTop());
        int v = hg9.v(12.0f, tr8Var.getMeasuredHeight(), c);
        TextView textView = w07Var.d;
        textView.layout(gm.L(16.0f) + tr8Var.getLeft(), v, tr8Var.getRight() - gm.L(16.0f), textView.getMeasuredHeight() + v);
        int measuredHeight = textView.getMeasuredHeight() + v;
        TextView textView2 = w07Var.e;
        int i7 = 8;
        if (textView2.getVisibility() != 8) {
            int L = gm.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = gm.L(12.0f) + measuredHeight;
        w07Var.c.setBounds(tr8Var.getLeft() - i6, tr8Var.getTop() - i5, tr8Var.getRight() + i6, i5 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((tr8Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i6, L2, tr8Var.getRight() + i6, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i4) {
            i7 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i7);
        int L3 = gm.L(6.0f);
        RectF rectF = this.c;
        rectF.set(tr8Var.getLeft(), tr8Var.getTop(), tr8Var.getRight(), tr8Var.getTop() + (L3 << 1));
        Path path = this.b;
        path.reset();
        float f = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f, f, direction);
        rectF.set(i, tr8Var.getTop() + L3, i3, i4);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setWillNotDraw(false);
        super.onMeasure(i, i2);
        int min = Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)) - (gm.L(12.0f) << 1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        w07 w07Var = this.e;
        tr8 tr8Var = w07Var.h;
        tr8Var.measure(makeMeasureSpec, makeMeasureSpec);
        w07Var.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min - (gm.L(16.0f) << 1), 1073741824);
        w07Var.d.measure(makeMeasureSpec2, 0);
        w07Var.e.measure(makeMeasureSpec2, 0);
        w07Var.f.measure(View.MeasureSpec.makeMeasureSpec(tr8Var.getMeasuredWidth() + (w07Var.b << 1), Integer.MIN_VALUE), 0);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Point point = gm.q;
        int i5 = point.x;
        int i6 = point.y;
        w07 w07Var = this.e;
        if (i5 > i6) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i != i3 && i2 != i4) {
            if (!this.d) {
                w07Var.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
