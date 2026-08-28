package eh;

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
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ah0;
public final class v extends ViewGroup {
    public final GestureDetector f5231a;
    public final Path f5232b;
    public final RectF f5233c;
    public boolean d;
    public final w f5234e;

    public v(w wVar, Context context) {
        super(context);
        this.f5234e = wVar;
        this.f5231a = new GestureDetector(getContext(), new u(this));
        this.f5232b = new Path();
        this.f5233c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f5232b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f5234e.f5237c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int height = getHeight();
        w wVar = this.f5234e;
        int i13 = wVar.f5235a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wVar.f5239f;
        int i14 = wVar.f5236b;
        int d = (height - wVar.d()) / 2;
        int width = getWidth();
        ah0 ah0Var = wVar.h;
        int measuredWidth = (width - ah0Var.getMeasuredWidth()) / 2;
        ah0Var.layout(measuredWidth, d, ah0Var.getMeasuredWidth() + measuredWidth, ah0Var.getMeasuredHeight() + d);
        s sVar = wVar.f5240n;
        sVar.layout(ah0Var.getLeft(), ah0Var.getTop(), ah0Var.getRight(), sVar.getMeasuredHeight() + ah0Var.getTop());
        int C = l0.C(12.0f, ah0Var.getMeasuredHeight(), d);
        TextView textView = wVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + ah0Var.getLeft(), C, ah0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = wVar.f5238e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        wVar.f5237c.setBounds(ah0Var.getLeft() - i14, ah0Var.getTop() - i13, ah0Var.getRight() + i14, i13 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ah0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, dp2, ah0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + ah0Var.getTop();
        RectF rectF = this.f5233c;
        rectF.set(ah0Var.getLeft(), ah0Var.getTop(), ah0Var.getRight(), top);
        Path path = this.f5232b;
        path.reset();
        float f10 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i9, ah0Var.getTop() + dp3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i9, i10);
        int A = ll.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        w wVar = this.f5234e;
        ah0 ah0Var = wVar.h;
        ah0Var.measure(makeMeasureSpec, makeMeasureSpec);
        wVar.f5240n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        wVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        wVar.f5238e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        wVar.f5239f.measure(View.MeasureSpec.makeMeasureSpec((wVar.f5236b * 2) + ah0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x;
        int i14 = point.y;
        w wVar = this.f5234e;
        if (i13 > i14) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i9 != i11 && i10 != i12) {
            if (!this.d) {
                wVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f5231a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f5234e.f5237c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
