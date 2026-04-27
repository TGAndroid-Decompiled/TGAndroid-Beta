package org.telegram.messenger.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

public abstract class ViewOutlineProviderImpl {
    public static final ViewOutlineProvider BOUNDS_OVAL = new ViewOutlineProvider() {
        @Override
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    };
    public static final ViewOutlineProvider BOUNDS_ROUND_RECT = new ViewOutlineProvider() {
        @Override
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
        }
    };

    public static ViewOutlineProvider boundsWithPaddingFromViewAndRoundRect(final float f) {
        return new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), f);
            }
        };
    }

    public static ViewOutlineProvider boundsWithPaddingRoundRect(final int i, final float f) {
        return new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                int i2 = i;
                outline.setRoundRect(i2, i2, view.getWidth() - i, view.getHeight() - i, f);
            }
        };
    }
}
