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
public final class jv3 extends o39 {
    public static final int q3 = 0;
    public cu6 f3;
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

    public jv3(Context context) {
        super(context, null);
        this.j3 = false;
        this.k3 = new SparseArray();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new ArrayList();
        this.p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        hv3 hv3Var;
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
            vs2 vs2Var = this.n2;
            if (vs2Var != null) {
                vs2Var.accept(canvas);
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
            if (childAt instanceof iv3) {
                iv3 iv3Var = (iv3) childAt;
                if (iv3Var.getY() < this.i3 && iv3Var.getY() + iv3Var.getHeight() > this.h3) {
                    if (this.j3) {
                        top = (int) iv3Var.getY();
                    } else {
                        top = iv3Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) tb4.l(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(iv3Var);
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
            iv3 iv3Var2 = (iv3) arrayList7.get(i);
            int R = RecyclerView.R(iv3Var2);
            while (true) {
                if (i < arrayList5.size()) {
                    if (((hv3) arrayList5.get(i)).N == R) {
                        hv3Var = (hv3) arrayList5.get(i);
                        arrayList5.remove(i);
                        break;
                    }
                    i++;
                } else {
                    hv3Var = null;
                    break;
                }
            }
            if (hv3Var == null) {
                if (!arrayList2.isEmpty()) {
                    hv3Var = (hv3) tb4.l(1, arrayList2);
                } else {
                    hv3Var = new hv3(this);
                    hv3Var.l(7);
                }
                hv3Var.N = R;
                hv3Var.e();
            }
            arrayList6.add(hv3Var);
            hv3Var.P = arrayList7;
            canvas.save();
            canvas.translate(iv3Var2.getLeft(), iv3Var2.getY());
            hv3Var.O = iv3Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (iv3Var2.getLeft() << 1);
            int measuredHeight = iv3Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                hv3Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i4++;
            i = 0;
        }
        for (int i5 = 0; i5 < arrayList5.size(); i5++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((hv3) arrayList5.get(i5));
                ((hv3) arrayList5.get(i5)).P = null;
                ((hv3) arrayList5.get(i5)).k();
            } else {
                ((hv3) arrayList5.get(i5)).f();
            }
        }
        arrayList5.clear();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 != null && !(childAt2 instanceof iv3) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(d49 d49Var) {
        super.setLayoutManager(d49Var);
        this.f3 = null;
        if (d49Var instanceof t26) {
            cu6 cu6Var = new cu6(this, (t26) d49Var);
            this.f3 = cu6Var;
            cu6Var.r = new fv3(this, (byte) 0);
            cu6Var.n = new vu2(this, (byte) 29);
        }
    }

    public final void z1(int i, int i2) {
        int i3;
        if (this.f3 != null && (getLayoutManager() instanceof r35)) {
            r35 r35Var = (r35) getLayoutManager();
            View m = r35Var.m(i);
            int K0 = r35Var.K0();
            if ((m == null && Math.abs(i - K0) > r35Var.J * 9.0f) || !gba.c()) {
                cu6 cu6Var = this.f3;
                if (r35Var.K0() < i) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                cu6Var.b = i3;
                this.f3.k(i, i2, false, false);
                return;
            }
            gv3 gv3Var = new gv3((byte) 0, getContext(), this);
            gv3Var.a = i;
            gv3Var.p = i2;
            r35Var.v0(gv3Var);
        }
    }
}
