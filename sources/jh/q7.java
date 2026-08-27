package jh;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

public abstract class q7 extends m2.g {
    public int A0;
    public int B0;
    public Runnable C0;
    public b4 D0;
    public int E0;
    public int F0;
    public float G0;
    public boolean H0;
    public a8.b I0;
    public i9 J0;
    public int K0;
    public float L0;

    public long f13863s0;

    public ArrayList f13864t0;

    public int f13865u0;

    public n7 f13866v0;

    public ArrayList f13867w0;

    public y3 f13868x0;

    public boolean f13869y0;

    public boolean f13870z0;

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
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p7 p7Var = (p7) getChildAt(i10);
            if (p7Var.d && !p7Var.f13828a.K1.d()) {
                this.J0.l(z10);
            }
        }
        z10 = true;
        this.J0.l(z10);
    }

    public final void B() {
        if (this.K0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.K0) {
                    p7 p7Var = (p7) getChildAt(i10);
                    if (!p7Var.d) {
                        this.K0 = -1;
                        p7Var.a(true);
                        if (this.f13864t0 != null) {
                            e4 e4Var = p7Var.f13828a;
                            long j10 = p7Var.f13829b;
                            ArrayList arrayList = p7Var.f13830c;
                            e4Var.f13291x1 = j10;
                            e4Var.f13283v1 = arrayList;
                            e4Var.o0(0);
                        } else {
                            p7Var.f13828a.U0(0, p7Var.f13829b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int i10, long j10, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        i9 i9Var = this.J0;
        n7 n7Var = this.f13866v0;
        int size = 0;
        if (this.f13863s0 == j10) {
            ArrayList arrayList3 = this.f13864t0;
            if (arrayList3 == null && arrayList == null) {
                if (this.f13865u0 == i10) {
                    return;
                }
            } else if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList3.size()) {
                        if (C((ArrayList) arrayList3.get(i11), (ArrayList) arrayList.get(i11))) {
                            i11++;
                        }
                    } else if (this.f13865u0 == i10) {
                        return;
                    }
                }
            }
        }
        if (this.f13863s0 == j10 && this.f13865u0 == i10 && (arrayList2 = this.f13864t0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    z10 = true;
                    break;
                } else {
                    if (!C((ArrayList) arrayList2.get(i12), (ArrayList) arrayList.get(i12))) {
                        z10 = false;
                        break;
                    }
                    i12++;
                }
            }
        } else {
            z10 = false;
            break;
        }
        this.f13863s0 = j10;
        this.f13864t0 = arrayList;
        this.f13865u0 = i10;
        if (z10 && n7Var != null) {
            n7Var.g();
            this.f13869y0 = true;
            return;
        }
        setAdapter(null);
        setAdapter(n7Var);
        while (size < arrayList.size() && !((ArrayList) arrayList.get(size)).contains(Integer.valueOf(i9Var.L0))) {
            size++;
        }
        if (i9Var.N0) {
            size = (arrayList.size() - 1) - size;
        }
        setCurrentItem(size);
        this.f13869y0 = true;
    }

    public final boolean E(boolean z10) {
        i9 i9Var = this.J0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f13864t0;
            if (arrayList == null) {
                arrayList = this.f13867w0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (i9Var.f13464a && Build.VERSION.SDK_INT < 33) {
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
        if (i9Var.f13464a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            e4 e4Var = (e4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            e4Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !e4Var.Q3);
        }
    }

    public long getCurrentDialogId() {
        if (this.f13864t0 != null) {
            return this.f13863s0;
        }
        if (getCurrentItem() < this.f13867w0.size()) {
            return ((Long) this.f13867w0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public e4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (e4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.f13867w0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13870z0 && !this.H0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f13869y0) {
            this.f13869y0 = false;
            e4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                y3 y3Var = this.f13868x0;
                z8 z8Var = (z8) y3Var;
                z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f13870z0 && !this.H0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.H0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(y3 y3Var) {
        this.f13868x0 = y3Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) > 1.0f || this.L0 == f10) {
            return;
        }
        this.L0 = f10;
        setCameraDistance(getWidth() * 15);
        setPivotX(f10 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f10 * 90.0f);
    }

    public void setKeyboardHeight(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            e4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((e4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}
