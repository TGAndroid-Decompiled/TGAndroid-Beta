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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class s1 extends ListView {

    public final Rect f17446a;

    public int f17447b;

    public int f17448c;
    public int d;

    public int f17449e;

    public int f17450f;
    public q1 h;

    public boolean f17451n;

    public final boolean f17452r;

    public boolean f17453s;
    public u0.d v;

    public a8.b f17454w;

    public s1(Context context, boolean z10) {
        super(context, null, 2130968772);
        this.f17446a = new Rect();
        this.f17447b = 0;
        this.f17448c = 0;
        this.d = 0;
        this.f17449e = 0;
        this.f17452r = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i12 = 0;
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
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    public final boolean b(int i10, MotionEvent motionEvent) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        u0.d dVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = true;
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z11 = false;
                    z10 = true;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    this.f17453s = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f17450f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z10) {
                    if (this.v == null) {
                        this.v = new u0.d(this);
                    }
                    u0.d dVar2 = this.v;
                    boolean z12 = dVar2.B;
                    dVar2.B = true;
                    dVar2.onTouch(this, motionEvent);
                } else {
                    dVar = this.v;
                    if (dVar != null) {
                        if (dVar.B) {
                            dVar.d();
                        }
                        dVar.B = false;
                    }
                }
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x8 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x8, y10);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x8;
                float f11 = y10;
                this.f17453s = true;
                n1.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f17450f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f17450f = iPointToPosition;
                n1.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f17446a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f17447b;
                rect.top -= this.f17448c;
                rect.right += this.d;
                rect.bottom += this.f17449e;
                if (n0.a.a()) {
                    zA = p1.a(this);
                } else {
                    Field field = r1.f17440a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e9) {
                            e9.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (n0.a.a()) {
                        p1.b(this, z14);
                    } else {
                        Field field2 = r1.f17440a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                q1 q1Var = this.h;
                if (q1Var != null) {
                    q1Var.f17436b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z11 = false;
                z10 = true;
            }
        }
        if (z10) {
            this.f17453s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f17450f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f17453s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f17450f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.v == null) {
                this.v = new u0.d(this);
            }
            u0.d dVar3 = this.v;
            boolean z15 = dVar3.B;
            dVar3.B = true;
            dVar3.onTouch(this, motionEvent);
        } else {
            dVar = this.v;
            if (dVar != null) {
                if (dVar.B) {
                    dVar.d();
                }
                dVar.B = false;
            }
        }
        return z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f17446a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        if (this.f17454w != null) {
            return;
        }
        super.drawableStateChanged();
        q1 q1Var = this.h;
        if (q1Var != null) {
            q1Var.f17436b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f17453s && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override
    public final boolean hasFocus() {
        return this.f17452r || super.hasFocus();
    }

    @Override
    public final boolean hasWindowFocus() {
        return this.f17452r || super.hasWindowFocus();
    }

    @Override
    public final boolean isFocused() {
        return this.f17452r || super.isFocused();
    }

    @Override
    public final boolean isInTouchMode() {
        return (this.f17452r && this.f17451n) || super.isInTouchMode();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f17454w = null;
        super.onDetachedFromWindow();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f17454w == null) {
            a8.b bVar = new a8.b(this, 29);
            this.f17454w = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !o1.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        o1.f17398a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        o1.f17399b.invoke(this, Integer.valueOf(iPointToPosition));
                        o1.f17400c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f17453s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f17450f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        a8.b bVar = this.f17454w;
        if (bVar != null) {
            s1 s1Var = (s1) bVar.f154b;
            s1Var.f17454w = null;
            s1Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f17451n = z10;
    }

    @Override
    public void setSelector(Drawable drawable) {
        q1 q1Var = null;
        if (drawable != null) {
            q1 q1Var2 = new q1();
            Drawable drawable2 = q1Var2.f17435a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            q1Var2.f17435a = drawable;
            drawable.setCallback(q1Var2);
            q1Var2.f17436b = true;
            q1Var = q1Var2;
        }
        this.h = q1Var;
        super.setSelector(q1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f17447b = rect.left;
        this.f17448c = rect.top;
        this.d = rect.right;
        this.f17449e = rect.bottom;
    }
}
