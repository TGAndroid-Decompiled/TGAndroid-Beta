package bi;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.wz;
import org.telegram.ui.o41;
import org.telegram.ui.sg1;
import org.telegram.ui.t21;
import org.telegram.ui.u21;
import org.telegram.ui.ug1;
import org.telegram.ui.v21;
import org.telegram.ui.vj0;
import org.telegram.ui.x50;
import org.telegram.ui.xj0;
public final class e5 extends m91 {
    public final int f4551a;
    public final Object f4552b;
    public final Object f4553c;

    public e5(Object obj, Context context, int i10) {
        this.f4551a = i10;
        this.f4553c = obj;
        this.f4552b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        j5 j5Var;
        org.telegram.ui.ActionBar.r2 r2Var;
        int i12 = this.f4551a;
        Object obj = this.f4553c;
        switch (i12) {
            case 0:
                h7 h7Var = (h7) obj;
                if (i11 == 0) {
                    h7.v1(h7Var, false);
                    zh.l2 l2Var = h7Var.f4731c0;
                    if (l2Var != null) {
                        j5Var = l2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    h7.v1(h7Var, true);
                    zh.l2 l2Var2 = h7Var.f4733d0;
                    if (l2Var2 != null) {
                        j5Var = l2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(j5Var);
                frameLayout.addView(j5Var);
                return;
            case 1:
                xj0 xj0Var = (xj0) obj;
                vj0[] vj0VarArr = xj0Var.f45784b;
                vj0VarArr[i10].d.f32152g3.O(false);
                if (!vj0VarArr[i10].f44843i) {
                    xj0Var.l0(i10, false);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((u21) view).a(i11);
                return;
            case 4:
                return;
            case 5:
                ug1 ug1Var = (ug1) obj;
                SparseArray sparseArray = ug1Var.f44133a;
                sg1 sg1Var = (sg1) sparseArray.get(i10);
                if (sg1Var != null) {
                    r2Var = sg1Var.f43505a;
                } else {
                    org.telegram.ui.ActionBar.r2 W = ug1Var.W(i10);
                    sg1 sg1Var2 = new sg1(W);
                    sparseArray.put(i10, sg1Var2);
                    r2Var = W;
                    sg1Var = sg1Var2;
                }
                if (!sg1Var.f43506b) {
                    r2Var.onFragmentCreate();
                    sg1Var.f43506b = true;
                }
                r2Var.setParentLayout(ug1Var.getParentLayout());
                if (r2Var.getFragmentView() == null) {
                    r2Var.performCreateView((Context) this.f4552b);
                    r2Var.setTitleOverlayText(ug1Var.f44137n, ug1Var.f44138r, ug1Var.f44139s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = r2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!r2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, gb1.g(-1.0f, -1));
                if (r2Var.getActionBar() != null && r2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(r2Var.getActionBar());
                    frameLayout2.addView(r2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f47108a;
                r0.y.c(frameLayout2);
                ug1Var.checkSystemBarColors();
                ug1Var.V();
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i10) {
        j5 j5Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.f4551a) {
            case 0:
                h7 h7Var = (h7) this.f4553c;
                if (i10 == 0) {
                    h7.v1(h7Var, false);
                    zh.l2 l2Var = h7Var.f4731c0;
                    if (l2Var != null) {
                        j5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(j5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f4552b);
                        frameLayout.addView(j5Var, gb1.i(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 == 1) {
                    j5Var = h7Var.Y;
                } else {
                    if (i10 == 2) {
                        h7.v1(h7Var, true);
                        zh.l2 l2Var2 = h7Var.f4733d0;
                        if (l2Var2 != null) {
                            j5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(j5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f4552b);
                frameLayout2.addView(j5Var, gb1.i(-1, -1, 119));
                return frameLayout2;
            case 1:
                xj0 xj0Var = (xj0) this.f4553c;
                vj0 vj0Var = xj0Var.f45784b[i10];
                Context context = (Context) this.f4552b;
                vj0Var.d = xj0Var.h0(context, i10);
                r71 r71Var = vj0Var.d;
                u6Var = ((org.telegram.ui.ActionBar.r2) xj0Var).resourceProvider;
                wz wzVar = new wz(context, r71Var, u6Var, new org.telegram.ui.Components.h2(this, i10, 21));
                vj0Var.e = wzVar;
                return wzVar;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f4552b);
                frameLayout3.setOnClickListener(new x50(this, 25));
                return frameLayout3;
            case 3:
                return new u21((v21) this.f4553c, (Context) this.f4552b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f4552b);
                frameLayout4.setOnClickListener(new t21(this, 8));
                return frameLayout4;
            case 5:
                return new o41((Context) this.f4552b, 7);
            default:
                if (i10 == 0) {
                    return ((vg.a0) this.f4552b).getContainerView();
                }
                return ((vg.z0) this.f4553c).getContainerView();
        }
    }

    @Override
    public final int e() {
        switch (this.f4551a) {
            case 0:
                h7 h7Var = (h7) this.f4553c;
                return (h7Var.f2(true) ? 1 : 0) + (h7Var.f2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            case 5:
                ((ug1) this.f4553c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f4551a) {
            case 0:
                return (i10 - (((h7) this.f4553c).f2(false) ? 1 : 0)) + 1;
            case 1:
                return i10;
            case 2:
            case 4:
            case 5:
            default:
                return super.h(i10);
            case 3:
                if (i10 == 0) {
                    return 0;
                }
                return 1;
            case 6:
                return i10;
        }
    }

    public e5(vg.a0 a0Var, vg.z0 z0Var) {
        this.f4551a = 6;
        this.f4552b = a0Var;
        this.f4553c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
