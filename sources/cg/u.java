package cg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import gh.s3;
import h7.z5;
import hh.i5;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g71;
import org.telegram.ui.qg1;
import org.telegram.ui.sg1;
import org.telegram.ui.u50;
import org.telegram.ui.v21;
import org.telegram.ui.w21;
import org.telegram.ui.x21;
import org.telegram.ui.z71;

public final class u extends g71 {

    public final int f2824a;

    public final Object f2825b;

    public final Object f2826c;

    public u(Object obj, Context context, int i10) {
        this.f2824a = i10;
        this.f2826c = obj;
        this.f2825b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ag.w wVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.f2824a;
        Object obj = this.f2826c;
        switch (i12) {
            case 0:
                break;
            case 1:
                i5 i5Var = (i5) obj;
                if (i11 == 0) {
                    i5.j1(i5Var, false);
                    s3 s3Var = i5Var.X;
                    if (s3Var != null) {
                        wVar = s3Var.U;
                    }
                } else if (i11 == 2) {
                    i5.j1(i5Var, true);
                    s3 s3Var2 = i5Var.Y;
                    if (s3Var2 != null) {
                        wVar = s3Var2.U;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(wVar);
                frameLayout.addView(wVar);
                break;
            case 2:
                break;
            case 3:
                ((w21) view).a(i11);
                break;
            case 4:
                break;
            default:
                sg1 sg1Var = (sg1) obj;
                SparseArray sparseArray = sg1Var.f42638a;
                qg1 qg1Var = (qg1) sparseArray.get(i10);
                if (qg1Var != null) {
                    n2Var = qg1Var.f41659a;
                } else {
                    org.telegram.ui.ActionBar.n2 n2VarV = sg1Var.V(i10);
                    qg1 qg1Var2 = new qg1(n2VarV);
                    sparseArray.put(i10, qg1Var2);
                    n2Var = n2VarV;
                    qg1Var = qg1Var2;
                }
                if (!qg1Var.f41660b) {
                    n2Var.onFragmentCreate();
                    qg1Var.f41660b = true;
                }
                n2Var.setParentLayout(sg1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.f2825b);
                    n2Var.setTitleOverlayText(sg1Var.f42643n, sg1Var.f42644r, sg1Var.f42645s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                }
                frameLayout2.addView(fragmentView, z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().G) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.f46605a;
                r0.z.c(frameLayout2);
                sg1Var.checkSystemBarColors();
                sg1Var.U();
                break;
        }
    }

    @Override
    public final View d(int i10) {
        ag.w wVar;
        switch (this.f2824a) {
            case 0:
                return i10 == 0 ? ((d1) this.f2825b).getContainerView() : ((i2) this.f2826c).getContainerView();
            case 1:
                i5 i5Var = (i5) this.f2826c;
                if (i10 == 0) {
                    i5.j1(i5Var, false);
                    s3 s3Var = i5Var.X;
                    if (s3Var != null) {
                        wVar = s3Var.U;
                        AndroidUtilities.removeFromParent(wVar);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f2825b);
                        frameLayout.addView(wVar, z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        i5.j1(i5Var, true);
                        s3 s3Var2 = i5Var.Y;
                        if (s3Var2 != null) {
                            wVar = s3Var2.U;
                        }
                    }
                    return null;
                }
                wVar = i5Var.U;
                AndroidUtilities.removeFromParent(wVar);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f2825b);
                frameLayout2.addView(wVar, z5.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f2825b);
                frameLayout3.setOnClickListener(new u50(this, 24));
                return frameLayout3;
            case 3:
                return new w21((x21) this.f2826c, (Context) this.f2825b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f2825b);
                frameLayout4.setOnClickListener(new v21(this, 8));
                return frameLayout4;
            default:
                return new z71((Context) this.f2825b, 6);
        }
    }

    @Override
    public final int e() {
        switch (this.f2824a) {
            case 0:
                return 2;
            case 1:
                i5 i5Var = (i5) this.f2826c;
                return (i5Var.L1(true) ? 1 : 0) + (i5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((sg1) this.f2826c).getClass();
                return 4;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f2824a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((i5) this.f2826c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i10);
            case 3:
                return i10 == 0 ? 0 : 1;
        }
    }

    public u(d1 d1Var, i2 i2Var) {
        this.f2824a = 0;
        this.f2825b = d1Var;
        this.f2826c = i2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
