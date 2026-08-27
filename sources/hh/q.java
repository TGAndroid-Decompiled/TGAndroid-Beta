package hh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;

public final class q extends zu0 implements r0.n {

    public final d5.p f9886s0;

    public final r f9887t0;

    public q(r rVar, Context context) {
        super(context, null);
        this.f9887t0 = rVar;
        this.f9886s0 = new d5.p();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int i13;
        r rVar = this.f9887t0;
        if (viewGroup == rVar.f9956e && rVar.B.isAttachedToWindow()) {
            boolean z10 = ((org.telegram.ui.ActionBar.n2) rVar).actionBar.f23578j0;
            int top = (((View) rVar.B.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) rVar.B.getParent()).getBottom();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    zk0 currentListView = rVar.B.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView.scrollBy(0, i13);
                    return;
                }
                if (i11 > 0) {
                    zk0 currentListView2 = rVar.B.getCurrentListView();
                    if (rVar.f9956e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    rVar.f9956e.B0();
                    return;
                }
                return;
            }
            ((org.telegram.ui.ActionBar.n2) rVar).actionBar.setCastShadows(rVar.f9956e.getHeight() - bottom < 0);
            if (rVar.f9956e.getHeight() - bottom >= 0) {
                zk0 currentListView3 = rVar.B.getCurrentListView();
                int iL0 = ((f2.k0) currentListView3.getLayoutManager()).L0();
                if (iL0 != -1) {
                    f2.o1 o1VarK = currentListView3.K(iL0);
                    int top2 = o1VarK != null ? o1VarK.f5789a.getTop() : -1;
                    int paddingTop = currentListView3.getPaddingTop();
                    if (top2 != paddingTop || iL0 != 0) {
                        iArr[1] = iL0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView3.scrollBy(0, i11);
                        z11 = true;
                    }
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        r rVar = this.f9887t0;
        try {
            if (viewGroup == rVar.f9956e && rVar.B.isAttachedToWindow()) {
                zk0 currentListView = rVar.B.getCurrentListView();
                int bottom = ((View) rVar.B.getParent()).getBottom();
                ((org.telegram.ui.ActionBar.n2) rVar).actionBar.setCastShadows(rVar.f9956e.getHeight() - bottom < 0);
                if (rVar.f9956e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new f2.r(this, 16));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final void p(int i10, View view) {
        this.f9886s0.f4821a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f9886s0.f4821a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
