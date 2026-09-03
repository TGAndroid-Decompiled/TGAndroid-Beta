package gg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import k7.b6;
import kh.l3;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c81;
import org.telegram.ui.g60;
import org.telegram.ui.h51;
import org.telegram.ui.nh1;
import org.telegram.ui.p31;
import org.telegram.ui.ph1;
import org.telegram.ui.q31;
import org.telegram.ui.v31;
public final class u extends c81 {
    public final int f6746a;
    public final Object f6747b;
    public final Object f6748c;

    public u(Object obj, Context context, int i10) {
        this.f6746a = i10;
        this.f6748c = obj;
        this.f6747b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        dg.s1 s1Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i12 = this.f6746a;
        Object obj = this.f6748c;
        switch (i12) {
            case 0:
                return;
            case 1:
                g5 g5Var = (g5) obj;
                if (i11 == 0) {
                    g5.j1(g5Var, false);
                    l3 l3Var = g5Var.Y;
                    if (l3Var != null) {
                        s1Var = l3Var.V;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    g5.j1(g5Var, true);
                    l3 l3Var2 = g5Var.Z;
                    if (l3Var2 != null) {
                        s1Var = l3Var2.V;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(s1Var);
                frameLayout.addView(s1Var);
                return;
            case 2:
                return;
            case 3:
                ((p31) view).a(i11);
                return;
            case 4:
                return;
            default:
                ph1 ph1Var = (ph1) obj;
                SparseArray sparseArray = ph1Var.f37163a;
                nh1 nh1Var = (nh1) sparseArray.get(i10);
                if (nh1Var != null) {
                    p2Var = nh1Var.f36521a;
                } else {
                    org.telegram.ui.ActionBar.p2 V = ph1Var.V(i10);
                    nh1 nh1Var2 = new nh1(V);
                    sparseArray.put(i10, nh1Var2);
                    p2Var = V;
                    nh1Var = nh1Var2;
                }
                if (!nh1Var.f36522b) {
                    p2Var.onFragmentCreate();
                    nh1Var.f36522b = true;
                }
                p2Var.setParentLayout(ph1Var.getParentLayout());
                if (p2Var.getFragmentView() == null) {
                    p2Var.performCreateView((Context) this.f6747b);
                    p2Var.setTitleOverlayText(ph1Var.f37167n, ph1Var.f37168r, ph1Var.f37169s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = p2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!p2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(j6.w0(null, j6.f19881d6, false));
                }
                frameLayout2.addView(fragmentView, b6.c(-1.0f, -1));
                if (p2Var.getActionBar() != null && p2Var.getActionBar().H) {
                    AndroidUtilities.removeFromParent(p2Var.getActionBar());
                    frameLayout2.addView(p2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.f43142a;
                r0.z.c(frameLayout2);
                ph1Var.checkSystemBarColors();
                ph1Var.U();
                return;
        }
    }

    @Override
    public final View d(int i10) {
        dg.s1 s1Var;
        switch (this.f6746a) {
            case 0:
                if (i10 == 0) {
                    return ((b1) this.f6747b).getContainerView();
                }
                return ((f2) this.f6748c).getContainerView();
            case 1:
                g5 g5Var = (g5) this.f6748c;
                if (i10 == 0) {
                    g5.j1(g5Var, false);
                    l3 l3Var = g5Var.Y;
                    if (l3Var != null) {
                        s1Var = l3Var.V;
                        AndroidUtilities.removeFromParent(s1Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f6747b);
                        frameLayout.addView(s1Var, b6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    s1Var = g5Var.V;
                } else {
                    if (i10 == 2) {
                        g5.j1(g5Var, true);
                        l3 l3Var2 = g5Var.Z;
                        if (l3Var2 != null) {
                            s1Var = l3Var2.V;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(s1Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f6747b);
                frameLayout2.addView(s1Var, b6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f6747b);
                frameLayout3.setOnClickListener(new g60(this, 23));
                return frameLayout3;
            case 3:
                return new p31((q31) this.f6748c, (Context) this.f6747b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f6747b);
                frameLayout4.setOnClickListener(new v31(this, 7));
                return frameLayout4;
            default:
                return new h51((Context) this.f6747b, 7);
        }
    }

    @Override
    public final int e() {
        switch (this.f6746a) {
            case 0:
                return 2;
            case 1:
                g5 g5Var = (g5) this.f6748c;
                return (g5Var.L1(true) ? 1 : 0) + (g5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((ph1) this.f6748c).getClass();
                return 4;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f6746a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((g5) this.f6748c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i10);
            case 3:
                if (i10 == 0) {
                    return 0;
                }
                return 1;
        }
    }

    public u(b1 b1Var, f2 f2Var) {
        this.f6746a = 0;
        this.f6747b = b1Var;
        this.f6748c = f2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
