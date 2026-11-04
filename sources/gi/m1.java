package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vi0;
public final class m1 extends tj0 {
    public vi0 f13182f3;
    public boolean f13183g3;
    public float f13184h3;
    public float i3;
    public boolean f13185j3;
    public final SparseArray f13186k3;
    public final ArrayList f13187l3;
    public final ArrayList f13188m3;
    public final ArrayList f13189n3;
    public final ArrayList f13190o3;
    public final PorterDuffColorFilter f13191p3;

    public m1(Context context) {
        super(context, null);
        this.f13185j3 = false;
        this.f13186k3 = new SparseArray();
        this.f13187l3 = new ArrayList();
        this.f13188m3 = new ArrayList();
        this.f13189n3 = new ArrayList();
        this.f13190o3 = new ArrayList();
        this.f13191p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(m1 m1Var, int i3, int i10) {
        int i11;
        if (m1Var.f13182f3 != null && (m1Var.getLayoutManager() instanceof u4.s)) {
            u4.s sVar = (u4.s) m1Var.getLayoutManager();
            View m10 = sVar.m(i3);
            int L0 = sVar.L0();
            if ((m10 == null && Math.abs(i3 - L0) > sVar.J * 9.0f) || !az.c()) {
                vi0 vi0Var = m1Var.f13182f3;
                if (sVar.L0() < i3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                vi0Var.f39126b = i11;
                m1Var.f13182f3.d(i3, i10, false, false);
                return;
            }
            j1 j1Var = new j1(0, m1Var.getContext(), m1Var);
            j1Var.f55704a = i3;
            j1Var.f20461p = i10;
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
        canvas.clipRect(0.0f, this.f13184h3, getWidth(), this.i3);
        if (!this.f13183g3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.F1;
        if (!rect.isEmpty()) {
            this.C1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f38458n2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.C1.draw(canvas);
            canvas.restore();
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f13186k3;
            int size = sparseArray.size();
            arrayList = this.f13187l3;
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
                if (l1Var.getY() < this.i3 && l1Var.getY() + l1Var.getHeight() > this.f13184h3) {
                    if (this.f13185j3) {
                        top = (int) l1Var.getY();
                    } else {
                        top = l1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(l1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f13190o3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f13189n3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f13188m3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            l1 l1Var2 = (l1) arrayList7.get(i3);
            int R = RecyclerView.R(l1Var2);
            while (true) {
                if (i3 < arrayList5.size()) {
                    if (((k1) arrayList5.get(i3)).N == R) {
                        k1Var = (k1) arrayList5.get(i3);
                        arrayList5.remove(i3);
                        break;
                    }
                    i3++;
                } else {
                    k1Var = null;
                    break;
                }
            }
            if (k1Var == null) {
                if (!arrayList2.isEmpty()) {
                    k1Var = (k1) org.telegram.ui.Cells.f1.o(1, arrayList2);
                } else {
                    k1Var = new k1(this);
                    k1Var.l(7);
                }
                k1Var.N = R;
                k1Var.e();
            }
            arrayList6.add(k1Var);
            k1Var.P = arrayList7;
            canvas.save();
            canvas.translate(l1Var2.getLeft(), l1Var2.getY());
            k1Var.O = l1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (l1Var2.getLeft() * 2);
            int measuredHeight = l1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                k1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i3 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((k1) arrayList5.get(i13));
                ((k1) arrayList5.get(i13)).P = null;
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
    public final void setLayoutManager(u4.o0 o0Var) {
        super.setLayoutManager(o0Var);
        this.f13182f3 = null;
        if (o0Var instanceof u4.b0) {
            vi0 vi0Var = new vi0(this, (u4.b0) o0Var);
            this.f13182f3 = vi0Var;
            vi0Var.f39131i = new bi.h(this, 1);
            vi0Var.h = new ei.y8(this, 6);
        }
    }
}
