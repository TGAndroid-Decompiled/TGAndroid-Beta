package defpackage;

import android.content.Context;
import android.view.View;
public abstract class vi7 extends cja implements ti7, View.OnLayoutChangeListener {
    public final zw8 m0;
    public View n0;
    public ui7 o0;
    public dx0 p0;
    public int q0;
    public boolean r0;

    public vi7(Context context) {
        super(context, null);
        this.m0 = new zw8((byte) 3);
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
        dx0 dx0Var = this.p0;
        if (dx0Var != null) {
            dx0Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ui7 ui7Var;
        if (view == this.n0 && (ui7Var = this.o0) != null && ((o71) ui7Var).getListView() != null) {
            o39 listView = ((o71) this.o0).getListView();
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
        ui7 ui7Var = this.o0;
        if (ui7Var != null) {
            ui7Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r0 = false;
        ui7 ui7Var = this.o0;
        if (ui7Var != null) {
            ui7Var.removeOnLayoutChangeListener(this);
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
        ui7 ui7Var;
        int max;
        if (view == this.n0 && (ui7Var = this.o0) != null && ((o71) ui7Var).getListView() != null) {
            int top = this.o0.getTop();
            if (i2 < 0) {
                if (top <= this.q0) {
                    o39 listView = ((o71) this.o0).getListView();
                    int K0 = ((t26) listView.getLayoutManager()).K0();
                    int i4 = -1;
                    if (K0 != -1) {
                        s49 K = listView.K(K0);
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
            dx0 dx0Var = this.p0;
            if (dx0Var != null) {
                dx0Var.onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(dx0 dx0Var) {
        this.p0 = dx0Var;
    }

    public void setChildLayout(ui7 ui7Var) {
        if (this.o0 != ui7Var) {
            this.o0 = ui7Var;
            if (this.r0 && ui7Var != null) {
                o71 o71Var = (o71) ui7Var;
                if (o71Var.getListView() != null) {
                    o71Var.getListView().addOnLayoutChangeListener(this);
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
