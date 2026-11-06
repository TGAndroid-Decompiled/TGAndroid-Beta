package di;

import a8.ra;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class x7 extends c5.k {
    public ArrayList A0;
    public b4 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public final f4 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public final ra M0;
    public final p9 N0;
    public int O0;
    public final ArrayList P0;
    public float Q0;
    public long f9939w0;
    public ArrayList f9940x0;
    public int f9941y0;
    public final u7 f9942z0;

    public x7(int i7, Context context, p9 p9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z9;
        this.A0 = new ArrayList();
        this.D0 = true;
        w wVar = (w) this;
        this.M0 = new ra(wVar, 21);
        this.O0 = -1;
        this.P0 = new ArrayList();
        this.f9941y0 = i7;
        this.H0 = new f4(context);
        this.N0 = p9Var;
        u7 u7Var = new u7(wVar, context, p9Var, f6Var);
        this.f9942z0 = u7Var;
        setAdapter(u7Var);
        q4 q4Var = new q4(wVar, 2);
        if (this.m0 != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.m0 = q4Var;
        setChildrenDrawingOrderEnabled(true);
        this.f5346o0 = 1;
        this.f5345n0 = 2;
        if (z9) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new v7(wVar, p9Var, 0));
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
                if (w7Var.d && !w7Var.f9910a.f9213x1.d()) {
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
                        if (this.f9940x0 != null) {
                            i4 i4Var = w7Var.f9910a;
                            long j3 = w7Var.f9911b;
                            ArrayList arrayList = w7Var.f9912c;
                            i4Var.f9164k1 = j3;
                            i4Var.f9157i1 = arrayList;
                            i4Var.m0(0);
                        } else {
                            w7Var.f9910a.S0(0, w7Var.f9911b);
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
        p9 p9Var = this.N0;
        boolean z10 = false;
        if (z9) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f9940x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (p9Var.f9529a && Build.VERSION.SDK_INT < 33) {
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
        if (p9Var.f9529a && Build.VERSION.SDK_INT < 33) {
            z10 = true;
        }
        x(currentItem3, !z10);
        return true;
    }

    public final void F() {
        boolean z9;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            i4 i4Var = (i4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && !i4Var.D3) {
                z9 = true;
            } else {
                z9 = false;
            }
            i4Var.setActive(z9);
        }
    }

    public long getCurrentDialogId() {
        if (this.f9940x0 != null) {
            return this.f9939w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public i4 getCurrentPeerView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem()) {
                return (i4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
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
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                b4 b4Var = this.B0;
                g9 g9Var = (g9) b4Var;
                g9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(b4 b4Var) {
        this.B0 = b4Var;
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
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z9) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((i4) ((FrameLayout) getChildAt(i7)).getChildAt(0)).setPaused(z9);
        }
    }
}
