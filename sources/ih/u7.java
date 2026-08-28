package ih;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public abstract class u7 extends m2.g {
    public int A0;
    public int B0;
    public Runnable C0;
    public f4 D0;
    public int E0;
    public int F0;
    public float G0;
    public boolean H0;
    public androidx.activity.i I0;
    public m9 J0;
    public int K0;
    public float L0;
    public long f12202s0;
    public ArrayList f12203t0;
    public int f12204u0;
    public r7 f12205v0;
    public ArrayList f12206w0;
    public c4 f12207x0;
    public boolean f12208y0;
    public boolean f12209z0;

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) != arrayList2.get(i9)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 < getChildCount()) {
                t7 t7Var = (t7) getChildAt(i9);
                if (t7Var.d && !t7Var.f12169a.K1.d()) {
                    break;
                }
                i9++;
            } else {
                z10 = true;
                break;
            }
        }
        this.J0.l(z10);
    }

    public final void B() {
        if (this.K0 >= 0) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                if (((Integer) getChildAt(i9).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.K0) {
                    t7 t7Var = (t7) getChildAt(i9);
                    if (!t7Var.d) {
                        this.K0 = -1;
                        t7Var.a(true);
                        if (this.f12203t0 != null) {
                            i4 i4Var = t7Var.f12169a;
                            long j10 = t7Var.f12170b;
                            ArrayList arrayList = t7Var.f12171c;
                            i4Var.f11604x1 = j10;
                            i4Var.f11596v1 = arrayList;
                            i4Var.o0(0);
                        } else {
                            t7Var.f12169a.U0(0, t7Var.f12170b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r9, long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: ih.u7.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z10) {
        m9 m9Var = this.J0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f12203t0;
            if (arrayList == null) {
                arrayList = this.f12206w0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (m9Var.f11783a && Build.VERSION.SDK_INT < 33) {
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
        if (m9Var.f11783a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        boolean z10;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            i4 i4Var = (i4) ((FrameLayout) getChildAt(i9)).getChildAt(0);
            if (((Integer) getChildAt(i9).getTag()).intValue() == getCurrentItem() && !i4Var.Q3) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.setActive(z10);
        }
    }

    public long getCurrentDialogId() {
        if (this.f12203t0 != null) {
            return this.f12202s0;
        }
        if (getCurrentItem() < this.f12206w0.size()) {
            return ((Long) this.f12206w0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public i4 getCurrentPeerView() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (((Integer) getChildAt(i9).getTag()).intValue() == getCurrentItem()) {
                return (i4) ((FrameLayout) getChildAt(i9)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.f12206w0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12209z0 && !this.H0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.f12208y0) {
            this.f12208y0 = false;
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                c4 c4Var = this.f12207x0;
                d9 d9Var = (d9) c4Var;
                d9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f12209z0 && !this.H0) {
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

    public void setDelegate(c4 c4Var) {
        this.f12207x0 = c4Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) <= 1.0f && this.L0 != f10) {
            this.L0 = f10;
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

    public void setKeyboardHeight(int i9) {
        if (this.A0 != i9) {
            this.A0 = i9;
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((i4) ((FrameLayout) getChildAt(i9)).getChildAt(0)).setPaused(z10);
        }
    }
}
