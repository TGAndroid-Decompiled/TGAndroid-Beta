package gh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
public final class q extends xu0 implements r0.n {
    public final d5.p f8734s0;
    public final r f8735t0;

    public q(r rVar, Context context) {
        super(context, null);
        this.f8735t0 = rVar;
        this.f8734s0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        int max;
        r rVar = this.f8735t0;
        if (viewGroup == rVar.f8774e && rVar.B.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) rVar).actionBar;
            boolean z11 = kVar.f23577j0;
            int top = (((View) rVar.B.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) rVar.B.getParent()).getBottom();
            boolean z12 = false;
            if (i10 < 0) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) rVar).actionBar;
                if (rVar.f8774e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar2.setCastShadows(z10);
                if (rVar.f8774e.getHeight() - bottom >= 0) {
                    wk0 currentListView = rVar.B.getCurrentListView();
                    int L0 = ((f2.m0) currentListView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        f2.q1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f5501a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i13 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i10;
                            } else {
                                max = Math.max(i10, i13 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i10);
                            z12 = true;
                        }
                    }
                }
                if (z11) {
                    if (!z12 && top < 0) {
                        iArr[1] = i10 - Math.max(top, i10);
                    } else {
                        iArr[1] = i10;
                    }
                }
            } else if (z11) {
                wk0 currentListView2 = rVar.B.getCurrentListView();
                iArr[1] = i10;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i12 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i12);
                }
            } else if (i10 > 0) {
                wk0 currentListView3 = rVar.B.getCurrentListView();
                if (rVar.f8774e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i10;
                    rVar.f8774e.B0();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        r rVar = this.f8735t0;
        try {
            if (viewGroup == rVar.f8774e && rVar.B.isAttachedToWindow()) {
                wk0 currentListView = rVar.B.getCurrentListView();
                int bottom = ((View) rVar.B.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.o2) rVar).actionBar;
                if (rVar.f8774e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar.setCastShadows(z10);
                if (rVar.f8774e.getHeight() - bottom >= 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new fh.o1(this, 5));
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override
    public final void p(int i9, View view) {
        this.f8734s0.f4376a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i9, int i10) {
        if (i9 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        this.f8734s0.f4376a = i9;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
