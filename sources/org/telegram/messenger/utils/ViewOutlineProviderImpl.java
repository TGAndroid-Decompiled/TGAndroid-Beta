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
}
