package eg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import ih.m3;
import java.util.WeakHashMap;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q71;
import org.telegram.ui.n31;
import org.telegram.ui.t50;
import org.telegram.ui.tg1;
import org.telegram.ui.vg1;
import org.telegram.ui.w21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
public final class v extends q71 {
    public final int f6144a;
    public final Object f6145b;
    public final Object f6146c;

    public v(Object obj, Context context, int i10) {
        this.f6144a = i10;
        this.f6146c = obj;
        this.f6145b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bg.u1 u1Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i12 = this.f6144a;
        Object obj = this.f6146c;
        switch (i12) {
            case 0:
                return;
            case 1:
                h5 h5Var = (h5) obj;
                if (i11 == 0) {
                    h5.j1(h5Var, false);
                    m3 m3Var = h5Var.X;
                    if (m3Var != null) {
                        u1Var = m3Var.U;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    h5.j1(h5Var, true);
                    m3 m3Var2 = h5Var.Y;
                    if (m3Var2 != null) {
                        u1Var = m3Var2.U;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(u1Var);
                frameLayout.addView(u1Var);
                return;
            case 2:
                return;
            case 3:
                ((x21) view).a(i11);
                return;
            case 4:
                return;
            default:
                vg1 vg1Var = (vg1) obj;
                SparseArray sparseArray = vg1Var.f43592a;
                tg1 tg1Var = (tg1) sparseArray.get(i10);
                if (tg1Var != null) {
                    o2Var = tg1Var.f42707a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = vg1Var.V(i10);
                    tg1 tg1Var2 = new tg1(V);
                    sparseArray.put(i10, tg1Var2);
                    o2Var = V;
                    tg1Var = tg1Var2;
                }
                if (!tg1Var.f42708b) {
                    o2Var.onFragmentCreate();
                    tg1Var.f42708b = true;
                }
                o2Var.setParentLayout(vg1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.f6145b);
                    o2Var.setTitleOverlayText(vg1Var.f43597n, vg1Var.f43598r, vg1Var.f43599s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                }
                frameLayout2.addView(fragmentView, f6.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().G) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout2.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.f46829a;
                r0.z.c(frameLayout2);
                vg1Var.checkSystemBarColors();
                vg1Var.U();
                return;
        }
    }

    @Override
    public final View d(int i10) {
        bg.u1 u1Var;
        switch (this.f6144a) {
            case 0:
                if (i10 == 0) {
                    return ((c1) this.f6145b).getContainerView();
                }
                return ((g2) this.f6146c).getContainerView();
            case 1:
                h5 h5Var = (h5) this.f6146c;
                if (i10 == 0) {
                    h5.j1(h5Var, false);
                    m3 m3Var = h5Var.X;
                    if (m3Var != null) {
                        u1Var = m3Var.U;
                        AndroidUtilities.removeFromParent(u1Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f6145b);
                        frameLayout.addView(u1Var, f6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    u1Var = h5Var.U;
                } else {
                    if (i10 == 2) {
                        h5.j1(h5Var, true);
                        m3 m3Var2 = h5Var.Y;
                        if (m3Var2 != null) {
                            u1Var = m3Var2.U;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(u1Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f6145b);
                frameLayout2.addView(u1Var, f6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f6145b);
                frameLayout3.setOnClickListener(new t50(this, 24));
                return frameLayout3;
            case 3:
                return new x21((y21) this.f6146c, (Context) this.f6145b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f6145b);
                frameLayout4.setOnClickListener(new w21(this, 8));
                return frameLayout4;
            default:
                return new n31((Context) this.f6145b, 8);
        }
    }

    @Override
    public final int e() {
        switch (this.f6144a) {
            case 0:
                return 2;
            case 1:
                h5 h5Var = (h5) this.f6146c;
                return (h5Var.L1(true) ? 1 : 0) + (h5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((vg1) this.f6146c).getClass();
                return 4;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f6144a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((h5) this.f6146c).L1(false) ? 1 : 0)) + 1;
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

    public v(c1 c1Var, g2 g2Var) {
        this.f6144a = 0;
        this.f6145b = c1Var;
        this.f6146c = g2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
