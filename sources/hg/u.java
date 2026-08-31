package hg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import k7.c6;
import lh.m3;
import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.e81;
import org.telegram.ui.c51;
import org.telegram.ui.f60;
import org.telegram.ui.hh1;
import org.telegram.ui.jh1;
import org.telegram.ui.k31;
import org.telegram.ui.l31;
import org.telegram.ui.m31;
public final class u extends e81 {
    public final int f7614a;
    public final Object f7615b;
    public final Object f7616c;

    public u(Object obj, Context context, int i10) {
        this.f7614a = i10;
        this.f7616c = obj;
        this.f7615b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        eg.q1 q1Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i12 = this.f7614a;
        Object obj = this.f7616c;
        switch (i12) {
            case 0:
                return;
            case 1:
                g5 g5Var = (g5) obj;
                if (i11 == 0) {
                    g5.j1(g5Var, false);
                    m3 m3Var = g5Var.Y;
                    if (m3Var != null) {
                        q1Var = m3Var.V;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    g5.j1(g5Var, true);
                    m3 m3Var2 = g5Var.Z;
                    if (m3Var2 != null) {
                        q1Var = m3Var2.V;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(q1Var);
                frameLayout.addView(q1Var);
                return;
            case 2:
                return;
            case 3:
                ((l31) view).a(i11);
                return;
            case 4:
                return;
            default:
                jh1 jh1Var = (jh1) obj;
                SparseArray sparseArray = jh1Var.f38156a;
                hh1 hh1Var = (hh1) sparseArray.get(i10);
                if (hh1Var != null) {
                    p2Var = hh1Var.f37508a;
                } else {
                    org.telegram.ui.ActionBar.p2 V = jh1Var.V(i10);
                    hh1 hh1Var2 = new hh1(V);
                    sparseArray.put(i10, hh1Var2);
                    p2Var = V;
                    hh1Var = hh1Var2;
                }
                if (!hh1Var.f37509b) {
                    p2Var.onFragmentCreate();
                    hh1Var.f37509b = true;
                }
                p2Var.setParentLayout(jh1Var.getParentLayout());
                if (p2Var.getFragmentView() == null) {
                    p2Var.performCreateView((Context) this.f7615b);
                    p2Var.setTitleOverlayText(jh1Var.f38161n, jh1Var.f38162r, jh1Var.f38163s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = p2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!p2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(k6.w0(null, k6.f21659d6, false));
                }
                frameLayout2.addView(fragmentView, c6.c(-1.0f, -1));
                if (p2Var.getActionBar() != null && p2Var.getActionBar().H) {
                    AndroidUtilities.removeFromParent(p2Var.getActionBar());
                    frameLayout2.addView(p2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.f46438a;
                r0.z.c(frameLayout2);
                jh1Var.checkSystemBarColors();
                jh1Var.U();
                return;
        }
    }

    @Override
    public final View d(int i10) {
        eg.q1 q1Var;
        switch (this.f7614a) {
            case 0:
                if (i10 == 0) {
                    return ((b1) this.f7615b).getContainerView();
                }
                return ((f2) this.f7616c).getContainerView();
            case 1:
                g5 g5Var = (g5) this.f7616c;
                if (i10 == 0) {
                    g5.j1(g5Var, false);
                    m3 m3Var = g5Var.Y;
                    if (m3Var != null) {
                        q1Var = m3Var.V;
                        AndroidUtilities.removeFromParent(q1Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f7615b);
                        frameLayout.addView(q1Var, c6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    q1Var = g5Var.V;
                } else {
                    if (i10 == 2) {
                        g5.j1(g5Var, true);
                        m3 m3Var2 = g5Var.Z;
                        if (m3Var2 != null) {
                            q1Var = m3Var2.V;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(q1Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f7615b);
                frameLayout2.addView(q1Var, c6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f7615b);
                frameLayout3.setOnClickListener(new f60(this, 24));
                return frameLayout3;
            case 3:
                return new l31((m31) this.f7616c, (Context) this.f7615b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f7615b);
                frameLayout4.setOnClickListener(new k31(this, 8));
                return frameLayout4;
            default:
                return new c51((Context) this.f7615b, 7);
        }
    }

    @Override
    public final int e() {
        switch (this.f7614a) {
            case 0:
                return 2;
            case 1:
                g5 g5Var = (g5) this.f7616c;
                return (g5Var.L1(true) ? 1 : 0) + (g5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((jh1) this.f7616c).getClass();
                return 4;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f7614a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((g5) this.f7616c).L1(false) ? 1 : 0)) + 1;
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
        this.f7614a = 0;
        this.f7615b = b1Var;
        this.f7616c = f2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
