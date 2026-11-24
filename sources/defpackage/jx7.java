package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
public final class jx7 extends ela {
    public final byte m0;
    public final FrameLayout n0;
    public final d o0;

    public jx7(d dVar, Context context, FrameLayout frameLayout, byte b) {
        super(context, null);
        this.m0 = b;
        this.o0 = dVar;
        this.n0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        View i0;
        int measuredHeight2;
        byte b = this.m0;
        d dVar = this.o0;
        FrameLayout frameLayout = this.n0;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (passcodeActivity.w.getVisibility() != 8 && Q() >= gm.L(20.0f)) {
                    if (passcodeActivity.o0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - gm.L(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.w.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - gm.L(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                if (PasscodeActivity.Z(passcodeActivity) != null) {
                    i0 = PasscodeActivity.e0(passcodeActivity);
                } else {
                    i0 = PasscodeActivity.i0(passcodeActivity);
                }
                if (i0 != null && i0.getParent() == this) {
                    i0.layout(0, 0, i0.getMeasuredWidth(), i0.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), gm.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                bdb bdbVar = (bdb) frameLayout;
                p5c p5cVar = (p5c) dVar;
                if (p5cVar.f0.getVisibility() != 8 && Q() >= gm.L(20.0f)) {
                    if (p5cVar.m0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - gm.L(230.0f));
                        bdbVar.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        bdbVar.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (p5cVar.f0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - gm.L(230.0f);
                    bdbVar.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    bdbVar.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                p5cVar.f0.layout(0, measuredHeight2, getMeasuredWidth(), gm.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        View l0;
        byte b = this.m0;
        FrameLayout frameLayout = this.n0;
        d dVar = this.o0;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (passcodeActivity.w.getVisibility() != 8 && Q() < gm.L(20.0f)) {
                    i3 = size2 - gm.L(230.0f);
                } else {
                    i3 = size2;
                }
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(230.0f), 1073741824));
                if (PasscodeActivity.j0(passcodeActivity) != null) {
                    l0 = PasscodeActivity.k0(passcodeActivity);
                } else {
                    l0 = PasscodeActivity.l0(passcodeActivity);
                }
                if (l0 != null && l0.getParent() == this) {
                    l0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                p5c p5cVar = (p5c) dVar;
                if (p5cVar.f0.getVisibility() != 8 && Q() < gm.L(20.0f)) {
                    size4 -= gm.L(230.0f);
                }
                ((bdb) frameLayout).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                p5cVar.f0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(230.0f), 1073741824));
                return;
        }
    }
}
