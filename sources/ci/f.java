package ci;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.r20;
import org.telegram.ui.s20;
import s4.c0;
import s4.c1;
import xh.x;
import xh.z7;
public final class f extends r20 {
    public final int K0 = 0;
    public final q0 L0;
    public final s20 M0;

    public f(j jVar, Activity activity) {
        super(jVar, activity);
        this.M0 = jVar;
        this.L0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        l lVar;
        int i13;
        int max;
        l lVar2;
        int i14;
        int max2;
        switch (this.K0) {
            case 0:
                j jVar = (j) this.M0;
                if (viewGroup == jVar.f36527c && jVar.R.isAttachedToWindow()) {
                    lVar = ((p2) jVar).actionBar;
                    boolean z10 = lVar.f18389n0;
                    int top = (((View) jVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight();
                    int bottom = ((View) jVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (jVar.f36527c.getHeight() - bottom >= 0) {
                            vl0 currentListView = jVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                c1 K = currentListView.K(L0);
                                if (K != null) {
                                    i15 = K.f41610a.getTop();
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
                        vl0 currentListView2 = jVar.R.getCurrentListView();
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
                        vl0 currentListView3 = jVar.R.getCurrentListView();
                        if (jVar.f36527c.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            jVar.f36527c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                z7 z7Var = (z7) this.M0;
                if (viewGroup == z7Var.f36527c && z7Var.R.isAttachedToWindow()) {
                    lVar2 = ((p2) z7Var).actionBar;
                    boolean z12 = lVar2.f18389n0;
                    int top2 = (((View) z7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight();
                    int bottom2 = ((View) z7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if ((z7Var.f36527c.getHeight() - z7Var.f36527c.getPaddingBottom()) - bottom2 >= 0) {
                            vl0 currentListView4 = z7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                c1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i16 = K2.f41610a.getTop();
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
                        vl0 currentListView5 = z7Var.R.getCurrentListView();
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
                        vl0 currentListView6 = z7Var.R.getCurrentListView();
                        if ((z7Var.f36527c.getHeight() - z7Var.f36527c.getPaddingBottom()) - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            z7Var.f36527c.B0();
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
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                j jVar = (j) this.M0;
                try {
                    if (viewGroup == jVar.f36527c && jVar.R.isAttachedToWindow()) {
                        vl0 currentListView = jVar.R.getCurrentListView();
                        if (jVar.f36527c.getHeight() - ((View) jVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new wc(this, 8));
                    return;
                }
            default:
                z7 z7Var = (z7) this.M0;
                try {
                    if (viewGroup == z7Var.f36527c && z7Var.R.isAttachedToWindow()) {
                        vl0 currentListView2 = z7Var.R.getCurrentListView();
                        if ((z7Var.f36527c.getHeight() - z7Var.f36527c.getPaddingBottom()) - ((View) z7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new x(this, 12));
                    return;
                }
        }
    }

    @Override
    public final void n(int i10, View view) {
        switch (this.K0) {
            case 0:
                this.L0.f1896a = 0;
                return;
            default:
                this.L0.f1896a = 0;
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
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
    public final void onStopNestedScroll(View view) {
        int i10 = this.K0;
    }

    @Override
    public final void r(View view, View view2, int i10, int i11) {
        switch (this.K0) {
            case 0:
                this.L0.f1896a = i10;
                return;
            default:
                this.L0.f1896a = i10;
                return;
        }
    }

    public f(z7 z7Var, Activity activity) {
        super(z7Var, activity);
        this.M0 = z7Var;
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
