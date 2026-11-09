package di;

import a8.ra;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class x7 extends c5.k {
    public ArrayList A0;
    public c4 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public final g4 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public final ra M0;
    public final q9 N0;
    public int O0;
    public final ArrayList P0;
    public float Q0;
    public long f9935w0;
    public ArrayList f9936x0;
    public int f9937y0;
    public final u7 f9938z0;

    public x7(int i7, Context context, q9 q9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z9;
        this.A0 = new ArrayList();
        this.D0 = true;
        w wVar = (w) this;
        this.M0 = new ra(wVar, 21);
        this.O0 = -1;
        this.P0 = new ArrayList();
        this.f9937y0 = i7;
        this.H0 = new g4(context);
        this.N0 = q9Var;
        u7 u7Var = new u7(wVar, context, q9Var, g6Var);
        this.f9938z0 = u7Var;
        setAdapter(u7Var);
        r4 r4Var = new r4(wVar, 2);
        if (this.m0 != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.m0 = r4Var;
        setChildrenDrawingOrderEnabled(true);
        this.f5344o0 = 1;
        this.f5343n0 = 2;
        if (z9) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new v7(wVar, q9Var, 0));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != arrayList2.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            if (i7 < getChildCount()) {
                w7 w7Var = (w7) getChildAt(i7);
                if (w7Var.d && !w7Var.f9901a.f9245x1.d()) {
                    break;
                }
                i7++;
            } else {
                z9 = true;
                break;
            }
        }
        this.N0.l(z9);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    w7 w7Var = (w7) getChildAt(i7);
                    if (!w7Var.d) {
                        this.O0 = -1;
                        w7Var.a(true);
                        if (this.f9936x0 != null) {
                            j4 j4Var = w7Var.f9901a;
                            long j3 = w7Var.f9902b;
                            ArrayList arrayList = w7Var.f9903c;
                            j4Var.f9196k1 = j3;
                            j4Var.f9189i1 = arrayList;
                            j4Var.m0(0);
                        } else {
                            w7Var.f9901a.S0(0, w7Var.f9902b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r7, long r8, java.util.ArrayList r10) {
        throw new UnsupportedOperationException("Method not decompiled: di.x7.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z9) {
        q9 q9Var = this.N0;
        boolean z10 = false;
        if (z9) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f9936x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (q9Var.f9594a && Build.VERSION.SDK_INT < 33) {
                    z10 = true;
                }
                x(currentItem2, !z10);
                return true;
            }
        }
        if (z9 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (q9Var.f9594a && Build.VERSION.SDK_INT < 33) {
            z10 = true;
        }
        x(currentItem3, !z10);
        return true;
    }

    public final void F() {
        boolean z9;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            j4 j4Var = (j4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && !j4Var.D3) {
                z9 = true;
            } else {
                z9 = false;
            }
            j4Var.setActive(z9);
        }
    }

    public long getCurrentDialogId() {
        if (this.f9936x0 != null) {
            return this.f9935w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public j4 getCurrentPeerView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem()) {
                return (j4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.A0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.C0) {
            this.C0 = false;
            j4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                c4 c4Var = this.B0;
                h9 h9Var = (h9) c4Var;
                h9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.L0) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void setDelegate(c4 c4Var) {
        this.B0 = c4Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) <= 1.0f && this.Q0 != f10) {
            this.Q0 = f10;
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

    public void setKeyboardHeight(int i7) {
        if (this.E0 != i7) {
            this.E0 = i7;
            j4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z9) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((j4) ((FrameLayout) getChildAt(i7)).getChildAt(0)).setPaused(z9);
        }
    }
}
