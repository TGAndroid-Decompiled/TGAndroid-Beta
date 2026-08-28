package bg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import fh.x3;
import g7.e6;
import gh.k5;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.b81;
import org.telegram.ui.q50;
import org.telegram.ui.rg1;
import org.telegram.ui.tg1;
import org.telegram.ui.w21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
public final class x extends e71 {
    public final int f1989a;
    public final Object f1990b;
    public final Object f1991c;

    public x(Object obj, Context context, int i9) {
        this.f1989a = i9;
        this.f1991c = obj;
        this.f1990b = context;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        bh.g gVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i11 = this.f1989a;
        Object obj = this.f1991c;
        switch (i11) {
            case 0:
                return;
            case 1:
                k5 k5Var = (k5) obj;
                if (i10 == 0) {
                    k5.j1(k5Var, false);
                    x3 x3Var = k5Var.X;
                    if (x3Var != null) {
                        gVar = x3Var.U;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    k5.j1(k5Var, true);
                    x3 x3Var2 = k5Var.Y;
                    if (x3Var2 != null) {
                        gVar = x3Var2.U;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(gVar);
                frameLayout.addView(gVar);
                return;
            case 2:
                return;
            case 3:
                ((x21) view).a(i10);
                return;
            case 4:
                return;
            default:
                tg1 tg1Var = (tg1) obj;
                SparseArray sparseArray = tg1Var.f42997a;
                rg1 rg1Var = (rg1) sparseArray.get(i9);
                if (rg1Var != null) {
                    o2Var = rg1Var.f42421a;
                } else {
                    org.telegram.ui.ActionBar.o2 U = tg1Var.U(i9);
                    rg1 rg1Var2 = new rg1(U);
                    sparseArray.put(i9, rg1Var2);
                    o2Var = U;
                    rg1Var = rg1Var2;
                }
                if (!rg1Var.f42422b) {
                    o2Var.onFragmentCreate();
                    rg1Var.f42422b = true;
                }
                o2Var.setParentLayout(tg1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.f1990b);
                    o2Var.setTitleOverlayText(tg1Var.f43002n, tg1Var.f43003r, tg1Var.f43004s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                }
                frameLayout2.addView(fragmentView, e6.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().G) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout2.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.f46915a;
                r0.z.c(frameLayout2);
                tg1Var.checkSystemBarColors();
                tg1Var.T();
                return;
        }
    }

    @Override
    public final View d(int i9) {
        bh.g gVar;
        switch (this.f1989a) {
            case 0:
                if (i9 == 0) {
                    return ((h1) this.f1990b).getContainerView();
                }
                return ((q2) this.f1991c).getContainerView();
            case 1:
                k5 k5Var = (k5) this.f1991c;
                if (i9 == 0) {
                    k5.j1(k5Var, false);
                    x3 x3Var = k5Var.X;
                    if (x3Var != null) {
                        gVar = x3Var.U;
                        AndroidUtilities.removeFromParent(gVar);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f1990b);
                        frameLayout.addView(gVar, e6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i9 == 1) {
                    gVar = k5Var.U;
                } else {
                    if (i9 == 2) {
                        k5.j1(k5Var, true);
                        x3 x3Var2 = k5Var.Y;
                        if (x3Var2 != null) {
                            gVar = x3Var2.U;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(gVar);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f1990b);
                frameLayout2.addView(gVar, e6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f1990b);
                frameLayout3.setOnClickListener(new q50(this, 24));
                return frameLayout3;
            case 3:
                return new x21((y21) this.f1991c, (Context) this.f1990b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f1990b);
                frameLayout4.setOnClickListener(new w21(this, 8));
                return frameLayout4;
            default:
                return new b81((Context) this.f1990b, 6);
        }
    }

    @Override
    public final int e() {
        switch (this.f1989a) {
            case 0:
                return 2;
            case 1:
                k5 k5Var = (k5) this.f1991c;
                return (k5Var.L1(true) ? 1 : 0) + (k5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((tg1) this.f1991c).getClass();
                return 4;
        }
    }

    @Override
    public int h(int i9) {
        switch (this.f1989a) {
            case 0:
                return i9;
            case 1:
                return (i9 - (((k5) this.f1991c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i9);
            case 3:
                if (i9 == 0) {
                    return 0;
                }
                return 1;
        }
    }

    public x(h1 h1Var, q2 q2Var) {
        this.f1989a = 0;
        this.f1990b = h1Var;
        this.f1991c = q2Var;
    }

    private final void i(View view, int i9, int i10) {
    }

    private final void j(View view, int i9, int i10) {
    }

    private final void k(View view, int i9, int i10) {
    }
}
