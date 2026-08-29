package nh;

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
import org.telegram.ui.Components.jl0;
public final class n1 extends jl0 {
    public c2.z T2;
    public boolean U2;
    public float V2;
    public float W2;
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList f18163a3;
    public final ArrayList f18164b3;
    public final ArrayList c3;
    public final PorterDuffColorFilter f18165d3;

    public n1(Context context) {
        super(context, null);
        this.X2 = false;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.f18163a3 = new ArrayList();
        this.f18164b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.f18165d3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void w1(n1 n1Var, int i10, int i11) {
        int i12;
        if (n1Var.T2 != null && (n1Var.getLayoutManager() instanceof f2.w)) {
            f2.w wVar = (f2.w) n1Var.getLayoutManager();
            View m10 = wVar.m(i10);
            int L0 = wVar.L0();
            if ((m10 == null && Math.abs(i10 - L0) > wVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
                c2.z zVar = n1Var.T2;
                if (wVar.L0() < i10) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                zVar.f2933b = i12;
                n1Var.T2.c(i10, i11, false, false);
                return;
            }
            k1 k1Var = new k1(n1Var, n1Var.getContext(), 0);
            k1Var.f6373a = i10;
            k1Var.f49306p = i11;
            wVar.w0(k1Var);
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
        canvas.clipRect(0.0f, this.V2, getWidth(), this.W2);
        if (!this.U2) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.C1;
        if (!rect.isEmpty()) {
            this.f29736z1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f29708k2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.f29736z1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.Z2;
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
            if (childAt instanceof m1) {
                m1 m1Var = (m1) childAt;
                if (m1Var.getY() < this.W2 && m1Var.getY() + m1Var.getHeight() > this.V2) {
                    if (this.X2) {
                        top = (int) m1Var.getY();
                    } else {
                        top = m1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) com.google.android.recaptcha.internal.a.j(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(m1Var);
                }
            }
        }
        ArrayList arrayList5 = this.c3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f18164b3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f18163a3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            m1 m1Var2 = (m1) arrayList7.get(i10);
            int R = RecyclerView.R(m1Var2);
            while (true) {
                if (i10 < arrayList5.size()) {
                    if (((l1) arrayList5.get(i10)).I == R) {
                        l1Var = (l1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    l1Var = null;
                    break;
                }
            }
            if (l1Var == null) {
                if (!arrayList2.isEmpty()) {
                    l1Var = (l1) com.google.android.recaptcha.internal.a.j(1, arrayList2);
                } else {
                    l1Var = new l1(this);
                    l1Var.l(7);
                }
                l1Var.I = R;
                l1Var.e();
            }
            arrayList6.add(l1Var);
            l1Var.K = arrayList7;
            canvas.save();
            canvas.translate(m1Var2.getLeft(), m1Var2.getY());
            l1Var.J = m1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (m1Var2.getLeft() * 2);
            int measuredHeight = m1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                l1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((l1) arrayList5.get(i14));
                ((l1) arrayList5.get(i14)).K = null;
                ((l1) arrayList5.get(i14)).k();
            } else {
                ((l1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
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
    public final void setLayoutManager(f2.w0 w0Var) {
        super.setLayoutManager(w0Var);
        this.T2 = null;
        if (w0Var instanceof f2.j0) {
            c2.z zVar = new c2.z(this, (f2.j0) w0Var);
            this.T2 = zVar;
            zVar.f2938i = new j1(this, 0);
            zVar.h = new l4.s0(this, 13);
        }
    }
}
