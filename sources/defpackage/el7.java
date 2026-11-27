package defpackage;

import android.content.Context;
import android.view.View;
public abstract class el7 extends wma implements cl7, View.OnLayoutChangeListener {
    public final m09 g0;
    public View h0;
    public dl7 i0;
    public lx0 j0;
    public int k0;
    public boolean l0;

    public el7(Context context) {
        super(context, null);
        this.g0 = new m09((byte) 3);
    }

    public final void X() {
        View view = this.h0;
        if (view != null && this.i0 != null) {
            this.k0 = (view.getMeasuredHeight() - this.h0.getPaddingBottom()) - this.i0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i, View view) {
        this.g0.b = 0;
        lx0 lx0Var = this.j0;
        if (lx0Var != null) {
            lx0Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        dl7 dl7Var;
        if (view == this.h0 && (dl7Var = this.i0) != null && ((w71) dl7Var).getListView() != null) {
            d79 listView = ((w71) this.i0).getListView();
            if (this.i0.getTop() == this.k0) {
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
        this.l0 = true;
        dl7 dl7Var = this.i0;
        if (dl7Var != null) {
            dl7Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0 = false;
        dl7 dl7Var = this.i0;
        if (dl7Var != null) {
            dl7Var.removeOnLayoutChangeListener(this);
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
        this.g0.b = i;
    }

    @Override
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        dl7 dl7Var;
        int max;
        if (view == this.h0 && (dl7Var = this.i0) != null && ((w71) dl7Var).getListView() != null) {
            int top = this.i0.getTop();
            if (i2 < 0) {
                if (top <= this.k0) {
                    d79 listView = ((w71) this.i0).getListView();
                    int K0 = ((x46) listView.getLayoutManager()).K0();
                    int i4 = -1;
                    if (K0 != -1) {
                        f89 L = listView.L(K0);
                        if (L != null) {
                            i4 = L.a.getTop();
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
                } else if (this.j0 != null && !this.h0.canScrollVertically(i2)) {
                    this.j0.onNestedScroll(view, 0, 0, i, i2);
                    return;
                } else {
                    return;
                }
            }
            lx0 lx0Var = this.j0;
            if (lx0Var != null) {
                lx0Var.onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(lx0 lx0Var) {
        this.j0 = lx0Var;
    }

    public void setChildLayout(dl7 dl7Var) {
        if (this.i0 != dl7Var) {
            this.i0 = dl7Var;
            if (this.l0 && dl7Var != null) {
                w71 w71Var = (w71) dl7Var;
                if (w71Var.getListView() != null) {
                    w71Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.h0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
