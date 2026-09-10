package bi;

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
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yk0;
public final class w1 extends vl0 {
    public yk0 X2;
    public boolean Y2;
    public float Z2;
    public float f3816a3;
    public boolean f3817b3;
    public final SparseArray f3818c3;
    public final ArrayList f3819d3;
    public final ArrayList f3820e3;
    public final ArrayList f3821f3;
    public final ArrayList f3822g3;
    public final PorterDuffColorFilter f3823h3;

    public w1(Context context) {
        super(context, null);
        this.f3817b3 = false;
        this.f3818c3 = new SparseArray();
        this.f3819d3 = new ArrayList();
        this.f3820e3 = new ArrayList();
        this.f3821f3 = new ArrayList();
        this.f3822g3 = new ArrayList();
        this.f3823h3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void v1(w1 w1Var, int i10, int i11) {
        int i12;
        if (w1Var.X2 != null && (w1Var.getLayoutManager() instanceof s4.s)) {
            s4.s sVar = (s4.s) w1Var.getLayoutManager();
            View m10 = sVar.m(i10);
            int L0 = sVar.L0();
            if ((m10 == null && Math.abs(i10 - L0) > sVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
                yk0 yk0Var = w1Var.X2;
                if (sVar.L0() < i10) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                yk0Var.f29444b = i12;
                w1Var.X2.c(i10, i11, false, false);
                return;
            }
            t1 t1Var = new t1(w1Var, w1Var.getContext(), 0);
            t1Var.f41760a = i10;
            t1Var.f10694p = i11;
            sVar.w0(t1Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        u1 u1Var;
        int top;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.Z2, getWidth(), this.f3816a3);
        if (!this.Y2) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.G1;
        if (!rect.isEmpty()) {
            this.D1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.f27985o2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.D1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f3818c3;
            int size = sparseArray.size();
            arrayList = this.f3819d3;
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
            if (childAt instanceof v1) {
                v1 v1Var = (v1) childAt;
                if (v1Var.getY() < this.f3816a3 && v1Var.getY() + v1Var.getHeight() > this.Z2) {
                    if (this.f3817b3) {
                        top = (int) v1Var.getY();
                    } else {
                        top = v1Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hc.b.z(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(v1Var);
                }
            }
        }
        ArrayList arrayList5 = this.f3822g3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f3821f3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.f3820e3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            v1 v1Var2 = (v1) arrayList7.get(i10);
            int R = RecyclerView.R(v1Var2);
            while (true) {
                if (i10 < arrayList5.size()) {
                    if (((u1) arrayList5.get(i10)).M == R) {
                        u1Var = (u1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    u1Var = null;
                    break;
                }
            }
            if (u1Var == null) {
                if (!arrayList2.isEmpty()) {
                    u1Var = (u1) hc.b.z(1, arrayList2);
                } else {
                    u1Var = new u1(this);
                    u1Var.l(7);
                }
                u1Var.M = R;
                u1Var.e();
            }
            arrayList6.add(u1Var);
            u1Var.O = arrayList7;
            canvas.save();
            canvas.translate(v1Var2.getLeft(), v1Var2.getY());
            u1Var.N = v1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (v1Var2.getLeft() * 2);
            int measuredHeight = v1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                u1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((u1) arrayList5.get(i14));
                ((u1) arrayList5.get(i14)).O = null;
                ((u1) arrayList5.get(i14)).k();
            } else {
                ((u1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof v1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
        this.X2 = null;
        if (o0Var instanceof s4.c0) {
            yk0 yk0Var = new yk0(this, (s4.c0) o0Var);
            this.X2 = yk0Var;
            yk0Var.f29448i = new s1(this, 0);
            yk0Var.h = new a1.c(this, 5);
        }
    }
}
