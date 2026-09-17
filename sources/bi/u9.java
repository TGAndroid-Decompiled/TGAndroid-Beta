package bi;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public abstract class u9 extends z4.g {
    public ArrayList A0;
    public h5 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public l5 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public androidx.activity.i M0;
    public pb N0;
    public int O0;
    public float P0;
    public long f3855w0;
    public ArrayList f3856x0;
    public int f3857y0;
    public r9 f3858z0;

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
                t9 t9Var = (t9) getChildAt(i10);
                if (t9Var.d && !t9Var.f3776a.O1.d()) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        this.N0.l(z10);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    t9 t9Var = (t9) getChildAt(i10);
                    if (!t9Var.d) {
                        this.O0 = -1;
                        t9Var.a(true);
                        if (this.f3856x0 != null) {
                            o5 o5Var = t9Var.f3776a;
                            long j3 = t9Var.f3777b;
                            ArrayList arrayList = t9Var.f3778c;
                            o5Var.B1 = j3;
                            o5Var.f3508z1 = arrayList;
                            o5Var.o0(0);
                        } else {
                            t9Var.f3776a.U0(0, t9Var.f3777b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r9, long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.u9.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z10) {
        pb pbVar = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f3856x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (pbVar.f3558a && Build.VERSION.SDK_INT < 33) {
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
        if (pbVar.f3558a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        boolean z10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            o5 o5Var = (o5) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !o5Var.U3) {
                z10 = true;
            } else {
                z10 = false;
            }
            o5Var.setActive(z10);
        }
    }

    public long getCurrentDialogId() {
        if (this.f3856x0 != null) {
            return this.f3855w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public o5 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (o5) ((FrameLayout) getChildAt(i10)).getChildAt(0);
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.C0) {
            this.C0 = false;
            o5 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                h5 h5Var = this.B0;
                gb gbVar = (gb) h5Var;
                gbVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(h5 h5Var) {
        this.B0 = h5Var;
    }

    public void setHorizontalProgressToDismiss(float f7) {
        if (Math.abs(f7) <= 1.0f && this.P0 != f7) {
            this.P0 = f7;
            setCameraDistance(getWidth() * 15);
            float f10 = 0.0f;
            if (f7 < 0.0f) {
                f10 = getWidth();
            }
            setPivotX(f10);
            setPivotY(getHeight() * 0.5f);
            setRotationY(f7 * 90.0f);
        }
    }

    public void setKeyboardHeight(int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            o5 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((o5) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}
