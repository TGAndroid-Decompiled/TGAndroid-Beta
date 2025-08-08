package org.telegram.messenger.pip.utils;

import android.view.View;
import android.view.ViewTreeObserver;

public class PipPositionObserver {
    private final ViewTreeObserver.OnGlobalLayoutListener listener;
    private View mView;
    private ViewTreeObserver mViewTreeObserver;
    private final View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() {
        @Override
        public void onViewAttachedToWindow(View view) {
            if (view == PipPositionObserver.this.mView) {
                PipPositionObserver.this.setViewTreeObserverInternal(view.getViewTreeObserver());
            }
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            if (view == PipPositionObserver.this.mView) {
                PipPositionObserver.this.setViewTreeObserverInternal(null);
            }
        }
    };

    public PipPositionObserver(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.listener = onGlobalLayoutListener;
    }

    public void start(View view) {
        setViewInternal(view);
    }

    public void stop() {
        setViewInternal(null);
    }

    private void setViewInternal(View view) {
        if (this.mView == view) {
            return;
        }
        setViewTreeObserverInternal(null);
        View view2 = this.mView;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(this.onAttachStateChangeListener);
            if (view.isAttachedToWindow()) {
                setViewTreeObserverInternal(view.getViewTreeObserver());
            }
        }
        this.mView = view;
    }

    public void setViewTreeObserverInternal(ViewTreeObserver viewTreeObserver) {
        ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            this.mViewTreeObserver.removeOnGlobalLayoutListener(this.listener);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.listener);
        }
        this.mViewTreeObserver = viewTreeObserver;
    }
}
