package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ri0;
public final class m1 extends pj0 {
    public ri0 f12403e3;
    public boolean f12404f3;
    public float f12405g3;
    public float f12406h3;
    public boolean f12407i3;
    public final SparseArray j3;
    public final ArrayList f12408k3;
    public final ArrayList f12409l3;
    public final ArrayList f12410m3;
    public final ArrayList f12411n3;
    public final PorterDuffColorFilter f12412o3;

    public m1(Context context) {
        super(context, null);
        this.f12407i3 = false;
        this.j3 = new SparseArray();
        this.f12408k3 = new ArrayList();
        this.f12409l3 = new ArrayList();
        this.f12410m3 = new ArrayList();
        this.f12411n3 = new ArrayList();
        this.f12412o3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(m1 m1Var, int i7, int i10) {
        int i11;
        if (m1Var.f12403e3 != null && (m1Var.getLayoutManager() instanceof v4.s)) {
            v4.s sVar = (v4.s) m1Var.getLayoutManager();
            View m10 = sVar.m(i7);
            int L0 = sVar.L0();
            if ((m10 == null && Math.abs(i7 - L0) > sVar.J * 9.0f) || !iz.c()) {
                ri0 ri0Var = m1Var.f12403e3;
                if (sVar.L0() < i7) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                ri0Var.f37692b = i11;
                m1Var.f12403e3.d(i7, i10, false, false);
                return;
            }
            j1 j1Var = new j1(0, m1Var.getContext(), m1Var);
            j1Var.f57121a = i7;
            j1Var.f20108p = i10;
            sVar.w0(j1Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        k1 k1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.f12405g3, getWidth(), this.f12406h3);
        if (!this.f12404f3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.E1;
        if (!rect.isEmpty()) {
            this.B1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f36938m2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.B1.draw(canvas);
            canvas.restore();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.j3;
            int size = sparseArray.size();
            arrayList = this.f12408k3;
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
            if (childAt instanceof l1) {
                l1 l1Var = (l1) childAt;
                if (l1Var.getY() < this.f12406h3 && l1Var.getY() + l1Var.getHeight() > this.f12405g3) {
                    if (this.f12407i3) {
                        top = (int) l1Var.getY();
                    } else {
                        top = l1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(l1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f12411n3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f12410m3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f12409l3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            l1 l1Var2 = (l1) arrayList7.get(i7);
            int R = RecyclerView.R(l1Var2);
            while (true) {
                if (i7 < arrayList5.size()) {
                    if (((k1) arrayList5.get(i7)).M == R) {
                        k1Var = (k1) arrayList5.get(i7);
                        arrayList5.remove(i7);
                        break;
                    }
                    i7++;
                } else {
                    k1Var = null;
                    break;
                }
            }
            if (k1Var == null) {
                if (!arrayList2.isEmpty()) {
                    k1Var = (k1) org.telegram.ui.Cells.f1.k(1, arrayList2);
                } else {
                    k1Var = new k1(this);
                    k1Var.l(7);
                }
                k1Var.M = R;
                k1Var.e();
            }
            arrayList6.add(k1Var);
            k1Var.O = arrayList7;
            canvas.save();
            canvas.translate(l1Var2.getLeft(), l1Var2.getY());
            k1Var.N = l1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (l1Var2.getLeft() * 2);
            int measuredHeight = l1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                k1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i7 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((k1) arrayList5.get(i13));
                ((k1) arrayList5.get(i13)).O = null;
                ((k1) arrayList5.get(i13)).k();
            } else {
                ((k1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof l1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(v4.n0 n0Var) {
        super.setLayoutManager(n0Var);
        this.f12403e3 = null;
        if (n0Var instanceof v4.b0) {
            ri0 ri0Var = new ri0(this, (v4.b0) n0Var);
            this.f12403e3 = ri0Var;
            ri0Var.f37697i = new ai.m(this, 1);
            ri0Var.h = new di.q4(this, 10);
        }
    }
}
