package di;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.l20;
import org.telegram.ui.m20;
import s4.c0;
import s4.c1;
import yh.r2;
import yh.w7;
public final class f extends l20 {
    public final int K0 = 0;
    public final q0 L0;
    public final m20 M0;

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
                if (viewGroup == iVar.f35449c && iVar.R.isAttachedToWindow()) {
                    kVar = ((m2) iVar).actionBar;
                    boolean z10 = kVar.f19555n0;
                    int top = (((View) iVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom = ((View) iVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (iVar.f35449c.getHeight() - bottom >= 0) {
                            wl0 currentListView = iVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                c1 K = currentListView.K(L0);
                                if (K != null) {
                                    i15 = K.f42960a.getTop();
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
                        wl0 currentListView2 = iVar.R.getCurrentListView();
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
                        wl0 currentListView3 = iVar.R.getCurrentListView();
                        if (iVar.f35449c.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            iVar.f35449c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                w7 w7Var = (w7) this.M0;
                if (viewGroup == w7Var.f35449c && w7Var.R.isAttachedToWindow()) {
                    kVar2 = ((m2) w7Var).actionBar;
                    boolean z12 = kVar2.f19555n0;
                    int top2 = (((View) w7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom2 = ((View) w7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if ((w7Var.f35449c.getHeight() - w7Var.f35449c.getPaddingBottom()) - bottom2 >= 0) {
                            wl0 currentListView4 = w7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                c1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i16 = K2.f42960a.getTop();
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
                        wl0 currentListView5 = w7Var.R.getCurrentListView();
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
                        wl0 currentListView6 = w7Var.R.getCurrentListView();
                        if ((w7Var.f35449c.getHeight() - w7Var.f35449c.getPaddingBottom()) - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            w7Var.f35449c.B0();
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
        int i15 = this.K0;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                i iVar = (i) this.M0;
                try {
                    if (viewGroup == iVar.f35449c && iVar.R.isAttachedToWindow()) {
                        wl0 currentListView = iVar.R.getCurrentListView();
                        if (iVar.f35449c.getHeight() - ((View) iVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new rc(this, 4));
                    return;
                }
            default:
                w7 w7Var = (w7) this.M0;
                try {
                    if (viewGroup == w7Var.f35449c && w7Var.R.isAttachedToWindow()) {
                        wl0 currentListView2 = w7Var.R.getCurrentListView();
                        if ((w7Var.f35449c.getHeight() - w7Var.f35449c.getPaddingBottom()) - ((View) w7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new r2(this, 6));
                    return;
                }
        }
    }

    @Override
    public final void o(int i10, View view) {
        switch (this.K0) {
            case 0:
                this.L0.f3195a = 0;
                return;
            default:
                this.L0.f3195a = 0;
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
                this.L0.f3195a = i10;
                return;
            default:
                this.L0.f3195a = i10;
                return;
        }
    }

    public f(w7 w7Var, Activity activity) {
        super(w7Var, activity);
        this.M0 = w7Var;
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
