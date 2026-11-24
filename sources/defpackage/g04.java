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
public final class g04 extends o39 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final t14 n3;

    public g04(t14 t14Var, Context context) {
        super(context, null);
        this.n3 = t14Var;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        s33 s33Var = s33.f;
    }

    public final void A1(View view) {
        if (this.m3 != null) {
            int i = 0;
            while (i < this.m3.size()) {
                f04 f04Var = (f04) this.m3.valueAt(i);
                if (f04Var.d == view) {
                    this.m3.removeAt(i);
                    i--;
                    if (f04Var.d.getBackground() instanceof RippleDrawable) {
                        f04Var.d.getBackground().setState(new int[0]);
                    }
                    f04Var.d.setPressed(false);
                }
                i++;
            }
        }
    }

    public final void B1() {
        t14 t14Var = this.n3;
        int i = t14Var.c;
        g04 g04Var = t14Var.Q;
        gm[] gmVarArr = new gm[g04Var.getChildCount()];
        for (int i2 = 0; i2 < g04Var.getChildCount(); i2++) {
            View childAt = g04Var.getChildAt(i2);
            if (childAt instanceof c14) {
                gmVarArr[i2] = ((c14) childAt).getSpan();
            }
        }
        t14Var.e2 = gm.update(i, this, gmVarArr, t14Var.e2);
    }

    @Override
    public final void K0(Canvas canvas, RectF rectF, long j) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        int i;
        boolean z2;
        Canvas canvas2 = canvas;
        t14 t14Var = this.n3;
        g04 g04Var = t14Var.Q;
        super.K0(canvas, rectF, j);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.l3 != getChildCount()) {
            B1();
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
        if (t14Var.v2 > 0 && SystemClock.elapsedRealtime() - t14Var.v2 < z1() && t14Var.s2 != null && t14Var.t2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        float f = 0.0f;
        if (t14Var.e2 != null && g04Var != null) {
            int i5 = 0;
            while (i5 < g04Var.getChildCount()) {
                View childAt = g04Var.getChildAt(i5);
                if (childAt instanceof c14) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) tb4.l(i4, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((c14) childAt);
                }
                if (z && childAt != null && RecyclerView.R(childAt) == t14Var.t2 - i4) {
                    z2 = z;
                    float interpolation = s33.g.getInterpolation(moe.a(((float) (SystemClock.elapsedRealtime() - t14Var.v2)) / 140.0f, f, 1.0f));
                    if (interpolation < 1.0f && (Build.VERSION.SDK_INT < 30 || !canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        float f2 = 1.0f - interpolation;
                        i = i5;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f2), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f3 = (f2 * 0.5f) + 0.5f;
                        canvas2.scale(f3, f3, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        t14Var.s2.draw(canvas2);
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
            e04 e04Var = null;
            arrayList2 = this.k3;
            if (i6 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i6);
            c14 c14Var = (c14) arrayList7.get(i2);
            int i7 = c14Var.a;
            int i8 = i2;
            while (true) {
                if (i8 >= arrayList5.size()) {
                    break;
                } else if (((e04) arrayList5.get(i8)).N == i7) {
                    e04Var = (e04) arrayList5.get(i8);
                    arrayList5.remove(i8);
                    break;
                } else {
                    i8++;
                }
            }
            if (e04Var == null) {
                if (!arrayList2.isEmpty()) {
                    e04Var = (e04) tb4.l(1, arrayList2);
                } else {
                    e04Var = new e04(this);
                }
                e04Var.N = i7;
                e04Var.e();
            }
            arrayList6.add(e04Var);
            e04Var.P = arrayList7;
            canvas2.save();
            canvas2.translate(c14Var.getLeft(), c14Var.getY() + c14Var.getPaddingTop());
            e04Var.O = c14Var.getLeft();
            int measuredWidth = getMeasuredWidth() - (c14Var.getLeft() << 1);
            int measuredHeight = c14Var.getMeasuredHeight() - c14Var.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0 && (Build.VERSION.SDK_INT < 30 || !canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight))) {
                e04Var.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i6++;
            canvas2 = canvas;
            i2 = 0;
        }
        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((e04) arrayList5.get(i9));
                ((e04) arrayList5.get(i9)).P = null;
                ((e04) arrayList5.get(i9)).k();
            } else {
                ((e04) arrayList5.get(i9)).f();
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
        t14 t14Var = this.n3;
        g04 g04Var = t14Var.Q;
        t14Var.n2.g();
        if (this.l3 != getChildCount()) {
            B1();
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
        if (t14Var.v2 > 0 && SystemClock.elapsedRealtime() - t14Var.v2 < z1() && t14Var.s2 != null && t14Var.t2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (t14Var.e2 != null && g04Var != null) {
            for (int i3 = 0; i3 < g04Var.getChildCount(); i3++) {
                View childAt = g04Var.getChildAt(i3);
                if (childAt instanceof c14) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) tb4.l(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((c14) childAt);
                }
                if (z && childAt != null && RecyclerView.R(childAt) == t14Var.t2 - 1) {
                    float interpolation = s33.g.getInterpolation(moe.a(((float) (SystemClock.elapsedRealtime() - t14Var.v2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f2 = (f * 0.5f) + 0.5f;
                        canvas.scale(f2, f2, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        t14Var.s2.draw(canvas);
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
            e04 e04Var = null;
            arrayList2 = this.k3;
            if (i4 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
            c14 c14Var = (c14) arrayList7.get(i);
            int i5 = c14Var.a;
            int i6 = i;
            while (true) {
                if (i6 >= arrayList5.size()) {
                    break;
                } else if (((e04) arrayList5.get(i6)).N == i5) {
                    e04Var = (e04) arrayList5.get(i6);
                    arrayList5.remove(i6);
                    break;
                } else {
                    i6++;
                }
            }
            if (e04Var == null) {
                if (!arrayList2.isEmpty()) {
                    e04Var = (e04) tb4.l(1, arrayList2);
                } else {
                    e04Var = new e04(this);
                }
                e04Var.N = i5;
                e04Var.e();
            }
            arrayList6.add(e04Var);
            e04Var.P = arrayList7;
            canvas2.save();
            canvas2.translate(c14Var.getLeft(), c14Var.getY() + c14Var.getPaddingTop());
            e04Var.O = c14Var.getLeft();
            int measuredWidth = getMeasuredWidth() - (c14Var.getLeft() << 1);
            int measuredHeight = c14Var.getMeasuredHeight() - c14Var.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                e04Var.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i4++;
            canvas2 = canvas;
            i = 0;
        }
        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((e04) arrayList5.get(i7));
                ((e04) arrayList5.get(i7)).P = null;
                ((e04) arrayList5.get(i7)).k();
            } else {
                ((e04) arrayList5.get(i7)).f();
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
            View E = E(x, y);
            if (z) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.a = x;
                    obj.b = y;
                    obj.c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.m3.put(pointerId, obj);
                    D0();
                }
            } else {
                f04 f04Var = (f04) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (E != null && f04Var != null) {
                    if (Math.sqrt(Math.pow(y - f04Var.b, 2.0d) + Math.pow(x - f04Var.a, 2.0d)) < gl.e * 3.0f && !z3) {
                        t14 t14Var = this.n3;
                        if (!t14Var.C1.isShowing() || SystemClock.elapsedRealtime() - f04Var.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = f04Var.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof c14) {
                                    t14Var.H((c14) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof j04) {
                                    t14Var.S.E(R, (j04) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (f04Var != null && (f04Var.d.getBackground() instanceof RippleDrawable)) {
                    f04Var.d.getBackground().setState(new int[0]);
                }
                if (f04Var != null) {
                    f04Var.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z3 || this.m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void l0(int i) {
        if (i == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            t14 t14Var = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                t14Var.M(true);
            }
            if (!canScrollVertically(1)) {
                t14Var.o(1, gl.L(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        gm.release(this, this.n3.e2);
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.h3;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((e04) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i < arrayList2.size()) {
                ((e04) arrayList2.get(i)).f();
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
        t14 t14Var = this.n3;
        if (!t14Var.f) {
            boolean g = xv2.e().g(motionEvent, this, t14Var.h2, this.o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t14 t14Var = this.n3;
        if (t14Var.e0 && t14Var.d0) {
            this.f3 = true;
            t14Var.R.g1(0, 0);
            t14Var.d0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        t14Var.h(true);
        B1();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i);
        t14 t14Var = this.n3;
        uz3 uz3Var = t14Var.R;
        int i3 = uz3Var.J;
        if (gl.O1()) {
            f = 60.0f;
        } else {
            f = 45.0f;
        }
        uz3Var.x1(Math.max(1, size / gl.L(f)));
        this.f3 = false;
        super.onMeasure(i, i2);
        if (i3 != uz3Var.J) {
            t14Var.S.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        t14 t14Var = this.n3;
        int[] iArr = t14Var.E1;
        gw3 gw3Var = t14Var.C1;
        if (t14Var.S1 != null && gw3Var != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f = t14Var.V1;
                    if (f != -10000.0f) {
                        if (Math.abs(f - motionEvent.getX()) > gl.Z0(true, 0.2f) || Math.abs(t14Var.W1 - motionEvent.getY()) > gl.Z0(false, 0.2f)) {
                            t14Var.V1 = -10000.0f;
                            t14Var.W1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x = motionEvent.getX() + iArr[0];
                    gw3Var.c.getLocationOnScreen(iArr);
                    int L = (int) (x - (gl.L(3.0f) + iArr[0]));
                    boolean z = gw3Var.d;
                    fw3 fw3Var = gw3Var.c;
                    if (!z) {
                        int max = Math.max(0, Math.min(5, L / (gl.L(4.0f) + gw3Var.e)));
                        if (fw3Var.n[0] != max) {
                            gl.W3(fw3Var);
                            int[] iArr2 = fw3Var.n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                fw3Var.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (gw3Var != null && gw3Var.isShowing() && !gw3Var.d) {
                    gw3Var.dismiss();
                    int i = gw3Var.c.n[0];
                    if (i >= 1 && i <= 5) {
                        str = (String) qq2.a.get(i - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) t14Var.S1.getTag();
                    if (!t14Var.S1.c) {
                        if (str != null) {
                            vu3.j.put(str2, str);
                            str2 = t14.c(str2, str);
                        } else {
                            vu3.j.remove(str2);
                        }
                        t14Var.S1.a(vu3.f(str2), t14Var.S1.c);
                        t14Var.H(t14Var.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        vu3.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        c14 c14Var = t14Var.S1;
                        if (str != null) {
                            t14Var.H(c14Var, t14.c(replace, str));
                        } else {
                            t14Var.H(c14Var, replace);
                        }
                    }
                }
                if (gw3Var == null || !gw3Var.d) {
                    t14Var.S1 = null;
                }
                t14Var.V1 = -10000.0f;
                t14Var.W1 = -10000.0f;
            }
            if (gw3Var == null || !gw3Var.d || gw3Var.isShowing()) {
                return true;
            }
        }
        t14Var.T1 = motionEvent.getX();
        t14Var.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        t14 t14Var = this.n3;
        return Math.max(400L, Math.min(45, t14Var.u2 - t14Var.t2) * 35) + Math.max(600L, Math.min(55, t14Var.u2 - t14Var.t2) * 40) + 150;
    }
}
