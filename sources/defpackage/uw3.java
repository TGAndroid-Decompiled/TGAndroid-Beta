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
public final class uw3 extends r59 {
    public static final int q3 = 0;
    public cw6 f3;
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

    public uw3(Context context) {
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
        sw3 sw3Var;
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
            gu2 gu2Var = this.n2;
            if (gu2Var != null) {
                gu2Var.accept(canvas);
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
            if (childAt instanceof tw3) {
                tw3 tw3Var = (tw3) childAt;
                if (tw3Var.getY() < this.i3 && tw3Var.getY() + tw3Var.getHeight() > this.h3) {
                    if (this.j3) {
                        top = (int) tw3Var.getY();
                    } else {
                        top = tw3Var.getTop();
                    }
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) td4.m(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add(tw3Var);
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
            tw3 tw3Var2 = (tw3) arrayList7.get(i);
            int R = RecyclerView.R(tw3Var2);
            while (true) {
                if (i < arrayList5.size()) {
                    if (((sw3) arrayList5.get(i)).N == R) {
                        sw3Var = (sw3) arrayList5.get(i);
                        arrayList5.remove(i);
                        break;
                    }
                    i++;
                } else {
                    sw3Var = null;
                    break;
                }
            }
            if (sw3Var == null) {
                if (!arrayList2.isEmpty()) {
                    sw3Var = (sw3) td4.m(1, arrayList2);
                } else {
                    sw3Var = new sw3(this);
                    sw3Var.l(7);
                }
                sw3Var.N = R;
                sw3Var.e();
            }
            arrayList6.add(sw3Var);
            sw3Var.P = arrayList7;
            canvas.save();
            canvas.translate(tw3Var2.getLeft(), tw3Var2.getY());
            sw3Var.O = tw3Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (tw3Var2.getLeft() << 1);
            int measuredHeight = tw3Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                sw3Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i4++;
            i = 0;
        }
        for (int i5 = 0; i5 < arrayList5.size(); i5++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((sw3) arrayList5.get(i5));
                ((sw3) arrayList5.get(i5)).P = null;
                ((sw3) arrayList5.get(i5)).k();
            } else {
                ((sw3) arrayList5.get(i5)).f();
            }
        }
        arrayList5.clear();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 != null && !(childAt2 instanceof tw3) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(f69 f69Var) {
        super.setLayoutManager(f69Var);
        this.f3 = null;
        if (f69Var instanceof u46) {
            cw6 cw6Var = new cw6(this, (u46) f69Var);
            this.f3 = cw6Var;
            cw6Var.r = new qw3(this, (byte) 0);
            cw6Var.n = new yu3(this, (byte) 2);
        }
    }

    public final void z1(int i, int i2) {
        int i3;
        if (this.f3 != null && (getLayoutManager() instanceof q55)) {
            q55 q55Var = (q55) getLayoutManager();
            View m = q55Var.m(i);
            int K0 = q55Var.K0();
            if ((m == null && Math.abs(i - K0) > q55Var.J * 9.0f) || !gda.c()) {
                cw6 cw6Var = this.f3;
                if (q55Var.K0() < i) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                cw6Var.b = i3;
                this.f3.l(i, i2, false, false);
                return;
            }
            rw3 rw3Var = new rw3((byte) 0, getContext(), this);
            rw3Var.a = i;
            rw3Var.p = i2;
            q55Var.v0(rw3Var);
        }
    }
}
