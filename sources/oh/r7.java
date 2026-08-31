package oh;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public abstract class r7 extends m2.h {
    public boolean A0;
    public int B0;
    public int C0;
    public Runnable D0;
    public c4 E0;
    public int F0;
    public int G0;
    public float H0;
    public boolean I0;
    public m2.b J0;
    public i9 K0;
    public int L0;
    public float M0;
    public long f17693t0;
    public ArrayList f17694u0;
    public int f17695v0;
    public o7 f17696w0;
    public ArrayList f17697x0;
    public z3 f17698y0;
    public boolean f17699z0;

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
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            if (i10 < getChildCount()) {
                q7 q7Var = (q7) getChildAt(i10);
                if (q7Var.d && !q7Var.f17662a.L1.d()) {
                    break;
                }
                i10++;
            } else {
                z4 = true;
                break;
            }
        }
        this.K0.l(z4);
    }

    public final void B() {
        if (this.L0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.L0) {
                    q7 q7Var = (q7) getChildAt(i10);
                    if (!q7Var.d) {
                        this.L0 = -1;
                        q7Var.a(true);
                        if (this.f17694u0 != null) {
                            f4 f4Var = q7Var.f17662a;
                            long j10 = q7Var.f17663b;
                            ArrayList arrayList = q7Var.f17664c;
                            f4Var.f17128y1 = j10;
                            f4Var.f17120w1 = arrayList;
                            f4Var.o0(0);
                        } else {
                            q7Var.f17662a.U0(0, q7Var.f17663b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r9, long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: oh.r7.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z4) {
        i9 i9Var = this.K0;
        boolean z10 = false;
        if (z4) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f17694u0;
            if (arrayList == null) {
                arrayList = this.f17697x0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (i9Var.f17252a && Build.VERSION.SDK_INT < 33) {
                    z10 = true;
                }
                x(currentItem2, !z10);
                return true;
            }
        }
        if (z4 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (i9Var.f17252a && Build.VERSION.SDK_INT < 33) {
            z10 = true;
        }
        x(currentItem3, !z10);
        return true;
    }

    public final void F() {
        boolean z4;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f4 f4Var = (f4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !f4Var.R3) {
                z4 = true;
            } else {
                z4 = false;
            }
            f4Var.setActive(z4);
        }
    }

    public long getCurrentDialogId() {
        if (this.f17694u0 != null) {
            return this.f17693t0;
        }
        if (getCurrentItem() < this.f17697x0.size()) {
            return ((Long) this.f17697x0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public f4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (f4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.f17697x0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0 && !this.I0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.f17699z0) {
            this.f17699z0 = false;
            f4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                z3 z3Var = this.f17698y0;
                z8 z8Var = (z8) z3Var;
                z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0 && !this.I0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.I0) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void setDelegate(z3 z3Var) {
        this.f17698y0 = z3Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) <= 1.0f && this.M0 != f10) {
            this.M0 = f10;
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

    public void setKeyboardHeight(int i10) {
        if (this.B0 != i10) {
            this.B0 = i10;
            f4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z4) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((f4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z4);
        }
    }
}
