package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class dw3 extends d79 {
    public static final int q3 = 0;
    public hw6 f3;
    public boolean g3;
    public float h3;
    public float i3;
    public boolean j3;
    public final SparseArray k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final ArrayList n3;
    public final ArrayList o3;
    public final PorterDuffColorFilter p3;

    public dw3(Context context) {
        super(context, null);
        this.j3 = false;
        this.k3 = new SparseArray();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new ArrayList();
        this.p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public final void A1(int i, int i2) {
        int i3;
        if (this.f3 != null && (getLayoutManager() instanceof u55)) {
            u55 u55Var = (u55) getLayoutManager();
            View m = u55Var.m(i);
            int K0 = u55Var.K0();
            if ((m == null && Math.abs(i - K0) > u55Var.J * 9.0f) || !xea.c()) {
                hw6 hw6Var = this.f3;
                if (u55Var.K0() < i) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                hw6Var.b = i3;
                this.f3.k(i, i2, false, false);
                return;
            }
            aw3 aw3Var = new aw3((byte) 0, getContext(), this);
            aw3Var.a = i;
            aw3Var.p = i2;
            u55Var.v0(aw3Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        bw3 bw3Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.h3, getWidth(), this.i3);
        if (!this.g3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.F1;
        if (!rect.isEmpty()) {
            this.C1.setBounds(rect);
            canvas.save();
            pt2 pt2Var = this.n2;
            if (pt2Var != null) {
                pt2Var.accept(canvas);
            }
            this.C1.draw(canvas);
            canvas.restore();
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            sparseArray = this.k3;
            int size = sparseArray.size();
            arrayList = this.l3;
            if (i2 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i2);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i2++;
        }
        sparseArray.clear();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof cw3) {
                cw3 cw3Var = (cw3) childAt;
                if (cw3Var.getY() < this.i3 && cw3Var.getY() + cw3Var.getHeight() > this.h3) {
                    if (this.j3) {
                        top = (int) cw3Var.getY();
                    } else {
                        top = cw3Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) qd4.l(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(cw3Var);
                }
            }
        }
        ArrayList arrayList5 = this.o3;
        arrayList5.clear();
        ArrayList arrayList6 = this.n3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.m3;
            if (i4 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
            cw3 cw3Var2 = (cw3) arrayList7.get(i);
            int S = RecyclerView.S(cw3Var2);
            while (true) {
                if (i < arrayList5.size()) {
                    if (((bw3) arrayList5.get(i)).N == S) {
                        bw3Var = (bw3) arrayList5.get(i);
                        arrayList5.remove(i);
                        break;
                    }
                    i++;
                } else {
                    bw3Var = null;
                    break;
                }
            }
            if (bw3Var == null) {
                if (!arrayList2.isEmpty()) {
                    bw3Var = (bw3) qd4.l(1, arrayList2);
                } else {
                    bw3Var = new bw3(this);
                    bw3Var.l(7);
                }
                bw3Var.N = S;
                bw3Var.e();
            }
            arrayList6.add(bw3Var);
            bw3Var.P = arrayList7;
            canvas.save();
            canvas.translate(cw3Var2.getLeft(), cw3Var2.getY());
            bw3Var.O = cw3Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (cw3Var2.getLeft() << 1);
            int measuredHeight = cw3Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                bw3Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i4++;
            i = 0;
        }
        for (int i5 = 0; i5 < arrayList5.size(); i5++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((bw3) arrayList5.get(i5));
                ((bw3) arrayList5.get(i5)).P = null;
                ((bw3) arrayList5.get(i5)).k();
            } else {
                ((bw3) arrayList5.get(i5)).f();
            }
        }
        arrayList5.clear();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 != null && !(childAt2 instanceof cw3) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(q79 q79Var) {
        super.setLayoutManager(q79Var);
        this.f3 = null;
        if (q79Var instanceof x46) {
            hw6 hw6Var = new hw6(this, (x46) q79Var);
            this.f3 = hw6Var;
            hw6Var.r = new zv3(this, (byte) 0);
            hw6Var.n = new lu3(this, (byte) 1);
        }
    }
}
