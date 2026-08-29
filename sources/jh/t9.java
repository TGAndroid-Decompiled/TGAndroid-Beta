package jh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.y10;
import org.telegram.ui.z10;
public final class t9 extends y10 {
    public final int G0 = 0;
    public final a5.e H0;
    public final z10 I0;

    public t9(oh.g gVar, Activity activity) {
        super(gVar, activity);
        this.I0 = gVar;
        this.H0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        int max;
        org.telegram.ui.ActionBar.l lVar2;
        int i14;
        int max2;
        switch (this.G0) {
            case 0:
                ia iaVar = (ia) this.I0;
                if (viewGroup == iaVar.f45015c && iaVar.N.isAttachedToWindow()) {
                    lVar = ((org.telegram.ui.ActionBar.o2) iaVar).actionBar;
                    boolean z10 = lVar.f23612j0;
                    int top = (((View) iaVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    int bottom = ((View) iaVar.N.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if ((iaVar.f45015c.getHeight() - iaVar.f45015c.getPaddingBottom()) - bottom >= 0) {
                            jl0 currentListView = iaVar.N.getCurrentListView();
                            int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                f2.n1 K = currentListView.K(L0);
                                if (K != null) {
                                    i15 = K.f6432a.getTop();
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
                        jl0 currentListView2 = iaVar.N.getCurrentListView();
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
                        jl0 currentListView3 = iaVar.N.getCurrentListView();
                        if ((iaVar.f45015c.getHeight() - iaVar.f45015c.getPaddingBottom()) - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            iaVar.f45015c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                oh.g gVar = (oh.g) this.I0;
                if (viewGroup == gVar.f45015c && gVar.N.isAttachedToWindow()) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    boolean z12 = lVar2.f23612j0;
                    int top2 = (((View) gVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.N.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if (gVar.f45015c.getHeight() - bottom2 >= 0) {
                            jl0 currentListView4 = gVar.N.getCurrentListView();
                            int L02 = ((f2.j0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                f2.n1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i16 = K2.f6432a.getTop();
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
                        jl0 currentListView5 = gVar.N.getCurrentListView();
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
                        jl0 currentListView6 = gVar.N.getCurrentListView();
                        if (gVar.f45015c.getHeight() - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            gVar.f45015c.B0();
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
        int i15 = this.G0;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.G0) {
            case 0:
                ia iaVar = (ia) this.I0;
                try {
                    if (viewGroup == iaVar.f45015c && iaVar.N.isAttachedToWindow()) {
                        jl0 currentListView = iaVar.N.getCurrentListView();
                        if ((iaVar.f45015c.getHeight() - iaVar.f45015c.getPaddingBottom()) - ((View) iaVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new o(this, 14));
                    return;
                }
            default:
                oh.g gVar = (oh.g) this.I0;
                try {
                    if (viewGroup == gVar.f45015c && gVar.N.isAttachedToWindow()) {
                        jl0 currentListView2 = gVar.N.getCurrentListView();
                        if (gVar.f45015c.getHeight() - ((View) gVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new nh.m6(this, 12));
                    return;
                }
        }
    }

    @Override
    public final void n(int i10, View view) {
        switch (this.G0) {
            case 0:
                this.H0.f165a = 0;
                return;
            default:
                this.H0.f165a = 0;
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        switch (this.G0) {
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
        int i10 = this.G0;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.G0) {
            case 0:
                this.H0.f165a = i10;
                return;
            default:
                this.H0.f165a = i10;
                return;
        }
    }

    public t9(ia iaVar, Activity activity) {
        super(iaVar, activity);
        this.I0 = iaVar;
        this.H0 = new Object();
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
