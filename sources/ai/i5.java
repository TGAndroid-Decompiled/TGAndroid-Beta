package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u81;
import org.telegram.ui.i31;
import org.telegram.ui.l41;
import org.telegram.ui.og1;
import org.telegram.ui.p21;
import org.telegram.ui.q21;
import org.telegram.ui.qg1;
import org.telegram.ui.y50;
public final class i5 extends u81 {
    public final int f1480a;
    public final Object f1481b;
    public final Object f1482c;

    public i5(Object obj, Context context, int i10) {
        this.f1480a = i10;
        this.f1482c = obj;
        this.f1481b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        n5 n5Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.f1480a;
        Object obj = this.f1482c;
        switch (i12) {
            case 0:
                k7 k7Var = (k7) obj;
                if (i11 == 0) {
                    k7.t1(k7Var, false);
                    yh.k2 k2Var = k7Var.f1661c0;
                    if (k2Var != null) {
                        n5Var = k2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    k7.t1(k7Var, true);
                    yh.k2 k2Var2 = k7Var.f1663d0;
                    if (k2Var2 != null) {
                        n5Var = k2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(n5Var);
                frameLayout.addView(n5Var);
                return;
            case 1:
                return;
            case 2:
                ((p21) view).a(i11);
                return;
            case 3:
                return;
            case 4:
                qg1 qg1Var = (qg1) obj;
                SparseArray sparseArray = qg1Var.f40394a;
                og1 og1Var = (og1) sparseArray.get(i10);
                if (og1Var != null) {
                    n2Var = og1Var.f39786a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = qg1Var.V(i10);
                    og1 og1Var2 = new og1(V);
                    sparseArray.put(i10, og1Var2);
                    n2Var = V;
                    og1Var = og1Var2;
                }
                if (!og1Var.f39787b) {
                    n2Var.onFragmentCreate();
                    og1Var.f39787b = true;
                }
                n2Var.setParentLayout(qg1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f1481b);
                    n2Var.setTitleOverlayText(qg1Var.f40398n, qg1Var.f40399r, qg1Var.f40400s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                }
                frameLayout2.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f44818a;
                r0.y.c(frameLayout2);
                qg1Var.checkSystemBarColors();
                qg1Var.U();
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i10) {
        n5 n5Var;
        switch (this.f1480a) {
            case 0:
                k7 k7Var = (k7) this.f1482c;
                if (i10 == 0) {
                    k7.t1(k7Var, false);
                    yh.k2 k2Var = k7Var.f1661c0;
                    if (k2Var != null) {
                        n5Var = k2Var.Y;
                        AndroidUtilities.removeFromParent(n5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f1481b);
                        frameLayout.addView(n5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    n5Var = k7Var.Y;
                } else {
                    if (i10 == 2) {
                        k7.t1(k7Var, true);
                        yh.k2 k2Var2 = k7Var.f1663d0;
                        if (k2Var2 != null) {
                            n5Var = k2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(n5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f1481b);
                frameLayout2.addView(n5Var, w7.z5.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f1481b);
                frameLayout3.setOnClickListener(new y50(this, 22));
                return frameLayout3;
            case 2:
                return new p21((q21) this.f1482c, (Context) this.f1481b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f1481b);
                frameLayout4.setOnClickListener(new i31(this, 5));
                return frameLayout4;
            case 4:
                return new l41((Context) this.f1481b, 7);
            default:
                if (i10 == 0) {
                    return ((ug.z) this.f1481b).getContainerView();
                }
                return ((ug.y0) this.f1482c).getContainerView();
        }
    }

    @Override
    public final int e() {
        switch (this.f1480a) {
            case 0:
                k7 k7Var = (k7) this.f1482c;
                return (k7Var.Z1(true) ? 1 : 0) + (k7Var.Z1(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((qg1) this.f1482c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f1480a) {
            case 0:
                return (i10 - (((k7) this.f1482c).Z1(false) ? 1 : 0)) + 1;
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

    public i5(ug.z zVar, ug.y0 y0Var) {
        this.f1480a = 5;
        this.f1481b = zVar;
        this.f1482c = y0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
