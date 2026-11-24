package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class l6c extends ViewGroup {
    public final Paint a;
    public View b;
    public boolean c;

    public l6c(Context context) {
        super(context);
        this.a = new Paint(1);
        setClipToPadding(false);
    }

    public final boolean a() {
        View view = this.b;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float R1 = gl.R1(0.1f, 0.75f, gl.Q0(paddingBottom));
        int w0 = bkb.w0(null, bkb.Ei, false);
        int k = bm2.k(bkb.p1(R1, bkb.w0(null, bkb.c6, false)), w0);
        Paint paint = this.a;
        paint.setColor(w0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(k);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean a = a();
        int size = View.MeasureSpec.getSize(i);
        if (a) {
            i3 = getPaddingBottom() + gl.L(44.0f);
        } else {
            i3 = 0;
        }
        setMeasuredDimension(size, i3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.c != a) {
            this.c = a;
            WeakHashMap weakHashMap = jdc.a;
            zcc.c(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.b = view;
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setPadding(i, i2, i3, i4);
        }
    }
}
