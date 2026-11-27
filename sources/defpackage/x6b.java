package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class x6b extends fic {
    public final v6b A0;
    public ArrayList B0;
    public k68 C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public Runnable H0;
    public final m68 I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public final bva N0;
    public final lcb O0;
    public int P0;
    public final ArrayList Q0;
    public float R0;
    public long x0;
    public ArrayList y0;
    public int z0;

    public x6b(int i, Context context, lcb lcbVar, x53 x53Var) {
        super(context);
        boolean z;
        this.B0 = new ArrayList();
        this.E0 = true;
        acb acbVar = (acb) this;
        this.N0 = new bva(acbVar, (byte) 4);
        this.P0 = -1;
        this.Q0 = new ArrayList();
        this.z0 = i;
        this.I0 = new m68(context);
        this.O0 = lcbVar;
        v6b v6bVar = new v6b(acbVar, context, lcbVar, x53Var);
        this.A0 = v6bVar;
        setAdapter(v6bVar);
        hja hjaVar = new hja(acbVar, (byte) 18);
        if (this.n0 != null) {
            z = false;
        } else {
            z = true;
        }
        this.n0 = hjaVar;
        setChildrenDrawingOrderEnabled(true);
        this.p0 = (byte) 1;
        this.o0 = (byte) 2;
        if (z) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new vk8((byte) 1, acbVar, lcbVar));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            if (arrayList2 == null) {
                return true;
            }
        } else if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != arrayList2.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void A() {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                w6b w6bVar = (w6b) getChildAt(i);
                if (w6bVar.d && !w6bVar.a.y1.a()) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        this.O0.c(z);
    }

    public final void B() {
        if (this.P0 >= 0) {
            for (int i = 0; i < getChildCount(); i++) {
                if (((Integer) getChildAt(i).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.P0) {
                    w6b w6bVar = (w6b) getChildAt(i);
                    if (!w6bVar.d) {
                        this.P0 = -1;
                        w6bVar.a(true);
                        ArrayList arrayList = this.y0;
                        o68 o68Var = w6bVar.a;
                        long j = w6bVar.b;
                        if (arrayList != null) {
                            ArrayList arrayList2 = w6bVar.c;
                            o68Var.l1 = j;
                            o68Var.j1 = arrayList2;
                            o68Var.e0(0);
                        } else {
                            o68Var.P0(0, j);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r7, long r8, java.util.ArrayList r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6b.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z) {
        lcb lcbVar = this.O0;
        boolean z2 = false;
        if (z) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.y0;
            if (arrayList == null) {
                arrayList = this.B0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (lcbVar.a && Build.VERSION.SDK_INT < 33) {
                    z2 = true;
                }
                x(currentItem2, !z2);
                return true;
            }
        }
        if (z || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (lcbVar.a && Build.VERSION.SDK_INT < 33) {
            z2 = true;
        }
        x(currentItem3, !z2);
        return true;
    }

    public final void F() {
        boolean z;
        for (int i = 0; i < getChildCount(); i++) {
            o68 o68Var = (o68) ((FrameLayout) getChildAt(i)).getChildAt(0);
            if (((Integer) getChildAt(i).getTag()).intValue() == getCurrentItem() && !o68Var.D3) {
                z = true;
            } else {
                z = false;
            }
            o68Var.setActive(z);
        }
    }

    public long getCurrentDialogId() {
        if (this.y0 != null) {
            return this.x0;
        }
        if (getCurrentItem() < this.B0.size()) {
            return ((Long) this.B0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public o68 getCurrentPeerView() {
        for (int i = 0; i < getChildCount(); i++) {
            if (((Integer) getChildAt(i).getTag()).intValue() == getCurrentItem()) {
                return (o68) ((FrameLayout) getChildAt(i)).getChildAt(0);
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
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.D0) {
            this.D0 = false;
            o68 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                k68 k68Var = this.C0;
                ccb ccbVar = (ccb) k68Var;
                ccbVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(k68 k68Var) {
        this.C0 = k68Var;
    }

    public void setHorizontalProgressToDismiss(float f) {
        if (Math.abs(f) <= 1.0f && this.R0 != f) {
            this.R0 = f;
            setCameraDistance(getWidth() * 15);
            float f2 = 0.0f;
            if (f < 0.0f) {
                f2 = getWidth();
            }
            setPivotX(f2);
            setPivotY(getHeight() * 0.5f);
            setRotationY(f * 90.0f);
        }
    }

    public void setKeyboardHeight(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            o68 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            ((o68) ((FrameLayout) getChildAt(i)).getChildAt(0)).setPaused(z);
        }
    }
}
