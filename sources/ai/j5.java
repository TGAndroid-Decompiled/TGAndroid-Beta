package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w81;
import org.telegram.ui.c31;
import org.telegram.ui.j41;
import org.telegram.ui.mg1;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.og1;
import org.telegram.ui.s50;
public final class j5 extends w81 {
    public final int f1565a;
    public final Object f1566b;
    public final Object f1567c;

    public j5(Object obj, Context context, int i10) {
        this.f1565a = i10;
        this.f1567c = obj;
        this.f1566b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        o5 o5Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.f1565a;
        Object obj = this.f1567c;
        switch (i12) {
            case 0:
                l7 l7Var = (l7) obj;
                if (i11 == 0) {
                    l7.w1(l7Var, false);
                    yh.k2 k2Var = l7Var.f1722c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    l7.w1(l7Var, true);
                    yh.k2 k2Var2 = l7Var.f1724d0;
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
                ((n21) view).a(i11);
                return;
            case 3:
                return;
            case 4:
                og1 og1Var = (og1) obj;
                SparseArray sparseArray = og1Var.f39889a;
                mg1 mg1Var = (mg1) sparseArray.get(i10);
                if (mg1Var != null) {
                    n2Var = mg1Var.f39246a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = og1Var.V(i10);
                    mg1 mg1Var2 = new mg1(V);
                    sparseArray.put(i10, mg1Var2);
                    n2Var = V;
                    mg1Var = mg1Var2;
                }
                if (!mg1Var.f39247b) {
                    n2Var.onFragmentCreate();
                    mg1Var.f39247b = true;
                }
                n2Var.setParentLayout(og1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f1566b);
                    n2Var.setTitleOverlayText(og1Var.f39893n, og1Var.f39894r, og1Var.f39895s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                }
                frameLayout2.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f44829a;
                r0.y.c(frameLayout2);
                og1Var.checkSystemBarColors();
                og1Var.U();
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i10) {
        o5 o5Var;
        switch (this.f1565a) {
            case 0:
                l7 l7Var = (l7) this.f1567c;
                if (i10 == 0) {
                    l7.w1(l7Var, false);
                    yh.k2 k2Var = l7Var.f1722c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                        AndroidUtilities.removeFromParent(o5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f1566b);
                        frameLayout.addView(o5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    o5Var = l7Var.Y;
                } else {
                    if (i10 == 2) {
                        l7.w1(l7Var, true);
                        yh.k2 k2Var2 = l7Var.f1724d0;
                        if (k2Var2 != null) {
                            o5Var = k2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(o5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f1566b);
                frameLayout2.addView(o5Var, w7.z5.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f1566b);
                frameLayout3.setOnClickListener(new s50(this, 23));
                return frameLayout3;
            case 2:
                return new n21((o21) this.f1567c, (Context) this.f1566b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f1566b);
                frameLayout4.setOnClickListener(new c31(this, 6));
                return frameLayout4;
            case 4:
                return new j41((Context) this.f1566b, 7);
            default:
                if (i10 == 0) {
                    return ((ug.z) this.f1566b).getContainerView();
                }
                return ((ug.y0) this.f1567c).getContainerView();
        }
    }

    @Override
    public final int e() {
        switch (this.f1565a) {
            case 0:
                l7 l7Var = (l7) this.f1567c;
                return (l7Var.g2(true) ? 1 : 0) + (l7Var.g2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((og1) this.f1567c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f1565a) {
            case 0:
                return (i10 - (((l7) this.f1567c).g2(false) ? 1 : 0)) + 1;
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

    public j5(ug.z zVar, ug.y0 y0Var) {
        this.f1565a = 5;
        this.f1566b = zVar;
        this.f1567c = y0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
