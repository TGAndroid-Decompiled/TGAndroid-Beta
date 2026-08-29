package af;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.LaunchActivity;
public final class h extends ViewGroup {
    public final cf.e f408a;

    public h(LaunchActivity launchActivity, cf.e eVar) {
        super(launchActivity);
        this.f408a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        cf.e eVar = this.f408a;
        Path path = eVar.f3054m;
        float f9 = (1.0f - eVar.f3056o) * eVar.f3051j.f400e;
        if (f9 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.k(g6.w0(null, g6.f23062d6, false), (int) Math.min(eVar.f3056o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f3053l;
            if (eVar.f3052k != f9) {
                eVar.f3052k = f9;
                rectF.set(eVar.f3046c);
                path.reset();
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.f3047e.a(canvas, 1.0f - eVar.f3056o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f408a.f3046c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        cf.e eVar = this.f408a;
        Rect rect = eVar.f3046c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f3045b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f3046c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f3046c.height(), 1073741824));
        }
    }
}
