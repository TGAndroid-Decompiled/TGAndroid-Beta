package di;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import s4.c0;
import s4.c1;
import yh.r2;
import yh.v7;
public final class f extends o20 {
    public final int J0 = 0;
    public final q0 K0;
    public final p20 L0;

    public f(i iVar, Activity activity) {
        super(iVar, activity);
        this.L0 = iVar;
        this.K0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        l lVar;
        int i13;
        int max;
        l lVar2;
        int i14;
        int max2;
        switch (this.J0) {
            case 0:
                i iVar = (i) this.L0;
                if (viewGroup == iVar.f36305c && iVar.R.isAttachedToWindow()) {
                    lVar = ((o2) iVar).actionBar;
                    boolean z10 = lVar.f19570n0;
                    int top = (((View) iVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight();
                    int bottom = ((View) iVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (iVar.f36305c.getHeight() - bottom >= 0) {
                            yl0 currentListView = iVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                c1 L = currentListView.L(L0);
                                if (L != null) {
                                    i15 = L.f43005a.getTop();
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
                        yl0 currentListView2 = iVar.R.getCurrentListView();
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
                        yl0 currentListView3 = iVar.R.getCurrentListView();
                        if (iVar.f36305c.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            iVar.f36305c.C0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                v7 v7Var = (v7) this.L0;
                if (viewGroup == v7Var.f36305c && v7Var.R.isAttachedToWindow()) {
                    lVar2 = ((o2) v7Var).actionBar;
                    boolean z12 = lVar2.f19570n0;
                    int top2 = (((View) v7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight();
                    int bottom2 = ((View) v7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if ((v7Var.f36305c.getHeight() - v7Var.f36305c.getPaddingBottom()) - bottom2 >= 0) {
                            yl0 currentListView4 = v7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                c1 L2 = currentListView4.L(L02);
                                if (L2 != null) {
                                    i16 = L2.f43005a.getTop();
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
                        yl0 currentListView5 = v7Var.R.getCurrentListView();
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
                        yl0 currentListView6 = v7Var.R.getCurrentListView();
                        if ((v7Var.f36305c.getHeight() - v7Var.f36305c.getPaddingBottom()) - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            v7Var.f36305c.C0();
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
                    if (viewGroup == iVar.f36305c && iVar.R.isAttachedToWindow()) {
                        yl0 currentListView = iVar.R.getCurrentListView();
                        if (iVar.f36305c.getHeight() - ((View) iVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new qc(this, 4));
                    return;
                }
            default:
                v7 v7Var = (v7) this.L0;
                try {
                    if (viewGroup == v7Var.f36305c && v7Var.R.isAttachedToWindow()) {
                        yl0 currentListView2 = v7Var.R.getCurrentListView();
                        if ((v7Var.f36305c.getHeight() - v7Var.f36305c.getPaddingBottom()) - ((View) v7Var.R.getParent()).getBottom() >= 0) {
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
        switch (this.J0) {
            case 0:
                this.K0.f3197a = 0;
                return;
            default:
                this.K0.f3197a = 0;
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
                this.K0.f3197a = i10;
                return;
            default:
                this.K0.f3197a = i10;
                return;
        }
    }

    public f(v7 v7Var, Activity activity) {
        super(v7Var, activity);
        this.L0 = v7Var;
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
