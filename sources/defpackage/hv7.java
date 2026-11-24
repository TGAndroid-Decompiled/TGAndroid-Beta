package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
public final class hv7 extends cja {
    public final byte m0;
    public final FrameLayout n0;
    public final d o0;

    public hv7(d dVar, Context context, FrameLayout frameLayout, byte b) {
        super(context, null);
        this.m0 = b;
        this.o0 = dVar;
        this.n0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        pha phaVar;
        int measuredHeight2;
        byte b = this.m0;
        d dVar = this.o0;
        FrameLayout frameLayout = this.n0;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (passcodeActivity.w.getVisibility() != 8 && Q() >= gl.L(20.0f)) {
                    if (passcodeActivity.n0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - gl.L(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.w.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - gl.L(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                phaVar = ((d) passcodeActivity).simpleActionBar;
                View view = phaVar != null ? ((d) passcodeActivity).simpleActionBar : ((d) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), gl.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                zab zabVar = (zab) frameLayout;
                p3c p3cVar = (p3c) dVar;
                if (p3cVar.f0.getVisibility() != 8 && Q() >= gl.L(20.0f)) {
                    if (p3cVar.l0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - gl.L(230.0f));
                        zabVar.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        zabVar.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (p3cVar.f0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - gl.L(230.0f);
                    zabVar.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    zabVar.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                p3cVar.f0.layout(0, measuredHeight2, getMeasuredWidth(), gl.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        pha phaVar;
        byte b = this.m0;
        FrameLayout frameLayout = this.n0;
        d dVar = this.o0;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (passcodeActivity.w.getVisibility() != 8 && Q() < gl.L(20.0f)) {
                    i3 = size2 - gl.L(230.0f);
                } else {
                    i3 = size2;
                }
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(230.0f), 1073741824));
                phaVar = ((d) passcodeActivity).simpleActionBar;
                View view = phaVar != null ? ((d) passcodeActivity).simpleActionBar : ((d) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                p3c p3cVar = (p3c) dVar;
                if (p3cVar.f0.getVisibility() != 8 && Q() < gl.L(20.0f)) {
                    size4 -= gl.L(230.0f);
                }
                ((zab) frameLayout).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                p3cVar.f0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(230.0f), 1073741824));
                return;
        }
    }
}
