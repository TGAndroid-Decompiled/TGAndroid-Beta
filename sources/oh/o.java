package oh;

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
import org.telegram.messenger.a30;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.vg0;
public final class o extends ViewGroup {
    public final GestureDetector f14280a;
    public final Path f14281b;
    public final RectF f14282c;
    public boolean d;
    public final p e;

    public o(p pVar, Context context) {
        super(context);
        this.e = pVar;
        this.f14280a = new GestureDetector(getContext(), new lg.f(1, this));
        this.f14281b = new Path();
        this.f14282c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f14281b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f14285c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        p pVar = this.e;
        int i14 = pVar.f14283a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pVar.f14286f;
        int i15 = pVar.f14284b;
        int d = (height - pVar.d()) / 2;
        int width = getWidth();
        vg0 vg0Var = pVar.h;
        int measuredWidth = (width - vg0Var.getMeasuredWidth()) / 2;
        vg0Var.layout(measuredWidth, d, vg0Var.getMeasuredWidth() + measuredWidth, vg0Var.getMeasuredHeight() + d);
        m mVar = pVar.f14287n;
        mVar.layout(vg0Var.getLeft(), vg0Var.getTop(), vg0Var.getRight(), mVar.getMeasuredHeight() + vg0Var.getTop());
        int C = m5.C(12.0f, vg0Var.getMeasuredHeight(), d);
        TextView textView = pVar.d;
        textView.layout(i0.L(16.0f) + vg0Var.getLeft(), C, vg0Var.getRight() - i0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = pVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int L = i0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = i0.L(12.0f) + measuredHeight;
        pVar.f14285c.setBounds(vg0Var.getLeft() - i15, vg0Var.getTop() - i14, vg0Var.getRight() + i15, i14 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((vg0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, L2, vg0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int L3 = i0.L(6.0f);
        float top = (L3 * 2) + vg0Var.getTop();
        RectF rectF = this.f14282c;
        rectF.set(vg0Var.getLeft(), vg0Var.getTop(), vg0Var.getRight(), top);
        Path path = this.f14281b;
        path.reset();
        float f7 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, vg0Var.getTop() + L3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int A = a30.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        p pVar = this.e;
        vg0 vg0Var = pVar.h;
        vg0Var.measure(makeMeasureSpec, makeMeasureSpec);
        pVar.f14287n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (i0.L(16.0f) * 2), 1073741824);
        pVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        pVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        pVar.f14286f.measure(View.MeasureSpec.makeMeasureSpec((pVar.f14284b * 2) + vg0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = i0.f16172q;
        int i14 = point.x;
        int i15 = point.y;
        p pVar = this.e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 != i12 && i11 != i13) {
            if (!this.d) {
                pVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f14280a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f14285c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
