package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public interface ey0 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z);

    float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2);
}
