package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.ui.UsersSelectActivity;
public final class xd extends ScrollView {
    public final byte a;
    public final Object b;

    public xd(Context context, j85 j85Var) {
        super(context, null, 0, 2131755436);
        this.a = (byte) 2;
        this.b = j85Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j);
                BitmapDrawable[] bitmapDrawableArr = ((he) this.b).E;
                if (bitmapDrawableArr[0].getPaint().getAlpha() != 0) {
                    bitmapDrawableArr[0].setBounds(0, getScrollY(), getMeasuredWidth(), gm.L(3.0f) + getScrollY());
                    bitmapDrawableArr[0].draw(canvas);
                }
                if (bitmapDrawableArr[1].getPaint().getAlpha() != 0) {
                    bitmapDrawableArr[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - gm.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    bitmapDrawableArr[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                super.onMeasure(i, i2);
                setMeasuredDimension(((j85) obj).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
                it5 it5Var = (it5) obj;
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                if (!gm.O1() && size2 <= size) {
                    L = gm.L(56.0f);
                    it5Var.m2 = L;
                } else {
                    L = gm.L(144.0f);
                    it5Var.m2 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                return;
            case 4:
            default:
                super.onMeasure(i, i2);
                return;
            case 5:
                ((xz7) obj).t0 = View.MeasureSpec.getSize(i2) - gm.L(30.0f);
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i, rect);
        }
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onScrollChanged(i, i2, i3, i4);
                ((os0) this.b).a();
                return;
            default:
                super.onScrollChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                int i = ((mh6) obj).a;
                if (i == 1 || i == 2 || i == 4) {
                    rect.bottom = gm.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z);
            case 5:
                byte b2 = ((xz7) obj).J1;
                if (b2 == 1 || b2 == 2 || b2 == 4) {
                    rect.bottom = gm.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (usersSelectActivity.w) {
                    usersSelectActivity.w = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = hg9.v(20.0f, usersSelectActivity.S, rect.top);
                rect.bottom = hg9.v(50.0f, usersSelectActivity.S, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z);
        }
    }

    public xd(Context context, os0 os0Var) {
        super(context);
        this.a = (byte) 1;
        this.b = os0Var;
    }

    public xd(jm7 jm7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = jm7Var;
    }
}
