package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.f31;
import org.telegram.ui.m41;
import org.telegram.ui.q21;
import org.telegram.ui.r21;
import org.telegram.ui.rg1;
import org.telegram.ui.tg1;
import org.telegram.ui.w50;
public final class j5 extends d91 {
    public final int f1543a;
    public final Object f1544b;
    public final Object f1545c;

    public j5(Object obj, Context context, int i10) {
        this.f1543a = i10;
        this.f1545c = obj;
        this.f1544b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        o5 o5Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i12 = this.f1543a;
        Object obj = this.f1545c;
        switch (i12) {
            case 0:
                l7 l7Var = (l7) obj;
                if (i11 == 0) {
                    l7.v1(l7Var, false);
                    yh.k2 k2Var = l7Var.f1714c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    l7.v1(l7Var, true);
                    yh.k2 k2Var2 = l7Var.f1716d0;
                    if (k2Var2 != null) {
                        o5Var = k2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(o5Var);
                frameLayout.addView(o5Var);
                return;
            case 1:
                return;
            case 2:
                ((q21) view).a(i11);
                return;
            case 3:
                return;
            case 4:
                tg1 tg1Var = (tg1) obj;
                SparseArray sparseArray = tg1Var.f42049a;
                rg1 rg1Var = (rg1) sparseArray.get(i10);
                if (rg1Var != null) {
                    o2Var = rg1Var.f41154a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = tg1Var.V(i10);
                    rg1 rg1Var2 = new rg1(V);
                    sparseArray.put(i10, rg1Var2);
                    o2Var = V;
                    rg1Var = rg1Var2;
                }
                if (!rg1Var.f41155b) {
                    o2Var.onFragmentCreate();
                    rg1Var.f41155b = true;
                }
                o2Var.setParentLayout(tg1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.f1544b);
                    o2Var.setTitleOverlayText(tg1Var.f42053n, tg1Var.f42054r, tg1Var.f42055s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout2.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f45241a;
                r0.y.c(frameLayout2);
                tg1Var.checkSystemBarColors();
                tg1Var.U();
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i10) {
        o5 o5Var;
        switch (this.f1543a) {
            case 0:
                l7 l7Var = (l7) this.f1545c;
                if (i10 == 0) {
                    l7.v1(l7Var, false);
                    yh.k2 k2Var = l7Var.f1714c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                        AndroidUtilities.removeFromParent(o5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f1544b);
                        frameLayout.addView(o5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    o5Var = l7Var.Y;
                } else {
                    if (i10 == 2) {
                        l7.v1(l7Var, true);
                        yh.k2 k2Var2 = l7Var.f1716d0;
                        if (k2Var2 != null) {
                            o5Var = k2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(o5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f1544b);
                frameLayout2.addView(o5Var, w7.z5.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f1544b);
                frameLayout3.setOnClickListener(new w50(this, 23));
                return frameLayout3;
            case 2:
                return new q21((r21) this.f1545c, (Context) this.f1544b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f1544b);
                frameLayout4.setOnClickListener(new f31(this, 6));
                return frameLayout4;
            case 4:
                return new m41((Context) this.f1544b, 7);
            default:
                if (i10 == 0) {
                    return ((ug.y) this.f1544b).getContainerView();
                }
                return ((ug.x0) this.f1545c).getContainerView();
        }
    }

    @Override
    public final int e() {
        switch (this.f1543a) {
            case 0:
                l7 l7Var = (l7) this.f1545c;
                return (l7Var.f2(true) ? 1 : 0) + (l7Var.f2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((tg1) this.f1545c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f1543a) {
            case 0:
                return (i10 - (((l7) this.f1545c).f2(false) ? 1 : 0)) + 1;
            case 2:
                if (i10 == 0) {
                    return 0;
                }
                return 1;
            case 5:
                return i10;
            default:
                return super.h(i10);
        }
    }

    public j5(ug.y yVar, ug.x0 x0Var) {
        this.f1543a = 5;
        this.f1544b = yVar;
        this.f1545c = x0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
