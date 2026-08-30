package gg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import k7.b6;
import kh.m3;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c81;
import org.telegram.ui.a51;
import org.telegram.ui.e60;
import org.telegram.ui.fh1;
import org.telegram.ui.hh1;
import org.telegram.ui.i31;
import org.telegram.ui.j31;
import org.telegram.ui.k31;
public final class u extends c81 {
    public final int f6759a;
    public final Object f6760b;
    public final Object f6761c;

    public u(Object obj, Context context, int i10) {
        this.f6759a = i10;
        this.f6761c = obj;
        this.f6760b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        dg.s1 s1Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i12 = this.f6759a;
        Object obj = this.f6761c;
        switch (i12) {
            case 0:
                return;
            case 1:
                g5 g5Var = (g5) obj;
                if (i11 == 0) {
                    g5.j1(g5Var, false);
                    m3 m3Var = g5Var.Y;
                    if (m3Var != null) {
                        s1Var = m3Var.V;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    g5.j1(g5Var, true);
                    m3 m3Var2 = g5Var.Z;
                    if (m3Var2 != null) {
                        s1Var = m3Var2.V;
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
                ((j31) view).a(i11);
                return;
            case 4:
                return;
            default:
                hh1 hh1Var = (hh1) obj;
                SparseArray sparseArray = hh1Var.f34873a;
                fh1 fh1Var = (fh1) sparseArray.get(i10);
                if (fh1Var != null) {
                    p2Var = fh1Var.f34260a;
                } else {
                    org.telegram.ui.ActionBar.p2 V = hh1Var.V(i10);
                    fh1 fh1Var2 = new fh1(V);
                    sparseArray.put(i10, fh1Var2);
                    p2Var = V;
                    fh1Var = fh1Var2;
                }
                if (!fh1Var.f34261b) {
                    p2Var.onFragmentCreate();
                    fh1Var.f34261b = true;
                }
                p2Var.setParentLayout(hh1Var.getParentLayout());
                if (p2Var.getFragmentView() == null) {
                    p2Var.performCreateView((Context) this.f6760b);
                    p2Var.setTitleOverlayText(hh1Var.f34877n, hh1Var.f34878r, hh1Var.f34879s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = p2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!p2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
                }
                frameLayout2.addView(fragmentView, b6.c(-1.0f, -1));
                if (p2Var.getActionBar() != null && p2Var.getActionBar().H) {
                    AndroidUtilities.removeFromParent(p2Var.getActionBar());
                    frameLayout2.addView(p2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.f43118a;
                r0.z.c(frameLayout2);
                hh1Var.checkSystemBarColors();
                hh1Var.U();
                return;
        }
    }

    @Override
    public final View d(int i10) {
        dg.s1 s1Var;
        switch (this.f6759a) {
            case 0:
                if (i10 == 0) {
                    return ((b1) this.f6760b).getContainerView();
                }
                return ((f2) this.f6761c).getContainerView();
            case 1:
                g5 g5Var = (g5) this.f6761c;
                if (i10 == 0) {
                    g5.j1(g5Var, false);
                    m3 m3Var = g5Var.Y;
                    if (m3Var != null) {
                        s1Var = m3Var.V;
                        AndroidUtilities.removeFromParent(s1Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f6760b);
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
                        m3 m3Var2 = g5Var.Z;
                        if (m3Var2 != null) {
                            s1Var = m3Var2.V;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(s1Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f6760b);
                frameLayout2.addView(s1Var, b6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f6760b);
                frameLayout3.setOnClickListener(new e60(this, 24));
                return frameLayout3;
            case 3:
                return new j31((k31) this.f6761c, (Context) this.f6760b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f6760b);
                frameLayout4.setOnClickListener(new i31(this, 8));
                return frameLayout4;
            default:
                return new a51((Context) this.f6760b, 7);
        }
    }

    @Override
    public final int e() {
        switch (this.f6759a) {
            case 0:
                return 2;
            case 1:
                g5 g5Var = (g5) this.f6761c;
                return (g5Var.L1(true) ? 1 : 0) + (g5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((hh1) this.f6761c).getClass();
                return 4;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f6759a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((g5) this.f6761c).L1(false) ? 1 : 0)) + 1;
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
        this.f6759a = 0;
        this.f6760b = b1Var;
        this.f6761c = f2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
