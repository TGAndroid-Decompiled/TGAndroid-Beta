package hh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.a20;
import org.telegram.ui.z10;

public final class z9 extends z10 {
    public final int G0 = 0;
    public final d5.p H0;
    public final a20 I0;

    public z9(mh.g gVar, Activity activity) {
        super(gVar, activity);
        this.I0 = gVar;
        this.H0 = new d5.p();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int i13;
        int i14;
        switch (this.G0) {
            case 0:
                oa oaVar = (oa) this.I0;
                if (viewGroup == oaVar.f36342c && oaVar.N.isAttachedToWindow()) {
                    boolean z10 = ((org.telegram.ui.ActionBar.n2) oaVar).actionBar.f23578j0;
                    int top = (((View) oaVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) oaVar.N.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if ((oaVar.f36342c.getHeight() - oaVar.f36342c.getPaddingBottom()) - bottom >= 0) {
                            zk0 currentListView = oaVar.N.getCurrentListView();
                            int iL0 = ((f2.k0) currentListView.getLayoutManager()).L0();
                            if (iL0 != -1) {
                                f2.o1 o1VarK = currentListView.K(iL0);
                                int top2 = o1VarK != null ? o1VarK.f5789a.getTop() : -1;
                                int paddingTop = currentListView.getPaddingTop();
                                if (top2 != paddingTop || iL0 != 0) {
                                    iArr[1] = iL0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                            } else {
                                iArr[1] = i11;
                            }
                        }
                        break;
                    } else if (z10) {
                        zk0 currentListView2 = oaVar.N.getCurrentListView();
                        iArr[1] = i11;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    } else if (i11 > 0) {
                        zk0 currentListView3 = oaVar.N.getCurrentListView();
                        if ((oaVar.f36342c.getHeight() - oaVar.f36342c.getPaddingBottom()) - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                            iArr[1] = i11;
                            oaVar.f36342c.B0();
                            break;
                        }
                    }
                }
                break;
            default:
                mh.g gVar = (mh.g) this.I0;
                if (viewGroup == gVar.f36342c && gVar.N.isAttachedToWindow()) {
                    boolean z12 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar.f23578j0;
                    int top3 = (((View) gVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.N.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 < 0) {
                        if (gVar.f36342c.getHeight() - bottom2 >= 0) {
                            zk0 currentListView4 = gVar.N.getCurrentListView();
                            int iL1 = ((f2.k0) currentListView4.getLayoutManager()).L0();
                            if (iL1 != -1) {
                                f2.o1 o1VarK2 = currentListView4.K(iL1);
                                int top4 = o1VarK2 != null ? o1VarK2.f5789a.getTop() : -1;
                                int paddingTop2 = currentListView4.getPaddingTop();
                                if (top4 != paddingTop2 || iL1 != 0) {
                                    iArr[1] = iL1 != 0 ? i11 : Math.max(i11, top4 - paddingTop2);
                                    currentListView4.scrollBy(0, i11);
                                    z13 = true;
                                }
                            }
                        }
                        if (z12) {
                            if (!z13 && top3 < 0) {
                                iArr[1] = i11 - Math.max(top3, i11);
                            } else {
                                iArr[1] = i11;
                            }
                        }
                        break;
                    } else if (z12) {
                        zk0 currentListView5 = gVar.N.getCurrentListView();
                        iArr[1] = i11;
                        if (top3 > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView5 != null && (i14 = iArr[1]) > 0) {
                            currentListView5.scrollBy(0, i14);
                            break;
                        }
                    } else if (i11 > 0) {
                        zk0 currentListView6 = gVar.N.getCurrentListView();
                        if (gVar.f36342c.getHeight() - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                            iArr[1] = i11;
                            gVar.f36342c.B0();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.G0;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.G0) {
            case 0:
                oa oaVar = (oa) this.I0;
                try {
                    if (viewGroup == oaVar.f36342c && oaVar.N.isAttachedToWindow()) {
                        zk0 currentListView = oaVar.N.getCurrentListView();
                        if ((oaVar.f36342c.getHeight() - oaVar.f36342c.getPaddingBottom()) - ((View) oaVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                        }
                        break;
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                    AndroidUtilities.runOnUIThread(new y9(this, 0));
                    return;
                }
                break;
            default:
                mh.g gVar = (mh.g) this.I0;
                try {
                    if (viewGroup == gVar.f36342c && gVar.N.isAttachedToWindow()) {
                        zk0 currentListView2 = gVar.N.getCurrentListView();
                        if (gVar.f36342c.getHeight() - ((View) gVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                        }
                        break;
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new kh.c(this, 28));
                }
                break;
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
        int i10 = this.G0;
    }

    @Override
    public final void p(int i10, View view) {
        switch (this.G0) {
            case 0:
                this.H0.f4821a = 0;
                break;
            default:
                this.H0.f4821a = 0;
                break;
        }
    }

    @Override
    public final boolean q(View view, View view2, int i10, int i11) {
        switch (this.G0) {
            case 0:
                return i10 == 2;
            default:
                return i10 == 2;
        }
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        switch (this.G0) {
            case 0:
                this.H0.f4821a = i10;
                break;
            default:
                this.H0.f4821a = i10;
                break;
        }
    }

    public z9(oa oaVar, Activity activity) {
        super(oaVar, activity);
        this.I0 = oaVar;
        this.H0 = new d5.p();
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
