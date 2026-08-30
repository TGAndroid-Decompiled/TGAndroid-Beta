package lh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.k20;
import org.telegram.ui.l20;
public final class u9 extends k20 {
    public final int H0 = 0;
    public final c5.e I0;
    public final l20 J0;

    public u9(qh.g gVar, Activity activity) {
        super(gVar, activity);
        this.J0 = gVar;
        this.I0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        int max;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        int max2;
        switch (this.H0) {
            case 0:
                ja jaVar = (ja) this.J0;
                if (viewGroup == jaVar.f35881c && jaVar.O.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.p2) jaVar).actionBar;
                    boolean z4 = kVar.f20330k0;
                    int top = (((View) jaVar.O.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) jaVar.O.getParent()).getBottom();
                    boolean z10 = false;
                    if (i11 < 0) {
                        if ((jaVar.f35881c.getHeight() - jaVar.f35881c.getPaddingBottom()) - bottom >= 0) {
                            sl0 currentListView = jaVar.O.getCurrentListView();
                            int L0 = ((f2.i0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                f2.l1 K = currentListView.K(L0);
                                if (K != null) {
                                    i15 = K.f5785a.getTop();
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
                                    z10 = true;
                                }
                            }
                        }
                        if (z4) {
                            if (!z10 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                return;
                            } else {
                                iArr[1] = i11;
                                return;
                            }
                        }
                        return;
                    } else if (z4) {
                        sl0 currentListView2 = jaVar.O.getCurrentListView();
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
                        sl0 currentListView3 = jaVar.O.getCurrentListView();
                        if ((jaVar.f35881c.getHeight() - jaVar.f35881c.getPaddingBottom()) - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            jaVar.f35881c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qh.g gVar = (qh.g) this.J0;
                if (viewGroup == gVar.f35881c && gVar.O.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) gVar).actionBar;
                    boolean z11 = kVar2.f20330k0;
                    int top2 = (((View) gVar.O.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.O.getParent()).getBottom();
                    boolean z12 = false;
                    if (i11 < 0) {
                        if (gVar.f35881c.getHeight() - bottom2 >= 0) {
                            sl0 currentListView4 = gVar.O.getCurrentListView();
                            int L02 = ((f2.i0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                f2.l1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i16 = K2.f5785a.getTop();
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
                                    z12 = true;
                                }
                            }
                        }
                        if (z11) {
                            if (!z12 && top2 < 0) {
                                iArr[1] = i11 - Math.max(top2, i11);
                                return;
                            } else {
                                iArr[1] = i11;
                                return;
                            }
                        }
                        return;
                    } else if (z11) {
                        sl0 currentListView5 = gVar.O.getCurrentListView();
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
                        sl0 currentListView6 = gVar.O.getCurrentListView();
                        if (gVar.f35881c.getHeight() - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            gVar.f35881c.B0();
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
        int i15 = this.H0;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.H0) {
            case 0:
                ja jaVar = (ja) this.J0;
                try {
                    if (viewGroup == jaVar.f35881c && jaVar.O.isAttachedToWindow()) {
                        sl0 currentListView = jaVar.O.getCurrentListView();
                        if ((jaVar.f35881c.getHeight() - jaVar.f35881c.getPaddingBottom()) - ((View) jaVar.O.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new b(this, 15));
                    return;
                }
            default:
                qh.g gVar = (qh.g) this.J0;
                try {
                    if (viewGroup == gVar.f35881c && gVar.O.isAttachedToWindow()) {
                        sl0 currentListView2 = gVar.O.getCurrentListView();
                        if (gVar.f35881c.getHeight() - ((View) gVar.O.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new ph.ga(this, 3));
                    return;
                }
        }
    }

    @Override
    public final void n(int i10, View view) {
        switch (this.H0) {
            case 0:
                this.I0.f2085a = 0;
                return;
            default:
                this.I0.f2085a = 0;
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        switch (this.H0) {
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
        int i10 = this.H0;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.H0) {
            case 0:
                this.I0.f2085a = i10;
                return;
            default:
                this.I0.f2085a = i10;
                return;
        }
    }

    public u9(ja jaVar, Activity activity) {
        super(jaVar, activity);
        this.J0 = jaVar;
        this.I0 = new Object();
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
