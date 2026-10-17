package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jw0;
public final class w extends jw0 implements r0.m {
    public final b2.u0 f2346w0;
    public final x f2347x0;

    public w(x xVar, Context context) {
        super(context, null);
        this.f2347x0 = xVar;
        this.f2346w0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        int max;
        x xVar = this.f2347x0;
        if (viewGroup == xVar.e && xVar.F.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.n2) xVar).actionBar;
            boolean z11 = kVar.f21493n0;
            int top = (((View) xVar.F.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) xVar.F.getParent()).getBottom();
            boolean z12 = false;
            if (i11 < 0) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) xVar).actionBar;
                if (xVar.e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar2.setCastShadows(z10);
                if (xVar.e.getHeight() - bottom >= 0) {
                    im0 currentListView = xVar.F.getCurrentListView();
                    int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        s4.b1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f45938a.getTop();
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
                im0 currentListView2 = xVar.F.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            } else if (i11 > 0) {
                im0 currentListView3 = xVar.F.getCurrentListView();
                if (xVar.e.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                    iArr[1] = i11;
                    xVar.e.B0();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        x xVar = this.f2347x0;
        try {
            if (viewGroup == xVar.e && xVar.F.isAttachedToWindow()) {
                im0 currentListView = xVar.F.getCurrentListView();
                int bottom = ((View) xVar.F.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.n2) xVar).actionBar;
                if (xVar.e.getHeight() - bottom < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar.setCastShadows(z10);
                if (xVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new a3.d(this, 7));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f2346w0.f4056a = 0;
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
        this.f2346w0.f4056a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
