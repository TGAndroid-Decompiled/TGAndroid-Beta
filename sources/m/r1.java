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
    public final Rect f20186a;
    public int f20187b;
    public int f20188c;
    public int d;
    public int f20189e;
    public int f20190f;
    public p1 h;
    public boolean f20191n;
    public final boolean f20192r;
    public boolean f20193s;
    public u0.d f20194w;
    public j6.o f20195x;

    public r1(Context context, boolean z10) {
        super(context, null, 2130968772);
        this.f20186a = new Rect();
        this.f20187b = 0;
        this.f20188c = 0;
        this.d = 0;
        this.f20189e = 0;
        this.f20192r = z10;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i10) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            if (i14 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i7, makeMeasureSpec);
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    public final boolean b(int r18, android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: m.r1.b(int, android.view.MotionEvent):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f20186a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        if (this.f20195x == null) {
            super.drawableStateChanged();
            p1 p1Var = this.h;
            if (p1Var != null) {
                p1Var.f20177b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f20193s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override
    public final boolean hasFocus() {
        if (!this.f20192r && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean hasWindowFocus() {
        if (!this.f20192r && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isFocused() {
        if (!this.f20192r && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isInTouchMode() {
        if ((this.f20192r && this.f20191n) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f20195x = null;
        super.onDetachedFromWindow();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f20195x == null) {
            j6.o oVar = new j6.o(this, 1);
            this.f20195x = oVar;
            post(oVar);
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
                if (i7 >= 30 && n1.d) {
                    try {
                        n1.f20136a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        n1.f20137b.invoke(this, Integer.valueOf(pointToPosition));
                        n1.f20138c.invoke(this, Integer.valueOf(pointToPosition));
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
            if (selector != null && this.f20193s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20190f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        j6.o oVar = this.f20195x;
        if (oVar != null) {
            r1 r1Var = (r1) oVar.f17268b;
            r1Var.f20195x = null;
            r1Var.removeCallbacks(oVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f20191n = z10;
    }

    @Override
    public void setSelector(Drawable drawable) {
        p1 p1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f20176a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f20176a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f20177b = true;
            p1Var = drawable2;
        }
        this.h = p1Var;
        super.setSelector(p1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f20187b = rect.left;
        this.f20188c = rect.top;
        this.d = rect.right;
        this.f20189e = rect.bottom;
    }
}
