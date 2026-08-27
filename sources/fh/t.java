package fh;

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
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ch0;

public final class t extends ViewGroup {

    public final GestureDetector f6158a;

    public final Path f6159b;

    public final RectF f6160c;
    public boolean d;

    public final u f6161e;

    public t(u uVar, Context context) {
        super(context);
        this.f6161e = uVar;
        this.f6158a = new GestureDetector(getContext(), new s(this));
        this.f6159b = new Path();
        this.f6160c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f6159b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f6161e.f6164c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        u uVar = this.f6161e;
        int i14 = uVar.f6162a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f6166f;
        int i15 = uVar.f6163b;
        int iD = (height - uVar.d()) / 2;
        int width = getWidth();
        ch0 ch0Var = uVar.h;
        int measuredWidth = (width - ch0Var.getMeasuredWidth()) / 2;
        ch0Var.layout(measuredWidth, iD, ch0Var.getMeasuredWidth() + measuredWidth, ch0Var.getMeasuredHeight() + iD);
        q qVar = uVar.f6167n;
        qVar.layout(ch0Var.getLeft(), ch0Var.getTop(), ch0Var.getRight(), qVar.getMeasuredHeight() + ch0Var.getTop());
        int iC = y1.C(12.0f, ch0Var.getMeasuredHeight(), iD);
        TextView textView = uVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + ch0Var.getLeft(), iC, ch0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + iC);
        int measuredHeight = textView.getMeasuredHeight() + iC;
        TextView textView2 = uVar.f6165e;
        if (textView2.getVisibility() != 8) {
            int iDp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), iDp, textView.getRight(), textView2.getMeasuredHeight() + iDp);
            measuredHeight = textView2.getMeasuredHeight() + iDp;
        }
        int iDp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        uVar.f6164c.setBounds(ch0Var.getLeft() - i15, ch0Var.getTop() - i14, ch0Var.getRight() + i15, i14 + iDp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ch0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, iDp2, ch0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + iDp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13 ? 0 : 8);
        int iDp3 = AndroidUtilities.dp(6.0f);
        float left = ch0Var.getLeft();
        float top = ch0Var.getTop();
        float right = ch0Var.getRight();
        float top2 = (iDp3 * 2) + ch0Var.getTop();
        RectF rectF = this.f6160c;
        rectF.set(left, top, right, top2);
        Path path = this.f6159b;
        path.reset();
        float f10 = iDp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i10, ch0Var.getTop() + iDp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int iZ = rl.z(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (((double) getMeasuredHeight()) * 0.66d)));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iZ, Integer.MIN_VALUE);
        u uVar = this.f6161e;
        ch0 ch0Var = uVar.h;
        ch0Var.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        uVar.f6167n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iZ - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        uVar.d.measure(iMakeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        uVar.f6165e.measure(iMakeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        uVar.f6166f.measure(View.MeasureSpec.makeMeasureSpec((uVar.f6163b * 2) + ch0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        u uVar = this.f6161e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 == i12 || i11 == i13) {
            return;
        }
        if (!this.d) {
            uVar.f();
        }
        this.d = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f6158a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f6161e.f6164c || super.verifyDrawable(drawable);
    }
}
