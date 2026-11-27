package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
public final class fk3 extends FrameLayout {
    public boolean a;
    public final gk3 b;

    public fk3(gk3 gk3Var, Context context) {
        super(context);
        this.b = gk3Var;
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
        gk3 gk3Var = this.b;
        int size = gk3Var.N.size();
        int i7 = gk3Var.r;
        int i8 = 0;
        if (i7 == 0 && gk3Var.h == 0 && uc7.s1(gk3Var.G).R.f(2305843009213693953L) != null) {
            z = true;
        } else {
            z = false;
        }
        View view = (View) getParent();
        if (view instanceof sl0) {
            i3 = ((sl0) view).f3;
        } else {
            i3 = 0;
        }
        boolean z2 = gk3Var.K;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i9 = paddingTop - i3;
        if (i7 == 1 && size == 1 && ((ek3) gk3Var.N.get(0)).a == 19) {
            i4 = View.MeasureSpec.getSize(i2);
            if (i4 == 0) {
                i4 = view.getMeasuredHeight();
            }
            if (i4 == 0) {
                i4 = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
            }
            if (gk3Var.S.L) {
                i4 += hl.L(81.0f);
            }
        } else {
            if (size != 0 && (i9 != 0 || z)) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
                }
                int i10 = size2 - i3;
                if (xea.l1) {
                    f = 76.0f;
                } else {
                    f = 70.0f;
                }
                int L = hl.L(f);
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = ((ek3) gk3Var.N.get(i12)).a;
                    ArrayList arrayList = gk3Var.N;
                    if (i13 == 0) {
                        if (((ek3) arrayList.get(i12)).f && !z2) {
                            if (xea.l1) {
                                f2 = 86.0f;
                            } else {
                                f2 = 91.0f;
                            }
                            i11 += hl.L(f2);
                        }
                        i11 += L;
                    } else {
                        if (((ek3) arrayList.get(i12)).a != 1) {
                        }
                        i11 += L;
                    }
                }
                int i14 = (size - 1) + i11;
                ArrayList arrayList2 = gk3Var.d;
                if (arrayList2 != null) {
                    i14 = uh9.w(52.0f, (gk3Var.d.size() - 1) + (hl.L(58.0f) * arrayList2.size()), i14);
                }
                if (z) {
                    i5 = L + 1;
                } else {
                    i5 = 0;
                }
                if (i14 < i10) {
                    i4 = ((i10 - i14) + i5) - paddingBottom;
                    if (i9 != 0) {
                        i4 -= hl.m;
                        if (!z2) {
                            if (!gk3Var.T) {
                                i4 -= a.getCurrentActionBarHeight();
                                if (getParent() instanceof qj3) {
                                    i6 = ((qj3) getParent()).A3;
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
                            i4 -= hl.m;
                            if (!z2) {
                                if (!gk3Var.T) {
                                    i4 -= a.getCurrentActionBarHeight();
                                    if (getParent() instanceof qj3) {
                                        i6 = ((qj3) getParent()).A3;
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
        if (gk3Var.T) {
            i8 += hl.L(1000.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
    }
}
