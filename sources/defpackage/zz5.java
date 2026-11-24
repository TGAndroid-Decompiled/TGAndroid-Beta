package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class zz5 extends RelativeLayout {
    public io5 a;
    public boolean b;
    public final LaunchActivity c;

    public zz5(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = io5.e;
        ry4 ry4Var = new ry4(this, (byte) 22);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(this, ry4Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.q0;
        if (actionBarLayout != null) {
            actionBarLayout.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (!launchActivity.N0) {
            io5 io5Var = this.a;
            int k1 = gl.k1(measuredWidth, io5Var.a, io5Var.c);
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
            launchActivity.r0.getView().layout(k1, 0, launchActivity.r0.getView().getMeasuredWidth() + k1, launchActivity.r0.getView().getMeasuredHeight());
        } else {
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.q0.getView().getMeasuredWidth()) / 2;
        int L = gl.L(8.0f) + this.a.b;
        launchActivity.q0.getView().layout(measuredWidth2, L, launchActivity.q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.q0.getView().getMeasuredHeight() + L);
        n81 n81Var = launchActivity.u0;
        n81Var.layout(0, 0, n81Var.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.t0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        this.b = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z2 = gl.E;
        LaunchActivity launchActivity = this.c;
        if (!z2 && (!gl.N1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z = true;
        } else {
            z = false;
        }
        if (z == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            gl.d3(new tp5(this, (byte) 9));
        }
        if (!launchActivity.N0) {
            io5 io5Var = this.a;
            int k1 = gl.k1(size, io5Var.a, io5Var.c);
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(k1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - k1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(500.0f), size - gl.L(16.0f)), 1073741824);
        io5 io5Var2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - io5Var2.b) - io5Var2.d) - gl.L(16.0f), 1073741824));
        this.b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
