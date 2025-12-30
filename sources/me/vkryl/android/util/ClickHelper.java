package me.vkryl.android.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import me.vkryl.android.ViewUtils;

public class ClickHelper {
    private int bottom;
    private final Delegate delegate;
    private int flags;
    private int left;
    private Runnable longPressCallback;
    private float longPressX;
    private float longPressY;
    private boolean regionSet;
    private int right;
    private float startX;
    private float startY;
    private int top;

    public interface Delegate {
        boolean forceEnableVibration();

        long getLongPressDuration();

        boolean ignoreHapticFeedbackSettings(float f, float f2);

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

        public abstract class CC {
            public static boolean $default$forceEnableVibration(Delegate delegate) {
                return false;
            }

            public static boolean $default$ignoreHapticFeedbackSettings(Delegate delegate, float f, float f2) {
                return false;
            }

            public static boolean $default$needLongPress(Delegate delegate, float f, float f2) {
                return false;
            }

            public static void $default$onClickTouchDown(Delegate delegate, View view, float f, float f2) {
            }

            public static void $default$onClickTouchMove(Delegate delegate, View view, float f, float f2) {
            }

            public static void $default$onClickTouchUp(Delegate delegate, View view, float f, float f2) {
            }

            public static void $default$onLongPressCancelled(Delegate delegate, View view, float f, float f2) {
            }

            public static void $default$onLongPressFinish(Delegate delegate, View view, float f, float f2) {
            }

            public static void $default$onLongPressMove(Delegate delegate, View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            }

            public static boolean $default$onLongPressRequestedAt(Delegate delegate, View view, float f, float f2) {
                return false;
            }
        }
    }

    public ClickHelper(Delegate delegate) {
        this.delegate = delegate;
    }

    private void resetTouch(View view, float f, float f2) {
        int i = this.flags;
        if ((i & 2) != 0) {
            this.flags = i & (-3);
            Runnable runnable = this.longPressCallback;
            if (runnable == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(runnable);
            this.longPressCallback = null;
        }
        int i2 = this.flags;
        if ((i2 & 8) != 0) {
            this.flags = i2 & (-9);
            this.delegate.onLongPressCancelled(view, f, f2);
        }
        if ((this.flags & 4) != 0) {
            this.delegate.onLongPressFinish(view, f, f2);
            this.flags &= -5;
        }
        if ((this.flags & 1) != 0) {
            this.delegate.onClickTouchUp(view, f, f2);
            this.flags &= -2;
        }
    }

    private void scheduleLongPress(final View view) {
        if (view != null) {
            if (this.longPressCallback != null) {
                throw new AssertionError();
            }
            this.flags |= 2;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$scheduleLongPress$0(view);
                }
            };
            this.longPressCallback = runnable;
            view.postDelayed(runnable, this.delegate.getLongPressDuration());
        }
    }

    public void lambda$scheduleLongPress$0(View view) {
        if ((this.flags & 2) != 0) {
            if (this.delegate.onLongPressRequestedAt(view, this.startX, this.startY)) {
                this.flags &= -3;
                this.longPressCallback = null;
                onLongPress(view, this.startX, this.startY);
                return;
            }
            this.flags |= 8;
        }
    }

    public final void onLongPress(View view, float f, float f2) {
        this.longPressX = f;
        this.longPressY = f2;
        if (this.delegate.ignoreHapticFeedbackSettings(f, f2)) {
            ViewUtils.hapticVibrate(view, true, this.delegate.forceEnableVibration());
        } else {
            view.performHapticFeedback(0);
        }
        this.flags = (this.flags | 4) & (-11);
        this.longPressCallback = null;
    }

    public boolean onTouchEvent(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            resetTouch(view, x, y);
            if ((this.regionSet && (x < this.left || x > this.right || y < this.top || y > this.bottom)) || !this.delegate.needClickAt(view, x, y)) {
                return false;
            }
            this.flags |= 1;
            this.startX = x;
            this.startY = y;
            this.delegate.onClickTouchDown(view, x, y);
            if (this.delegate.needLongPress(x, y)) {
                scheduleLongPress(view);
            }
            return true;
        }
        if (action == 1) {
            int i = this.flags;
            if ((i & 1) != 0) {
                if ((i & 4) != 0) {
                    this.delegate.onLongPressFinish(view, x, y);
                    this.flags &= -5;
                } else {
                    this.delegate.onClickAt(view, x, y);
                    if ((this.flags & 256) == 0) {
                        ViewUtils.onClick(view);
                    }
                }
                resetTouch(view, x, y);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.flags & 1) != 0) {
                resetTouch(view, x, y);
                return true;
            }
        } else if ((this.flags & 1) != 0) {
            this.delegate.onClickTouchMove(view, x, y);
            if ((this.flags & 4) != 0) {
                this.delegate.onLongPressMove(view, motionEvent, x, y, this.longPressX, this.longPressY);
            } else if (Math.max(Math.abs(this.startX - x), Math.abs(this.startY - y)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                resetTouch(view, x, y);
            }
            return true;
        }
        return (this.flags & 1) != 0;
    }
}
