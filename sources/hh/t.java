package hh;

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
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kh0;
public final class t extends ViewGroup {
    public final GestureDetector f8105a;
    public final Path f8106b;
    public final RectF f8107c;
    public boolean d;
    public final u f8108e;

    public t(u uVar, Context context) {
        super(context);
        this.f8108e = uVar;
        this.f8105a = new GestureDetector(getContext(), new s(this));
        this.f8106b = new Path();
        this.f8107c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f8106b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f8108e.f8111c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        u uVar = this.f8108e;
        int i14 = uVar.f8109a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f8113f;
        int i15 = uVar.f8110b;
        int d = (height - uVar.d()) / 2;
        int width = getWidth();
        kh0 kh0Var = uVar.h;
        int measuredWidth = (width - kh0Var.getMeasuredWidth()) / 2;
        kh0Var.layout(measuredWidth, d, kh0Var.getMeasuredWidth() + measuredWidth, kh0Var.getMeasuredHeight() + d);
        q qVar = uVar.f8114n;
        qVar.layout(kh0Var.getLeft(), kh0Var.getTop(), kh0Var.getRight(), qVar.getMeasuredHeight() + kh0Var.getTop());
        int C = x3.C(12.0f, kh0Var.getMeasuredHeight(), d);
        TextView textView = uVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + kh0Var.getLeft(), C, kh0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = uVar.f8112e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        uVar.f8111c.setBounds(kh0Var.getLeft() - i15, kh0Var.getTop() - i14, kh0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((kh0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, kh0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + kh0Var.getTop();
        RectF rectF = this.f8107c;
        rectF.set(kh0Var.getLeft(), kh0Var.getTop(), kh0Var.getRight(), top);
        Path path = this.f8106b;
        path.reset();
        float f9 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f9, f9, direction);
        rectF.set(i10, kh0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int z10 = org.telegram.ui.b.z(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z10, Integer.MIN_VALUE);
        u uVar = this.f8108e;
        kh0 kh0Var = uVar.h;
        kh0Var.measure(makeMeasureSpec, makeMeasureSpec);
        uVar.f8114n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(z10 - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        uVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        uVar.f8112e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        uVar.f8113f.measure(View.MeasureSpec.makeMeasureSpec((uVar.f8110b * 2) + kh0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        u uVar = this.f8108e;
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
        return this.f8105a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f8108e.f8111c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
