package org.telegram.messenger.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.telegram.ui.Components.LayoutHelper;

public class OnPostDrawView extends View {
    private final InvalidateCallback callback;
    private int invalidateFlags;

    public interface InvalidateCallback {
        void onPostDraw(int i);
    }

    public void invalidate(int i) {
        if (this.invalidateFlags == 0) {
            invalidate();
        }
        this.invalidateFlags = i | this.invalidateFlags;
    }

    public OnPostDrawView(Context context, InvalidateCallback invalidateCallback) {
        super(context);
        this.invalidateFlags = 0;
        this.callback = invalidateCallback;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(LayoutHelper.measureSpecExactly(0), LayoutHelper.measureSpecExactly(0));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.callback.onPostDraw(this.invalidateFlags);
        this.invalidateFlags = 0;
    }

    public void bringToFrontIfNeeded() {
        ViewGroup viewGroup;
        int indexOfChild;
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(this)) < 0 || indexOfChild == viewGroup.getChildCount() - 1) {
            return;
        }
        viewGroup.bringChildToFront(this);
    }
}
