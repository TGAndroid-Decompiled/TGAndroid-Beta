package defpackage;

import android.content.Context;
import android.view.View;
public abstract class xk7 extends ela implements vk7, View.OnLayoutChangeListener {
    public final az8 m0;
    public View n0;
    public wk7 o0;
    public ky0 p0;
    public int q0;
    public boolean r0;

    public xk7(Context context) {
        super(context, null);
        this.m0 = new az8((byte) 3);
    }

    public final void X() {
        View view = this.n0;
        if (view != null && this.o0 != null) {
            this.q0 = (view.getMeasuredHeight() - this.n0.getPaddingBottom()) - this.o0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i, View view) {
        this.m0.b = 0;
        ky0 ky0Var = this.p0;
        if (ky0Var != null) {
            ky0Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        wk7 wk7Var;
        if (view == this.n0 && (wk7Var = this.o0) != null && ((w81) wk7Var).getListView() != null) {
            r59 listView = ((w81) this.o0).getListView();
            if (this.o0.getTop() == this.q0) {
                iArr[1] = i4;
                listView.scrollBy(0, i4);
            }
        }
    }

    @Override
    public final boolean n(View view, View view2, int i, int i2) {
        if (view.isAttachedToWindow() && i == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r0 = true;
        wk7 wk7Var = this.o0;
        if (wk7Var != null) {
            wk7Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r0 = false;
        wk7 wk7Var = this.o0;
        if (wk7Var != null) {
            wk7Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        X();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        X();
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        this.m0.b = i;
    }

    @Override
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        wk7 wk7Var;
        int max;
        if (view == this.n0 && (wk7Var = this.o0) != null && ((w81) wk7Var).getListView() != null) {
            int top = this.o0.getTop();
            if (i2 < 0) {
                if (top <= this.q0) {
                    r59 listView = ((w81) this.o0).getListView();
                    int K0 = ((u46) listView.getLayoutManager()).K0();
                    int i4 = -1;
                    if (K0 != -1) {
                        u69 K = listView.K(K0);
                        if (K != null) {
                            i4 = K.a.getTop();
                        }
                        int paddingTop = listView.getPaddingTop();
                        if (i4 != paddingTop || K0 != 0) {
                            if (K0 != 0) {
                                max = i2;
                            } else {
                                max = Math.max(i2, i4 - paddingTop);
                            }
                            iArr[1] = max;
                            listView.scrollBy(0, i2);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this.p0 != null && !this.n0.canScrollVertically(i2)) {
                    this.p0.onNestedScroll(view, 0, 0, i, i2);
                    return;
                } else {
                    return;
                }
            }
            ky0 ky0Var = this.p0;
            if (ky0Var != null) {
                ky0Var.onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(ky0 ky0Var) {
        this.p0 = ky0Var;
    }

    public void setChildLayout(wk7 wk7Var) {
        if (this.o0 != wk7Var) {
            this.o0 = wk7Var;
            if (this.r0 && wk7Var != null) {
                w81 w81Var = (w81) wk7Var;
                if (w81Var.getListView() != null) {
                    w81Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.n0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
