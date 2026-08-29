package lh;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public abstract class r7 extends m2.g {
    public int A0;
    public int B0;
    public Runnable C0;
    public a4 D0;
    public int E0;
    public int F0;
    public float G0;
    public boolean H0;
    public m7 I0;
    public i9 J0;
    public int K0;
    public float L0;
    public long f16178s0;
    public ArrayList f16179t0;
    public int f16180u0;
    public o7 f16181v0;
    public ArrayList f16182w0;
    public x3 f16183x0;
    public boolean f16184y0;
    public boolean f16185z0;

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != arrayList2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < getChildCount()) {
                q7 q7Var = (q7) getChildAt(i10);
                if (q7Var.d && !q7Var.f16132a.K1.d()) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        this.J0.l(z10);
    }

    public final void B() {
        if (this.K0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.K0) {
                    q7 q7Var = (q7) getChildAt(i10);
                    if (!q7Var.d) {
                        this.K0 = -1;
                        q7Var.a(true);
                        if (this.f16179t0 != null) {
                            d4 d4Var = q7Var.f16132a;
                            long j10 = q7Var.f16133b;
                            ArrayList arrayList = q7Var.f16134c;
                            d4Var.f15540x1 = j10;
                            d4Var.f15532v1 = arrayList;
                            d4Var.o0(0);
                        } else {
                            q7Var.f16132a.U0(0, q7Var.f16133b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r9, long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: lh.r7.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z10) {
        i9 i9Var = this.J0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f16179t0;
            if (arrayList == null) {
                arrayList = this.f16182w0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (i9Var.f15742a && Build.VERSION.SDK_INT < 33) {
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
        if (i9Var.f15742a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        boolean z10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            d4 d4Var = (d4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !d4Var.Q3) {
                z10 = true;
            } else {
                z10 = false;
            }
            d4Var.setActive(z10);
        }
    }

    public long getCurrentDialogId() {
        if (this.f16179t0 != null) {
            return this.f16178s0;
        }
        if (getCurrentItem() < this.f16182w0.size()) {
            return ((Long) this.f16182w0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public d4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (d4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.f16182w0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f16185z0 && !this.H0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f16184y0) {
            this.f16184y0 = false;
            d4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                x3 x3Var = this.f16183x0;
                z8 z8Var = (z8) x3Var;
                z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16185z0 && !this.H0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.H0) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void setDelegate(x3 x3Var) {
        this.f16183x0 = x3Var;
    }

    public void setHorizontalProgressToDismiss(float f9) {
        if (Math.abs(f9) <= 1.0f && this.L0 != f9) {
            this.L0 = f9;
            setCameraDistance(getWidth() * 15);
            float f10 = 0.0f;
            if (f9 < 0.0f) {
                f10 = getWidth();
            }
            setPivotX(f10);
            setPivotY(getHeight() * 0.5f);
            setRotationY(f9 * 90.0f);
        }
    }

    public void setKeyboardHeight(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            d4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((d4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}
