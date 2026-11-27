package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
public final class oy7 extends wma {
    public final byte g0;
    public final FrameLayout h0;
    public final e i0;

    public oy7(e eVar, Context context, FrameLayout frameLayout, byte b) {
        super(context, null);
        this.g0 = b;
        this.i0 = eVar;
        this.h0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        jla jlaVar;
        int measuredHeight2;
        byte b = this.g0;
        e eVar = this.i0;
        FrameLayout frameLayout = this.h0;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) eVar;
                if (passcodeActivity.w.getVisibility() != 8 && Q() >= hl.L(20.0f)) {
                    if (passcodeActivity.n0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - hl.L(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.w.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - hl.L(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                jlaVar = ((e) passcodeActivity).simpleActionBar;
                View view = jlaVar != null ? ((e) passcodeActivity).simpleActionBar : ((e) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), hl.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                h8b h8bVar = (h8b) frameLayout;
                o7c o7cVar = (o7c) eVar;
                if (o7cVar.f0.getVisibility() != 8 && Q() >= hl.L(20.0f)) {
                    if (o7cVar.l0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - hl.L(230.0f));
                        h8bVar.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        h8bVar.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (o7cVar.f0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - hl.L(230.0f);
                    h8bVar.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    h8bVar.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                o7cVar.f0.layout(0, measuredHeight2, getMeasuredWidth(), hl.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        jla jlaVar;
        byte b = this.g0;
        FrameLayout frameLayout = this.h0;
        e eVar = this.i0;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) eVar;
                if (passcodeActivity.w.getVisibility() != 8 && Q() < hl.L(20.0f)) {
                    i3 = size2 - hl.L(230.0f);
                } else {
                    i3 = size2;
                }
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(230.0f), 1073741824));
                jlaVar = ((e) passcodeActivity).simpleActionBar;
                View view = jlaVar != null ? ((e) passcodeActivity).simpleActionBar : ((e) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                o7c o7cVar = (o7c) eVar;
                if (o7cVar.f0.getVisibility() != 8 && Q() < hl.L(20.0f)) {
                    size4 -= hl.L(230.0f);
                }
                ((h8b) frameLayout).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                o7cVar.f0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(230.0f), 1073741824));
                return;
        }
    }
}
