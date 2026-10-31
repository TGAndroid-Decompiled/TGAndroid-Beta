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
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ug0;
public final class o extends ViewGroup {
    public final GestureDetector f14279a;
    public final Path f14280b;
    public final RectF f14281c;
    public boolean d;
    public final p e;

    public o(p pVar, Context context) {
        super(context);
        this.e = pVar;
        this.f14279a = new GestureDetector(getContext(), new lg.f(1, this));
        this.f14280b = new Path();
        this.f14281c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f14280b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f14284c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        p pVar = this.e;
        int i14 = pVar.f14282a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pVar.f14285f;
        int i15 = pVar.f14283b;
        int d = (height - pVar.d()) / 2;
        int width = getWidth();
        ug0 ug0Var = pVar.h;
        int measuredWidth = (width - ug0Var.getMeasuredWidth()) / 2;
        ug0Var.layout(measuredWidth, d, ug0Var.getMeasuredWidth() + measuredWidth, ug0Var.getMeasuredHeight() + d);
        m mVar = pVar.f14286n;
        mVar.layout(ug0Var.getLeft(), ug0Var.getTop(), ug0Var.getRight(), mVar.getMeasuredHeight() + ug0Var.getTop());
        int C = m5.C(12.0f, ug0Var.getMeasuredHeight(), d);
        TextView textView = pVar.d;
        textView.layout(i0.L(16.0f) + ug0Var.getLeft(), C, ug0Var.getRight() - i0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = pVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int L = i0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = i0.L(12.0f) + measuredHeight;
        pVar.f14284c.setBounds(ug0Var.getLeft() - i15, ug0Var.getTop() - i14, ug0Var.getRight() + i15, i14 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ug0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, L2, ug0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int L3 = i0.L(6.0f);
        float top = (L3 * 2) + ug0Var.getTop();
        RectF rectF = this.f14281c;
        rectF.set(ug0Var.getLeft(), ug0Var.getTop(), ug0Var.getRight(), top);
        Path path = this.f14280b;
        path.reset();
        float f7 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, ug0Var.getTop() + L3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int A = z20.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        p pVar = this.e;
        ug0 ug0Var = pVar.h;
        ug0Var.measure(makeMeasureSpec, makeMeasureSpec);
        pVar.f14286n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (i0.L(16.0f) * 2), 1073741824);
        pVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        pVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        pVar.f14285f.measure(View.MeasureSpec.makeMeasureSpec((pVar.f14283b * 2) + ug0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = i0.f16026q;
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
        return this.f14279a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f14284c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
