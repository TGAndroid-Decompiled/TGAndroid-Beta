package kh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xh0;
public final class t extends ViewGroup {
    public final GestureDetector f11289a;
    public final Path f11290b;
    public final RectF f11291c;
    public boolean d;
    public final u f11292e;

    public t(u uVar, Context context) {
        super(context);
        this.f11292e = uVar;
        this.f11289a = new GestureDetector(getContext(), new s(this));
        this.f11290b = new Path();
        this.f11291c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f11290b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f11292e.f11295c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        u uVar = this.f11292e;
        int i14 = uVar.f11293a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f11297f;
        int i15 = uVar.f11294b;
        int d = (height - uVar.d()) / 2;
        int width = getWidth();
        xh0 xh0Var = uVar.h;
        int measuredWidth = (width - xh0Var.getMeasuredWidth()) / 2;
        xh0Var.layout(measuredWidth, d, xh0Var.getMeasuredWidth() + measuredWidth, xh0Var.getMeasuredHeight() + d);
        q qVar = uVar.f11298n;
        qVar.layout(xh0Var.getLeft(), xh0Var.getTop(), xh0Var.getRight(), qVar.getMeasuredHeight() + xh0Var.getTop());
        int C = y3.C(12.0f, xh0Var.getMeasuredHeight(), d);
        TextView textView = uVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + xh0Var.getLeft(), C, xh0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = uVar.f11296e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        uVar.f11295c.setBounds(xh0Var.getLeft() - i15, xh0Var.getTop() - i14, xh0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((xh0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, xh0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + xh0Var.getTop();
        RectF rectF = this.f11291c;
        rectF.set(xh0Var.getLeft(), xh0Var.getTop(), xh0Var.getRight(), top);
        Path path = this.f11290b;
        path.reset();
        float f10 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i10, xh0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int z4 = org.telegram.ui.b.z(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z4, Integer.MIN_VALUE);
        u uVar = this.f11292e;
        xh0 xh0Var = uVar.h;
        xh0Var.measure(makeMeasureSpec, makeMeasureSpec);
        uVar.f11298n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(z4 - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        uVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        uVar.f11296e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        uVar.f11297f.measure(View.MeasureSpec.makeMeasureSpec((uVar.f11294b * 2) + xh0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        u uVar = this.f11292e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 != i12 && i11 != i13) {
            if (!this.d) {
                uVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f11289a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f11292e.f11295c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
