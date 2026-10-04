package ci;

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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.zl0;
public final class p1 extends zl0 {
    public bl0 f5679e3;
    public boolean f5680f3;
    public float f5681g3;
    public float f5682h3;
    public boolean f5683i3;
    public final SparseArray j3;
    public final ArrayList f5684k3;
    public final ArrayList f5685l3;
    public final ArrayList f5686m3;
    public final ArrayList f5687n3;
    public final PorterDuffColorFilter f5688o3;

    public p1(Context context) {
        super(context, null);
        this.f5683i3 = false;
        this.j3 = new SparseArray();
        this.f5684k3 = new ArrayList();
        this.f5685l3 = new ArrayList();
        this.f5686m3 = new ArrayList();
        this.f5687n3 = new ArrayList();
        this.f5688o3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void y1(p1 p1Var, int i10, int i11) {
        int i12;
        if (p1Var.f5679e3 != null && (p1Var.getLayoutManager() instanceof s4.s)) {
            s4.s sVar = (s4.s) p1Var.getLayoutManager();
            View m10 = sVar.m(i10);
            int L0 = sVar.L0();
            if ((m10 == null && Math.abs(i10 - L0) > sVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
                bl0 bl0Var = p1Var.f5679e3;
                if (sVar.L0() < i10) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                bl0Var.f24995b = i12;
                p1Var.f5679e3.d(i10, i11, false, false);
                return;
            }
            m1 m1Var = new m1(p1Var, p1Var.getContext(), 0);
            m1Var.f46692a = i10;
            m1Var.f14236p = i11;
            sVar.w0(m1Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        n1 n1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.f5681g3, getWidth(), this.f5682h3);
        if (!this.f5680f3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.G1;
        if (!rect.isEmpty()) {
            this.D1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f33544o2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.D1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.j3;
            int size = sparseArray.size();
            arrayList = this.f5684k3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof o1) {
                o1 o1Var = (o1) childAt;
                if (o1Var.getY() < this.f5682h3 && o1Var.getY() + o1Var.getHeight() > this.f5681g3) {
                    if (this.f5683i3) {
                        top = (int) o1Var.getY();
                    } else {
                        top = o1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hg.k0.w(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(o1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f5687n3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f5686m3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f5685l3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            o1 o1Var2 = (o1) arrayList7.get(i10);
            int R = RecyclerView.R(o1Var2);
            while (true) {
                if (i10 < arrayList5.size()) {
                    if (((n1) arrayList5.get(i10)).M == R) {
                        n1Var = (n1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    n1Var = null;
                    break;
                }
            }
            if (n1Var == null) {
                if (!arrayList2.isEmpty()) {
                    n1Var = (n1) hg.k0.w(1, arrayList2);
                } else {
                    n1Var = new n1(this);
                    n1Var.l(7);
                }
                n1Var.M = R;
                n1Var.e();
            }
            arrayList6.add(n1Var);
            n1Var.O = arrayList7;
            canvas.save();
            canvas.translate(o1Var2.getLeft(), o1Var2.getY());
            n1Var.N = o1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (o1Var2.getLeft() * 2);
            int measuredHeight = o1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                n1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((n1) arrayList5.get(i14));
                ((n1) arrayList5.get(i14)).O = null;
                ((n1) arrayList5.get(i14)).k();
            } else {
                ((n1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof o1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(s4.o0 o0Var) {
        super.setLayoutManager(o0Var);
        this.f5679e3 = null;
        if (o0Var instanceof s4.c0) {
            bl0 bl0Var = new bl0(this, (s4.c0) o0Var);
            this.f5679e3 = bl0Var;
            bl0Var.f25000i = new l1(this, 0);
            bl0Var.h = new a1.c(this, 15);
        }
    }
}
