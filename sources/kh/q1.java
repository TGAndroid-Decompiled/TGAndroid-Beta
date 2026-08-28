package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.wk0;
public final class q1 extends wk0 {
    public c2.y T2;
    public boolean U2;
    public float V2;
    public float W2;
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList f15854b3;
    public final ArrayList f15855c3;
    public final PorterDuffColorFilter f15856d3;

    public q1(Context context) {
        super(context, null);
        this.X2 = false;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.f15854b3 = new ArrayList();
        this.f15855c3 = new ArrayList();
        this.f15856d3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void w1(q1 q1Var, int i9, int i10) {
        int i11;
        if (q1Var.T2 != null && (q1Var.getLayoutManager() instanceof f2.y)) {
            f2.y yVar = (f2.y) q1Var.getLayoutManager();
            View m10 = yVar.m(i9);
            int L0 = yVar.L0();
            if ((m10 == null && Math.abs(i9 - L0) > yVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
                c2.y yVar2 = q1Var.T2;
                if (yVar.L0() < i9) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                yVar2.f2255b = i11;
                q1Var.T2.c(i9, i10, false, false);
                return;
            }
            n1 n1Var = new n1(q1Var, q1Var.getContext(), 0);
            n1Var.f5443a = i9;
            n1Var.f47269p = i10;
            yVar.w0(n1Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        o1 o1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.V2, getWidth(), this.W2);
        if (!this.U2) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.C1;
        if (!rect.isEmpty()) {
            this.f34287z1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f34259k2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.f34287z1.draw(canvas);
            canvas.restore();
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.Z2;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof p1) {
                p1 p1Var = (p1) childAt;
                if (p1Var.getY() < this.W2 && p1Var.getY() + p1Var.getHeight() > this.V2) {
                    if (this.X2) {
                        top = (int) p1Var.getY();
                    } else {
                        top = p1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) e2.c.k(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(p1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f15855c3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f15854b3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.a3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            p1 p1Var2 = (p1) arrayList7.get(i9);
            int R = RecyclerView.R(p1Var2);
            while (true) {
                if (i9 < arrayList5.size()) {
                    if (((o1) arrayList5.get(i9)).I == R) {
                        o1Var = (o1) arrayList5.get(i9);
                        arrayList5.remove(i9);
                        break;
                    }
                    i9++;
                } else {
                    o1Var = null;
                    break;
                }
            }
            if (o1Var == null) {
                if (!arrayList2.isEmpty()) {
                    o1Var = (o1) e2.c.k(1, arrayList2);
                } else {
                    o1Var = new o1(this);
                    o1Var.l(7);
                }
                o1Var.I = R;
                o1Var.e();
            }
            arrayList6.add(o1Var);
            o1Var.K = arrayList7;
            canvas.save();
            canvas.translate(p1Var2.getLeft(), p1Var2.getY());
            o1Var.J = p1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (p1Var2.getLeft() * 2);
            int measuredHeight = p1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                o1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i9 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((o1) arrayList5.get(i13));
                ((o1) arrayList5.get(i13)).K = null;
                ((o1) arrayList5.get(i13)).k();
            } else {
                ((o1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof p1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                canvas.save();
                canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override
    public final void setLayoutManager(f2.z0 z0Var) {
        super.setLayoutManager(z0Var);
        this.T2 = null;
        if (z0Var instanceof f2.m0) {
            c2.y yVar = new c2.y(this, (f2.m0) z0Var);
            this.T2 = yVar;
            yVar.f2260i = new m1(this, 0);
            yVar.h = new p(this, 1);
        }
    }
}
