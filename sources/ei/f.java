package ei;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import s4.c0;
import s4.c1;
import zh.m2;
import zh.v7;
public final class f extends q20 {
    public final int K0 = 0;
    public final q0 L0;
    public final r20 M0;

    public f(i iVar, Activity activity) {
        super(iVar, activity);
        this.M0 = iVar;
        this.L0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        k kVar;
        int i13;
        int max;
        k kVar2;
        int i14;
        int max2;
        switch (this.K0) {
            case 0:
                i iVar = (i) this.M0;
                if (viewGroup == iVar.f40041c && iVar.R.isAttachedToWindow()) {
                    kVar = ((n2) iVar).actionBar;
                    boolean z10 = kVar.f21103n0;
                    int top = (((View) iVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom = ((View) iVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (iVar.f40041c.getHeight() - bottom >= 0) {
                            ll0 currentListView = iVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                c1 K = currentListView.K(L0);
                                if (K != null) {
                                    i15 = K.f45738a.getTop();
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
                        ll0 currentListView2 = iVar.R.getCurrentListView();
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
                        ll0 currentListView3 = iVar.R.getCurrentListView();
                        if (iVar.f40041c.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            iVar.f40041c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                v7 v7Var = (v7) this.M0;
                if (viewGroup == v7Var.f40041c && v7Var.R.isAttachedToWindow()) {
                    kVar2 = ((n2) v7Var).actionBar;
                    boolean z12 = kVar2.f21103n0;
                    int top2 = (((View) v7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom2 = ((View) v7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if ((v7Var.f40041c.getHeight() - v7Var.f40041c.getPaddingBottom()) - bottom2 >= 0) {
                            ll0 currentListView4 = v7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                c1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i16 = K2.f45738a.getTop();
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
                        ll0 currentListView5 = v7Var.R.getCurrentListView();
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
                        ll0 currentListView6 = v7Var.R.getCurrentListView();
                        if ((v7Var.f40041c.getHeight() - v7Var.f40041c.getPaddingBottom()) - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            v7Var.f40041c.B0();
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
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.K0;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                i iVar = (i) this.M0;
                try {
                    if (viewGroup == iVar.f40041c && iVar.R.isAttachedToWindow()) {
                        ll0 currentListView = iVar.R.getCurrentListView();
                        if (iVar.f40041c.getHeight() - ((View) iVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new nb(this, 8));
                    return;
                }
            default:
                v7 v7Var = (v7) this.M0;
                try {
                    if (viewGroup == v7Var.f40041c && v7Var.R.isAttachedToWindow()) {
                        ll0 currentListView2 = v7Var.R.getCurrentListView();
                        if ((v7Var.f40041c.getHeight() - v7Var.f40041c.getPaddingBottom()) - ((View) v7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new m2(this, 8));
                    return;
                }
        }
    }

    @Override
    public final void n(int i10, View view) {
        switch (this.K0) {
            case 0:
                this.L0.f2260a = 0;
                return;
            default:
                this.L0.f2260a = 0;
                return;
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
        int i10 = this.K0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.K0) {
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
        switch (this.K0) {
            case 0:
                this.L0.f2260a = i10;
                return;
            default:
                this.L0.f2260a = i10;
                return;
        }
    }

    public f(v7 v7Var, Activity activity) {
        super(v7Var, activity);
        this.M0 = v7Var;
        this.L0 = new Object();
    }

    private final void e0(View view) {
    }

    private final void f0(View view) {
    }

    private final void c0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }

    private final void d0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
