package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
public class r1 extends ListView {
    public final Rect f15647a;
    public int f15648b;
    public int f15649c;
    public int d;
    public int f15650e;
    public int f15651f;
    public p1 h;
    public boolean f15652n;
    public final boolean f15653r;
    public boolean f15654s;
    public u0.d v;
    public androidx.activity.i f15655w;

    public r1(Context context, boolean z10) {
        super(context, null, 2130968772);
        this.f15647a = new Rect();
        this.f15648b = 0;
        this.f15649c = 0;
        this.d = 0;
        this.f15650e = 0;
        this.f15653r = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            if (i15 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    public final boolean b(int r18, android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: m.r1.b(int, android.view.MotionEvent):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f15647a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        if (this.f15655w == null) {
            super.drawableStateChanged();
            p1 p1Var = this.h;
            if (p1Var != null) {
                p1Var.f15633b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f15654s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override
    public final boolean hasFocus() {
        if (!this.f15653r && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean hasWindowFocus() {
        if (!this.f15653r && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isFocused() {
        if (!this.f15653r && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isInTouchMode() {
        if ((this.f15653r && this.f15652n) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f15655w = null;
        super.onDetachedFromWindow();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f15655w == null) {
            androidx.activity.i iVar = new androidx.activity.i(this, 24);
            this.f15655w = iVar;
            post(iVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 >= 30 && n1.d) {
                    try {
                        n1.f15597a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        n1.f15598b.invoke(this, Integer.valueOf(pointToPosition));
                        n1.f15599c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f15654s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15651f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.i iVar = this.f15655w;
        if (iVar != null) {
            r1 r1Var = (r1) iVar.f864b;
            r1Var.f15655w = null;
            r1Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f15652n = z10;
    }

    @Override
    public void setSelector(Drawable drawable) {
        p1 p1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f15632a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f15632a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f15633b = true;
            p1Var = drawable2;
        }
        this.h = p1Var;
        super.setSelector(p1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f15648b = rect.left;
        this.f15649c = rect.top;
        this.d = rect.right;
        this.f15650e = rect.bottom;
    }
}
