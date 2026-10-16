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
public class t1 extends ListView {
    public final Rect f14973a;
    public int f14974b;
    public int f14975c;
    public int d;
    public int e;
    public int f14976f;
    public r1 h;
    public boolean f14977n;
    public final boolean f14978r;
    public boolean f14979s;
    public u0.d v;
    public androidx.activity.i f14980w;

    public t1(Context context, boolean z10) {
        super(context, null, 2130968772);
        this.f14973a = new Rect();
        this.f14974b = 0;
        this.f14975c = 0;
        this.d = 0;
        this.e = 0;
        this.f14978r = z10;
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
        int i13 = 0;
        View view = null;
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
        throw new UnsupportedOperationException("Method not decompiled: m.t1.b(int, android.view.MotionEvent):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f14973a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        if (this.f14980w == null) {
            super.drawableStateChanged();
            r1 r1Var = this.h;
            if (r1Var != null) {
                r1Var.f14955b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f14979s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override
    public final boolean hasFocus() {
        if (!this.f14978r && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean hasWindowFocus() {
        if (!this.f14978r && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isFocused() {
        if (!this.f14978r && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isInTouchMode() {
        if ((this.f14978r && this.f14977n) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f14980w = null;
        super.onDetachedFromWindow();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14980w == null) {
            androidx.activity.i iVar = new androidx.activity.i(this, 24);
            this.f14980w = iVar;
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
                if (i10 >= 30 && p1.d) {
                    try {
                        p1.f14921a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        p1.f14922b.invoke(this, Integer.valueOf(pointToPosition));
                        p1.f14923c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f14979s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14976f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.i iVar = this.f14980w;
        if (iVar != null) {
            t1 t1Var = (t1) iVar.f1035b;
            t1Var.f14980w = null;
            t1Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f14977n = z10;
    }

    @Override
    public void setSelector(Drawable drawable) {
        r1 r1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f14954a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f14954a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f14955b = true;
            r1Var = drawable2;
        }
        this.h = r1Var;
        super.setSelector(r1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f14974b = rect.left;
        this.f14975c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }
}
