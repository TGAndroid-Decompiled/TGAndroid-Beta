package org.telegram.messenger.pip;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;

public final class PipSourceContentView extends ViewGroup {
    public final PipSourceHandlerState2 state;

    public PipSourceContentView(LaunchActivity launchActivity, PipSourceHandlerState2 pipSourceHandlerState2) {
        super(launchActivity);
        this.state = pipSourceHandlerState2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        PipSourceHandlerState2 pipSourceHandlerState2 = this.state;
        float f = (1.0f - pipSourceHandlerState2.lastProgress) * pipSourceHandlerState2.source.cornerRadius;
        boolean z = f > 1.0f;
        canvas.drawColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), (int) Math.min(pipSourceHandlerState2.lastProgress * 420.0f, 255.0f)));
        pipSourceHandlerState2.contentBackground.draw(canvas, 1.0f);
        if (z) {
            float f2 = pipSourceHandlerState2.lastRadius;
            Path path = pipSourceHandlerState2.path;
            if (f2 != f) {
                pipSourceHandlerState2.lastRadius = f;
                RectF rectF = pipSourceHandlerState2.rect;
                rectF.set(pipSourceHandlerState2.position);
                path.reset();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        pipSourceHandlerState2.contentForeground.draw(canvas, 1.0f - pipSourceHandlerState2.lastProgress);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            Rect rect = this.state.position;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z = ((PipActivityContentLayout) getParent()).isViewInPip;
        PipSourceHandlerState2 pipSourceHandlerState2 = this.state;
        if (z) {
            pipSourceHandlerState2.position.set(0, 0, size, size2);
        } else {
            pipSourceHandlerState2.position.set(pipSourceHandlerState2.positionSource);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(pipSourceHandlerState2.position.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(pipSourceHandlerState2.position.height(), 1073741824));
        }
    }
}
