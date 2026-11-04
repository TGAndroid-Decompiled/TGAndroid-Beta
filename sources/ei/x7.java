package ei;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class x7 extends b5.l {
    public final u7 A0;
    public ArrayList B0;
    public c4 C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public Runnable H0;
    public final g4 I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public final a3.o N0;
    public final r9 O0;
    public int P0;
    public final ArrayList Q0;
    public float R0;
    public long f11210x0;
    public ArrayList f11211y0;
    public int f11212z0;

    public x7(int i3, Context context, r9 r9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        this.B0 = new ArrayList();
        this.E0 = true;
        x xVar = (x) this;
        this.N0 = new a3.o(xVar, 21);
        this.P0 = -1;
        this.Q0 = new ArrayList();
        this.f11212z0 = i3;
        this.I0 = new g4(context);
        this.O0 = r9Var;
        u7 u7Var = new u7(xVar, context, r9Var, e6Var);
        this.A0 = u7Var;
        setAdapter(u7Var);
        a1.c cVar = new a1.c(xVar, 28);
        if (this.f2433n0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f2433n0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f2435p0 = 1;
        this.f2434o0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new v7(0, xVar, r9Var));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) != arrayList2.get(i3)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                w7 w7Var = (w7) getChildAt(i3);
                if (w7Var.d && !w7Var.f11189a.f10527y1.d()) {
                    break;
                }
                i3++;
            } else {
                z10 = true;
                break;
            }
        }
        this.O0.x(z10);
    }

    public final void B() {
        if (this.P0 >= 0) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (((Integer) getChildAt(i3).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.P0) {
                    w7 w7Var = (w7) getChildAt(i3);
                    if (!w7Var.d) {
                        this.P0 = -1;
                        w7Var.a(true);
                        if (this.f11211y0 != null) {
                            j4 j4Var = w7Var.f11189a;
                            long j10 = w7Var.f11190b;
                            ArrayList arrayList = w7Var.f11191c;
                            j4Var.f10477l1 = j10;
                            j4Var.f10470j1 = arrayList;
                            j4Var.m0(0);
                        } else {
                            w7Var.f11189a.S0(0, w7Var.f11190b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r7, long r8, java.util.ArrayList r10) {
        throw new UnsupportedOperationException("Method not decompiled: ei.x7.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z10) {
        r9 r9Var = this.O0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f11211y0;
            if (arrayList == null) {
                arrayList = this.B0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (r9Var.f10908a && Build.VERSION.SDK_INT < 33) {
                    z11 = true;
                }
                x(currentItem2, !z11);
                return true;
            }
        }
        if (z10 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (r9Var.f10908a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        boolean z10;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            j4 j4Var = (j4) ((FrameLayout) getChildAt(i3)).getChildAt(0);
            if (((Integer) getChildAt(i3).getTag()).intValue() == getCurrentItem() && !j4Var.E3) {
                z10 = true;
            } else {
                z10 = false;
            }
            j4Var.setActive(z10);
        }
    }

    public long getCurrentDialogId() {
        if (this.f11211y0 != null) {
            return this.f11210x0;
        }
        if (getCurrentItem() < this.B0.size()) {
            return ((Long) this.B0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public j4 getCurrentPeerView() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (((Integer) getChildAt(i3).getTag()).intValue() == getCurrentItem()) {
                return (j4) ((FrameLayout) getChildAt(i3)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.B0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.E0 && !this.M0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.D0) {
            this.D0 = false;
            j4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                c4 c4Var = this.C0;
                i9 i9Var = (i9) c4Var;
                i9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 && !this.M0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.M0) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void setDelegate(c4 c4Var) {
        this.C0 = c4Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) <= 1.0f && this.R0 != f10) {
            this.R0 = f10;
            setCameraDistance(getWidth() * 15);
            float f11 = 0.0f;
            if (f10 < 0.0f) {
                f11 = getWidth();
            }
            setPivotX(f11);
            setPivotY(getHeight() * 0.5f);
            setRotationY(f10 * 90.0f);
        }
    }

    public void setKeyboardHeight(int i3) {
        if (this.F0 != i3) {
            this.F0 = i3;
            j4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((j4) ((FrameLayout) getChildAt(i3)).getChildAt(0)).setPaused(z10);
        }
    }
}
