package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jl0;
public final class p extends hv0 implements r0.n {
    public final a5.e f12592s0;
    public final q f12593t0;

    public p(q qVar, Context context) {
        super(context, null);
        this.f12593t0 = qVar;
        this.f12592s0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        int max;
        q qVar = this.f12593t0;
        if (viewGroup == qVar.f12638e && qVar.B.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.o2) qVar).actionBar;
            boolean z11 = lVar.f23612j0;
            int top = (((View) qVar.B.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int bottom = ((View) qVar.B.getParent()).getBottom();
            boolean z12 = false;
            if (i11 < 0) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) qVar).actionBar;
                if (qVar.f12638e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lVar2.setCastShadows(z10);
                if (qVar.f12638e.getHeight() - bottom >= 0) {
                    jl0 currentListView = qVar.B.getCurrentListView();
                    int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        f2.n1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f6432a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i14 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i11;
                            } else {
                                max = Math.max(i11, i14 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i11);
                            z12 = true;
                        }
                    }
                }
                if (z11) {
                    if (!z12 && top < 0) {
                        iArr[1] = i11 - Math.max(top, i11);
                    } else {
                        iArr[1] = i11;
                    }
                }
            } else if (z11) {
                jl0 currentListView2 = qVar.B.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            } else if (i11 > 0) {
                jl0 currentListView3 = qVar.B.getCurrentListView();
                if (qVar.f12638e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i11;
                    qVar.f12638e.B0();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        q qVar = this.f12593t0;
        try {
            if (viewGroup == qVar.f12638e && qVar.B.isAttachedToWindow()) {
                jl0 currentListView = qVar.B.getCurrentListView();
                int bottom = ((View) qVar.B.getParent()).getBottom();
                lVar = ((org.telegram.ui.ActionBar.o2) qVar).actionBar;
                if (qVar.f12638e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lVar.setCastShadows(z10);
                if (qVar.f12638e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new o(this, 0));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f12592s0.f165a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f12592s0.f165a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
