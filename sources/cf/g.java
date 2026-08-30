package cf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.LaunchActivity;
public final class g extends ViewGroup {
    public final ef.f f2305a;

    public g(LaunchActivity launchActivity, ef.f fVar) {
        super(launchActivity);
        this.f2305a = fVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        ef.f fVar = this.f2305a;
        Path path = fVar.f5205m;
        float f10 = (1.0f - fVar.f5207o) * fVar.f5202j.e;
        if (f10 > 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        canvas.drawColor(i0.a.k(j6.w0(null, j6.f19906d6, false), (int) Math.min(fVar.f5207o * 420.0f, 255.0f)));
        fVar.d.a(canvas, 1.0f);
        if (z4) {
            RectF rectF = fVar.f5204l;
            if (fVar.f5203k != f10) {
                fVar.f5203k = f10;
                rectF.set(fVar.f5198c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        fVar.e.a(canvas, 1.0f - fVar.f5207o);
        if (z4) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f2305a.f5198c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z4 = ((a) getParent()).d;
        ef.f fVar = this.f2305a;
        Rect rect = fVar.f5198c;
        if (z4) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(fVar.f5197b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(fVar.f5198c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(fVar.f5198c.height(), 1073741824));
        }
    }
}
