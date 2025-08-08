package org.telegram.messenger.pip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;

public class PipSourceContentView extends ViewGroup {
    private final PipSourceHandlerState2 state;

    public PipSourceContentView(Context context, PipSourceHandlerState2 pipSourceHandlerState2) {
        super(context);
        this.state = pipSourceHandlerState2;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        this.state.updatePositionViewRect(size, size2, ((PipActivityContentLayout) getParent()).isViewInPip());
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(this.state.position.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.state.position.height(), 1073741824));
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            Rect rect = this.state.position;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.state.draw(canvas, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PipSourceContentView.this.lambda$dispatchDraw$0((Canvas) obj);
            }
        });
    }
}
