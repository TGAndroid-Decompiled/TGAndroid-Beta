package org.telegram.messenger.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.LayoutHelper;

public final class OnPostDrawView extends View implements ViewTreeObserver.OnPreDrawListener {
    public final InvalidateCallback callback;
    public int invalidateFlags;
    public ViewTreeObserver observer;
    public final boolean onPreDrawMode;

    public interface InvalidateCallback {
        void onPostDraw(int i);
    }

    public OnPostDrawView(Context context, InvalidateCallback invalidateCallback) {
        super(context);
        this.invalidateFlags = 0;
        this.callback = invalidateCallback;
        this.onPreDrawMode = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.onPreDrawMode) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.observer = viewTreeObserver;
            viewTreeObserver.addOnPreDrawListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = this.observer;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.observer.removeOnPreDrawListener(this);
        }
        this.observer = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.onPreDrawMode) {
            return;
        }
        this.callback.onPostDraw(this.invalidateFlags);
        this.invalidateFlags = 0;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(LayoutHelper.measureSpecExactly(1), LayoutHelper.measureSpecExactly(1));
    }

    @Override
    public final boolean onPreDraw() {
        int i;
        if (!this.onPreDrawMode || (i = this.invalidateFlags) == 0) {
            return true;
        }
        this.callback.onPostDraw(i);
        this.invalidateFlags = 0;
        return true;
    }
}
