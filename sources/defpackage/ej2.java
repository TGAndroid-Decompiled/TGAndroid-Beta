package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;
public final class ej2 extends in {
    public final Rect s;
    public Drawable w;
    public boolean x;

    public ej2(Context context) {
        super(context, false, false, false);
        this.s = new Rect();
    }

    public Rect getClickBounds() {
        return this.s;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.w != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().c());
            if (getDrawable().b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().b == 17) {
                int i = (rect.left + rect.right) / 2;
                int i2 = ceil / 2;
                rect.left = i - i2;
                rect.right = i + i2;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.w.setBounds(rect);
            this.w.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.x = true;
            Drawable drawable = this.w;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.w.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.x && contains) {
                callOnClick();
            }
            this.x = false;
            Drawable drawable2 = this.w;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.x = false;
            Drawable drawable3 = this.w;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }

    @Override
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
