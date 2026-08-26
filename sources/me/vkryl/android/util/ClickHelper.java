package me.vkryl.android.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class ClickHelper {
    public final Delegate delegate;
    public int flags;
    public ClickHelper$$ExternalSyntheticLambda0 longPressCallback;
    public float longPressX;
    public float longPressY;
    public float startX;
    public float startY;

    public interface Delegate {
        boolean forceEnableVibration();

        long getLongPressDuration();

        boolean ignoreHapticFeedbackSettings(float f, float f2);

        boolean needCancelTouchBySlopMove();

        boolean needClickAt(View view, float f, float f2);

        boolean needLongPress(float f, float f2);

        void onClickAt(View view, float f, float f2);

        void onClickTouchDown(View view, float f, float f2);

        void onClickTouchMove(View view, float f, float f2);

        void onClickTouchUp(View view, float f, float f2);

        void onLongPressCancelled(View view, float f, float f2);

        void onLongPressFinish(View view, float f, float f2);

        void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4);

        boolean onLongPressRequestedAt(View view, float f, float f2);
    }

    public ClickHelper(Delegate delegate) {
        this.delegate = delegate;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent, View view) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        Delegate delegate = this.delegate;
        if (action == 0) {
            resetTouch(view, x, y);
            if (delegate.needClickAt(view, x, y)) {
                this.flags |= 1;
                this.startX = x;
                this.startY = y;
                delegate.onClickTouchDown(view, x, y);
                if (delegate.needLongPress(x, y) && view != null) {
                    if (this.longPressCallback != null) {
                        throw new AssertionError();
                    }
                    this.flags |= 2;
                    ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(0, this, view);
                    this.longPressCallback = clickHelper$$ExternalSyntheticLambda0;
                    view.postDelayed(clickHelper$$ExternalSyntheticLambda0, delegate.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i = this.flags;
            if ((i & 1) != 0) {
                if ((i & 4) != 0) {
                    delegate.onLongPressFinish(view, x, y);
                    this.flags &= -5;
                } else {
                    delegate.onClickAt(view, x, y);
                    if ((this.flags & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                resetTouch(view, x, y);
                return true;
            }
        } else {
            if (action == 2) {
                if ((this.flags & 1) != 0) {
                    delegate.onClickTouchMove(view, x, y);
                    if ((this.flags & 4) != 0) {
                        delegate.onLongPressMove(view, motionEvent, x, y, this.longPressX, this.longPressY);
                        return true;
                    }
                    if (delegate.needCancelTouchBySlopMove() && Math.max(Math.abs(this.startX - x), Math.abs(this.startY - y)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        resetTouch(view, x, y);
                        return true;
                    }
                }
            }
            if (action == 3 && (this.flags & 1) != 0) {
                resetTouch(view, x, y);
                return true;
            }
        }
        return (this.flags & 1) != 0;
    }

    public final void resetTouch(View view, float f, float f2) {
        int i = this.flags;
        if ((i & 2) != 0) {
            this.flags = i & (-3);
            ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = this.longPressCallback;
            if (clickHelper$$ExternalSyntheticLambda0 == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(clickHelper$$ExternalSyntheticLambda0);
            this.longPressCallback = null;
        }
        int i2 = this.flags;
        int i3 = i2 & 8;
        Delegate delegate = this.delegate;
        if (i3 != 0) {
            this.flags = i2 & (-9);
            delegate.onLongPressCancelled(view, f, f2);
        }
        if ((this.flags & 4) != 0) {
            delegate.onLongPressFinish(view, f, f2);
            this.flags &= -5;
        }
        if ((this.flags & 1) != 0) {
            delegate.onClickTouchUp(view, f, f2);
            this.flags &= -2;
        }
    }
}
