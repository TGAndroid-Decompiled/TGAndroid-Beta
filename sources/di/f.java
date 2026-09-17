package di;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.s20;
import org.telegram.ui.t20;
import s4.c0;
import s4.c1;
import yh.y2;
import yh.y7;
public final class f extends s20 {
    public final int J0 = 0;
    public final q0 K0;
    public final t20 L0;

    public f(i iVar, Activity activity) {
        super(iVar, activity);
        this.L0 = iVar;
        this.K0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        k kVar;
        int i13;
        int max;
        k kVar2;
        int i14;
        int max2;
        switch (this.J0) {
            case 0:
                i iVar = (i) this.L0;
                if (viewGroup == iVar.f37623c && iVar.R.isAttachedToWindow()) {
                    kVar = ((o2) iVar).actionBar;
                    boolean z10 = kVar.f19304n0;
                    int top = (((View) iVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom = ((View) iVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (iVar.f37623c.getHeight() - bottom >= 0) {
                            ml0 currentListView = iVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                c1 L = currentListView.L(L0);
                                if (L != null) {
                                    i15 = L.f42697a.getTop();
                                }
                                int paddingTop = currentListView.getPaddingTop();
                                if (i15 != paddingTop || L0 != 0) {
                                    if (L0 != 0) {
                                        max = i11;
                                    } else {
                                        max = Math.max(i11, i15 - paddingTop);
                                    }
                                    iArr[1] = max;
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                return;
                            } else {
                                iArr[1] = i11;
                                return;
                            }
                        }
                        return;
                    } else if (z10) {
                        ml0 currentListView2 = iVar.R.getCurrentListView();
                        iArr[1] = i11;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    } else if (i11 > 0) {
                        ml0 currentListView3 = iVar.R.getCurrentListView();
                        if (iVar.f37623c.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            iVar.f37623c.C0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                y7 y7Var = (y7) this.L0;
                if (viewGroup == y7Var.f37623c && y7Var.R.isAttachedToWindow()) {
                    kVar2 = ((o2) y7Var).actionBar;
                    boolean z12 = kVar2.f19304n0;
                    int top2 = (((View) y7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom2 = ((View) y7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if ((y7Var.f37623c.getHeight() - y7Var.f37623c.getPaddingBottom()) - bottom2 >= 0) {
                            ml0 currentListView4 = y7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                c1 L2 = currentListView4.L(L02);
                                if (L2 != null) {
                                    i16 = L2.f42697a.getTop();
                                }
                                int paddingTop2 = currentListView4.getPaddingTop();
                                if (i16 != paddingTop2 || L02 != 0) {
                                    if (L02 != 0) {
                                        max2 = i11;
                                    } else {
                                        max2 = Math.max(i11, i16 - paddingTop2);
                                    }
                                    iArr[1] = max2;
                                    currentListView4.scrollBy(0, i11);
                                    z13 = true;
                                }
                            }
                        }
                        if (z12) {
                            if (!z13 && top2 < 0) {
                                iArr[1] = i11 - Math.max(top2, i11);
                                return;
                            } else {
                                iArr[1] = i11;
                                return;
                            }
                        }
                        return;
                    } else if (z12) {
                        ml0 currentListView5 = y7Var.R.getCurrentListView();
                        iArr[1] = i11;
                        if (top2 > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView5 != null && (i14 = iArr[1]) > 0) {
                            currentListView5.scrollBy(0, i14);
                            return;
                        }
                        return;
                    } else if (i11 > 0) {
                        ml0 currentListView6 = y7Var.R.getCurrentListView();
                        if ((y7Var.f37623c.getHeight() - y7Var.f37623c.getPaddingBottom()) - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            y7Var.f37623c.C0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.J0;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.J0) {
            case 0:
                i iVar = (i) this.L0;
                try {
                    if (viewGroup == iVar.f37623c && iVar.R.isAttachedToWindow()) {
                        ml0 currentListView = iVar.R.getCurrentListView();
                        if (iVar.f37623c.getHeight() - ((View) iVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new uc(this, 4));
                    return;
                }
            default:
                y7 y7Var = (y7) this.L0;
                try {
                    if (viewGroup == y7Var.f37623c && y7Var.R.isAttachedToWindow()) {
                        ml0 currentListView2 = y7Var.R.getCurrentListView();
                        if ((y7Var.f37623c.getHeight() - y7Var.f37623c.getPaddingBottom()) - ((View) y7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new y2(this, 5));
                    return;
                }
        }
    }

    @Override
    public final void o(int i10, View view) {
        switch (this.J0) {
            case 0:
                this.K0.f3203a = 0;
                return;
            default:
                this.K0.f3203a = 0;
                return;
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
        int i10 = this.J0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.J0) {
            case 0:
                if (i10 == 2) {
                    return true;
                }
                return false;
            default:
                if (i10 == 2) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.J0) {
            case 0:
                this.K0.f3203a = i10;
                return;
            default:
                this.K0.f3203a = i10;
                return;
        }
    }

    public f(y7 y7Var, Activity activity) {
        super(y7Var, activity);
        this.L0 = y7Var;
        this.K0 = new Object();
    }

    private final void c0(View view) {
    }

    private final void d0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
