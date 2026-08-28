package gh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.w10;
import org.telegram.ui.x10;
public final class z9 extends w10 {
    public final int G0 = 0;
    public final d5.p H0;
    public final x10 I0;

    public z9(lh.g gVar, Activity activity) {
        super(gVar, activity);
        this.I0 = gVar;
        this.H0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        int max;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        int max2;
        switch (this.G0) {
            case 0:
                oa oaVar = (oa) this.I0;
                if (viewGroup == oaVar.f44314c && oaVar.N.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.o2) oaVar).actionBar;
                    boolean z10 = kVar.f23577j0;
                    int top = (((View) oaVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) oaVar.N.getParent()).getBottom();
                    boolean z11 = false;
                    if (i10 < 0) {
                        if ((oaVar.f44314c.getHeight() - oaVar.f44314c.getPaddingBottom()) - bottom >= 0) {
                            wk0 currentListView = oaVar.N.getCurrentListView();
                            int L0 = ((f2.m0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                f2.q1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f5501a.getTop();
                                }
                                int paddingTop = currentListView.getPaddingTop();
                                if (i14 != paddingTop || L0 != 0) {
                                    if (L0 != 0) {
                                        max = i10;
                                    } else {
                                        max = Math.max(i10, i14 - paddingTop);
                                    }
                                    iArr[1] = max;
                                    currentListView.scrollBy(0, i10);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i10 - Math.max(top, i10);
                                return;
                            } else {
                                iArr[1] = i10;
                                return;
                            }
                        }
                        return;
                    } else if (z10) {
                        wk0 currentListView2 = oaVar.N.getCurrentListView();
                        iArr[1] = i10;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 != null && (i12 = iArr[1]) > 0) {
                            currentListView2.scrollBy(0, i12);
                            return;
                        }
                        return;
                    } else if (i10 > 0) {
                        wk0 currentListView3 = oaVar.N.getCurrentListView();
                        if ((oaVar.f44314c.getHeight() - oaVar.f44314c.getPaddingBottom()) - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i10;
                            oaVar.f44314c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                lh.g gVar = (lh.g) this.I0;
                if (viewGroup == gVar.f44314c && gVar.N.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    boolean z12 = kVar2.f23577j0;
                    int top2 = (((View) gVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.N.getParent()).getBottom();
                    boolean z13 = false;
                    if (i10 < 0) {
                        if (gVar.f44314c.getHeight() - bottom2 >= 0) {
                            wk0 currentListView4 = gVar.N.getCurrentListView();
                            int L02 = ((f2.m0) currentListView4.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L02 != -1) {
                                f2.q1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i15 = K2.f5501a.getTop();
                                }
                                int paddingTop2 = currentListView4.getPaddingTop();
                                if (i15 != paddingTop2 || L02 != 0) {
                                    if (L02 != 0) {
                                        max2 = i10;
                                    } else {
                                        max2 = Math.max(i10, i15 - paddingTop2);
                                    }
                                    iArr[1] = max2;
                                    currentListView4.scrollBy(0, i10);
                                    z13 = true;
                                }
                            }
                        }
                        if (z12) {
                            if (!z13 && top2 < 0) {
                                iArr[1] = i10 - Math.max(top2, i10);
                                return;
                            } else {
                                iArr[1] = i10;
                                return;
                            }
                        }
                        return;
                    } else if (z12) {
                        wk0 currentListView5 = gVar.N.getCurrentListView();
                        iArr[1] = i10;
                        if (top2 > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView5 != null && (i13 = iArr[1]) > 0) {
                            currentListView5.scrollBy(0, i13);
                            return;
                        }
                        return;
                    } else if (i10 > 0) {
                        wk0 currentListView6 = gVar.N.getCurrentListView();
                        if (gVar.f44314c.getHeight() - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i10;
                            gVar.f44314c.B0();
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
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
        int i14 = this.G0;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        switch (this.G0) {
            case 0:
                oa oaVar = (oa) this.I0;
                try {
                    if (viewGroup == oaVar.f44314c && oaVar.N.isAttachedToWindow()) {
                        wk0 currentListView = oaVar.N.getCurrentListView();
                        if ((oaVar.f44314c.getHeight() - oaVar.f44314c.getPaddingBottom()) - ((View) oaVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    FileLog.e(th);
                    AndroidUtilities.runOnUIThread(new fh.o1(this, 19));
                    return;
                }
            default:
                lh.g gVar = (lh.g) this.I0;
                try {
                    if (viewGroup == gVar.f44314c && gVar.N.isAttachedToWindow()) {
                        wk0 currentListView2 = gVar.N.getCurrentListView();
                        if (gVar.f44314c.getHeight() - ((View) gVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i12;
                            currentListView2.scrollBy(0, i12);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new kh.f1(this, 21));
                    return;
                }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
        int i9 = this.G0;
    }

    @Override
    public final void p(int i9, View view) {
        switch (this.G0) {
            case 0:
                this.H0.f4376a = 0;
                return;
            default:
                this.H0.f4376a = 0;
                return;
        }
    }

    @Override
    public final boolean q(View view, View view2, int i9, int i10) {
        switch (this.G0) {
            case 0:
                if (i9 == 2) {
                    return true;
                }
                return false;
            default:
                if (i9 == 2) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        switch (this.G0) {
            case 0:
                this.H0.f4376a = i9;
                return;
            default:
                this.H0.f4376a = i9;
                return;
        }
    }

    public z9(oa oaVar, Activity activity) {
        super(oaVar, activity);
        this.I0 = oaVar;
        this.H0 = new Object();
    }

    private final void e0(View view) {
    }

    private final void f0(View view) {
    }

    private final void c0(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }

    private final void d0(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
