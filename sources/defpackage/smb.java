package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class smb extends r59 {
    public final byte f3;

    public smb(Context context) {
        super(context);
        this.f3 = (byte) 12;
    }

    @Override
    public final Integer W0(int i) {
        switch (this.f3) {
            case 1:
                return 0;
            case 2:
                return 0;
            case 5:
                return 0;
            case 8:
                return 0;
            case 13:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 6:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z2 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z2 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z2);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.f3) {
            case 4:
                int size = View.MeasureSpec.getSize(i2);
                int b = (getAdapter().b() * gm.L(50.0f)) + gm.L(4.0f);
                if (b <= size) {
                    size = b;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 9:
                int size2 = View.MeasureSpec.getSize(i2);
                int b2 = (getAdapter().b() * gm.L(50.0f)) + gm.L(4.0f);
                if (b2 <= size2) {
                    size2 = b2;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 12:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        switch (this.f3) {
            case 3:
                rect.bottom = gm.L(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z);
            case 10:
                rect.bottom = gm.L(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z);
        }
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        switch (this.f3) {
            case 7:
                return false;
            default:
                return super.requestFocus(i, rect);
        }
    }

    @Override
    public final void s0(View view, View view2) {
        switch (this.f3) {
            case 3:
                if (view instanceof ng8) {
                    super.s0(view, view2);
                    return;
                }
                return;
            case 10:
                if (view instanceof ng8) {
                    super.s0(view, view2);
                    return;
                }
                return;
            default:
                super.s0(view, view2);
                return;
        }
    }

    public smb(Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
    }
}
