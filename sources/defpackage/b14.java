package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class b14 extends d79 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final o24 n3;

    public b14(o24 o24Var, Context context) {
        super(context, null);
        this.n3 = o24Var;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        k43 k43Var = k43.f;
    }

    public final long A1() {
        o24 o24Var = this.n3;
        return Math.max(400L, Math.min(45, o24Var.u2 - o24Var.t2) * 35) + Math.max(600L, Math.min(55, o24Var.u2 - o24Var.t2) * 40) + 150;
    }

    public final void B1(View view) {
        if (this.m3 != null) {
            int i = 0;
            while (i < this.m3.size()) {
                a14 a14Var = (a14) this.m3.valueAt(i);
                if (a14Var.d == view) {
                    this.m3.removeAt(i);
                    i--;
                    if (a14Var.d.getBackground() instanceof RippleDrawable) {
                        a14Var.d.getBackground().setState(new int[0]);
                    }
                    a14Var.d.setPressed(false);
                }
                i++;
            }
        }
    }

    public final void C1() {
        o24 o24Var = this.n3;
        int i = o24Var.c;
        b14 b14Var = o24Var.Q;
        hm[] hmVarArr = new hm[b14Var.getChildCount()];
        for (int i2 = 0; i2 < b14Var.getChildCount(); i2++) {
            View childAt = b14Var.getChildAt(i2);
            if (childAt instanceof x14) {
                hmVarArr[i2] = ((x14) childAt).getSpan();
            }
        }
        o24Var.e2 = hm.update(i, this, hmVarArr, o24Var.e2);
    }

    @Override
    public final void L0(Canvas canvas, RectF rectF, long j) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        int i;
        boolean z2;
        Canvas canvas2 = canvas;
        o24 o24Var = this.n3;
        b14 b14Var = o24Var.Q;
        super.L0(canvas, rectF, j);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.l3 != getChildCount()) {
            C1();
            this.l3 = getChildCount();
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i3 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i3);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i3++;
        }
        sparseArray.clear();
        int i4 = 1;
        if (o24Var.v2 > 0 && SystemClock.elapsedRealtime() - o24Var.v2 < A1() && o24Var.s2 != null && o24Var.t2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        float f = 0.0f;
        if (o24Var.e2 != null && b14Var != null) {
            int i5 = 0;
            while (i5 < b14Var.getChildCount()) {
                View childAt = b14Var.getChildAt(i5);
                if (childAt instanceof x14) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) qd4.l(i4, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((x14) childAt);
                }
                if (z && childAt != null && RecyclerView.S(childAt) == o24Var.t2 - i4) {
                    z2 = z;
                    float interpolation = k43.g.getInterpolation(ete.a(((float) (SystemClock.elapsedRealtime() - o24Var.v2)) / 140.0f, f, 1.0f));
                    if (interpolation < 1.0f && (Build.VERSION.SDK_INT < 30 || !canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        float f2 = 1.0f - interpolation;
                        i = i5;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f2), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f3 = (f2 * 0.5f) + 0.5f;
                        canvas2.scale(f3, f3, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        o24Var.s2.draw(canvas2);
                        canvas2.restore();
                    } else {
                        i = i5;
                    }
                } else {
                    i = i5;
                    z2 = z;
                }
                i5 = i + 1;
                z = z2;
                f = 0.0f;
                i4 = 1;
            }
        }
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i6 = 0;
        while (true) {
            int size2 = sparseArray.size();
            z04 z04Var = null;
            arrayList2 = this.k3;
            if (i6 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i6);
            x14 x14Var = (x14) arrayList7.get(i2);
            int i7 = x14Var.a;
            int i8 = i2;
            while (true) {
                if (i8 >= arrayList5.size()) {
                    break;
                } else if (((z04) arrayList5.get(i8)).N == i7) {
                    z04Var = (z04) arrayList5.get(i8);
                    arrayList5.remove(i8);
                    break;
                } else {
                    i8++;
                }
            }
            if (z04Var == null) {
                if (!arrayList2.isEmpty()) {
                    z04Var = (z04) qd4.l(1, arrayList2);
                } else {
                    z04Var = new z04(this);
                }
                z04Var.N = i7;
                z04Var.e();
            }
            arrayList6.add(z04Var);
            z04Var.P = arrayList7;
            canvas2.save();
            canvas2.translate(x14Var.getLeft(), x14Var.getY() + x14Var.getPaddingTop());
            z04Var.O = x14Var.getLeft();
            int measuredWidth = getMeasuredWidth() - (x14Var.getLeft() << 1);
            int measuredHeight = x14Var.getMeasuredHeight() - x14Var.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0 && (Build.VERSION.SDK_INT < 30 || !canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight))) {
                z04Var.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i6++;
            canvas2 = canvas;
            i2 = 0;
        }
        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((z04) arrayList5.get(i9));
                ((z04) arrayList5.get(i9)).P = null;
                ((z04) arrayList5.get(i9)).k();
            } else {
                ((z04) arrayList5.get(i9)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        o24 o24Var = this.n3;
        b14 b14Var = o24Var.Q;
        o24Var.n2.g();
        if (this.l3 != getChildCount()) {
            C1();
            this.l3 = getChildCount();
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i2 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i2);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i2++;
        }
        sparseArray.clear();
        if (o24Var.v2 > 0 && SystemClock.elapsedRealtime() - o24Var.v2 < A1() && o24Var.s2 != null && o24Var.t2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (o24Var.e2 != null && b14Var != null) {
            for (int i3 = 0; i3 < b14Var.getChildCount(); i3++) {
                View childAt = b14Var.getChildAt(i3);
                if (childAt instanceof x14) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) qd4.l(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((x14) childAt);
                }
                if (z && childAt != null && RecyclerView.S(childAt) == o24Var.t2 - 1) {
                    float interpolation = k43.g.getInterpolation(ete.a(((float) (SystemClock.elapsedRealtime() - o24Var.v2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f2 = (f * 0.5f) + 0.5f;
                        canvas.scale(f2, f2, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        o24Var.s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = 0;
        while (true) {
            int size2 = sparseArray.size();
            z04 z04Var = null;
            arrayList2 = this.k3;
            if (i4 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
            x14 x14Var = (x14) arrayList7.get(i);
            int i5 = x14Var.a;
            int i6 = i;
            while (true) {
                if (i6 >= arrayList5.size()) {
                    break;
                } else if (((z04) arrayList5.get(i6)).N == i5) {
                    z04Var = (z04) arrayList5.get(i6);
                    arrayList5.remove(i6);
                    break;
                } else {
                    i6++;
                }
            }
            if (z04Var == null) {
                if (!arrayList2.isEmpty()) {
                    z04Var = (z04) qd4.l(1, arrayList2);
                } else {
                    z04Var = new z04(this);
                }
                z04Var.N = i5;
                z04Var.e();
            }
            arrayList6.add(z04Var);
            z04Var.P = arrayList7;
            canvas2.save();
            canvas2.translate(x14Var.getLeft(), x14Var.getY() + x14Var.getPaddingTop());
            z04Var.O = x14Var.getLeft();
            int measuredWidth = getMeasuredWidth() - (x14Var.getLeft() << 1);
            int measuredHeight = x14Var.getMeasuredHeight() - x14Var.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                z04Var.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i4++;
            canvas2 = canvas;
            i = 0;
        }
        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((z04) arrayList5.get(i7));
                ((z04) arrayList5.get(i7)).P = null;
                ((z04) arrayList5.get(i7)).k();
            } else {
                ((z04) arrayList5.get(i7)).f();
            }
        }
        arrayList5.clear();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (motionEvent.getActionMasked() == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.m3 == null) {
                this.m3 = new SparseArray();
            }
            float x = motionEvent.getX(actionIndex);
            float y = motionEvent.getY(actionIndex);
            View F = F(x, y);
            if (z) {
                if (F != null) {
                    ?? obj = new Object();
                    obj.a = x;
                    obj.b = y;
                    obj.c = SystemClock.elapsedRealtime();
                    obj.d = F;
                    if (F.getBackground() instanceof RippleDrawable) {
                        F.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.m3.put(pointerId, obj);
                    E0();
                }
            } else {
                a14 a14Var = (a14) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (F != null && a14Var != null) {
                    if (Math.sqrt(Math.pow(y - a14Var.b, 2.0d) + Math.pow(x - a14Var.a, 2.0d)) < hl.e * 3.0f && !z3) {
                        o24 o24Var = this.n3;
                        if (!o24Var.C1.isShowing() || SystemClock.elapsedRealtime() - a14Var.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = a14Var.d;
                            int S = RecyclerView.S(view);
                            try {
                                if (view instanceof x14) {
                                    o24Var.G((x14) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof e14) {
                                    o24Var.S.E(S, (e14) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (a14Var != null && (a14Var.d.getBackground() instanceof RippleDrawable)) {
                    a14Var.d.getBackground().setState(new int[0]);
                }
                if (a14Var != null) {
                    a14Var.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z3 || this.m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void m0(int i) {
        if (i == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            o24 o24Var = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                o24Var.L(true);
            }
            if (!canScrollVertically(1)) {
                o24Var.o(1, hl.L(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        hm.release(this, this.n3.e2);
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.h3;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((z04) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i < arrayList2.size()) {
                ((z04) arrayList2.get(i)).f();
                i++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o24 o24Var = this.n3;
        if (!o24Var.f) {
            boolean g = rw2.e().g(motionEvent, this, o24Var.h2, this.o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o24 o24Var = this.n3;
        if (o24Var.e0 && o24Var.d0) {
            this.f3 = true;
            o24Var.R.g1(0, 0);
            o24Var.d0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        o24Var.h(true);
        C1();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i);
        o24 o24Var = this.n3;
        p04 p04Var = o24Var.R;
        int i3 = p04Var.J;
        if (hl.O1()) {
            f = 60.0f;
        } else {
            f = 45.0f;
        }
        p04Var.x1(Math.max(1, size / hl.L(f)));
        this.f3 = false;
        super.onMeasure(i, i2);
        if (i3 != p04Var.J) {
            o24Var.S.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        o24 o24Var = this.n3;
        int[] iArr = o24Var.E1;
        bx3 bx3Var = o24Var.C1;
        if (o24Var.S1 != null && bx3Var != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f = o24Var.V1;
                    if (f != -10000.0f) {
                        if (Math.abs(f - motionEvent.getX()) > hl.Z0(true, 0.2f) || Math.abs(o24Var.W1 - motionEvent.getY()) > hl.Z0(false, 0.2f)) {
                            o24Var.V1 = -10000.0f;
                            o24Var.W1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x = motionEvent.getX() + iArr[0];
                    bx3Var.c.getLocationOnScreen(iArr);
                    int L = (int) (x - (hl.L(3.0f) + iArr[0]));
                    boolean z = bx3Var.d;
                    ax3 ax3Var = bx3Var.c;
                    if (!z) {
                        int max = Math.max(0, Math.min(5, L / (hl.L(4.0f) + bx3Var.e)));
                        if (ax3Var.n[0] != max) {
                            hl.W3(ax3Var);
                            int[] iArr2 = ax3Var.n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                ax3Var.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (bx3Var != null && bx3Var.isShowing() && !bx3Var.d) {
                    bx3Var.dismiss();
                    int i = bx3Var.c.n[0];
                    if (i >= 1 && i <= 5) {
                        str = (String) jr2.a.get(i - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) o24Var.S1.getTag();
                    if (!o24Var.S1.c) {
                        if (str != null) {
                            pv3.j.put(str2, str);
                            str2 = o24.c(str2, str);
                        } else {
                            pv3.j.remove(str2);
                        }
                        o24Var.S1.a(pv3.f(str2), o24Var.S1.c);
                        o24Var.G(o24Var.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        pv3.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        x14 x14Var = o24Var.S1;
                        if (str != null) {
                            o24Var.G(x14Var, o24.c(replace, str));
                        } else {
                            o24Var.G(x14Var, replace);
                        }
                    }
                }
                if (bx3Var == null || !bx3Var.d) {
                    o24Var.S1 = null;
                }
                o24Var.V1 = -10000.0f;
                o24Var.W1 = -10000.0f;
            }
            if (bx3Var == null || !bx3Var.d || bx3Var.isShowing()) {
                return true;
            }
        }
        o24Var.T1 = motionEvent.getX();
        o24Var.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
