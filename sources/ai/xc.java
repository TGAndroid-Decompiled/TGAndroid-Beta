package ai;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.a20;
import org.telegram.ui.b20;
public final class xc extends a20 {
    public final int K0 = 0;
    public final b2.u0 L0;
    public final b20 M0;

    public xc(fi.g gVar, Activity activity) {
        super(gVar, activity);
        this.M0 = gVar;
        this.L0 = new Object();
    }

    @Override
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        int max;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        int max2;
        switch (this.K0) {
            case 0:
                nd ndVar = (nd) this.M0;
                if (viewGroup == ndVar.f35894c && ndVar.T.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.o2) ndVar).actionBar;
                    boolean z10 = kVar.f21069n0;
                    int top = (((View) ndVar.T.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) ndVar.T.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if ((ndVar.f35894c.getHeight() - ndVar.f35894c.getPaddingBottom()) - bottom >= 0) {
                            lm0 currentListView = ndVar.T.getCurrentListView();
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            int i15 = -1;
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                if (K != null) {
                                    i15 = K.f46342a.getTop();
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
                        lm0 currentListView2 = ndVar.T.getCurrentListView();
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
                        lm0 currentListView3 = ndVar.T.getCurrentListView();
                        if ((ndVar.f35894c.getHeight() - ndVar.f35894c.getPaddingBottom()) - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            ndVar.f35894c.B0();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                fi.g gVar = (fi.g) this.M0;
                if (viewGroup == gVar.f35894c && gVar.T.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    boolean z12 = kVar2.f21069n0;
                    int top2 = (((View) gVar.T.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.T.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if (gVar.f35894c.getHeight() - bottom2 >= 0) {
                            lm0 currentListView4 = gVar.T.getCurrentListView();
                            int L02 = ((s4.b0) currentListView4.getLayoutManager()).L0();
                            int i16 = -1;
                            if (L02 != -1) {
                                s4.b1 K2 = currentListView4.K(L02);
                                if (K2 != null) {
                                    i16 = K2.f46342a.getTop();
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
                        lm0 currentListView5 = gVar.T.getCurrentListView();
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
                        lm0 currentListView6 = gVar.T.getCurrentListView();
                        if (gVar.f35894c.getHeight() - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            gVar.f35894c.B0();
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
                nd ndVar = (nd) this.M0;
                try {
                    if (viewGroup == ndVar.f35894c && ndVar.T.isAttachedToWindow()) {
                        lm0 currentListView = ndVar.T.getCurrentListView();
                        if ((ndVar.f35894c.getHeight() - ndVar.f35894c.getPaddingBottom()) - ((View) ndVar.T.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new a3.d(this, 23));
                    return;
                }
            default:
                fi.g gVar = (fi.g) this.M0;
                try {
                    if (viewGroup == gVar.f35894c && gVar.T.isAttachedToWindow()) {
                        lm0 currentListView2 = gVar.T.getCurrentListView();
                        if (gVar.f35894c.getHeight() - ((View) gVar.T.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new ei.bc(this, 1));
                    return;
                }
        }
    }

    @Override
    public final void m(int i10, View view) {
        switch (this.K0) {
            case 0:
                this.L0.f4060a = 0;
                return;
            default:
                this.L0.f4060a = 0;
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
                this.L0.f4060a = i10;
                return;
            default:
                this.L0.f4060a = i10;
                return;
        }
    }

    public xc(nd ndVar, Activity activity) {
        super(ndVar, activity);
        this.M0 = ndVar;
        this.L0 = new Object();
    }

    private final void d0(View view) {
    }

    private final void e0(View view) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }

    private final void c0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
