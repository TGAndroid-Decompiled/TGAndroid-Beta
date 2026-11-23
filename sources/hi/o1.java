package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.ui.Components.ek0;
public final class o1 extends ek0 {
    public org.telegram.ui.ActionBar.k5 f15189f3;
    public boolean f15190g3;
    public float f15191h3;
    public float f15192i3;
    public boolean j3;
    public final SparseArray f15193k3;
    public final ArrayList f15194l3;
    public final ArrayList f15195m3;
    public final ArrayList f15196n3;
    public final ArrayList f15197o3;
    public final PorterDuffColorFilter f15198p3;

    public o1(Context context) {
        super(context, null);
        this.j3 = false;
        this.f15193k3 = new SparseArray();
        this.f15194l3 = new ArrayList();
        this.f15195m3 = new ArrayList();
        this.f15196n3 = new ArrayList();
        this.f15197o3 = new ArrayList();
        this.f15198p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(o1 o1Var, int i7, int i10) {
        int i11;
        if (o1Var.f15189f3 != null && (o1Var.getLayoutManager() instanceof v4.t)) {
            v4.t tVar = (v4.t) o1Var.getLayoutManager();
            View m10 = tVar.m(i7);
            int L0 = tVar.L0();
            if ((m10 == null && Math.abs(i7 - L0) > tVar.J * 9.0f) || !cz.c()) {
                org.telegram.ui.ActionBar.k5 k5Var = o1Var.f15189f3;
                if (tVar.L0() < i7) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                k5Var.f29186b = i11;
                o1Var.f15189f3.k(i7, i10, false, false);
                return;
            }
            l1 l1Var = new l1(0, o1Var.getContext(), o1Var);
            l1Var.f59109a = i7;
            l1Var.f55744p = i10;
            tVar.w0(l1Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        m1 m1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.f15191h3, getWidth(), this.f15192i3);
        if (!this.f15190g3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.F1;
        if (!rect.isEmpty()) {
            this.C1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f34871n2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.C1.draw(canvas);
            canvas.restore();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f15193k3;
            int size = sparseArray.size();
            arrayList = this.f15194l3;
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
            if (childAt instanceof n1) {
                n1 n1Var = (n1) childAt;
                if (n1Var.getY() < this.f15192i3 && n1Var.getY() + n1Var.getHeight() > this.f15191h3) {
                    if (this.j3) {
                        top = (int) n1Var.getY();
                    } else {
                        top = n1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) p5.c.g(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(n1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f15197o3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f15196n3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f15195m3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            n1 n1Var2 = (n1) arrayList7.get(i7);
            int R = RecyclerView.R(n1Var2);
            while (true) {
                if (i7 < arrayList5.size()) {
                    if (((m1) arrayList5.get(i7)).N == R) {
                        m1Var = (m1) arrayList5.get(i7);
                        arrayList5.remove(i7);
                        break;
                    }
                    i7++;
                } else {
                    m1Var = null;
                    break;
                }
            }
            if (m1Var == null) {
                if (!arrayList2.isEmpty()) {
                    m1Var = (m1) p5.c.g(1, arrayList2);
                } else {
                    m1Var = new m1(this);
                    m1Var.l(7);
                }
                m1Var.N = R;
                m1Var.e();
            }
            arrayList6.add(m1Var);
            m1Var.P = arrayList7;
            canvas.save();
            canvas.translate(n1Var2.getLeft(), n1Var2.getY());
            m1Var.O = n1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (n1Var2.getLeft() * 2);
            int measuredHeight = n1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                m1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i7 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((m1) arrayList5.get(i13));
                ((m1) arrayList5.get(i13)).P = null;
                ((m1) arrayList5.get(i13)).k();
            } else {
                ((m1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof n1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(v4.p0 p0Var) {
        super.setLayoutManager(p0Var);
        this.f15189f3 = null;
        if (p0Var instanceof v4.c0) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(this, (v4.c0) p0Var);
            this.f15189f3 = k5Var;
            k5Var.f29191r = new ci.h(this, 1);
            k5Var.f29190n = new di.v6(this, 18);
        }
    }
}
