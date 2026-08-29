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
import lh.m7;
public class s1 extends ListView {
    public final Rect f16677a;
    public int f16678b;
    public int f16679c;
    public int d;
    public int f16680e;
    public int f16681f;
    public q1 h;
    public boolean f16682n;
    public final boolean f16683r;
    public boolean f16684s;
    public u0.d v;
    public m7 f16685w;

    public s1(Context context, boolean z10) {
        super(context, null, 2130968772);
        this.f16677a = new Rect();
        this.f16678b = 0;
        this.f16679c = 0;
        this.d = 0;
        this.f16680e = 0;
        this.f16683r = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: m.s1.b(int, android.view.MotionEvent):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f16677a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        if (this.f16685w == null) {
            super.drawableStateChanged();
            q1 q1Var = this.h;
            if (q1Var != null) {
                q1Var.f16658b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f16684s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override
    public final boolean hasFocus() {
        if (!this.f16683r && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean hasWindowFocus() {
        if (!this.f16683r && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isFocused() {
        if (!this.f16683r && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isInTouchMode() {
        if ((this.f16683r && this.f16682n) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f16685w = null;
        super.onDetachedFromWindow();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f16685w == null) {
            m7 m7Var = new m7(this, 2);
            this.f16685w = m7Var;
            post(m7Var);
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
                if (i10 >= 30 && o1.d) {
                    try {
                        o1.f16622a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        o1.f16623b.invoke(this, Integer.valueOf(pointToPosition));
                        o1.f16624c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f16684s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f16681f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        m7 m7Var = this.f16685w;
        if (m7Var != null) {
            s1 s1Var = (s1) m7Var.f15932b;
            s1Var.f16685w = null;
            s1Var.removeCallbacks(m7Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f16682n = z10;
    }

    @Override
    public void setSelector(Drawable drawable) {
        q1 q1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f16657a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f16657a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f16658b = true;
            q1Var = drawable2;
        }
        this.h = q1Var;
        super.setSelector(q1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f16678b = rect.left;
        this.f16679c = rect.top;
        this.d = rect.right;
        this.f16680e = rect.bottom;
    }
}
