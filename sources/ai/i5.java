package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v81;
import org.telegram.ui.c31;
import org.telegram.ui.j41;
import org.telegram.ui.mg1;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.og1;
import org.telegram.ui.s50;
public final class i5 extends v81 {
    public final int f1477a;
    public final Object f1478b;
    public final Object f1479c;

    public i5(Object obj, Context context, int i10) {
        this.f1477a = i10;
        this.f1479c = obj;
        this.f1478b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        n5 n5Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.f1477a;
        Object obj = this.f1479c;
        switch (i12) {
            case 0:
                k7 k7Var = (k7) obj;
                if (i11 == 0) {
                    k7.w1(k7Var, false);
                    yh.k2 k2Var = k7Var.f1651c0;
                    if (k2Var != null) {
                        n5Var = k2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    k7.w1(k7Var, true);
                    yh.k2 k2Var2 = k7Var.f1653d0;
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
                ((n21) view).a(i11);
                return;
            case 3:
                return;
            case 4:
                og1 og1Var = (og1) obj;
                SparseArray sparseArray = og1Var.f39886a;
                mg1 mg1Var = (mg1) sparseArray.get(i10);
                if (mg1Var != null) {
                    n2Var = mg1Var.f39269a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = og1Var.V(i10);
                    mg1 mg1Var2 = new mg1(V);
                    sparseArray.put(i10, mg1Var2);
                    n2Var = V;
                    mg1Var = mg1Var2;
                }
                if (!mg1Var.f39270b) {
                    n2Var.onFragmentCreate();
                    mg1Var.f39270b = true;
                }
                n2Var.setParentLayout(og1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f1478b);
                    n2Var.setTitleOverlayText(og1Var.f39890n, og1Var.f39891r, og1Var.f39892s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                }
                frameLayout2.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f44816a;
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
        n5 n5Var;
        switch (this.f1477a) {
            case 0:
                k7 k7Var = (k7) this.f1479c;
                if (i10 == 0) {
                    k7.w1(k7Var, false);
                    yh.k2 k2Var = k7Var.f1651c0;
                    if (k2Var != null) {
                        n5Var = k2Var.Y;
                        AndroidUtilities.removeFromParent(n5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f1478b);
                        frameLayout.addView(n5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    n5Var = k7Var.Y;
                } else {
                    if (i10 == 2) {
                        k7.w1(k7Var, true);
                        yh.k2 k2Var2 = k7Var.f1653d0;
                        if (k2Var2 != null) {
                            n5Var = k2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(n5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f1478b);
                frameLayout2.addView(n5Var, w7.z5.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f1478b);
                frameLayout3.setOnClickListener(new s50(this, 23));
                return frameLayout3;
            case 2:
                return new n21((o21) this.f1479c, (Context) this.f1478b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f1478b);
                frameLayout4.setOnClickListener(new c31(this, 6));
                return frameLayout4;
            case 4:
                return new j41((Context) this.f1478b, 7);
            default:
                if (i10 == 0) {
                    return ((ug.z) this.f1478b).getContainerView();
                }
                return ((ug.y0) this.f1479c).getContainerView();
        }
    }

    @Override
    public final int e() {
        switch (this.f1477a) {
            case 0:
                k7 k7Var = (k7) this.f1479c;
                return (k7Var.g2(true) ? 1 : 0) + (k7Var.g2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((og1) this.f1479c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f1477a) {
            case 0:
                return (i10 - (((k7) this.f1479c).g2(false) ? 1 : 0)) + 1;
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
        this.f1477a = 5;
        this.f1478b = zVar;
        this.f1479c = y0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
