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
public final class n1 extends ek0 {
    public org.telegram.ui.ActionBar.k5 f15039f3;
    public boolean f15040g3;
    public float f15041h3;
    public float f15042i3;
    public boolean j3;
    public final SparseArray f15043k3;
    public final ArrayList f15044l3;
    public final ArrayList f15045m3;
    public final ArrayList f15046n3;
    public final ArrayList f15047o3;
    public final PorterDuffColorFilter f15048p3;

    public n1(Context context) {
        super(context, null);
        this.j3 = false;
        this.f15043k3 = new SparseArray();
        this.f15044l3 = new ArrayList();
        this.f15045m3 = new ArrayList();
        this.f15046n3 = new ArrayList();
        this.f15047o3 = new ArrayList();
        this.f15048p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(n1 n1Var, int i7, int i10) {
        int i11;
        if (n1Var.f15039f3 != null && (n1Var.getLayoutManager() instanceof v4.s)) {
            v4.s sVar = (v4.s) n1Var.getLayoutManager();
            View m10 = sVar.m(i7);
            int L0 = sVar.L0();
            if ((m10 == null && Math.abs(i7 - L0) > sVar.J * 9.0f) || !cz.c()) {
                org.telegram.ui.ActionBar.k5 k5Var = n1Var.f15039f3;
                if (sVar.L0() < i7) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                k5Var.f29152b = i11;
                n1Var.f15039f3.k(i7, i10, false, false);
                return;
            }
            k1 k1Var = new k1(0, n1Var.getContext(), n1Var);
            k1Var.f59055a = i7;
            k1Var.f55709p = i10;
            sVar.w0(k1Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        l1 l1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.f15041h3, getWidth(), this.f15042i3);
        if (!this.f15040g3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.F1;
        if (!rect.isEmpty()) {
            this.C1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f34857n2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.C1.draw(canvas);
            canvas.restore();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f15043k3;
            int size = sparseArray.size();
            arrayList = this.f15044l3;
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
            if (childAt instanceof m1) {
                m1 m1Var = (m1) childAt;
                if (m1Var.getY() < this.f15042i3 && m1Var.getY() + m1Var.getHeight() > this.f15041h3) {
                    if (this.j3) {
                        top = (int) m1Var.getY();
                    } else {
                        top = m1Var.getTop();
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
                    arrayList4.add(m1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f15047o3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f15046n3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f15045m3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            m1 m1Var2 = (m1) arrayList7.get(i7);
            int R = RecyclerView.R(m1Var2);
            while (true) {
                if (i7 < arrayList5.size()) {
                    if (((l1) arrayList5.get(i7)).N == R) {
                        l1Var = (l1) arrayList5.get(i7);
                        arrayList5.remove(i7);
                        break;
                    }
                    i7++;
                } else {
                    l1Var = null;
                    break;
                }
            }
            if (l1Var == null) {
                if (!arrayList2.isEmpty()) {
                    l1Var = (l1) p5.c.g(1, arrayList2);
                } else {
                    l1Var = new l1(this);
                    l1Var.l(7);
                }
                l1Var.N = R;
                l1Var.e();
            }
            arrayList6.add(l1Var);
            l1Var.P = arrayList7;
            canvas.save();
            canvas.translate(m1Var2.getLeft(), m1Var2.getY());
            l1Var.O = m1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (m1Var2.getLeft() * 2);
            int measuredHeight = m1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                l1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i7 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((l1) arrayList5.get(i13));
                ((l1) arrayList5.get(i13)).P = null;
                ((l1) arrayList5.get(i13)).k();
            } else {
                ((l1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof m1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(v4.o0 o0Var) {
        super.setLayoutManager(o0Var);
        this.f15039f3 = null;
        if (o0Var instanceof v4.b0) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(this, (v4.b0) o0Var);
            this.f15039f3 = k5Var;
            k5Var.f29157r = new ci.h(this, 1);
            k5Var.f29156n = new di.v6(this, 18);
        }
    }
}
