package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sl0;
public final class p extends qv0 implements r0.n {
    public final c5.e f12900t0;
    public final q f12901u0;

    public p(q qVar, Context context) {
        super(context, null);
        this.f12901u0 = qVar;
        this.f12900t0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z4;
        int max;
        q qVar = this.f12901u0;
        if (viewGroup == qVar.e && qVar.C.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) qVar).actionBar;
            boolean z10 = kVar.f20330k0;
            int top = (((View) qVar.C.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) qVar.C.getParent()).getBottom();
            boolean z11 = false;
            if (i11 < 0) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) qVar).actionBar;
                if (qVar.e.getHeight() - bottom < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kVar2.setCastShadows(z4);
                if (qVar.e.getHeight() - bottom >= 0) {
                    sl0 currentListView = qVar.C.getCurrentListView();
                    int L0 = ((f2.i0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        f2.l1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f5785a.getTop();
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
            } else if (z10) {
                sl0 currentListView2 = qVar.C.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            } else if (i11 > 0) {
                sl0 currentListView3 = qVar.C.getCurrentListView();
                if (qVar.e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i11;
                    qVar.e.B0();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        q qVar = this.f12901u0;
        try {
            if (viewGroup == qVar.e && qVar.C.isAttachedToWindow()) {
                sl0 currentListView = qVar.C.getCurrentListView();
                int bottom = ((View) qVar.C.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.p2) qVar).actionBar;
                if (qVar.e.getHeight() - bottom < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kVar.setCastShadows(z4);
                if (qVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f12900t0.f2085a = 0;
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
        this.f12900t0.f2085a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
