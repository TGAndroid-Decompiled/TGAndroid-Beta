package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.tl0;
public final class o extends qv0 implements r0.n {
    public final c5.e f14502t0;
    public final p f14503u0;

    public o(p pVar, Context context) {
        super(context, null);
        this.f14503u0 = pVar;
        this.f14502t0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z4;
        int max;
        p pVar = this.f14503u0;
        if (viewGroup == pVar.f14559e && pVar.C.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) pVar).actionBar;
            boolean z10 = kVar.f21546k0;
            int top = (((View) pVar.C.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) pVar.C.getParent()).getBottom();
            boolean z11 = false;
            if (i11 < 0) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) pVar).actionBar;
                if (pVar.f14559e.getHeight() - bottom < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kVar2.setCastShadows(z4);
                if (pVar.f14559e.getHeight() - bottom >= 0) {
                    tl0 currentListView = pVar.C.getCurrentListView();
                    int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        f2.m1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f5875a.getTop();
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
                tl0 currentListView2 = pVar.C.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            } else if (i11 > 0) {
                tl0 currentListView3 = pVar.C.getCurrentListView();
                if (pVar.f14559e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i11;
                    pVar.f14559e.B0();
                }
            }
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        p pVar = this.f14503u0;
        try {
            if (viewGroup == pVar.f14559e && pVar.C.isAttachedToWindow()) {
                tl0 currentListView = pVar.C.getCurrentListView();
                int bottom = ((View) pVar.C.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.p2) pVar).actionBar;
                if (pVar.f14559e.getHeight() - bottom < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kVar.setCastShadows(z4);
                if (pVar.f14559e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new lh.c3(this, 2));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f14502t0.f2268a = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f14502t0.f2268a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
