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
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.ul0;
public final class o1 extends rm0 {
    public ul0 V2;
    public boolean W2;
    public float X2;
    public float Y2;
    public boolean Z2;
    public final SparseArray f5660a3;
    public final ArrayList f5661b3;
    public final ArrayList f5662c3;
    public final ArrayList f5663d3;
    public final ArrayList f5664e3;
    public final PorterDuffColorFilter f5665f3;

    public o1(Context context) {
        super(context, null);
        this.Z2 = false;
        this.f5660a3 = new SparseArray();
        this.f5661b3 = new ArrayList();
        this.f5662c3 = new ArrayList();
        this.f5663d3 = new ArrayList();
        this.f5664e3 = new ArrayList();
        this.f5665f3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void x1(o1 o1Var, int i10, int i11) {
        int i12;
        if (o1Var.V2 != null && (o1Var.getLayoutManager() instanceof s4.s)) {
            s4.s sVar = (s4.s) o1Var.getLayoutManager();
            View m10 = sVar.m(i10);
            int L0 = sVar.L0();
            if ((m10 == null && Math.abs(i10 - L0) > sVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
                ul0 ul0Var = o1Var.V2;
                if (sVar.L0() < i10) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                ul0Var.f31630b = i12;
                o1Var.V2.c(i10, i11, false, false);
                return;
            }
            l1 l1Var = new l1(o1Var, o1Var.getContext(), 0);
            l1Var.f47951a = i10;
            l1Var.f14272p = i11;
            sVar.w0(l1Var);
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
        canvas.clipRect(0.0f, this.X2, getWidth(), this.Y2);
        if (!this.W2) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.E1;
        if (!rect.isEmpty()) {
            this.B1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f30568m2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.B1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f5660a3;
            int size = sparseArray.size();
            arrayList = this.f5661b3;
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
            if (childAt instanceof n1) {
                n1 n1Var = (n1) childAt;
                if (n1Var.getY() < this.Y2 && n1Var.getY() + n1Var.getHeight() > this.X2) {
                    if (this.Z2) {
                        top = (int) n1Var.getY();
                    } else {
                        top = n1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hg.c.x(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(n1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f5664e3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f5663d3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f5662c3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            n1 n1Var2 = (n1) arrayList7.get(i10);
            int R = RecyclerView.R(n1Var2);
            while (true) {
                if (i10 < arrayList5.size()) {
                    if (((m1) arrayList5.get(i10)).M == R) {
                        m1Var = (m1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    m1Var = null;
                    break;
                }
            }
            if (m1Var == null) {
                if (!arrayList2.isEmpty()) {
                    m1Var = (m1) hg.c.x(1, arrayList2);
                } else {
                    m1Var = new m1(this);
                    m1Var.l(7);
                }
                m1Var.M = R;
                m1Var.e();
            }
            arrayList6.add(m1Var);
            m1Var.O = arrayList7;
            canvas.save();
            canvas.translate(n1Var2.getLeft(), n1Var2.getY());
            m1Var.N = n1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (n1Var2.getLeft() * 2);
            int measuredHeight = n1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                m1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((m1) arrayList5.get(i14));
                ((m1) arrayList5.get(i14)).O = null;
                ((m1) arrayList5.get(i14)).k();
            } else {
                ((m1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
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
    public final void setLayoutManager(s4.p0 p0Var) {
        super.setLayoutManager(p0Var);
        this.V2 = null;
        if (p0Var instanceof s4.d0) {
            ul0 ul0Var = new ul0(this, (s4.d0) p0Var);
            this.V2 = ul0Var;
            ul0Var.f31635i = new k1(this, 0);
            ul0Var.h = new a1.c(this, 15);
        }
    }
}
