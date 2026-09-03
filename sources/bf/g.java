package bf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.LaunchActivity;
public final class g extends ViewGroup {
    public final df.e f1827a;

    public g(LaunchActivity launchActivity, df.e eVar) {
        super(launchActivity);
        this.f1827a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        df.e eVar = this.f1827a;
        Path path = eVar.f4343m;
        float f10 = (1.0f - eVar.f4345o) * eVar.f4340j.e;
        if (f10 > 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        canvas.drawColor(i0.a.k(j6.w0(null, j6.f19881d6, false), (int) Math.min(eVar.f4345o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z4) {
            RectF rectF = eVar.f4342l;
            if (eVar.f4341k != f10) {
                eVar.f4341k = f10;
                rectF.set(eVar.f4336c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f4345o);
        if (z4) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f1827a.f4336c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z4 = ((a) getParent()).d;
        df.e eVar = this.f1827a;
        Rect rect = eVar.f4336c;
        if (z4) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f4335b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f4336c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f4336c.height(), 1073741824));
        }
    }
}
