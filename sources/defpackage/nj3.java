package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
public final class nj3 extends FrameLayout {
    public boolean a;
    public final oj3 b;

    public nj3(oj3 oj3Var, Context context) {
        super(context);
        this.b = oj3Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        float f2;
        oj3 oj3Var = this.b;
        int size = oj3Var.N.size();
        int i7 = oj3Var.r;
        int i8 = 0;
        if (i7 == 0 && oj3Var.h == 0 && na7.q1(oj3Var.G).R.f(2305843009213693953L) != null) {
            z = true;
        } else {
            z = false;
        }
        View view = (View) getParent();
        if (view instanceof rl0) {
            i3 = ((rl0) view).f3;
        } else {
            i3 = 0;
        }
        boolean z2 = oj3Var.K;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i9 = paddingTop - i3;
        if (i7 == 1 && size == 1 && ((mj3) oj3Var.N.get(0)).a == 19) {
            i4 = View.MeasureSpec.getSize(i2);
            if (i4 == 0) {
                i4 = view.getMeasuredHeight();
            }
            if (i4 == 0) {
                i4 = (gl.q.y - a.getCurrentActionBarHeight()) - gl.m;
            }
            if (oj3Var.S.L) {
                i4 += gl.L(81.0f);
            }
        } else {
            if (size != 0 && (i9 != 0 || z)) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (gl.q.y - a.getCurrentActionBarHeight()) - gl.m;
                }
                int i10 = size2 - i3;
                if (gba.m1) {
                    f = 76.0f;
                } else {
                    f = 70.0f;
                }
                int L = gl.L(f);
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = ((mj3) oj3Var.N.get(i12)).a;
                    ArrayList arrayList = oj3Var.N;
                    if (i13 == 0) {
                        if (((mj3) arrayList.get(i12)).f && !z2) {
                            if (gba.m1) {
                                f2 = 86.0f;
                            } else {
                                f2 = 91.0f;
                            }
                            i11 += gl.L(f2);
                        }
                        i11 += L;
                    } else {
                        if (((mj3) arrayList.get(i12)).a != 1) {
                        }
                        i11 += L;
                    }
                }
                int i14 = (size - 1) + i11;
                ArrayList arrayList2 = oj3Var.d;
                if (arrayList2 != null) {
                    i14 = de9.w(52.0f, (oj3Var.d.size() - 1) + (gl.L(58.0f) * arrayList2.size()), i14);
                }
                if (z) {
                    i5 = L + 1;
                } else {
                    i5 = 0;
                }
                if (i14 < i10) {
                    i4 = ((i10 - i14) + i5) - paddingBottom;
                    if (i9 != 0) {
                        i4 -= gl.m;
                        if (!z2) {
                            if (!oj3Var.T) {
                                i4 -= a.getCurrentActionBarHeight();
                                if (getParent() instanceof yi3) {
                                    i6 = ((yi3) getParent()).A3;
                                    i4 -= i6;
                                }
                            }
                        }
                        i4 -= i9;
                    }
                } else {
                    int i15 = i14 - i10;
                    if (i15 < i5) {
                        i4 = (i5 - i15) - paddingBottom;
                        if (i9 != 0) {
                            i4 -= gl.m;
                            if (!z2) {
                                if (!oj3Var.T) {
                                    i4 -= a.getCurrentActionBarHeight();
                                    if (getParent() instanceof yi3) {
                                        i6 = ((yi3) getParent()).A3;
                                        i4 -= i6;
                                    }
                                }
                            }
                            i4 -= i9;
                        }
                    }
                }
            }
            i4 = 0;
        }
        if (i4 >= 0) {
            i8 = i4;
        }
        if (oj3Var.T) {
            i8 += gl.L(1000.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
    }
}
